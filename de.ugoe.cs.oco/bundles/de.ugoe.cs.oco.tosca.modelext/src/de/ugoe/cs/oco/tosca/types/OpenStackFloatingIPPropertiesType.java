/**
 */
package de.ugoe.cs.oco.tosca.types;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Open Stack Floating IP Properties Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.ugoe.cs.oco.tosca.types.OpenStackFloatingIPPropertiesType#getOpenstackConfig <em>Openstack Config</em>}</li>
 *   <li>{@link de.ugoe.cs.oco.tosca.types.OpenStackFloatingIPPropertiesType#getFloatingip <em>Floatingip</em>}</li>
 * </ul>
 *
 * @see de.ugoe.cs.oco.tosca.types.TypesPackage#getOpenStackFloatingIPPropertiesType()
 * @model extendedMetaData="name='OpenStackFloatingIPPropertiesType' kind='elementOnly'"
 * @generated
 */
public interface OpenStackFloatingIPPropertiesType extends EObject {
	/**
	 * Returns the value of the '<em><b>Openstack Config</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Openstack Config</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Openstack Config</em>' attribute.
	 * @see #setOpenstackConfig(String)
	 * @see de.ugoe.cs.oco.tosca.types.TypesPackage#getOpenStackFloatingIPPropertiesType_OpenstackConfig()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='element' name='openstack_config' namespace='##targetNamespace'"
	 * @generated
	 */
	String getOpenstackConfig();

	/**
	 * Sets the value of the '{@link de.ugoe.cs.oco.tosca.types.OpenStackFloatingIPPropertiesType#getOpenstackConfig <em>Openstack Config</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Openstack Config</em>' attribute.
	 * @see #getOpenstackConfig()
	 * @generated
	 */
	void setOpenstackConfig(String value);

	/**
	 * Returns the value of the '<em><b>Floatingip</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Floatingip</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Floatingip</em>' containment reference.
	 * @see #setFloatingip(FloatingIPPropertiesType)
	 * @see de.ugoe.cs.oco.tosca.types.TypesPackage#getOpenStackFloatingIPPropertiesType_Floatingip()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='floatingip' namespace='##targetNamespace'"
	 * @generated
	 */
	FloatingIPPropertiesType getFloatingip();

	/**
	 * Sets the value of the '{@link de.ugoe.cs.oco.tosca.types.OpenStackFloatingIPPropertiesType#getFloatingip <em>Floatingip</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Floatingip</em>' containment reference.
	 * @see #getFloatingip()
	 * @generated
	 */
	void setFloatingip(FloatingIPPropertiesType value);

} // OpenStackFloatingIPPropertiesType
