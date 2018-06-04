/**
 * 
 */
package de.ugoe.cs.oco.tosca.gen.extension.test;

import java.nio.file.Path;
import java.nio.file.Paths;

import org.junit.jupiter.api.Test;

import de.ugoe.cs.oco.tosca.gen.extension.TOSCADef2Ecore;

/**
 * @author Fabian Korte
 *
 */
class TOSCADef2EcoreTest {

	@Test
	void testGenerateEcore() {
		//Path toscaDef = Paths.get("/home/fglaser/open-cloud-orchestrator/de.ugoe.cs.oco/bundles/de.ugoe.cs.oco.tosca.gen.extension/src/model/normative-types.tosca");
		//Path generatedEcore = Paths.get("/home/fglaser/open-cloud-orchestrator/de.ugoe.cs.oco/bundles/de.ugoe.cs.oco.tosca.gen.extension/src/model/normative-types.ecore");
		//Path toscaDef = Paths.get("/home/fglaser/de.ugoe.cs.oco.usecases/sugercrm/Definitions/TOSCA-v1.0-BaseTypes-Definitions.tosca");
		//Path generatedEcore = Paths.get("/home/fglaser/de.ugoe.cs.oco.usecases/sugercrm/Definitions/basetypes.ecore");
		Path toscaDef = Paths.get("/home/fglaser/de.ugoe.cs.oco.usecases/sugercrm_original/Definitions/TOSCA-v1.0-SpecificTypes-Definitions.xml");
	    Path generatedEcore = Paths.get("/home/fglaser/de.ugoe.cs.oco.usecases/sugercrm_original/Definitions/specifictypes.ecore");
		//Path toscaDef = Paths.get("/home/fglaser/de.ugoe.cs.oco.usecases/sugercrm_original/Definitions/SugarCRMTypes-Definitions.xml");
	    //Path generatedEcore = Paths.get("/home/fglaser/de.ugoe.cs.oco.usecases/sugercrm_original/Definitions/sugarcrmtypes.ecore");

		TOSCADef2Ecore.generateEcore(toscaDef, generatedEcore);
	}
}
