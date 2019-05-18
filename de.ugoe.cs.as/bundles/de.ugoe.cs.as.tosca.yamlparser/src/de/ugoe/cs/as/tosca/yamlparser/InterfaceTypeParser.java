/**
 * 
 */
package de.ugoe.cs.as.tosca.yamlparser;

import java.rmi.server.Operation;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import de.ugoe.cs.as.tosca.ToscaFactory;

/**
 * @author fglaser
 *
 */
public class InterfaceTypeParser extends Parser {

//	/* (non-Javadoc)
//	 * @see de.ugoe.swe.simpaas.tosca.parser.Parser#parse(java.util.Map, org.eclipse.emf.ecore.EObject)
//	 */
//	@SuppressWarnings("unchecked")
//	@Override
//	public List<InterfaceType> parse(Map<String, ?> input, EObject model) throws ParseException {
//		Map<String, ?>	map = (Map<String, ?>) input;	
//		List<InterfaceType> interfaceTypes = new ArrayList<InterfaceType>();
//		ToscaFactory factory = ToscaFactory.eINSTANCE;
//		for (Entry<String, ?> entry: map.entrySet()){
//			InterfaceType interfaceType = factory.createInterfaceType();
//			interfaceType.setName(entry.getKey());
//			Map<String, ?> innermap = (Map<String, ?>) entry.getValue();
//			
//			if (innermap.containsKey("decription")){
//				Description description = factory.createDescription();
//				description.setValue(innermap.get("description").toString());
//				interfaceType.setDescription(description);
//			}
//			innermap.remove("description");
//			
//			if (innermap.containsKey("inputs")){
//				Map<String, ?> inputmap = (Map<String, ?>) innermap.get("inputs");
//				List<Property> properties = new PropertyParser().parse(inputmap, model);
//				interfaceType.getInputs().addAll(properties);
//			}
//			// Remove already parsed element
//			innermap.remove("inputs");
//			
//			// Rest of innermap are operation definitions
//			List<Operation> operations = new OperationParser().parse(innermap, model);
//			interfaceType.getOperations().addAll(operations);
//			
//			interfaceTypes.add(interfaceType);
//		}
//		
//		return interfaceTypes;
//	}
//
//	/* (non-Javadoc)
//	 * @see de.ugoe.swe.simpaas.tosca.parser.Parser#parse(java.util.List, org.eclipse.emf.ecore.EObject)
//	 */
//	@Override
//	public List<InterfaceType> parse(List<?> input, EObject model) throws ParseException {
//		// TODO Auto-generated method stub
//		return null;
//	}

	@Override
	public Object parse(Map<String, ?> inputMap, Parser containingParser) throws ParseException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object parse(List<?> inputArray) throws ParseException {
		// TODO Auto-generated method stub
		return null;
	}

}
