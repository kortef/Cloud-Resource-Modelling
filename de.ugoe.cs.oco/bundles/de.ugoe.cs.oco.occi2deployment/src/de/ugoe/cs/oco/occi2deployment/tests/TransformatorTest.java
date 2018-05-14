package de.ugoe.cs.oco.occi2deployment.tests;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.eclipse.cmf.occi.core.OCCIPackage;
import org.eclipse.cmf.occi.core.Resource;
import org.eclipse.cmf.occi.core.util.OcciRegistry;
import org.eclipse.cmf.occi.infrastructure.InfrastructurePackage;
import org.modmacao.placement.PlacementPackage;

import de.ugoe.cs.oco.occi2deployment.ModelUtility;
import de.ugoe.cs.oco.occi2deployment.transformation.Transformator;
import de.ugoe.cs.oco.occi2deployment.transformation.TransformatorFactory;
import modmacao.ModmacaoPackage;
import openstackruntime.OpenstackruntimePackage;

public class TransformatorTest {

	public static void main(String[] args) throws Exception {
		Logger.getRootLogger().setLevel(Level.FATAL);
		
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
		
		Path occiPath = Paths.get("./src/de/ugoe/cs/oco/occi2deployment/tests/models/mls/PaaS.occic");
		
		org.eclipse.emf.ecore.resource.Resource occi = ModelUtility.loadOCCIResource(occiPath, null);
		
		
		Transformator occiToPog = TransformatorFactory.getTransformator("OCCI2POG");
		Path outputpath = Paths.get("./src/de/ugoe/cs/oco/occi2deployment/tests/models/POG.pog");
		occiToPog.transform(occi, outputpath);

		Transformator pogToProvPlan = TransformatorFactory.getTransformator("POG2ProvPlan");
		Path inputpath = Paths.get("./src/de/ugoe/cs/oco/occi2deployment/tests/models/POG.pog");
		outputpath = Paths.get("./src/de/ugoe/cs/oco/occi2deployment/tests/models/ProvisioningPlanSkeleton.uml");
		pogToProvPlan.transform(inputpath, outputpath);

	}
}
