package de.ugoe.cs.oco.occi2deployment.transformation;

import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.epsilon.common.parse.problem.ParseProblem;
import org.eclipse.epsilon.emc.emf.EmfModel;
import org.eclipse.epsilon.emc.emf.EmfModelFactory;
import org.eclipse.epsilon.eol.IEolExecutableModule;
import org.eclipse.epsilon.eol.models.IModel;
import org.eclipse.epsilon.eol.models.ModelGroup;
import org.eclipse.epsilon.eol.models.ModelRepository;
import org.eclipse.epsilon.eol.models.java.JavaModel;
import org.eclipse.epsilon.eol.models.java.JavaObjectModel;
import org.eclipse.epsilon.etl.EtlModule;
import org.eclipse.epsilon.emc.emf.EmfModelResourceSet;
import org.eclipse.epsilon.emc.emf.InMemoryEmfModel;

import de.ugoe.cs.oco.occi2deployment.ModelUtility;

import org.eclipse.cmf.occi.core.Extension;
import org.eclipse.cmf.occi.core.OCCIPackage;
import org.eclipse.cmf.occi.core.util.OCCIResourceFactoryImpl;

import pcg.PcgPackage;
import pcg.impl.PcgFactoryImpl;

public class OCCI2PCGTransformator extends AbsTransformator {

	private static File etlFile = new File("../de.ugoe.cs.oco.transformations/src/transformations/occi2pcg/OCCI2PCG.etl");
	
	private void factorySetup() {
		PcgPackage.eINSTANCE.eClass();
		OCCIPackage.eINSTANCE.eClass();
		
		Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
		
		Map<String, Object> m = reg.getExtensionToFactoryMap();
		m.put("pcg2", new PcgFactoryImpl());
		m.put("occie", new OCCIResourceFactoryImpl());	
	}
	
	@Override
	public String transform(Path oldModelPath, Path newModelPath, Path pcgPath) {
		factorySetup();	
		IEolExecutableModule module = etlModuleSetup(etlFile);
		
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
			
			
			Object result = module.execute();
			pcgModel.store();
			
			return result.toString();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;	
	}

	@Override
	public String transform(Resource sourceModel, Resource targetModel, Path outputPath) {
		factorySetup();	
		IEolExecutableModule module = etlModuleSetup(etlFile);

		try {	
			String pcgURI = "http://swe.simpaas.pcg.de/pcg";
			String path = outputPath.getParent().toString() + "/";
			IModel pcgModel = new EmfModel();
			pcgModel = createEmfModel("PCG", 
					path + outputPath.getFileName().toString(),  
					pcgURI,
					false, 
					true);
			

			InMemoryEmfModel source = new InMemoryEmfModel("srcOCCI", sourceModel, OCCIPackage.eINSTANCE);
			InMemoryEmfModel target = new InMemoryEmfModel("tarOCCI", targetModel, OCCIPackage.eINSTANCE);
			source.getAliases().add("srcOCCI");
			target.getAliases().add("tarOCCI");
			
			
			module.getContext().getModelRepository().addModel(source);
			module.getContext().getModelRepository().addModel(target);
			module.getContext().getModelRepository().addModel(pcgModel);
			
			Object result = module.execute();
			pcgModel.store();
					
			return result.toString();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public String transform(Resource inputModel, Path outputModel) {
		return null;
	}
	
	@Override
	public String transform(Path oldOCCI, Path newOCCI) {
		return null;
	}
}
