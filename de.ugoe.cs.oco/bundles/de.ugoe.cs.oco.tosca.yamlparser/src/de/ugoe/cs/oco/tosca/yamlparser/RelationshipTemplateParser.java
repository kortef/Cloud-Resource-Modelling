/**
 * 
 */
package de.ugoe.cs.oco.tosca.yamlparser;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.ecore.xml.type.internal.QName;

import de.ugoe.cs.oco.tosca.SourceElementType;
import de.ugoe.cs.oco.tosca.TRelationshipTemplate;
import de.ugoe.cs.oco.tosca.TargetElementType;
import de.ugoe.cs.oco.tosca.ToscaFactory;

/**
 * @author fglaser
 *
 */
public class RelationshipTemplateParser extends Parser {

	@Override
	public Object parse(Map<String, ?> inputMap) throws ParseException {
		List<TRelationshipTemplate> templates = new ArrayList<TRelationshipTemplate>();
		for (Map.Entry<String, ?> entry: inputMap.entrySet()){
			TRelationshipTemplate template = ToscaFactory.eINSTANCE.createTRelationshipTemplate();
			template.setName(entry.getKey());
			Map<String, ?> innermap = (Map<String, ?>) entry.getValue();
			for (Map.Entry<String, ?> innerentry: innermap.entrySet()){
				String key = innerentry.getKey();
				switch (key){
				case "type":
					template.setType(new QName((String) innerentry.getValue()));
					break;
				case "source":
					SourceElementType source = ToscaFactory.eINSTANCE.createSourceElementType();
					source.setRef((String) innerentry.getValue());
					template.setSourceElement(source);
					break;
				case "target":
					TargetElementType target = ToscaFactory.eINSTANCE.createTargetElementType();
					target.setRef((String) innerentry.getValue());
					template.setTargetElement(target);
					break;
				default:
					throw new ParseException("Key " + key + " is unknown and can not be handled.");
				}
			}
			
			templates.add(template);
			
		}
		
		
		return templates;
	}

	@Override
	public Object parse(List<?> inputArray) throws ParseException {
		List<TRelationshipTemplate> templates = new ArrayList<TRelationshipTemplate>();
		for (Object entry: inputArray){
			TRelationshipTemplate template = ToscaFactory.eINSTANCE.createTRelationshipTemplate();
			Map<String, ?> innermap = (Map<String, ?>) entry;
			for (Map.Entry<String, ?> innerentry: innermap.entrySet()){
				String key = innerentry.getKey();
				switch (key){
				case "type":
					template.setType(new QName((String) innerentry.getValue()));
					break;
				case "source":
					SourceElementType source = ToscaFactory.eINSTANCE.createSourceElementType();
					source.setRef((String) innerentry.getValue());
					template.setSourceElement(source);
					break;
				case "target":
					TargetElementType target = ToscaFactory.eINSTANCE.createTargetElementType();
					target.setRef((String) innerentry.getValue());
					template.setTargetElement(target);
					break;
				default:
					throw new ParseException("Key " + key + " is unknown and can not be handled.");
				}
			}
			
			templates.add(template);
		}
		return templates;
	}

	/* (non-Javadoc)
	 * @see de.ugoe.swe.simpaas.tosca.parser.Parser#parse(java.util.Map, org.eclipse.emf.ecore.EObject)
	 */
	


}
