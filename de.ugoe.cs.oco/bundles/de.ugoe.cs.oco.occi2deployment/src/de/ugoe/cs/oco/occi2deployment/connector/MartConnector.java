package de.ugoe.cs.oco.occi2deployment.connector;

import java.nio.file.Path;
import java.nio.file.Paths;

import de.ugoe.cs.oco.occi2deployment.transformation.Transformator;
import de.ugoe.cs.oco.occi2deployment.transformation.TransformatorFactory;

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
		Transformator trans = TransformatorFactory.getTransformator("OCCIC2OCCIC");
		trans.transform(Paths.get(lfile), Paths.get("adjustedRuntimeModel"));
		//Configuration runtimeConfig = ModelUtility.loadOCCIConfiguration(Paths.get(lfile));
		return Paths.get(lfile);
	}
}
