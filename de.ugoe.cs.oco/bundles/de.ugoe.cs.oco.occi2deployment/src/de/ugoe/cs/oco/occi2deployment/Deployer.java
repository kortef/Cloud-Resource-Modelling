package de.ugoe.cs.oco.occi2deployment;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.List;

import org.apache.log4j.Logger;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.epsilon.emc.emf.CachedResourceSet;
import org.eclipse.uml2.uml.Model;
import org.occiware.clouddesigner.occi.Entity;

import cz.cesnet.cloud.occi.core.Link;
import de.ugoe.cs.oco.occi2deployment.comparator.Comparator;
import de.ugoe.cs.oco.occi2deployment.comparator.ComparatorFactory;
import de.ugoe.cs.oco.occi2deployment.comparator.Match;
import de.ugoe.cs.oco.occi2deployment.deprovisioner.Deprovisioner;
import de.ugoe.cs.oco.occi2deployment.provisioner.Provisioner;
import de.ugoe.cs.oco.occi2deployment.transformation.Transformator;
import de.ugoe.cs.oco.occi2deployment.transformation.TransformatorFactory;
import de.ugoe.cs.oco.pog.Edge;
import de.ugoe.cs.oco.pog.Graph;
import de.ugoe.cs.oco.pog.Vertex;


/**Handles and starts the initial deployment of an OCCI Model.
 * runtimeModelPath = Path in which the extracted cloud model is saved.
 * pog/provPath = Paths used to store the intermediate product of transformation steps.
 * @author rockodell
 *
 */
public class Deployer{
	static Logger log = Logger.getLogger(Deployer.class.getName());
	private static Path pogPath = Paths.get("./src/de/ugoe/cs/oco/occi2deployment/tests/models/POG.pog");
	private static Path provPlanPath = Paths.get("./src/de/ugoe/cs/oco/occi2deployment/tests/models/ProvisioningPlanSkeleton.uml");
	
	/**Method used to start the deployment of the OCCI model stored in the occiPath in the project stored in
	 * the Connection conn.
	 * Hereby, the method extracts the runtime model (resources actually running on the cloud), in order
	 * to evaluate, whether an initial deployment is required or an adaptation process is neccssary.
	 * @param occiPath Storing the OCCI Model to be deployed.
	 * @param conn Information required to establish a connection to the cloud service.
	 */
	public void deploy(Path occiPath, Connection conn){
		//Modelle should be validated at this point
		EList<EObject> runtimeModel = ModelUtility.extractRuntimeModel(conn);
		log.debug("Extracted Runtime Model: " + ModelUtility.getResources(runtimeModel));
		
		if(ModelUtility.getResources(runtimeModel).size() <= 2){
			log.info("Chosen: Initial Deployment");
			this.initialDeploy(conn, occiPath);
		}
		else{
			log.info("Chosen: Adaptation Process");
			//Adapt to runtime model, when extractor is up to date again
			//Or check if runtime model equals sysmodel
			this.adapt(conn.getSysModelPath(), occiPath, conn);
		}
		storeNewSysModel(occiPath, conn);
	}

	
	/**This method starts an deployment of the OCCI model stored in the occiPath ignoring runtime information.
	 * @param conn Information required to establish a connection to the cloud service.
	 * @param occiPath Storing the OCCI Model to be deployed.
	 */
	private void initialDeploy(Connection conn, Path occiPath){
		EList<EObject> occiModel = ModelUtility.loadOCCI(occiPath);
		//OCCI2POG
		Transformator occiToPog = TransformatorFactory.getTransformator("OCCI2POG");
		occiToPog.transform(occiPath, pogPath);
		//POG2ProvPlan
		Transformator pogToProvPlan = TransformatorFactory.getTransformator("POG2ProvPlan");
		pogToProvPlan.transform(pogPath, provPlanPath);
		//LoadProvPlan
		Model provisioningPlan = ModelUtility.loadUML(provPlanPath);	
		//START PROVISIONING
		Provisioner provisioner = new Provisioner(new ModelUtility().findInitialNode(provisioningPlan), conn, occiModel);
		provisioner.provisionElements();
	}
	
