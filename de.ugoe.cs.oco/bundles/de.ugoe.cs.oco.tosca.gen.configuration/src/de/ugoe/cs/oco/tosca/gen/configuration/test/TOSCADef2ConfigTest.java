package de.ugoe.cs.oco.tosca.gen.configuration.test;

import java.nio.file.Path;
import java.nio.file.Paths;

import org.junit.Test;

import de.ugoe.cs.oco.tosca.gen.configuration.TOSCADef2Config;

public class TOSCADef2ConfigTest {
	
	@Test
	public void testGenerateConfig() {
		Path toscaDef = Paths.get("/home/fglaser/de.ugoe.cs.oco.usecases/sugarcrm/CSAR/Definitions/SugarCRM-Interop-Definitions.tosca");
	    Path generatedEcore = Paths.get("/home/fglaser/de.ugoe.cs.oco.usecases/sugarcrm/CSAR/Definitions/SugarCRM-Interop-Definitions-migrated.tosca");

		TOSCADef2Config.generateConfiguration(toscaDef, generatedEcore);
	}

}
