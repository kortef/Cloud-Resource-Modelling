/**
 * 
 */
package de.ugoe.cs.oco.tosca.gen.extension;

import java.io.IOException;
import java.util.Collections;
import java.util.Map;
import java.util.Map.Entry;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EcoreFactory;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.impl.EPackageRegistryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.BasicExtendedMetaData;
import org.eclipse.emf.ecore.util.ExtendedMetaData;
import org.eclipse.emf.ecore.xmi.impl.EcoreResourceFactoryImpl;
import org.eclipse.emf.ecore.xml.type.XMLTypePackage;
import org.eclipse.xsd.XSDSchema;
import org.eclipse.xsd.ecore.XSDEcoreBuilder;
import org.eclipse.xsd.util.XSDResourceFactoryImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import de.ugoe.cs.oco.tosca.DefinitionsType;
import de.ugoe.cs.oco.tosca.DocumentRoot;
import de.ugoe.cs.oco.tosca.TArtifactType;
import de.ugoe.cs.oco.tosca.TCapabilityType;
import de.ugoe.cs.oco.tosca.TDefinitions;
import de.ugoe.cs.oco.tosca.TEntityType;
import de.ugoe.cs.oco.tosca.TImport;
import de.ugoe.cs.oco.tosca.TNodeType;
import de.ugoe.cs.oco.tosca.TRelationshipType;
import de.ugoe.cs.oco.tosca.TRequirementType;
import de.ugoe.cs.oco.tosca.ToscaPackage;
import de.ugoe.cs.oco.tosca.ValidImportTypes;
import de.ugoe.cs.oco.tosca.util.ToscaResourceFactoryImpl;

/**
 * @author Fabian Korte
 *
 */
public class TOSCADef2Ecore {
	protected final static Logger LOGGER = LoggerFactory.getLogger(TOSCADef2Ecore.class.getName());

	
	private static EPackage addToscaTypeDefinitions(DefinitionsType definitions, EPackage ePackage, ResourceSet resourceSet) {
		
		//EPackage toscaPackage = getTOSCAPackage();
		EPackage toscaPackage = ToscaPackage.eINSTANCE;	
		extractAndAddRawTypes(definitions, toscaPackage, ePackage);
		extractAndAddSuperTypes(definitions, toscaPackage, ePackage, resourceSet);
		
		return ePackage;
	}

	private static EPackage extractAndAddSuperTypes(DefinitionsType definitions, EPackage toscaPackage, EPackage ePackage, ResourceSet resourceSet) {
		DocumentRoot root = (DocumentRoot) definitions.eContainer();
		for (TCapabilityType cType: definitions.getCapabilityType()) {
			addSuperTypeIfExists(cType, root, ePackage, resourceSet);
		}
		
		for (TRequirementType rType: definitions.getRequirementType()) {
			addSuperTypeIfExists(rType, root, ePackage, resourceSet);
		}
		
		for (TArtifactType aType: definitions.getArtifactType()) {
			addSuperTypeIfExists(aType, root, ePackage, resourceSet);
		}
		
		for (TNodeType nType: definitions.getNodeType()) {
			addSuperTypeIfExists(nType, root, ePackage, resourceSet);
		}
		
		for (TRelationshipType rlType: definitions.getRelationshipType()) {
			addSuperTypeIfExists(rlType, root, ePackage, resourceSet);
		}
			
		return ePackage;
		
	}
	
