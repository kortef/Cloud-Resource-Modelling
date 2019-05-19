package de.ugoe.cs.as.usecases.commands;

import java.util.List;

import de.ugoe.cs.as.usecases.test.TestEmptyDeployment;
import de.ugoe.cs.util.console.Command;

public class CMDcleanUpEnvironment implements Command {

	@Override
	public void run(List<Object> parameters) {
		TestEmptyDeployment test = new TestEmptyDeployment();
		try {
			test.deprovisionEverything();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	@Override
	public String help() {
		return "cleanUpEnvironment";
	}
}
