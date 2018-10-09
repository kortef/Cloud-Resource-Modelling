/**
 * 
 */
package de.ugoe.cs.oco.tosca.util;

import java.nio.file.Path;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map.Entry;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EcoreFactory;
import org.eclipse.emf.ecore.impl.EPackageRegistryImpl;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.util.BasicExtendedMetaData;
import org.eclipse.emf.ecore.util.ExtendedMetaData;
import org.eclipse.emf.ecore.xml.type.XMLTypePackage;
import org.eclipse.xsd.XSDSchema;
import org.eclipse.xsd.ecore.XSDEcoreBuilder;
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

/**
 * @author Fabian Korte
 *
 */
public class TOSCADef2Ecore {
	protected final static Logger LOGGER = LoggerFactory.getLogger(TOSCADef2Ecore.class.getName());

	private static List<URI> handledFiles;
	
	private static List<URI> getHandledFiles(){
		if (handledFiles == null) {
			handledFiles = new LinkedList<URI>();
		}
		return handledFiles;
	}
	
	private static EPackage addToscaTypeDefinitions(DefinitionsType definitions, EPackage ePackage, ResourceSet resourceSet) {
		EPackage toscaPackage = ToscaPackage.eINSTANCE;	
		resourceSet.getPackageRegistry().put(ePackage.getNsURI(), ePackage);
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
			
			eClass.getEOperations().add(OCLDecorator.getComputeTypeOperation(cType));
			eClass.getEOperations().add(OCLDecorator.getPropertiesTypeOperation(cType));
		}
		
		for (TRequirementType rType: definitions.getRequirementType()) {
			EClass eClass = EcoreFactory.eINSTANCE.createEClass();
			eClass.setName(ConverterUtils.toEcoreCompatibleName(rType.getName()));
			eClass.getESuperTypes().add((EClass)(toscaPackage.getEClassifier("TRequirement")));
			ePackage.getEClassifiers().add(eClass);
			
			eClass.getEOperations().add(OCLDecorator.getComputeTypeOperation(rType));
			eClass.getEOperations().add(OCLDecorator.getPropertiesTypeOperation(rType));

		}
		
		for (TArtifactType aType: definitions.getArtifactType()) {
			EClass eClass = EcoreFactory.eINSTANCE.createEClass();
			eClass.setName(ConverterUtils.toEcoreCompatibleName(aType.getName()));
			eClass.getESuperTypes().add((EClass)(toscaPackage.getEClassifier("TArtifactTemplate")));
			ePackage.getEClassifiers().add(eClass);
			
			eClass.getEOperations().add(OCLDecorator.getComputeTypeOperation(aType));
			eClass.getEOperations().add(OCLDecorator.getPropertiesTypeOperation(aType));

		}
		
		for (TNodeType nodeType: definitions.getNodeType()) {
			EClass eClass = EcoreFactory.eINSTANCE.createEClass();
			eClass.setName(ConverterUtils.toEcoreCompatibleName(nodeType.getName()));
			eClass.getESuperTypes().add((EClass)(toscaPackage.getEClassifier("TNodeTemplate")));
			ePackage.getEClassifiers().add(eClass);
			StringBuilder constraintStringBuilder = new StringBuilder();
			
			EAnnotation pivotalAnnotation = EcoreFactory.eINSTANCE.createEAnnotation();
			pivotalAnnotation.setSource("http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot");
			
			OCLDecorator.addRequirementRestrictions(nodeType, pivotalAnnotation);
			OCLDecorator.addCapabilityRestrictions(nodeType, pivotalAnnotation);
			OCLDecorator.addTypeRestrictions(nodeType, pivotalAnnotation);
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
			eClass.getEOperations().add(OCLDecorator.getComputeTypeOperation(nodeType));
			eClass.getEOperations().add(OCLDecorator.getPropertiesTypeOperation(nodeType));

		}
		
		for (TRelationshipType relationshipType: definitions.getRelationshipType()) {
			EClass eClass = EcoreFactory.eINSTANCE.createEClass();
			eClass.setName(ConverterUtils.toEcoreCompatibleName(relationshipType.getName()));
			eClass.getESuperTypes().add((EClass)(toscaPackage.getEClassifier("TRelationshipTemplate")));
			ePackage.getEClassifiers().add(eClass);
			
			eClass.getEOperations().add(OCLDecorator.getComputeTypeOperation(relationshipType));
			eClass.getEOperations().add(OCLDecorator.getPropertiesTypeOperation(relationshipType));

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

	public static EPackage getEPackage(URI uri, ResourceSet resourceSet, DefinitionsType definitions) {
		if (getHandledFiles().contains(uri) && EPackage.Registry.INSTANCE.containsKey(definitions.getTargetNamespace()))
			return EPackage.Registry.INSTANCE.getEPackage(definitions.getTargetNamespace());
		
		EPackage ePackage = createEPackage(definitions);
		handleXSDImports(definitions, resourceSet);
		addToscaTypeDefinitions(definitions, ePackage, resourceSet);
		addSuperTypeForProperties(definitions, ePackage, resourceSet);
			
		getHandledFiles().add(uri);
		
		return ePackage;
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
							if (((EClass) root).getEStructuralFeature(attribute.getName()) != null)
								((EClass) root).getEStructuralFeatures().add(attribute);
						}
					}
				}
			}
		}
		return ePackage;
	}
	
	public static void handleXSDImports(DefinitionsType definitions, ResourceSet resourceSet) {
		// make sure required schema definitions are present
		for (TImport imp: definitions.getImport()) {
			if (imp.getImportType().equals(ValidImportTypes.XSD_TYPE)) {
				URI resourceURI = URI.createFileURI(imp.getLocation()).resolve(imp.eResource().getURI());
				if (getHandledFiles().contains(resourceURI)) {
					return;
				}
				EPackage importedPackage = EPackage.Registry.INSTANCE.getEPackage(imp.getNamespace());
				if (importedPackage == null) {
					XSDEcoreBuilder xsdEcoreBuilder = new XSDEcoreBuilder();
					Collection<EObject> ecorePackages = xsdEcoreBuilder.generate(resourceURI);
					Iterator<EObject> iter = ecorePackages.iterator();
					while(iter.hasNext()) {
						EPackage generatedPackage = (EPackage) iter.next();
						EPackage.Registry.INSTANCE.put(generatedPackage.getNsURI(), generatedPackage);
					}
				}
				else {
					XSDSchema schema = (XSDSchema) imp.getResource().getContents().get(0);
					addXSDTypeDefinitions(schema, importedPackage);
				}
			}
		}
		return;
	}
	 
}
