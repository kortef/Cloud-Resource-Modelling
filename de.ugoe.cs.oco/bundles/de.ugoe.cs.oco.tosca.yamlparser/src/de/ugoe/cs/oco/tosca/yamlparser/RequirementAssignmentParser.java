/**
 * 
 */
package de.ugoe.cs.oco.tosca.yamlparser;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;


/**
 * @author fglaser
 *
 */
public class RequirementAssignmentParser extends Parser {

//	/* (non-Javadoc)
//	 * @see de.ugoe.swe.simpaas.tosca.parser.Parser#parse(java.util.Map, org.eclipse.emf.ecore.EObject)
//	 */
//	@SuppressWarnings("unchecked")
//	@Override
//	public List<RequirementAssignment> parse(Map<String, ?> input) throws ParseException {
//		List<RequirementAssignment> requirementAssignments = new ArrayList<RequirementAssignment>();
//		ToscaFactory factory = ToscaFactory.eINSTANCE;
//		ToscaUtilFactory utilfactory = ToscaUtilFactory.eINSTANCE;
//		ServiceTemplate template = (ServiceTemplate) model;
//		String content;
//		for (Entry<String, ?> entry: input.entrySet()){
//			RequirementAssignment requirementAssignment = factory.createRequirementAssignment();
//			requirementAssignment.setName(entry.getKey());
//			if (entry.getValue() instanceof String){
//				NodeType nodeReference;
//				try {
//					nodeReference = TemplateUtil.getTypeByName((String) entry.getValue(), 
//							NodeType.class, template);
//				} catch (UnknownTypeException e) {
//					throw new ParseException("Unable to resolve node reference.");
//				}
//				requirementAssignment.setNode(nodeReference);
//			} else if (entry.getValue() instanceof Map<?, ?>){
//				Map<String, ?> innermap = (Map<String, ?>) entry.getValue();
//				if ((content = (String) innermap.get("capability")) != null){
//					UnresolvedCapabilityReference capabilityReference = 
//							utilfactory.createUnresolvedCapabilityReference();
//					
//					capabilityReference.setName(content);
//					
//					requirementAssignment.setCapability(capabilityReference);
//				}
//				if ((content = (String) innermap.get("node")) != null){
//					UnresolvedNodeReference nodeReference =
//							utilfactory.createUnresolvedNodeReference();
//					
//					nodeReference.setName(content);
//					
//					requirementAssignment.setNode(nodeReference);
//				}
//				if ((content = (String) innermap.get("node_filter")) != null){
//					// Get node filter
//					NodeInterface nodeInterface = null;	
//					requirementAssignment.setNode(nodeInterface);
//				}
//				if (innermap.containsKey("relationship")){
//					UnresolvedRelationshipReference relationshipReference = 
//							utilfactory.createUnresolvedRelationshipReference();
//					
//					relationshipReference.setName("Test");			
//				}
//			}
//			else{
//				throw new ParseException("Unexpected data type read while parsing RequirementAssignment.");
//			}
//			requirementAssignments.add(requirementAssignment);
//		}
//		
//		return requirementAssignments;
//	}
//
//	/* (non-Javadoc)
//	 * @see de.ugoe.swe.simpaas.tosca.parser.Parser#parse(java.util.List, org.eclipse.emf.ecore.EObject)
//	 */
//	@SuppressWarnings("unchecked")
//	@Override
//	public List<RequirementAssignment> parse(List<?> input, EObject model) throws ParseException {
//		List <RequirementAssignment> requirementAssignments = new ArrayList<RequirementAssignment>();
//		for (Object object: input){
//			requirementAssignments.addAll(this.parse( (Map<String,?>) object, model));
//		}
//		return requirementAssignments;
//	}

	@Override
	public Object parse(List<?> inputArray) throws ParseException {
		// TODO Auto-generated method stub
		return null;
	}

@Override
public Object parse(Map<String, ?> inputMap, Parser containingParser) throws ParseException {
	// TODO Auto-generated method stub
	return null;
}

}
