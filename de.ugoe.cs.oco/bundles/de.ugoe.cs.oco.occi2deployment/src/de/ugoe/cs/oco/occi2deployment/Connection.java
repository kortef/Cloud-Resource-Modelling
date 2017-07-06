package de.ugoe.cs.oco.occi2deployment;


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
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.apache.log4j.Logger;
import org.occiware.clouddesigner.occi.Entity;

import de.ugoe.cs.oco.occi2deployment.execution.ExecutorFactory;
/**
 * @author rockodell
 *An entity class that stores information about a specifc user and its connection to the cloud server.
 *In addition the user information a Connection stores the model expected to run on the cloud (sysModel) and the
 *IdSwapList to translate the ids of it to the ones actually running on the cloud (runtime Model).
 */
public class Connection {
	static Logger log = Logger.getLogger(Connection.class.getName());
	
	private String user;
	private String password;
	private String token;
	private String project;
	private String adress;
	private String authenticationAdress;
	private Path sysModelPath;
	private volatile List<String[]> idSwapList;
	
	/**Connection constructor.
	 * @param user Username
	 * @param password Password
	 * @param project Project the user wants to operate on
	 * @param adress Address of the OCCI Cloud API
	 * @param authenticationAdress Address of the cloud's authentication node
	 */
	public Connection(String user, String password, String project, String adress, String authenticationAdress){
		this.user=user;
		this.password=password;
		this.adress=adress;
		this.project=project;
		this.authenticationAdress=authenticationAdress;
		this.token = ExecutorFactory.getExecutor("OCCI", this).createToken(user, password, project, authenticationAdress);
		this.idSwapList = deserializeIdSwapList();
		if(this.idSwapList == null){
			idSwapList = Collections.synchronizedList(new ArrayList<String[]>());
		}
		this.sysModelPath = Paths.get("./src/de/ugoe/cs/oco/occi2deployment/tests/models/"+this.user+"_"+this.project+".occie");
		
		log.info("Connection created: "+ this.user +"_"+this.project);
		this.logIdSwapList();
	}
	
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
		for(String[] str: this.idSwapList){
			if(str[0].equals(entity.getId())){
				toRemove.add(str);
			}
		}
		this.idSwapList.removeAll(toRemove);
	}
	
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
	
	public List<String[]> getIdSwapList() {
		return idSwapList;
	}

	public void setIdSwapList(List<String[]> idSwapList) {
		this.idSwapList = idSwapList;
	}

	public Path getSysModelPath() {
		return sysModelPath;
	}

	public void setSysModelPath(Path sysModel) {
		this.sysModelPath = sysModel;
	}

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

	public String getProject() {
		return project;
	}

	public void setProject(String project) {
		this.project = project;
	}

	public String getAdress() {
		return adress;
	}

	public void setAdress(String adress) {
		this.adress = adress;
	}

	public String getAuthenticationAdress() {
		return authenticationAdress;
	}

	public void setAuthenticationAdress(String authenticationAdress) {
		this.authenticationAdress = authenticationAdress;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
}
