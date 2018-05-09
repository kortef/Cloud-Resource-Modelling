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
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.apache.log4j.Logger;
import org.eclipse.cmf.occi.core.Entity;


import de.ugoe.cs.oco.occi2deployment.execution.ExecutorFactory;
import de.ugoe.cs.oco.occi2deployment.provisioner.OOIProvisioner;
/**
 * @author rockodell
 *An entity class that stores information about a specifc user and its connection to the cloud server.
 *In addition the user information a Connection stores the model expected to run on the cloud (sysModel) and the
 *IdSwapList to translate the ids of it to the ones actually running on the cloud (runtime Model).
 */
public class Connection extends AbsConnector {
	
	
	/**Connection constructor.
	 * @param user Username
	 * @param password Password
	 * @param project Project the user wants to operate on
	 * @param adress Address of the OCCI Cloud API
	 * @param authenticationAdress Address of the cloud's authentication node
	 */
	public Connection(String user, String password, String project, String adress, String authenticationAdress, String publicNetworkId){
		this.user=user;
		this.password=password;
		this.address = adress;
		this.project=project;
		this.authenticationAdress=authenticationAdress;
		this.token = ExecutorFactory.getExecutor("OCCI", this).createToken(user, password, project, authenticationAdress);
		this.idSwapList = deserializeIdSwapList();
		if(this.idSwapList == null){
			idSwapList = Collections.synchronizedList(new ArrayList<String[]>());
		}
		this.sysModelPath = Paths.get("./src/de/ugoe/cs/oco/occi2deployment/tests/models/"+this.user+"_"+this.project+".occie");
		this.publicNetworkId = publicNetworkId;
		log.info("Connection created: "+ this.user +"_"+this.project);
		this.logIdSwapList();
	}
	
	
}
