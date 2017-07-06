package de.ugoe.cs.oco.occi2deployment.comparator;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.occiware.clouddesigner.occi.AttributeState;
import org.occiware.clouddesigner.occi.Entity;
import org.occiware.clouddesigner.occi.Link;

import de.ugoe.cs.oco.occi2deployment.ModelUtility;
import de.ugoe.cs.oco.occi2deployment.transformation.Transformator;
import de.ugoe.cs.oco.occi2deployment.transformation.TransformatorFactory;
import pcg.*;


/**Complex Comparator implements the similiarity flooding algorithm combined with the EMF Compare
 * results as intial weighting.
 * @author rockodell
 *
 */
public class MixedComparator extends AbsComparator {
	/**Constructor executing the compare method to fill the ELists of the Object.
	 * @param oldModelPath
	 * @param newModelPath
	 */
	public MixedComparator(Path oldModelPath, Path newModelPath) {
		EList<EObject> oldModel = ModelUtility.loadOCCI(oldModelPath);
		EList<EObject> newModel = ModelUtility.loadOCCI(newModelPath);
		
		System.out.println("Simple");
		Comparator simple = ComparatorFactory.getComparator("Simple", oldModelPath, newModelPath);
		System.out.println("Complex");
		//Transform occi2pcg
		Transformator occiToPcg = TransformatorFactory.getTransformator("OCCI2PCG");
		Path pcgPath = Paths.get("./src/de/ugoe/cs/oco/occi2deployment/tests/models/My.pcg");
		occiToPcg.transform(oldModelPath, newModelPath, pcgPath);
		
		EList<EObject> pcg = ModelUtility.loadPCG(pcgPath);
		Graph graph = (Graph) pcg.get(0);
		List<Vertex> toRemove = new BasicEList<Vertex>();
		for(Vertex vertex: graph.getVertices()){
			for(EObject old: simple.getOldElements()){
				if(vertex.getResources().get(0).getId().equals(((Entity) old).getId())
						&& vertex.getResources().get(1).getId().equals(((Entity) old).getId()) == false){
					toRemove.add(vertex);
				}
			}
		}
		for(Vertex vertex: toRemove){
			EcoreUtil.delete(vertex);
		}
		//UMBEDINGT VERBESSERN!!!!
		int allEdges = graph.getEdges().size();
		for(int i = 0 ; i<allEdges; i++){
			for(Edge edge2: graph.getEdges()){
				if(edge2.getTarget() == null || edge2.getSource() == null){
					EcoreUtil.delete(edge2);
					break;
				}
			}
		}
		
		//Transform pcg2ipg
		Path ipgPath = Paths.get("./src/de/ugoe/cs/oco/occi2deployment/tests/models/My2.pcg");
		Transformator pcgToIpg = TransformatorFactory.getTransformator("PCG2IPG");
		pcgToIpg.transform(pcgPath, ipgPath);
		
		//Compare
		compare(oldModelPath, newModelPath, oldModel, newModel);
	}

	/**Compares two models based on the similiarity flooding algorithm
	 * @param oldModelPath 
	 * @param newModelPath
	 * @param oldModel
	 * @param newModel
	 */
	private void compare(Path oldModelPath, Path newModelPath, EList<EObject> oldModel, EList<EObject> newModel) {
		//Load IPG graph
		Path ipgPath = Paths.get("./src/de/ugoe/cs/oco/occi2deployment/tests/models/My2.pcg");
		EList<EObject> ipg = ModelUtility.loadPCG(ipgPath);
		Graph graph =(Graph)ipg.get(0);
		
		//Calculate Fixpoint Values
		performSimilarityFlooding(graph, 1000, 0.000000000000001);
		
		//Create Matches
		createResourceMatch(graph, oldModel, newModel);
		createLinkMatch();
		
		logMatch(matches);
	
		//Fill new entities
		investigateNewEntities(newModel, matches);
		//Fill missing entities
		investigateMissingEntities(oldModel, matches);
		//Fill adapted/old entities
		investigateOldAndAdaptedEntities(newModel, oldModel, matches);
	}


