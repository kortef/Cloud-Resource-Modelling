package de.ugoe.cs.oco.occi2deployment.comparator;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.epsilon.emc.emf.CachedResourceSet;
import org.eclipse.cmf.occi.core.AttributeState;
import org.eclipse.cmf.occi.core.Configuration;
import org.eclipse.cmf.occi.core.Entity;
import org.eclipse.cmf.occi.core.Mixin;
import org.eclipse.cmf.occi.core.Resource;

import de.ugoe.cs.oco.occi2deployment.DeployerHelper;
import de.ugoe.cs.oco.occi2deployment.ModelUtility;
import de.ugoe.cs.oco.occi2deployment.connector.Connection;
import de.ugoe.cs.oco.occi2deployment.transformation.Transformator;
import de.ugoe.cs.oco.occi2deployment.transformation.TransformatorFactory;
import pcg.*;
import pcg.impl.PcgFactoryImpl;


/**Complex Comparator implements the similiarity flooding algorithm combined with the EMF Compare
 * results as intial weighting.
 * @author rockodell
 *
 */
public class MixedComparator extends AbsComplexComparator {
	/**Constructor executing the compare method to fill the ELists of the Object.
	 * @param oldModelPath
	 * @param newModelPath
	 * @param conn 
	 */
	public MixedComparator(Path oldModelPath, Path newModelPath, Connection conn) {
		this.connection = conn;
		compare(oldModelPath, newModelPath);
	}

	public MixedComparator(org.eclipse.emf.ecore.resource.Resource model1,
			org.eclipse.emf.ecore.resource.Resource model2, Connection conn) {
		this.connection = conn;
		compare(model1, model2);
	}


	public MixedComparator(Configuration runtimeConfig, Configuration targetConfig) {
		compare(runtimeConfig, targetConfig);
	}

	private void compare(Configuration runtimeConfig, Configuration targetConfig) {
		// TODO Auto-generated method stub
		
	}

	@Override
	void createResourceMatch(org.eclipse.emf.ecore.resource.Resource oldModelResource,
			org.eclipse.emf.ecore.resource.Resource newModelResource) {
		Comparator simple = ComparatorFactory.getComparator("Simple", oldModelResource, newModelResource, this.connection);
		
		Transformator occiToPcg = TransformatorFactory.getTransformator("OCCI2PCG");
		//Path pcgPath = Paths.get("./src/de/ugoe/cs/oco/occi2deployment/models/PCG.pcg");
		Path pcgPath = new DeployerHelper().loadPath("/de/ugoe/cs/oco/occi2deployment/models/PCG.pcg");
		occiToPcg.transform(oldModelResource, newModelResource, pcgPath);

		adaptPCG(pcgPath, simple);
		
		//Path ipgPath = Paths.get("./src/de/ugoe/cs/oco/occi2deployment/models/IPG.pcg");
		Path ipgPath = new DeployerHelper().loadPath("/de/ugoe/cs/oco/occi2deployment/models/IPG.pcg");
		Transformator pcgToIpg = TransformatorFactory.getTransformator("PCG2IPG");
		pcgToIpg.transform(pcgPath, ipgPath);
		
		Map<String, List<Vertex>> map = calculateFixpointValueMap(ipgPath);
		this.matches = this.createMatch(map, ModelUtility.getOCCIConfigurationContents(oldModelResource), ModelUtility.getOCCIConfigurationContents(newModelResource));
		
		checkNewAndMissingMatchesForSimilarities(this.matches, ModelUtility.getOCCIConfigurationContents(oldModelResource), ModelUtility.getOCCIConfigurationContents(newModelResource));
	}
	
	@Override
	void createResourceMatch(Path oldModelPath, EList<EObject> oldModel, Path newModelPath, EList<EObject> newModel) {		
		Comparator simple = ComparatorFactory.getComparator("Simple", oldModelPath, newModelPath, this.connection);
		
		Transformator occiToPcg = TransformatorFactory.getTransformator("OCCI2PCG");
		Path pcgPath = new DeployerHelper().loadPath("/de/ugoe/cs/oco/occi2deployment/models/PCG.pcg");
		occiToPcg.transform(oldModelPath, newModelPath, pcgPath);
		adaptPCG(pcgPath, simple);
		
		Path ipgPath = new DeployerHelper().loadPath("/de/ugoe/cs/oco/occi2deployment/models/IPG.pcg");
		Transformator pcgToIpg = TransformatorFactory.getTransformator("PCG2IPG");
		pcgToIpg.transform(pcgPath, ipgPath);
		
		Map<String, List<Vertex>> map = calculateFixpointValueMap(ipgPath);
		this.matches = this.createMatch(map, oldModel, newModel);
		
		checkNewAndMissingMatchesForSimilarities(this.matches, oldModel, newModel);
	}

