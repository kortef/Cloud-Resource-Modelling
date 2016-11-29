/**
 * 
 */
package de.ugoe.swe.simpaas.tosca.parser.test;

import java.util.List;

import org.junit.Test;

import de.ugoe.swe.simpaas.tosca.Group;
import de.ugoe.swe.simpaas.tosca.GroupType;
import de.ugoe.swe.simpaas.tosca.parser.GroupParser;
import de.ugoe.swe.simpaas.tosca.parser.ParseException;

/**
 * @author fglaser
 *
 */
public class GroupParserTest extends ParserTest {

	/**
	 * Test method for {@link de.ugoe.swe.simpaas.tosca.parser.GroupParser#parse(java.util.Map, org.eclipse.emf.ecore.EObject)}.
	 * @throws ParseException 
	 */
	@Test
	public void testParseMapOfStringQEObject() throws ParseException {
		GroupType type = factory.createGroupType();
		type.setName("tosca.groups.Root");
		
		template.getGroupTypes().put(type.getName(), type);
		
		List<Group> outcome = new GroupParser().parse(testmap, template);
		
		for (Group actual: outcome){
			System.out.println(actual);
		}
	}
	
	protected String getFileToParse(){
		return "data/group_example.yml";
	}

}
