/**
 * 
 */
package de.ugoe.cs.oco.tosca.yamlparser;

import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import org.eclipse.xsd.XSDAnnotation;
import org.eclipse.xsd.XSDComplexTypeDefinition;
import org.eclipse.xsd.XSDCompositor;
import org.eclipse.xsd.XSDConstraint;
import org.eclipse.xsd.XSDElementDeclaration;
import org.eclipse.xsd.XSDEnumerationFacet;
import org.eclipse.xsd.XSDFactory;
import org.eclipse.xsd.XSDLengthFacet;
import org.eclipse.xsd.XSDMaxExclusiveFacet;
import org.eclipse.xsd.XSDMaxInclusiveFacet;
import org.eclipse.xsd.XSDMaxLengthFacet;
import org.eclipse.xsd.XSDMinFacet;
import org.eclipse.xsd.XSDMinInclusiveFacet;
import org.eclipse.xsd.XSDMinLengthFacet;
import org.eclipse.xsd.XSDModelGroup;
import org.eclipse.xsd.XSDParticle;
import org.eclipse.xsd.XSDPatternFacet;
import org.eclipse.xsd.XSDSchema;
import org.eclipse.xsd.XSDScope;
import org.eclipse.xsd.XSDSimpleTypeDefinition;
import org.eclipse.xsd.XSDTypeDefinition;
import org.w3c.dom.Element;

import de.ugoe.cs.oco.tosca.TNodeType;
import de.ugoe.cs.oco.tosca.ToscaFactory;
import de.ugoe.cs.oco.tosca.ToscaPackage;

/**
 * @author fglaser
 *
 */
public class PropertyParser extends Parser {

//	/* (non-Javadoc)
//	 * @see de.ugoe.swe.simpaas.tosca.parser.Parser#parse(java.util.Map, org.eclipse.emf.ecore.EObject)
//	 */
//	@SuppressWarnings("unchecked")
	
