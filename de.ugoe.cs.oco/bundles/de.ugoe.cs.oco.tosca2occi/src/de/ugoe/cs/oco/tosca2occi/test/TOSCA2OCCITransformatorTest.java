/**
 * 
 */
package de.ugoe.cs.oco.tosca2occi.test;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Map;

import org.eclipse.emf.ecore.resource.Resource;
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
	public void testTransform() throws Exception {
//		Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
//		Map<String, Object> m = reg.getExtensionToFactoryMap();
//		m.put("tosca", new ToscaResourceFactoryImpl());
		Path inputpath = Paths.get("testdata/SugarCRM-Interop-Definitions-migrated.tosca");
		Path outputpath = Paths.get("testdata/SugarCRM-Interop-Definitions-migrated.occic");
		TOSCA2OCCITransformator.transform(inputpath, outputpath);
	}

}
