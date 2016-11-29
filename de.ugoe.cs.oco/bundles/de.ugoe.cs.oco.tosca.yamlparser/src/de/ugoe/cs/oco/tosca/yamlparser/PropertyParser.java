/**
 * 
 */
package de.ugoe.cs.oco.tosca.yamlparser;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import org.eclipse.emf.ecore.EObject;

/**
 * @author fglaser
 *
 */
public class PropertyParser extends Parser {

//	/* (non-Javadoc)
//	 * @see de.ugoe.swe.simpaas.tosca.parser.Parser#parse(java.util.Map, org.eclipse.emf.ecore.EObject)
//	 */
//	@SuppressWarnings("unchecked")
//	@Override
//	public List<Property> parse(Map<String, ?> input, EObject model) throws ParseException {
//		//ServiceTemplate template = (ServiceTemplate) model;
//		List<Property> properties = new ArrayList<Property>();
//		Map<String, ? > map = (Map<String, ?>) input;
//		ToscaFactory factory = ToscaFactory.eINSTANCE;
//		
//		for (Entry<String, ?> entry: map.entrySet()){
//			Property property = factory.createProperty();
//			property.setName(entry.getKey());
//			
//			if (entry.getValue() instanceof Map<?,?>){
//				String content;
//				Map<String, ?> innermap = (Map<String, ?>) entry.getValue();
//				if ((content = (String) innermap.get("type")) != null){
//					property.setType(content);
//				}
//				if ((content = (String) innermap.get("description")) != null){
//					Description description = factory.createDescription();
//					description.setValue(content);
//					property.setDescription(description);
//				}
//				if ((content = (String) innermap.get("required")) != null){
//					property.setRequired(Boolean.parseBoolean(content));
//				}
//				if ((content = (String) innermap.get("default")) != null){
//					property.setDefault(content);
//				}
//				if ((content = (String) innermap.get("status")) != null){
//					property.setStatus(PropertyStatus.get(content));
//				}
//	
//				if (innermap.containsKey("entry_schema")){
//					// TODO: Implement
//					//property.setEntrySchema(content);
//				}
//				if (innermap.containsKey("constraints")){
//					ArrayList<?> constraintList = (ArrayList<?>) innermap.get("constraints");
//					List<ConstraintClause> contraints = (List<ConstraintClause>) 
//							new ConstraintClauseParser().parse(constraintList, template);
//					
//					property.getConstraints().addAll(contraints);
//				}
//			}
//			properties.add(property);
//		}
//		
//		return properties;
//		
//	}
//
//	/* (non-Javadoc)
//	 * @see de.ugoe.swe.simpaas.tosca.parser.Parser#parse(java.util.List, org.eclipse.emf.ecore.EObject)
//	 */
//	@SuppressWarnings("unchecked")
//	@Override
//	public List<Property> parse(List<?> input, EObject model) throws ParseException {
//		List<Property> properties = new ArrayList<Property>();
//		for (Object object: input){
//			properties.addAll(this.parse((Map<String, ?>) object, model));
//		}
//		return properties;
//	}

	@Override
	public Object parse(Map<String, ?> inputMap) throws ParseException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object parse(List<?> inputArray) throws ParseException {
		// TODO Auto-generated method stub
		return null;
	}

}
