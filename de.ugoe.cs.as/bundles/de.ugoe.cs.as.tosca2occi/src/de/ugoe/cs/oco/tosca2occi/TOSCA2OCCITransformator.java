/**
 * 
 */
package de.ugoe.cs.oco.tosca2occi;
import java.io.IOException;
import java.net.URISyntaxException;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import org.eclipse.cmf.occi.core.Extension;
import org.eclipse.cmf.occi.core.util.OCCIResourceFactoryImpl;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xml.type.XMLTypePackage;
import org.eclipse.epsilon.common.parse.problem.ParseProblem;
import org.eclipse.epsilon.common.util.StringProperties;
import org.eclipse.epsilon.emc.emf.EmfModel;
import org.eclipse.epsilon.emc.emf.InMemoryEmfModel;
import org.eclipse.epsilon.eol.dt.ExtensionPointToolNativeTypeDelegate;
import org.eclipse.epsilon.eol.exceptions.models.EolModelLoadingException;
import org.eclipse.epsilon.eol.models.IModel;
import org.eclipse.epsilon.eol.models.IRelativePathResolver;
import org.eclipse.epsilon.etl.EtlModule;

import de.ugoe.cs.oco.tosca.util.ToscaResourceFactoryImpl;

/**
 * Class responsible for handling the transformation of TOSCA models to OCCI models.
 * @author Fabian Korte
 */
public class TOSCA2OCCITransformator {
	/**
	 * @param toscaModelURI The input path to the TOSCA model
	 * @param occiModelURI The output path where the generated OCCI model will be stored. 
	 * @return
	 * @throws Exception
	 */
	public String transform(URI toscaModelURI, URI occiModelURI) throws Exception{
		//EcorePlugin.ExtensionProcessor.process(null);

		ResourceSet occiSet = new ResourceSetImpl();
		ResourceSet toscaSet = new ResourceSetImpl();

		Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
		Map<String, Object> m = reg.getExtensionToFactoryMap();
		m.put("toscac", new ToscaResourceFactoryImpl());
		m.put("occic", new OCCIResourceFactoryImpl());

		EtlModule module = new EtlModule();

		// added for execution in Eclipse
		//module.getContext().getNativeTypeDelegates().add(new ExtensionPointToolNativeTypeDelegate());

		Object result = null;		
		try {
			module.parse(this.getClass().getClassLoader().getResource("model/TOSCA2OCCI.etl").toURI());

		} catch (Exception e) {
			e.printStackTrace();
		}
		if (module.getParseProblems().size() > 0) {
			System.err.println("Parse errors occured...");
			for (ParseProblem problem : module.getParseProblems()) {
				System.err.println(problem.toString());
			}   
		}

		HashMap<String, String> extensionMap = new HashMap<String, String>();
		extensionMap.put("http://schemas.ogf.org/occi/core", "Core");
		extensionMap.put("http://schemas.ogf.org/occi/infrastructure", "Infrastructure");
		extensionMap.put("http://schemas.modmacao.org/placement", "Placement");
		extensionMap.put("http://schemas.modmacao.org/modmacao", "Modmacao");
		extensionMap.put("http://schemas.modmacao.org/occi/platform", "Platform");
		extensionMap.put("http://schemas.modmacao.org/openstack/swe", "Sweruntime");


		for (Entry<String, String> entry: extensionMap.entrySet()) {
			Resource resource = occiSet.getResource(URI.createURI(entry.getKey(), true), true);
			IModel model = new InMemoryEmfModel(resource);
			model.setName(entry.getValue());
			module.getContext().getModelRepository().addModel(model);
			model.getAliases().add("OCCIExtensions");
		}

		List<Resource> externalOCCIExt = new OCCIExtensionLoader().searchAndLoadOCCIExtensions(
				occiModelURI.trimSegments(1), occiSet);

		for (Resource externalResource: externalOCCIExt) {
			Extension externalExtension = (Extension) externalResource.getContents().get(0);
			InMemoryEmfModel model = new InMemoryEmfModel(externalResource);
			model.setName(externalExtension.getName());
			module.getContext().getModelRepository().addModel(model);
			model.getAliases().add("OCCIExtensions");
		}

		Resource resource = null;

		List<Resource> externalEcoreModels = new EcoreModelLoader().searchAndLoadEcoreModels(
				toscaModelURI.trimSegments(1), toscaSet);

		for (Resource externalResource: externalEcoreModels) {
			EPackage externalPackage = (EPackage) externalResource.getContents().get(0);
			InMemoryEmfModel model = new InMemoryEmfModel(externalResource);
			model.setName(externalPackage.getName());
			module.getContext().getModelRepository().addModel(model);
		}

		EPackage toscaPackage = getTOSCAPackage(toscaSet);
		toscaSet.getPackageRegistry().put(toscaPackage.getNsURI(), toscaPackage);
		EPackage xmlTypePackage = EPackage.Registry.INSTANCE.getEPackage(XMLTypePackage.eNS_URI);
		toscaSet.getPackageRegistry().put(xmlTypePackage.getNsURI(), xmlTypePackage);

		resource = toscaSet.getResource(toscaModelURI, true);
		InMemoryEmfModel toscaModel = new InMemoryEmfModel(resource);
		toscaModel.setName("TOSCA");

		resource = occiSet.createResource(occiModelURI);
		InMemoryEmfModel occiModel = new InMemoryEmfModel(resource);
		occiModel.setName("OCCI");

		module.getContext().getModelRepository().addModel(toscaModel);
		module.getContext().getModelRepository().addModel(occiModel);

		result = module.execute();
		occiModel.getResource().save(null);

		return result.toString();
	}
	
	  protected static EmfModel createEmfModel(String name, String model, 
		      String metamodel, boolean readOnLoad, boolean storeOnDisposal) 
		          throws EolModelLoadingException, URISyntaxException {
		    EmfModel emfModel = new EmfModel();
		    StringProperties properties = new StringProperties();
		    properties.put(EmfModel.PROPERTY_NAME, name);
		    properties.put(EmfModel.PROPERTY_MODEL_URI, model);
		    properties.put(EmfModel.PROPERTY_METAMODEL_URI, metamodel);
		    properties.put(EmfModel.PROPERTY_READONLOAD, readOnLoad + "");
		    properties.put(EmfModel.PROPERTY_STOREONDISPOSAL, 
		        storeOnDisposal + "");
		    emfModel.load(properties, (IRelativePathResolver) null);
		    return emfModel;
	}
	  
		private static EPackage getTOSCAPackage(ResourceSet set) {
			// load tosca metamodel to be able to inherit from defined classes
			// only works when actually run as plugin
			final URI uri = URI.createPlatformPluginURI("/de.ugoe.cs.oco.tosca.model/model/tosca.ecore", true);
			Resource res = set.createResource(uri);
			
			try {
				res.load(Collections.EMPTY_MAP);
			} catch (IOException e) {
				e.printStackTrace();
			}
			EPackage toscaPackage = (EPackage) res.getContents().get(0);
			return toscaPackage;
		}
}

