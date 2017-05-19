package de.swz.dist.batch;

import de.swz.dist.batch.JobscriptGenerator;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	String base = "/home/fglaser/open-cloud-orchestrator/de.ugoe.cs.oco/bundles/de.swz.dist.batch.model/model/";
        JobscriptGenerator j = new JobscriptGenerator(base + "amroc_testrun.model",
        		base + "batch.ecore", 
        		base + "jobscript.egl");
        //j.createModule();
        try {
            j.execute();
        } catch (Exception e) {
        	e.printStackTrace();
        }
        System.out.println(j.getResult());
    }
}
