package de.ugoe.cs.oco.occi2deployment.tests;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Level;
import org.apache.log4j.Logger;

import de.ugoe.cs.oco.occi2deployment.Connection;
import de.ugoe.cs.oco.occi2deployment.Deployer;
import de.ugoe.cs.oco.occi2deployment.adapter.ElementAdapter;
import de.ugoe.cs.oco.occi2deployment.comparator.Comparator;
import de.ugoe.cs.oco.occi2deployment.deprovisioner.Deprovisioner;
import de.ugoe.cs.oco.occi2deployment.execution.Executor;
import de.ugoe.cs.oco.occi2deployment.extraction.Extractor;
import de.ugoe.cs.oco.occi2deployment.provisioner.Provisioner;

public class DeployerTest {
	
	public static void main(String[] args){
		BasicConfigurator.configure();
		Logger.getLogger(Executor.class.getName()).setLevel(Level.DEBUG);
		Logger.getLogger(Extractor.class.getName()).setLevel(Level.DEBUG);
		Logger.getLogger(Provisioner.class.getName()).setLevel(Level.DEBUG);
		Logger.getLogger(Comparator.class.getName()).setLevel(Level.INFO);
		Logger.getLogger(Deprovisioner.class.getName()).setLevel(Level.INFO);
		Logger.getLogger(Deployer.class.getName()).setLevel(Level.DEBUG);
		Logger.getLogger(Connection.class.getName()).setLevel(Level.DEBUG);
		Logger.getLogger(ElementAdapter.class.getName()).setLevel(Level.INFO);
		Logger.getRootLogger().setLevel(Level.FATAL);
		
		
		List<Path> extensions = new ArrayList<Path>();
		extensions.add(Paths.get("./src/de/ugoe/cs/oco/occi2deployment/tests/models/platform.occie"));
		extensions.add(Paths.get("./src/de/ugoe/cs/oco/occi2deployment/tests/models/lamp.occie"));
		extensions.add(Paths.get("./src/de/ugoe/cs/oco/occi2deployment/tests/models/placement.occie"));
		extensions.add(Paths.get("./src/de/ugoe/cs/oco/occi2deployment/tests/models/private.occie"));
		
		Path occiPath = Paths.get("./src/de/ugoe/cs/oco/occi2deployment/tests/models/LAMP-clusterWithOwn.occic");
		occiPath = Paths.get("./src/de/ugoe/cs/oco/occi2deployment/tests/models/test2.occie");
		//Connection conn = new Connection("jerbel", "UV2.7F62", "tosca2occi", "http://192.168.34.1:8787/occi1.1", "http://192.168.34.1:35357/v3/auth/tokens");
		
		
		Deployer deployer = new Deployer();
		//deployer.deploy(occiPath, extensions, conn);
		Connection conn = new Connection("jerbel", "UV2.7F62", "tosca2occi", "http://192.168.35.22", "http://192.168.34.1:35357/v3/auth/tokens");
		deployer.initialDeploy(conn, occiPath, extensions);
		
	}
}
