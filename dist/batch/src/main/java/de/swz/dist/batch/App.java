package de.swz.dist.batch;

import de.swz.dist.batch.jobscriptGenerator;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        jobscriptGenerator j = new jobscriptGenerator("amroc_testrun.model", "jobscript.ecore", "jobscript.egl");
        //j.createModule();
        try {
            j.execute();
        } catch (Exception e) {
        	e.printStackTrace();
        }
        System.out.println(j.getResult());
    }
}
