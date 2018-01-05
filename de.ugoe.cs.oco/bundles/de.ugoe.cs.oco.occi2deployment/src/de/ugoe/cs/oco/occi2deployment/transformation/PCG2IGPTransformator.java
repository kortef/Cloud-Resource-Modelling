package de.ugoe.cs.oco.occi2deployment.transformation;

import java.io.File;
import java.nio.file.Path;

import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.epsilon.common.parse.problem.ParseProblem;
import org.eclipse.epsilon.eol.IEolExecutableModule;
import org.eclipse.epsilon.eol.models.IModel;
import org.eclipse.epsilon.flock.FlockModule;

public class PCG2IGPTransformator extends AbsTransformator {

	private static File flockFile = new File("../de.ugoe.cs.oco.transformations/src/transformations/pcg2ipg/PCG2IPG.mig");
	
	@Override
	public String transform(Path pcgPath, Path ipgPath) {
		FlockModule module = flockModuleSetup(flockFile);
		
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
						
			module.getContext().getModelRepository().addModel(PCG);
			module.getContext().getModelRepository().addModel(IPG);	
			Object result = module.execute(PCG, IPG);
			IPG.store();	
			return result.toString();
			
		} catch (Exception e) {
			e.printStackTrace();
			}
		return null;
	}

	@Override
	public String transform(Path inputPath, Path outputPath, Path additionalPath) {
		return transform(inputPath, outputPath);
	}

	@Override
	public String transform(Resource inputModel, Path outputPath) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String transform(Resource sourceModel, Resource targetModel, Path outputPath) {
		return transform(sourceModel, outputPath);
	}

}
