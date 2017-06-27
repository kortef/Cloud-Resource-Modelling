package de.ugoe.cs.oco.occi2deployment.execution;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.occiware.clouddesigner.occi.AttributeState;
import org.occiware.clouddesigner.occi.Entity;

import de.ugoe.cs.oco.occi2deployment.Connection;

/**Contains multiple methods required by every Executor
 * @author rockodell
 *
 */
public abstract class AbsExecutor implements Executor {
	protected Connection connection;
	
	/**Establish a HttpURLConnection to the given address using the given REST method, output, contentType and
	 * authToken.
	 * @param address
	 * @param method
	 * @param output
	 * @param contentType
	 * @param authToken
	 * @return HttpURLConnection for further adjustment
	 */
	protected HttpURLConnection establishConnection(String address, String method, Boolean output, String contentType, String authToken){
		try {
			URL url = new URL(address);
			HttpURLConnection conn = (HttpURLConnection) url.openConnection();
			conn.setDoOutput(output);
			if(method != null){
				conn.setRequestMethod(method);
			}
			if(contentType != null){
				conn.setRequestProperty("Content-Type", contentType);
			}
			if(authToken != null){
				conn.setRequestProperty("X-Auth-token", authToken);
			}
			if(method == null) {
				log.debug("Rest request: " + "GET" + " "+ address);
			}
			else{
				log.debug("Rest request: " + method + " "+ address);
			}
			return conn;
			
		} catch (MalformedURLException e) {
			log.error("Malformed URL: " + address);
		}catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
		return null;
	}
	
	
	/**Checks whether the connection is successful. Otherwise the HTTPResponse code is logged.
	 * @param conn
	 * @return
	 */
	protected boolean connectionSuccessful(HttpURLConnection conn) {
		try {
			if (conn.getResponseCode() != HttpURLConnection.HTTP_CREATED &&
					conn.getResponseCode() != HttpURLConnection.HTTP_OK &&
					conn.getResponseCode() != HttpURLConnection.HTTP_NO_CONTENT) {
					log.error("Failed: "+ conn.getURL() + " HTTP error code: "+ conn.getResponseCode());
					//log.error("Failed: "+ conn.getURL() + " HTTP error code: "+ conn.getResponseCode() + " " +conn.getRequestProperties());
					conn.disconnect();
					return false;
			}
		} catch (IOException e) {
			conn.disconnect();
			e.printStackTrace();
		}
		return true;
	}
	
	/**Writes the String input as input into the HttpUrlConnection conn.
	 * @param conn
	 * @param input
	 */
	protected void writeInput(HttpURLConnection conn, String input) {
		try {
			OutputStream os;
			os = conn.getOutputStream();	
			os.write(input.getBytes());
			os.flush();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**Returns the output from the connection as concatenated String.
	 * On fault a null is returned.
	 * @param conn
	 * @return
	 */
	protected String getOutput(HttpURLConnection conn) {
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader((conn.getInputStream())));
			String outputLine;
			String output = new String();
			while ((outputLine = br.readLine()) != null) {
				output += outputLine;
			}
			return output;
		} catch (IOException e) {
			return null;
		}		
	}

	/**Replaces the deprecated ID of the elements in the model
	 * with the actual created cloud resource id.
	 * @param state of an OCCI Attribute.
	 * @return adjusted Attribute value.
	 */
	protected String attributeIdSwap(AttributeState state) {
		String id =state.getValue().toString().substring(state.getValue().toString().lastIndexOf("/")+1);
			for (String[] swapID : connection.getIdSwapList()) {	    	
					if(id.equals(swapID[0])){
						String adaptedValue = state.getValue().replace(id, swapID[1]);
						return adaptedValue;
					}
			}
		return state.getValue();
	}
	
	/**Adapts address, so that the address contains the path of OCCI element to be created.
	 * E.g. Adds compute/storage or network to the path.
	 * @param entity to be provisioned.
	 * @return adapted address.
	 */
	protected String getEntityKindURI(Entity entity) {
		//String address = Deployer.adress;
		String address = this.connection.getAdress();
		if(entity.getKind().getTerm().equals("networkinterface")){
			address += "/networklink/";
		}
		else{
			address += "/" + entity.getKind().getTerm()+"/";
		}
		return address;
	}
	
	/**Searches actual Id of entity in the IdSwapList.
	 * @param entity
	 * @return
	 */
	public String getActualId(Entity entity, List<String[]> idSwapList) {
		for (String[] swapID : idSwapList) {	    	
				if(entity.getId().equals(swapID[0])){
					return swapID[1];
				}
		}
		return entity.getId();
	}
	
	/**Logs the respones of a request stored in the passed String output.
	 * @param output
	 */
	protected void logResponseOfRequest(String output) {
		log.debug("Rest response: "  +output);	
	}


	public Connection getConn() {
		return connection;
	}

	public void setConn(Connection conn) {
		this.connection = conn;
	}
}
