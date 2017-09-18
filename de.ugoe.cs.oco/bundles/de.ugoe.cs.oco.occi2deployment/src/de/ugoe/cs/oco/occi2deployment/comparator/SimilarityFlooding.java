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
import org.occiware.clouddesigner.occi.Entity;

import de.ugoe.cs.oco.occi2deployment.ModelUtility;
import de.ugoe.cs.oco.occi2deployment.extraction.Extractor;
import de.ugoe.cs.oco.occi2deployment.extraction.ExtractorFactory;
import pcg.Edge;
import pcg.Graph;
import pcg.PcgFactory;
import pcg.Resource;
import pcg.Vertex;

public class SimilarityFlooding {
	
	public Map<String, List<Vertex>> generateFixpointValueMap(Path ipgPath) {
		//Load IPG graph
		EList<EObject> ipg = ModelUtility.loadPCG(ipgPath);
		Graph ipgGraph =(Graph)ipg.get(0);		
		performSimilarityFlooding(ipgGraph, 1000, 0.0000000000000000000001);			
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
	
	private double calculateFixpointValue(Vertex vertex, Graph graph) {
		double nextFixVal = vertex.getFixpointValue();
		//System.out.print(vertex.getTitle() + " : " + nextFixVal + "+ ");
		EList<Edge> incEdges = getIncEdges(vertex, graph);
		for(Edge incEdge: getIncEdges(vertex, graph)){
			//System.out.print(incEdge.getSource().getFixpointValue()+ "*" + incEdge.getWeight());
			nextFixVal += incEdge.getSource().getFixpointValue() * incEdge.getWeight();
			//System.out.print(" + ");
		}
		
		//ERZIELT BESSERE ERGEBNISSE: WEIL SO AUCH DIE ANZAHL AN KANTEN VOM SOURCE ZU TARGET MODEL ERKANNT WERDEN. UND SOMIT BESSER
		//NEUE ENTITIES ERKANNT WERDEN KÖNNEN
		//for(Edge outEdge: getOutEdges(vertex, graph)){
			//System.out.print(outEdge.getSource().getFixpointValue()+ "*" + outEdge.getWeight());
			//nextFixVal += (outEdge.getTarget().getFixpointValue() * outEdge.getWeight());
			//System.out.print(" + ");
		//}
		//System.out.println("inc: "+ incEdges.size() + " out: " + outEdges.size());
		//System.out.println(vertex.getTitle()+ " : " + nextFixVal);
		//System.out.println();
		return nextFixVal;
	}

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
