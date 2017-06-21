package de.ugoe.cs.oco.occi2deployment.execution;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;

import org.eclipse.emf.ecore.EObject;
import org.occiware.clouddesigner.occi.AttributeState;
import org.occiware.clouddesigner.occi.Entity;
import org.occiware.clouddesigner.occi.Mixin;
import org.occiware.clouddesigner.occi.Resource;

import de.ugoe.cs.oco.occi2deployment.Connection;
import de.ugoe.cs.oco.occi2deployment.Deployer;
import de.ugoe.cs.oco.occi2deployment.provisioner.Provisioner;

/**Handles execution of OCCI Model Elements.
 * @author rockodell
 *
 */
public class OCCIExecutor extends AbsExecutor{		
	public OCCIExecutor(Connection conn) {
		this.connection = conn;
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
			conn.disconnect();
			return token;
		}
		return null;
	}


	@Override
	public void executePostOperation(EObject element) {
		Entity entity = (Entity) element;	

		String adaptedAddress = getEntityKindURI(entity);
		HttpURLConnection conn = establishConnection(adaptedAddress, "POST", true, "text/occi", 
				this.connection.getToken());
		conn.setRequestProperty("Category", generateCategoryHeader(entity));
		conn.setRequestProperty("X-OCCI-Attribute", generateAttributeHeader(entity));
		
		if(entity.getKind().getTerm().contains("compute")){
			conn.setRequestProperty("Link", "</bar>; rel=\"http://schemas.ogf.org/occi/infrastructure#network\"; occi.core.target=\"http://192.168.34.1:8787/occi1.1/network/"+Provisioner.stubId+"\"");
		}
		if(connectionSuccessful(conn)){
			String id = extractIdFromOutput(getOutput(conn));
		    String[] swap = {entity.getId(), id};
		    if(entity.getTitle() == null){
		    	log.debug("ID Swap: "+entity.getKind().getTerm() + " Model ID: " + entity.getId() + " Actual ID: " + id);
		    }
		    else{
		    	log.debug("ID Swap: "+entity.getTitle()+ " Model ID: " + entity.getId() + " Actual ID: " + id);
		    }
		    connection.getIdSwapList().add(swap);
		}
		conn.disconnect();
	}
	
	@Override
	public void executeDeleteOperation(EObject element) {
		Entity entity = (Entity) element;	
		
		String adaptedAddress = getEntityKindURI(entity);
		adaptedAddress += getActualId(entity, connection.getIdSwapList());
		HttpURLConnection conn = establishConnection(adaptedAddress, "DELETE", false, null, this.connection.getToken());
		
		if(connectionSuccessful(conn)){
			this.connection.idSwapListRemove(entity);
		}
		conn.disconnect();
	}
	
	@Override
	public void waitForActiveState(EObject extracted) {
		if(extracted.eClass().getName().equals("Resource")){
			Entity entity = (Entity) extracted;
			
			String adaptedAddress = getEntityKindURI(entity);
			if(adaptedAddress.contains("network")){
				log.info("ACTIVE: " + ((Entity)extracted).getTitle());
				return;
			}
			adaptedAddress += getActualId(((Entity) extracted), connection.getIdSwapList());
			
			HttpURLConnection conn = establishConnection(adaptedAddress, null, false, null, this.connection.getToken());	
			
			if(connectionSuccessful(conn)){
				String output = getOutput(conn);
				
				if(outputShowsActiveState(output)){
					conn.disconnect();
					log.info("ACTIVE: " + ((Entity)extracted).getTitle());
				}	
				else{
					try {
						log.debug("INACTIVE: " + ((Entity)extracted).getTitle());
						conn.disconnect();
						Thread.sleep(5000);
						waitForActiveState(extracted);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}	
				}
			}
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
	

	/**Checks whether the output string contains an active or online.
	 * @param output
	 * @return
	 */
	private boolean outputShowsActiveState(String output) {
		if(output.contains("occi.network.state=\"active\"")
				|| output.contains("occi.compute.state=\"active\"")
				|| output.contains("occi.storage.state=\"online\"")){
			return true;
		}
		return false;
	}


	@Override
	public void executePutOperation(EObject element) {

	}
}


