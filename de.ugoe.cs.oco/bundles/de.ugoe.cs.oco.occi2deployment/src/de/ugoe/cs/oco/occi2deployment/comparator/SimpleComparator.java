package de.ugoe.cs.oco.occi2deployment.comparator;

import java.nio.file.Path;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.occiware.clouddesigner.occi.Resource;

import de.ugoe.cs.oco.occi2deployment.ModelUtility;

public class SimpleComparator extends AbsComparator {
	
	public SimpleComparator(Path model1, Path model2) {
		EList<EObject> oldModel = ModelUtility.loadOCCI(model1);
		EList<EObject> newModel = ModelUtility.loadOCCI(model2);
		compare(oldModel, newModel);
	}

	private void compare(EList<EObject> oldModel, EList<EObject> newModel) {
		createMatch(oldModel, newModel);
		logMatch(matches);
		
		//Fill new entities
		investigateNewEntities(newModel, matches);
		//Fill missing entities
		investigateMissingEntities(oldModel, matches);
		//Fill adapted/old entities
		investigateOldAndAdaptedEntities(newModel, oldModel, matches);
	}
	
	public void createMatch(EList<EObject> oldModel, EList<EObject> newModel) {
		matchOldAndNewElements(oldModel, newModel);
		matchMissingElements(oldModel, newModel);
	}

	private void matchMissingElements(EList<EObject> oldModel, EList<EObject> newModel) {
		boolean missingElement;
		for(Resource resourceFromOld: ModelUtility.getResources(oldModel)){
				missingElement = true;
				for(Resource resourceFromNew: ModelUtility.getResources(newModel)){
					if(resourceFromOld.getId().equals(resourceFromNew.getId())){
						missingElement = false;
					}
				}
				if(missingElement){
					Match match = new Match(resourceFromOld, null);
					matches.add(match);
				}
			}	
		}

	private void matchOldAndNewElements(EList<EObject> oldModel, EList<EObject> newModel) {
		boolean newElement;
		for(Resource resourceFromNew: ModelUtility.getResources(newModel)){
			newElement = true;
				for(Resource resourceFromOld: ModelUtility.getResources(oldModel)){
					if(resourceFromOld.getId().equals(resourceFromNew.getId())){
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
}
