package de.ugoe.cs.oco.occi2deployment.transformation;

import java.io.File;
import java.nio.file.Path;

import org.eclipse.epsilon.common.parse.problem.ParseProblem;
import org.eclipse.epsilon.eol.models.IModel;
import org.eclipse.epsilon.flock.FlockModule;

public class PCG2IGPTransformator extends AbsTransformator {

	@Override
	public String transform(Path pcgPath, Path ipgPath) {
		//PCG2IPG
		//Aendern zu IEolExecutableModule?FlockModule
		FlockModule module2 = new FlockModule();
		Object result2 = null;		
		// TODO: Remove path
		File transformationFile2 = new File("/home/rockodell/Projects/Models@RuntimePraktikum/Implementierung/OCCI2Deployment/src/transformations/pcg2ipg/PCG2IPG.mig");    
		try {
			module2.parse(transformationFile2);
		} catch (Exception e) {
			e.printStackTrace();
		}
		if (module2.getParseProblems().size() > 0) {
			System.err.println("Parse errors occured...");
			for (ParseProblem problem : module2.getParseProblems()) {
				System.err.println(problem.toString());
			}   
		}
		try {
			String pcgURI2 = "http://swe.simpaas.pcg.de/pcg";
			String path = pcgPath.getParent().toString() + "/";
			IModel PCG = createEmfModel("PCG",
				path + pcgPath.getFileName().toString(),
				pcgURI2,
				true,
				false);
			
			String ipgURI = "http://swe.simpaas.pcg.de/pcg";
			path = ipgPath.getParent().toString() + "/";
			IModel IPG = createEmfModel("IPG", 
				path + ipgPath.getFileName().toString(),  
				ipgURI,
				false, 
				true);
						
			module2.getContext().getModelRepository().addModel(PCG);
			module2.getContext().getModelRepository().addModel(IPG);	
			result2 = module2.execute(PCG, IPG);
			IPG.store();	
		} catch (Exception e) {
			e.printStackTrace();
			}
		return result2.toString();
	}

	@Override
	public String transform(Path inputPath, Path outputPath, Path additionalPath) {
		// TODO Auto-generated method stub
		return null;
	}

}
