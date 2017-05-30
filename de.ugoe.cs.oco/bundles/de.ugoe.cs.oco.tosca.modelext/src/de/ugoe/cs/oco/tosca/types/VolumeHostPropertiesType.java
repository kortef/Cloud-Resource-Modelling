/**
 */
package de.ugoe.cs.oco.tosca.types;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Volume Host Properties Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.ugoe.cs.oco.tosca.types.VolumeHostPropertiesType#getVolume <em>Volume</em>}</li>
 * </ul>
 *
 * @see de.ugoe.cs.oco.tosca.types.TypesPackage#getVolumeHostPropertiesType()
 * @model extendedMetaData="name='VolumeHostPropertiesType' kind='elementOnly'"
 * @generated
 */
public interface VolumeHostPropertiesType extends EObject {
	/**
	 * Returns the value of the '<em><b>Volume</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Volume</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Volume</em>' containment reference.
	 * @see #setVolume(OpenStackVolumePropertiesType)
	 * @see de.ugoe.cs.oco.tosca.types.TypesPackage#getVolumeHostPropertiesType_Volume()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='volume' namespace='##targetNamespace'"
	 * @generated
	 */
	OpenStackVolumePropertiesType getVolume();

	/**
	 * Sets the value of the '{@link de.ugoe.cs.oco.tosca.types.VolumeHostPropertiesType#getVolume <em>Volume</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Volume</em>' containment reference.
	 * @see #getVolume()
	 * @generated
	 */
	void setVolume(OpenStackVolumePropertiesType value);

} // VolumeHostPropertiesType
