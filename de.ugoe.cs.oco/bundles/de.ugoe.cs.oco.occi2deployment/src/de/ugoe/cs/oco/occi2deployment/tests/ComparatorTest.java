package de.ugoe.cs.oco.occi2deployment.tests;


import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.eclipse.cmf.occi.core.OCCIPackage;
import org.eclipse.cmf.occi.core.util.OcciRegistry;
import org.eclipse.cmf.occi.infrastructure.InfrastructurePackage;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.epsilon.emc.emf.CachedResourceSet;
import org.modmacao.placement.PlacementPackage;

import de.ugoe.cs.oco.occi2deployment.DeployerHelper;
import de.ugoe.cs.oco.occi2deployment.ModelUtility;
import de.ugoe.cs.oco.occi2deployment.comparator.Comparator;
import de.ugoe.cs.oco.occi2deployment.comparator.ComparatorFactory;
import modmacao.ModmacaoPackage;
import openstackruntime.OpenstackruntimePackage;


public class ComparatorTest {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		BasicConfigurator.configure();
		Logger.getLogger(Comparator.class.getName()).setLevel(Level.DEBUG);
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
		
		
		String version = "Mixed";
		
		List<Path> extensions = new ArrayList<Path>();
		extensions.add(Paths.get("/home/erbel/git/MoDMaCAO/plugins/org.modmacao.occi.platform/model/platform.occie"));
		extensions.add(Paths.get("/home/erbel/git/MoDMaCAO/plugins/org.modmacao.mongodb/model/mongodb.occie"));
		extensions.add(Paths.get("/home/erbel/git/MoDMaCAO/plugins/org.modmacao.placement/model/placement.occie"));
		extensions.add(Paths.get("./src/de/ugoe/cs/oco/occi2deployment/tests/models/mls/openstackinstance.occie"));
		extensions.add(Paths.get("./src/de/ugoe/cs/oco/occi2deployment/tests/models/mls/openstacknetwork.occie"));
		extensions.add(Paths.get("./src/de/ugoe/cs/oco/occi2deployment/tests/models/mls/openstacktemplate.occie"));
		
		
		/*
		System.out.println("test2 -> test2:");
		Path oldOCCI = Paths.get("./src/de/ugoe/cs/oco/occi2deployment/tests/models/test2.occie");
		Path newOCCI = Paths.get("./src/de/ugoe/cs/oco/occi2deployment/tests/models/test2.occie");
		
		Comparator comparator = ComparatorFactory.getComparator(version, oldOCCI, newOCCI, null);
		CachedResourceSet.getCache().clear();
		System.out.println("");
		*/
		
		System.out.println("MLS -> MLS:");
		Path occiPath = new DeployerHelper().loadPath("/de/ugoe/cs/oco/occi2deployment/tests/models/mls/MLS.occic");
		Path occiPath2 = new DeployerHelper().loadPath("/de/ugoe/cs/oco/occi2deployment/tests/models/mls/MLS.occic");
		org.eclipse.emf.ecore.resource.Resource oldModelResource = ModelUtility.loadOCCIResource(occiPath, null);
		//System.out.println(oldModelResource.getContents());
		org.eclipse.emf.ecore.resource.Resource newModelResource = ModelUtility.loadOCCIResource(occiPath2, extensions);	
		Comparator comparator = ComparatorFactory.getComparator(version, oldModelResource, newModelResource, null);
		CachedResourceSet.getCache().clear();
		System.out.println("");
		//System.out.println(ModelUtility.getOCCIConfigurationContents(newModelResource));
		
		
		
		
		System.out.println("anonym -> anonym:");
		occiPath = Paths.get("/home/erbel/git/open-cloud-orchestrator/de.ugoe.cs.oco/bundles/de.ugoe.cs.oco.occi2deployment/model-anonymous.occic");
		occiPath2 = Paths.get("/home/erbel/git/open-cloud-orchestrator/de.ugoe.cs.oco/bundles/de.ugoe.cs.oco.occi2deployment/model-anonymous.occic");
		org.eclipse.emf.ecore.resource.Resource oldModelResource2 = ModelUtility.loadOCCIResource(occiPath, null);	
		org.eclipse.emf.ecore.resource.Resource newModelResource2 = ModelUtility.loadOCCIResource(occiPath2, null);	
		
		//System.out.println(ModelUtility.getOCCIConfigurationContents(newModelResource2));
		
		Comparator comparator2 = ComparatorFactory.getComparator(version, occiPath, occiPath2, null);
		CachedResourceSet.getCache().clear();
		System.out.println("");
		
		
		System.out.println("MLS -> anonym:");
		occiPath = new DeployerHelper().loadPath("/de/ugoe/cs/oco/occi2deployment/tests/models/mls/MLS.occic");
		occiPath2 = Paths.get("/home/erbel/git/open-cloud-orchestrator/de.ugoe.cs.oco/bundles/de.ugoe.cs.oco.occi2deployment/model-anonymous.occic");

		//System.out.println(ModelUtility.getOCCIConfigurationContents(newModelResource2));
		
