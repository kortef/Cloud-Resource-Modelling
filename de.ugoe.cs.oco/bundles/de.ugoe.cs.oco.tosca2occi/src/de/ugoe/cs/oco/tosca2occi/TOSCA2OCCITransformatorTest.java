/**
 * 
 */
package de.ugoe.cs.oco.tosca2occi;

import static org.junit.Assert.*;

import java.nio.file.Path;
import java.nio.file.Paths;

import org.junit.Test;

/**
 * @author fglaser
 *
 */
public class TOSCA2OCCITransformatorTest {

	/**
	 * Test method for {@link de.ugoe.swe.simpaas.occi.transformator.TOSCA2OCCITransformator#transform(java.nio.file.Path, java.nio.file.Path)}.
	 * @throws Exception 
	 */
	@Test
	public void testTransform() throws Exception {
		Path inputpath = Paths.get("/home/fglaser/workspace/TOSCA2OCCI/src/models/inputModels/openfoamcluster_instantiated.tosca");
		Path outputpath = Paths.get("/home/fglaser/workspace/TOSCA2OCCI/src/models/outputModels/openfoamcluster_instantiated.occie");
		TOSCA2OCCITransformator.transform(inputpath, outputpath);
	}

}
