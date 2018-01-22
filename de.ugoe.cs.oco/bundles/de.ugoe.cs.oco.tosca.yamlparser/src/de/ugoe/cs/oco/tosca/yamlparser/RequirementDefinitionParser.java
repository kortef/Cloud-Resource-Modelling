/**
 * 
 */
package de.ugoe.cs.oco.tosca.yamlparser;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import de.ugoe.cs.oco.tosca.TCapabilityDefinition;
import de.ugoe.cs.oco.tosca.TRequirementDefinition;
import de.ugoe.cs.oco.tosca.ToscaFactory;

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
			// We expect only one entry
			if (inputMap.size() > 1){
				throw new ParseException("There should be only one requirement element in map.");
			}
			for (Map.Entry<String, ?> entry: inputMap.entrySet()){
				definition.setName(entry.getKey());
			}
			
			resultList.add(definition);
		}
		
		return resultList;
	}

}
