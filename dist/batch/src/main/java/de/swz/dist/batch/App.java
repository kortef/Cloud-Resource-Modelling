package de.swz.dist.batch;

import java.net.URI;

import de.swz.dist.utils.EGLExecutor;
import de.ugoe.cs.util.console.TextConsole;

/**
 * Hello world!
 *
 */
public class App 
{
	public static void main( String[] args ) throws Exception
	{
		System.out.println(App.class.getClassLoader().getResource("batch/amroc_testrun.model"));
		
		TextConsole t = new TextConsole();
		// //j.createModule();
		JobscriptSources s = new JobscriptSources();
		String base_path = "batch/";

		URI modelURI = s.getSourceFromClasspath(base_path + "amroc_testrun.model");
		URI metamodelURI = s.getSourceFromClasspath(base_path + "jobscript.ecore");
		URI templateURI = s.getSourceFromClasspath(base_path + "jobscript.egl");

		String modelPath = base_path + "amroc_testrun.model";
		String metamodelPath = base_path + "jobscript.ecore";
		String templatePath = base_path + "jobscript.egl";

		t.outputMsg(modelURI.toString() + "\n");
		t.outputMsg(metamodelURI.toString() + "\n");

		t.outputMsg(templateURI.toString() + "\n");

//		EGLExecutor j = new EGLExecutor("jobscript", modelURI, metamodelURI, templateURI);
		EGLExecutor j = new EGLExecutor("jobscript", modelPath, metamodelPath, templatePath);
		j.execute();
		System.out.println(j.getResult());
	}
}
