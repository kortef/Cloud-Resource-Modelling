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
import de.ugoe.swe.simpaas.tosca.ServiceTemplate;
import de.ugoe.swe.simpaas.tosca.parser.DataTypeParser;
import de.ugoe.swe.simpaas.tosca.parser.ParseException;

/**
 * @author fglaser
 *
 */
public class DataTypeParserTest extends ParserTest {

	/**
	 * Test method for {@link de.ugoe.swe.simpaas.tosca.parser.DataTypeParser#parse(java.util.Map, org.eclipse.emf.ecore.EObject)}.
	 * @throws ParseException 
	 */
	@Test
	public void testParseMapOfStringQEObject() throws ParseException {
		DataType oldtype = factory.createDataType();
		oldtype.setName("mytypes.phonenumber");
		template.getDataTypes().put(oldtype.getName(), oldtype);
		
		List<DataType> datatypes = new DataTypeParser().parse(testmap, template);
		
		for (DataType type: datatypes){
			System.out.println(type);
		}
	}
	
	@SuppressWarnings("unchecked")
	@Test
	public void testParseOfNormativeTypes() throws Exception {
		ServiceTemplate template = factory.createServiceTemplate();
		FileReader reader = new FileReader("normativetypes/dataTypes.yml");
		YamlReader yamlreader = new YamlReader(reader);
		Object object = yamlreader.read();
		Map<String, ?> map = (Map<String, ?>) object;
		List<DataType> datatypes = new DataTypeParser().parse(map, template);
		
		for (DataType type: datatypes){
			System.out.println(type);
		}
	}
	
	protected String getFileToParse(){
		return "data/dataType_example.yml";
	}

}