	/**Adapts the PCG according the results of the passed Comparator comp.
	 * @param pcgPath
	 * @param comp
	 */
	private void adaptPCG(Path pcgPath, Comparator comp) {
		EList<EObject> pcg = ModelUtility.loadPCG(pcgPath);
		Graph pcgGraph = (Graph) pcg.get(0);
		adjustElementsInGraph(pcgGraph, comp.getMatches());
		ModelUtility.storePCG(pcgPath, pcgGraph);
		CachedResourceSet.getCache().clear();
	}

	/**Removes all Vertices from the PCG addressing a Resource conntained in matches.
	 * @param pcgGraph
	 * @param matches
	 */
	private void adjustElementsInGraph(Graph pcgGraph,  EList<Match> matches) {
		List<Vertex> toRemove = new BasicEList<Vertex>();
		List<Vertex> toAdd = new BasicEList<Vertex>();
		for(Match match: extractDirectResourceMatch(matches)){
			Resource srcRes = (Resource) match.getSrc();
			Resource tarRes = (Resource) match.getTar();
			boolean missing = true;
			for(Vertex vertex: pcgGraph.getVertices()){	
				if(vertex.getResources().get(0).getId().equals(srcRes.getId())
				&& vertex.getResources().get(1).getId().equals(tarRes.getId())){
					missing = false;
				}	
				else if(vertex.getResources().get(0).getId().equals(srcRes.getId())
				|| vertex.getResources().get(1).getId().equals(tarRes.getId())){
					toRemove.add(vertex);
				}
			}
			if(missing == true){
				toAdd.add(createMissingVertex(srcRes, matches));
			}
		}
		for(Vertex vertex: toAdd){
			pcgGraph.getVertices().add(vertex);
		}
		
		for(Vertex vertex: toRemove){
			EcoreUtil.delete(vertex);
		}
		
		List<Edge> toRemoveE = new BasicEList<Edge>();
		for(Edge edge: pcgGraph.getEdges()){
			if(edge.getTarget() == null || edge.getSource() == null){
				toRemoveE.add(edge);
			}
		}
		for(Edge edge: toRemoveE){
			EcoreUtil.delete(edge);
		}
	}
	
	/**Creates Vertexes for already matched Resources missing in the PCG.
	 * Required for Resources having no connections or totaly different connections.
	 * Currently the fixpoint value of such vertexes is calculated each iteration too and thus
	 * is reduced in each step. Could be refactored so that the fixpoint value stays at 1.
	 * @param oldRes
	 * @param matches
	 * @return
	 */
	private Vertex createMissingVertex(Resource oldRes, EList<Match> matches) {
		Vertex vertex = new PcgFactoryImpl().createVertex();
		Match missingMatch = getMatchFor(oldRes, matches);
		pcg.Resource oldResource = new PcgFactoryImpl().createResource();
		oldResource.setId(((Resource)missingMatch.getSrc()).getId());
		oldResource.setTitle(((Resource)missingMatch.getSrc()).getTitle());
		
		pcg.Resource newResource = new PcgFactoryImpl().createResource();
		newResource.setId(((Resource)missingMatch.getTar()).getId());
		newResource.setTitle(((Resource)missingMatch.getTar()).getTitle());
		
		vertex.setFixpointValue(1);
		vertex.setKind(oldRes.getKind().getScheme() + oldRes.getKind().getTerm());
		vertex.setTitle(oldRes.getTitle() + ", " + ((Resource) missingMatch.getTar()).getTitle());
		vertex.getResources().add(oldResource);
		vertex.getResources().add(newResource);
		return vertex;
	}

	/**Checks whether an Edge between two Map pairs (Vertexes) exists in the PCG.
	 * @param pcgGraph
	 * @param srcVertex
	 * @param tarVertex
	 * @return
	 */
	@SuppressWarnings("unused")
	private boolean edgeAlreadyExists(Graph pcgGraph, Vertex srcVertex, Vertex tarVertex) {
		EList<Edge> outEdges = new BasicEList<Edge>();
		for(Edge edge: pcgGraph.getEdges()){
			if(edge.getSource() == srcVertex){
				outEdges.add(edge);
			}
		}
		for(Edge outEdge: outEdges){
			if(outEdge.getTarget() == tarVertex){
				return true;
			}
		}
		return false;
	}

	/**Returns the corresponding source Match for the Resource res.
	 * @param res
	 * @param matches
	 * @return
	 */
	private Match getMatchFor(Resource res, EList<Match> matches) {
		for(Match match: matches){
			if(match.getTar() != null && match.getSrc()!= null){
				if(match.getSrc().eClass().getName().equals("Resource")){
					if(res.getId().equals(((Resource) match.getSrc()).getId())){
						return match;
					}
				}
			}
		}
		return null;
	}

