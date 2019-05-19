package de.ugoe.cs.as.usecases.commands;

import java.util.List;

import de.ugoe.cs.as.usecases.test.TestSugarCRMDeployment;
import de.ugoe.cs.util.console.Command;

public class CMDrunSugarCRMCase implements Command {

	@Override
	public void run(List<Object> parameters) {
		TestSugarCRMDeployment test = new TestSugarCRMDeployment();
		try {
			TestSugarCRMDeployment.setup();
			test.testProvisioningAndDeployment();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	@Override
	public String help() {
		return "runSugarCRMCase";
	}
}