		Comparator comparator3 = ComparatorFactory.getComparator(version, occiPath, occiPath2, null);
		CachedResourceSet.getCache().clear();
		System.out.println("");
		
		
		/*
		System.out.println("MLS -> MLS:");
		Path occiPath = Paths.get("./src/de/ugoe/cs/oco/occi2deployment/tests/models/mls/MLS.occic");
		Path occiPath2 = Paths.get("./src/de/ugoe/cs/oco/occi2deployment/tests/models/mls/MLS.occic");
		org.eclipse.emf.ecore.resource.Resource oldModelResource = ModelUtility.loadOCCIResource(occiPath, null);	
		org.eclipse.emf.ecore.resource.Resource newModelResource = ModelUtility.loadOCCIResource(occiPath2, extensions);	
		Comparator comparator = ComparatorFactory.getComparator(version, oldModelResource, newModelResource, null);
		CachedResourceSet.getCache().clear();
		System.out.println("");
		*/
		
		/*
		System.out.println("LAMP ->test2:");
		comparator = ComparatorFactory.getComparator(version, newModelResource, oldModelResource, null);
		CachedResourceSet.getCache().clear();
		System.out.println("");
		
		System.out.println("LAMP ->LAMP:");
		comparator = ComparatorFactory.getComparator(version, newModelResource, newModelResource, null);
		CachedResourceSet.getCache().clear();
		System.out.println("");
		*/
		
		/*
		System.out.println("Basic Example + NWVM:");
		Path oldOCCI = Paths.get("./src/de/ugoe/cs/oco/occi2deployment/tests/models/basicExample.occie");
		Path newOCCI = Paths.get("./src/de/ugoe/cs/oco/occi2deployment/tests/models/basicExample+NWVM.occie");
		
		Comparator comparator = ComparatorFactory.getComparator(version, oldOCCI, newOCCI, null);
		CachedResourceSet.getCache().clear();
		System.out.println("");
		
		System.out.println("Basic Example + VM:");
		oldOCCI = Paths.get("./src/de/ugoe/cs/oco/occi2deployment/tests/models/basicExample.occie");
		newOCCI = Paths.get("./src/de/ugoe/cs/oco/occi2deployment/tests/models/basicExample+VM.occie");
		comparator = ComparatorFactory.getComparator(version, oldOCCI, newOCCI, null);
		CachedResourceSet.getCache().clear();
		System.out.println("");
		
		System.out.println("Empty:");
		Path oldOCCI2 = Paths.get("./src/de/ugoe/cs/oco/occi2deployment/tests/models/basicExample.occie");
		Path newOCCI2 = Paths.get("./src/de/ugoe/cs/oco/occi2deployment/tests/models/empty.occie");
		comparator = ComparatorFactory.getComparator(version, oldOCCI2, newOCCI2, null);
		CachedResourceSet.getCache().clear();
		System.out.println("");
		
		System.out.println("Basic Example - VM:");
		oldOCCI = Paths.get("./src/de/ugoe/cs/oco/occi2deployment/tests/models/basicExample.occie");
		newOCCI = Paths.get("./src/de/ugoe/cs/oco/occi2deployment/tests/models/basicExample-VM.occie");
		comparator = ComparatorFactory.getComparator(version, oldOCCI, newOCCI, null);
		CachedResourceSet.getCache().clear();
		System.out.println("");
		
		System.out.println("Basic Example Without Link:");
		oldOCCI = Paths.get("./src/de/ugoe/cs/oco/occi2deployment/tests/models/basicExample.occie");
		newOCCI = Paths.get("./src/de/ugoe/cs/oco/occi2deployment/tests/models/basicExampleWithoutLink.occie");
		comparator = ComparatorFactory.getComparator(version, oldOCCI, newOCCI, null);
		CachedResourceSet.getCache().clear();
		System.out.println("");
		
		System.out.println("Without Link to Basic Example:");
		newOCCI = Paths.get("./src/de/ugoe/cs/oco/occi2deployment/tests/models/basicExample.occie");
		oldOCCI = Paths.get("./src/de/ugoe/cs/oco/occi2deployment/tests/models/basicExampleWithoutLink.occie");
		comparator = ComparatorFactory.getComparator(version, oldOCCI, newOCCI, null);
		CachedResourceSet.getCache().clear();
		System.out.println("");
		
		System.out.println("Basic Example + NWVM Different Id:");
		oldOCCI = Paths.get("./src/de/ugoe/cs/oco/occi2deployment/tests/models/basicExample.occie");
		newOCCI = Paths.get("./src/de/ugoe/cs/oco/occi2deployment/tests/models/basicExample+NWVM_DiffID.occie");
		comparator = ComparatorFactory.getComparator(version, oldOCCI, newOCCI, null);
		CachedResourceSet.getCache().clear();
		System.out.println("");
		
		System.out.println("BasicExample+NWVM -> TOTest:");
		oldOCCI = Paths.get("./src/de/ugoe/cs/oco/occi2deployment/tests/models/toTest.occie");
		newOCCI = Paths.get("./src/de/ugoe/cs/oco/occi2deployment/tests/models/basicExample+NWVM.occie");
		comparator = ComparatorFactory.getComparator(version, oldOCCI, newOCCI, null);
		CachedResourceSet.getCache().clear();
		System.out.println("");
		*/
	}
}