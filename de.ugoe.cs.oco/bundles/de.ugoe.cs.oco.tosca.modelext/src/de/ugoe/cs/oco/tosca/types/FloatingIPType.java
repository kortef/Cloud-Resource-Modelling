/**
 */
package de.ugoe.cs.oco.tosca.types;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Floating IP Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.ugoe.cs.oco.tosca.types.FloatingIPType#getFloatingNetworkName <em>Floating Network Name</em>}</li>
 * </ul>
 *
 * @see de.ugoe.cs.oco.tosca.types.TypesPackage#getFloatingIPType()
 * @model extendedMetaData="name='FloatingIPType' kind='elementOnly'"
 * @generated
 */
public interface FloatingIPType extends EObject {
	/**
	 * Returns the value of the '<em><b>Floating Network Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Floating Network Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Floating Network Name</em>' attribute.
	 * @see #setFloatingNetworkName(String)
	 * @see de.ugoe.cs.oco.tosca.types.TypesPackage#getFloatingIPType_FloatingNetworkName()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='element' name='floating_network_name' namespace='##targetNamespace'"
	 * @generated
	 */
	String getFloatingNetworkName();

	/**
	 * Sets the value of the '{@link de.ugoe.cs.oco.tosca.types.FloatingIPType#getFloatingNetworkName <em>Floating Network Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Floating Network Name</em>' attribute.
	 * @see #getFloatingNetworkName()
	 * @generated
	 */
	void setFloatingNetworkName(String value);

} // FloatingIPType
