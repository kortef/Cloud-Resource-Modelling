package de.ugoe.cs.oco.occi2deployment.tests;

import java.nio.file.Path;
import java.nio.file.Paths;

import org.eclipse.cmf.occi.core.Configuration;
import org.eclipse.cmf.occi.core.OCCIPackage;
import org.eclipse.cmf.occi.core.util.OcciRegistry;
import org.eclipse.cmf.occi.infrastructure.InfrastructurePackage;
import org.modmacao.placement.PlacementPackage;

import de.ugoe.cs.oco.occi2deployment.ModelUtility;
import de.ugoe.cs.oco.occi2deployment.connector.MartConnector;
import de.ugoe.cs.oco.occi2deployment.transformation.Transformator;
import de.ugoe.cs.oco.occi2deployment.transformation.TransformatorFactory;
import modmacao.ModmacaoPackage;
import openstackruntime.OpenstackruntimePackage;

public class MigraterTest {
	public static void main(String[] args) {
		InfrastructurePackage.eINSTANCE.eClass();
		OCCIPackage.eINSTANCE.eClass();
		ModmacaoPackage.eINSTANCE.eClass();
		OpenstackruntimePackage.eINSTANCE.eClass();
		PlacementPackage.eINSTANCE.eClass();
		
		OcciRegistry.getInstance().registerExtension("http://schemas.modmacao.org/modmacao#", "/home/erbel/git/open-cloud-orchestrator/de.ugoe.cs.oco/bundles/de.ugoe.cs.oco.occi2deployment/extensions/modmacao.occie");
		OcciRegistry.getInstance().registerExtension("http://schemas.modmacao.org/openstack/runtime#", "/home/erbel/git/open-cloud-orchestrator/de.ugoe.cs.oco/bundles/de.ugoe.cs.oco.occi2deployment/extensions/openstackruntime.occie");
		OcciRegistry.getInstance().registerExtension("http://schemas.modmacao.org/openstack/swe#", "/home/erbel/git/open-cloud-orchestrator/de.ugoe.cs.oco/bundles/de.ugoe.cs.oco.occi2deployment/extensions/ossweruntime.occie");
		OcciRegistry.getInstance().registerExtension("http://schemas.occiware.org/placement#", "/home/erbel/git/open-cloud-orchestrator/de.ugoe.cs.oco/bundles/de.ugoe.cs.oco.occi2deployment/extensions/placement.occie");
		OcciRegistry.getInstance().registerExtension("http://schemas.ogf.org/occi/infrastructure#", InfrastructurePackage.class.getClassLoader().getResource("model/Infrastructure.occie").toString());
		
		MartConnector conn = new MartConnector("192.168.35.45", 8080 , "ubuntu", "~/key.pem");
		//Configuration runtimeModel = conn.loadRuntimeModel("models", "model-anonymous.occic", "model-anonymous.occic");
		Path runtimePath = conn.loadRuntimeModel("models", "model-anonymous.occic", "model-anonymous.occic");
		System.out.println(runtimePath.toAbsolutePath());
		Path adjustedRuntime = Paths.get("model2.occic");
		System.out.println(adjustedRuntime.toAbsolutePath());
		
		Transformator trans = TransformatorFactory.getTransformator("OCCIC2OCCIC");
		trans.transform(runtimePath, adjustedRuntime);
		
		org.eclipse.emf.ecore.resource.Resource testRes2 = ModelUtility.loadOCCIResource(adjustedRuntime.toAbsolutePath(), null);
		System.out.println(testRes2);
		System.out.println(ModelUtility.getOCCIConfigurationContents(testRes2));
		Configuration runtimeModel2 = (Configuration) testRes2.getContents().get(0);
		System.out.println(runtimeModel2.getResources());
	}
}
