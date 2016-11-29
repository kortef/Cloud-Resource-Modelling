/**
 * 
 */
package de.ugoe.cs.oco.tosca.yamlparser;

import java.util.List;
import java.util.Map;

/**
 * @author fglaser
 *
 */
public class RelationshipTypeParser extends Parser {

//	/* (non-Javadoc)
//	 * @see de.ugoe.swe.simpaas.tosca.parser.Parser#parse(java.util.Map, org.eclipse.emf.ecore.EObject)
//	 */
//	@SuppressWarnings("unchecked")
//	@Override
//	public List<TRelationshipType> parse(Map<String, ?> input, EObject model) throws ParseException {
//		List<TRelationshipType> relationshipTypes = new ArrayList<TRelationshipType>();
//		ToscaFactory factory = ToscaFactory.eINSTANCE;
//		//ToscaUtilFactory utilfactory = ToscaUtilFactory.eINSTANCE;
//		//ServiceTemplate template = (ServiceTemplate) model;
//		String content;
//		for (Entry<String, ?> entry: input.entrySet()){
//			TRelationshipType relationshipType = factory.createTRelationshipType();
//			relationshipType.setName(entry.getKey());
//						
//			if (entry.getValue() instanceof Map<?, ?>){
//				Map<String, ?> innermap = (Map<String, ?>) entry.getValue();
//				if ((content = (String) innermap.get("derived_from")) != null){
//					try{
//						DerivedFromType2 derivedFrom = factory.createDerivedFromType2();
//						QName type = new QName(content);
//						derivedFrom.setTypeRef(type);
//						relationshipType.setDerivedFrom(derivedFrom);
//					} catch(UnknownTypeException e){
//						throw new ParseException(e.getMessage());
//					}
//				}
//				
//				if ((content = (String) innermap.get("version")) != null){
//					// TODO: implement
//				}
//				
//				if ((content = (String) innermap.get("description")) != null){
//					TDocumentation documentation = factory.createTDocumentation();
//					documentation.setSource(content);
//					relationshipType.getDocumentation().add(documentation);
//				}
//				if (innermap.containsKey("properties")){
//					List<Property> properties = new PropertyParser().parse(
//							(Map<String, ?> ) innermap.get("properties"), 
//							template);
//					relationshipType.getProperties().addAll(properties);
//				}
////				if (innermap.containsKey("attributes")){
////					List<Attribute> attributes = new AttributeParser().parse(
////							(Map<String, ?>) innermap.get("attributes"),
////							template);
////					relationshipType.getAttributes().addAll(attributes);
////				}
//				
//				if (innermap.containsKey("interfaces")){
//					List<Interface> interfaces = new InterfaceParser().parse(
//							(Map<String, ?>) innermap.get("interfaces"),
//							template);
//					relationshipType.getInterfaces().addAll(interfaces);
//				}
//				
////				if (innermap.containsKey("valid_target_types")){
////					if (! (innermap.get("valid_target_types") instanceof List<?>)){
////						throw new ParseException("Valid_target_types is not of type list.");
////					}
////					List<String> sourceTypes = (List<String>) innermap.get("valid_target_types");
////					relationshipType.getValidTargetTypes().addAll(sourceTypes);
////				}	
//			}
//			else{
//				throw new ParseException("Unexpected data type read while parsing RelationshipType.");
//			}
//			relationshipTypes.add(relationshipType);
//		}
//		
//		return relationshipTypes;
//	}
//
//	/* (non-Javadoc)
//	 * @see de.ugoe.swe.simpaas.tosca.parser.Parser#parse(java.util.List, org.eclipse.emf.ecore.EObject)
//	 */
//	@Override
//	public List<RelationshipType> parse(List<?> input, EObject model) throws ParseException {
//		// TODO Auto-generated method stub
//		return null;
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
