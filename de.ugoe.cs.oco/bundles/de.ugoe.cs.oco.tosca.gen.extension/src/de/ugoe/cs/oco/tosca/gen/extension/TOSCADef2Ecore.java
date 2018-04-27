/**
 * 
 */
package de.ugoe.cs.oco.tosca.gen.extension;

import java.io.IOException;
import java.nio.file.Path;
import java.util.Collections;
import java.util.Map;
import java.util.Map.Entry;
import java.util.logging.Logger;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EcoreFactory;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.EcoreResourceFactoryImpl;
import org.eclipse.xsd.XSDSchema;
import org.eclipse.xsd.ecore.XSDEcoreBuilder;
import org.eclipse.xsd.util.XSDResourceFactoryImpl;

import de.ugoe.cs.oco.tosca.DefinitionsType;
import de.ugoe.cs.oco.tosca.DocumentRoot;
import de.ugoe.cs.oco.tosca.TArtifactType;
import de.ugoe.cs.oco.tosca.TCapabilityDefinition;
import de.ugoe.cs.oco.tosca.TCapabilityType;
import de.ugoe.cs.oco.tosca.TEntityType;
import de.ugoe.cs.oco.tosca.TNodeType;
import de.ugoe.cs.oco.tosca.TRelationshipType;
import de.ugoe.cs.oco.tosca.TRequirementDefinition;
import de.ugoe.cs.oco.tosca.TRequirementType;
import de.ugoe.cs.oco.tosca.ToscaPackage;
import de.ugoe.cs.oco.tosca.util.ToscaResourceFactoryImpl;

/**
 * @author Fabian Korte
 *
 */
public class TOSCADef2Ecore {
	protected final static Logger LOGGER = Logger.getLogger(TOSCADef2Ecore.class.getName());

	
	private static EPackage convertDefinitions(DefinitionsType definitions) {
		
		EPackage toscaPackage = getTOSCAPackage();
		//EPackage toscaPackage = ToscaPackage.eINSTANCE;	
		EPackage ePackage = createEPackage(definitions);
		extractRawTypes(definitions, toscaPackage, ePackage);
		extractSuperTypes(definitions, toscaPackage, ePackage);
		
		return ePackage;
	}

	private static EPackage extractSuperTypes(DefinitionsType definitions, EPackage toscaPackage, EPackage ePackage) {
		for (TCapabilityType cType: definitions.getCapabilityType()) {
			addSuperTypeIfExists(cType, ePackage);
		}
		
		for (TRequirementType rType: definitions.getRequirementType()) {
			addSuperTypeIfExists(rType, ePackage);
		}
		
		for (TArtifactType aType: definitions.getArtifactType()) {
			addSuperTypeIfExists(aType, ePackage);
		}
		
		for (TNodeType nType: definitions.getNodeType()) {
			addSuperTypeIfExists(nType, ePackage);
		}
		
		for (TRelationshipType rlType: definitions.getRelationshipType()) {
			addSuperTypeIfExists(rlType, ePackage);
		}
			
		return ePackage;
		
	}
	
	private static EPackage addSuperTypeIfExists(TEntityType eType, EPackage ePackage) {
		String name = ConverterUtils.toEcoreCompatibleName(eType.getName());
		if (eType.getDerivedFrom() != null) {
			String superTypeName = ConverterUtils.toEcoreCompatibleName(eType.getDerivedFrom().getTypeRef().getLocalPart());
			EClass superType = (EClass) ePackage.getEClassifier(superTypeName);
			if (superType == null) {
				LOGGER.warning("Super type '" + superTypeName + "' for '" + name + "'not found.");
			} else {
				EClass type = (EClass) ePackage.getEClassifier((name));
				type.getESuperTypes().clear();
				type.getESuperTypes().add(superType);
			}
		}
		
		return ePackage;
	}