	private static EPackage addSuperTypeIfExists(TEntityType eType, DocumentRoot root, EPackage ePackage, ResourceSet resourceSet) {
		String name = ConverterUtils.toEcoreCompatibleName(eType.getName());
		if (eType.getDerivedFrom() != null) {
			String superTypeName = ConverterUtils.toEcoreCompatibleName(eType.getDerivedFrom().getTypeRef().getLocalPart());
			String superTypePackagePrefix = eType.getDerivedFrom().getTypeRef().getPrefix();
			LOGGER.debug("Super type package prefix is " + superTypePackagePrefix);
			
			EPackage superTypePackage = null;
			if (superTypePackagePrefix == null || superTypePackagePrefix.equals("")) {
				superTypePackage = ePackage;
			} else {
				String namespace = root.getXMLNSPrefixMap().get(superTypePackagePrefix);
				superTypePackage = resourceSet.getPackageRegistry().getEPackage(namespace);
			}
			
			if (superTypePackage == null) {
				LOGGER.debug("Super type package not found.");
			}	
			
			EClass superType = (EClass) superTypePackage.getEClassifier(superTypeName);
			if (superType == null) {
				LOGGER.debug("Super type '" + superTypeName + "' for '" + name + "'not found.");
			} else {
				EClass type = (EClass) ePackage.getEClassifier((name));
				type.getESuperTypes().clear();
				type.getESuperTypes().add(superType);
			}
		}
		
		return ePackage;
	}

	private static EPackage extractAndAddRawTypes(DefinitionsType definitions, EPackage toscaPackage, EPackage ePackage) {
		for (TCapabilityType cType: definitions.getCapabilityType()) {
			EClass eClass = EcoreFactory.eINSTANCE.createEClass();
			eClass.setName(ConverterUtils.toEcoreCompatibleName(cType.getName()));
			eClass.getESuperTypes().add((EClass)(toscaPackage.getEClassifier("TCapability")));
			ePackage.getEClassifiers().add(eClass);
			
			//eClass.getEOperations().add(OCLGenerator.getComputeTypeOperation(cType));
			//eClass.getEOperations().add(OCLGenerator.getPropertiesTypeOperation(cType));
		}
		
		for (TRequirementType rType: definitions.getRequirementType()) {
			EClass eClass = EcoreFactory.eINSTANCE.createEClass();
			eClass.setName(ConverterUtils.toEcoreCompatibleName(rType.getName()));
			eClass.getESuperTypes().add((EClass)(toscaPackage.getEClassifier("TRequirement")));
			ePackage.getEClassifiers().add(eClass);
			
			//eClass.getEOperations().add(OCLGenerator.getComputeTypeOperation(rType));
			//eClass.getEOperations().add(OCLGenerator.getPropertiesTypeOperation(rType));

		}
		
		for (TArtifactType aType: definitions.getArtifactType()) {
			EClass eClass = EcoreFactory.eINSTANCE.createEClass();
			eClass.setName(ConverterUtils.toEcoreCompatibleName(aType.getName()));
			eClass.getESuperTypes().add((EClass)(toscaPackage.getEClassifier("TArtifactTemplate")));
			ePackage.getEClassifiers().add(eClass);
			
			//eClass.getEOperations().add(OCLGenerator.getComputeTypeOperation(aType));
			//eClass.getEOperations().add(OCLGenerator.getPropertiesTypeOperation(aType));

		}
		
		for (TNodeType nodeType: definitions.getNodeType()) {
			EClass eClass = EcoreFactory.eINSTANCE.createEClass();
			eClass.setName(ConverterUtils.toEcoreCompatibleName(nodeType.getName()));
			eClass.getESuperTypes().add((EClass)(toscaPackage.getEClassifier("TNodeTemplate")));
			ePackage.getEClassifiers().add(eClass);
			StringBuilder constraintStringBuilder = new StringBuilder();
			
			EAnnotation pivotalAnnotation = EcoreFactory.eINSTANCE.createEAnnotation();
			pivotalAnnotation.setSource("http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot");
			
			//OCLGenerator.addRequirementRestrictions(nodeType, pivotalAnnotation);
			//OCLGenerator.addCapabilityRestrictions(nodeType, pivotalAnnotation);
			//OCLGenerator.addTypeRestriction(nodeType, pivotalAnnotation);
			//addPropertyRestrictions(nodeType, pivotalAnnotation);
			
			for (Entry<String, String> entry: pivotalAnnotation.getDetails().entrySet()) {
				constraintStringBuilder.append(entry.getKey());
				constraintStringBuilder.append(" ");
			}
			
			if (constraintStringBuilder.length() > 0) {
				pivotalAnnotation.setEModelElement(eClass);
				// construct Ecore annotation
				EAnnotation ecoreAnnotation = EcoreFactory.eINSTANCE.createEAnnotation();
				ecoreAnnotation.setSource("http://www.eclipse.org/emf/2002/Ecore");
				ecoreAnnotation.setEModelElement(eClass);
				ecoreAnnotation.getDetails().put("constraints", constraintStringBuilder.substring(
						0, constraintStringBuilder.length() - 1));
			}
			// eClass.getEOperations().add(OCLGenerator.getComputeTypeOperation(nodeType));
			// eClass.getEOperations().add(OCLGenerator.getPropertiesTypeOperation(nodeType));
			// eClass.getEOperations().add(OCLGenerator.getCapabilityConstraintOperation(nodeType));

		}
		
		for (TRelationshipType relationshipType: definitions.getRelationshipType()) {
			EClass eClass = EcoreFactory.eINSTANCE.createEClass();
			eClass.setName(ConverterUtils.toEcoreCompatibleName(relationshipType.getName()));
			eClass.getESuperTypes().add((EClass)(toscaPackage.getEClassifier("TRelationshipTemplate")));
			ePackage.getEClassifiers().add(eClass);
			
			// eClass.getEOperations().add(OCLGenerator.getComputeTypeOperation(relationshipType));
			// eClass.getEOperations().add(OCLGenerator.getPropertiesTypeOperation(relationshipType));

		}
		
		return ePackage;
	}

