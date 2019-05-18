/**
 * 
 */
package de.ugoe.cs.as.tosca.yamlparser;

import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import org.eclipse.emf.ecore.util.FeatureMapUtil;

import de.ugoe.cs.as.tosca.DocumentRoot;
import de.ugoe.cs.as.tosca.TDocumentation;
import de.ugoe.cs.as.tosca.ToscaFactory;

/**
 * @author fglaser
 *
 */
public class ToscaModelUtil {
	public static DocumentRoot createDocumentRoot(){
		DocumentRoot rootElement = ToscaFactory.eINSTANCE.createDocumentRoot();
		rootElement.getXSISchemaLocation().put("http://docs.oasis-open.org/tosca/ns/2011/12", "TOSCA-v1.0.xsd");
		
		return rootElement;
	}
	
	public static TDocumentation createDocumentation(String docString){
		TDocumentation documentation = ToscaFactory.eINSTANCE.createTDocumentation();
		FeatureMapUtil.addText(documentation.getMixed(), docString);
		
		return documentation;
	}
	
	public static String buildStringFromMap(Map<String,?> map){
		StringBuilder sb = new StringBuilder("{");
		for(Entry<String, ?> entry: map.entrySet()){
			sb.append(entry.getKey());
			sb.append(": ");
			if (entry.getValue() instanceof Map)
				sb.append(ToscaModelUtil.buildStringFromMap((Map<String,?>)entry.getValue()));
			else 
				sb.append(entry.getValue());
		}
		sb.append("}");
		
		return sb.toString();
	}
	
	public static String buildStringFromList(List<?> list){
		return list.toString();
	}
}
