package de.ugoe.cs.oco.occi2deployment.transformation;

import java.io.File;
import java.nio.file.Path;
import java.util.Map;

import org.eclipse.cmf.occi.core.OCCIPackage;
import org.eclipse.cmf.occi.core.util.OCCIResourceFactoryImpl;
import org.eclipse.cmf.occi.infrastructure.InfrastructurePackage;
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
public class POG2ProvPlanTransformator extends AbsTransformator{
	private static File etlFile = new File("../de.ugoe.cs.oco.transformations/src/transformations/pog2provPlan/POG2ProvPlan.etl");
	
	private void factorySetup() {
		PogPackage.eINSTANCE.eClass();
		UMLPackage.eINSTANCE.eClass();
	
		Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
		Map<String, Object> m = reg.getExtensionToFactoryMap();
		m.put("pog2", new PogFactoryImpl());
		m.put("uml", new UMLResourceFactoryImpl());
	}
	
	/* (non-Javadoc)
	 * @see de.ugoe.cs.oco.occi2deployment.transformation.Transformator#transform(java.nio.file.Path, java.nio.file.Path)
	 */
	public String transform(Path pogModelPath, Path umlModelPath){
		factorySetup();
		IEolExecutableModule module = etlModuleSetup(etlFile);
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
			
			Object result = module.execute();
			umlModel.store();
			return result.toString();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	/* (non-Javadoc)
	 * @see de.ugoe.cs.oco.occi2deployment.transformation.Transformator#transform(java.nio.file.Path, java.nio.file.Path, java.nio.file.Path)
	 */
	public String transform(Path inputPath, Path outputPath, Path additionalPath) {
		return transform(inputPath, outputPath);
	}

	@Override
	public String transform(Resource inputModel, Path outputModel) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String transform(Resource sourceModel, Resource targetModel, Path outputPath) {
		// TODO Auto-generated method stub
		return null;
	}
}
