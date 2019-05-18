package de.ugoe.cs.oco.tosca.yamlparser;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.ecore.xml.type.internal.QName;
import org.eclipse.xsd.XSDComplexTypeDefinition;
import org.eclipse.xsd.XSDElementDeclaration;
import org.eclipse.xsd.XSDFactory;
import org.eclipse.xsd.XSDParticle;
import org.eclipse.xsd.XSDSchema;

import de.ugoe.cs.oco.tosca.CapabilityDefinitionsType;
import de.ugoe.cs.oco.tosca.CapabilityDefinitionsType1;
import de.ugoe.cs.oco.tosca.DerivedFromType2;
import de.ugoe.cs.oco.tosca.InterfacesType;
import de.ugoe.cs.oco.tosca.PropertiesDefinitionType;
import de.ugoe.cs.oco.tosca.RequirementDefinitionsType;
import de.ugoe.cs.oco.tosca.RequirementDefinitionsType1;
import de.ugoe.cs.oco.tosca.TCapabilityDefinition;
import de.ugoe.cs.oco.tosca.TDocumentation;
import de.ugoe.cs.oco.tosca.TInterface;
import de.ugoe.cs.oco.tosca.TNodeType;
import de.ugoe.cs.oco.tosca.TRequirementDefinition;
import de.ugoe.cs.oco.tosca.ToscaFactory;

/**
 * @author Fabian Korte
 *
 */
public class NodeTypeParser extends Parser {
	
	@Override
	public Object parse(Map<String, ?> inputMap, Parser containingParser) throws ParseException {
		TOSCAYamlTemplateParser parser = (TOSCAYamlTemplateParser) containingParser;
		List<TNodeType> resultList = new ArrayList<>();
		for (Map.Entry<String, ?> entry: inputMap.entrySet()){
			TNodeType type = ToscaFactory.eINSTANCE.createTNodeType();
			type.setName(entry.getKey());
			LOGGER.info("Parsing NodeType " + type.getName() + ".");
			for (Map.Entry<String, ?> innerentry: ((Map<String, ?>) entry.getValue()).entrySet()){
				String key = innerentry.getKey();
				switch (key){
					case "derived_from":
						DerivedFromType2 parent = ToscaFactory.eINSTANCE.createDerivedFromType2();
						parent.setTypeRef(new QName((String) innerentry.getValue()));
						type.setDerivedFrom(parent);
						break;
					case "version":
						break;
					case "description":
						TDocumentation documentation = ToscaFactory.eINSTANCE.createTDocumentation();
						documentation.setSource((String) innerentry.getValue());;
						type.getDocumentation().add(documentation);
						break;
					case "properties":
						LOGGER.info("Found Property definition.");	
						XSDSchema schema = parser.getPropertyTypesSchema();
						XSDComplexTypeDefinition propertiesDefinitionXSD =  new PropertyParser().parse((Map<String, ?>) 
								innerentry.getValue(), schema);	
						propertiesDefinitionXSD.setName(type.getName() + "PropertiesType");
						PropertiesDefinitionType propertiesDefinitionType = ToscaFactory.eINSTANCE.createPropertiesDefinitionType();
						propertiesDefinitionType.setType(new QName(propertiesDefinitionXSD.getQName()));
						
						// create top level element declaration to make it instantiable 
						XSDParticle wrapperParticle = XSDFactory.eINSTANCE.createXSDParticle();
						XSDElementDeclaration elementDeclaration = XSDFactory.eINSTANCE.createXSDElementDeclaration();
						wrapperParticle.setContent(elementDeclaration);
						elementDeclaration.setName(propertiesDefinitionXSD.getName());
						elementDeclaration.setTypeDefinition(propertiesDefinitionXSD);
						schema.getContents().add(elementDeclaration);
						 
						type.setPropertiesDefinition(propertiesDefinitionType);
						break;
					case "requirements":
						RequirementDefinitionsType1 requirementDefinition = ToscaFactory.eINSTANCE.createRequirementDefinitionsType1();
						List<TRequirementDefinition> requirements = (List<TRequirementDefinition>) new RequirementDefinitionParser().parse(
								(List<String>) innerentry.getValue());
						
						requirementDefinition.getRequirementDefinition().addAll(requirements);
						type.setRequirementDefinitions(requirementDefinition);
						break;
					case "capabilities":
						CapabilityDefinitionsType1 capabilityDefinition = ToscaFactory.eINSTANCE.createCapabilityDefinitionsType1();
						List<TCapabilityDefinition> capabilities = (List<TCapabilityDefinition>) new CapabilityDefinitionParser().parse(
								(Map<String, ?>) innerentry.getValue(), null);
						
						capabilityDefinition.getCapabilityDefinition().addAll(capabilities);
						type.setCapabilityDefinitions(capabilityDefinition);
						break;
					case "attributes":
						break;
					case "interfaces":
						List<TInterface> interfaceList = (List<TInterface>) 
						new InterfaceParser().parse((Map<String, ?>) innerentry.getValue(), null);
						InterfacesType interfacesType = ToscaFactory.eINSTANCE.createInterfacesType();
						interfacesType.getInterface().addAll(interfaceList);
						type.setInterfaces(interfacesType);	
						break;
					case "artifacts":
						break;
					case "abstract":
						break;
					case "metadata":
						break;
					default:
						throw new ParseException("Unsupported key " + innerentry.getKey() + " read.");
				}
			}
			resultList.add(type);
		}
		return resultList;
		
	}	

	@Override
	public Object parse(List<?> inputArray) throws ParseException {
		throw new ParseException("Parser" + this.getClass().getName() + " does not support parsing Arrays.");
	}
	
}
