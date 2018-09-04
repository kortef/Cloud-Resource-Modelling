package de.ugoe.cs.oco.tosca.gen.extension;


import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.xmi.XMIResource;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.eclipse.emf.ecore.xmi.impl.URIHandlerImpl;

public final class ConverterUtils {


	public static void save(ResourceSet resourceSet, EPackage rootElement, String path) throws IOException {
		URI uri = URI.createFileURI(path);
		Resource resource = resourceSet.createResource(uri);
		resourceSet.getURIConverter().getURIMap().put(URI.createURI(rootElement.getNsURI()), uri);
		
		resource.getContents().add(rootElement);
		
		Map<String, Object> options = new HashMap<String, Object>();
		options.put(XMIResource.OPTION_ENCODING, "UTF-8");
		//options.put(XMLResource.OPTION_URI_HANDLER, new URIHandlerImpl.AbsoluteCrossBundleAware());
		//options.put(XMIResource.OPTION_PROCESS_DANGLING_HREF, XMIResource.OPTION_PROCESS_DANGLING_HREF_DISCARD);
		resource.save(options);
	}

	public static String formatName(String name) {
		String temp = name.replaceAll(" ", "_");
		if (temp.startsWith("occi.")) {
			String[] split = temp.split("\\.");
			temp = split[split.length - 1];
		}
		return temp;
	}

	public static String toU1Case(String temp) {
		temp = temp.substring(0, 1).toUpperCase() + temp.substring(1);
		return temp;
	}

	public static String toEcoreCompatibleName(String yamlName) {
		StringBuilder sb = new StringBuilder(yamlName);

		for (int i = 0; i < sb.length(); i++) {
		    if (sb.charAt(i) == '.') {
		        sb.deleteCharAt(i);
		        sb.replace(i, i+1, String.valueOf(Character.toUpperCase(sb.charAt(i))));
		    }
		}
		sb.replace(0, 1, String.valueOf(Character.toUpperCase(sb.charAt(0))));
		
		return sb.toString();
	}
	
	public static void persistMetamodel(ResourceSet resourceSet, EPackage generated, String path) throws IOException {
//		if (new File(path).exists()) {
//			EPackage existing = (EPackage) OcciHelper.getRootElement(resourceSet, "file:/" + path);
//			for (Iterator<EObject> iterator = existing.eAllContents(); iterator.hasNext();) {
//				EObject eo = iterator.next();
//				if (eo instanceof EAnnotation && isOCLRelated((EAnnotation) eo)) {
//					EModelElement existingContainer = (EModelElement) eo.eContainer();
//					EModelElement generatedContainer = (EModelElement) getGeneratedElement(generated,
//							existingContainer);
//					if (generatedContainer == null) {
//						throw new RuntimeException("Unable to find " + existingContainer + " to reattach " + eo + " "
//								+ ((EAnnotation) eo).getEAnnotations());
//					} else {
//						generatedContainer.getEAnnotations().add((EAnnotation) EcoreUtil.copy(eo));
//					}
//				}
//			}
//		}
		ConverterUtils.save(resourceSet, generated, path);
	}

}