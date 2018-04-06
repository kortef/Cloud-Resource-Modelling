package de.ugoe.cs.oco.tosca.gen.extension;


import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.xmi.XMIResource;

public final class ConverterUtils {


	public static void save(ResourceSet resourceSet, EObject rootElement, String path) throws IOException {
		Resource resource = resourceSet.createResource(URI.createURI(path));
		resource.getContents().add(rootElement);
		Map<String, String> options = new HashMap<String, String>();
		options.put(XMIResource.OPTION_ENCODING, "UTF-8");
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
		ConverterUtils.save(resourceSet, generated, "file:/" + path);
	}

}