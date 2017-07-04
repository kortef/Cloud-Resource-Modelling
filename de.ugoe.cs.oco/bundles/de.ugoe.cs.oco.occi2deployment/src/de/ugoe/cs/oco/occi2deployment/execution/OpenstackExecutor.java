package de.ugoe.cs.oco.occi2deployment.execution;

import java.net.HttpURLConnection;
import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.occiware.clouddesigner.occi.Entity;

import de.ugoe.cs.oco.occi2deployment.Connection;
import de.ugoe.cs.oco.occi2deployment.provisioner.Provisioner;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

/**An executor capable of performing requests to the Openstack API.
 * Required due to incompability of the OOI implementation and network management.
 * @author rockodell
 *
 */
public class OpenstackExecutor extends AbsExecutor {	

	/**Creates an executor for the Openstack API using the information in the passed Connection conn.
	 * @param conn
	 */
	public OpenstackExecutor(Connection conn) {
		this.connection = conn;
		this.maxTries = 5;
	}

	public OpenstackExecutor(Connection conn, int maxTries){
		this.connection = conn;
		this.maxTries = maxTries;
	}
	
	@Override
	public void executeOperation(String operation, EObject element) {
		Boolean success = false;
		int count = 0;
		while(success == false && count < maxTries){
			if(operation.equals("POST")){
				success = executePostOperation(element);
			}
			else if(operation.equals("PUT")){
				success = executePutOperation(element);
			}
			else if(operation.equals("GET")){
				//TODO
			}
			else if(operation.equals("DELETE")){
				success = executeDeleteOperation(element);
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
	}
	
	/**Creates a subnet for the network, whereby the attributes of the subnet
	 * is stored in the element parameter.
	 * @param id of the network the subnet is created for.
	 * @param element
	 */
	private void createSubnet(String id, EObject element) {
		HttpURLConnection conn = establishConnection("http://192.168.34.1:9696/v2.0/subnets",
				"POST", true, "application/json", this.connection.getToken());

		String input =	"{\"subnet\": "
				+ "{\"name\": \"" +((Entity) element).getTitle()+" subnet\","
				+ "\"network_id\": \"" + id
				+"\",\"ip_version\": 4,"
				+ "\"cidr\": \"192.68.0.0/24\","
				+ "\"dns_nameservers\": [\"8.8.8.8\"]}}";
		
		writeInput(conn, input);
		
		if(connectionSuccessful(conn)){
			log.debug("Rest resoibse: " + ((Entity) element).getTitle() + " " + getOutput(conn));
			conn.disconnect();
		}
		else{
			try {
				log.info("Subnet Creation Failed: " + ((Entity) element).getTitle() +"Rerequest in 5s!");
				Thread.sleep(5000);
				createSubnet(id, element);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	@Override
	public void waitForActiveState(EObject extracted) {
		// TODO Auto-generated method stub
		log.info("Not Implemented Yet!");
	}

	@Override
	public String createToken(String user, String password, String project, String authenticationAdress) {
		// TODO Auto-generated method stub
		log.info("Not Implemented Yet!");
		return null;
	}

	public boolean executePostOperation(EObject element) {
		Entity entity = (Entity) element;
		log.info("Execute Request POST: " + entity.getTitle());
		HttpURLConnection conn = establishConnection("http://192.168.34.1:9696/v2.0/networks",
				"POST", true, "application/json", this.connection.getToken());
		
		String input =	"{\"network\": "
				+ "{\"name\": \"" +((Entity) element).getTitle()
				+"\",\"admin_state_up\": true}}";
		writeInput(conn, input);
		
		if(connectionSuccessful(conn)){	
			String id = extractIdFromOutput(getOutput(conn));
			//TO BE IMPROVED
			if(entity.getTitle().equals("stubNetwork")){
				Provisioner.stubId = id;
			}
			//TO BE IMPROVED
		    String[] swap = {entity.getId(), id};
		    connection.getIdSwapList().add(swap);
		    connection.serializeIdSwapList();
			try {
				Thread.sleep(10000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}		
			conn.disconnect();
			createSubnet(id, element);
			return true;
		}
		else{
			return false;
		}
	}

	/**Extracts the Id of the network from the output.
	 * @param output
	 * @return
	 */
	private String extractIdFromOutput(String output) {
		JSONParser parser = new JSONParser();
		try {
			JSONObject json = (JSONObject) parser.parse(output);
			return (String) ((JSONObject) json.get("network")).get("id");
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//return output.substring(output.lastIndexOf("id")+6, output.lastIndexOf("\", \"name"));
		return null;
	}

	public boolean executeDeleteOperation(EObject element) {
		deleteAllPorts(element);
		Entity entity = (Entity) element;
		log.info("Execute Request DELETE: " + entity.getTitle());
		HttpURLConnection conn;
		if(entity.getTitle().equals("stubNetwork")){
			conn = establishConnection("http://192.168.34.1:9696/v2.0/networks/" + Provisioner.stubId,
					"DELETE", false, null, this.connection.getToken());
		}
		else{
			conn = establishConnection("http://192.168.34.1:9696/v2.0/networks/" + getActualId(entity, connection.getIdSwapList()),
				"DELETE", false, null, this.connection.getToken());
		}
		
		if(connectionSuccessful(conn)){
			this.connection.idSwapListRemove(entity);
			this.connection.serializeIdSwapList();
			conn.disconnect();
			return true;
		}
		else{
			return false;
		}
	}

	/**Deletes all ports from the passed element in the cloud in order to allow for a clean deletion
	 * of the network entity. Should be moved to the deprovisioner class as soon as OOI network management
	 * is possible.
	 * @param element
	 */
	private void deleteAllPorts(EObject element) {
		for(String portId: getPorts(element)){
			String networkId = getNwId(portId,0);
			if(networkId != null){
				if(networkId.equals(getActualId((Entity) element, connection.getIdSwapList())) 
						|| networkId.equals(Provisioner.stubId)){
					deletePort(portId);	
				}
			}
		}
	}
	
	private List<String> getPorts(EObject element) {
		HttpURLConnection conn = establishConnection("http://192.168.34.1:9696/v2.0/ports?fields=id",
				"GET", false, null, this.connection.getToken());
		if(connectionSuccessful(conn)){
			List<String> ports = extractPortIdsFromOutput(getOutput(conn));
			conn.disconnect();
			return ports;
		}
		else{
			try {
				log.info("Port GET Failed: " + ((Entity) element).getTitle() +"Rerequest in 5s!");
				Thread.sleep(1000);
				getPorts(element);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return null;
	}
	
	private String getNwId(String portId, int count) {
		HttpURLConnection conn = establishConnection("http://192.168.34.1:9696/v2.0/ports/" + portId
				+ "?fields=network_id", "GET", false, null, this.connection.getToken());
		if(connectionSuccessful(conn)){
			String output = getOutput(conn);
			conn.disconnect();
			return extractNwIdFromOutput(output);	
		}
		else{
			if(count <5){
				try {
					count = count +1;
					log.info("GET NW ID from Port Failed: " +"Rerequest in 5s! Tries left: " + (5-count));
					Thread.sleep(5000);
					getNwId(portId, count);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		return null;
	}
	
	private void deletePort(String portId){
		HttpURLConnection conn = establishConnection("http://192.168.34.1:9696/v2.0/ports/" + portId,
				"DELETE", false, null, this.connection.getToken());
		if(connectionSuccessful(conn)){
			log.info("Delete Port:" + portId);
			conn.disconnect();
		}
		else{
			try {
				log.info("DELETE Port Failed: " +"Rerequest in 5s!");
				Thread.sleep(5000);
				deletePort(portId);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	/**Extracts and returns network ID from the output string. Should be changed so
	 * that the output is treated as json object.
	 * @param output
	 * @return
	 */
	private String extractNwIdFromOutput(String output) {
		return output.substring(output.lastIndexOf("id")+6, output.lastIndexOf("\"}"));
	}
	/*
	JSONParser parser = new JSONParser();
	try {
		JSONObject json = (JSONObject) parser.parse(output);
		return (String) ((JSONObject) json.get("network")).get("id");
	} catch (ParseException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	//return output.substring(output.lastIndexOf("id")+6, output.lastIndexOf("\", \"name"));
	return null;*/

	/**Extracts and returns port IDs from the output string. Should be changed so
	 * that the output is treated as json object.
	 * @param output
	 * @return
	 */
	private List<String> extractPortIdsFromOutput(String output) {
		List<String> ports = new ArrayList<String>();
		while(output.contains("id")){
			ports.add(output.substring(output.indexOf("id")+6, output.indexOf("\"}")));
			output = output.substring(output.indexOf("\"}")+1);
		}
		return ports;
	}

	public boolean executePutOperation(EObject entity) {
		// TODO Auto-generated method stub
		return true;
	}
}