	private static EPackage extractRawTypes(DefinitionsType definitions, EPackage toscaPackage, EPackage ePackage) {
		for (TCapabilityType cType: definitions.getCapabilityType()) {
			EClass eClass = EcoreFactory.eINSTANCE.createEClass();
			eClass.setName(ConverterUtils.toEcoreCompatibleName(cType.getName()));
			eClass.getESuperTypes().add((EClass)(toscaPackage.getEClassifier("TCapability")));
			ePackage.getEClassifiers().add(eClass);
		}
		
		for (TRequirementType rType: definitions.getRequirementType()) {
			EClass eClass = EcoreFactory.eINSTANCE.createEClass();
			eClass.setName(ConverterUtils.toEcoreCompatibleName(rType.getName()));
			eClass.getESuperTypes().add((EClass)(toscaPackage.getEClassifier("TRequirement")));
			ePackage.getEClassifiers().add(eClass);
		}
		
		for (TArtifactType aType: definitions.getArtifactType()) {
			EClass eClass = EcoreFactory.eINSTANCE.createEClass();
			eClass.setName(ConverterUtils.toEcoreCompatibleName(aType.getName()));
			eClass.getESuperTypes().add((EClass)(toscaPackage.getEClassifier("TArtifactTemplate")));
			ePackage.getEClassifiers().add(eClass);
		}
		
		for (TNodeType nodeType: definitions.getNodeType()) {
			EClass eClass = EcoreFactory.eINSTANCE.createEClass();
			eClass.setName(ConverterUtils.toEcoreCompatibleName(nodeType.getName()));
			eClass.getESuperTypes().add((EClass)(toscaPackage.getEClassifier("TNodeTemplate")));
			ePackage.getEClassifiers().add(eClass);
			StringBuilder constraintStringBuilder = new StringBuilder();
			
			EAnnotation pivotalAnnotation = EcoreFactory.eINSTANCE.createEAnnotation();
			pivotalAnnotation.setSource("http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot");
			
			//addRequirementRestrictions(nodeType, pivotalAnnotation);
			//addCapabilityRestrictions(nodeType, pivotalAnnotation);
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
		}
		
		for (TRelationshipType relationshipType: definitions.getRelationshipType()) {
			EClass eClass = EcoreFactory.eINSTANCE.createEClass();
			eClass.setName(ConverterUtils.toEcoreCompatibleName(relationshipType.getName()));
			eClass.getESuperTypes().add((EClass)(toscaPackage.getEClassifier("TRelationshipTemplate")));
			ePackage.getEClassifiers().add(eClass);
		}
		
		return ePackage;
	}

