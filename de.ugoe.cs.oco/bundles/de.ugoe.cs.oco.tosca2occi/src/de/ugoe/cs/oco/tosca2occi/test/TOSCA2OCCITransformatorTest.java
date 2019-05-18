/**
 * 
 */
package de.ugoe.cs.oco.tosca2occi.test;

import static org.junit.Assert.assertEquals;

import java.util.Map;

import org.eclipse.cmf.occi.core.Configuration;
import org.eclipse.cmf.occi.core.util.OCCIResourceFactoryImpl;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.junit.Test;

import de.ugoe.cs.oco.tosca.util.ToscaResourceFactoryImpl;
import de.ugoe.cs.oco.tosca2occi.TOSCA2OCCITransformator;

/**
 * @author Fabian Korte
 *
 */
public class TOSCA2OCCITransformatorTest {

	/**
	 * 
	 * @throws Exception 
	 */
	@Test
	public void testTransformSugarCRM() throws Exception {
		Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
		Map<String, Object> m = reg.getExtensionToFactoryMap();
		m.put("tosca", new ToscaResourceFactoryImpl());
		URI inputpath = URI.createFileURI("testdata/SugarCRM-Interop-Definitions-migrated.tosca");
		URI outputpath = URI.createFileURI("testdata/SugarCRM-Interop-Definitions-migrated.occic");
		
		new TOSCA2OCCITransformator().transform(inputpath, outputpath);
		
		m.put("occic", new OCCIResourceFactoryImpl());
		ResourceSet set = new ResourceSetImpl();
		Resource resource = set.getResource(URI.createFileURI(outputpath.toString()), true);
		
		Configuration configuration = (Configuration) resource.getContents().get(0);
		EList<org.eclipse.cmf.occi.core.Resource> resources = configuration.getResources();
		assertEquals(8, resources.size());
		
		for (org.eclipse.cmf.occi.core.Resource res: resources) {
			if (res.getId().equals("VmApache")) {
				assertEquals(1, res.getParts().size());
				assertEquals(3, res.getRlinks().size());
			}
			if (res.getId().equals("ApacheWebServer")) {
				assertEquals(1, res.getParts().size());
				assertEquals(1, res.getLinks().size());
			}
			if (res.getId().equals("SugarCrmApp")) {
				assertEquals(1, res.getParts().size());
				assertEquals(4, res.getLinks().size());
			}
			if (res.getId().equals("SugarCrmDb")) {
				assertEquals(1, res.getParts().size());
				assertEquals(2, res.getLinks().size());
			}
		}
		
	}
	
	@Test
	public void testOpenFoamTransform() throws Exception {
		Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
		Map<String, Object> m = reg.getExtensionToFactoryMap();
		m.put("tosca", new ToscaResourceFactoryImpl());
		URI inputpath = URI.createFileURI("/home/fkorte/de.ugoe.cs.oco.usecases/openfoam/CSAR/Definitions/openfoamcluster.toscac");
		URI outputpath = URI.createFileURI("/home/fkorte/de.ugoe.cs.oco.usecases/openfoam/CSAR/Definitions/openfoamcluster.occic");
		
		TestUtil.initializePackages();
		TestUtil.registerFactories();
		
		new TOSCA2OCCITransformator().transform(inputpath, outputpath);
		
		m.put("occic", new OCCIResourceFactoryImpl());
		ResourceSet set = new ResourceSetImpl();
		Resource resource = set.getResource(outputpath, true);
		
		Configuration configuration = (Configuration) resource.getContents().get(0);
		EList<org.eclipse.cmf.occi.core.Resource> resources = configuration.getResources();		
	}

}
