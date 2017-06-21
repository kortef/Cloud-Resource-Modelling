package de.ugoe.cs.oco.occi2deployment.transformation;

import java.io.File;
import java.nio.file.Path;
import java.util.Map;

import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.epsilon.common.parse.problem.ParseProblem;
import org.eclipse.epsilon.eol.IEolExecutableModule;
import org.eclipse.epsilon.eol.models.IModel;
import org.eclipse.epsilon.etl.EtlModule;

import de.ugoe.cs.oco.pog.PogPackage;
import de.ugoe.cs.oco.pog.impl.PogFactoryImpl;
import org.eclipse.uml2.uml.UMLPackage;
import org.eclipse.uml2.uml.internal.resource.UMLResourceFactoryImpl;

/**Class implementing the POG2ProvPlan transformation.
 * @author rockodell
 *
 */
@SuppressWarnings("restriction")
public class POG2ProvPlanTransformator extends AbsTransformator{
	/* (non-Javadoc)
	 * @see de.ugoe.cs.oco.occi2deployment.transformation.Transformator#transform(java.nio.file.Path, java.nio.file.Path)
	 */
	public String transform(Path pogModelPath, Path umlModelPath){
		PogPackage.eINSTANCE.eClass();
		UMLPackage.eINSTANCE.eClass();
	
		Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
		Map<String, Object> m = reg.getExtensionToFactoryMap();
		m.put("pog2", new PogFactoryImpl());
		m.put("uml", new UMLResourceFactoryImpl());
		
		IEolExecutableModule module = new EtlModule();
		Object result = null;		
		// TODO: Remove path
		File transformationFile = new File("/home/rockodell/Projects/Models@RuntimePraktikum/Implementierung/OCCI2Deployment/src/transformations/pog2provPlan/POG2ProvPlan.etl");    
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
			String pogURI = "http://swe.simpaas.pog.de/pog";
			String path = pogModelPath.getParent().toString() + "/";
			IModel pogModel = createEmfModel("POG",
					path + pogModelPath.getFileName().toString(),
					pogURI,
					true,
					false);

			
			String umlURI = "http://www.eclipse.org/uml2/5.0.0/UML";
			path = umlModelPath.getParent().toString() + "/";
			IModel umlModel = createEmfModel("UML", 
					path + umlModelPath.getFileName().toString(),  
					umlURI,
					false, 
					true);
					
			module.getContext().getModelRepository().addModel(umlModel);
			module.getContext().getModelRepository().addModel(pogModel);
			
			result = module.execute();
			umlModel.store();
			
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
