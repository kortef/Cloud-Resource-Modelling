/**
 * 
 */
package de.ugoe.cs.oco.tosca.yamlparser;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.xsd.XSDFactory;
import org.eclipse.xsd.XSDSchema;

import de.ugoe.cs.oco.tosca.DefinitionsType;
import de.ugoe.cs.oco.tosca.DocumentRoot;
import de.ugoe.cs.oco.tosca.InputParametersType;
import de.ugoe.cs.oco.tosca.TArtifactType;
import de.ugoe.cs.oco.tosca.TCapabilityType;
import de.ugoe.cs.oco.tosca.TGroupType;
import de.ugoe.cs.oco.tosca.TImport;
import de.ugoe.cs.oco.tosca.TNodeType;
import de.ugoe.cs.oco.tosca.TParameter;
import de.ugoe.cs.oco.tosca.TPlan;
import de.ugoe.cs.oco.tosca.TPlans;
import de.ugoe.cs.oco.tosca.TPolicyType;
import de.ugoe.cs.oco.tosca.TRelationshipType;
import de.ugoe.cs.oco.tosca.TServiceTemplate;
import de.ugoe.cs.oco.tosca.TTopologyTemplate;
import de.ugoe.cs.oco.tosca.ToscaFactory;

/**
 * @author Fabian Korte
 *
 */
public class TOSCAYamlTemplateParser extends Parser{
	private HashMap<String, TServiceTemplate> importedTemplates = 
			new HashMap<String, TServiceTemplate>();
	
	private TServiceTemplate serviceTemplate = null;
	private XSDSchema propertyTypes = null;
	private String targetNameSpace = "http://www.test.com/example";

	
	public Object parse(Map<String, ?> inputMap, Parser parser) throws ParseException {
		
		DocumentRoot root = ToscaFactory.eINSTANCE.createDocumentRoot();
		root.getXMLNSPrefixMap().put("xs", "http://www.w3.org/2001/XMLSchema");
		
		DefinitionsType definitions = ToscaFactory.eINSTANCE.createDefinitionsType();
		root.getDefinitions().add(definitions);
		
		for (Map.Entry<String, ?> entry: inputMap.entrySet()){
			String key = entry.getKey();
			switch (key){
			case "inputs":
				LOGGER.info("Inputs read in Service Template, creating new Plan with inputs.");
				TServiceTemplate serviceTemplate = this.getServiceTemplate();
				TPlan defaultPlan = ToscaFactory.eINSTANCE.createTPlan();
				InputParametersType parameterType = ToscaFactory.eINSTANCE.createInputParametersType();
				List<TParameter> parameters = (List<TParameter>)
						new ParameterParser().parse((Map<String, ?>) entry.getValue(), this);
				parameterType.getInputParameter().addAll(parameters);
				defaultPlan.setInputParameters(parameterType);
				TPlans plans = serviceTemplate.getPlans();
				if (plans == null){
					plans = ToscaFactory.eINSTANCE.createTPlans();
					serviceTemplate.setPlans(plans);
				}
				plans.getPlan().add(defaultPlan);
				break;
			case "tosca_definitions_version":
				break;
			case "metadata":
				break;
			case "description":
				break;
			case "dsl_definitions":
				break;
			case "repositories":
				break;
			case "imports":
				List<TImport> imports = (List<TImport>)
					new ImportParser().parse((List<?>)entry.getValue());
				root.getDefinitions().get(0).getImport().addAll(imports);
				break;
			case "artifact_types":
				List<TArtifactType> artifactTypes = (List<TArtifactType>)
					new ArtifactTypeParser().parse((Map<String, ?>)entry.getValue(), this);
				root.getDefinitions().get(0).getArtifactType().addAll(artifactTypes);
				break;
			case "data_types":
				LOGGER.warning("Datatypes read, but no correspondence in model, hence ignored.");
				break;
			case "capability_types":
				List<TCapabilityType> capabilityTypes = (List<TCapabilityType>)
					new CapabilityTypeParser().parse((Map<String, ?>)entry.getValue(), this);
				root.getDefinitions().get(0).getCapabilityType().addAll(capabilityTypes);
				break;
			case "interface_types":
				LOGGER.warning("Interfaces read, but no correspondence in model, hence ignored.");
				break;
			case "relationship_types":
				List<TRelationshipType> relationshipTypes = (List<TRelationshipType>)
					new RelationshipTypeParser().parse((Map<String, ?>) entry.getValue(), this);
				root.getDefinitions().get(0).getRelationshipType().addAll(relationshipTypes);
				break;
			case "node_types":
				List<TNodeType> types = (List<TNodeType>) 
						new NodeTypeParser().parse((Map<String, ?>)entry.getValue(), this);
				root.getDefinitions().get(0).getNodeType().addAll(types);
				break;
			case "group_types":
				List<TGroupType> groups = (List<TGroupType>)
					new GroupTypeParser().parse((Map<String, ?>)entry.getValue(), null);
				root.getDefinitions().get(0).getGroupType().addAll(groups);
				break;
			case "policy_types":
				List<TPolicyType> policyTypes = (List<TPolicyType>)
						new PolicyTypeParser().parse((Map<String, ?>)entry.getValue(), null);
				root.getDefinitions().get(0).getPolicyType().addAll(policyTypes);
				break;		
			case "topology_template":
				TTopologyTemplate template = (TTopologyTemplate)
					new TopologyTemplateParser().parse((Map<String, ?>)entry.getValue(), null);
				TServiceTemplate st = this.getServiceTemplate();
				st.setTopologyTemplate(template);
				root.getDefinitions().get(0).getServiceTemplate().add(st);
				break;
			default:
				throw new ParseException("Key " + key + " is unknown and can not be handled.");	
			}
		}
		return root;
	}

	@Override
	public Object parse(List<?> inputArray) throws ParseException {
		// TODO Auto-generated method stub
		return null;
	}
	
	public XSDSchema getPropertyTypesSchema(){
		if (propertyTypes == null){
			propertyTypes = XSDFactory.eINSTANCE.createXSDSchema();
			propertyTypes.setSchemaLocation("http://www.w3.org/2001/XMLSchema");
			propertyTypes.setSchemaForSchemaQNamePrefix("xs");
			propertyTypes.setTargetNamespace(this.targetNameSpace);
			propertyTypes.getQNamePrefixToNamespaceMap().put("xs", "http://www.w3.org/2001/XMLSchema");			
		}
		return propertyTypes;
	}
	
	public void setTargetNamespace(String targetNamespace){
		this.targetNameSpace = targetNamespace;
		
		if (propertyTypes != null){
			propertyTypes.setTargetNamespace(this.targetNameSpace);
			propertyTypes.setSchemaForSchemaQNamePrefix("customtypes");
		}
	}
	
	private TServiceTemplate getServiceTemplate(){
		if (serviceTemplate == null){
			serviceTemplate = ToscaFactory.eINSTANCE.createTServiceTemplate();
		}
		return serviceTemplate;
	}
	
}
