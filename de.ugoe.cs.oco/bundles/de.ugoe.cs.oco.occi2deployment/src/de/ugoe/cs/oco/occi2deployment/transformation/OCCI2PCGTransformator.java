package de.ugoe.cs.oco.occi2deployment.transformation;

import java.io.File;
import java.nio.file.Path;
import java.util.Map;

import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.epsilon.common.parse.problem.ParseProblem;
import org.eclipse.epsilon.emc.emf.EmfModel;
import org.eclipse.epsilon.eol.IEolExecutableModule;
import org.eclipse.epsilon.eol.models.IModel;
import org.eclipse.epsilon.etl.EtlModule;
import org.eclipse.cmf.occi.core.OCCIPackage;
import org.eclipse.cmf.occi.core.util.OCCIResourceFactoryImpl;

import pcg.PcgPackage;
import pcg.impl.PcgFactoryImpl;

public class OCCI2PCGTransformator extends AbsTransformator {

	@Override
	public String transform(Path oldOCCI, Path newOCCI) {
		return null;
	}

	@Override
	public String transform(Path oldModelPath, Path newModelPath, Path pcgPath) {
		PcgPackage.eINSTANCE.eClass();
		OCCIPackage.eINSTANCE.eClass();
		
		Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
		Map<String, Object> m = reg.getExtensionToFactoryMap();
		m.put("pcg2", new PcgFactoryImpl());
		m.put("occie", new OCCIResourceFactoryImpl());
		
		IEolExecutableModule module = new EtlModule();
		Object result = null;		
		// TODO: Remove path
		File transformationFile = new File("../de.ugoe.cs.oco.transformations/src/transformations/occi2pcg/OCCI2PCG.etl");    
		try {
			module.parse(transformationFile);
		} catch (Exception e) {
			e.printStackTrace();
		}
		if (module.getParseProblems().size() > 0) {
			System.err.println("Parse errors occured...");
			for (ParseProblem problem : module.getParseProblems()) {
				System.err.println(problem.toString());
			}   
		}

		try {
			
			
			
			
			String occiURI = "http://schemas.ogf.org/occi/core/ecore";
			String path = oldModelPath.getParent().toString() + "/";
			IModel oldOCCI = createEmfModel("srcOCCI",
					path + oldModelPath.getFileName().toString(),
					occiURI,
					true,
					false);
			
			
			path = newModelPath.getParent().toString() + "/";
			IModel newOCCI = createEmfModel("tarOCCI",
					path + newModelPath.getFileName().toString(),
					occiURI,
					true,
					false);
			
			String pcgURI = "http://swe.simpaas.pcg.de/pcg";
			path = pcgPath.getParent().toString() + "/";
			IModel pcgModel = new EmfModel();
			pcgModel = createEmfModel("PCG", 
					path + pcgPath.getFileName().toString(),  
					pcgURI,
					false, 
					true);
			
			module.getContext().getModelRepository().addModel(oldOCCI);
			module.getContext().getModelRepository().addModel(newOCCI);
			module.getContext().getModelRepository().addModel(pcgModel);
			result = module.execute();
			pcgModel.store();
			
			return result.toString();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;	
	}

}