	private static EPackage createEPackage(DefinitionsType definitions) {
		EPackage ePackage = EcoreFactory.eINSTANCE.createEPackage();
	
		ePackage.setName(definitions.getName().replace("-", "").replace(".", ""));
		
		ePackage.setNsURI(definitions.getTargetNamespace());
		ePackage.setNsPrefix(definitions.getName());
		EAnnotation oclImportAnnotation = EcoreFactory.eINSTANCE.createEAnnotation();
		oclImportAnnotation.setSource("http://www.eclipse.org/OCL/Import");
		oclImportAnnotation.getDetails().put(XMLTypePackage.eNS_PREFIX, XMLTypePackage.eNS_URI);
		oclImportAnnotation.setEModelElement(ePackage);
		
		EAnnotation ecoreAnnotation = EcoreFactory.eINSTANCE.createEAnnotation();
		ecoreAnnotation.setSource("http://www.eclipse.org/emf/2002/Ecore");
		ecoreAnnotation.getDetails().put("settingDelegates", "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot");
		ecoreAnnotation.getDetails().put("invocationDelegates", "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot");
		ecoreAnnotation.getDetails().put("validationDelegates", "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot");
		ecoreAnnotation.setEModelElement(ePackage);
		
		return ePackage;
	}

	private static EPackage getTOSCAPackage() {
		// load tosca metamodel to be able to inherit from defined classes
		ResourceSet set = new ResourceSetImpl();
		// only works when actually run as plugin
		final URI uri = URI.createPlatformPluginURI("/de.ugoe.cs.oco.tosca.model/model/tosca.ecore", true);
		Resource res = set.createResource(uri);
		
		try {
			res.load(Collections.EMPTY_MAP);
		} catch (IOException e) {
			e.printStackTrace();
		}
		EPackage toscaPackage = (EPackage) res.getContents().get(0);
		return toscaPackage;
	}
	
	
	
	
	
//	private static EAnnotation addPropertyRestrictions(TNodeType nodeType, EAnnotation annotation){
//		if (nodeType.getPropertiesDefinition() != null) {
//			StringBuilder oclBuilder = new StringBuilder();
//			oclBuilder.append("self.properties.any.get(0).getEStructuralFeature().oclIsKindOf(");
//			oclBuilder.append(nodeType.getPropertiesDefinition().getType());
//			oclBuilder.append(")\n");
//			annotation.getDetails().put("restrictsPropertyType", oclBuilder.toString());
//		}
//		return annotation;
//	}	
	
