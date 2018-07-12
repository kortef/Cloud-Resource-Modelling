package de.ugoe.cs.oco.occi2deployment.tests;

import java.nio.file.Path;

import org.eclipse.cmf.occi.core.Configuration;
import org.eclipse.cmf.occi.core.Link;
import org.eclipse.cmf.occi.core.Mixin;
import org.eclipse.cmf.occi.core.OCCIPackage;
import org.eclipse.cmf.occi.core.Resource;
import org.eclipse.cmf.occi.core.util.OcciRegistry;
import org.eclipse.cmf.occi.infrastructure.InfrastructurePackage;
import org.modmacao.placement.PlacementPackage;

import de.ugoe.cs.oco.occi2deployment.ModelUtility;
import de.ugoe.cs.oco.occi2deployment.connector.MartConnector;
import modmacao.ModmacaoPackage;
import openstackruntime.OpenstackruntimePackage;
import ossweruntime.OssweruntimePackage;

public class RetrieverTest {

	public static void main(String[] args) {
		InfrastructurePackage.eINSTANCE.eClass();
		OCCIPackage.eINSTANCE.eClass();
		ModmacaoPackage.eINSTANCE.eClass();
		OpenstackruntimePackage.eINSTANCE.eClass();
		OssweruntimePackage.eINSTANCE.eClass();
		PlacementPackage.eINSTANCE.eClass();
		
		OcciRegistry.getInstance().registerExtension("http://schemas.modmacao.org/modmacao#", "/home/erbel/git/open-cloud-orchestrator/de.ugoe.cs.oco/bundles/de.ugoe.cs.oco.occi2deployment/extensions/modmacao.occie");
		OcciRegistry.getInstance().registerExtension("http://schemas.modmacao.org/openstack/runtime#", "/home/erbel/git/open-cloud-orchestrator/de.ugoe.cs.oco/bundles/de.ugoe.cs.oco.occi2deployment/extensions/openstackruntime.occie");
		OcciRegistry.getInstance().registerExtension("http://schemas.modmacao.org/openstack/swe#", "/home/erbel/git/open-cloud-orchestrator/de.ugoe.cs.oco/bundles/de.ugoe.cs.oco.occi2deployment/extensions/ossweruntime.occie");
		OcciRegistry.getInstance().registerExtension("http://schemas.occiware.org/placement#", "/home/erbel/git/open-cloud-orchestrator/de.ugoe.cs.oco/bundles/de.ugoe.cs.oco.occi2deployment/extensions/placement.occie");
		OcciRegistry.getInstance().registerExtension("http://schemas.ogf.org/occi/infrastructure#", InfrastructurePackage.class.getClassLoader().getResource("model/Infrastructure.occie").toString());

		MartConnector conn = new MartConnector("192.168.35.45", 8080 , "ubuntu", "~/key.pem");
		//Configuration runtimeModel = conn.loadRuntimeModel("models", "model-anonymous.occic", "model-anonymous.occic");
		Path test = conn.loadRuntimeModel("models", "model-anonymous.occic", "model-anonymous.occic");
		
		org.eclipse.emf.ecore.resource.Resource testRes = ModelUtility.loadOCCIResource(test, null);
		
		Configuration runtimeModel = (Configuration) testRes.getContents().get(0);
		
		System.out.println(runtimeModel);
		System.out.println(runtimeModel.getResources());
		for(Resource res: runtimeModel.getResources()) {
			System.out.print("Resource: " + res.getTitle());
			System.out.print(" : ");
			System.out.println(res.getKind().getTitle());
			for(Mixin mix: res.getMixins()) {
				System.out.println("     Mixin: " + mix.getTerm());
			}
			for(Link link: res.getLinks()) {
				System.out.println("     Link: " + link.getTitle());
			}
		}
	}

}
