/**
 * 
 */
package de.ugoe.cs.oco.tosca.gen.extension.test;

import java.nio.file.Path;
import java.nio.file.Paths;

import org.eclipse.emf.common.util.URI;
import org.junit.jupiter.api.Test;

import de.ugoe.cs.oco.tosca.gen.configuration.TOSCADefToConfigTransformator;
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
		
		System.out.println("------------ Generating ecore model for BaseTypes ----------------");
		URI toscaDef = URI.createFileURI("/home/fglaser/de.ugoe.cs.oco.usecases/sugarcrm/CSAR/Definitions/TOSCA-v1.0-BaseTypes-Definitions.tosca");
		URI generatedEcore = URI.createFileURI("/home/fglaser/open-cloud-orchestrator/de.ugoe.cs.oco/bundles/de.ugoe.cs.oco.tosca.gen.extension/testdata/basetypes.ecore");
		TOSCADef2Ecore.generateEcore(toscaDef, generatedEcore);
		
		System.out.println("------------ Generating ecore model for SpecificTypes ----------------");
		toscaDef = URI.createFileURI("/home/fglaser/de.ugoe.cs.oco.usecases/sugarcrm/CSAR/Definitions/TOSCA-v1.0-SpecificTypes-Definitions.tosca");
	    generatedEcore = URI.createFileURI("/home/fglaser/open-cloud-orchestrator/de.ugoe.cs.oco/bundles/de.ugoe.cs.oco.tosca.gen.extension/testdata/specifictypes.ecore");
		TOSCADef2Ecore.generateEcore(toscaDef, generatedEcore);
	    
		System.out.println("------------ Generating ecore model for SugarCRMTypes ----------------");
	    toscaDef = URI.createFileURI("/home/fglaser/de.ugoe.cs.oco.usecases/sugarcrm/CSAR/Definitions/SugarCRMTypes-Definitions.tosca");
	    generatedEcore = URI.createFileURI("/home/fglaser/open-cloud-orchestrator/de.ugoe.cs.oco/bundles/de.ugoe.cs.oco.tosca.gen.extension/testdata/sugarcrmtypes.ecore");
		TOSCADef2Ecore.generateEcore(toscaDef, generatedEcore);
		
		System.out.println("------------- Creating TOSCA configuration -----------------------------");
		toscaDef = URI.createFileURI("/home/fglaser/de.ugoe.cs.oco.usecases/sugarcrm/CSAR/Definitions/SugarCRM-Interop-Definitions.tosca");
		Path toscaConfig = Paths.get("/home/fglaser/open-cloud-orchestrator/de.ugoe.cs.oco/bundles/de.ugoe.cs.oco.tosca.gen.extension/testdata/SugarCRM-Interop-Definitions-migrated.tosca");
		//TOSCADef2Config.generateConfiguration(toscaDef, toscaConfig);
	}
}