	/**Performs the similarity flooding algorithm on the given graph, until no change greater than eps
	 * is found among all vertices or max_iterations times.
	 * @param graph
	 * @param maxIterations
	 */
	private void performSimilarityFlooding(Graph graph, int maxIterations, double eps) {
		List<String[]> normValues = new ArrayList<String[]>();
		boolean stop = false;
		for(int i = 0; (i< maxIterations) && (stop ==false); i++){
			boolean somethingChanged = false;
			for(Vertex vertex: graph.getVertices()){
				//Initial Fixpoint Value
				double nextFixVal = vertex.getFixpointValue();
				
				//Get Incoming/Outgoing Edges
				EList<Edge> incEdges = new BasicEList<Edge>();
				EList<Edge> outEdges = new BasicEList<Edge>();
				for(Edge edge: graph.getEdges()){
					if(edge.getTarget() == vertex){
						incEdges.add(edge);
					}
					if(edge.getSource() == vertex){
						outEdges.add(edge);
					}
				}
				//Calculate Fixpint Value
				for(Edge incEdge: incEdges){
					nextFixVal += incEdge.getSource().getFixpointValue() * incEdge.getWeight();
				}
				for(Edge outEdge: outEdges){
					nextFixVal += outEdge.getTarget().getFixpointValue() * outEdge.getWeight();
				}
				
				Boolean exist = false;
				for(String[] normValue: normValues) {
					if(normValue[0].equals(vertex.getKind())){
						exist = true;
						if(nextFixVal > Double.parseDouble(normValue[1])){
							normValue[1] = String.valueOf(nextFixVal);
						}
					}
				}
				if(exist == false){
					String[] newNormVal = {vertex.getKind(), String.valueOf(nextFixVal)};
					normValues.add(newNormVal);
				}
				vertex.setNextFixpointValue(nextFixVal);
			}
			//Normalize
			for(Vertex vertex: graph.getVertices()){
				for(String[] normVal: normValues){
					if(normVal[0].equals(vertex.getKind())){
						vertex.setNextFixpointValue(vertex.getNextFixpointValue()/Double.parseDouble(normVal[1]));
						if(vertex.getFixpointValue() - vertex.getNextFixpointValue() > eps){
							somethingChanged = true;
						}
						vertex.setFixpointValue(vertex.getNextFixpointValue());
					}
				}
			}
			normValues.clear();
			if(somethingChanged == false){
				stop = true;
			}
		}
	}
	
	/**Creates Match out of the graph, the old and newModel.
	 * @param graph
	 * @param oldModel
	 * @param newModel
	 */
	public void createResourceMatch(Graph graph, EList<EObject> oldModel, EList<EObject> newModel) {
		Map<String, List<Vertex>> map = createFixpointValueMap(graph);
		createDirectMatching(map, oldModel, newModel);
	}
	
	/**Creates a Map containing the ids of the oldModels Resources as Key and their values as the all possible
	 * combination of Vertices and their fixpoint values calculated by the similarity flooding algorithm.
	 * @param graph
	 * @return
	 */
	public Map<String, List<Vertex>> createFixpointValueMap(Graph graph) {
		Map<String, List<Vertex>> map = new HashMap<String, List<Vertex>>();
		for(Vertex vertex: graph.getVertices()){
			if(map.containsKey(vertex.getResources().get(0).getId())){
				map.get(vertex.getResources().get(0).getId()).add(vertex);
			}
			else{
				List<Vertex> res = new BasicEList<Vertex>();
				res.add(vertex);
				map.put(vertex.getResources().get(0).getId(), res);
			}
		}
		return map;
	}
	
	/**Creates a direct Matching based on the calculated fixpoints of the similarity flooding algorithm.
	 * @param map
	 * @param oldModel
	 * @param newModel
	 * @return
	 */
	private void createDirectMatching(Map<String, List<Vertex>> map, EList<EObject> oldModel, EList<EObject> newModel) {
		List<Vertex> vertexMatch = new BasicEList<Vertex>();
		List<Vertex> missingMatching = new BasicEList<Vertex>();
		List<Vertex> newMatching = new BasicEList<Vertex>();
		
		//double threshold = 2.0;
		//match.addAll(initialMatching(map, threshold));
		vertexMatch.addAll(matching(map, vertexMatch));
		missingMatching.addAll(missingMatching(vertexMatch,oldModel));
		newMatching.addAll(newMatching(vertexMatch, newModel));
		vertexMatch.addAll(missingMatching);
		vertexMatch.addAll(newMatching);
		//Evtl. als optional einstellen je nach ergebnissen.
		checkNewAndMissingMatchesForSimilarities(vertexMatch, oldModel, newModel);
		
		for(Vertex vertex: vertexMatch){
			Match match = new Match();
			if(vertex.getResources().get(0).getTitle().equals("none")){
				match.setOldObj(null);
			}
			else{
				match.setOldObj(getEquivalentResource(vertex.getResources().get(0).getId(), oldModel));
			}
			if(vertex.getResources().get(1).getTitle().equals("none")){
				match.setNewObj(null);
			}
			else{
				match.setNewObj(getEquivalentResource(vertex.getResources().get(1).getId(), newModel));
			}
			matches.add(match);
		}
	}
	