	/**
	 * Generates a Ecore model from the given TOSCA definition
	 * @param toscaDef Path to the TOSCA definition
	 * @param generatedEcore Path to the generated ecore
	 */
	public static void generateEcore(URI toscaDef, URI generatedEcore) {
		ToscaPackage.eINSTANCE.eClass();
		EcorePackage.eINSTANCE.eClass();
		Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
		
		EcorePlugin.ExtensionProcessor.process(null);
		
		Map<String, Object> m = reg.getExtensionToFactoryMap();
		m.put("tosca", new ToscaResourceFactoryImpl());
		m.put("xml", new ToscaResourceFactoryImpl());
		m.put("ecore", new EcoreResourceFactoryImpl());
		ResourceSet resourceSet = new ResourceSetImpl();
		resourceSet.getURIConverter().getURIMap().putAll(EcorePlugin.computePlatformURIMap(false));
		DefinitionsType definitions = loadToscaDefinitions(toscaDef, resourceSet);
		
		EPackage ePackage = createEPackage(definitions);
		resourceSet.getPackageRegistry().put(ePackage.getNsURI(), ePackage);
		handleImports(definitions, ePackage, resourceSet, toscaDef);
		addToscaTypeDefinitions(definitions, ePackage, resourceSet);
		
		// finally add super classes for Properties
		addSuperTypeForProperties(definitions, ePackage, resourceSet);
		
		// persist metamodel
		try {
			ConverterUtils.persistMetamodel(resourceSet, ePackage, generatedEcore);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	private static EPackage addSuperTypeForProperties(TDefinitions definitions, EPackage ePackage, ResourceSet resourceSet) {
		DocumentRoot root = (DocumentRoot) definitions.eContainer();
		for (TCapabilityType cType: definitions.getCapabilityType()) {
			addPropertySuperTypeIfExists(cType, root, ePackage, resourceSet);
		}
		
		for (TRequirementType rType: definitions.getRequirementType()) {
			addPropertySuperTypeIfExists(rType, root, ePackage, resourceSet);
		}
		
		for (TArtifactType aType: definitions.getArtifactType()) {
			addPropertySuperTypeIfExists(aType, root, ePackage, resourceSet);
		}
		
		for (TNodeType nType: definitions.getNodeType()) {
			addPropertySuperTypeIfExists(nType, root, ePackage, resourceSet);
		}
		
		for (TRelationshipType rlType: definitions.getRelationshipType()) {
			addPropertySuperTypeIfExists(rlType, root, ePackage, resourceSet);
		}
			
		return ePackage;		
	}
		
	private static EPackage addPropertySuperTypeIfExists(TEntityType eType, DocumentRoot root, EPackage ePackage, ResourceSet resourceSet) {
		String name = ConverterUtils.toEcoreCompatibleName(eType.getName());
		if (eType.getDerivedFrom() != null) {
			String superTypeName = ConverterUtils.toEcoreCompatibleName(eType.getDerivedFrom().getTypeRef().getLocalPart());
			String superTypePackagePrefix = eType.getDerivedFrom().getTypeRef().getPrefix();
			LOGGER.debug("Super type package prefix is " + superTypePackagePrefix);
			
			EPackage superTypePackage = null;
			if (superTypePackagePrefix == null || superTypePackagePrefix.equals("") ) {
				superTypePackage = ePackage;
			} else {
				String namespace = root.getXMLNSPrefixMap().get(superTypePackagePrefix);
				if (namespace.equals(ePackage.getNsURI())) {
					LOGGER.debug("Super type belongs to same package.");
					superTypePackage = ePackage;
				} else {
					superTypePackage = resourceSet.getPackageRegistry().getEPackage(namespace);
				}
			}
			
			if (superTypePackage == null) {
				LOGGER.error("Super type package not found.");
			}	
			
			EClass superPropertiesType = (EClass) superTypePackage.getEClassifier(superTypeName + "PropertiesType");
						
			if (superPropertiesType == null) {
				LOGGER.debug("Super properties type '" + superTypeName + "PropertiesType for' '" + name + "PropertiesType' not found.");
			} else {
				if (eType.getPropertiesDefinition() != null) {
					String propertiesName = ConverterUtils.toEcoreCompatibleName(
							eType.getPropertiesDefinition().getType().getLocalPart());
					LOGGER.info("Looking for property type with name " + propertiesName + ".");
					EClass type = (EClass) ePackage.getEClassifier(propertiesName);
					if (type.getESuperTypes() != null)
						type.getESuperTypes().clear();
					type.getESuperTypes().add(superPropertiesType);
				}
			}
		}
		
		return ePackage;
		
	}
	
	private static XSDSchema loadXSD(URI xsdURI) {
		Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
		Map<String, Object> m = reg.getExtensionToFactoryMap();
		m.put("tosca", new XSDResourceFactoryImpl());
		ResourceSet xsdResourceSet = new ResourceSetImpl();
		Resource xsdResource = xsdResourceSet.createResource(xsdURI);
		
		try {
			xsdResource.load(Collections.EMPTY_MAP);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return (XSDSchema) xsdResource.getContents().get(0);
	}
	
	private static DefinitionsType loadToscaDefinitions(URI toscaURI, ResourceSet resourceSet) {
		Resource res = resourceSet.createResource(toscaURI);
		
		try {
			res.load(Collections.EMPTY_MAP);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		DocumentRoot root = (DocumentRoot) res.getContents().get(0);
		return root.getDefinitions().get(0);
	}
	
	private static EPackage addXSDTypeDefinitions(XSDSchema schema, EPackage ePackage) {
		EClassifier root = ePackage.getEClassifier("DocumentRoot");
		
		ExtendedMetaData extendedMetaData = new BasicExtendedMetaData(new EPackageRegistryImpl());
		
		XSDEcoreBuilder builder = new XSDEcoreBuilder(extendedMetaData);
		
		builder.generate(schema);
		
		for (Object object: builder.getXSDComponentToEModelElementMap().values()) {
			if (object instanceof EClassifier) {
				if (ePackage.getEClassifier(((EClassifier) object).getName()) == null)
					ePackage.getEClassifiers().add((EClassifier) object);
			}
			if (object instanceof EReference) {
				EReference attribute = (EReference) object;
				
				if (attribute.getEContainingClass().getName().equals("DocumentRoot")){
					if (root == null) {
						ePackage.getEClassifiers().add(attribute.getEContainingClass());
					}
					else {
						if (root != attribute.getEContainingClass()) {
							if (((EClass) root).getEStructuralFeature(attribute.getName()) == null)
								((EClass) root).getEStructuralFeatures().add(attribute);
						}
					}
				}
			}
		}
		return ePackage;
	}
	
	private static EPackage handleImports(DefinitionsType definitions, EPackage ePackage, ResourceSet resourceSet, URI root) {
		for (TImport imp: definitions.getImport()) {
			// add xsd definitions to current package
			if (imp.getImportType().equals(ValidImportTypes.XSD_TYPE) 
					&& imp.getNamespace().equals(ePackage.getNsURI())) {
				URI fileURI = URI.createFileURI(imp.getLocation());
				fileURI = fileURI.resolve(root);
				XSDSchema schema = loadXSD(fileURI);
				addXSDTypeDefinitions(schema, ePackage);
				// add tosca definitions to resourceset if namespace not allready present					
			} else if (imp.getImportType().equals(ValidImportTypes.TOSCA_TYPE) 
					&& resourceSet.getPackageRegistry().getEPackage(imp.getNamespace()) == null) {
				
				URI fileURI = URI.createFileURI(imp.getLocation());
				fileURI = fileURI.resolve(root);

				DefinitionsType importedDef = loadToscaDefinitions(fileURI, resourceSet);
				EPackage importedPackage = createEPackage(importedDef);
				handleImports(importedDef, importedPackage, resourceSet, fileURI);
				addToscaTypeDefinitions(importedDef, importedPackage, resourceSet);
				resourceSet.getPackageRegistry().put(importedPackage.getNsURI(), importedPackage);
				Resource importedResource = resourceSet.createResource(URI.createURI(importedPackage.getNsURI()));
				importedResource.getContents().add(importedPackage);
			}
		}
		return ePackage;
	}
	 
}