	private static EPackage createEPackage(DefinitionsType definitions) {
		EPackage ePackage = EcoreFactory.eINSTANCE.createEPackage();
	
		ePackage.setName(definitions.getName());
		ePackage.setNsURI(definitions.getTargetNamespace());
		ePackage.setNsPrefix(definitions.getName());

		EAnnotation annotation = EcoreFactory.eINSTANCE.createEAnnotation();
		annotation.setSource("http://www.eclipse.org/emf/2002/Ecore");
		annotation.getDetails().put("settingDelegates", "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot");
		annotation.getDetails().put("invocationDelegates", "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot");
		annotation.getDetails().put("validationDelegates", "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot");
		annotation.setEModelElement(ePackage);
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
	
	private static EAnnotation addRequirementRestrictions(TNodeType nodeType, EAnnotation annotation) {
		if (nodeType.getRequirementDefinitions() != null && 
				nodeType.getRequirementDefinitions().getRequirementDefinition().size() > 0) {
			StringBuilder oclBuilder = new StringBuilder();
			oclBuilder.append("self.requirements.requirement->forAll(");
			for (TRequirementDefinition rType: nodeType.getRequirementDefinitions().getRequirementDefinition()) {
				if (rType.getRequirementType() !=  null) {
					// TODO: Check
					oclBuilder.append("oclIsKindOf(");
					oclBuilder.append(ConverterUtils.toEcoreCompatibleName(ConverterUtils.toEcoreCompatibleName(
							rType.getRequirementType().toString())));
					oclBuilder.append(") or ");
				}
			}
			oclBuilder.setLength(oclBuilder.length() - 4);
			oclBuilder.append(")\n");
			annotation.getDetails().put("restrictsRequirementTypes", oclBuilder.toString());
		}
		return annotation;
	}
	
	private static EAnnotation addCapabilityRestrictions(TNodeType nodeType, EAnnotation annotation) {
		if (nodeType.getCapabilityDefinitions() != null && 
				nodeType.getCapabilityDefinitions().getCapabilityDefinition().size() > 0) {
			StringBuilder oclBuilder = new StringBuilder();
			oclBuilder.append("self.capabilities.capability->forAll(");
			for (TCapabilityDefinition cType: nodeType.getCapabilityDefinitions().getCapabilityDefinition()) {
				oclBuilder.append("oclIsKindOf(");
				oclBuilder.append(ConverterUtils.toEcoreCompatibleName(ConverterUtils.toEcoreCompatibleName(
						cType.getCapabilityType().toString())));
				oclBuilder.append(") or ");
			}
			oclBuilder.setLength(oclBuilder.length() - 4);
			oclBuilder.append(")\n");
			annotation.getDetails().put("restrictsCapabilityTypes", oclBuilder.toString());
		}
		return annotation;
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
	public static void generateEcore(Path toscaDef, Path generatedEcore) {
		ToscaPackage.eINSTANCE.eClass();
		EcorePackage.eINSTANCE.eClass();
		Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
		Map<String, Object> m = reg.getExtensionToFactoryMap();
		m.put("tosca", new ToscaResourceFactoryImpl());
		m.put("ecore", new EcoreResourceFactoryImpl());
		ResourceSet resourceSet = new ResourceSetImpl();
		final URI uri = URI.createFileURI(toscaDef.toString());
		Resource res = resourceSet.createResource(uri);
		
		try {
			res.load(Collections.EMPTY_MAP);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		Resource toscaModel = resourceSet.createResource(URI.createPlatformPluginURI("/de.ugoe.cs.oco.tosca.model/model/tosca.ecore", true));
		
		try {
			toscaModel.load(Collections.EMPTY_MAP);
		} catch (IOException e) {
			e.printStackTrace();
		}
		EPackage toscaPackage = (EPackage) toscaModel.getContents().get(0);
		
		DocumentRoot root = (DocumentRoot) res.getContents().get(0);
		DefinitionsType definitions = root.getDefinitions().get(0);
		
		EPackage ePackage = TOSCADef2Ecore.convertDefinitions(definitions);
		
		m.put("tosca", new XSDResourceFactoryImpl());
		ResourceSet xsdResourceSet = new ResourceSetImpl();
		Resource xsdResource = xsdResourceSet.createResource(uri);
		
		try {
			xsdResource.load(Collections.EMPTY_MAP);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			
		XSDSchema schema = (XSDSchema) xsdResource.getContents().get(0);
		XSDEcoreBuilder builder = new XSDEcoreBuilder();
		
		builder.generate(schema);
		
		for (Object object: builder.getXSDComponentToEModelElementMap().values()) {
			if (object instanceof EClassifier) {
				ePackage.getEClassifiers().add((EClassifier) object);
//				if (((EClassifier) object).getName().endsWith("PropertiesType")) {
//					// create wrapper class 
//					EClass eClass = EcoreFactory.eINSTANCE.createEClass();
//					eClass.setName(((EClassifier) object).getName() + "Wrapper");
//					eClass.getESuperTypes().add((EClass)(toscaPackage.getEClassifier("PropertiesType")));
//					EReference reference = EcoreFactory.eINSTANCE.createEReference();
//					reference.setName(((EClassifier) object).getName());
//					reference.setContainment(true);
//					reference.setEType((EClassifier) object);
//					eClass.getEStructuralFeatures().add(reference);
//					ePackage.getEClassifiers().add(eClass);
//				}
			}
			if (object instanceof EReference) {
				EReference attribute = (EReference) object;
				if (attribute.getEContainingClass().getName().equals("DocumentRoot")){
					ePackage.getEClassifiers().add(attribute.getEContainingClass());
				}
			}
		}
		

		try {
			ConverterUtils.persistMetamodel(resourceSet, ePackage, generatedEcore.toString());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
		
	private EClass getToscaTemplateClass(TEntityType entityType) {
		if (entityType instanceof TNodeType) {
			return ToscaPackage.eINSTANCE.getTNodeTemplate();
		}
		
		if (entityType instanceof TRelationshipType) {
			return ToscaPackage.eINSTANCE.getTRelationshipTemplate();
		}
		
		if (entityType instanceof TCapabilityType) {
			return ToscaPackage.eINSTANCE.getTCapability();
		}
		
		if (entityType instanceof TRequirementType) {
			return ToscaPackage.eINSTANCE.getTRequirement();
		}
		return null;
	}
	 
}