	public XSDComplexTypeDefinition parse(Map<String, ?> input, XSDSchema schema) throws ParseException {
		
		XSDComplexTypeDefinition propertiesType = XSDFactory.eINSTANCE.createXSDComplexTypeDefinition();
		//propertiesType.setName("Properties");
		XSDParticle content = XSDFactory.eINSTANCE.createXSDParticle();
		propertiesType.setContent(content);
		XSDModelGroup modelGroup = XSDFactory.eINSTANCE.createXSDModelGroup();
		
		// set Compositor to sequence
		modelGroup.setCompositor(XSDCompositor.SEQUENCE_LITERAL);
		// Content must be set before propertiesType can be added to schema, otherwise
		// a NullPointerError might occur (not sure why).
		content.setContent(modelGroup);
		
		schema.getContents().add(propertiesType);
		
		
		for (Entry<String, ?> entry: input.entrySet()){
			XSDParticle wrapperParticle = XSDFactory.eINSTANCE.createXSDParticle();
			XSDElementDeclaration elementDeclaration = XSDFactory.eINSTANCE.createXSDElementDeclaration();
			wrapperParticle.setContent(elementDeclaration);
			elementDeclaration.setName(entry.getKey());
			
			
			modelGroup.getContents().add(wrapperParticle);
			
			// extract constraints for this property
			if (entry.getValue() instanceof Map){
				Map<String, ?> innermap = (Map<String, ?>) entry.getValue();
				
				if (innermap.get("type") != null){
					String type = (String) innermap.get("type");
					elementDeclaration.setTypeDefinition(this.getType(schema, type));
					
				}
				
				if (innermap.get("description") != null){
					String description = (String) innermap.get("description");
					XSDAnnotation comment = XSDFactory.eINSTANCE.createXSDAnnotation();
					elementDeclaration.setAnnotation(comment);
					
					Element element = comment.createUserInformation(null);
					
					comment.getElement().appendChild(element);
					element.appendChild(element.getOwnerDocument().createTextNode(description));
				}
				
				if (innermap.get("required") != null){
					if (((String)innermap.get("required")).equals("true"))
						wrapperParticle.setMinOccurs(1);		
				}
				
				if (innermap.get("default") != null){
					String defaultValue = (String) innermap.get("default");
					elementDeclaration.setConstraint(XSDConstraint.DEFAULT_LITERAL);
					elementDeclaration.setLexicalValue(defaultValue);
				}
				if (innermap.get("constraints") != null){
					List<Map<String, ?>> constraints = (List<Map<String, ?>>) innermap.get("constraints");
					for (Map<String, ?> map: constraints ){
						for (String constraintkey: map.keySet()){
							XSDSimpleTypeDefinition typeDefinition;
							switch(constraintkey){
							case "equal":
								String elementValue = (String) map.get(constraintkey);
								elementDeclaration.setConstraint(XSDConstraint.FIXED_LITERAL);
								elementDeclaration.setLexicalValue(elementValue);
								break;
							case "greater_than":
								typeDefinition = getTypeDefinition(elementDeclaration);
															
								XSDMinFacet minFacet;
								String gtvalue =  (String) map.get("greater_than");
								minFacet = XSDFactory.eINSTANCE.createXSDMinExclusiveFacet();
								minFacet.setLexicalValue(gtvalue);
			
								typeDefinition.getFacetContents().add(minFacet);
								elementDeclaration.setAnonymousTypeDefinition(typeDefinition);
								break;	
							case "greater_or_equal":
								typeDefinition = getTypeDefinition(elementDeclaration);
															
								XSDMinInclusiveFacet minInclusiveFacet;
								String gevalue =  (String) map.get("greater_or_equal");
								minInclusiveFacet = XSDFactory.eINSTANCE.createXSDMinInclusiveFacet();
								minInclusiveFacet.setLexicalValue(gevalue);
			
								typeDefinition.getFacetContents().add(minInclusiveFacet);
								elementDeclaration.setAnonymousTypeDefinition(typeDefinition);
								break;	
							case "less_than":
								typeDefinition = getTypeDefinition(elementDeclaration);
								XSDMaxExclusiveFacet maxExclusiveFacet;
								String ltvalue =  (String) map.get("less_than");
								maxExclusiveFacet = XSDFactory.eINSTANCE.createXSDMaxExclusiveFacet();
								maxExclusiveFacet.setLexicalValue(ltvalue);
			
								typeDefinition.getFacetContents().add(maxExclusiveFacet);
								elementDeclaration.setAnonymousTypeDefinition(typeDefinition);
								break;
							case "less_or_equal":
								typeDefinition = getTypeDefinition(elementDeclaration);
								
								XSDMaxInclusiveFacet maxInclusiveFacet;
								String levalue =  (String) map.get("less_or_equal");
								maxInclusiveFacet = XSDFactory.eINSTANCE.createXSDMaxInclusiveFacet();
								maxInclusiveFacet.setLexicalValue(levalue);
			
								typeDefinition.getFacetContents().add(maxInclusiveFacet);
								elementDeclaration.setAnonymousTypeDefinition(typeDefinition);
								break;
							case "in_range":
								typeDefinition = getTypeDefinition(elementDeclaration);
															
								XSDMinInclusiveFacet lowerBound = XSDFactory.eINSTANCE.createXSDMinInclusiveFacet();
								XSDMaxInclusiveFacet upperBound = XSDFactory.eINSTANCE.createXSDMaxInclusiveFacet();
								List<String> range = (List<String>) map.get("in_range");
								
								lowerBound.setLexicalValue(range.get(0));
								upperBound.setLexicalValue(range.get(1));
			
								typeDefinition.getFacetContents().add(lowerBound);
								typeDefinition.getFacetContents().add(upperBound);
								elementDeclaration.setAnonymousTypeDefinition(typeDefinition);
								break;								
							case "valid_values":
								typeDefinition = getTypeDefinition(elementDeclaration);
															
								XSDEnumerationFacet enumerationFacet;
								for (String value: (List<String> ) map.get("valid_values")){
									enumerationFacet = XSDFactory.eINSTANCE.createXSDEnumerationFacet();
									enumerationFacet.setLexicalValue(value);
									typeDefinition.getFacetContents().add(enumerationFacet);
								}
								
								elementDeclaration.setAnonymousTypeDefinition(typeDefinition);
								break;	
							case "length":
								typeDefinition = getTypeDefinition(elementDeclaration);
								
								XSDLengthFacet lengthFacet;
								String length =  (String) map.get("length");
								lengthFacet = XSDFactory.eINSTANCE.createXSDLengthFacet();
								lengthFacet.setLexicalValue(length);
			
								typeDefinition.getFacetContents().add(lengthFacet);
								elementDeclaration.setAnonymousTypeDefinition(typeDefinition);
								
								break;
							case "min_length":
								typeDefinition = getTypeDefinition(elementDeclaration);
								
								XSDMinLengthFacet minLengthFacet;
								String minLength =  (String) map.get("min_length");
								minLengthFacet = XSDFactory.eINSTANCE.createXSDMinLengthFacet();
								minLengthFacet.setLexicalValue(minLength);
			
								typeDefinition.getFacetContents().add(minLengthFacet);
								elementDeclaration.setAnonymousTypeDefinition(typeDefinition);
								
								break;	
							case "max_length":
								typeDefinition = getTypeDefinition(elementDeclaration);
								
								XSDMaxLengthFacet maxLengthFacet;
								String maxLength =  (String) map.get("max_length");
								maxLengthFacet = XSDFactory.eINSTANCE.createXSDMaxLengthFacet();
								maxLengthFacet.setLexicalValue(maxLength);
			
								typeDefinition.getFacetContents().add(maxLengthFacet);
								elementDeclaration.setAnonymousTypeDefinition(typeDefinition);
															
								break;	
							case "pattern":
								typeDefinition = getTypeDefinition(elementDeclaration);
								
								XSDPatternFacet patternFacet;
								String pattern =  (String) map.get("pattern");
								patternFacet = XSDFactory.eINSTANCE.createXSDPatternFacet();
								patternFacet.setLexicalValue(pattern);
			
								typeDefinition.getFacetContents().add(patternFacet);
								elementDeclaration.setAnonymousTypeDefinition(typeDefinition);
								
								break;
							default:
								throw new ParseException("Constraint type " + constraintkey + " is unknown.");
							}
						}
					}
				}

			}
			else {
				throw new ParseException("Was expecing map with property definitions here.");
				
			}
			
		}
		
		return propertiesType;
	}
private XSDSimpleTypeDefinition getTypeDefinition(XSDElementDeclaration elementDeclaration) {
	XSDSimpleTypeDefinition typeDefinition;
	if (elementDeclaration.getAnonymousTypeDefinition() == null){
		typeDefinition = XSDFactory.eINSTANCE.createXSDSimpleTypeDefinition();
		typeDefinition.setBaseTypeDefinition((XSDSimpleTypeDefinition) elementDeclaration.getType());
		elementDeclaration.setAnonymousTypeDefinition(typeDefinition);
	}
	else{
		typeDefinition = (XSDSimpleTypeDefinition) elementDeclaration.getAnonymousTypeDefinition();
	}
	return typeDefinition;
}
//
//	/* (non-Javadoc)
//	 * @see de.ugoe.swe.simpaas.tosca.parser.Parser#parse(java.util.List, org.eclipse.emf.ecore.EObject)
//	 */
//	@SuppressWarnings("unchecked")
//	@Override
//	public List<Property> parse(List<?> input, EObject model) throws ParseException {
//		List<Property> properties = new ArrayList<Property>();
//		for (Object object: input){
//			properties.addAll(this.parse((Map<String, ?>) object, model));
//		}
//		return properties;
//	}
	
