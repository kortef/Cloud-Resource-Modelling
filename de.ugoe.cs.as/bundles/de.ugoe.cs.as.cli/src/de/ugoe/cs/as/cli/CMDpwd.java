package de.ugoe.cs.as.cli;

import java.util.List;

import de.ugoe.cs.util.console.Command;
import de.ugoe.cs.util.console.Console;

public class CMDpwd implements Command {

	@Override
	public void run(List<Object> parameters) {
		Console.println(System.getProperty("user.dir"));
	}

	@Override
	public String help() {
		return "pwd";
	}

}
