package de.ugoe.cs.oco.occi2deployment.deprovisioner;

import org.apache.log4j.Logger;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.modmacao.placement.Placementlink;
import org.eclipse.cmf.occi.core.Entity;
import org.eclipse.cmf.occi.core.Link;
import org.eclipse.cmf.occi.core.Resource;
import org.eclipse.cmf.occi.infrastructure.Compute;
import org.eclipse.cmf.occi.infrastructure.Network;
import org.eclipse.cmf.occi.infrastructure.Storage;

import de.ugoe.cs.oco.occi2deployment.execution.Executor;


/**Handles the deprovisioning process.
 * @author rockodell
 *
 */
public class Deprovisioner {
	static Logger log = Logger.getLogger(Deprovisioner.class.getName());
	private Executor exec;
	static private String publicNetwork = "urn:uuid:d52754e0-6729-4034-adbb-8f1f3800f2c6";
	
	/**Creates a deprovisioner instance for the specified Connection conn.
	 * @param conn
	 */
	public Deprovisioner(Executor executor) {
		this.exec = executor;
	}


	/**Deprovisions every element on the cloud infrastructure that is defined as EObject
	 * in the passed eList.
	 * @param eList
	 */
	public void deprovision(EList<EObject> eList){
		EList<Entity> resources = new BasicEList<Entity>();
		EList<Entity> networks = new BasicEList<Entity>();
		EList<Entity> storages = new BasicEList<Entity>();
		EList<Entity> computes = new BasicEList<Entity>();
		EList<Entity> links = new BasicEList<Entity>();
		//First Deprovision Compute and Storage Instances
		for(EObject element: eList){
			if(element instanceof Resource){
				boolean specialResource = false;
				Entity entity = (Entity) element;
				if(entity instanceof Compute){
					specialResource = true;
					computes.add(entity);
				}
				else if(entity instanceof Network){
					specialResource = true;
					if(entity.getId().equals(publicNetwork) == false) {
						networks.add(entity);
					}
				}
				else if(entity instanceof Storage){
					specialResource = true;
					storages.add(entity);		
				}
				else if(specialResource == false) {
					resources.add(entity);
				}
				
			}
			else if(element instanceof Link){
				Entity entity = (Entity) element;
				links.add(entity);
			}
		}
		
		for(Entity link: links){
			if(link instanceof Placementlink == false) {
				deprovisionLinkInstance(link);
			}
		}
		for(Entity compute: computes){
			deprovisionComputeInstance(compute);
		}	
		for(Entity storage: storages){
			deprovisionStorageInstance(storage);	
		}
		for(Entity network: networks){
			deprovisionNetworkInstance(network);
		}	
		for(Entity resource: resources){
			deprovisionResourceInstance(resource);
		}	
	}

	/**Deprovisioning process for a single link instance.
	 * @param link
	 */
	private void deprovisionLinkInstance(Entity link) {
		log.info("Deprovision Link: " + link.getKind());
		exec.executeOperation("DELETE", link, null);
	}

	/**Deprovisioning process for a single storage instance.
	 * @param entity
	 */
	private void deprovisionStorageInstance(Entity entity) {
		log.info("Deprovision Storage: " + entity.getTitle());
		exec.executeOperation("DELETE", entity, null);	
	}

	/**Deprovisions a NetworkInstance.
	 * @param entity
	 */
	private void deprovisionNetworkInstance(Entity entity) {
		log.info("Deprovision Network: " + entity.getTitle());
		exec.executeOperation("DELETE", entity, null);
	}

	/**Deprovisions a ComputeInstance
	 * @param entity
	 */
	private void deprovisionComputeInstance(Entity entity) {
		log.info("Deprovision Compute: " + entity.getTitle());
		exec.executeOperation("DELETE", entity, null);	
	}
	
	/**Deprovisions a ResourceInstance
	 * @param entity
	 */
	private void deprovisionResourceInstance(Entity entity) {
		log.info("Deprovision Resource: " + entity.getTitle());
		exec.executeOperation("DELETE", entity, null);	
	}
}
