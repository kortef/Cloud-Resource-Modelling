package de.ugoe.cs.oco.cli;

import java.util.List;

import de.ugoe.cs.util.console.Command;

public class CMDlsProps implements Command {

	@Override
	public void run(List<Object> parameters) {
		System.getProperties().list(System.out);
	}

	@Override
	public String help() {
		return "lsProps";
	}

}