	/** This method starts an adaptation process to bring the cloud in the desired state stated in the newModelPath.
	 * Hereby, the comparation process is started to examine Missing, New, Old and Adapted Elements.
	 * The missing elements are deleted, then the adapted elements get adapated, followed by the creation
	 * of a POG from the model, from which the oldElements get substracted in order to only reflect the 
	 * creation of new Elements that should be provisioned on the cloud. Based on this manipulated POG
	 * a ProvisioningPlan is generated and executed.
	 * @param oldModelPath Model depicting the actual state of the system.
	 * @param newModelPath Model depicting the state the project should be transfered to.
	 * @param conn Information required to establish a connection to the cloud service.
	 */
	private void adapt(Path oldModelPath, Path newModelPath, Connection conn){
		EList<EObject> newModel = ModelUtility.loadOCCI(newModelPath);
		
		//Compare Models
		CachedResourceSet.getCache().clear();
		Comparator comparator = ComparatorFactory.getComparator("Complex", oldModelPath, newModelPath);

		updateIdsSwapList(comparator, conn);
		
		//Deprovision Missing Elements
		Deprovisioner deprovisioner = new Deprovisioner(conn);
		deprovisioner.deprovision(comparator.getMissingElements());
		
		//Adapt adapted elements
		//ElementAdapter adapter = new ElementAdapter();
		//adapter.adapt(comparator.getAdaptedElements());
		
		//Create Provisioning Plan
		List<EObject> removeFromPOG = new BasicEList<EObject>();
		removeFromPOG.addAll(comparator.getOldElements());
		removeFromPOG.addAll(comparator.getAdaptedElements());
		Model provisioningPlan = generateProvisioningPlan(newModelPath, removeFromPOG);
		
		//Start provisioning
		Provisioner provisioner = new Provisioner(new ModelUtility().findInitialNode(provisioningPlan), conn, newModel);
		provisioner.provisionElements();		
	}
	
	private void updateIdsSwapList(Comparator comparator, Connection conn) {
		for(Match match: comparator.getMatches()){
			if(match.getOldObj()!=null && match.getNewObj()!=null){
				Entity oldObj = (Entity) match.getOldObj();
				Entity newObj = (Entity) match.getNewObj();
				System.out.println(oldObj.getId()+ " "+ newObj.getId());
				for(String[] ids: conn.getIdSwapList()){
					if(ids[0].equals(oldObj.getId())){
						ids[0] = newObj.getId();
					}
				}
			}
		}		
	}


	/**Method used to generate a provisioning plan for the Model stored in newModelPath. 
	 * Hereby a POG is created from which the oldElements are substracted, followed by a transformation 
	 * into the provisioning plan. (OldElements already exist on the Cloud and therefore must not be
	 * created anymore, it follows that they are not allowed in the provisioning plan to be created and therefore
	 * must be substracted. Furhtmore due to the fact that they already exist, every dependency typically depicted in
	 * the POG is already resolved.)
	 * @param newModelPath Model from which the provisioning plan is generated
	 * @param oldElements
	 * @return provisioningPlan to be executed by the provisioner.
	 */
	private Model generateProvisioningPlan(Path newModelPath, List<EObject> oldElements) {		
		//Generate POGs
		Transformator occiToPog = TransformatorFactory.getTransformator("OCCI2POG");
		occiToPog.transform(newModelPath, pogPath);
		EList<EObject> newPOG = ModelUtility.loadPOG(pogPath);
		Graph newPOGGraph = (Graph) newPOG.get(0);
		
		List<Vertex> toRemove = new BasicEList<Vertex>();
		for(Vertex vertex: newPOGGraph.getVertices()){
			for(EObject old: oldElements){
				if(((Entity) old).getId().equals(vertex.getId())){
					toRemove.add(vertex);
				}
			}
		}
		for(Vertex vertex: toRemove){
			EcoreUtil.delete(vertex);
		}
		
		//UMBEDINGT VERBESSERN!!!!
		int allEdges = newPOGGraph.getEdges().size();
		for(int i = 0 ; i<allEdges; i++){
			for(Edge edge2: newPOGGraph.getEdges()){
				if(edge2.getTarget() == null || edge2.getSource() == null){
					EcoreUtil.delete(edge2);
					break;
				}
			}
		}
		
		ModelUtility.storePOG(pogPath, newPOGGraph);

		newPOG = ModelUtility.loadPOG(pogPath);
		newPOGGraph = (Graph) newPOG.get(0);
		
		//Clear Resource Cache
		CachedResourceSet.getCache().clear();
		
		//Generate provisioning plan
		Transformator pogToProvPlan = TransformatorFactory.getTransformator("POG2ProvPlan");
		pogToProvPlan.transform(pogPath, provPlanPath);
		
		
		Model provisioningPlan = ModelUtility.loadUML(provPlanPath);
		return provisioningPlan;
	}
	
	/**Stores the occiPath as new path for the sysModel of the Connection conn.
	 * @param occiPath Path to the OCCI Model to be deployed.
	 * @param conn Connection in which the occiPath represents the new sysModelPath.
	 */
	private void storeNewSysModel(Path occiPath, Connection conn) {
		try {
			Files.copy(occiPath, conn.getSysModelPath(), StandardCopyOption.REPLACE_EXISTING);
			log.info("New System Model saved in: " + conn.getSysModelPath());
		} catch (IOException e) {
			log.info("New System Model could not be saved!");
		}	
	}
}