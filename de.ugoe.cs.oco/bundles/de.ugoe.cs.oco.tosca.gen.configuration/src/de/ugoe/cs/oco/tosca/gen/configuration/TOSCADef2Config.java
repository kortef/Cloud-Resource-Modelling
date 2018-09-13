package de.ugoe.cs.oco.tosca.gen.configuration;

import java.io.IOException;
import java.nio.file.Path;
import java.util.Collections;
import java.util.Map;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.impl.EAttributeImpl;
import org.eclipse.emf.ecore.impl.EStructuralFeatureImpl.SimpleFeatureMapEntry;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.ExtendedMetaData;
import org.eclipse.emf.ecore.xmi.impl.EcoreResourceFactoryImpl;
import org.eclipse.emf.ecore.xmi.impl.XMLResourceFactoryImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import de.ugoe.cs.oco.tosca.DocumentRoot;
import de.ugoe.cs.oco.tosca.TCapability;
import de.ugoe.cs.oco.tosca.TEntityTemplate;
import de.ugoe.cs.oco.tosca.TGroupTemplate;
import de.ugoe.cs.oco.tosca.TNodeTemplate;
import de.ugoe.cs.oco.tosca.TRelationshipTemplate;
import de.ugoe.cs.oco.tosca.TRequirement;
import de.ugoe.cs.oco.tosca.TTopologyTemplate;
import de.ugoe.cs.oco.tosca.ToscaPackage;
import de.ugoe.cs.oco.tosca.util.ToscaResourceFactoryImpl;


public class TOSCADef2Config {
	protected final static Logger LOGGER = LoggerFactory.getLogger(TOSCADef2Config.class.getName());
	
	public static void generateConfiguration(Path toscaDef, Path toscaConfig) {
		ToscaPackage.eINSTANCE.eClass();
		EcorePackage.eINSTANCE.eClass();
		Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
		
		Map<String, Object> m = reg.getExtensionToFactoryMap();
		m.put("tosca", new ToscaResourceFactoryImpl());
		m.put("toscac", new ToscaResourceFactoryImpl());
		m.put("xml", new XMLResourceFactoryImpl());
		m.put("ecore", new EcoreResourceFactoryImpl());
		ResourceSet resourceSet = new ResourceSetImpl();
		DocumentRoot root = loadToscaRoot(URI.createFileURI(toscaDef.toString()), resourceSet);
		
		Resource resource = resourceSet.createResource(URI.createFileURI(toscaConfig.toString()));
		resource.getContents().add(root);
		
		root.getXMLNSPrefixMap().put("xsi", "http://www.w3.org/2001/XMLSchema-instance");
		
		// We assume one definition per file with one service template per definition
		TTopologyTemplate template = root.getDefinitions().get(0).getServiceTemplate().get(0).getTopologyTemplate();		
		
		for (TNodeTemplate node: template.getNodeTemplate()) {
			addXSIType(node);
			if (node.getRequirements() != null) {
				for (TRequirement requirement: node.getRequirements().getRequirement()) {
					addXSIType(requirement);
				}
			}
			if (node.getCapabilities() != null) {
				for (TCapability capability: node.getCapabilities().getCapability()) {
					addXSIType(capability);
				}
			}
		}
		
		for (TRelationshipTemplate rel: template.getRelationshipTemplate()) {
			addXSIType(rel);
		}
		
		for (TGroupTemplate group: template.getGroupTemplate()) {
			addXSIType(group);
		}
		
		
		
		try {
			resource.save(Collections.EMPTY_MAP);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
	}
	
	private static DocumentRoot loadToscaRoot(URI toscaURI, ResourceSet resourceSet) {
		Resource res = resourceSet.createResource(toscaURI);
		
		try {
			res.load(Collections.EMPTY_MAP);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		DocumentRoot root = (DocumentRoot) res.getContents().get(0);
		return root;
	}
	
	private static EAttributeImpl addXSIType(TEntityTemplate template) {
		ExtendedMetaData metadata = ExtendedMetaData.INSTANCE;
		EAttributeImpl attribute = (EAttributeImpl) metadata.demandFeature(
				"http://www.w3.org/2001/XMLSchema-instance", "type", false);
	    SimpleFeatureMapEntry extensionEntry = new SimpleFeatureMapEntry(attribute, 
	    		//new String(template.getType().getNamespaceURI() + "//" + template.getType().getLocalPart()));
	    		new String(template.getType().getPrefix() + ":" + template.getType().getLocalPart()));
	    template.getAnyAttribute().add(extensionEntry);
		return attribute;
	}
}