	/**After the similarity flooding algorithm, missing and new matches are investigated for similarities,
	 * such as name, in order to match matching objects together.
	 * @param match
	 * @param oldModel
	 * @param newModel
	 */
	private void checkNewAndMissingMatchesForSimilarities(List<Vertex> match, EList<EObject> oldModel, EList<EObject> newModel) {
		List<Vertex> toRemove = new BasicEList<Vertex>();
		List<Vertex> toAdd = new BasicEList<Vertex>();
		for(Vertex vertex: match){
			if(vertex.getResources().get(1).getTitle().equals("none")){
				for(Vertex vertex2: match){
					if(vertex2.getResources().get(0).getTitle().equals("none")){
						if(checkIfEquivalent(getEquivalentResource(vertex.getResources().get(0).getId(), oldModel),
								getEquivalentResource(vertex2.getResources().get(1).getId(),newModel))){
							toAdd.add(fuseVertices(vertex, vertex2));
							toRemove.add(vertex);
							toRemove.add(vertex2);
						}
					}
				}
			}
		}
		for(Vertex vertex: toRemove){
			match.remove(vertex);
		}
		for(Vertex vertex: toAdd){
			match.add(vertex);
		}
	}

	/**Takes the vertices vertex and vertex2 and fuses them together.
	 * Hereby the new Vertex has the first Resource from vertex and the second from
	 * vertex2. It is assumed that vertex and vertex2 both have 1 null Resource, as it is only
	 * used for the method checkNewAndMissingMatchesForSimilarities.
	 * @param vertex
	 * @param vertex2
	 * @return
	 */
	private Vertex fuseVertices(Vertex vertex, Vertex vertex2) {
		PcgFactory factory = PcgFactory.eINSTANCE;
		Vertex fusedVertex = factory.createVertex();
		Resource oldResource = factory.createResource();
		Resource newResource = factory.createResource();
		
		
		fusedVertex.setTitle(vertex.getTitle() +", "+ vertex2.getTitle());
		
		oldResource.setId(vertex.getResources().get(0).getId());
		oldResource.setTitle(vertex.getResources().get(0).getTitle());
		newResource.setId(vertex2.getResources().get(1).getId());
		newResource.setTitle(vertex2.getResources().get(1).getTitle());
		fusedVertex.getResources().add(0, oldResource);
		fusedVertex.getResources().add(1, newResource);
		
		return fusedVertex;
	}

	/**Creates an entry in the matching for each Resource that is calculated as new in the newModel.
	 * @param match
	 * @param newModel
	 * @return
	 */
	private List<Vertex> newMatching(List<Vertex> match, EList<EObject> newModel) {
		List<Vertex> newMatching = new BasicEList<Vertex>();
		PcgFactory factory = PcgFactory.eINSTANCE;
		for(EObject obj: ModelUtility.getEntities(newModel)){
			if(obj.eClass().getName().equals("Resource")){
				Boolean newElement = true;
				for(Vertex vertex: match){
					if(vertex.getResources().get(1).getId().equals(((Entity)obj).getId())){
						newElement = false;
					}
				}
				if(newElement){
					Vertex newVertex = factory.createVertex();
					Resource emptyResource = factory.createResource();
					emptyResource.setTitle("none");
					Resource newResource = factory.createResource();
					newResource.setId(((Entity) obj).getId());
					newResource.setTitle(((Entity) obj).getTitle());
					newVertex.getResources().add(0,emptyResource);
					newVertex.getResources().add(1, newResource);
					newMatching.add(newVertex);
				}
			}
		}
		return newMatching;
	}

	/**Creates an Entry for each missing Entity in the match. 
	 * @param match
	 * @param oldModel
	 * @return
	 */
	private List<Vertex> missingMatching(List<Vertex> match, EList<EObject> oldModel) {
		List<Vertex> missingMatching = new BasicEList<Vertex>();
		PcgFactory factory = PcgFactory.eINSTANCE;
		
		for(EObject obj: ModelUtility.getEntities(oldModel)){
			if(obj.eClass().getName().equals("Resource")){
				Boolean missing = true;
				for(Vertex vertex: match){
					if(vertex.getResources().get(0).getId().equals(((Entity)obj).getId())){
						missing = false;
					}
				}
				if(missing){
					Vertex newVertex = factory.createVertex();
					Resource emptyResource = factory.createResource();
					emptyResource.setTitle("none");
					Resource newResource = factory.createResource();
					newResource.setId(((Entity) obj).getId());
					newResource.setTitle(((Entity) obj).getTitle());
					newVertex.getResources().add(0, newResource);
					newVertex.getResources().add(1,emptyResource);
					missingMatching.add(newVertex);
				}
			}
		}
		return missingMatching;
	}

