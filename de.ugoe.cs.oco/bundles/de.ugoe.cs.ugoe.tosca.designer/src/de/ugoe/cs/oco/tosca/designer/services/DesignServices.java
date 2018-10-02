/**
 * 
 */
package de.ugoe.cs.oco.tosca.designer.services;


import javax.xml.namespace.QName;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EStructuralFeature;

import de.ugoe.cs.oco.tosca.DocumentRoot;
import de.ugoe.cs.oco.tosca.PropertiesDefinitionType;
import de.ugoe.cs.oco.tosca.TDefinitions;
import de.ugoe.cs.oco.tosca.TEntityTemplate;
import de.ugoe.cs.oco.tosca.TImport;
import de.ugoe.cs.oco.tosca.TTopologyTemplate;
import de.ugoe.cs.oco.tosca.impl.ToscaFactoryImpl;


/**
 * @author fkorte
 *
 */
public class DesignServices {	
	public void addProperties(TEntityTemplate entity) {
		PropertiesDefinitionType definition = entity.getTypeRef().getPropertiesDefinition();
		
		//Make sure all packages are loaded
		TDefinitions definitions = ((DocumentRoot) entity.eResource().getContents().get(0)).getDefinitions().get(0);
		for (TImport imp: definitions.getImport()) {
			imp.getResource();
		}
		
		QName element = definition.getElement();
		EPackage pack = entity.eResource().getResourceSet().getPackageRegistry().getEPackage(element.getNamespaceURI());
		
		if (pack != null) {
			EClass clazz = (EClass) pack.getEClassifier("DocumentRoot");
			EStructuralFeature feature = clazz.getEStructuralFeature(element.getLocalPart().substring(0, 1).toLowerCase() 
					+ element.getLocalPart().substring(1));
			EClass propertiesClazz = (EClass) feature.getEType();
			
			if (entity.getProperties() == null) {
				entity.setProperties(new ToscaFactoryImpl().createPropertiesType());
			}
			
			entity.getProperties().getAny().add(feature, pack.getEFactoryInstance().create(propertiesClazz));
		}
		
		
		syncWithModel(definitions);
	}
	
	public void syncWithModel(TDefinitions definitions) {
		//Hack to force synchronisation with the model
		String name = definitions.getName();
		definitions.setName("");
		definitions.setName(name);
	}
	
}