	/**Returns Vertex describing a Map pair with two Resources having the same id as the passed String id.
	 * @param vertices
	 * @param id
	 * @return
	 */
	@SuppressWarnings("unused")
	private Vertex correctVertex(EList<Vertex> vertices, String id) {
		for(Vertex vertex: vertices){
			if(vertex.getResources().get(0).getId().equals(id) && vertex.getResources().get(1).getId().equals(id)){
				return vertex;
			}
		}
		return null;
	}


	/**After the similarity flooding algorithm, missing and new matches are investigated for similarities,
	 * such as name, in order to match matching objects together.
	 * @param matches
	 * @param oldModel
	 * @param newModel
	 */
	private void checkNewAndMissingMatchesForSimilarities(EList<Match> matches, EList<EObject> oldModel, EList<EObject> newModel) {
		EList<Match> toRemove = new BasicEList<Match>();
		EList<Match> toAdd = new BasicEList<Match>();
		for(Match match: matches){
			if(match.getTar() == null){
				for(Match match2: matches){
					if(match2.getSrc() == null){
						if(checkIfEquivalent(match.getSrc(),match2.getTar())){
							Match fusedMatch = new Match(match.getSrc(), match2.getTar());
							toAdd.add(fusedMatch);
							toRemove.add(match);
							toRemove.add(match2);
						}
					}
				}
			}
		}
		for(Match vertex: toRemove){
			matches.remove(vertex);
		}
		for(Match vertex: toAdd){
			matches.add(vertex);
		}
	}
	
	/**Checks, whether two Objects possess identical AttributeStates.
	 * @param oldObj
	 * @param newObj
	 * @return
	 */
	private boolean checkIfEquivalent(EObject oldObj, EObject newObj) {
		Entity oldRes = (Resource) oldObj;
		Entity newRes = (Resource) newObj;
		if(oldRes.getTitle().equals(newRes.getTitle())
				&& oldRes.getKind().getTerm().equals(newRes.getKind().getTerm())
				&&oldRes.getKind().getScheme().equals(newRes.getKind().getScheme())
				&& compareMixins(oldRes, newRes)){
			return true;
		}
		return false;
		/*COMPLETE EQUIVALENT
		boolean equivalentElement = true;
		for(EObject oldContent: oldObj.eContents()){
			if(oldContent.eClass().getName().equals("AttributeState")){
				boolean equivalentAttribute = false;
				for(EObject newContent: newObj.eContents()){
					if(newContent.eClass().getName().equals("AttributeState")){
						AttributeState oldAttr = (AttributeState) oldContent;
						AttributeState newAttr = (AttributeState) newContent;
						if(oldAttr.getName().equals(newAttr.getName())){
							equivalentAttribute = true;
							if(oldAttr.getValue().equals(newAttr.getValue()) == false){
								equivalentElement = false;
							}
						}
					}
				}
				if(equivalentAttribute == false){
					equivalentElement = false;
					break;
				}		
			}
		}
		return equivalentElement;
		*/
	}

	/**Checks whether two Entities are equivalent according to their Mixins.
	 * As soon as one difference is found they are not equivalent and false is returned.
	 * @param oldRes
	 * @param newRes
	 * @return
	 */
	private boolean compareMixins(Entity oldRes, Entity newRes) {
		if(oldRes.getMixins().size() != newRes.getMixins().size()){
			return false;
		}
		else{
			for(Mixin oldMix: oldRes.getMixins()){
				boolean exists = false;
				for(Mixin newMix: newRes.getMixins()){
					if(oldMix.getTerm().equals(newMix.getTerm())
							&& oldMix.getScheme().equals(newMix.getScheme())){
						exists = true;
					}
				}
				if(exists == false){
					return false;
				}
			}
			return true;
		}
	}
	
