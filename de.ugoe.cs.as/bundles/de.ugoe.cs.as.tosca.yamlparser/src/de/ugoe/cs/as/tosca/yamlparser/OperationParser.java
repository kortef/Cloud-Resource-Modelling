/**
 * 
 */
package de.ugoe.cs.as.tosca.yamlparser;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import de.ugoe.cs.as.tosca.InputParametersType1;
import de.ugoe.cs.as.tosca.TDocumentation;
import de.ugoe.cs.as.tosca.TOperation;
import de.ugoe.cs.as.tosca.TParameter;
import de.ugoe.cs.as.tosca.ToscaFactory;

/**
 * @author fglaser
 *
 */
public class OperationParser extends Parser {

	/* (non-Javadoc)
	 * @see de.ugoe.swe.simpaas.tosca.parser.Parser#parse(java.util.Map, org.eclipse.emf.ecore.EObject)
	 */
	@SuppressWarnings("unchecked")
	@Override
	public List<TOperation> parse(Map<String, ?> input, Parser containingParser) throws ParseException {
		Map<String, ?> map = (Map<String, ?>) input;
		ToscaFactory factory = ToscaFactory.eINSTANCE;
		List<TOperation> operations = new ArrayList<TOperation>();
		for (Entry<String, ?> entry: map.entrySet()){
			TOperation operation = factory.createTOperation();
			operation.setName(entry.getKey());
			
			if (entry.getValue() instanceof String){
				//operation.setImplementation((String) entry.getValue());
			}
			else if (entry.getValue() instanceof Map<?, ?>){
				Map<String, ?> innermap = (Map<String, ?>) entry.getValue();
				for (Map.Entry<String, ?> innerentry: innermap.entrySet()){
					String key = innerentry.getKey();
					switch(key){
					case "description":
						TDocumentation documentation = ToscaFactory.eINSTANCE.createTDocumentation();
						documentation.setSource((String) innerentry.getValue());;
						operation.getDocumentation().add(documentation);
						break;
					case "implementation":
						LOGGER.warning("Unsopported key" + innerentry.getKey() + " read.");
						//operation.setImplementation((String) innerentry.getValue());
						break;
					case "inputs":
						InputParametersType1 parametertypes = ToscaFactory.eINSTANCE.createInputParametersType1();
						List<TParameter> parameters = 
								new ParameterParser().parse((Map<String,?>) innerentry.getValue(), null);
						parametertypes.getInputParameter().addAll(parameters);
						operation.setInputParameters(parametertypes);
						break;
					default:
						LOGGER.warning("Unsupported key " + innerentry.getKey() + " read.");
					}
					
				}
				
			}
			
			operations.add(operation);
		}
		
		return operations;
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
