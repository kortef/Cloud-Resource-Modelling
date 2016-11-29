/**
 * 
 */
package de.ugoe.swe.simpaas.tosca.parser.test;

import java.util.List;
import java.util.Map;

import org.junit.Test;

import de.ugoe.swe.simpaas.tosca.Capability;
import de.ugoe.swe.simpaas.tosca.CapabilityType;
import de.ugoe.swe.simpaas.tosca.Property;
import de.ugoe.swe.simpaas.tosca.parser.CapabilityParser;
import de.ugoe.swe.simpaas.tosca.parser.ParseException;

/**
 * @author fglaser
 *
 */
public class CapabilityParserTest extends ParserTest{

	/**
	 * Test method for {@link de.ugoe.swe.simpaas.tosca.parser.CapabilityParser#parse(Map, org.eclipse.emf.ecore.EObject)}.
	 * @throws ParseException 
	 */
	@Test
	public void testParseMapOfQQEObject() throws ParseException {
		CapabilityType type = factory.createCapabilityType();
		type.setName("mytypes.mycapabilities.MyCapabilityTypeName");
		template.getCapabilityTypes().put(type.getName(), type);
		List<Capability> capabilities = new CapabilityParser().parse(testmap, template);
		for (Capability capability: capabilities){
			System.out.println(capability);
			for (Property property: capability.getProperties()){
				System.out.println(property);
			}
		}
	}
	
	@Override
	protected String getFileToParse(){
		return "data/capability_example.yml";
	}

}
