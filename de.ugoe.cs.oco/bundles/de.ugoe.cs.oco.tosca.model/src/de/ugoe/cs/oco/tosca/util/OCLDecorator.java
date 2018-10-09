package de.ugoe.cs.oco.tosca.util;

import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EcoreFactory;
import org.eclipse.emf.ecore.xml.type.XMLTypePackage;

import de.ugoe.cs.oco.tosca.TCapabilityDefinition;
import de.ugoe.cs.oco.tosca.TEntityType;
import de.ugoe.cs.oco.tosca.TNodeType;
import de.ugoe.cs.oco.tosca.TRequirementDefinition;

public class OCLDecorator {

	static EAnnotation addCapabilityRestrictions(TNodeType nodeType, EAnnotation annotation) {
		if (nodeType.getCapabilityDefinitions() != null && 
				nodeType.getCapabilityDefinitions().getCapabilityDefinition().size() > 0) {
			StringBuilder oclBuilder = new StringBuilder();
			oclBuilder.append("if self.capabilities <> null then self.capabilities.capability->forAll(");
			for (TCapabilityDefinition cType: nodeType.getCapabilityDefinitions().getCapabilityDefinition()) {
				oclBuilder.append("oclIsKindOf(");
				oclBuilder.append(ConverterUtils.toEcoreCompatibleName(ConverterUtils.toEcoreCompatibleName(
						cType.getCapabilityType().getLocalPart().toString())));
				oclBuilder.append(") or ");
			}
			oclBuilder.setLength(oclBuilder.length() - 4);
			oclBuilder.append(") else true endif\n");
			annotation.getDetails().put("restrictsCapabilityTypes", oclBuilder.toString());
		}
		return annotation;
	}

	static EAnnotation addRequirementRestrictions(TNodeType nodeType, EAnnotation annotation) {
		if (nodeType.getRequirementDefinitions() != null && 
				nodeType.getRequirementDefinitions().getRequirementDefinition().size() > 0) {
			StringBuilder oclBuilder = new StringBuilder();
			oclBuilder.append("if self.requirements <> null then self.requirements.requirement->forAll(");
			for (TRequirementDefinition rType: nodeType.getRequirementDefinitions().getRequirementDefinition()) {
				if (rType.getRequirementType() !=  null) {
					oclBuilder.append("oclIsKindOf(");
					oclBuilder.append(ConverterUtils.toEcoreCompatibleName(ConverterUtils.toEcoreCompatibleName(
							rType.getRequirementType().getLocalPart().toString())));
					oclBuilder.append(") or ");
				}
			}
			oclBuilder.setLength(oclBuilder.length() - 4);
			oclBuilder.append(") else true endif\n");
			annotation.getDetails().put("restrictsRequirementTypes", oclBuilder.toString());
		}
		return annotation;
	}

	static EAnnotation addTypeRestrictions(TNodeType nodeType, EAnnotation annotation) {
		StringBuilder oclBuilder = new StringBuilder();
		oclBuilder.append("self.type = self.computeType()");
		annotation.getDetails().put("typeMustBeOfKind" + nodeType.getName(), oclBuilder.toString());
		return annotation;
	}

	static EOperation getComputeTypeOperation(TEntityType entityType){
		EOperation typeOperation = EcoreFactory.eINSTANCE.createEOperation();
		EAnnotation annotation = EcoreFactory.eINSTANCE.createEAnnotation();
		annotation.setSource("http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot");
		annotation.getDetails().put("body", "_'" + XMLTypePackage.eINSTANCE.getNsPrefix() + "'::QName{'" 
				+ entityType.getName() + "'}");
		typeOperation.getEAnnotations().add(annotation);
		
		typeOperation.setName("computeType");
		typeOperation.setEType(XMLTypePackage.eINSTANCE.getEClassifier("QName"));
		
		return typeOperation;
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
