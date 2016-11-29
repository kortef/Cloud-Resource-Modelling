/**
 * 
 */
package de.ugoe.swe.simpaas.tosca.parser.test;

import static org.junit.Assert.*;

import org.junit.Test;

import de.ugoe.swe.simpaas.tosca.ServiceTemplate;
import de.ugoe.swe.simpaas.tosca.parser.NormativeTypesProvider;

/**
 * @author fglaser
 *
 */
public class NormativeTypesProviderTest {

	/**
	 * Test method for {@link de.ugoe.swe.simpaas.tosca.parser.NormativeTypesProvider#write2File(de.ugoe.swe.simpaas.tosca.ServiceTemplate)}.
	 * @throws Exception 
	 */
	@Test
	public void testWrite2File() throws Exception {
		NormativeTypesProvider provider = new NormativeTypesProvider();
		ServiceTemplate template = provider.getNormativeTypes();
		provider.write2File(template);
		
	}

}
