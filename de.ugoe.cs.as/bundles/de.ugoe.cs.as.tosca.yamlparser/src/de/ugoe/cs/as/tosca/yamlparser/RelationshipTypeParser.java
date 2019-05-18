/**
 * 
 */
package de.ugoe.cs.as.tosca.yamlparser;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.ecore.xml.type.internal.QName;
import org.eclipse.xsd.XSDComplexTypeDefinition;
import org.eclipse.xsd.XSDElementDeclaration;
import org.eclipse.xsd.XSDFactory;
import org.eclipse.xsd.XSDParticle;
import org.eclipse.xsd.XSDSchema;

import de.ugoe.cs.as.tosca.PropertiesDefinitionType;
import de.ugoe.cs.as.tosca.TRelationshipType;
import de.ugoe.cs.as.tosca.ToscaFactory;
import de.ugoe.cs.as.tosca.ValidTargetType;

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
	public Object parse(Map<String, ?> inputMap, Parser containingParser) throws ParseException {
		TOSCAYamlTemplateParser parser = (TOSCAYamlTemplateParser) containingParser;
		List<TRelationshipType> resultList = new ArrayList<>();
		for (Map.Entry<String, ?> entry: inputMap.entrySet()){
			TRelationshipType type = ToscaFactory.eINSTANCE.createTRelationshipType();
			type.setName(entry.getKey());
			LOGGER.info("Parsing RelationshipType " + type.getName() + ".");
			for (Map.Entry<String, ?> innerentry: ((Map<String, ?>) entry.getValue()).entrySet()){
				String key = innerentry.getKey();
				switch (key){
				case "properties":
					LOGGER.info("Found Property definition.");	
					XSDSchema schema = parser.getPropertyTypesSchema();
					XSDComplexTypeDefinition propertiesDefinitionXSD =  new PropertyParser().parse((Map<String, ?>) 
							innerentry.getValue(), schema);	
					propertiesDefinitionXSD.setName(type.getName() + "PropertiesType");
					PropertiesDefinitionType propertiesDefinitionType = ToscaFactory.eINSTANCE.createPropertiesDefinitionType();
					propertiesDefinitionType.setType(new QName(propertiesDefinitionXSD.getQName()));
					
					// create top level element declaration to make it instantiable 
					XSDParticle wrapperParticle = XSDFactory.eINSTANCE.createXSDParticle();
					XSDElementDeclaration elementDeclaration = XSDFactory.eINSTANCE.createXSDElementDeclaration();
					wrapperParticle.setContent(elementDeclaration);
					elementDeclaration.setName(propertiesDefinitionXSD.getName());
					elementDeclaration.setTypeDefinition(propertiesDefinitionXSD);
					schema.getContents().add(elementDeclaration);
					type.setPropertiesDefinition(propertiesDefinitionType);
					break;
				
				case "valid_target_types":
					ValidTargetType validTargetType = ToscaFactory.eINSTANCE.createValidTargetType();
					// in TOSCA XSD only one valid TargetType is allowed, so we extract the first in the list
					validTargetType.setTypeRef(new QName(((List<String>) innerentry.getValue()).get(0)));
					type.setValidTarget(validTargetType);
					
				}	
			}
			resultList.add(type);
		}
		return resultList;
	}

	@Override
	public Object parse(List<?> inputArray) throws ParseException {
		
		// TODO Auto-generated method stub
		return null;
	}

}
