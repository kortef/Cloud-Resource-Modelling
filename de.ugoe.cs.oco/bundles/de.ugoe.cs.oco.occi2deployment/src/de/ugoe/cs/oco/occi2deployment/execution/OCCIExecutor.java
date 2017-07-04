package de.ugoe.cs.oco.occi2deployment.execution;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;

import org.eclipse.emf.ecore.EObject;
import org.occiware.clouddesigner.occi.AttributeState;
import org.occiware.clouddesigner.occi.Entity;
import org.occiware.clouddesigner.occi.Mixin;

import de.ugoe.cs.oco.occi2deployment.Connection;
import de.ugoe.cs.oco.occi2deployment.provisioner.Provisioner;

/**Handles execution of OCCI Model Elements.
 * @author rockodell
 *
 */
public class OCCIExecutor extends AbsExecutor{
	
	/**Creates an Executor to the OCCI API of the specified connection.
	 * @param conn
	 */
	public OCCIExecutor(Connection conn) {
		this.connection = conn;
		this.maxTries = 5;
	}
	
	public OCCIExecutor(Connection conn, int maxTries){
		this.connection = conn;
		this.maxTries = maxTries;
	}

	@Override
	public String executeOperation(String operation, EObject element) {
		Boolean success = false;
		String output = null;
		int count = 0;
		
		while(success == false && count < maxTries){
			if(operation.equals("POST")){
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
			
			if(output != null){
				success = true;
			}
			
			if(success == false){
				try{
					log.info(operation + "Failed: " + ((Entity)element).getTitle() +"Rerequest in 5s!");
					Thread.sleep(5000);
					executePostOperation(element);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			count++;
			}
		}
		return output;
	}

	public String executeGetOperation(EObject extracted) {
		Entity entity = (Entity) extracted;
		String adaptedAddress = getEntityKindURI(entity);
		adaptedAddress += getActualId(((Entity) extracted), connection.getIdSwapList());
		HttpURLConnection conn = establishConnection(adaptedAddress, null, false, null, this.connection.getToken());	
			
		if(connectionSuccessful(conn)){
			String output = getOutput(conn);
			return output;
		}
		else{
			return null;
		}
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

	private String executePostOperation(EObject element) {
		Entity entity = (Entity) element;	
		String adaptedAddress = getEntityKindURI(entity);
		HttpURLConnection conn = establishConnection(adaptedAddress, "POST", true, "text/occi", 
				this.connection.getToken());
		conn.setRequestProperty("Category", generateCategoryHeader(entity));
		conn.setRequestProperty("X-OCCI-Attribute", generateAttributeHeader(entity));
		
		if(entity.getKind().getTerm().contains("compute")){
			conn.setRequestProperty("Link", "</bar>; rel=\"http://schemas.ogf.org/occi/infrastructure#network\"; occi.core.target=\"http://192.168.34.1:8787/occi1.1/network/"+Provisioner.stubId+"\"");
		}
		log.debug("POST" + " "+ conn.getURL() + " " + conn.getRequestProperty("Category") + " " + conn.getRequestProperty("X-OCCI-Attribute"));
		
		if(connectionSuccessful(conn)){
			String output = getOutput(conn);
			String id = extractIdFromOutput(output);
		    String[] swap = {entity.getId(), id};
		    conn.disconnect();
		    connection.getIdSwapList().add(swap);
		    connection.serializeIdSwapList();
		    return output;
		}
		else{
			conn.disconnect();
			return null;
		}
	}
	
	private String executeDeleteOperation(EObject element) {
		Entity entity = (Entity) element;	
		
		String adaptedAddress = getEntityKindURI(entity);
		adaptedAddress += getActualId(entity, connection.getIdSwapList());
		HttpURLConnection conn = establishConnection(adaptedAddress, "DELETE", false, null, this.connection.getToken());
		log.debug("DELETE" + " "+ conn.getURL() + entity.getId());
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
		return attributes.substring(0, attributes.lastIndexOf(","));
	}
	
	
	/**Generates Category header for the HttpURLConnection.
	 * @param entity containing the Attributes.
	 * @return String containing the Category Header.
	 */
	private String generateCategoryHeader(Entity entity) {
		String category = new String();
		if(entity.getKind().getTerm().contains("network") && entity.getClass().equals("Link")){
			category = 	"networklink" +"; "+
					"scheme=\"" +entity.getKind().getScheme() +"\"; "+ 
					"class=\"kind\"";
		}
		else{
			category = 	entity.getKind().getTerm() +"; "+
								"scheme=\"" +entity.getKind().getScheme() +"\"; "+ 
								"class=\"kind\"";
		}
		
		for(Mixin mixin: entity.getMixins()){
			category += ", " + mixin.getTerm() +"; "+
						"scheme=\"" + mixin.getScheme()+ "\"; "+
						"class=\"mixin\"";
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

	public String executePutOperation(EObject element) {
		// TODO Auto-generated catch block
		return "TODO";
	}
}


