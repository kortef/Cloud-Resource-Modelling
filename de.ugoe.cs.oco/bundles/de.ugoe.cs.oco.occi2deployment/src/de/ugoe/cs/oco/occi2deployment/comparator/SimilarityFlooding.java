package de.ugoe.cs.oco.occi2deployment.comparator;

import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

import de.ugoe.cs.oco.occi2deployment.ModelUtility;
import pcg.Edge;
import pcg.Graph;
import pcg.Vertex;

public class SimilarityFlooding {
	
	public Map<String, List<Vertex>> generateFixpointValueMap(Path ipgPath) {
		//Load IPG graph
		EList<EObject> ipg = ModelUtility.loadPCG(ipgPath);
		Graph ipgGraph =(Graph)ipg.get(0);
				
		performSimilarityFlooding(ipgGraph, 1000, 0.000000000000001);
				
		//Create Matches
		return createFixpointValueMap(ipgGraph);
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
	
	/**Removes keys with no values from the map of the similarity flooding algorithm.
	 * @param map
	 */
	public static void removeEmptyKeys(Map<String, List<Vertex>> map) {
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
	public static void removeEntires(Vertex highest, Map<String, List<Vertex>> map) {
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
	public static Vertex getHighestFixpointValue(Map<String, List<Vertex>> map) {
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
	private static void sortVertices(List<Vertex> list) {
		Collections.sort(list, (o1, o2) -> (o1.getFixpointValue()>o2.getFixpointValue() ? -1 : (o1==o2 ? 0 : 1)));
	}
}
