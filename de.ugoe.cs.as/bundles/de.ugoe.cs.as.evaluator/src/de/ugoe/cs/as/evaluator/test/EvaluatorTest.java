/**
 * 
 */
package de.ugoe.cs.as.evaluator.test;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;

import de.ugoe.cs.as.evaluator.Evaluator;
import de.ugoe.cs.as.mappingdsl.model.mapping.Parameter;

/**
 * @author fglaser
 *
 */
public class EvaluatorTest {

	@Test
	public void test() {
		Evaluator evaluator = new Evaluator();
		evaluator.load("/home/fglaser/workspace/simpaas-test/testdata/openfoamcluster.mapping");
		
		List<Parameter> parameters = evaluator.evaluate("/home/fglaser/workspace/simpaas-test/testdata");
		assertEquals(3, parameters.size());
		for (Parameter parameter: parameters){
			System.out.println(parameter.getName());
			System.out.println(parameter.getValue());
		}
		
	}

}
