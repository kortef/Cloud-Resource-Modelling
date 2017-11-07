package de.ugoe.cs.oco.occi2deployment.comparator;

import java.nio.file.Path;
import java.util.ArrayList;
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

/**Class handling the calculation of fixpoint values from ipg paths.
 * @author rockodell
 *
 */
public class SimilarityFlooding {
	
	/**Generates and returns fixpoint value map from passed ipg path.
	 * @param ipgPath
	 * @return
	 */
	public Map<String, List<Vertex>> generateFixpointValueMap(Path ipgPath) {
		//Load IPG graph
		EList<EObject> ipg = ModelUtility.loadPCG(ipgPath);
		Graph ipgGraph =(Graph)ipg.get(0);		
		performSimilarityFlooding(ipgGraph, 1000, 0.0000000000000000000001);			
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
		for(int i = 0; (i< maxIterations) && (stop == false); i++){
			for(Vertex vertex: graph.getVertices()){
				double nextFixVal = calculateFixpointValue(vertex, graph);
				vertex.setNextFixpointValue(nextFixVal);
				updateNormValues(vertex, normValues);
			}
			stop = normalizeValues(graph, normValues, eps);
			normValues.clear();
		}
	}

	/**Fixpoint value normalization.
	 * @param graph
	 * @param normValues
	 * @param eps
	 * @return
	 */
	private boolean normalizeValues(Graph graph,  List<String[]> normValues, double eps) {
		boolean somethingChanged = false;
		for(Vertex vertex: graph.getVertices()){
			for(String[] normVal: normValues){
				if(normVal[0].equals(vertex.getKind())){
					vertex.setNextFixpointValue(vertex.getNextFixpointValue()/Double.parseDouble(normVal[1]));
					if(vertex.getFixpointValue() - vertex.getNextFixpointValue() > eps){
						somethingChanged = true;
					}
					vertex.setFixpointValue(vertex.getNextFixpointValue());
					//System.out.println(vertex.getTitle() + " " + vertex.getFixpointValue());
				}
			}
		}
		if(somethingChanged == false){
			return true;
		}
		else{
			return false;
		}
	}




	/**Updates norm values according to highest calculated one for each Kind.
	 * @param vertex
	 * @param normValues
	 */
	private void updateNormValues(Vertex vertex, List<String[]> normValues) {
		Boolean exist = false;
		for(String[] normValue: normValues) {
			if(normValue[0].equals(vertex.getKind())){
				exist = true;
				if(vertex.getNextFixpointValue() > Double.parseDouble(normValue[1])){
					normValue[1] = String.valueOf(vertex.getNextFixpointValue());
				}
			}
		}
		if(exist == false){
			String[] newNormVal = {vertex.getKind(), String.valueOf(vertex.getNextFixpointValue())};
			normValues.add(newNormVal);
		}	
	}
	
	/**Calculates fixpoint values for passed vertex. Depends on the incoming edges, their weight
	 * and the fixpoint value of the source.
	 * @param vertex
	 * @param graph
	 * @return
	 */
	private double calculateFixpointValue(Vertex vertex, Graph graph) {
		double nextFixVal = vertex.getFixpointValue();
		//System.out.print(vertex.getTitle() + " : " + nextFixVal + "+ ");
		for(Edge incEdge: getIncEdges(vertex, graph)){
			//System.out.print(incEdge.getSource().getFixpointValue()+ "*" + incEdge.getWeight());
			nextFixVal += incEdge.getSource().getFixpointValue() * incEdge.getWeight();
			//System.out.print(" + ");
		}
		return nextFixVal;
	}

	/**Returns outgoing edges of the vertex in the graph.
	 * @param vertex
	 * @param graph
	 * @return
	 */
	@SuppressWarnings("unused")
	private EList<Edge> getOutEdges(Vertex vertex, Graph graph) {
		EList<Edge> outEdges = new BasicEList<Edge>();
		for(Edge edge: graph.getEdges()){
			if(edge.getSource() == vertex){
				outEdges.add(edge);
				//System.out.println("Edge: " + edge.getSource().getTitle() + " -> " + edge.getTarget().getTitle() +" : "+  edge.getWeight());
			}	
		}	
		return outEdges;
	}

	/**Returns incoming edges of the vertex in the graph.
	 * @param vertex
	 * @param graph
	 * @return
	 */
	private EList<Edge> getIncEdges(Vertex vertex, Graph graph) {
		EList<Edge> incEdges = new BasicEList<Edge>();
		for(Edge edge: graph.getEdges()){
			if(edge.getTarget() == vertex){
				incEdges.add(edge);
				//System.out.println("Edge: " + edge.getSource().getTitle() + " -> " + edge.getTarget().getTitle() +" : "+  edge.getWeight());
			}		
		}	
		return incEdges;
	}
		

	/**Creates a Map containing the ids of the oldModels Resources as Key and their values as the all possible
	 * combination of Vertices and their fixpoint values calculated by the similarity flooding algorithm.
	 * @param graph
	 * @return
	 */
	private Map<String, List<Vertex>> createFixpointValueMap(Graph graph) {
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
	protected static void removeEmptyKeys(Map<String, List<Vertex>> map) {
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
	protected static void removeEntires(Vertex highest, Map<String, List<Vertex>> map) {
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
}
