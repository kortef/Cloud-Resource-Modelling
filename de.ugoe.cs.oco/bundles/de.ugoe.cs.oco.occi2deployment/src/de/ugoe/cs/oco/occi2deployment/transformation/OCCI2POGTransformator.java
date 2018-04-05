package de.ugoe.cs.oco.occi2deployment.transformation;

import java.io.File;
import java.nio.file.Path;
import java.util.Map;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.epsilon.common.parse.problem.ParseProblem;
import org.eclipse.epsilon.emc.emf.InMemoryEmfModel;
import org.eclipse.epsilon.eol.IEolExecutableModule;
import org.eclipse.epsilon.eol.models.IModel;
import org.eclipse.epsilon.etl.EtlModule;
import org.eclipse.cmf.occi.core.OCCIPackage;
import org.eclipse.cmf.occi.infrastructure.InfrastructurePackage;
import org.eclipse.cmf.occi.core.util.OCCIResourceFactoryImpl;

import de.ugoe.cs.oco.occi2deployment.DeployerHelper;
import de.ugoe.cs.oco.pog.PogPackage;
import de.ugoe.cs.oco.pog.impl.PogFactoryImpl;
//import de.ugoe.cs.oco.pog.util.PogResourceFactoryImpl;

/**Class implementing the OCCI2POG transformation.
 * @author rockodell
 *
 */
public class OCCI2POGTransformator extends AbsTransformator{
	//private static File etlFile = new File("../de.ugoe.cs.oco.transformations/src/transformations/occi2pog/OCCI2POG.etl");
	//private static File etlFile = new File(new DeployerHelper().loadURL("/de/ugoe/cs/oco/occi2deployment/transformation/etls/occi2ppg/OCCI2POG.etl").getFile());
	private static File etlFile = new DeployerHelper().loadFile("/de/ugoe/cs/oco/occi2deployment/transformation/etls/occi2pog/OCCI2POG.etl");
	
	
	
	private void factorySetup() {
		OCCIPackage.eINSTANCE.eClass();
		PogPackage.eINSTANCE.eClass();
		InfrastructurePackage.eINSTANCE.eClass();
		
		Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
		Map<String, Object> m = reg.getExtensionToFactoryMap();
		m.put("pog2", new PogFactoryImpl());
		m.put("occie", new OCCIResourceFactoryImpl());
	}
	
	/* (non-Javadoc)
	 * @see de.ugoe.cs.oco.occi2deployment.transformation.Transformator#transform(java.nio.file.Path, java.nio.file.Path)
	 */
	public String transform(Path occiModelPath, Path pogModelPath){
		factorySetup();
		
		IEolExecutableModule module = etlModuleSetup(etlFile);
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
			
			Object result = module.execute();
			pogModel.store();
			
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
	public String transform(Resource inputModel, Path outputPath) {
		factorySetup();
		IEolExecutableModule module = etlModuleSetup(etlFile);

		try {
			InMemoryEmfModel occiModel = new InMemoryEmfModel("OCCI", inputModel, OCCIPackage.eINSTANCE);
			occiModel.getAliases().add("OCCI");
			
			
			URI uri = URI.createFileURI(outputPath.toString());
			String pogURI = "http://swe.simpaas.pog.de/pog";
			String path = outputPath.getParent().toString() + "/";
			IModel pogModel = createEmfModel("POG", 
					//path + outputPath.getFileName().toString(),  
					uri,
					pogURI,
					false, 
					true);
			
			module.getContext().getModelRepository().addModel(pogModel);
			module.getContext().getModelRepository().addModel(occiModel);
			
			Object result = module.execute();
			pogModel.store();
			return result.toString();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public String transform(Resource sourceModel, Resource targetModel, Path outputPath) {
		return transform(sourceModel, outputPath);
	}
}
