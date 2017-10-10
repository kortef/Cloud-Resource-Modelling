/**
 * 
 */
package de.ugoe.cs.oco.tosca.yamlparser;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.xml.namespace.QName;

import de.ugoe.cs.oco.tosca.CapabilitiesType;
import de.ugoe.cs.oco.tosca.InterfacesType;
import de.ugoe.cs.oco.tosca.PropertiesType;
import de.ugoe.cs.oco.tosca.RequirementsType;
import de.ugoe.cs.oco.tosca.SourceElementType;
import de.ugoe.cs.oco.tosca.TCapability;
import de.ugoe.cs.oco.tosca.TDeploymentArtifact;
import de.ugoe.cs.oco.tosca.TDeploymentArtifacts;
import de.ugoe.cs.oco.tosca.TInterface;
import de.ugoe.cs.oco.tosca.TNodeTemplate;
import de.ugoe.cs.oco.tosca.TRelationshipTemplate;
import de.ugoe.cs.oco.tosca.TRequirement;
import de.ugoe.cs.oco.tosca.TTopologyTemplate;
import de.ugoe.cs.oco.tosca.ToscaFactory;

/**
 * @author fglaser
 *
 */
public class NodeTemplateParser extends Parser{

	/* (non-Javadoc)
	 * @see de.ugoe.swe.simpaas.tosca.parser.Parser#parse(java.util.Map, org.eclipse.emf.ecore.EObject)
	 */
	@SuppressWarnings("unchecked")
	public Object parse(Map<String, ?> inputMap, TTopologyTemplate father) throws ParseException {
		List<TNodeTemplate> resultList = new ArrayList<TNodeTemplate>();
		for (Map.Entry<String, ?> entry: inputMap.entrySet()){
			TNodeTemplate template = ToscaFactory.eINSTANCE.createTNodeTemplate();
			template.setName(entry.getKey());
			// set type first
			Map<String, ?> valueMap =  (Map<String, ?>) entry.getValue();
			template.setType(new QName((String) valueMap.get("type")));
			valueMap.remove("type");
			
			for (Map.Entry<String, ?> innerentry: valueMap.entrySet()){
				String key = innerentry.getKey();
				switch (key){
					case "type":
						template.setType(new QName((String) innerentry.getValue()));
						break;
					case "description":
						break;
					case "directives":
						break;
					case "properties":
						Map<String, Map<String,?>> propertyMap = new HashMap<String, Map<String,?>>();
						propertyMap.put(template.getType().toString(), (Map<String, ?>) innerentry.getValue());
						PropertiesType propertiesType = (PropertiesType)
								new PropertyAssignmentParser().parse(propertyMap, null);
						template.setProperties(propertiesType);;
						break;
					case "attributes":
						break;
					case "requirements":
						List<TRequirement> requirementList = (List<TRequirement>) 
								new RequirementParser().parse((Map<String, ?>) innerentry.getValue(), null);
						RequirementsType requirements = ToscaFactory.eINSTANCE.createRequirementsType();
						requirements.getRequirement().addAll(requirementList);
						template.setRequirements(requirements);
						break;
					case "capabilities":
						List<TCapability> capabilitesList = (List<TCapability>)
								new CapabilityParser().parse((Map<String, ?>) innerentry.getValue(), null);
						CapabilitiesType capabilites = ToscaFactory.eINSTANCE.createCapabilitiesType();
						capabilites.getCapability().addAll(capabilitesList);
						template.setCapabilities(capabilites);
						break;
					case "interfaces":
						List<TInterface> interfaceList = (List<TInterface>) 
								new InterfaceParser().parse((Map<String, ?>) innerentry.getValue(), null);
						InterfacesType interfacesType = ToscaFactory.eINSTANCE.createInterfacesType();
						interfacesType.getInterface().addAll(interfaceList);
						template.setInterfaces(interfacesType);
						LOGGER.warning("Read interfaces, using non standardized model element");
						break;
					case "artifacts":
						List<TDeploymentArtifact> artifactsList = (List<TDeploymentArtifact>)
								new ArtifactParser().parse((Map<String, ?>)innerentry.getValue(), null);
						TDeploymentArtifacts artifacts = ToscaFactory.eINSTANCE.createTDeploymentArtifacts();
						artifacts.getDeploymentArtifact().addAll(artifactsList);
						template.setDeploymentArtifacts(artifacts);
						break;
					case "node_filter":
						break;
					case "copy":
						break;
					case "relationships":
						// This is non-conformant to the standard but needed to parse Cloudify templates
						LOGGER.warning("Read relationships inside NodeTemplates, which is non conformant to the standard.");
						List<TRelationshipTemplate> relationshipList = (List<TRelationshipTemplate>)
								new RelationshipTemplateParser().parse((List<Map<String, ?>>) innerentry.getValue());
						for (TRelationshipTemplate relationship: relationshipList){
							SourceElementType source = ToscaFactory.eINSTANCE.createSourceElementType();
							source.setRef((String) template.getName());
							relationship.setSourceElement(source);
							father.getRelationshipTemplate().add(relationship);
						}
						break;
					default:
						LOGGER.warning("Unsupported key " + innerentry.getKey() + " read.");
				}
			}
			resultList.add(template);
		}
		return resultList;
	}

	@Override
	public Object parse(List<?> inputArray) throws ParseException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object parse(Map<String, ?> inputMap, Parser containingParser) throws ParseException {
		// TODO Auto-generated method stub
		return null;
	}
}
