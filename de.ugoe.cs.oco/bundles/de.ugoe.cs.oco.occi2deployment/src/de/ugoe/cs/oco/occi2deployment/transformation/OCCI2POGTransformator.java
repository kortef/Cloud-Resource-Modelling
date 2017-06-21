package de.ugoe.cs.oco.occi2deployment.transformation;

import java.io.File;
import java.nio.file.Path;
import java.util.Map;

import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.epsilon.common.parse.problem.ParseProblem;
import org.eclipse.epsilon.eol.IEolExecutableModule;
import org.eclipse.epsilon.eol.models.IModel;
import org.eclipse.epsilon.etl.EtlModule;
import org.occiware.clouddesigner.occi.OCCIPackage;
import org.occiware.clouddesigner.occi.infrastructure.InfrastructurePackage;
import org.occiware.clouddesigner.occi.util.OCCIResourceFactoryImpl;

import de.ugoe.cs.oco.pog.PogPackage;
import de.ugoe.cs.oco.pog.impl.PogFactoryImpl;
//import de.ugoe.cs.oco.pog.util.PogResourceFactoryImpl;

/**Class implementing the OCCI2POG transformation.
 * @author rockodell
 *
 */
public class OCCI2POGTransformator extends AbsTransformator{
	/* (non-Javadoc)
	 * @see de.ugoe.cs.oco.occi2deployment.transformation.Transformator#transform(java.nio.file.Path, java.nio.file.Path)
	 */
	public String transform(Path occiModelPath, Path pogModelPath){
		OCCIPackage.eINSTANCE.eClass();
		PogPackage.eINSTANCE.eClass();
		InfrastructurePackage.eINSTANCE.eClass();
		
		Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
		Map<String, Object> m = reg.getExtensionToFactoryMap();
		m.put("pog2", new PogFactoryImpl());
		m.put("occie", new OCCIResourceFactoryImpl());
		
		IEolExecutableModule module = new EtlModule();
		Object result = null;		
		// TODO: Remove path
		File transformationFile = new File("/home/rockodell/Projects/Models@RuntimePraktikum/Implementierung/OCCI2Deployment/src/transformations/occi2pog/OCCI2POG.etl");    
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
			String path = occiModelPath.getParent().toString() + "/";
			IModel occiModel = createEmfModel("OCCI",
					path + occiModelPath.getFileName().toString(),
					occiURI,
					true,
					false);
			
			String pogURI = "http://swe.simpaas.pog.de/pog";
			path = pogModelPath.getParent().toString() + "/";
			IModel pogModel = createEmfModel("POG", 
					path + pogModelPath.getFileName().toString(),  
					pogURI,
					false, 
					true);
			
			module.getContext().getModelRepository().addModel(pogModel);
			module.getContext().getModelRepository().addModel(occiModel);
			
			result = module.execute();
			pogModel.store();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result.toString();
	}

	/* (non-Javadoc)
	 * @see de.ugoe.cs.oco.occi2deployment.transformation.Transformator#transform(java.nio.file.Path, java.nio.file.Path, java.nio.file.Path)
	 */
	public String transform(Path inputPath, Path outputPath, Path additionalPath) {
		return transform(inputPath, outputPath, null);
	}
}
