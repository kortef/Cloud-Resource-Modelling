package de.ugoe.cs.oco.occi2deployment.tests;

import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;
import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

import de.ugoe.cs.oco.occi.extractor.OCCIModelExtractor;
import de.ugoe.cs.oco.occi2deployment.MartDeployer;
import de.ugoe.cs.oco.occi2deployment.OOIDeployer;
import de.ugoe.cs.oco.occi2deployment.adapter.ElementAdapter;
import de.ugoe.cs.oco.occi2deployment.comparator.Comparator;
import de.ugoe.cs.oco.occi2deployment.connector.Connection;
import de.ugoe.cs.oco.occi2deployment.connector.MartConnector;
import de.ugoe.cs.oco.occi2deployment.deprovisioner.Deprovisioner;
import de.ugoe.cs.oco.occi2deployment.execution.Executor;
import de.ugoe.cs.oco.occi2deployment.extraction.Extractor;
import de.ugoe.cs.oco.occi2deployment.provisioner.Provisioner;

public class MartDeployerTest {
	
	public static void main(String[] args){
		File log4jfile = new File("./src/de/ugoe/cs/oco/occi2deployment/log4j.properties");
		PropertyConfigurator.configure(log4jfile.getAbsolutePath());
		Logger.getLogger(Executor.class.getName()).setLevel(Level.DEBUG);
		Logger.getLogger(Extractor.class.getName()).setLevel(Level.DEBUG);
		Logger.getLogger(Provisioner.class.getName()).setLevel(Level.DEBUG);
		Logger.getLogger(Comparator.class.getName()).setLevel(Level.INFO);
		Logger.getLogger(Deprovisioner.class.getName()).setLevel(Level.INFO);
		Logger.getLogger(OOIDeployer.class.getName()).setLevel(Level.DEBUG);
		Logger.getLogger(Connection.class.getName()).setLevel(Level.DEBUG);
		Logger.getLogger(ElementAdapter.class.getName()).setLevel(Level.INFO);
		Logger.getLogger(OCCIModelExtractor.class.getName()).setLevel(Level.INFO);
		Logger.getRootLogger().setLevel(Level.FATAL);
		
		
		Path occiPath = Paths.get("./src/de/ugoe/cs/oco/occi2deployment/tests/models/mls/PaaS.occic");
		//Path occiPath = Paths.get("/home/erbel/git/open-cloud-orchestrator/de.ugoe.cs.oco/bundles/de.ugoe.cs.oco.occi2deployment/bin/de/ugoe/cs/oco/occi2deployment/models/runtime.occic");
		
		//Transformator trans = TransformatorFactory.getTransformator("OCCIC2OCCIC");
		//trans.transform(occiPath, occiPath);
		
		MartDeployer deployer = new MartDeployer();
		
		MartConnector conn = new MartConnector("192.168.35.45", 8080 , "ubuntu", "~/key.pem");
		deployer.deploy(occiPath, conn);
		
	}
}
