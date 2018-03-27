package de.ugoe.cs.oco.occi2deployment.tests.models.evaluation.adaptation;

import java.nio.file.Path;
import java.nio.file.Paths;

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

public class AdaptationTest {
	
	public static void main(String[] args){
		Logger.getLogger(Executor.class.getName()).setLevel(Level.DEBUG);
		Logger.getLogger(Extractor.class.getName()).setLevel(Level.DEBUG);
		Logger.getLogger(Provisioner.class.getName()).setLevel(Level.DEBUG);
		Logger.getLogger(Comparator.class.getName()).setLevel(Level.DEBUG);
		Logger.getLogger(Deprovisioner.class.getName()).setLevel(Level.DEBUG);
		Logger.getLogger(Deployer.class.getName()).setLevel(Level.DEBUG);
		Logger.getLogger(Connection.class.getName()).setLevel(Level.DEBUG);
		Logger.getLogger(ElementAdapter.class.getName()).setLevel(Level.DEBUG);
		Logger.getRootLogger().setLevel(Level.FATAL);
		
		Path occiPath = Paths.get("./src/de/ugoe/cs/oco/occi2deployment/tests/models/evaluation/adaptation/targetModel.occie");
		Connection conn = new Connection("jerbel", "UV2.7F62", "tosca2occi", "http://192.168.34.1:8787/occi1.1", "http://192.168.34.1:35357/v3/auth/tokens","9b24a620-bee8-4526-bcc9-bbfde769a152");
		Deployer deployer = new Deployer();
		deployer.deploy(occiPath,conn);
	}
}