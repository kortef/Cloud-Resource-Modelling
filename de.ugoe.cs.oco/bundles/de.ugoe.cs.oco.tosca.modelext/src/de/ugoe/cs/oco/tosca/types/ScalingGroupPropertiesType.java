/**
 */
package de.ugoe.cs.oco.tosca.types;

import de.ugoe.cs.oco.tosca.PropertiesType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Scaling Group Properties Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.ugoe.cs.oco.tosca.types.ScalingGroupPropertiesType#getScale <em>Scale</em>}</li>
 * </ul>
 *
 * @see de.ugoe.cs.oco.tosca.types.TypesPackage#getScalingGroupPropertiesType()
 * @model extendedMetaData="name='ScalingGroupPropertiesType' kind='elementOnly'"
 * @generated
 */
public interface ScalingGroupPropertiesType extends PropertiesType {
	/**
	 * Returns the value of the '<em><b>Scale</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Scale</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Scale</em>' containment reference.
	 * @see #setScale(ScalingPropertiesType)
	 * @see de.ugoe.cs.oco.tosca.types.TypesPackage#getScalingGroupPropertiesType_Scale()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='scale' namespace='##targetNamespace'"
	 * @generated
	 */
	ScalingPropertiesType getScale();

	/**
	 * Sets the value of the '{@link de.ugoe.cs.oco.tosca.types.ScalingGroupPropertiesType#getScale <em>Scale</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Scale</em>' containment reference.
	 * @see #getScale()
	 * @generated
	 */
	void setScale(ScalingPropertiesType value);

} // ScalingGroupPropertiesType
