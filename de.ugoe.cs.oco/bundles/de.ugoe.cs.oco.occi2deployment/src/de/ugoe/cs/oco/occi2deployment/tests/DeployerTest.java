package de.ugoe.cs.oco.occi2deployment.tests;

import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

import de.ugoe.cs.oco.occi.extractor.OCCIModelExtractor;
import de.ugoe.cs.oco.occi2deployment.OOIDeployer;
import de.ugoe.cs.oco.occi2deployment.adapter.ElementAdapter;
import de.ugoe.cs.oco.occi2deployment.comparator.Comparator;
import de.ugoe.cs.oco.occi2deployment.connector.Connection;
import de.ugoe.cs.oco.occi2deployment.deprovisioner.Deprovisioner;
import de.ugoe.cs.oco.occi2deployment.execution.Executor;
import de.ugoe.cs.oco.occi2deployment.extraction.Extractor;
import de.ugoe.cs.oco.occi2deployment.provisioner.OOIProvisioner;

public class DeployerTest {
	
	public static void main(String[] args){
		File log4jfile = new File("./src/de/ugoe/cs/oco/occi2deployment/log4j.properties");
		PropertyConfigurator.configure(log4jfile.getAbsolutePath());
		Logger.getLogger(Executor.class.getName()).setLevel(Level.DEBUG);
		Logger.getLogger(Extractor.class.getName()).setLevel(Level.DEBUG);
		Logger.getLogger(OOIProvisioner.class.getName()).setLevel(Level.DEBUG);
		Logger.getLogger(Comparator.class.getName()).setLevel(Level.INFO);
		Logger.getLogger(Deprovisioner.class.getName()).setLevel(Level.INFO);
		Logger.getLogger(OOIDeployer.class.getName()).setLevel(Level.DEBUG);
		Logger.getLogger(Connection.class.getName()).setLevel(Level.DEBUG);
		Logger.getLogger(ElementAdapter.class.getName()).setLevel(Level.INFO);
		Logger.getLogger(OCCIModelExtractor.class.getName()).setLevel(Level.INFO);
		Logger.getRootLogger().setLevel(Level.FATAL);
		
		
		List<Path> extensions = new ArrayList<Path>();
		extensions.add(Paths.get("/home/erbel/git/MoDMaCAO/plugins/org.modmacao.occi.platform/model/platform.occie"));
		extensions.add(Paths.get("/home/erbel/git/MoDMaCAO/plugins/org.modmacao.mongodb/model/mongodb.occie"));
		extensions.add(Paths.get("/home/erbel/git/MoDMaCAO/plugins/org.modmacao.placement/model/placement.occie"));
		extensions.add(Paths.get("./src/de/ugoe/cs/oco/occi2deployment/tests/models/mls/openstackinstance.occie"));
		extensions.add(Paths.get("./src/de/ugoe/cs/oco/occi2deployment/tests/models/mls/openstacknetwork.occie"));
		extensions.add(Paths.get("./src/de/ugoe/cs/oco/occi2deployment/tests/models/mls/openstacktemplate.occie"));
		
		//Path occiPath = Paths.get("./src/de/ugoe/cs/oco/occi2deployment/tests/models/mls/MLS.occic");
		Path occiPath = Paths.get("./src/de/ugoe/cs/oco/occi2deployment/tests/models/mls/MLS.occic");
		//Connection conn = new Connection("jerbel", "UV2.7F62", "tosca2occi", "http://192.168.34.1:8787/occi1.1", "http://192.168.34.1:35357/v3/auth/tokens");
		
		
		OOIDeployer deployer = new OOIDeployer();
		Connection conn = new Connection("jerbel", "UV2.7F62", "tosca2occi", "http://192.168.34.1:8787/occi1.1", "http://192.168.34.1:35357/v3/auth/tokens", "d52754e0-6729-4034-adbb-8f1f3800f2c6");
		//Connection conn = new Connection("jerbel", "UV2.7F62", "tosca2occi", "192.168.35.45", "http://192.168.34.1:35357/v3/auth/tokens", "d52754e0-6729-4034-adbb-8f1f3800f2c6", 8080);
		deployer.deploy(occiPath, extensions, conn);
		
	}
}
