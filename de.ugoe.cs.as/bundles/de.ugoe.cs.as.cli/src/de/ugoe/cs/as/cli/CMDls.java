package de.ugoe.cs.as.cli;

import java.io.File;
import java.util.List;

import de.ugoe.cs.util.console.Command;
import de.ugoe.cs.util.console.Console;

public class CMDls implements Command {

	@Override
	public void run(List<Object> parameters) {
		File curDir = new File(System.getProperty("user.dir"));
		File[] filesList = curDir.listFiles();
		for (File f: filesList){
			Console.println(f.getName());
		}
	}

	@Override
	public String help() {
		return "ls [<path>]";
	}

}
