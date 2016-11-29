/**
 * 
 */
package de.ugoe.swe.simpaas.tosca.parser.test;

import java.util.List;

import org.junit.Test;

import de.ugoe.swe.simpaas.tosca.Requirement;
import de.ugoe.swe.simpaas.tosca.parser.ParseException;
import de.ugoe.swe.simpaas.tosca.parser.RequirementParser;

/**
 * @author fglaser
 *
 */
public class RequirementParserTest extends ParserTest {

	/**
	 * Test method for {@link de.ugoe.swe.simpaas.tosca.parser.RequirementParser#parse(java.util.Map, org.eclipse.emf.ecore.EObject)}.
	 * @throws ParseException 
	 */
	@Test
	public void testParseMapOfStringQEObject() throws ParseException {
		List<Requirement> outcome = new RequirementParser().parse(testmap, template);
		for (Requirement requirement: outcome){
			System.out.println(requirement);
			System.out.println(requirement.getOccurences());
		}
	}
	
	@Override
	protected String getFileToParse(){
		return "data/requirement_example.yml";
	}
}
