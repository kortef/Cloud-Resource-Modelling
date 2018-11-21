/**
 * 
 */
package de.ugoe.cs.oco.tosca2occi.test;

import java.util.Map;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.junit.Test;

import de.ugoe.cs.oco.tosca.util.ToscaResourceFactoryImpl;
import de.ugoe.cs.oco.tosca2occi.OCCIExtensionGenerator;

/**
 * @author Fabian Korte
 *
 */
public class OCCIExtensionGeneratorTest {

	/**
	 * 
	 * @throws Exception 
	 */
	@Test
	public void testTransform() throws Exception {
		Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
		Map<String, Object> m = reg.getExtensionToFactoryMap();
		m.put("tosca", new ToscaResourceFactoryImpl());
		m.put("occie", new XMIResourceFactoryImpl());
		System.out.println("----------------- Run SugarCRMType Transformation --------------------");
		URI inputpath = URI.createFileURI("/home/fglaser/de.ugoe.cs.oco.usecases/sugarcrm/CSAR/Definitions/SugarCRMTypes-Definitions.tosca");
		URI outputpath = URI.createFileURI("testdata/SugarCRM-Types.occie");
		OCCIExtensionGenerator.generate(inputpath, outputpath);
		
		System.out.println("----------------- Run BaseType Transformation --------------------");
		inputpath = URI.createFileURI("/home/fglaser/de.ugoe.cs.oco.usecases/sugarcrm/CSAR/Definitions/TOSCA-v1.0-BaseTypes-Definitions.tosca");
		outputpath = URI.createFileURI("testdata/TOSCA-v1.0-BaseTypes-Definitions.occie");
		OCCIExtensionGenerator.generate(inputpath, outputpath);
		
		System.out.println("----------------- Run SpecificType Transformation --------------------");
		inputpath = URI.createFileURI("/home/fglaser/de.ugoe.cs.oco.usecases/sugarcrm/CSAR/Definitions/TOSCA-v1.0-SpecificTypes-Definitions.tosca");
		outputpath = URI.createFileURI("testdata/TOSCA-v1.0-BaseSpecific-Definitions.occie");
		OCCIExtensionGenerator.generate(inputpath, outputpath);
		
	}

}
