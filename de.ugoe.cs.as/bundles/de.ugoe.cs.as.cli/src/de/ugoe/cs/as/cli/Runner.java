package de.ugoe.cs.as.cli;

import java.util.logging.Level;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import de.ugoe.cs.util.console.CommandExecuter;
import de.ugoe.cs.util.console.TextConsole;

public class Runner {

	public static void main(String[] args) {
		CommandExecuter.getInstance().addCommandPackage("de.ugoe.cs.oco.cli");
		CommandExecuter.getInstance().addCommandPackage("de.ugoe.cs.oco.tosca.instantiator.commands");
		CommandExecuter.getInstance().addCommandPackage("de.ugoe.cs.oco.tosca.preprocessor.commands");
		CommandExecuter.getInstance().addCommandPackage("de.ugoe.cs.oco.tosca.yamlgenerator.commands");
		CommandExecuter.getInstance().addCommandPackage("de.ugoe.cs.oco.tosca.yamlparser.commands");
		CommandExecuter.getInstance().addCommandPackage("de.ugoe.cs.oco.tosca2occi.commands");
		
		EcorePlugin.ExtensionProcessor.process(null);
	
		TextConsole console = new TextConsole(Level.ALL);
		console.run();
	}

}