	@Override
	Vertex getSuitableFixpointValue(Map<String, List<Vertex>> map, EList<EObject> oldModel, EList<EObject> newModel) {
		Vertex maxVertex = null;
		double max = 0.0;
		for(List<Vertex> vertices: map.values()){
			sortVertices(vertices);
			logList(vertices);
		}
		System.out.println("");
		for(List<Vertex> vertices: map.values()){
			if(vertices.isEmpty() == false && vertices.get(0).getFixpointValue() > max){
				if(multipleMaxValuesExist(vertices)){
					List<Vertex> prunedVertexList = pruneVertices(vertices);
					//maxVertex=getMostFittingVertice(vertices, oldModel, newModel);
					maxVertex=mostFittingVertex(prunedVertexList, oldModel, newModel);
					max = vertices.get(0).getFixpointValue();
				}
				else{
					maxVertex=vertices.get(0);	
					max = vertices.get(0).getFixpointValue();
				}
			}
		}
		if(maxVertex != null) {
			System.out.println("First Pick: " + maxVertex.getTitle());
			List<Vertex> possibleSources = getPossibleSources(maxVertex.getResources().get(1), map);
			sortVertices(possibleSources);
			logList(possibleSources);
			maxVertex=mostFittingVertex(possibleSources, oldModel, newModel);
			System.out.println("Second Pick: " + maxVertex.getTitle()); 
			System.out.println("");
			return maxVertex;
		}
		else{
			System.out.println("NO VERTEX LEFT!");
			return null;
		}
	}
	
	/**Removes all Vertexes from the List of Vertexes having a fixpoint value != the vertex on position 0.
	 * As the List of Vertexes is sort beforehand all vertexes having a fixpoint value < max are removed.
	 * @param vertices
	 * @return
	 */
	private List<Vertex> pruneVertices(List<Vertex> vertices) {
		List<Vertex> prunedVertexList = new BasicEList<Vertex>();
		for(Vertex ver: vertices){
			if(ver.getFixpointValue() == vertices.get(0).getFixpointValue()){
				prunedVertexList.add(ver);
			}
		}
		return prunedVertexList;
	}

	/**Returns List of possible source Resources for the passed target Resource according.
	 * @param resource
	 * @param map
	 * @return
	 */
	private List<Vertex> getPossibleSources(pcg.Resource resource, Map<String, List<Vertex>> map) {
		List <Vertex> possibleSources = new BasicEList<Vertex>();
		for(List<Vertex> vertices: map.values()){
			for(Vertex ver: vertices){
				if(ver.getResources().get(1).getId().equals(resource.getId())){
					possibleSources.add(ver);
				}
			}
		}
		return possibleSources;
	}

	
	/**Returns most fitting vertex (map pair) from the list based on their attributes.
	 * @param vertexes
	 * @param srcM
	 * @param tarM
	 * @return
	 */
	private static Vertex mostFittingVertex(List<Vertex> vertexes, EList<EObject> srcM, EList<EObject> tarM) {
		int bestFit = 0; Vertex maxVer;
		for(int i=1; i < vertexes.size(); i++){
			maxVer = compVertexes(vertexes.get(bestFit), vertexes.get(i), srcM, tarM);
			if(vertexes.get(i).equals(maxVer)){
				bestFit = i;
			}
		}
		return vertexes.get(bestFit);
	}
	

	/**Compares two vertexes on the Attribute level and returns the more fitting one.
	 * @param vertex
	 * @param vertex2
	 * @param oldModel
	 * @param newModel
	 * @return
	 */
	private static Vertex compVertexes(Vertex vertex, Vertex vertex2, EList<EObject> oldModel, EList<EObject> newModel) {
		if(vertexFit(vertex, oldModel, newModel) > vertexFit(vertex2, oldModel, newModel)){
			return vertex;
		}
		else{
			return vertex2;
		}		
	}

	/**Counts the amount of equivalent AttributeStates of the vertexes.
	 * Could be changed so that weights for the different Attributes are considered.
	 * @param vertex
	 * @param oldModel
	 * @param newModel
	 * @return
	 */
	private static int vertexFit(Vertex vertex, EList<EObject> oldModel, EList<EObject> newModel) {
		int count = 0;
		EObject oldOcciResource;
		EObject newOcciResource;
		oldOcciResource = getEquivalentResource(vertex.getResources().get(0).getId(), oldModel);
		newOcciResource = getEquivalentResource(vertex.getResources().get(1).getId(), newModel);
		
		for(EObject oldContent: oldOcciResource.eContents()){
			if(oldContent.eClass().getName().equals("AttributeState")){
				for(EObject newContent: newOcciResource.eContents()){
					if(newContent.eClass().getName().equals("AttributeState")){
						AttributeState oldAttr = (AttributeState) oldContent;
						AttributeState newAttr = (AttributeState) newContent;
						if(oldAttr.getName().equals(newAttr.getName()) ){
							if(oldAttr.getValue().equals(newAttr.getValue())){
								count++;
							}
						}
					}
				}
			}
		}
		return count;
	}

	/**Checks whether multiple MaxValues in a List of Vertexes exist.
	 * @param vertices
	 * @return
	 */
	private static boolean multipleMaxValuesExist(List<Vertex> vertices) {
		if(vertices.size() > 1 && vertices.get(0).getFixpointValue() == vertices.get(1).getFixpointValue()){		
			return true;
		}
		return false;
	}
}


