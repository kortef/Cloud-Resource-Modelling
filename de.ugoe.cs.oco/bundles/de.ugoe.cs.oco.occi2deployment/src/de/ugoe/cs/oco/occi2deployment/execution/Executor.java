package de.ugoe.cs.oco.occi2deployment.execution;

import org.apache.log4j.Logger;
import org.eclipse.emf.ecore.EObject;

/**Interface for the communication to the cloud provider.
 * @author rockodell
 *
 */
public interface Executor {
	static Logger log = Logger.getLogger(Executor.class.getName());
	
	/**Handles the concrete execution to provision a cloud resource as specified in an EMF Object.
	 * @param element containing the element to be provisioned.
	 */
	public String executeOperation(String operation, EObject element, EObject action);

	/**Returns session token as string for the given parameters.
	 * @param user
	 * @param password
	 * @param project
	 * @param authenticationAdress
	 * @return
	 */
	public String createToken(String user, String password, String project, String authenticationAdress);
}
