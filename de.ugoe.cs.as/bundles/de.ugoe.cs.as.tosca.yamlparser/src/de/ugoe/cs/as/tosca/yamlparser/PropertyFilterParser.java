package de.ugoe.cs.as.tosca.yamlparser;

import java.util.List;
import java.util.Map;


public class PropertyFilterParser extends Parser {

//	@SuppressWarnings("unchecked")
//	@Override
//	public List<TPropertyConstraint> parse(Map<String, ?> input, EObject model) throws ParseException {
//		Map<String, ?> map = (Map<String, ?>) input;
//		List<TPropertyConstraint> filters = new LinkedList<TPropertyConstraint>();
//		ToscaFactory factory = ToscaFactory.eINSTANCE;
//		
//		for (Entry<String, ?> entry : map.entrySet()){
//			TPropertyConstraint filter = factory.createTPropertyConstraint();
//			filter.setProperty(entry.getKey());
//				
//			filters.add(filter);
//		}
//		
//		
//		return filters;
//	}
//
//	@SuppressWarnings("unchecked")
//	@Override
//	public List<TPropertyConstraint> parse(List<?> input, EObject model) throws ParseException {
//		List<TPropertyConstraint> filter = new ArrayList<TPropertyConstraint>();
//		for (Object object: input){
//			filter.addAll(this.parse((Map<String, ?>) object, model));
//		}
//		return filter;
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
