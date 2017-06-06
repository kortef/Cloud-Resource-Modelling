package de.swz.dist.batch;

import de.swz.dist.utils.EGLExecutor;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws Exception
    {
    	// String base = "/home/fglaser/open-cloud-orchestrator/de.ugoe.cs.oco/bundles/de.swz.dist.batch.model/model/";
    	String base = "model/";
        EGLExecutor j = new EGLExecutor("jobscript", base + "amroc_testrun.model", base + "batch.ecore", base + "jobscript.egl");
        //j.createModule();
        try {
            j.execute();
            System.out.println("result:" + j.getResult().toString());
        } catch (Exception e) {
        	e.printStackTrace();
        }
       
    }
}
