/**
 * 
 */
package de.ugoe.cs.oco.tosca.yamlparser;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.impl.EAttributeImpl;
import org.eclipse.emf.ecore.util.BasicExtendedMetaData;
import org.eclipse.emf.ecore.util.ExtendedMetaData;
import org.eclipse.emf.ecore.util.FeatureMap;

import de.ugoe.cs.oco.tosca.PropertiesType;
import de.ugoe.cs.oco.tosca.ToscaFactory;
import de.ugoe.cs.oco.tosca.types.TypesFactory;
import de.ugoe.cs.oco.tosca.types.TypesPackage;
import de.ugoe.cs.oco.utils.StringFormater;


/**
 * @author fglaser
 *
 */
public class PropertyAssignmentParser extends Parser{
	private static Map<String, String> propertyClasses = new HashMap<String, String>();
	static{
		propertyClasses.put("swe.simpaas.nodes.mpihost", "createHostPropertiesType");
		propertyClasses.put("cloudify.openstack.nodes.Volume", "createVolumeHostPropertiesType");
		propertyClasses.put("swe.simpaas.groups.ScalingGroup", "createScalingGroupPropertiesType");
		propertyClasses.put("mongoscale.host", "createHostPropertiesType");
		propertyClasses.put("cloudify.openstack.nodes.FloatingIP", "createOpenStackFloatingIPPropertiesType");
		propertyClasses.put("cloudify.openstack.nodes.KeyPair", "createKeyPairPropertiesType");
	}
	
	/* (non-Javadoc)
	 * @see de.ugoe.swe.simpaas.tosca.parser.Parser#parse(java.util.Map, org.eclipse.emf.ecore.EObject)
	 */
	@SuppressWarnings("unchecked")
	@Override
	public Object parse(Map<String, ?> input) throws ParseException {
		ToscaFactory factory = ToscaFactory.eINSTANCE;
		TypesFactory typesFactory = TypesFactory.eINSTANCE;
		Entry<String, ?> propertyEntry = input.entrySet().iterator().next();
		String propertyIdentifier = propertyEntry.getKey();
		LOGGER.info("Now parsing Properties for type " + propertyIdentifier);
		String methodName = propertyClasses.get(propertyIdentifier);
		Method method;
		PropertiesType propertiesType = ToscaFactory.eINSTANCE.createPropertiesType();
		EObject propertyObject = null;
		try {
			method = TypesFactory.eINSTANCE.getClass().getMethod(methodName);
			propertyObject = (EObject) method.invoke(TypesFactory.eINSTANCE);
		} catch (NoSuchMethodException | SecurityException | IllegalAccessException | IllegalArgumentException | InvocationTargetException e) {
			e.printStackTrace();
			throw new ParseException("Error while creating Property object dynamically");
		}
		
		ExtendedMetaData extendedMetaData = new BasicExtendedMetaData();
		String namespace = extendedMetaData.getNamespace(TypesPackage.eINSTANCE);
		
		for (Entry<String, ?> entry: ((Map<String, ?>) propertyEntry.getValue()).entrySet()){
			String propertyString = StringFormater.toCamelCase(entry.getKey());
			Object propertyValue = entry.getValue();
			LOGGER.info("Creating properties of category " + entry.getKey() + " using " + propertyString);
			System.out.println(propertyValue.getClass());
			EStructuralFeature feature = propertyObject.eClass().
					getEStructuralFeature(propertyString);
			if (feature instanceof EReference){
				EReference reference = (EReference) feature;
				EObject c = TypesFactory.eINSTANCE.create(reference.getEReferenceType());
				propertyObject.eSet(feature, c);
				Map<String, ?> innermap = (Map<String, ?>) propertyValue;
				for (Entry<String, ?> innerentry: innermap.entrySet()){
					EStructuralFeature innerfeature = c.eClass().getEStructuralFeature(StringFormater.toCamelCase(innerentry.getKey()));
					LOGGER.info("Inner Entry with key" + innerentry.getKey() + " has value " + innerentry.getValue());
					Object innerValue = innerentry.getValue();
					if (innerValue instanceof String){
						c.eSet(innerfeature, innerValue);
					}
					else if (innerValue instanceof Map){
						c.eSet(innerfeature, ToscaModelUtil.buildStringFromMap((Map) innerValue));
					}
				}
			}
			else{
				EAttribute attribute = (EAttribute) feature;
				Object attributeValue = entry.getValue();
				if (attributeValue instanceof String){
					propertyObject.eSet(feature, attributeValue);
				}
				else if (attributeValue instanceof Map){
					propertyObject.eSet(feature, ToscaModelUtil.buildStringFromMap((Map) attributeValue));
				}

			}
		}
		
		EStructuralFeature props = extendedMetaData.demandFeature(
				namespace, 
				propertyObject.eClass().getName(),
				true);
		
		props.setEType(propertyObject.eClass());
		propertiesType.eClass().getEStructuralFeatures().add(props);
		FeatureMap featureMap = propertiesType.getAny();
		featureMap.add(props, propertyObject);
		return propertiesType;
		
	}

	@Override
	public Object parse(List<?> inputArray) throws ParseException {
		// TODO Auto-generated method stub
		return null;
	}

}
