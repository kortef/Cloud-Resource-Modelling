/**
 * 
 */
package de.ugoe.swe.simpaas.tosca.parser.test;

import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.ecore.EObject;
import org.junit.Before;
import org.junit.Test;

import com.esotericsoftware.yamlbeans.YamlReader;

import de.ugoe.swe.simpaas.tosca.PropertyFilter;
import de.ugoe.swe.simpaas.tosca.parser.ParseException;
import de.ugoe.swe.simpaas.tosca.parser.PropertyFilterParser;

/**
 * @author fglaser
 *
 */
public class PropertyFilterParserTest {
	static List<?> testlist;

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		FileReader reader = new FileReader("data/propertyfilter_example.yml");
		YamlReader yamlreader = new YamlReader(reader);
		Object object = yamlreader.read();
		testlist = (ArrayList<?>) object;	
	}

	/**
	 * Test method for {@link de.ugoe.swe.simpaas.tosca.parser.PropertyFilterParser#parse(Map, org.eclipse.emf.ecore.EObject)}.
	 */
	@Test
	public void testParse() throws ParseException{
		List<PropertyFilter> outcome = (List<PropertyFilter>) new PropertyFilterParser().parse(testlist, null);
		
		for (EObject object: outcome){
			PropertyFilter actual = (PropertyFilter) object;
			System.out.println("Check for " + actual);
			System.out.println(actual.getConstraintClauses().get(0));
		}
	}

}
