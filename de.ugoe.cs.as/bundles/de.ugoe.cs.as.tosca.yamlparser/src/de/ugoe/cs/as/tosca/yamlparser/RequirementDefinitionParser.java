/**
 * 
 */
package de.ugoe.cs.as.tosca.yamlparser;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.ecore.xml.type.internal.QName;

import de.ugoe.cs.as.tosca.TCapabilityDefinition;
import de.ugoe.cs.as.tosca.TRequirementDefinition;
import de.ugoe.cs.as.tosca.ToscaFactory;

/**
 * @author fglaser
 *
 */
public class RequirementDefinitionParser extends Parser {

	/* (non-Javadoc)
	 * @see de.ugoe.cs.oco.tosca.yamlparser.Parser#parse(java.util.Map, de.ugoe.cs.oco.tosca.yamlparser.Parser)
	 */
	@Override
	public Object parse(Map<String, ?> inputMap, Parser containingParser) throws ParseException {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see de.ugoe.cs.oco.tosca.yamlparser.Parser#parse(java.util.List)
	 */
	@Override
	public Object parse(List<?> inputArray) throws ParseException {
		List<TRequirementDefinition> resultList = new ArrayList<TRequirementDefinition>();
		for (Object requirmentDefinitionMap : inputArray) {
			Map<String, ?> inputMap = (Map<String, ?>) requirmentDefinitionMap;
			TRequirementDefinition definition = ToscaFactory.eINSTANCE.createTRequirementDefinition();
			
			for (Map.Entry<String, ?> entry: inputMap.entrySet()){
				definition.setName(entry.getKey());
				Map<String, ?> innerMap = (Map<String, ?>) entry.getValue();
				for (Map.Entry<String, ?> innerentry: innerMap.entrySet()){
					String key = innerentry.getKey();
					switch (key){
						case "capability":
							definition.setRequirementType(new QName((String)innerentry.getValue()));
						default:
							break;
					}
				}
			}
			
			resultList.add(definition);
		}
		
		return resultList;
	}

}
