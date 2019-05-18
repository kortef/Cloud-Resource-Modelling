package de.ugoe.cs.oco.cli;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

import de.ugoe.cs.util.console.Command;
import de.ugoe.cs.util.console.Console;

public class CMDcat implements Command {

	@Override
	public void run(List<Object> parameters) {
		String fileSeparator = System.getProperty("file.separator");
		try {
			Path filePath = Paths.get((String) parameters.get(0));
			if (!filePath.isAbsolute()){
				filePath = Paths.get(System.getProperty("user.dir") 
						+ fileSeparator
						+ filePath);
			}
			
			FileReader reader = new FileReader(filePath.toString());
			BufferedReader in = new BufferedReader(reader);
			String line;
			while ((line = in.readLine()) != null){
				Console.println(line);
			}
			in.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e){
			e.printStackTrace();
		}
		
	}

	@Override
	public String help() {
		return "cat <filename>";
	}

}
