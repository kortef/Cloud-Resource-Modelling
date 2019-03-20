/**
 * 
 */
package de.ugoe.cs.oco.usecases.test;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.nio.file.Path;
import java.nio.file.Paths;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Test;
import org.modmacao.toscabasetypes.ToscabasetypesPackage;
import org.modmacao.toscaspecifictypes.ToscaspecifictypesPackage;

import de.ugoe.cs.rwm.docci.MartDeployer;
import de.ugoe.cs.rwm.docci.connector.Connector;
import de.ugoe.cs.rwm.docci.connector.MartConnector;
import de.ugoe.cs.rwm.tocci.occi2occi.OCCI2OCCITransformator;
import de.ugoe.cs.rwm.tocci.occi2openstack.OCCI2OPENSTACKTransformator;
import sugarcrm.SugarcrmPackage;

/**
 * @author fkorte
 *
 */
class TestProvisioningAndDeployment {
	private static Connector conn = new MartConnector("192.168.35.34", 8080, "ubuntu", 
			"/home/fkorte/autoscale/mongoscale-key.pem");
	private static MartDeployer deployer = new MartDeployer(conn);
	protected static String basedir = "/home/fkorte/de.ugoe.cs.oco.usecases/sugarcrm/CSAR/Definitions";
	protected static String cut = "/home/fkorte/de.ugoe.cs.oco.usecases/sugarcrm/CSAR/Definitions/SugarCRM-Interop-Definitions.occic";
	protected static String testname = "testname";
	
	private static BufferedWriter logWriter;
		
	public static void deprovisionEverything() throws FileNotFoundException {		
		TestUtil.setLoggerConfiguration();
		TestUtil.initializePackages();
		TestUtil.initializeRuntime();
		TestUtil.registerFactories();
		
		ToscabasetypesPackage.eINSTANCE.eClass();
		ToscaspecifictypesPackage.eINSTANCE.eClass();
		SugarcrmPackage.eINSTANCE.eClass();
		
		ResourceSet set = new ResourceSetImpl();
		TestUtil.loadAndRegisterOCCIExtensions(basedir, set);

		Resource resource = set.getResource(URI.createFileURI("occi/empty.occic"), true);
		EcoreUtil.resolveAll(resource);
		Path occiPath = Paths.get("occi/empty.occic");
		deployer.provisionAndDeploy(occiPath);
				
		File logFile = new File("testlogs/" + testname + "-" + System.currentTimeMillis() + ".log");
		FileOutputStream os = new FileOutputStream(logFile);
		logWriter = new BufferedWriter(new OutputStreamWriter(os));
	}


	@Test
	void testProvisioningAndDeployment() throws IOException, InterruptedException {
		TestUtil.resetLogTimer();
		TestUtil.log(logWriter, "Starting Deployment");
		
		ResourceSet set = new ResourceSetImpl();
		TestUtil.loadAndRegisterOCCIExtensions(basedir, set);

		MartDeployer deployer = new MartDeployer(conn, 20000);

		Resource resource = set.getResource(URI.createFileURI(cut), true);
		EcoreUtil.resolveAll(resource);
		
		TestUtil.log(logWriter, "Starting OCCI to OCCI Transformation");
		
		Path targetOcci = Paths.get(cut);
		OCCI2OCCITransformator trans = new OCCI2OCCITransformator();
		trans.transform(resource, targetOcci);		
		
		TestUtil.log(logWriter, "Starting OCCI to OCCI-OpenStack Transformation");
		
		OCCI2OPENSTACKTransformator trans2 = OCCI2OPENSTACKTransformator.getInstance();
		Path sourceOcci = Paths.get(cut);
		trans2.setTransformationProperties(TestUtil.MANNETRUNTIMEID, TestUtil.PUBLICKEY, 
			"", TestUtil.MANNETID);
		trans2.transform(sourceOcci, sourceOcci);
		
		TestUtil.log(logWriter, "Starting Provisioning");
		deployer.provision(Paths.get(cut));
		
		TestUtil.log(logWriter, "Cooling down...");
		Thread.sleep(10000);
		
		TestUtil.log(logWriter, "Starting Deployment");
		deployer.deploy(Paths.get(cut));
		
		TestUtil.log(logWriter, "Finished Test.");

	}
	
	@AfterAll
	public static void tearDown() throws IOException {
		logWriter.close();
	}
	
	

	
	
	
}
