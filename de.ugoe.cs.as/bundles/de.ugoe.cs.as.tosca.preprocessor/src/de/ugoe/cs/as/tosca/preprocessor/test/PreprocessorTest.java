/**
 * 
 */
package de.ugoe.cs.as.tosca.preprocessor.test;

import static org.junit.Assert.*;

import java.nio.file.Paths;

import org.junit.Test;

import de.ugoe.cs.as.tosca.preprocessor.Preprocessor;

/**
 * @author fglaser
 *
 */
public class PreprocessorTest {

	@Test
	public void test() {
		Preprocessor proc = new Preprocessor();
		proc.preprocess(Paths.get("model/input_mongodbcluster2.tosca"));
	}

}
