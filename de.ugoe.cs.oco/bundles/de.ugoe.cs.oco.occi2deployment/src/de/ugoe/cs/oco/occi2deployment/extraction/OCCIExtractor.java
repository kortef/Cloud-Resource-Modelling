package de.ugoe.cs.oco.occi2deployment.extraction;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.uml2.uml.ActivityNode;
import org.eclipse.uml2.uml.ValuePin;
import org.eclipse.cmf.occi.core.Entity;

import de.ugoe.cs.oco.occi2deployment.ModelUtility;

/**Extractor used to extract information from a OCCI Topology.
 * @author rockodell
 *
 */
public class OCCIExtractor implements Extractor {
	@Override
	public Entity extractElement(ActivityNode activity, EList<EObject> model) {
		String id = getInputIDOfElement(activity);
		Entity entity = findCorrespondingElement(id, model);
		return entity;
	}
	
	/**Compares every Element in the OCCI Model to the passed id.
	 * @param id
	 * @param occi
	 * @return Element possessing the passed id.
	 */
	private Entity findCorrespondingElement(String id, EList<EObject> occi) {
		for(EObject element: ModelUtility.getEntities(occi)){
			Entity entity = (Entity) element;	
			if(id.equals(entity.getId())){
				return entity;
			}
		}
		log.error("Element could not be found in topology model: " + id);
		return null;
	}

	/**Returns ID contained in the ValuePin of the activity
	 * @param activity
	 * @return ID of the element searched for.
	 */
	private String getInputIDOfElement(ActivityNode activity){
		if(activity.getOwnedElements() != null){
			if(activity.getOwnedElements().get(0).eClass().getName().equals("ValuePin")){
				ValuePin pin = (ValuePin) activity.getOwnedElements().get(0);
				return pin.getValue().stringValue();
			}
		}
		log.error("Activity does not store an id: " + activity.getName());
		return null;
	}
}
