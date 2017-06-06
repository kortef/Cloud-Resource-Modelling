/**
 */
package de.ugoe.cs.oco.tosca.types;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Scaling Properties Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.ugoe.cs.oco.tosca.types.ScalingPropertiesType#getInstances <em>Instances</em>}</li>
 * </ul>
 *
 * @see de.ugoe.cs.oco.tosca.types.TypesPackage#getScalingPropertiesType()
 * @model extendedMetaData="name='ScalingPropertiesType' kind='elementOnly'"
 * @generated
 */
public interface ScalingPropertiesType extends EObject {
	/**
	 * Returns the value of the '<em><b>Instances</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Instances</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Instances</em>' attribute.
	 * @see #setInstances(String)
	 * @see de.ugoe.cs.oco.tosca.types.TypesPackage#getScalingPropertiesType_Instances()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='element' name='instances' namespace='##targetNamespace'"
	 * @generated
	 */
	String getInstances();

	/**
	 * Sets the value of the '{@link de.ugoe.cs.oco.tosca.types.ScalingPropertiesType#getInstances <em>Instances</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Instances</em>' attribute.
	 * @see #getInstances()
	 * @generated
	 */
	void setInstances(String value);

} // ScalingPropertiesType
