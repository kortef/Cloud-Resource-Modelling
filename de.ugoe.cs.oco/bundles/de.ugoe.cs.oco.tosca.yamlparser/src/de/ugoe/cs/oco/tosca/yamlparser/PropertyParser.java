/**
 * 
 */
package de.ugoe.cs.oco.tosca.yamlparser;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import javax.xml.namespace.QName;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.xml.type.AnyType;
import org.eclipse.emf.ecore.xml.type.XMLTypeFactory;
import org.eclipse.xsd.XSDComplexTypeDefinition;
import org.eclipse.xsd.XSDCompositor;
import org.eclipse.xsd.XSDElementDeclaration;
import org.eclipse.xsd.XSDFactory;
import org.eclipse.xsd.XSDModelGroup;
import org.eclipse.xsd.XSDParticle;
import org.eclipse.xsd.XSDSchema;
import org.eclipse.xsd.XSDSimpleTypeDefinition;

import de.ugoe.cs.oco.tosca.PropertiesDefinitionType;
import de.ugoe.cs.oco.tosca.PropertiesType;
import de.ugoe.cs.oco.tosca.TNodeType;
import de.ugoe.cs.oco.tosca.ToscaFactory;

/**
 * @author fglaser
 *
 */
public class PropertyParser extends Parser {

//	/* (non-Javadoc)
//	 * @see de.ugoe.swe.simpaas.tosca.parser.Parser#parse(java.util.Map, org.eclipse.emf.ecore.EObject)
//	 */
//	@SuppressWarnings("unchecked")
	
	public XSDComplexTypeDefinition parse(Map<String, ?> input, TNodeType nodeType) throws ParseException {
		
		XSDComplexTypeDefinition propertiesType = XSDFactory.eINSTANCE.createXSDComplexTypeDefinition();
		propertiesType.setName(nodeType.getName() + "Properties");
		XSDParticle content = XSDFactory.eINSTANCE.createXSDParticle();
		propertiesType.setContent(content);
		XSDModelGroup modelGroup = XSDFactory.eINSTANCE.createXSDModelGroup();
		
		// set Compositor to sequence
		modelGroup.setCompositor(XSDCompositor.SEQUENCE_LITERAL);
		content.setContent(modelGroup);
		
		for (Entry<String, ?> entry: input.entrySet()){
			XSDParticle wrapperParticle = XSDFactory.eINSTANCE.createXSDParticle();
			XSDElementDeclaration elementDeclaration = XSDFactory.eINSTANCE.createXSDElementDeclaration();
			wrapperParticle.setContent(elementDeclaration);
			elementDeclaration.setName(entry.getKey());
			
			modelGroup.getContents().add(wrapperParticle);
		}
		
		return propertiesType;
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


	@Override
	public Object parse(List<?> inputArray) throws ParseException {
		// TODO Auto-generated method stub
		return null;
	}
@Override
public Object parse(Map<String, ?> inputMap, EObject containingObject) throws ParseException {
	// TODO Auto-generated method stub
	return null;
}

}
