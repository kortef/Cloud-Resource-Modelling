package de.ugoe.cs.oco.occi2deployment.transformation;

import java.io.File;
import java.nio.file.Path;
import java.util.Map;

import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.epsilon.common.parse.problem.ParseProblem;
import org.eclipse.epsilon.eol.models.IModel;
import org.eclipse.epsilon.flock.FlockModule;
import org.eclipse.uml2.uml.UMLPackage;
import org.eclipse.uml2.uml.internal.resource.UMLResourceFactoryImpl;
import org.eclipse.cmf.occi.core.OCCIPackage;
import org.eclipse.cmf.occi.infrastructure.InfrastructurePackage;
import org.eclipse.cmf.occi.core.util.OCCIResourceFactoryImpl;

/**Class implementing the ProvPlan2ExecProvPlan transformation.
 * @author rockodell
 *
 */
@SuppressWarnings("restriction")
public class ProvPlan2ExecProvPlanTransformator extends AbsTransformator {

	/* (non-Javadoc)
	 * @see de.ugoe.cs.oco.occi2deployment.transformation.Transformator#transform(java.nio.file.Path, java.nio.file.Path, java.nio.file.Path)
	 */
	public String transform(Path inputUMLModelPath, Path outputUMLModelPath, Path occiModelPath){
		OCCIPackage.eINSTANCE.eClass();
		UMLPackage.eINSTANCE.eClass();
		InfrastructurePackage.eINSTANCE.eClass();
	
		Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
		Map<String, Object> m = reg.getExtensionToFactoryMap();
		m.put("occie", new OCCIResourceFactoryImpl());
		m.put("uml", new UMLResourceFactoryImpl());
		
		//Aendern zu IEolExecutableModule?FlockModule
		FlockModule module = new FlockModule();
		Object result = null;		
		// TODO: Remove path
		File transformationFile = new File("../de.ugoe.cs.oco.transformations/src/transformations/provPlan2execProvPlan/provPlan2execProvPlan.mig");    
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
			String inputUMLURI = "http://www.eclipse.org/uml2/5.0.0/UML";
			String path = inputUMLModelPath.getParent().toString() + "/";
			IModel inputUMLModel = createEmfModel("inputUML",
					path + inputUMLModelPath.getFileName().toString(),
					inputUMLURI,
					true,
					false);

			String outputUMLURI = "http://www.eclipse.org/uml2/5.0.0/UML";
			path = outputUMLModelPath.getParent().toString() + "/";
			IModel outputUMLModel = createEmfModel("outputUML", 
					path + outputUMLModelPath.getFileName().toString(),  
					outputUMLURI,
					false, 
					true);
			
			String occiURI = "http://schemas.ogf.org/occi/core/ecore";
			path = occiModelPath.getParent().toString() + "/";
			IModel occiModel = createEmfModel("OCCI",
					path + occiModelPath.getFileName().toString(),
					occiURI,
					true,
					false);
			
			module.getContext().getModelRepository().addModel(occiModel);
			module.getContext().getModelRepository().addModel(outputUMLModel);
			module.getContext().getModelRepository().addModel(inputUMLModel);	
			result = module.execute(inputUMLModel, outputUMLModel);
			outputUMLModel.store();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result.toString();
	}

	/* (non-Javadoc)
	 * @see de.ugoe.cs.oco.occi2deployment.transformation.Transformator#transform(java.nio.file.Path, java.nio.file.Path)
	 */
	@Override
	public String transform(Path inputPath, Path outputPath) {
		System.out.println("TODO: Request User for third Path");
		return null;
	}
}
