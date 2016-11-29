package de.ugoe.cs.oco.utils;

import java.io.BufferedReader;
import java.io.File;
import java.io.InputStreamReader;
import java.util.List;
import java.util.Properties;

public class ShellCMDExecutor {
	public static String execute(List<String> command){
		StringBuffer output = new StringBuffer("");
		
		ProcessBuilder pb;
		Process p;
		
		try {
			pb = new ProcessBuilder(command);
			pb.redirectErrorStream(true);
			pb.directory(new File(System.getProperty("user.dir")));
			
			p = pb.start();
			p.waitFor();
			
			BufferedReader reader = new BufferedReader(
					new InputStreamReader(
							p.getInputStream()));
			
			String line = "";
			while ((line = reader.readLine()) != null){
				output.append(line + "\n");
			}
		} catch (Exception e){
			e.printStackTrace();
		}
		
		return output.toString();
	}
}
