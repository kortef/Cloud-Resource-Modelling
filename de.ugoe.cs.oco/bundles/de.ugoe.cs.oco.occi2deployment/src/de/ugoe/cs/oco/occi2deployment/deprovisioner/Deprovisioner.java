package de.ugoe.cs.oco.occi2deployment.deprovisioner;

import org.apache.log4j.Logger;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.occiware.clouddesigner.occi.Entity;

import de.ugoe.cs.oco.occi2deployment.Connection;
import de.ugoe.cs.oco.occi2deployment.execution.Executor;
import de.ugoe.cs.oco.occi2deployment.execution.ExecutorFactory;

/**Handles the deprovisioning process.
 * @author rockodell
 *
 */
public class Deprovisioner {
	static Logger log = Logger.getLogger(Deprovisioner.class.getName());
	private Connection connection;
	
	/**Creates a deprovisioner instance for the specified Connection conn.
	 * @param conn
	 */
	public Deprovisioner(Connection conn){
		this.connection = conn;
	}
	
	
	/**Deprovisions every element on the cloud infrastructure that is defined as EObject
	 * in the passed eList.
	 * @param eList
	 */
	public void deprovision(EList<EObject> eList){
		EList<Entity> networks = new BasicEList<Entity>();
		EList<Entity> storages = new BasicEList<Entity>();
		EList<Entity> computes = new BasicEList<Entity>();
		EList<Entity> links = new BasicEList<Entity>();
		//First Deprovision Compute and Storage Instances
		for(EObject element: eList){
			if(element.eClass().getName().equals("Resource")){
				Entity entity = (Entity) element;
				if(entity.getKind().getTerm().equals("compute")){
					computes.add(entity);
				}
				else if(entity.getKind().getTerm().equals("network")){	
					networks.add(entity);
				}
				else if(entity.getKind().getTerm().equals("storage")){
					storages.add(entity);
							
				}
			}
			else if(element.eClass().getName().equals("Link")){
				Entity entity = (Entity) element;
				links.add(entity);
			}
		}
		
		for(Entity link: links){
			deprovisionLinkInstance(link);
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
	}

	/**Deprovisioning process for a single link instance.
	 * @param link
	 */
	private void deprovisionLinkInstance(Entity link) {
		log.info("Deprovision Link: " + link.getKind());
		Executor executor = ExecutorFactory.getExecutor("OCCI", this.connection);
		executor.executeDeleteOperation(link);
	}

	/**Deprovisioning process for a single storage instance.
	 * @param entity
	 */
	private void deprovisionStorageInstance(Entity entity) {
		log.info("Deprovision Storage: " + entity.getTitle());
		Executor executor = ExecutorFactory.getExecutor("OCCI", this.connection);
		executor.executeDeleteOperation(entity);	
	}

	/**Deprovisions a NetworkInstance.
	 * @param entity
	 */
	private void deprovisionNetworkInstance(Entity entity) {
		log.info("Deprovision Network: " + entity.getTitle());
		Executor executor = ExecutorFactory.getExecutor("Openstack", this.connection);
		executor.executeDeleteOperation(entity);
	}

	/**Deprovisions a ComputeInstance
	 * @param entity
	 */
	private void deprovisionComputeInstance(Entity entity) {
		log.info("Deprovision Compute: " + entity.getTitle());
		Executor executor = ExecutorFactory.getExecutor("OCCI", this.connection);
		executor.executeDeleteOperation(entity);	
	}
}
