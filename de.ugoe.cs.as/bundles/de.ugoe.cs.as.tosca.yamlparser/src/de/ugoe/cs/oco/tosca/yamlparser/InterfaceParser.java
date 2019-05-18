/**
 * 
 */
package de.ugoe.cs.oco.tosca.yamlparser;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.xml.namespace.QName;

import org.eclipse.emf.common.util.EList;

import de.ugoe.cs.oco.tosca.TInterface;
import de.ugoe.cs.oco.tosca.TOperation;
import de.ugoe.cs.oco.tosca.ToscaFactory;

/**
 * @author fglaser
 *
 */
public class InterfaceParser extends Parser {

	@Override
	public Object parse(Map<String, ?> inputMap, Parser containingParser) throws ParseException {
		List<TInterface> resultList = new ArrayList<TInterface>();
		for (Map.Entry<String, ?> entry: inputMap.entrySet()){
			TInterface interf = ToscaFactory.eINSTANCE.createTInterface();
			interf.setName(entry.getKey());
			Map<String, ?> valueMap =  (Map<String, ?>) entry.getValue();
			
			List<TOperation> operations = (List<TOperation>) new OperationParser().parse(valueMap, null);
			
			interf.getOperation().addAll(operations);
			resultList.add(interf);
		}
		return resultList;
	}

	@Override
	public Object parse(List<?> inputArray) throws ParseException {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see de.ugoe.swe.simpaas.tosca.parser.Parser#parse(java.util.Map, org.eclipse.emf.ecore.EObject)
	 */

}
