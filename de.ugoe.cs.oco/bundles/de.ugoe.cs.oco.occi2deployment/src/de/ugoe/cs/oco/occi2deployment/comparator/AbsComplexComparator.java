package de.ugoe.cs.oco.occi2deployment.comparator;

import java.nio.file.Path;
import java.util.Collections;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.occiware.clouddesigner.occi.Entity;

import de.ugoe.cs.oco.occi2deployment.ModelUtility;
import pcg.PcgFactory;
import pcg.Resource;
import pcg.Vertex;

public abstract class AbsComplexComparator extends AbsComparator {
	abstract Vertex getSuitableFixpointValue(Map<String, List<Vertex>> map, EList<EObject> oldModel, EList<EObject> newModel);
	
	
	protected Map<String, List<Vertex>> calculateFixpointValueMap(Path ipgPath) {
		SimilarityFlooding flood = new SimilarityFlooding();
		return flood.generateFixpointValueMap(ipgPath);
	}
	
	/**Creates a direct Matching based on the calculated fixpoints of the similarity flooding algorithm.
	 * @param map
	 * @param oldModel
	 * @param newModel
	 * @return 
	 * @return
	 */
	protected EList<Match> createMatch(Map<String, List<Vertex>> map, EList<EObject> oldModel, EList<EObject> newModel) {
		List<Vertex> directMatch = new BasicEList<Vertex>();
		List<Vertex> missingMatching = new BasicEList<Vertex>();
		List<Vertex> newMatching = new BasicEList<Vertex>();
		
		directMatch.addAll(directMatching(map, oldModel, newModel));
		missingMatching.addAll(missingMatching(directMatch,oldModel));
		newMatching.addAll(newMatching(directMatch, newModel));
		directMatch.addAll(missingMatching);
		directMatch.addAll(newMatching);
		
		return convertVerticesToMatch(directMatch, oldModel, newModel);
	}

	private EList<Match> convertVerticesToMatch(List<Vertex> directMatch, EList<EObject> oldModel, EList<EObject> newModel) {
		EList<Match> toReturn = new BasicEList<Match>();
		for(Vertex vertex: directMatch){
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
			toReturn.add(match);
		}
		return toReturn;
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
	
	/**Matches every Resources which are not already matched by the initial matching and therefore are
	 * under the given threshold of the initial matching.
	 * @param map
	 * @param newModel 
	 * @param oldModel 
	 * @param match
	 * @return
	 */
	private List<Vertex> directMatching(Map<String, List<Vertex>> map, EList<EObject> oldModel, EList<EObject> newModel) {
		List<Vertex> matching = new BasicEList<Vertex>();
		
		while(map.isEmpty() == false){
			Vertex highest = getSuitableFixpointValue(map, oldModel, newModel);
			if(highest == null){
				SimilarityFlooding.removeEmptyKeys(map);
			}
			else{	
				matching.add(highest);
				map.remove(highest.getResources().get(0).getId());
				SimilarityFlooding.removeEntires(highest, map);
			}
		}
		return matching;
	}

	/**Returns the OCCI Resource from the model which is equivalent to the given id.
	 * @param resource
	 * @param model
	 * @return
	 */
	protected static org.occiware.clouddesigner.occi.Resource getEquivalentResource(String id, EList<EObject> model) {
		for(EObject obj: ModelUtility.getResources(model)){
			org.occiware.clouddesigner.occi.Resource res = (org.occiware.clouddesigner.occi.Resource) obj;
			if(res.getId().equals(id)){
				return res;
			}
		}
		return null;
	}
	

	protected void logList(List<Vertex> vertices) {
		String output = new String();
		for(Vertex vert: vertices){
			output+= "[" + ((pcg.Resource)vert.getResources().get(0)).getTitle() + " : " + ((pcg.Resource)vert.getResources().get(1)).getTitle();
			output+= ", " + vert.getFixpointValue() + "] ";
		}
		log.debug(output);	
	}

	/**Sorts vertices in the passed list.
	 * @param list
	 */
	protected static void sortVertices(List<Vertex> list) {
		Collections.sort(list, (o1, o2) -> (o1.getFixpointValue()>o2.getFixpointValue() ? -1 : (o1==o2 ? 0 : 1)));
	}


}
