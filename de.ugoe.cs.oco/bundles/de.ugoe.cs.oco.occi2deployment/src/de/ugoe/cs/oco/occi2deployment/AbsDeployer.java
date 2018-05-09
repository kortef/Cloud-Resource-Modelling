package de.ugoe.cs.oco.occi2deployment;

import java.nio.file.Path;
import java.util.List;

import org.apache.log4j.Logger;
import org.eclipse.cmf.occi.core.Entity;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.epsilon.emc.emf.CachedResourceSet;
import org.eclipse.uml2.uml.Model;

import de.ugoe.cs.oco.occi2deployment.transformation.Transformator;
import de.ugoe.cs.oco.occi2deployment.transformation.TransformatorFactory;
import de.ugoe.cs.oco.pog.Edge;
import de.ugoe.cs.oco.pog.Graph;
import de.ugoe.cs.oco.pog.Vertex;

public abstract class AbsDeployer implements Deployer {
	static Logger log = Logger.getLogger(OOIDeployer.class.getName());
	
	//private static Path runtimePath = Paths.get("./src/de/ugoe/cs/oco/occi2deployment/models/runtime.occic");
	//private static Path pogPath = Paths.get("./src/de/ugoe/cs/oco/occi2deployment/models/POG.pog");
	//private static Path provPlanPath = Paths.get("./src/de/ugoe/cs/oco/occi2deployment/models/ProvisioningPlanSkeleton.uml");
	protected static Path runtimePath = new DeployerHelper().loadPath("/de/ugoe/cs/oco/occi2deployment/models/runtime.occic");
	protected static Path pogPath = new DeployerHelper().loadFile("/de/ugoe/cs/oco/occi2deployment/models/POG.pog").toPath();
	protected static Path provPlanPath = new DeployerHelper().loadFile("/de/ugoe/cs/oco/occi2deployment/models/ProvisioningPlanSkeleton.uml").toPath();
	
	/**Method used to generate a provisioning plan for the Model stored in newModelPath. 
	 * Hereby a POG is created from which the oldElements are subtracted, followed by a transformation 
	 * into the provisioning plan. (OldElements already exist on the Cloud and therefore must not be
	 * created anymore, it follows that they are not allowed in the provisioning plan to be created and therefore
	 * must be subtracted. Furthermore, due to the fact that they already exist, every dependency typically depicted in
	 * the POG is already resolved.)
	 * @param newModelPath Model from which the provisioning plan is generated
	 * @param oldElements
	 * @return provisioningPlan to be executed by the provisioner.
	 */
	protected Model generateProvisioningPlan(org.eclipse.emf.ecore.resource.Resource targetModelResource, List<EObject> oldElements) {		
		//Generate POGs
		Transformator occiToPog = TransformatorFactory.getTransformator("OCCI2POG");
		occiToPog.transform(targetModelResource, pogPath);
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
		
		List<Edge> toRemoveE = new BasicEList<Edge>();
		for(Edge edge: newPOGGraph.getEdges()){
			if(edge.getTarget() == null || edge.getSource() == null){
				toRemoveE.add(edge);
			}
		}
		for(Edge edge: toRemoveE){
			EcoreUtil.delete(edge);
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
	
	protected Model generateProvisioningPlan(Path newModelPath, List<EObject> oldElements) {		
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
		
		List<Edge> toRemoveE = new BasicEList<Edge>();
		for(Edge edge: newPOGGraph.getEdges()){
			if(edge.getTarget() == null || edge.getSource() == null){
				toRemoveE.add(edge);
			}
		}
		for(Edge edge: toRemoveE){
			EcoreUtil.delete(edge);
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
}
