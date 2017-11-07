package de.ugoe.cs.oco.occi2deployment.comparator;

import java.nio.file.Path;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.occiware.clouddesigner.occi.Resource;

import de.ugoe.cs.oco.occi2deployment.Connection;
import de.ugoe.cs.oco.occi2deployment.ModelUtility;

/**A simple comparator that compares two Models, by matching elements
 * that posses the same ids.
 * @author rockodell
 *
 */
public class SimpleComparator extends AbsComparator {
	
	/**Creates a comparator instance based on the models passed as model1 and model2.
	 * @param model1
	 * @param model2
	 * @param conn 
	 */
	public SimpleComparator(Path model1, Path model2, Connection conn) {
		this.connection = conn;
		compare(model1, model2);
	}

	/**Fills the match of the comparator.
	 * @param oldModel
	 * @param newModel
	 */
	public void createResourceMatch(Path oldModelPath, EList<EObject> oldModel, Path newModelPath, EList<EObject> newModel) {
		matchOldAndNewElements(oldModel, newModel);
		matchMissingElements(oldModel, newModel);
	}

	/**Searches for missing elements in the newModel. And matches the 
	 * oldModel elements missing to a null value.
	 * @param oldModel
	 * @param newModel
	 */
	private void matchMissingElements(EList<EObject> oldModel, EList<EObject> newModel) {
		boolean missingElement;
		for(Resource resourceFromOld: ModelUtility.getResources(oldModel)){
				missingElement = true;
				for(Resource resourceFromNew: ModelUtility.getResources(newModel)){
					String unactual = getUnActualId(resourceFromOld.getId(), this.connection);
					if(unactual.equals(resourceFromNew.getId())){
						missingElement = false;
					}
				}
				if(missingElement){
					Match match = new Match(resourceFromOld, null);
					matches.add(match);
				}
			}	
		}

	/**Creates Matches for entities with the same id occuring in both models.
	 * If an id is not found, a match is created storing a null value and the entity
	 * from the new model.
	 * @param oldModel
	 * @param newModel
	 */
	private void matchOldAndNewElements(EList<EObject> oldModel, EList<EObject> newModel) {
		boolean newElement;
		for(Resource resourceFromNew: ModelUtility.getResources(newModel)){
			newElement = true;
				for(Resource resourceFromOld: ModelUtility.getResources(oldModel)){
					String unactual = getUnActualId(resourceFromOld.getId(), this.connection);
					if(unactual.equals(resourceFromNew.getId())){
						newElement = false;
						Match match = new Match(resourceFromOld, resourceFromNew);
						matches.add(match);	
					}
				}
				if(newElement){
					Match match = new Match(null, resourceFromNew);
					matches.add(match);
				}
			}
		}
	
	/**Returns model id of the passed String runtime id.
	 * @param id
	 * @param connection
	 * @return
	 */
	private String getUnActualId(String id, Connection connection) {
		if(connection != null){
			for (String[] swapID : connection.getIdSwapList()) {	    	
				if(id.equals(swapID[1])){
					return swapID[0];
				}
			}
			return id;
		}
		return id;
	}
}