	private XSDTypeDefinition getType(XSDScope scope, String toscayamltype) throws ParseException{
		switch (toscayamltype){
			case ("string"):
				return scope.resolveTypeDefinition("http://www.w3.org/2001/XMLSchema", "string");
			case ("integer"):
				return scope.resolveTypeDefinition("http://www.w3.org/2001/XMLSchema", "integer");
			case ("float"):
				return scope.resolveTypeDefinition("http://www.w3.org/2001/XMLSchema", "float");
			case ("boolean"):
				return scope.resolveTypeDefinition("http://www.w3.org/2001/XMLSchema", "boolean");
			case ("timestamp"):
				return scope.resolveTypeDefinition("http://www.w3.org/2001/XMLSchema", "dateTimeStamp");
			case ("null"):
				throw new ParseException("Type " + toscayamltype + " not supported yet.");
			case ("version"):
				throw new ParseException("Type " + toscayamltype + " not supported yet.");
			case ("range"):
				throw new ParseException("Type " + toscayamltype + " not supported yet.");
			case ("list"):
				throw new ParseException("Type " + toscayamltype + " not supported yet.");
			case ("map"):
				throw new ParseException("Type " + toscayamltype + " not supported yet.");
			case ("scalar"):
				throw new ParseException("Type " + toscayamltype + " not supported yet.");
			
			default:
				throw new ParseException("Type " + toscayamltype + " not known.");
		}
	}


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
