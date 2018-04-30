/**
 * 
 */
package de.ugoe.cs.oco.tosca.yamlparser;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import org.eclipse.emf.ecore.xml.type.internal.QName;
import org.eclipse.xsd.XSDComplexTypeDefinition;
import org.eclipse.xsd.XSDElementDeclaration;
import org.eclipse.xsd.XSDFactory;
import org.eclipse.xsd.XSDParticle;
import org.eclipse.xsd.XSDSchema;

import de.ugoe.cs.oco.tosca.DerivedFromType2;
import de.ugoe.cs.oco.tosca.PropertiesDefinitionType;
import de.ugoe.cs.oco.tosca.TCapabilityType;
import de.ugoe.cs.oco.tosca.TDocumentation;
import de.ugoe.cs.oco.tosca.ToscaFactory;


/**
 * @author Fabian Korte
 *
 */
public class CapabilityTypeParser extends Parser {

	/* (non-Javadoc)
	 */
	@SuppressWarnings("unchecked")
	@Override
	public List<TCapabilityType> parse(Map<String, ?> input, Parser containingParser) throws ParseException {
		TOSCAYamlTemplateParser parser = (TOSCAYamlTemplateParser) containingParser;
		ToscaFactory factory = ToscaFactory.eINSTANCE;
		List<TCapabilityType> capabilityTypes = new ArrayList<TCapabilityType>();
		for (Entry<String, ?> entry: input.entrySet()){
			TCapabilityType capabilityType = factory.createTCapabilityType();
			capabilityType.setName(entry.getKey());
			
			LOGGER.info("Parsing CapabilityType " + capabilityType.getName() + ".");
			
			for (Map.Entry<String, ?> innerentry: ((Map<String, ?>) entry.getValue()).entrySet()){
				String key = innerentry.getKey();
				switch (key){
					case "derived_from":
						DerivedFromType2 type = factory.createDerivedFromType2();
						type.setTypeRef(new QName((String) innerentry.getValue()));
						capabilityType.setDerivedFrom(type);
						break;
					case "description":
						TDocumentation documentation = factory.createTDocumentation();
						documentation.setSource((String) innerentry.getValue());;
						capabilityType.getDocumentation().add(documentation);
					    break;
					case "properties":
						LOGGER.info("Found Property definition.");	
						XSDSchema schema = parser.getPropertyTypesSchema();
						XSDComplexTypeDefinition propertiesDefinitionXSD =  new PropertyParser().parse((Map<String, ?>) 
								innerentry.getValue(), schema);	
						propertiesDefinitionXSD.setName(capabilityType.getName() + "PropertiesType");
						PropertiesDefinitionType propertiesDefinitionType = ToscaFactory.eINSTANCE.createPropertiesDefinitionType();
						propertiesDefinitionType.setType(new QName(propertiesDefinitionXSD.getQName()));
						
						// create top level element declaration to make it instantiable 
						XSDParticle wrapperParticle = XSDFactory.eINSTANCE.createXSDParticle();
						XSDElementDeclaration elementDeclaration = XSDFactory.eINSTANCE.createXSDElementDeclaration();
						wrapperParticle.setContent(elementDeclaration);
						elementDeclaration.setName(entry.getKey());
						elementDeclaration.setTypeDefinition(propertiesDefinitionXSD);
						schema.getContents().add(elementDeclaration);
						
						capabilityType.setPropertiesDefinition(propertiesDefinitionType);
						break;
					case "attributes":
						break;
					case "valid_source_types":
						// List<String> sourceTypes = (List<String>) innerentry.getValue();
						
						// TODO: where are valid source types stored?
						//capabilityType.getValidSourceTypes().addAll(sourceTypes);
						break;
					case "shortname":
						break;
					default:
						throw new ParseException("Unsupported key " + innerentry.getKey() + " read.");			
				}
			}
			capabilityTypes.add(capabilityType);
		}
		
		return capabilityTypes;
	}

	/* (non-Javadoc)
	 * @see de.ugoe.swe.simpaas.tosca.parser.Parser#parse(java.util.List, org.eclipse.emf.ecore.EObject)
	 */
	@Override
	public List<TCapabilityType> parse(List<?> input) throws ParseException {
		// TODO Auto-generated method stub
		return null;
	}

}
