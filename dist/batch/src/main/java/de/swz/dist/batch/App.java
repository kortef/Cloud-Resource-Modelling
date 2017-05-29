package de.swz.dist.batch;

import de.swz.dist.batch.jobscriptGenerator;
import de.ugoe.cs.util.console.TextConsole;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	TextConsole t = new TextConsole();
    	t.outputMsg("Hello from de.ugoe.cs.util.console.TextConsole !\n");
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
