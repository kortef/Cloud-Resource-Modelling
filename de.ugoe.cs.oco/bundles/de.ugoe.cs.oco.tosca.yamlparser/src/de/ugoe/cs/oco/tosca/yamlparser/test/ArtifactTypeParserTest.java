/**
 * 
 */
package de.ugoe.cs.oco.tosca.yamlparser.test;

import java.io.FileReader;
import java.util.List;
import java.util.Map;

import org.junit.Test;

import com.esotericsoftware.yamlbeans.YamlReader;

import de.ugoe.cs.oco.tosca.TArtifactType;
import de.ugoe.cs.oco.tosca.TServiceTemplate;
import de.ugoe.cs.oco.tosca.yamlparser.ArtifactTypeParser;
import de.ugoe.cs.oco.tosca.yamlparser.ParseException;


/**
 * @author fglaser
 *
 */
public class ArtifactTypeParserTest extends ParserTest {

	/**
	 * Test method for {@link de.ugoe.swe.simpaas.tosca.parser.ArtifactTypeParser#parse(java.util.Map, org.eclipse.emf.ecore.EObject)}.
	 * @throws ParseException 
	 */
	@Test
	public void testParseMapOfStringQEObject() throws ParseException {
		TArtifactType type = factory.createTArtifactType();
		type.setName("tosca.artifact.Root");
		template.getDef.put(type.getName(), type);
		
		List<TArtifactType> outcome = new ArtifactTypeParser().parse(testmap);
		for (TArtifactType actual: outcome){
			System.out.println(actual);
		}
	}
	
	@Test
	public void testParseNormativeTypes() throws Exception{
		TServiceTemplate template = factory.createTServiceTemplate();
		FileReader reader = new FileReader("normativetypes/artifactTypes.yml");
		YamlReader yamlreader = new YamlReader(reader);
		Object object = yamlreader.read();
		Map<String, ?> map = (Map<String, ?>) object;
		
		List<TArtifactType> outcome = new ArtifactTypeParser().parse(map);
		for (TArtifactType actual: outcome){
			System.out.println(actual);
			System.out.println(actual.getDerivedFrom());
		}
	}
	
	@Override
	protected String getFileToParse(){
		return "data/artifactType_example.yml";
	}
}
