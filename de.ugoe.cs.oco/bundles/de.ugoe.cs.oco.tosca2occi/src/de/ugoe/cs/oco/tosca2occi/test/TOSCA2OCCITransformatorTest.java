/**
 * 
 */
package de.ugoe.cs.oco.tosca2occi;

import java.nio.file.Path;
import java.nio.file.Paths;

import org.junit.Test;

/**
 * @author Fabian Korte
 *
 */
public class TOSCA2OCCITransformatorTest {

	/**
	 * 
	 * @throws Exception 
	 */
	@Test
	public void testTransform() throws Exception {
		Path inputpath = Paths.get("testdata/test.tosca");
		Path outputpath = Paths.get("testdata/test.occic");
		TOSCA2OCCITransformator.transform(inputpath, outputpath);
	}

}
