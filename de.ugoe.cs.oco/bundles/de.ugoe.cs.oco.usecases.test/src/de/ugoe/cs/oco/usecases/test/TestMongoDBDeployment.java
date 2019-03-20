/**
 * 
 */
package de.ugoe.cs.oco.usecases.test;

import java.nio.file.Path;
import java.nio.file.Paths;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.modmacao.lamp.LampPackage;
import org.modmacao.mongodb.MongodbPackage;

import de.ugoe.cs.rwm.docci.MartDeployer;
import de.ugoe.cs.rwm.docci.connector.Connector;
import de.ugoe.cs.rwm.docci.connector.MartConnector;
import de.ugoe.cs.rwm.tocci.occi2occi.OCCI2OCCITransformator;
import de.ugoe.cs.rwm.tocci.occi2openstack.OCCI2OPENSTACKTransformator;

/**
 * @author fkorte
 *
 */
class TestMongoDBDeployment {
	private static Connector conn = new MartConnector("192.168.35.22", 8080, "ubuntu", 
			"/home/fkorte/autoscale/mongoscale-key.pem");
	private static MartDeployer deployer = new MartDeployer(conn);
	private static String basedir = "/home/fkorte/MoDMaCAO/plugins/org.modmacao.mongodb/model";
	private static String sugarcrmbase = "/home/fkorte/de.ugoe.cs.oco.usecases/sugarcrm/CSAR/Definitions";
	private static String cut = "/home/fkorte/MoDMaCAO/plugins/org.modmacao.mongodb.example/MongoDB-Cluster-withAnsible.occic";
	
	
	
	@BeforeAll
	public static void deprovisionEverything() {		
		TestUtil.setLoggerConfiguration();
		TestUtil.initializePackages();
		TestUtil.initializeRuntime();
		TestUtil.registerFactories();
		
		ResourceSet set = new ResourceSetImpl();
		TestUtil.loadAndRegisterOCCIExtensions(basedir, set);
		TestUtil.loadAndRegisterOCCIExtensions(sugarcrmbase, set);


		Resource resource = set.getResource(URI.createFileURI("occi/empty.occic"), true);
		EcoreUtil.resolveAll(resource);
		Path occiPath = Paths.get("occi/empty.occic");
		deployer.deploy(occiPath);
	}


	@Test
	void testLAMPDeployment() {
		MongodbPackage.eINSTANCE.eClass();
		LampPackage.eINSTANCE.eClass();
	    
		ResourceSet set = new ResourceSetImpl();
		TestUtil.loadAndRegisterOCCIExtensions("basedir", set);

		MartDeployer deployer = new MartDeployer(conn, 20000);
		
		Resource resource = set.getResource(URI.createFileURI(cut), true);
		EcoreUtil.resolveAll(resource);
		
		Path targetOcci = Paths.get(cut);
		OCCI2OCCITransformator trans = new OCCI2OCCITransformator();
		trans.transform(resource, targetOcci);		
		
		OCCI2OPENSTACKTransformator trans2 = OCCI2OPENSTACKTransformator.getInstance();
		Path sourceOcci = Paths.get(cut);
		trans2.setTransformationProperties(TestUtil.MANNETRUNTIMEID, TestUtil.PUBLICKEY, 
				"", TestUtil.MANNETID);
		trans2.transform(sourceOcci, sourceOcci);
		
		deployer.deploy(Paths.get(cut));
	}
	

	
	
	
}
