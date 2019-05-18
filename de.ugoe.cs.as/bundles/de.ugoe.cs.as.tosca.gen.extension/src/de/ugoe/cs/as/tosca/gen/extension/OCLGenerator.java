package de.ugoe.cs.as.tosca.gen.extension;

import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EcoreFactory;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.xml.type.XMLTypePackage;

import de.ugoe.cs.as.tosca.DocumentRoot;
import de.ugoe.cs.as.tosca.TCapabilityDefinition;
import de.ugoe.cs.as.tosca.TEntityType;
import de.ugoe.cs.as.tosca.TNodeType;
import de.ugoe.cs.as.tosca.TRequirementDefinition;

public class OCLGenerator {

	static EAnnotation addCapabilityRestrictions(TNodeType nodeType, EAnnotation annotation) {
		annotation.getDetails().put("restrictsCapabilityTypes", "validateCapabilityConstraints()\n");
		return annotation;
	}

	static EAnnotation addTypeRestriction(TEntityType entityType, EAnnotation annotation) {
		annotation.getDetails().put("restrictsTypeString", "self.type = computeType()\n");
		return annotation;
	}

	static EAnnotation addRequirementRestrictions(TNodeType nodeType, EAnnotation annotation) {
		if (nodeType.getRequirementDefinitions() != null && 
				nodeType.getRequirementDefinitions().getRequirementDefinition().size() > 0) {
			StringBuilder oclBuilder = new StringBuilder();
			oclBuilder.append("if self.capabilities <> null then self.requirements.requirement->forAll(");
			for (TRequirementDefinition rType: nodeType.getRequirementDefinitions().getRequirementDefinition()) {
				if (rType.getRequirementType() !=  null) {
					// TODO: Check
					oclBuilder.append("oclIsKindOf(");
					oclBuilder.append(ConverterUtils.toEcoreCompatibleName(
							rType.getRequirementTypeRef().getName().toString()));
					oclBuilder.append(") or ");
				}
			}
			oclBuilder.setLength(oclBuilder.length() - 4);
			oclBuilder.append(") else true endif\n");
			annotation.getDetails().put("restrictsRequirementTypes", oclBuilder.toString());
		}
		return annotation;
	}

	static EOperation getComputeTypeOperation(TEntityType entityType){
		EOperation typeOperation = EcoreFactory.eINSTANCE.createEOperation();
		EAnnotation annotation = EcoreFactory.eINSTANCE.createEAnnotation();
		annotation.setSource("http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot");
		DocumentRoot root = (DocumentRoot) entityType.eResource().getContents().get(0);
		annotation.getDetails().put("body", "_'" + XMLTypePackage.eINSTANCE.getNsPrefix() + "'::QName{'"
				+ root.getDefinitions().get(0).getTargetNamespace() + "','"
				+ entityType.getName() + "'}");
		typeOperation.getEAnnotations().add(annotation);
		
		typeOperation.setName("computeType");
		typeOperation.setEType(XMLTypePackage.eINSTANCE.getEClassifier("QName"));
		
		return typeOperation;
	}
	
	static EOperation getCapabilityConstraintOperation(TNodeType nodeType) {
		EOperation capabilityOperation = EcoreFactory.eINSTANCE.createEOperation();
		EAnnotation annotation = EcoreFactory.eINSTANCE.createEAnnotation();
		annotation.setSource("http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot");
		capabilityOperation.getEAnnotations().add(annotation);
		
		if (nodeType.getCapabilityDefinitions() != null && 
				nodeType.getCapabilityDefinitions().getCapabilityDefinition().size() > 0) {
			StringBuilder oclBuilder = new StringBuilder();
			oclBuilder.append("if self.capabilities <> null then self.capabilities.capability->forAll(");
			for (TCapabilityDefinition cType: nodeType.getCapabilityDefinitions().getCapabilityDefinition()) {
				oclBuilder.append("oclIsKindOf(");
				if (cType.eResource() != cType.getCapabilityTypeRef().eResource()) {
					oclBuilder.append("_'" + cType.eResource().getResourceSet().getPackageRegistry().getEPackage(
						ConverterUtils.getNamespace(cType.getCapabilityTypeRef())).getNsPrefix() + "'");
					oclBuilder.append("::");
				}
				oclBuilder.append(ConverterUtils.toEcoreCompatibleName(
						cType.getCapabilityTypeRef().getName().toString()));
				oclBuilder.append(") or ");
			}
			oclBuilder.setLength(oclBuilder.length() - 4);
			oclBuilder.append(") else true endif\n");
			annotation.getDetails().put("body", oclBuilder.toString());
		} else {
			annotation.getDetails().put("body", "true");
		}
		
		capabilityOperation.setName("validateCapabilityConstraints");
		capabilityOperation.setEType(EcorePackage.eINSTANCE.getEClassifier("EBoolean"));
		
		return capabilityOperation;

	}

	static EOperation getPropertiesTypeOperation(TEntityType entityType) {
		EOperation typeOperation = EcoreFactory.eINSTANCE.createEOperation();
		EAnnotation annotation = EcoreFactory.eINSTANCE.createEAnnotation();
		annotation.setSource("http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot");
		if (entityType.getPropertiesDefinition() != null) {
			annotation.getDetails().put("body", "_'" + XMLTypePackage.eINSTANCE.getNsPrefix() + "'::QName{'" 
						+ entityType.getPropertiesDefinition().getElement().getLocalPart() + "'}");
		}
		else {
			annotation.getDetails().put("body", "null");	
		}
		typeOperation.getEAnnotations().add(annotation);
		
		
		typeOperation.setName("computePropertiesType");
		typeOperation.setEType(XMLTypePackage.eINSTANCE.getEClassifier("QName"));
		
		return typeOperation;
		
	}

}
