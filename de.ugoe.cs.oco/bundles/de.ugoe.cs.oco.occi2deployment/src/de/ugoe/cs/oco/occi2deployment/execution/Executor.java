package de.ugoe.cs.oco.occi2deployment.execution;

import org.apache.log4j.Logger;
import org.eclipse.emf.ecore.EObject;
import org.occiware.clouddesigner.occi.Entity;
import org.occiware.clouddesigner.occi.Resource;

import de.ugoe.cs.oco.occi2deployment.Connection;

/**Interface for the communication to the cloud provider.
 * @author rockodell
 *
 */
public interface Executor {
	static Logger log = Logger.getLogger(Executor.class.getName());
	/**Handles the concrete execution to provision a cloud resource as specified in an EMF Object.
	 * @param element containing the element to be provisioned.
	 */
	public void executePostOperation(EObject element);
	
	public void executeDeleteOperation(EObject element);

	public void waitForActiveState(EObject extracted);

	public String createToken(String user, String password, String project, String authenticationAdress);

	public void executePutOperation(EObject entity);
}
