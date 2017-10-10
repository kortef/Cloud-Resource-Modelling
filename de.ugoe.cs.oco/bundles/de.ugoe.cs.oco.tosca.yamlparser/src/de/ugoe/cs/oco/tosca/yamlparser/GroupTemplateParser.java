/**
 * 
 */
package de.ugoe.cs.oco.tosca.yamlparser;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.ecore.xml.type.internal.QName;

import de.ugoe.cs.oco.tosca.PropertiesType;
import de.ugoe.cs.oco.tosca.TGroupTemplate;
import de.ugoe.cs.oco.tosca.ToscaFactory;
/**
 * @author fglaser
 *
 */
public class GroupTemplateParser extends Parser {

	/* (non-Javadoc)
	 * @see de.ugoe.swe.simpaas.tosca.parser.Parser#parse(java.util.Map)
	 */
	@Override
	public Object parse(Map<String, ?> inputMap, Parser containingParser) throws ParseException {
		List<TGroupTemplate> groupTemplates = new ArrayList<TGroupTemplate>();
		for (Map.Entry<String, ?> entry: inputMap.entrySet()){
			TGroupTemplate groupTemplate = ToscaFactory.eINSTANCE.createTGroupTemplate();
			groupTemplate.setName(entry.getKey());
			Map<String, ?> innermap = (Map<String, ?>) entry.getValue();
			String type = (String) innermap.get("type");
			groupTemplate.setType(new QName(type));
			innermap.remove("type");
			
			for (Map.Entry<String, ?> innerentry: innermap.entrySet()){
				String key = innerentry.getKey();
				switch (key){
				case "properties":
					Map<String, Map<String,?>> propertyMap = new HashMap<String, Map<String,?>>();
					propertyMap.put(groupTemplate.getType().toString(), (Map<String, ?>) innerentry.getValue());
					PropertiesType propertiesType = (PropertiesType)
							new PropertyAssignmentParser().parse(propertyMap, null);
					groupTemplate.setProperties(propertiesType);
					break;
				case "members":
					ArrayList<String> members = (ArrayList<String>) innerentry.getValue();
					groupTemplate.getMember().addAll(members);
					break;
				default:
					throw new ParseException("Key " + key + " is unknown and can not be handled.");
				}
			}
			groupTemplates.add(groupTemplate);
		}
		
		return groupTemplates;
	}

	/* (non-Javadoc)
	 * @see de.ugoe.swe.simpaas.tosca.parser.Parser#parse(java.util.List)
	 */
	@Override
	public Object parse(List<?> inputArray) throws ParseException {
		// TODO Auto-generated method stub
		return null;
	}

}
