package de.ugoe.cs.oco.occi2deployment.transformation;

import java.io.File;
import java.nio.file.Path;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.epsilon.eol.models.IModel;
import org.eclipse.epsilon.flock.FlockModule;

import de.ugoe.cs.oco.occi2deployment.DeployerHelper;

public class OCCIC2OCCICTransformator extends AbsTransformator {
	private static File flockFile = new DeployerHelper().loadFile("/de/ugoe/cs/oco/occi2deployment/transformation/etls/occic2occic/OCCIC2OCCIC.mig");

	@Override
	public String transform(Path inputOccic, Path outputOccic) {
		FlockModule module = flockModuleSetup(flockFile);
		
		try {
			
			URI uri = URI.createFileURI(inputOccic.toString());
			String occiURI = "http://schemas.ogf.org/occi/core/ecore";
			IModel inOCCI = createEmfModel("OCCI",
				uri,
				occiURI,
				true,
				false);
			
			
			uri = URI.createFileURI(outputOccic.toString());
			IModel outOCCI = createEmfModel("OCCINew", 
				uri,
				occiURI,
				false, 
				true);
						
			module.getContext().getModelRepository().addModel(inOCCI);
			module.getContext().getModelRepository().addModel(outOCCI);	
			Object result = module.execute(inOCCI, outOCCI);
			inOCCI.store();	
			return result.toString();
			
		} catch (Exception e) {
			e.printStackTrace();
			}
		return null;
	}

	@Override
	public String transform(Resource inputModel, Path outputModel) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String transform(Path inputPath, Path outputPath, Path additionalPath) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String transform(Resource sourceModel, Resource targetModel, Path outputPath) {
		// TODO Auto-generated method stub
		return null;
	}

}
