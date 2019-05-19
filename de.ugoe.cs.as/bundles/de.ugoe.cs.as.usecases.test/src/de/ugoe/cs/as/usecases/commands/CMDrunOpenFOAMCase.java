package de.ugoe.cs.as.usecases.commands;

import java.util.List;

import de.ugoe.cs.as.usecases.test.TestOpenFOAMDeployment;
import de.ugoe.cs.util.console.Command;

public class CMDrunOpenFOAMCase implements Command {

	@Override
	public void run(List<Object> parameters) {
		TestOpenFOAMDeployment test = new TestOpenFOAMDeployment();
		try {
			TestOpenFOAMDeployment.setup();
			test.testProvisioningAndDeployment();
			TestOpenFOAMDeployment.tearDown();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	@Override
	public String help() {
		return "runOpenFOAMCase";
	}
}
