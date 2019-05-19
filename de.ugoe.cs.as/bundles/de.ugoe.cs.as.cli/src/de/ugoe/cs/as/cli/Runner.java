package de.ugoe.cs.as.cli;

import java.util.logging.Level;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import de.ugoe.cs.util.console.CommandExecuter;
import de.ugoe.cs.util.console.TextConsole;

public class Runner {

	public static void main(String[] args) {
		CommandExecuter.getInstance().addCommandPackage("de.ugoe.cs.as.cli");
		//CommandExecuter.getInstance().addCommandPackage("de.ugoe.cs.as.tosca.instantiator.commands");
		//CommandExecuter.getInstance().addCommandPackage("de.ugoe.cs.as.tosca.preprocessor.commands");
		//CommandExecuter.getInstance().addCommandPackage("de.ugoe.cs.as.tosca.yamlgenerator.commands");
		//CommandExecuter.getInstance().addCommandPackage("de.ugoe.cs.as.tosca.yamlparser.commands");
		CommandExecuter.getInstance().addCommandPackage("de.ugoe.cs.as.tosca2occi.commands");
		CommandExecuter.getInstance().addCommandPackage("de.ugoe.cs.as.usecases.commands");
		
		EcorePlugin.ExtensionProcessor.process(null);
	
		TextConsole console = new TextConsole(Level.ALL);
		console.run();
	}

}
