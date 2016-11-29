/**
 * 
 */
package de.ugoe.swe.simpaas.tosca.parser.test;

import java.io.FileReader;
import java.util.List;
import java.util.Map;

import org.junit.Test;

import com.esotericsoftware.yamlbeans.YamlReader;

import de.ugoe.swe.simpaas.tosca.DataType;
import de.ugoe.swe.simpaas.tosca.GroupType;
import de.ugoe.swe.simpaas.tosca.ServiceTemplate;
import de.ugoe.swe.simpaas.tosca.parser.DataTypeParser;
import de.ugoe.swe.simpaas.tosca.parser.GroupTypeParser;
import de.ugoe.swe.simpaas.tosca.parser.ParseException;

/**
 * @author fglaser
 *
 */
public class GroupTypeParserTest extends ParserTest {

	/**
	 * Test method for {@link de.ugoe.swe.simpaas.tosca.parser.GroupTypeParser#parse(java.util.Map, org.eclipse.emf.ecore.EObject)}.
	 * @throws ParseException 
	 */
	@Test
	public void testParseMapOfStringQEObject() throws ParseException {
		List<GroupType> groupTypes = new GroupTypeParser().parse(testmap, template);
		for (GroupType actual: groupTypes){
			System.out.println(actual);
		}
	}
	
	@SuppressWarnings("unchecked")
	@Test
	public void testParseOfNormativeTypes() throws Exception {
		ServiceTemplate template = factory.createServiceTemplate();
		FileReader reader = new FileReader("normativetypes/groupTypes.yml");
		YamlReader yamlreader = new YamlReader(reader);
		Object object = yamlreader.read();
		Map<String, ?> map = (Map<String, ?>) object;
		
		List<GroupType> groupTypes = new GroupTypeParser().parse(map, template);
		for (GroupType actual: groupTypes){
			System.out.println(actual);
		}
	}
	
	protected String getFileToParse(){
		return "data/groupType_example.yml";
	}

}
