package de.ugoe.cs.oco.occi2deployment.comparator;

import java.nio.file.Path;
import java.util.Iterator;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

import de.ugoe.cs.oco.occi2deployment.ModelUtility;
import de.ugoe.cs.oco.pog.Vertex;

/**A comparator that compares two POG graphs with another
 * in order to remove old elements. Not used atm, due to better
 * implementation available. Maybe for use, when the PaaS 
 * extension is available.
 * @author rockodell
 *
 */
public class POGComparator extends AbsComparator {
	
	public POGComparator(Path model1, Path model2) {
		EList<EObject> oldModel = ModelUtility.loadPOG(model1);
		EList<EObject> newModel = ModelUtility.loadPOG(model2);
		compare(oldModel, newModel);
	}

	private void compare(EList<EObject> oldModel, EList<EObject> newModel) {
		EObject oldGraph = oldModel.get(0);
		EObject newGraph = newModel.get(0);
		for(Iterator<EObject> iteratorOld = oldGraph.eAllContents(); iteratorOld.hasNext();){
			EObject nestedOld = iteratorOld.next();
			if(nestedOld.eClass().getName().equals("Vertex")){
				for(Iterator<EObject> iteratorNew = newGraph.eAllContents(); iteratorNew.hasNext();){
					EObject nestedNew = iteratorNew.next();
					if(nestedNew.eClass().getName().equals("Vertex")){
						if(((Vertex)nestedOld).getId().equals(((Vertex)nestedNew).getId())){
							oldElements.add(nestedOld);
							log.debug("Added Old Element: " + ((Vertex) nestedOld).getTitle());
						}
					}
				}
			}
		}
	}

	@Override
	void createResourceMatch(Path oldModelPath, EList<EObject> oldModel, Path newModelPath, EList<EObject> newModel) {
		// TODO Auto-generated method stub
		
	}
}
