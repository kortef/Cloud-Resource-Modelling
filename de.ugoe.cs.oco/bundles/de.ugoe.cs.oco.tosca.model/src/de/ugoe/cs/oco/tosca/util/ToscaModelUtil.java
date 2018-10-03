package de.ugoe.cs.oco.tosca.util;

import javax.xml.namespace.QName;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xsd.XSDElementDeclaration;

import de.ugoe.cs.oco.tosca.DocumentRoot;
import de.ugoe.cs.oco.tosca.TDefinitions;
import de.ugoe.cs.oco.tosca.TEntityType;
import de.ugoe.cs.oco.tosca.TImport;
import de.ugoe.cs.oco.tosca.TRequirementType;
import de.ugoe.cs.oco.tosca.ToscaPackage;

public class ToscaModelUtil {
	public static TEntityType resolveType(EObject object, QName qName){
		String namespaceURI = qName.getNamespaceURI();
		TEntityType entityTypeRef = null; 
		
		DocumentRoot root = (DocumentRoot) object.eResource().getContents().get(0);
		if (namespaceURI == null || namespaceURI.equals("") || namespaceURI.equals(root.getDefinitions().get(0).getTargetNamespace())) {
			entityTypeRef = (TEntityType) object.eResource().getEObject(qName.getLocalPart());				
		}
		else {
			EList<TImport> imports = ((TDefinitions) root.getDefinitions().get(0)).getImport();
			for (TImport imp:imports) {
				if (imp.getImportType().equals(ToscaPackage.eNS_URI) || (imp.getImportType().equals("http://docs.oasis-open.org/tosca/ns/2011/12") 
						&& imp.getNamespace().equals(namespaceURI))) {
					Resource resource = imp.getResource();
					entityTypeRef = (TEntityType) resource.getEObject(qName.getLocalPart());
				}
			}
		}
		
		
		return entityTypeRef;
	}
	
	public static XSDElementDeclaration resolveElementDeclaration(EObject object, QName qName) {
		XSDElementDeclaration elementDeclarationRef = null;
		String namespaceURI = qName.getNamespaceURI();
		DocumentRoot root = (DocumentRoot) object.eResource().getContents().get(0);
		
		EList<TImport> imports = ((TDefinitions) root.getDefinitions().get(0)).getImport();
		for (TImport imp:imports) {
			if (imp.getImportType().equals("http://www.w3.org/2001/XMLSchema") 
					&& imp.getNamespace().equals(namespaceURI)) {
				Resource resource = imp.getResource();
				elementDeclarationRef = (XSDElementDeclaration) resource.getEObject(qName.getLocalPart());
			}
		}
		
		return elementDeclarationRef;
	}
}
