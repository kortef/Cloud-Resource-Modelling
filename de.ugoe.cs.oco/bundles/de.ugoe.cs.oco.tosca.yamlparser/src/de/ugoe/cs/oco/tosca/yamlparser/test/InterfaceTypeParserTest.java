/**
 * 
 */
package de.ugoe.swe.simpaas.tosca.parser.test;

import java.io.FileReader;
import java.util.List;
import java.util.Map;

import org.junit.Test;

import com.esotericsoftware.yamlbeans.YamlReader;

import de.ugoe.swe.simpaas.tosca.GroupType;
import de.ugoe.swe.simpaas.tosca.InterfaceType;
import de.ugoe.swe.simpaas.tosca.Operation;
import de.ugoe.swe.simpaas.tosca.ServiceTemplate;
import de.ugoe.swe.simpaas.tosca.parser.GroupTypeParser;
import de.ugoe.swe.simpaas.tosca.parser.InterfaceTypeParser;
import de.ugoe.swe.simpaas.tosca.parser.ParseException;

/**
 * @author fglaser
 *
 */
public class InterfaceTypeParserTest extends ParserTest {

	/**
	 * Test method for {@link de.ugoe.swe.simpaas.tosca.parser.InterfaceTypeParser#parse(java.util.Map, org.eclipse.emf.ecore.EObject)}.
	 * @throws ParseException 
	 */
	@Test
	public void testParseMapOfStringQEObject() throws ParseException {
		List<InterfaceType> outcome = new InterfaceTypeParser().parse(testmap, template);
		for (InterfaceType type: outcome){
			System.out.println(type);
			for (Operation operation: type.getOperations()){
				System.out.println(operation);
			}
		}
	}
	
	@SuppressWarnings("unchecked")
	@Test
	public void testParseOfNormativeTypes() throws Exception {
		ServiceTemplate template = factory.createServiceTemplate();
		FileReader reader = new FileReader("normativetypes/interfaceTypes.yml");
		YamlReader yamlreader = new YamlReader(reader);
		Object object = yamlreader.read();
		Map<String, ?> map = (Map<String, ?>) object;
		
		List<InterfaceType> interfaceTypes = new InterfaceTypeParser().parse(map, template);
		for (InterfaceType actual: interfaceTypes){
			System.out.println(actual);
		}
	}
	
	protected String getFileToParse(){
		return "data/interfaceType_example.yml";
	}

}
