package de.ugoe.cs.oco.occi2deployment.tests;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Level;
import org.apache.log4j.Logger;

import de.ugoe.cs.oco.occi2deployment.OOIDeployer;
import de.ugoe.cs.oco.occi2deployment.adapter.ElementAdapter;
import de.ugoe.cs.oco.occi2deployment.comparator.Comparator;
import de.ugoe.cs.oco.occi2deployment.connector.Connection;
import de.ugoe.cs.oco.occi2deployment.deprovisioner.Deprovisioner;
import de.ugoe.cs.oco.occi2deployment.execution.Executor;
import de.ugoe.cs.oco.occi2deployment.extraction.Extractor;
import de.ugoe.cs.oco.occi2deployment.provisioner.OOIProvisioner;

public class MongoDBDeployerTest {
	
	public static void main(String[] args){
		BasicConfigurator.configure();
		Logger.getLogger(Executor.class.getName()).setLevel(Level.DEBUG);
		Logger.getLogger(Extractor.class.getName()).setLevel(Level.DEBUG);
		Logger.getLogger(OOIProvisioner.class.getName()).setLevel(Level.DEBUG);
		Logger.getLogger(Comparator.class.getName()).setLevel(Level.INFO);
		Logger.getLogger(Deprovisioner.class.getName()).setLevel(Level.INFO);
		Logger.getLogger(OOIDeployer.class.getName()).setLevel(Level.DEBUG);
		Logger.getLogger(Connection.class.getName()).setLevel(Level.DEBUG);
		Logger.getLogger(ElementAdapter.class.getName()).setLevel(Level.INFO);
		Logger.getRootLogger().setLevel(Level.FATAL);
		
		
		List<Path> extensions = new ArrayList<Path>();
		extensions.add(Paths.get("/home/erbel/git/MoDMaCAO/plugins/org.modmacao.occi.platform/model/platform.occie"));
		extensions.add(Paths.get("/home/erbel/git/MoDMaCAO/plugins/org.modmacao.mongodb/model/mongodb.occie"));
		extensions.add(Paths.get("/home/erbel/git/MoDMaCAO/plugins/org.modmacao.placement/model/placement.occie"));
		extensions.add(Paths.get("./src/de/ugoe/cs/oco/occi2deployment/tests/models/mls/openstackinstance.occie"));
		extensions.add(Paths.get("./src/de/ugoe/cs/oco/occi2deployment/tests/models/mls/openstacknetwork.occie"));
		extensions.add(Paths.get("./src/de/ugoe/cs/oco/occi2deployment/tests/models/mls/openstacktemplate.occie"));
		//extensions.add(Paths.get("./src/de/ugoe/cs/oco/occi2deployment/tests/models/mls/extendedinfrastructure.occie"));
		
		Path occiPath = Paths.get("/home/erbel/git/MoDMaCAO/plugins/org.modmacao.mongodb.example/MongoDB-Cluster.occic");
		//Connection conn = new Connection("jerbel", "UV2.7F62", "tosca2occi", "http://192.168.34.1:8787/occi1.1", "http://192.168.34.1:35357/v3/auth/tokens");
		
		
		OOIDeployer deployer = new OOIDeployer();
		Connection conn = new Connection("jerbel", "UV2.7F62", "tosca2occi", "http://192.168.34.1:8787/occi1.1", "http://192.168.34.1:35357/v3/auth/tokens","9b24a620-bee8-4526-bcc9-bbfde769a152");
		deployer.deploy(occiPath, extensions, conn);
		
	}
}