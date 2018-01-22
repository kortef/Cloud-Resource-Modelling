package de.ugoe.cs.oco.tosca.yamlparser.test;

import static org.junit.Assert.*;
import org.junit.Test;

import de.ugoe.cs.oco.tosca.yamlparser.NodeTypeParser;
import de.ugoe.cs.oco.tosca.yamlparser.ParseException;

public class NodeTypeParserTest extends ParserTest{

	@Test
	public final void test() throws ParseException {
		Object result = new NodeTypeParser().parse(testmap, null);
		System.out.println(result);
	}

	@Override
	protected String getFileToParse() {
		// TODO Auto-generated method stub
		return "data/nodeType_example.yml";
	}
}
