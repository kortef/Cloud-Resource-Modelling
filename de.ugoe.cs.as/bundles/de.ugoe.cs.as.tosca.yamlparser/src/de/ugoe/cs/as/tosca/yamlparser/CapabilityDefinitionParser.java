/**
 * 
 */
package de.ugoe.cs.as.tosca.yamlparser;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.ecore.xml.type.internal.QName;

import de.ugoe.cs.as.tosca.TCapabilityDefinition;
import de.ugoe.cs.as.tosca.ToscaFactory;

/**
 * @author fglaser
 *
 */
public class CapabilityDefinitionParser extends Parser {

	/* (non-Javadoc)
	 * @see de.ugoe.cs.oco.tosca.yamlparser.Parser#parse(java.util.Map, de.ugoe.cs.oco.tosca.yamlparser.Parser)
	 */
	@Override
	public Object parse(Map<String, ?> inputMap, Parser containingParser) throws ParseException {
		List<TCapabilityDefinition> resultList = new ArrayList<>();
		
		for (Map.Entry<String, ?> entry: inputMap.entrySet()){
			TCapabilityDefinition definition = ToscaFactory.eINSTANCE.createTCapabilityDefinition();
			definition.setName(entry.getKey());
			
			if (entry.getValue() instanceof Map){
				for (Map.Entry<String, ?> innerentry: ((Map<String, ?>) entry.getValue()).entrySet()){
					String key = innerentry.getKey();
					switch(key){
					case "type":
						definition.setCapabilityType(new QName((String) innerentry.getValue()));
					}
				
				}
			} else {
				definition.setCapabilityType(new QName((String) entry.getValue()));
			}
			
			resultList.add(definition);
		}
		
		return resultList;
	}

	/* (non-Javadoc)
	 * @see de.ugoe.cs.oco.tosca.yamlparser.Parser#parse(java.util.List)
	 */
	@Override
	public Object parse(List<?> inputArray) throws ParseException {
		// TODO Auto-generated method stub
		return null;
	}

}
