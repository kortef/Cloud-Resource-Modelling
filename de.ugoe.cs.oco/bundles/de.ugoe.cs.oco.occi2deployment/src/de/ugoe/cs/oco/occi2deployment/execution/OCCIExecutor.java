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

import de.ugoe.cs.oco.occi2deployment.Connection;
import de.ugoe.cs.oco.occi2deployment.provisioner.Provisioner;

/**Handles execution of OCCI Model Elements.
 * @author rockodell
 *
 */
public class OCCIExecutor extends AbsExecutor{
	
	/**Creates an Executor to the OCCI API of the specified connection.
	 * Sets maxTries to 3.
	 * @param conn
	 */
	public OCCIExecutor(Connection conn) {
		this.connection = conn;
		this.maxTries = 3;
	}
	
	/**Creates Executor to the OCCI API of the specified connection.
	 * maxTries is hereby the maximum amount of retries for a request.
	 * Should be at least 2 to handle connection issues.
	 * @param conn
	 * @param maxTries
	 */
	public OCCIExecutor(Connection conn, int maxTries){
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
		String adaptedAddress = getEntityKindURI(entity);
		adaptedAddress += getActualId(entity, connection.getIdSwapList());
		HttpURLConnection conn = establishConnection(adaptedAddress, null, false, null, this.connection.getToken());	
		
		log.debug("GET" + " " + adaptedAddress);
		
		return getOutput(conn);
		/*
		if(connectionSuccessful(conn)){
			String output = getOutput(conn);
			return output;
		}
		else{
			return null;
		}*/
	}
	
	
	/**Issues a cloud session token required for authorization.
	 * @param user
	 * @param password
	 * @param project
	 * @param adress
	 * @return cloud session token
	 */	
	public String createToken(String user, String password, String project, String address){
		HttpURLConnection conn = establishConnection(address, null, true, "application/json", null);
		
		String input = 	"{\"auth\":{\"identity\":{\"methods\":" +
						"[\"password\"],\"password\":{\"user\":" + 
						"{\"name\":\""+user+"\",\"domain\":{\"id\":\"default\"},\"password\":\""+password+"\"}}}," +
						"\"scope\":{\"project\":{\"name\":\""+project+"\",\"domain\":{\"id\":\"default\"}}}}}";
		writeInput(conn, input);
		if(connectionSuccessful(conn)){
			String token = extractToken(conn);
			log.debug("Token Created: " + token);
			return token;
		}
		else{
			try {
				log.info("Token Creation Failed! Rerequest in 5s!");
				Thread.sleep(5000);
				createToken(user, password, project, address);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}	
		}
		return null;
	}

	/**Performs POST request to provision the Resource described by the EObject element.
	 * @param element
	 * @return
	 */
	private String executePostOperation(EObject element) {
		Entity entity = (Entity) element;	
		String adaptedAddress = getEntityKindURI(entity);
		HttpURLConnection conn = establishConnection(adaptedAddress, "POST", true, "text/occi", 
				this.connection.getToken());
		conn.setRequestProperty("Category", generateCategoryHeader(entity));
		conn.setRequestProperty("X-OCCI-Attribute", generateAttributeHeader(entity));
		//conn.setRequestProperty("Accept", "text/occi");
		
		if(entity.getKind().getTerm().contains("compute")){
			conn.setRequestProperty("Link", "</bar>; rel=\"http://schemas.ogf.org/occi/infrastructure#network\"; occi.core.target=\"http://192.168.34.1:8787/occi1.1/network/"+Provisioner.stubId+"\"");
		}
		log.debug("POST" + " "+ conn.getURL() + " Category: " + conn.getRequestProperty("Category") + " X-OCCI-Attribute:" + conn.getRequestProperty("X-OCCI-Attribute"));
		
		if(connectionSuccessful(conn)){
			String output = getOutput(conn);
			String id = extractIdFromOutput(output);
		    String[] swap = {entity.getId(), id};
		    conn.disconnect();
		    connection.idSwapListAdd(swap);
		    connection.serializeIdSwapList();
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
		
		String adaptedAddress = getEntityKindURI(entity);
		adaptedAddress += getActualId(entity, connection.getIdSwapList());
		HttpURLConnection conn = establishConnection(adaptedAddress, "DELETE", false, null, this.connection.getToken());
		log.debug("DELETE" + " "+ conn.getURL());
		if(connectionSuccessful(conn)){
			String output = getOutput(conn);
			this.connection.idSwapListRemove(entity);
			connection.serializeIdSwapList();
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
			String adaptedValue = attributeIdSwap(state);
			attributes += state.getName()+"=\""+ adaptedValue +"\", ";
		}
		
		if(entity.eClass().getName().equals("Link")) {
			Link link = (Link) entity;
			String actualSourceId = getActualId(link.getSource(), this.connection.getIdSwapList());
			attributes += "occi.core.source=\""+this.connection.getAdress()+"/"+ link.getSource().getKind().getTerm()+"/"+ actualSourceId +"\", ";
			
			String actualTargetId = getActualId(link.getTarget(), this.connection.getIdSwapList());
			attributes += "occi.core.target=\""+this.connection.getAdress()+"/"+ link.getTarget().getKind().getTerm()+"/"+ actualTargetId +"\", ";
		}
		
		for(MixinBase base: entity.getParts()) {
			for(AttributeState baseState: base.getAttributes()) {
				String adaptedValue = attributeIdSwap(baseState);
				attributes += baseState.getName()+"=\""+ adaptedValue +"\", ";
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

		//Currently Necessary as OOI doesnt accept the networkinterface mixin
		if(entity.getKind().getTerm().equals("networkinterface") == false){
			for(Mixin mixin: entity.getMixins()){
				category += ", " + mixin.getTerm() +"; "+
							"scheme=\"" + mixin.getScheme()+ "\"; "+
							"class=\"mixin\"";
			}
		}
		return category;
	}
	
	/**Searches the output String for an ID.
	 * @param output
	 * @return
	 */
	private String extractIdFromOutput(String output) {
		logResponseOfRequest(output);
		return output.substring(output.lastIndexOf("/")+1);		
	}
	
	/**Extracts connection conn for token contained in the Header Field X-Subject-Token.
	 * @param conn
	 * @return
	 */
	private String extractToken(HttpURLConnection conn) {
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader((conn.getInputStream())));
			while ((br.readLine()) != null) {
				return conn.getHeaderField("X-Subject-Token");
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	/**Executes PUT requested based on the Resource described in the EObject element.
	 * Currently a stub due to missing implementation of OOI.
	 * @param element
	 * @return
	 */
	public String executePutOperation(EObject element) {
		// TODO Auto-generated catch block
		return "TODO";
	}
}


