/**
 * 
 */
package de.ugoe.cs.as.usecases.test;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.format.DateTimeFormatter;
import java.util.Date;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Test;
import org.modmacao.toscabasetypes.ToscabasetypesPackage;
import org.modmacao.toscaspecifictypes.ToscaspecifictypesPackage;

import de.ugoe.cs.as.tosca.gen.configuration.TOSCADefToConfigTransformator;
import de.ugoe.cs.as.tosca2occi.TOSCA2OCCITransformator;
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
	protected static String basedir = "/home/fkorte/git/Case-Studies/sugarcrm/CSAR/Definitions";
	protected static String cut = "/home/fkorte/git/Case-Studies/sugarcrm/CSAR/Definitions/SugarCRM-Interop-Definitions.occic";
	protected static String testname = "testname";
	protected static String userdata = TestUtil.UBUNTU_USERDATA;
	
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
		
		DateFormat sdf = new SimpleDateFormat("yyyyMMdd-HHmmss");
		File logFile = new File("testlogs/" + testname + "-" + sdf.format(new Date())+ ".log");
		FileOutputStream os = new FileOutputStream(logFile);
		logWriter = new BufferedWriter(new OutputStreamWriter(os));
	}


	@Test
	void testProvisioningAndDeployment() throws Exception {
		
		String toscaConfigPath = cut.substring(0, cut.lastIndexOf('.')) + ".toscac";
		String occiConfigPath = cut.substring(0, cut.lastIndexOf('.')) + ".occic";
		
		TestUtil.resetLogTimer();
		TestUtil.log(logWriter, "Starting Setup");
		
		ResourceSet set = new ResourceSetImpl();
		TestUtil.loadAndRegisterOCCIExtensions(basedir, set);

		MartDeployer deployer = new MartDeployer(conn, 20000);
		
		TestUtil.log(logWriter, "Transform TOSCA Definition to TOSCA Configuration");
		new TOSCADefToConfigTransformator().transform(URI.createFileURI(cut), URI.createFileURI(toscaConfigPath));
		
		TestUtil.log(logWriter, "Transform TOSCA to OCCI");
		new TOSCA2OCCITransformator().transform(URI.createFileURI(toscaConfigPath), URI.createFileURI(occiConfigPath));
		
		TestUtil.log(logWriter, "Starting OCCI to OCCI Transformation");
		Path targetOcci = Paths.get(occiConfigPath);
		OCCI2OCCITransformator trans = new OCCI2OCCITransformator();
		Resource resource = set.getResource(URI.createFileURI(occiConfigPath), true);
		EcoreUtil.resolveAll(resource);
		trans.transform(resource, targetOcci);		
		
		TestUtil.log(logWriter, "Starting OCCI to OCCI-OpenStack Transformation");
		OCCI2OPENSTACKTransformator trans2 = new OCCI2OPENSTACKTransformator();
		Path sourceOcci = Paths.get(occiConfigPath);
		trans2.setTransformationProperties(TestUtil.MANNETRUNTIMEID, TestUtil.PUBLICKEY, 
			userdata, TestUtil.MANNETID);
		trans2.transform(sourceOcci, sourceOcci);
		
		TestUtil.log(logWriter, "Starting Provisioning");
		deployer.provision(Paths.get(occiConfigPath));
		
		TestUtil.log(logWriter, "Cooling down...");
		Thread.sleep(30000);
		
		TestUtil.log(logWriter, "Starting Deployment");
		deployer.deploy(Paths.get(occiConfigPath));
		
		TestUtil.log(logWriter, "Finished Test.");

	}
	
	@AfterAll
	public static void tearDown() throws IOException {
		logWriter.close();
	}
	
	

	
	
	
}
