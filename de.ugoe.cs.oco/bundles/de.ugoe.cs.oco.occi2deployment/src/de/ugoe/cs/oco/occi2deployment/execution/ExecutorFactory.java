package de.ugoe.cs.oco.occi2deployment.execution;

import de.ugoe.cs.oco.occi2deployment.Connection;

/**Factory class for executor objects.
 * @author rockodell
 *
 */
public class ExecutorFactory {
	/**Returns Executor instance.
	 * @param criteria Accepts: "OCCI","Openstack".
	 * @return
	 */
	public static Executor getExecutor(String criteria, Connection conn){
		if(criteria.equals("OCCI")){
			return new OCCIExecutor(conn);
		}
		if(criteria.equals("Openstack")){
			return new OpenstackExecutor(conn);
		}
		return null;
	}
}
