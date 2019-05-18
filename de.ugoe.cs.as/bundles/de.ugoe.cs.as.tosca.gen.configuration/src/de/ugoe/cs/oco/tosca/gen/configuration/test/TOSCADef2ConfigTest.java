package de.ugoe.cs.oco.tosca.gen.configuration.test;

import org.eclipse.emf.common.util.URI;
import org.junit.Test;

import de.ugoe.cs.oco.tosca.gen.configuration.TOSCADefToConfigTransformator;

public class TOSCADef2ConfigTest {
	
	@Test
	public void testGenerateConfig() {
		URI toscaDef = URI.createFileURI("/home/fkorte/de.ugoe.cs.oco.usecases/sugarcrm/CSAR/Definitions/SugarCRM-Interop-Definitions.tosca");
	    URI generatedEcore = URI.createFileURI("/home/fkorte/de.ugoe.cs.oco.usecases/sugarcrm/CSAR/Definitions/SugarCRM-Interop-Definitions.toscac");

		new TOSCADefToConfigTransformator().transform(toscaDef, generatedEcore);
	}

}
