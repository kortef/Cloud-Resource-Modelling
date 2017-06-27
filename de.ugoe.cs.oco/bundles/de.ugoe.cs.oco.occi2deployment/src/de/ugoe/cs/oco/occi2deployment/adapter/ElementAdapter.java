package de.ugoe.cs.oco.occi2deployment.adapter;

import org.apache.log4j.Logger;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.occiware.clouddesigner.occi.Entity;

/**Handles the adaptation process for single elements.
 * @author rockodell
 *
 */
public class ElementAdapter {
	static Logger log = Logger.getLogger(ElementAdapter.class.getName());
	
	public void adapt(EList<EObject> adaptedElements) {
		for(EObject element: adaptedElements){
			Entity entity = (Entity) element;
			if(element.eClass().getName().equals("Resource")){
				if(entity.getKind().getTerm().equals("compute")){
					adaptComputeInstance(entity);
				}
				else if(entity.getKind().getTerm().equals("network")){
					adaptNetworkInstance(entity);
				}
				else if(entity.getKind().getTerm().equals("storage")){
					adaptStorageInstance(entity);		
				}
			}
			else if(element.eClass().getName().equals("Link")){
				adaptLinkInstance(entity);
			}
			
		}	
	}

	private void adaptLinkInstance(Entity link) {
		// TODO Auto-generated method stub
		
	}

	private void adaptStorageInstance(Entity entity) {
		// TODO Auto-generated method stub
		
	}

	private void adaptNetworkInstance(Entity entity) {
		// TODO Auto-generated method stub
		
	}

	private void adaptComputeInstance(Entity entity) {
		
	}
}
