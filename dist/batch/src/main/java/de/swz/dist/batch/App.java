package de.swz.dist.batch;

import de.swz.dist.utils.EGLExecutor;
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
        EGLExecutor j = new EGLExecutor("amroc_testrun.model", "jobscript.ecore", "jobscript.egl", "jobscript");
        //j.createModule();
        try {
            j.execute();
        } catch (Exception e) {
        	e.printStackTrace();
        }
        System.out.println(j.getResult());
    }
}
