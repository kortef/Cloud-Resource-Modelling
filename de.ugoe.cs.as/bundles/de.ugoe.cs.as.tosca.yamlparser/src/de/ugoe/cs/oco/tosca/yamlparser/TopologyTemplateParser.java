/**
 * 
 */
package de.ugoe.cs.oco.tosca.yamlparser;

import java.util.List;
import java.util.Map;

import de.ugoe.cs.oco.tosca.TGroupTemplate;
import de.ugoe.cs.oco.tosca.TNodeTemplate;
import de.ugoe.cs.oco.tosca.TPolicyTemplate;
import de.ugoe.cs.oco.tosca.TRelationshipTemplate;
import de.ugoe.cs.oco.tosca.TTopologyTemplate;
import de.ugoe.cs.oco.tosca.ToscaFactory;


/**
 * @author fglaser
 *
 */


public class TopologyTemplateParser extends Parser{

	@SuppressWarnings("unchecked")
	@Override
	public TTopologyTemplate parse(Map<String, ?> input, Parser containingParser) throws ParseException {
		ToscaFactory factory = ToscaFactory.eINSTANCE;
		TTopologyTemplate topologyTemplate = factory.createTTopologyTemplate();
		for (Map.Entry<String, ?> entry: input.entrySet()){
			String key = entry.getKey();
			switch (key){
			case "description":
				break;
			case "inputs":
				LOGGER.warning("Inputs read, but no equivalent in model and hence ignored.");
				break;
			case "node_templates":
				List<TNodeTemplate> nodeTemplates = (List<TNodeTemplate>) new NodeTemplateParser().
					parse((Map<String, ?>) entry.getValue(), topologyTemplate);
				topologyTemplate.getNodeTemplate().addAll(nodeTemplates);
				break;
			case "relationship_templates":
				List<TRelationshipTemplate> relationshipTemplates = (List<TRelationshipTemplate>) 
					new RelationshipTemplateParser().parse((Map<String, ?>) entry.getValue(), null);
				topologyTemplate.getRelationshipTemplate().addAll(relationshipTemplates);
				break;
			case "groups":
				List<TGroupTemplate> groupTemplates = (List<TGroupTemplate>)
					new GroupTemplateParser().parse((Map<String, ?>) entry.getValue(), null);
				topologyTemplate.getGroupTemplate().addAll(groupTemplates);
				LOGGER.warning("Groups read, but no equivalent in model and hence ignored.");
				break;
			case "policies":
				List<TPolicyTemplate> policies = (List<TPolicyTemplate>)
					new PolicyParser().parse((Map<String, ?>) entry.getValue(), null);
				LOGGER.warning("Policies read, but no equivalent in model and hence ignored.");
				break;
			case "outputs":
				LOGGER.warning("Outputs read, but no equivalent in model and hence ignored.");
				break;
			case "substitution_mappings":
				break;
			default:
				throw new ParseException("Key " + key + " is unknown and can not be handled.");
			}
		}

		return topologyTemplate;
	}


	@Override
	public Object parse(List<?> inputArray) throws ParseException {
		// TODO Auto-generated method stub
		return null;
	}

}
