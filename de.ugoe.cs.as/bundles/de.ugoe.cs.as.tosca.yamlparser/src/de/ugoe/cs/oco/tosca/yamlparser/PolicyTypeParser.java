/**
 * 
 */
package de.ugoe.cs.oco.tosca.yamlparser;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import javax.xml.namespace.QName;

import de.ugoe.cs.oco.tosca.DerivedFromType2;
import de.ugoe.cs.oco.tosca.TDocumentation;
import de.ugoe.cs.oco.tosca.TPolicyType;
import de.ugoe.cs.oco.tosca.ToscaFactory;

/**
 * @author fglaser
 *
 */
public class PolicyTypeParser extends Parser {

	/* (non-Javadoc)
	 * @see de.ugoe.swe.simpaas.tosca.parser.Parser#parse(java.util.Map, org.eclipse.emf.ecore.EObject)
	 */
	@SuppressWarnings("unchecked")
	@Override
	public List<TPolicyType> parse(Map<String, ?> input, Parser containingParser) throws ParseException {
		List<TPolicyType> policyTypes = new ArrayList<TPolicyType>();
		ToscaFactory factory = ToscaFactory.eINSTANCE;
		//ToscaUtilFactory utilfactory = ToscaUtilFactory.eINSTANCE;
		//ServiceTemplate template = (ServiceTemplate) model;
		String content;
		for (Entry<String, ?> entry: input.entrySet()){
			TPolicyType policyType = factory.createTPolicyType();
			policyType.setName(entry.getKey());
						
			if (entry.getValue() instanceof Map<?, ?>){
				Map<String, ?> innermap = (Map<String, ?>) entry.getValue();
				if ((content = (String) innermap.get("derived_from")) != null){
					DerivedFromType2 type = factory.createDerivedFromType2();
					type.setTypeRef(new QName(content));
					policyType.setDerivedFrom(type);
				}
				
				if ((content = (String) innermap.get("version")) != null){
					// TODO: implement
				}
				
				if ((content = (String) innermap.get("description")) != null){
					TDocumentation documentation = factory.createTDocumentation();
					documentation.setSource(content);
					policyType.getDocumentation().add(documentation);
				}
				
//				if (innermap.containsKey("targets")){
//					if (! (innermap.get("targets") instanceof List<?>)){
//						throw new ParseException("Targets is not of type list.");
//					}
//					List<String> targets = (List<String>) innermap.get("targets");
//					policyType.getTargets().addAll(targets);
//				}	
			}
			else{
				throw new ParseException("Unexpected data type read while parsing PolicyType.");
			}
			policyTypes.add(policyType);
		}
		
		return policyTypes;
	}

	/* (non-Javadoc)
	 * @see de.ugoe.swe.simpaas.tosca.parser.Parser#parse(java.util.List, org.eclipse.emf.ecore.EObject)
	 */
	@Override
	public List<TPolicyType> parse(List<?> input) throws ParseException {
		// TODO Auto-generated method stub
		return null;
	}

}
