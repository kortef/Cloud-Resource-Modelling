package de.ugoe.cs.oco.tosca.yamlparser;

import java.util.List;
import java.util.Map;
import java.util.logging.Logger;

import org.eclipse.emf.ecore.EObject;

/**
 * @author fglaser
 *
 */

public abstract class Parser {
	protected final static Logger LOGGER = Logger.getLogger(Parser.class.getName());
	protected static Map<String, Class> parserMap;
	protected EObject current;

	public abstract Object parse(Map<String, ?> inputMap) throws ParseException;
	
	public abstract Object parse(List<?> inputArray) throws ParseException;
}
