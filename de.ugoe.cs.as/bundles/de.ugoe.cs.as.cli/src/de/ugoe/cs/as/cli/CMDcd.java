package de.ugoe.cs.as.cli;

import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

import de.ugoe.cs.util.console.Command;

public class CMDcd implements Command {

	@Override
	public void run(List<Object> parameters) {
		Path filepath = Paths.get(System.getProperty("user.dir"));
		
		if (parameters.size() == 0){
			filepath = Paths.get(System.getProperty("user.home"));
		}
		else {
			try {
				filepath = Paths.get((String) parameters.get(0));
				if (!filepath.isAbsolute()){
					if (filepath.toString().equals("..")){
						filepath = Paths.get(System.getProperty("user.dir")).getParent();
					}
					else {
						filepath = Paths.get(System.getProperty("user.dir") 
								+ System.getProperty("file.separator") 
								+ filepath);
					}
				}
			}
			catch (Exception e){
				throw new IllegalArgumentException();
			}
		}
		
		if (!new File(filepath.toString()).exists()){
			throw new IllegalArgumentException("Path does not exist.");
		}
		System.setProperty("user.dir", filepath.toString());
	}

	@Override
	public String help() {
		return "cd [<path>]";
	}

}
