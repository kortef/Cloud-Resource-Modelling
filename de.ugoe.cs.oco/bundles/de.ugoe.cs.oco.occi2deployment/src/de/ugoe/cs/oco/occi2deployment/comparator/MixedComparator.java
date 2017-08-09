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
import org.occiware.clouddesigner.occi.AttributeState;
import org.occiware.clouddesigner.occi.Entity;
import org.occiware.clouddesigner.occi.Mixin;
import org.occiware.clouddesigner.occi.Resource;

import de.ugoe.cs.oco.occi2deployment.Connection;
import de.ugoe.cs.oco.occi2deployment.ModelUtility;
import de.ugoe.cs.oco.occi2deployment.extraction.Extractor;
import de.ugoe.cs.oco.occi2deployment.extraction.ExtractorFactory;
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

	@Override
	void createResourceMatch(Path oldModelPath, EList<EObject> oldModel, Path newModelPath, EList<EObject> newModel) {		
		Comparator simple = ComparatorFactory.getComparator("Simple", oldModelPath, newModelPath, this.connection);
		
		Transformator occiToPcg = TransformatorFactory.getTransformator("OCCI2PCG");
		Path pcgPath = Paths.get("./src/de/ugoe/cs/oco/occi2deployment/tests/models/My.pcg");
		occiToPcg.transform(oldModelPath, newModelPath, pcgPath);
		
		adaptPCG(pcgPath, simple);
		
		Path ipgPath = Paths.get("./src/de/ugoe/cs/oco/occi2deployment/tests/models/My2.pcg");
		Transformator pcgToIpg = TransformatorFactory.getTransformator("PCG2IPG");
		pcgToIpg.transform(pcgPath, ipgPath);
		
		Map<String, List<Vertex>> map = calculateFixpointValueMap(ipgPath);
		this.matches = this.createMatch(map, oldModel, newModel);
		
		checkNewAndMissingMatchesForSimilarities(this.matches, oldModel, newModel);
	}

	private void adaptPCG(Path pcgPath, Comparator comp) {
		EList<EObject> pcg = ModelUtility.loadPCG(pcgPath);
		Graph pcgGraph = (Graph) pcg.get(0);
		adjustElementsInGraph(pcgGraph, comp.getOldElements(), comp.getMatches());
		adjustElementsInGraph(pcgGraph, comp.getAdaptedElements(), comp.getMatches());
		ModelUtility.storePCG(pcgPath, pcgGraph);
		CachedResourceSet.getCache().clear();
	}

	private void adjustElementsInGraph(Graph pcgGraph, EList<EObject> oldElements, EList<Match> matches) {
		List<Vertex> toRemove = new BasicEList<Vertex>();
		List<Vertex> toAdd = new BasicEList<Vertex>();
		for(EObject old: oldElements){
			if(old.eClass().getName().equals("Resource")){
				Resource res = (Resource) old;
				boolean missing = true;
				for(Vertex vertex: pcgGraph.getVertices()){	
					if(vertex.getResources().get(0).getId().equals(res.getId())
							&& vertex.getResources().get(1).getId().equals(res.getId())){
						missing = false;
					}	
					else if(vertex.getResources().get(0).getId().equals(res.getId())
							|| vertex.getResources().get(1).getId().equals(res.getId())){
						EList<Edge> incEdges = new BasicEList<Edge>();
						for(Edge edge: pcgGraph.getEdges()){
							if(edge.getTarget() == vertex){
								incEdges.add(edge);
							}
						}
						for(Edge incEdge: incEdges){
							//TO BE CHECKED
							if(edgeAlreadyExists(pcgGraph, incEdge.getSource(), correctVertex(pcgGraph.getVertices(), ((Entity) old).getId())) == false){
								incEdge.setTarget(correctVertex(pcgGraph.getVertices(), ((Entity) old).getId()));
							}
						}
						
						toRemove.add(vertex);
					}
				}
				if(missing == true){
					Vertex vertex = new PcgFactoryImpl().createVertex();
					Match match = getMatchFor(res, matches);
					pcg.Resource oldResource = new PcgFactoryImpl().createResource();
					oldResource.setId(((Resource)match.getOldObj()).getId());
					oldResource.setTitle(((Resource)match.getOldObj()).getTitle());
					
					pcg.Resource newResource = new PcgFactoryImpl().createResource();
					newResource.setId(((Resource)match.getNewObj()).getId());
					newResource.setTitle(((Resource)match.getNewObj()).getTitle());
					
					vertex.setFixpointValue(1);
					vertex.setKind(res.getKind().getScheme() + res.getKind().getTerm());
					vertex.setTitle(res.getTitle());
					vertex.getResources().add(oldResource);
					vertex.getResources().add(newResource);
					toAdd.add(vertex);
				}
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

	private Match getMatchFor(Resource res, EList<Match> matches) {
		for(Match match: matches){
			if(match.getNewObj() != null && match.getOldObj()!= null){
				System.out.println(match.getOldObj().eClass().getName());
				if(match.getOldObj().eClass().getName().equals("Resource")){
					if(res.getId().equals(((Resource) match.getOldObj()).getId())){
						System.out.println(match.getOldObj()+ " : " + match.getNewObj());
						return match;
					}
				}
			}
		}
		return null;
	}

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
			if(match.getNewObj() == null){
				for(Match match2: matches){
					if(match2.getOldObj() == null){
						if(checkIfEquivalent(match.getOldObj(),match2.getNewObj())){
							Match fusedMatch = new Match(match.getOldObj(), match2.getNewObj());
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
	
	//ZU TESTEN
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
					maxVertex=getMostFittingVertice(vertices, oldModel, newModel);
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
			maxVertex=getMostFittingVertice(possibleSources, oldModel, newModel);
			System.out.println("Second Pick: " + maxVertex.getTitle()); 
			System.out.println("");
			return maxVertex;
		}
		else{
			System.out.println("NO VERTEX LEFT!");
			return null;
		}
	}
	
	/*
	@Override
	Vertex getSuitableFixpointValue(Map<String, List<Vertex>> map, EList<EObject> oldModel, EList<EObject> newModel) {
		Vertex maxVertex = null;
		double max = 0.0;
		for(List<Vertex> vertices: map.values()){
			sortVertices(vertices);
			if(vertices.isEmpty() == false && vertices.get(0).getFixpointValue() > max){
				if(multipleMaxValuesExist(vertices)){
					maxVertex=getMostFittingVertice(vertices, oldModel, newModel);
					max = vertices.get(0).getFixpointValue();
				}
				else{
					maxVertex=vertices.get(0);	
					max = vertices.get(0).getFixpointValue();
				}
			}
		}
		return maxVertex;
	}*/
	
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

	private static Vertex getMostFittingVertice(List<Vertex> vertices, EList<EObject> oldModel, EList<EObject> newModel) {
		int bestFit = 0;
		int nextFit = 1;
		Vertex maxVertex;
		while(nextFit < vertices.size() &&
				vertices.get(bestFit).getFixpointValue() == vertices.get(nextFit).getFixpointValue()){
			maxVertex = compareVertices(vertices.get(bestFit), vertices.get(nextFit), oldModel, newModel);
			if(vertices.get(nextFit).equals(maxVertex)){
				bestFit = nextFit;
			}
			nextFit++;
		}
		return vertices.get(bestFit);
	}

	private static Vertex compareVertices(Vertex vertex, Vertex vertex2, EList<EObject> oldModel, EList<EObject> newModel) {
		if(vertexFit(vertex, oldModel, newModel) > vertexFit(vertex2, oldModel, newModel)){
			return vertex;
		}
		else{
			return vertex2;
		}		
	}

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

	private static boolean multipleMaxValuesExist(List<Vertex> vertices) {
		if(vertices.size() > 1 && vertices.get(0).getFixpointValue() == vertices.get(1).getFixpointValue()){		
			return true;
		}
		return false;
	}
}


