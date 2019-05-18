package de.ugoe.cs.oco.tosca.yamlparser;

import java.util.List;
import java.util.Map;
import java.util.logging.Logger;

import org.eclipse.emf.ecore.EObject;

public class DummyParser extends Parser {
	@Override
	public EObject parse(Map<String, ?> inputMap, Parser containingParser) throws ParseException {
		Logger.getLogger(this.getClass().getName()).warning("Ignoring entries since parser is undefined.");
		return null;
	}
	
	@Override
	public EObject parse(List<?> inputArray) throws ParseException {
		Logger.getLogger(this.getClass().getName()).warning("Ignoring entries since parser is undefined.");
		return null;
	}
}
