package de.ugoe.cs.oco.occi2deployment.execution;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.cmf.occi.core.Action;
import org.eclipse.cmf.occi.core.AttributeState;
import org.eclipse.cmf.occi.core.Entity;
import org.eclipse.cmf.occi.core.Link;
import org.eclipse.cmf.occi.core.Mixin;
import org.eclipse.cmf.occi.core.MixinBase;
import org.eclipse.cmf.occi.core.OcciCoreConstants;

import de.ugoe.cs.oco.occi2deployment.connector.Connection;
import de.ugoe.cs.oco.occi2deployment.connector.Connector;
import de.ugoe.cs.oco.occi2deployment.provisioner.OOIProvisioner;

/**Handles execution of OCCI Model Elements.
 * @author rockodell
 *
 */
public class MartExecutor extends AbsExecutor{
	
	/**Creates an Executor to the OCCI API of the specified connection.
	 * Sets maxTries to 3.
	 * @param conn
	 */
	public MartExecutor(Connector conn) {
		this.connection = conn;
		this.maxTries = 3;
	}
	
	/**Creates Executor to the OCCI API of the specified connection.
	 * maxTries is hereby the maximum amount of retries for a request.
	 * Should be at least 2 to handle connection issues.
	 * @param conn
	 * @param maxTries
	 */
	public MartExecutor(Connector conn, int maxTries){
		this.connection = conn;
		this.maxTries = maxTries;
	}

