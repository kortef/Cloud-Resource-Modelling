/**
 * 
 */
package de.ugoe.cs.oco.tosca.yamlparser;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import org.eclipse.emf.ecore.EObject;

import de.ugoe.cs.oco.tosca.TParameter;
import de.ugoe.cs.oco.tosca.ToscaFactory;

/**
 * @author fglaser
 *
 */
public class ParameterParser extends Parser {

	/* (non-Javadoc)
	 * @see de.ugoe.swe.simpaas.tosca.parser.Parser#parse(java.util.Map, org.eclipse.emf.ecore.EObject)
	 */
	@SuppressWarnings("unchecked")
	@Override
	public List<TParameter> parse(Map<String, ?> input) throws ParseException {
		List<TParameter> parameters = new ArrayList<TParameter>();
		for (Map.Entry<String, ?> entry: input.entrySet()){
			TParameter parameter = ToscaFactory.eINSTANCE.createTParameter();
			parameter.setName((String) entry.getKey());
			if (entry.getValue() instanceof Map){
				Map<String, ?> innermap = (Map<String, ?>)(entry.getValue());
				for (Map.Entry<String, ?> innerentry: innermap.entrySet()){
					String key = innerentry.getKey();
					switch (key){
					case "type":
						break;
					case "value":
						break;
					case "default":
						parameter.setDefaultValue((String) innerentry.getValue());
						break;
					case "description":
						break;
					case "required":
						break;
					case "contraints":
						break;
					case "entry_schema":
						break;
					case "get_property": 
					case "get_attribute":
					case "get_input":
						String valueString = ToscaModelUtil.buildStringFromMap((Map<String, ?>) entry.getValue());
						parameter.setValue(valueString);
						break;
					default:
						throw new ParseException("Key " + key + " is unknown and can not be handled.");	
					}
				}
			}
			else if (entry.getValue() instanceof List){
				String valueString = ToscaModelUtil.buildStringFromList((List<?>)entry.getValue());
				parameter.setValue(valueString);
			}
			parameters.add(parameter);
		}
		return parameters;
	}

	/* (non-Javadoc)
	 * @see de.ugoe.swe.simpaas.tosca.parser.Parser#parse(java.util.List, org.eclipse.emf.ecore.EObject)
	 */
	@Override
	public List<?> parse(List<?> input) throws ParseException {
		// TODO Auto-generated method stub
		return null;
	}

}
