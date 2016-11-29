package de.ugoe.cs.oco.cli;

import java.util.List;

import de.ugoe.cs.util.console.Command;

public class CMDtest implements Command {

	@Override
	public void run(List<Object> parameters) {
		for (Object object: parameters){
			System.out.println(object);
		}
	}

	@Override
	public String help() {
		return "test <test>";
	}

}