	@Override
	public String executeOperation(String operation, EObject element, EObject action) {
		Boolean success = false;
		String output = null;
		int count = 0;
		
		while(success == false && count < maxTries){
			if(operation.equals("POST") && action == null){
				output = executePostOperation(element);
			}
			else if(operation.equals("PUT")){
				output = executePutOperation(element);
			}
			else if(operation.equals("GET")){
				output = executeGetOperation(element);
			}
			else if(operation.equals("DELETE")){
				output = executeDeleteOperation(element);
			}
			else if(operation.equals("POST") && action != null){
				output = executeActionOperation(element, action);
			}
			
			if(output != null){
				success = true;
			}
			
			if(success == false){
				count++;
				try{
					log.info(operation + " Failed: " + ((Entity)element).getTitle() +" Rerequest in 5s!");
					Thread.sleep(5000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		return output;
	}

	/**Performs a POST(Action) request on the EObject element with the Action stored in EObject eAction.
	 * @param element
	 * @param eAction
	 * @return
	 */
	private String executeActionOperation(EObject element, EObject eAction) {
		Entity entity = (Entity) element;	
		Action action = (Action) eAction;
		String adaptedAddress = getEntityKindURI(entity);
		adaptedAddress += getActualId(entity, connection.getIdSwapList());
		adaptedAddress += "?action=";
		adaptedAddress += action.getTerm();
		HttpURLConnection conn = establishConnection(adaptedAddress, "POST", true, "text/occi", 
				this.connection.getToken());
		
		conn.setRequestProperty("Category", generateCategoryHeader(action));
		
		log.debug("POST" + " "+ conn.getURL() + " Category: " + conn.getRequestProperty("Category"));
		
		if(connectionSuccessful(conn)){
			String output = getOutput(conn);
		    return output;
		}
		else{
			conn.disconnect();
			return null;
		}
	}
	
	/**Returns generated Category header for the passed action.
	 * @param action
	 * @return
	 */
	private String generateCategoryHeader(Action action) {
		String category = new String();
		category = 	action.getTerm() +"; "+
								"scheme=\"" +action.getScheme() +"\"; "+ 
							"class=\"action\"";
		return category;
	}

	/**Returns output of GET request for the passed Entity EObject extracted.
	 * @param extracted
	 * @return
	 */
	public String executeGetOperation(EObject extracted) {
		Entity entity = (Entity) extracted;
		String adaptedAddress = "http://" + connection.getAdress() + ":" + connection.getPort() + entity.getLocation();
		HttpURLConnection conn = establishConnection(adaptedAddress, null, false, null, this.connection.getToken());	
		conn.setRequestProperty("Accept", "application/json");
		
		log.debug("GET" + " " + adaptedAddress);
		
		return getOutput(conn);
	}
	
	
	/**Issues a cloud session token required for authorization.
	 * @param user
	 * @param password
	 * @param project
	 * @param adress
	 * @return cloud session token
	 */	
	public String createToken(String user, String password, String project, String address){
		return "";
	}

	/**Performs POST request to provision the Resource described by the EObject element.
	 * @param element
	 * @return
	 */
	private String executePostOperation(EObject element) {
		Entity entity = (Entity) element;	
		String adaptedAddress = "http://" + connection.getAdress() + ":" + connection.getPort() + entity.getLocation();
		HttpURLConnection conn = establishConnection(adaptedAddress, "POST", true, "text/occi", 
				this.connection.getToken());
		conn.setRequestProperty("Category", generateCategoryHeader(entity));
		conn.setRequestProperty("X-OCCI-Attribute", generateAttributeHeader(entity));
		conn.setRequestProperty("Accept", "application/json");
		log.debug("POST" + " "+ conn.getURL() + " Category: " + conn.getRequestProperty("Category") + " X-OCCI-Attribute:" + conn.getRequestProperty("X-OCCI-Attribute"));
		
		if(connectionSuccessful(conn)){
			String output = getOutput(conn);
		    conn.disconnect();
		    return output;
		}
		else{
			conn.disconnect();
			return getOutput(conn);
		}
	}
	
	/**Performs DELETE request to deprovision Resource described by the EObject element.
	 * @param element
	 * @return
	 */
	private String executeDeleteOperation(EObject element) {
		Entity entity = (Entity) element;	
		String adaptedAddress = "http://" + connection.getAdress() + ":" + connection.getPort() + entity.getLocation();
		HttpURLConnection conn = establishConnection(adaptedAddress, "DELETE", false, null);
		conn.setRequestProperty("Accept", "application/json");
		log.debug("DELETE" + " "+ conn.getURL());
		if(connectionSuccessful(conn)){
			String output = getOutput(conn);
			conn.disconnect();
			return output;
		}
		else{
			conn.disconnect();
			return null;
		}
	}
	
	/**Generates X-OCCI-Attribute header for the HttpURLConnection.
	 * @param entity containing the Attributes.
	 * @return String containing the X-OCCI-Attribute Header.
	 */
	private String generateAttributeHeader(Entity entity) {
		String attributes = "";
		
		for(AttributeState state: entity.getAttributes()){
			attributes += state.getName()+"=\""+ state.getValue() +"\", ";
		}
		
		if(entity instanceof Link) {
			Link link = (Link) entity;
			attributes += "occi.core.source=\""+ link.getSource().getLocation();
			attributes += "occi.core.target=\""+link.getTarget().getLocation();
		}
		
		for(MixinBase base: entity.getParts()) {
			for(AttributeState baseState: base.getAttributes()) {
				attributes += baseState.getName()+"=\""+ baseState.getValue() +"\", ";
			}
		}
		
		return attributes.substring(0, attributes.lastIndexOf(","));
	}
	
	
	
	/**Generates Category header for the HttpURLConnection.
	 * @param entity containing the Attributes.
	 * @return String containing the Category Header.
	 */
	private String generateCategoryHeader(Entity entity) {
		String category = new String();
		category = 	entity.getKind().getTerm() +"; "+
					"scheme=\"" +entity.getKind().getScheme() +"\"; "+ 
					"class=\"kind\"";

			for(Mixin mixin: entity.getMixins()){
				category += ", " + mixin.getTerm() +"; "+
							"scheme=\"" + mixin.getScheme()+ "\"; "+
							"class=\"mixin\"";
			}
		return category;
	}
	

	/**Executes PUT requested based on the Resource described in the EObject element.
	 * Currently a stub due to missing implementation of OOI.
	 * @param element
	 * @return
	 */
	public String executePutOperation(EObject element) {
		Entity entity = (Entity) element;	
		String adaptedAddress = "http://" + connection.getAdress() + ":" + connection.getPort() + entity.getLocation();
		HttpURLConnection conn = establishConnection(adaptedAddress, "PUT", true, "text/occi", 
				this.connection.getToken());
		conn.setRequestProperty("Category", generateCategoryHeader(entity));
		conn.setRequestProperty("X-OCCI-Attribute", generateAttributeHeader(entity));
		conn.setRequestProperty("Accept", "application/json");
		log.debug("PUT" + " "+ conn.getURL() + " Category: " + conn.getRequestProperty("Category") + " X-OCCI-Attribute:" + conn.getRequestProperty("X-OCCI-Attribute"));
		
		if(connectionSuccessful(conn)){
			String output = getOutput(conn);
		    conn.disconnect();
		    return output;
		}
		else{
			conn.disconnect();
			return getOutput(conn);
		}
	}
}


