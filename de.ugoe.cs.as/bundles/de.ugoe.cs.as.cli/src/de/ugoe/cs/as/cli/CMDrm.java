package de.ugoe.cs.as.cli;

import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

import de.ugoe.cs.util.console.Command;
import de.ugoe.cs.util.console.Console;

public class CMDrm implements Command {

	@Override
	public void run(List<Object> parameters) {
		String fileSeparator = System.getProperty("file.separator");
		Path filePath = Paths.get((String) parameters.get(0));
		if (!filePath.isAbsolute()){
			filePath = Paths.get(System.getProperty("user.dir") 
						+ fileSeparator
						+ filePath);
		}
		
		File file = new File(filePath.toString());
		if (file.delete()){
			Console.println("Deleted file " + file);
		}
		
	}

	@Override
	public String help() {
		return "rm <filename>";
	}

}
