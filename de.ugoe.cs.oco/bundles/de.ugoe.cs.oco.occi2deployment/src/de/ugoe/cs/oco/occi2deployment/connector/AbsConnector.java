package de.ugoe.cs.oco.occi2deployment.connector;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;
import org.eclipse.cmf.occi.core.Entity;

public abstract class AbsConnector implements Connector{
	static Logger log = Logger.getLogger(Connection.class.getName());
	
	protected String password;
	protected String token;
	protected String project;
	protected String authenticationAdress;
	protected Path sysModelPath;
	protected String publicNetworkId;
	protected volatile List<String[]> idSwapList;
	protected String address;
	protected String user;
	protected int port;
	
	/**
	 * Creates a log for the idSwapList of the Connection.
	 */
	public void logIdSwapList(){
		for(String[] str: this.idSwapList){
			log.debug("Id SwapList: "+str[0]+" : "+str[1]);
		}
	}

	/**
	 * Serializes the IdSwapList of the Connection. Hereby it is stored as file in
	 * the following manner: user+"_"+project+".ser". For example for Connection
	 * with user=jerbel and project=tosca2occi it would be jerbel_tosca2occi.ser.
	 */
	public void serializeIdSwapList() {
		try{
			OutputStream file = new FileOutputStream(user+"_"+project+".ser");
			OutputStream buffer = new BufferedOutputStream(file);
			ObjectOutput output = new ObjectOutputStream(buffer);
			try{
				output.writeObject(idSwapList);
				log.debug("Saved idSwapList in: " + user+"_"+project+".ser");
			}
			finally{
				output.close();
			}
		}  
		catch(IOException ex){
			log.error("Error: idSwapList could not be saved!");
		}	
	}
	
	/**Reads out the IdSwapList in order to retrieve the actual ID of the elements to
	 * perform deprovisioning steps.
	 * @return
	 */
	@SuppressWarnings("unchecked")
	public List<String[]> deserializeIdSwapList(){
		List<String[]> idSwapList = null;
		try{
	      InputStream file = new FileInputStream(user+"_"+project+".ser");
	      InputStream buffer = new BufferedInputStream(file);
	      ObjectInput input = new ObjectInputStream (buffer);
	      try{
	        idSwapList = (List<String[]>)input.readObject();
	      }
	      finally{
	        input.close();
	      }
	    }
	    catch(ClassNotFoundException ex){
	      
	    }
	    catch(IOException ex){
	      
	    }
		return idSwapList;
	}
	
	/**Removes the entity from the IdSwapList of the Connection.
	 * @param entity
	 */
	public void idSwapListRemove(Entity entity) {
		List<String[]> toRemove = new ArrayList<String[]>();
		if(idSwapList != null) {
			for(String[] str: this.idSwapList){
				if(str[0].equals(entity.getId()) || str[1].equals(entity.getId()) ){
					log.debug("KILL: " +  str[0] + " : " + str[1]);
					toRemove.add(str);
				}
			}
		this.idSwapList.removeAll(toRemove);
		}
	}
	
	/**Adds an idSwap to the IdSwapList of the Connection.
	 * @param entity
	 */
	public void idSwapListAdd(String[] swap) {
		List<String[]> toRemove = new ArrayList<String[]>();
		for(String[] str: this.idSwapList){
			if(str[0].equals(swap[0])){
				toRemove.add(str);
			}
		}
		this.idSwapList.removeAll(toRemove);
		this.idSwapList.add(swap);
	}
	
	/**Returns idSwapList.
	 * @return idSwapList
	 */
	public List<String[]> getIdSwapList() {
		return idSwapList;
	}

	/**Sets idSwapList of Connection to the passed idSwapList.
	 * @param idSwapList
	 */
	public void setIdSwapList(List<String[]> idSwapList) {
		this.idSwapList = idSwapList;
	}

	/**Returns path of the model supposed to be running in the cloud.
	 * @return sysModelPath
	 */
	public Path getSysModelPath() {
		return sysModelPath;
	}

	/**Sets path to the model supposed to be running in the cloud.
	 * @param sysModel
	 */
	public void setSysModelPath(Path sysModel) {
		this.sysModelPath = sysModel;
	}

	/**Returns user of the Connection.
	 * @return user
	 */
	public String getUser() {
		return user;
	}

	/**Sets user in the Connection
	 * @param user
	 */
	public void setUser(String user) {
		this.user = user;
	}

	/**Returns generated Session Token.
	 * @return token
	 */
	public String getToken() {
		return token;
	}

	/**Sets Token for the Session to be used.
	 * @param token
	 */
	public void setToken(String token) {
		this.token = token;
	}

	/**Returns Project/Tenant of the Connection.
	 * @return project
	 */
	public String getProject() {
		return project;
	}

	/**Sets Project/Tenant to orchestrate.
	 * @param project
	 */
	public void setProject(String project) {
		this.project = project;
	}

	/**Returns access point of the cloud.
	 * @return adress
	 */
	public String getAdress() {
		return address;
	}

	/**Sets address/access point of the cloud.
	 * @param adress
	 */
	public void setAdress(String adress) {
		this.address = adress;
	}

	/**Returns authentication server address of the cloud.
	 * @return authenticationAdress
	 */
	public String getAuthenticationAdress() {
		return authenticationAdress;
	}

	/**Sets address to the authentication server of the cloud.
	 * @param authenticationAdress
	 */
	public void setAuthenticationAdress(String authenticationAdress) {
		this.authenticationAdress = authenticationAdress;
	}

	/**Get stored password for the connection.
	 * @return password
	 */
	public String getPassword() {
		return password;
	}

	/**Sets password for the connection.
	 * @param password
	 */
	public void setPassword(String password) {
		this.password = password;
	}
	
	public String getPublicNetworkId() {
		return publicNetworkId;
	}

	public void setPublicNetworkId(String publicNetworkId) {
		this.publicNetworkId = publicNetworkId;
	}
	
	public int getPort() {
		return port;
	}
}
