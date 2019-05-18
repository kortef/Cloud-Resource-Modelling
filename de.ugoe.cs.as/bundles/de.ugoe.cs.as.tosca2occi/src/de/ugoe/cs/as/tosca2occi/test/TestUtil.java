package de.ugoe.cs.as.tosca2occi.test;

import java.io.File;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import org.eclipse.cmf.occi.core.Extension;
import org.eclipse.cmf.occi.core.OCCIPackage;
import org.eclipse.cmf.occi.core.util.OCCIResourceFactoryImpl;
import org.eclipse.cmf.occi.core.util.OcciRegistry;
import org.eclipse.cmf.occi.infrastructure.InfrastructurePackage;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.epsilon.emc.emf.CachedResourceSet;
import org.modmacao.ansibleconfiguration.AnsibleconfigurationPackage;
import org.modmacao.placement.PlacementPackage;

import modmacao.ModmacaoPackage;
import openstackruntime.OpenstackruntimePackage;
import ossweruntime.OssweruntimePackage;




public class TestUtil {
	protected static void loadAndRegisterOCCIExtensions(String basepath, ResourceSet set) {
		if (basepath != null && set != null) {
			List<File> occiExtFileList =  new LinkedList<File>();
			List<Resource> occiExtResources = new LinkedList<Resource>();
			File inputDir = new File(basepath); 
			try {
				for (File file: inputDir.listFiles()) {
					if (file.getName().endsWith(".occie")) {
						occiExtFileList.add(file);
					}
				}

				for (File file: occiExtFileList) {
					System.out.println("Found extension file: " + file);
					URI uri = URI.createFileURI(file.getAbsolutePath());
					Resource resource = set.getResource(uri, true);
					Extension extension = (Extension) resource.getContents().get(0);
					Resource inMemoryResource = set.createResource(URI.createURI(extension.getScheme()));
					inMemoryResource.getContents().add(extension);
					occiExtResources.add(inMemoryResource);
					OcciRegistry.getInstance().registerExtension(extension.getScheme(), uri.toString());
				}

			} catch (Exception e) {}
		}
	    
		OcciRegistry.getInstance().registerExtension(InfrastructurePackage.eNS_URI.replaceFirst("/ecore", "#"),
				InfrastructurePackage.class.getClassLoader().getResource("model/Infrastructure.occie").toString());
		OcciRegistry.getInstance().registerExtension(ModmacaoPackage.eNS_URI.replaceFirst("/ecore", "#"),
				ModmacaoPackage.class.getClassLoader().getResource("model/modmacao.occie").toString());
		OcciRegistry.getInstance().registerExtension(OCCIPackage.eNS_URI.replaceFirst("/ecore", "#"),
				OCCIPackage.class.getClassLoader().getResource("model/Core.occie").toString());
		OcciRegistry.getInstance().registerExtension(OssweruntimePackage.eNS_URI.replaceFirst("/ecore", "#"),
				OssweruntimePackage.class.getClassLoader().getResource("model/ossweruntime.occie").toString());
		OcciRegistry.getInstance().registerExtension(OpenstackruntimePackage.eNS_URI.replaceFirst("/ecore", "#"),
				OpenstackruntimePackage.class.getClassLoader().getResource("model/openstackruntime.occie").toString());
		OcciRegistry.getInstance().registerExtension(AnsibleconfigurationPackage.eNS_URI.replaceFirst("/ecore", "#"),
				AnsibleconfigurationPackage.class.getClassLoader().getResource("model/ansibleconfiguration.occie").toString());
	
	}
	

	
	protected static void initializePackages() {
		CachedResourceSet.getCache().clear();
		OCCIPackage.eINSTANCE.eClass();
		InfrastructurePackage.eINSTANCE.eClass();
		ModmacaoPackage.eINSTANCE.eClass();
		OpenstackruntimePackage.eINSTANCE.eClass();
		PlacementPackage.eINSTANCE.eClass();
		OssweruntimePackage.eINSTANCE.eClass();
		AnsibleconfigurationPackage.eINSTANCE.eClass();
	}
	
	protected static void initializeRuntime() {
		EcorePlugin.ExtensionProcessor.process(null);
	}
	
	
	protected static void registerFactories() {
		Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
	    Map<String, Object> m = reg.getExtensionToFactoryMap();
	    m.put("occie", new OCCIResourceFactoryImpl());
	    m.put("occic", new OCCIResourceFactoryImpl());
	    m.put("*", new XMIResourceFactoryImpl());
		
	}
}
