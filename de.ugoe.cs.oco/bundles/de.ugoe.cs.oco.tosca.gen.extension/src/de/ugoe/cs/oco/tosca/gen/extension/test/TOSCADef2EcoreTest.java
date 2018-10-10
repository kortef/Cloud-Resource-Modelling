/**
 * 
 */
package de.ugoe.cs.oco.tosca.gen.extension.test;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.UUID;

import javax.xml.namespace.QName;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.Diagnostician;
import org.junit.jupiter.api.Test;

import de.ugoe.cs.oco.tosca.DefinitionsType;
import de.ugoe.cs.oco.tosca.DocumentRoot;
import de.ugoe.cs.oco.tosca.gen.configuration.TOSCADef2Config;
import de.ugoe.cs.oco.tosca.gen.extension.TOSCADef2Ecore;

/**
 * @author Fabian Korte
 *
 */
class TOSCADef2EcoreTest {

	//@Test
	void testGenerateEcore() {
		//Path toscaDef = Paths.get("/home/fglaser/open-cloud-orchestrator/de.ugoe.cs.oco/bundles/de.ugoe.cs.oco.tosca.gen.extension/src/model/normative-types.tosca");
		//Path generatedEcore = Paths.get("/home/fglaser/open-cloud-orchestrator/de.ugoe.cs.oco/bundles/de.ugoe.cs.oco.tosca.gen.extension/src/model/normative-types.ecore");
		
		System.out.println("------------ Generating ecore model for BaseTypes ----------------");
		Path toscaDef = Paths.get("/home/fglaser/de.ugoe.cs.oco.usecases/sugarcrm/CSAR/Definitions/TOSCA-v1.0-BaseTypes-Definitions.tosca");
		Path generatedEcore = Paths.get("/home/fglaser/open-cloud-orchestrator/de.ugoe.cs.oco/bundles/de.ugoe.cs.oco.tosca.gen.extension/testdata/basetypes.ecore");
		TOSCADef2Ecore.generateEcore(toscaDef, generatedEcore);
		
		System.out.println("------------ Generating ecore model for SpecificTypes ----------------");
		toscaDef = Paths.get("/home/fglaser/de.ugoe.cs.oco.usecases/sugarcrm/CSAR/Definitions/TOSCA-v1.0-SpecificTypes-Definitions.tosca");
	    generatedEcore = Paths.get("/home/fglaser/open-cloud-orchestrator/de.ugoe.cs.oco/bundles/de.ugoe.cs.oco.tosca.gen.extension/testdata/specifictypes.ecore");
		TOSCADef2Ecore.generateEcore(toscaDef, generatedEcore);
	    
		System.out.println("------------ Generating ecore model for SugarCRMTypes ----------------");
	    toscaDef = Paths.get("/home/fglaser/de.ugoe.cs.oco.usecases/sugarcrm/CSAR/Definitions/SugarCRMTypes-Definitions.tosca");
	    generatedEcore = Paths.get("/home/fglaser/open-cloud-orchestrator/de.ugoe.cs.oco/bundles/de.ugoe.cs.oco.tosca.gen.extension/testdata/sugarcrmtypes.ecore");
		TOSCADef2Ecore.generateEcore(toscaDef, generatedEcore);
		
		System.out.println("------------- Creating TOSCA configuration -----------------------------");
		toscaDef = Paths.get("/home/fglaser/de.ugoe.cs.oco.usecases/sugarcrm/CSAR/Definitions/SugarCRM-Interop-Definitions.tosca");
		Path toscaConfig = Paths.get("/home/fglaser/open-cloud-orchestrator/de.ugoe.cs.oco/bundles/de.ugoe.cs.oco.tosca.gen.extension/testdata/SugarCRM-Interop-Definitions-migrated.tosca");
		TOSCADef2Config.generateConfiguration(toscaDef, toscaConfig);
	}
	
	@Test
	void testGenerateEPackage() {
		Path toscaDef = Paths.get("/home/fglaser/de.ugoe.cs.oco.usecases/sugarcrm/CSAR/Definitions/TOSCA-v1.0-BaseTypes-Definitions.tosca");
		ResourceSet set = new ResourceSetImpl();
		DocumentRoot root = (DocumentRoot) set.getResource(URI.createFileURI(toscaDef.toString()), true).getContents().get(0);
		DefinitionsType definitions = root.getDefinitions().get(0);
		
		EPackage pack = TOSCADef2Ecore.generateEPackage(toscaDef, set, definitions);
		Resource resource = set.createResource(URI.createURI(pack.getNsURI()));
		resource.getContents().add(pack);
		EObject nodeTemplate = pack.getEFactoryInstance().create((EClass) pack.getEClassifier("OperatingSystem"));
		
		nodeTemplate.eSet(nodeTemplate.eClass().getEStructuralFeature("id"), "UUID-" + UUID.randomUUID().toString());
		//nodeTemplate.eSet(nodeTemplate.eClass().getEStructuralFeature("type"), new QName(definitions.getTargetNamespace(), "OperatingSystem"));
		nodeTemplate.eSet(nodeTemplate.eClass().getEStructuralFeature("type"), new QName("BlaBli"));
		
		Diagnostic diag = Diagnostician.INSTANCE.validate(nodeTemplate);
		
		
		for (Diagnostic childdiag: diag.getChildren()) {
			System.out.println(childdiag);
			if (childdiag.getException() != null) {
				childdiag.getException().printStackTrace();
			}
		}
	}
}
