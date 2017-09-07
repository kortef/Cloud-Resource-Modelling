/**
 * 
 */
package de.ugoe.cs.oco.tosca.yamlparser;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.ecore.EObject;

import de.ugoe.cs.oco.tosca.TGroupType;

/**
 * @author fglaser
 *
 */
public class GroupTypeParser extends Parser {

	/* (non-Javadoc)
	 * @see de.ugoe.swe.simpaas.tosca.parser.Parser#parse(java.util.Map)
	 */
	@Override
	public Object parse(Map<String, ?> inputMap, EObject containingObject) throws ParseException {
		List<TGroupType> groupTypes = new ArrayList<TGroupType>(); 
		return groupTypes;
	}

	/* (non-Javadoc)
	 * @see de.ugoe.swe.simpaas.tosca.parser.Parser#parse(java.util.List)
	 */
	@Override
	public Object parse(List<?> inputArray) throws ParseException {
		// TODO Auto-generated method stub
		return null;
	}

}