	/**Checks, whether two Objects possess identical AttributeStates.
	 * @param oldObj
	 * @param newObj
	 * @return
	 */
	private boolean checkIfEquivalent(EObject oldObj, EObject newObj) {
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
	}
	
	/**Matches every Resources which are not already matched by the initial matching and therefore are
	 * under the given threshold of the initial matching.
	 * @param map
	 * @param match
	 * @return
	 */
	private List<Vertex> matching(Map<String, List<Vertex>> map, List<Vertex> match) {
		List<Vertex> leftOverMatching = new BasicEList<Vertex>();
		
		while(map.isEmpty() == false){
			Vertex highest = getHighestFixpointValue(map);
			if(highest == null){
				removeEmptyKeys(map);
			}
			else{	
				leftOverMatching.add(highest);
				//logMap(map);
				map.remove(highest.getResources().get(0).getId());
				removeEntires(highest, map);
			}
		}
		return leftOverMatching;
	}

	
	/**Removes keys with no values from the map of the similarity flooding algorithm.
	 * @param map
	 */
	private void removeEmptyKeys(Map<String, List<Vertex>> map) {
		List<String> toRemove = new ArrayList<String>();
		for(String key: map.keySet()){
			if(map.get(key).isEmpty()){
				toRemove.add(key);
			}
		}
		for(String str: toRemove){
			map.remove(str);
		}
	}

	/**Removes passed Vertex highest from the map of the similarity flooding algorithm.
	 * @param highest
	 * @param map
	 */
	private void removeEntires(Vertex highest, Map<String, List<Vertex>> map) {
		List<Vertex> toRemove = new BasicEList<Vertex>();
		for(List<Vertex> vertices: map.values()){
			for(Vertex vertex: vertices){
				if(vertex.getResources().get(1).getId().equals(highest.getResources().get(1).getId())){
					toRemove.add(vertex);
				}
			}
			vertices.removeAll(toRemove);
		}
	}

	/**Returns the highest fixpoint value of the whole map.
	 * @param map
	 * @return
	 */
	private Vertex getHighestFixpointValue(Map<String, List<Vertex>> map) {
		Vertex maxVertex = null;
		double max = 0.0;
		for(List<Vertex> vertices: map.values()){
			sortVertices(vertices);
			if(vertices.isEmpty() == false && vertices.get(0).getFixpointValue() > max){
				maxVertex=vertices.get(0);
				max = vertices.get(0).getFixpointValue();
			}
		}
		return maxVertex;
	}

	/**Sorts vertices in the passed list.
	 * @param list
	 */
	private void sortVertices(List<Vertex> list) {
		Collections.sort(list, (o1, o2) -> (o1.getFixpointValue()>o2.getFixpointValue() ? -1 : (o1==o2 ? 0 : 1)));
	}
	
	/**Returns the OCCI Resource from the model which is equivalent to the given id.
	 * @param resource
	 * @param model
	 * @return
	 */
	private org.occiware.clouddesigner.occi.Resource getEquivalentResource(String id, EList<EObject> model) {
		for(EObject obj: ModelUtility.getResources(model)){
			org.occiware.clouddesigner.occi.Resource res = (org.occiware.clouddesigner.occi.Resource) obj;
			if(res.getId().equals(id)){
				return res;
			}
		}
		return null;
	}
	
	/**Initialy matches all Resources which possess a fixpoint value equal or higher than the given threshold.
	 * @param map
	 * @param threshold
	 * @return
	 */
	private List<Vertex> initialMatching(Map<String, List<Vertex>> map, double threshold) {
		List<Vertex> initialMatching = new BasicEList<Vertex>(); 
		List<String> keysToRemove = new ArrayList<String>();
		for(String key: map.keySet()){
			for(Vertex vertex: map.get(key)){
				if(vertex.getFixpointValue() >= threshold){
					initialMatching.add(vertex);
					keysToRemove.add(key);
				}
			}
		}
		for(String str: keysToRemove){
			map.remove(str);
		}
		return initialMatching;	
	}
}


