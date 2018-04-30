/**
 * 
 */
package de.ugoe.cs.oco.tosca.yamlparser;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import javax.xml.namespace.QName;

import org.eclipse.xsd.XSDComplexTypeDefinition;
import org.eclipse.xsd.XSDElementDeclaration;
import org.eclipse.xsd.XSDFactory;
import org.eclipse.xsd.XSDParticle;
import org.eclipse.xsd.XSDSchema;

import de.ugoe.cs.oco.tosca.DerivedFromType2;
import de.ugoe.cs.oco.tosca.PropertiesDefinitionType;
import de.ugoe.cs.oco.tosca.TArtifactType;
import de.ugoe.cs.oco.tosca.TDocumentation;
import de.ugoe.cs.oco.tosca.ToscaFactory;

/**
 * @author fglaser
 *
 */
public class ArtifactTypeParser extends Parser {

	/* (non-Javadoc)
	 * @see de.ugoe.swe.simpaas.tosca.parser.Parser#parse(java.util.Map, org.eclipse.emf.ecore.EObject)
	 */
	@Override
	public List<TArtifactType> parse(Map<String, ?> input, Parser containingParser) throws ParseException {
		TOSCAYamlTemplateParser parser = (TOSCAYamlTemplateParser) containingParser;
		Map<String, ?> map = (Map<String, ?>) input;
		List<TArtifactType> artifactTypes = new ArrayList<TArtifactType>();
		ToscaFactory factory = ToscaFactory.eINSTANCE;
		for (Entry<String, ?> entry: map.entrySet()){
			TArtifactType artifactType = factory.createTArtifactType();
			artifactType.setName(entry.getKey());
			LOGGER.info("Parsing ArtifactType " + artifactType.getName() + ".");
			
			for (Map.Entry<String, ?> innerentry: ((Map<String, ?>) entry.getValue()).entrySet()){
				String key = innerentry.getKey();
				
				switch(key){
					case "description":
						TDocumentation documentation = factory.createTDocumentation();
						documentation.setSource((String)innerentry.getValue());;
						artifactType.getDocumentation().add(documentation);
						break;
					case "derived_from":
						QName name = new QName((String) innerentry.getValue());
						DerivedFromType2 type = factory.createDerivedFromType2();
						type.setTypeRef(name);
						artifactType.setDerivedFrom(type);
						break;
					case "version":
						break;
					case "file_ext":
						break;
					case "mime_type":
						break;
					case "properties":
						LOGGER.info("Found Property definition.");	
						XSDSchema schema = parser.getPropertyTypesSchema();
						XSDComplexTypeDefinition propertiesDefinitionXSD =  new PropertyParser().parse((Map<String, ?>) 
								innerentry.getValue(), schema);	
						propertiesDefinitionXSD.setName(artifactType.getName() + "PropertiesType");
						PropertiesDefinitionType propertiesDefinitionType = ToscaFactory.eINSTANCE.createPropertiesDefinitionType();
						propertiesDefinitionType.setType(new QName(propertiesDefinitionXSD.getQName()));
						
						// create top level element declaration to make it instantiable 
						XSDParticle wrapperParticle = XSDFactory.eINSTANCE.createXSDParticle();
						XSDElementDeclaration elementDeclaration = XSDFactory.eINSTANCE.createXSDElementDeclaration();
						wrapperParticle.setContent(elementDeclaration);
						elementDeclaration.setName(entry.getKey());
						elementDeclaration.setTypeDefinition(propertiesDefinitionXSD);
						schema.getContents().add(elementDeclaration);
						
						artifactType.setPropertiesDefinition(propertiesDefinitionType);
						break;	
				}
				
			}
			artifactTypes.add(artifactType);
		}
		return artifactTypes;
	}

	/* (non-Javadoc)
	 * @see de.ugoe.swe.simpaas.tosca.parser.Parser#parse(java.util.List, org.eclipse.emf.ecore.EObject)
	 */
	@Override
	public List<TArtifactType> parse(List<?> input) throws ParseException {
		// TODO Auto-generated method stub
		return null;
	}

}
