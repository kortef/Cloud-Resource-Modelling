/**
 */
package de.ugoe.cs.oco.tosca.types;

import de.ugoe.cs.oco.tosca.PropertiesType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Open Stack Volume Properties Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.ugoe.cs.oco.tosca.types.OpenStackVolumePropertiesType#getSize <em>Size</em>}</li>
 * </ul>
 *
 * @see de.ugoe.cs.oco.tosca.types.TypesPackage#getOpenStackVolumePropertiesType()
 * @model extendedMetaData="name='OpenStackVolumePropertiesType' kind='elementOnly'"
 * @generated
 */
public interface OpenStackVolumePropertiesType extends PropertiesType {
	/**
	 * Returns the value of the '<em><b>Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Size</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Size</em>' attribute.
	 * @see #setSize(String)
	 * @see de.ugoe.cs.oco.tosca.types.TypesPackage#getOpenStackVolumePropertiesType_Size()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='element' name='size' namespace='##targetNamespace'"
	 * @generated
	 */
	String getSize();

	/**
	 * Sets the value of the '{@link de.ugoe.cs.oco.tosca.types.OpenStackVolumePropertiesType#getSize <em>Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Size</em>' attribute.
	 * @see #getSize()
	 * @generated
	 */
	void setSize(String value);

} // OpenStackVolumePropertiesType
