package de.ugoe.cs.oco.cli;

import java.util.logging.Level;

import de.ugoe.cs.util.console.CommandExecuter;
import de.ugoe.cs.util.console.TextConsole;

public class Runner {

	public static void main(String[] args) {
		CommandExecuter.getInstance().addCommandPackage("de.ugoe.cs.oco.cli");
		CommandExecuter.getInstance().addCommandPackage("de.ugoe.cs.oco.tosca.yamlgenerator.commands");
		CommandExecuter.getInstance().addCommandPackage("de.ugoe.cs.oco.tosca2occi.commands");
		TextConsole console = new TextConsole(Level.ALL);
		console.run();
	}

}
