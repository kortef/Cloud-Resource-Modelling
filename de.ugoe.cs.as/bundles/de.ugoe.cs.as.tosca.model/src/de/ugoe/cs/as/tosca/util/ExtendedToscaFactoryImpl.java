package de.ugoe.cs.as.tosca.util;

import javax.xml.namespace.QName;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EStructuralFeature;

import de.ugoe.cs.as.tosca.DocumentRoot;
import de.ugoe.cs.as.tosca.PropertiesDefinitionType;
import de.ugoe.cs.as.tosca.PropertiesType;
import de.ugoe.cs.as.tosca.TDefinitions;
import de.ugoe.cs.as.tosca.TEntityTemplate;
import de.ugoe.cs.as.tosca.TImport;
import de.ugoe.cs.as.tosca.impl.ToscaFactoryImpl;

public class ExtendedToscaFactoryImpl extends ToscaFactoryImpl {

	@Override
	public PropertiesType createPropertiesType() {
		// TODO Auto-generated method stub
		PropertiesType properties = super.createPropertiesType();
		TEntityTemplate entity = (TEntityTemplate) this.eContainer();
		
		if (entity != null && entity.getTypeRef() != null) {
			TDefinitions definitions = ((DocumentRoot) entity.eResource().getContents().get(0)).getDefinitions().get(0);
			for (TImport imp: definitions.getImport()) {
				imp.getResource();
			}
			
			PropertiesDefinitionType definition = entity.getTypeRef().getPropertiesDefinition();
			QName element = definition.getElement();
			EPackage pack = entity.eResource().getResourceSet().getPackageRegistry().getEPackage(element.getNamespaceURI());
			
			if (pack != null) {
				EClass clazz = (EClass) pack.getEClassifier("DocumentRoot");
				EStructuralFeature feature = clazz.getEStructuralFeature(element.getLocalPart().substring(0, 1).toLowerCase() 
						+ element.getLocalPart().substring(1));
				EClass propertiesClazz = (EClass) feature.getEType();
				
				entity.getProperties().getAny().add(feature, pack.getEFactoryInstance().create(propertiesClazz));
			}
		}
			
		return properties;
	}
}
