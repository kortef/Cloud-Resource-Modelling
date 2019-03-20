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
import org.junit.jupiter.api.Test;
import org.modmacao.mongodb.MongodbPackage;

import de.ugoe.cs.rwm.docci.MartDeployer;
import de.ugoe.cs.rwm.docci.connector.Connector;
import de.ugoe.cs.rwm.docci.connector.MartConnector;

/**
 * @author fkorte
 *
 */
class TestEmptyDeployment {
	private static Connector conn = new MartConnector("192.168.35.34", 8080, "ubuntu", 
			"/home/fkorte/autoscale/mongoscale-key.pem");
	private static MartDeployer deployer = new MartDeployer(conn);
	private static String basedir = "/home/fkorte/MoDMaCAO/plugins/org.modmacao.lamp/model/";
	private static String sugarcrmbase = "/home/fkorte/de.ugoe.cs.oco.usecases/sugarcrm/CSAR/Definitions";
	private static String openfoambase = "/home/fkorte/de.ugoe.cs.oco.usecases/openfoam/CSAR/Definitions";
	
	
	@Test
	public void deprovisionEverything() {		
		TestUtil.setLoggerConfiguration();
		TestUtil.initializePackages();
		TestUtil.initializeRuntime();
		TestUtil.registerFactories();
		
		MongodbPackage.eINSTANCE.eClass();
		
		ResourceSet set = new ResourceSetImpl();
		TestUtil.loadAndRegisterOCCIExtensions(basedir, set);
		TestUtil.loadAndRegisterOCCIExtensions(sugarcrmbase, set);
		TestUtil.loadAndRegisterOCCIExtensions(openfoambase, set);


		Resource resource = set.getResource(URI.createFileURI("occi/empty.occic"), true);
		EcoreUtil.resolveAll(resource);
		Path occiPath = Paths.get("occi/empty.occic");
		deployer.provisionAndDeploy(occiPath);
	}
}

