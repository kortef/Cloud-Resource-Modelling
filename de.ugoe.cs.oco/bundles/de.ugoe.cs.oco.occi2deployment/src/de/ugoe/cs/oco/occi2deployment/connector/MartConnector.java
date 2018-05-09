package de.ugoe.cs.oco.occi2deployment.connector;

import java.nio.file.Path;
import java.nio.file.Paths;

public class MartConnector extends AbsConnector{
	private String keyPath;
	//private String user;
	//private String address;
	//private int port;
	
	public MartConnector(String address, int port, String user, String keyPath) {
		this.address = address;
		this.port = port;
		this.user = user;
		this.keyPath = keyPath;
	}
	

	public Path loadRuntimeModel(String rdirectory, String rfile, String lfile) {
		ModelRetriever.retrieveRuntimeModel(rdirectory, rfile, lfile, this.address, this.port, this.user, this.keyPath);
		//Configuration runtimeConfig = ModelUtility.loadOCCIConfiguration(Paths.get(lfile));
		return Paths.get(lfile);
	}
}
