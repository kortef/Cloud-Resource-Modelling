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



import de.ugoe.cs.oco.occi2deployment.comparator.Comparator;
import de.ugoe.cs.oco.occi2deployment.comparator.ComparatorFactory;
import de.ugoe.cs.oco.occi2deployment.deprovisioner.Deprovisioner;
import de.ugoe.cs.oco.occi2deployment.provisioner.Provisioner;
import de.ugoe.cs.oco.occi2deployment.transformation.Transformator;
import de.ugoe.cs.oco.occi2deployment.transformation.TransformatorFactory;
import de.ugoe.cs.oco.pog.Edge;
import de.ugoe.cs.oco.pog.Graph;
import de.ugoe.cs.oco.pog.Vertex;


/**Handles and starts the initial deployment of an OCCI Model.
 * @author rockodell
 *
 */
public class Deployer{
	static Logger log = Logger.getLogger(Deployer.class.getName());
	
	private static Path runtimeModelPath = Paths.get("./src/de/ugoe/cs/oco/occi2deployment/tests/models/runtime.occie");
	private static Path pogPath = Paths.get("./src/de/ugoe/cs/oco/occi2deployment/tests/models/POG.pog");
	private static Path provPlanPath = Paths.get("./src/de/ugoe/cs/oco/occi2deployment/tests/models/ProvisioningPlanSkeleton.uml");
	
	public void deploy(Path occiPath, Connection conn){
		//RuntimeModel sollte noch validiert werden.
		EList<EObject> runtimeModel = ModelUtility.extractRuntimeModel(runtimeModelPath);
		log.debug("Extracted Runtime Model: " + ModelUtility.getResources(runtimeModel));
		
		if(ModelUtility.getResources(runtimeModel).size() <= 1){
			log.info("Chosen: Initial Deployment");
			this.initialDeploy(conn, occiPath);
		}
		else{
			log.info("Chosen: Adaptation Process");
			//Vergleich mit sys oder runtimeModel?
			this.adapt(conn.getSysModelPath(), occiPath, conn);
		}
		storeNewSysModel(occiPath, conn);
	}

	
	public void initialDeploy(Connection conn, Path occiPath){
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
	
	public void adapt(Path oldModelPath, Path newModelPath, Connection conn){
		EList<EObject> newModel = ModelUtility.loadOCCI(newModelPath);
		
		//Compare Models
		CachedResourceSet.getCache().clear();
		System.out.println(oldModelPath);
		System.out.println(ModelUtility.getResources(ModelUtility.loadOCCI(oldModelPath)));
		Comparator comparator = ComparatorFactory.getComparator("Complex", oldModelPath, newModelPath);

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
		Model provisioningPlan = generateProvisioningPlan(oldModelPath, newModelPath, removeFromPOG);
		
		//Start provisioning
		Provisioner provisioner = new Provisioner(new ModelUtility().findInitialNode(provisioningPlan), conn, newModel);
		provisioner.provisionElements();		
	}
	
	private Model generateProvisioningPlan(Path oldModelPath, Path newModelPath, List<EObject> oldElements) {		
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
	
	private void storeNewSysModel(Path occiPath, Connection conn) {
		try {
			Files.copy(occiPath, conn.getSysModelPath(), StandardCopyOption.REPLACE_EXISTING);
			log.info("New System Model saved in: " + conn.getSysModelPath());
		} catch (IOException e) {
			log.info("New System Model could not be saved!");
		}	
	}
}
