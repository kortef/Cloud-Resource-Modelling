/**
 * 
 */
package de.ugoe.cs.oco.tosca.yamlparser;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import javax.xml.namespace.QName;

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
	public List<TArtifactType> parse(Map<String, ?> input) throws ParseException {
		Map<String, ?> map = (Map<String, ?>) input;
		List<TArtifactType> artifactTypes = new ArrayList<TArtifactType>();
		ToscaFactory factory = ToscaFactory.eINSTANCE;
		//ToscaUtilFactory utilfactory = ToscaUtilFactory.eINSTANCE;
		String content; 
		for (Entry<String, ?> entry: map.entrySet()){
			TArtifactType artifactType = factory.createTArtifactType();
			artifactType.setName(entry.getKey());
			if (entry.getValue() instanceof Map<?, ?>){
				Map<String, ?> innermap = (Map<String, ?>) entry.getValue();
				if ((content = (String) innermap.get("decription")) != null){
					TDocumentation documentation = factory.createTDocumentation();
					documentation.setSource(content);;
					artifactType.getDocumentation().add(documentation);
				}
				if ((content = (String) innermap.get("derived_from")) != null){
					QName name = new QName(content);
					DerivedFromType2 type = factory.createDerivedFromType2();
					type.setTypeRef(name);
					artifactType.setDerivedFrom(type);
				}
				
				if ((content = (String) innermap.get("version")) != null){
					// TODO add version parsing
				}

//				if (innermap.containsKey("file_ext")){
//					if (! (innermap.get("file_ext") instanceof List<?>)){
//						throw new ParseException("Expected definition of file_ext to be a List.");
//					}
//					List<String> extensions = (List<String>) innermap.get("file_ext");
//					artifactType.getFileExt().addAll(extensions);
//				}
				
//				if ((content = (String) innermap.get("mime_type")) != null){
//					artifactType.setMimeType(content);
//				}
				
				Object object = innermap.get("properties");
				if (object != null){
					if (!(object instanceof List<?>)){
						throw new ParseException("Expected property definition to be a list.");
					}
					PropertiesDefinitionType properties = null;
					// TODO: TOSCA2 implement
					artifactType.setPropertiesDefinition(properties);
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
