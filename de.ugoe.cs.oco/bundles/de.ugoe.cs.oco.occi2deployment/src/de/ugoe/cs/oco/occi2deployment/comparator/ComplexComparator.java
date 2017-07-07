package de.ugoe.cs.oco.occi2deployment.comparator;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.occiware.clouddesigner.occi.Entity;

import de.ugoe.cs.oco.occi2deployment.ModelUtility;
import de.ugoe.cs.oco.occi2deployment.transformation.Transformator;
import de.ugoe.cs.oco.occi2deployment.transformation.TransformatorFactory;
import pcg.PcgFactory;
import pcg.Resource;
import pcg.Vertex;


/**Complex Comparator implements the similiarity flooding algorithm combined with the EMF Compare
 * results as intial weighting.
 * @author rockodell
 *
 */
public class ComplexComparator extends AbsComparator {
	/**Constructor executing the compare method to fill the ELists of the Object.
	 * @param oldModelPath
	 * @param newModelPath
	 */
	public ComplexComparator(Path oldModelPath, Path newModelPath) {	
		compare(oldModelPath, newModelPath);
	}

	public ComplexComparator() {
		// TODO Auto-generated constructor stub
	}

	@Override
	void createResourceMatch(Path oldModelPath, EList<EObject> oldModel, Path newModelPath, EList<EObject> newModel) {
		Transformator occiToPcg = TransformatorFactory.getTransformator("OCCI2PCG");
		Path pcgPath = Paths.get("./src/de/ugoe/cs/oco/occi2deployment/tests/models/My.pcg");
		occiToPcg.transform(oldModelPath, newModelPath, pcgPath);
				
		Path ipgPath = Paths.get("./src/de/ugoe/cs/oco/occi2deployment/tests/models/My2.pcg");
		Transformator pcgToIpg = TransformatorFactory.getTransformator("PCG2IPG");
		pcgToIpg.transform(pcgPath, ipgPath);
		
		this.matches = generateMatches(ipgPath, oldModel, newModel);
	}
	
	EList<Match> generateMatches(Path ipgPath, EList<EObject> oldModel, EList<EObject> newModel) {
		Map<String, List<Vertex>> map = (new SimilarityFlooding()).generateFixpointValueMap(ipgPath);
		return createMatch(map, oldModel, newModel);
	}
	
	/**Creates a direct Matching based on the calculated fixpoints of the similarity flooding algorithm.
	 * @param map
	 * @param oldModel
	 * @param newModel
	 * @return 
	 * @return
	 */
	private EList<Match> createMatch(Map<String, List<Vertex>> map, EList<EObject> oldModel, EList<EObject> newModel) {
		List<Vertex> directMatch = new BasicEList<Vertex>();
		List<Vertex> missingMatching = new BasicEList<Vertex>();
		List<Vertex> newMatching = new BasicEList<Vertex>();
		
		directMatch.addAll(directMatching(map));
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
	 * @param match
	 * @return
	 */
	private List<Vertex> directMatching(Map<String, List<Vertex>> map) {
		List<Vertex> matching = new BasicEList<Vertex>();
		
		while(map.isEmpty() == false){
			Vertex highest = SimilarityFlooding.getHighestFixpointValue(map);
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
	private org.occiware.clouddesigner.occi.Resource getEquivalentResource(String id, EList<EObject> model) {
		for(EObject obj: ModelUtility.getResources(model)){
			org.occiware.clouddesigner.occi.Resource res = (org.occiware.clouddesigner.occi.Resource) obj;
			if(res.getId().equals(id)){
				return res;
			}
		}
		return null;
	}
}


