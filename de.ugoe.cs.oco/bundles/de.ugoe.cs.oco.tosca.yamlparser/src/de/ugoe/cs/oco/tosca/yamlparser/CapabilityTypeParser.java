/**
 * 
 */
package de.ugoe.cs.oco.tosca.yamlparser;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.xml.type.internal.QName;

import de.ugoe.cs.oco.tosca.DerivedFromType2;
import de.ugoe.cs.oco.tosca.PropertiesDefinitionType;
import de.ugoe.cs.oco.tosca.TCapabilityType;
import de.ugoe.cs.oco.tosca.TDocumentation;
import de.ugoe.cs.oco.tosca.ToscaFactory;


/**
 * @author fglaser
 *
 */
public class CapabilityTypeParser extends Parser {

	/* (non-Javadoc)
	 * @see de.ugoe.swe.simpaas.tosca.parser.Parser#parse(java.util.Map, org.eclipse.emf.ecore.EObject)
	 */
	@SuppressWarnings("unchecked")
	@Override
	public List<TCapabilityType> parse(Map<String, ?> input, EObject containingObject) throws ParseException {
		ToscaFactory factory = ToscaFactory.eINSTANCE;
		List<TCapabilityType> capabilityTypes = new ArrayList<TCapabilityType>();
		// ToscaUtilFactory utilfactory = ToscaUtilFactory.eINSTANCE;
		//ServiceTemplate template = (ServiceTemplate) model;
		String content;
		for (Entry<String, ?> entry: input.entrySet()){
			TCapabilityType capabilityType = factory.createTCapabilityType();
			capabilityType.setName(entry.getKey());
						
			if (entry.getValue() instanceof Map<?, ?>){
				Map<String, ?> innermap = (Map<String, ?>) entry.getValue();
				if ((content = (String) innermap.get("derived_from")) != null){
					DerivedFromType2 type = factory.createDerivedFromType2();
					type.setTypeRef(new QName(content));
					capabilityType.setDerivedFrom(type);
				}
				
				if ((content = (String) innermap.get("description")) != null){
					TDocumentation documentation = factory.createTDocumentation();
					documentation.setSource(content);;
					capabilityType.getDocumentation().add(documentation);
				}
				
				if (innermap.containsKey("properties")){
					PropertiesDefinitionType properties = factory.createPropertiesDefinitionType();
//					List<PropertyType> properties = new PropertyParser().parse(
//							(Map<String, ?> ) innermap.get("properties"), 
//							template);
					capabilityType.setPropertiesDefinition(properties);
				}
//				if (innermap.containsKey("attributes")){
//					List<Attribute> attributes = new AttributeParser().parse(
//							(Map<String, ?>) innermap.get("attributes"),
//							template);
//					capabilityType.getAttributes().addAll(attributes);
//				}
				
				if (innermap.containsKey("valid_source_types")){
					if (! (innermap.get("valid_source_types") instanceof List<?>)){
						throw new ParseException("Valid_source_types is not of type list.");
					}
					List<String> sourceTypes = (List<String>) innermap.get("valid_source_types");
					
					// TODO: whwere are valid source types stored?
					//capabilityType.getValidSourceTypes().addAll(sourceTypes);
				}	
			}
			else{
				throw new ParseException("Unexpected data type read while parsing Capability.");
			}
			
			capabilityTypes.add(capabilityType);
		}
		
		return capabilityTypes;
	}

	/* (non-Javadoc)
	 * @see de.ugoe.swe.simpaas.tosca.parser.Parser#parse(java.util.List, org.eclipse.emf.ecore.EObject)
	 */
	@Override
	public List<TCapabilityType> parse(List<?> input) throws ParseException {
		// TODO Auto-generated method stub
		return null;
	}

}
