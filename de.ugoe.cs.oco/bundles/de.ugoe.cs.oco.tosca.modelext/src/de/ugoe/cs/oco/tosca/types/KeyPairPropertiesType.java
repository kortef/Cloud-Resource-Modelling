/**
 */
package de.ugoe.cs.oco.tosca.types;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Key Pair Properties Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.ugoe.cs.oco.tosca.types.KeyPairPropertiesType#getOpenstackConfig <em>Openstack Config</em>}</li>
 *   <li>{@link de.ugoe.cs.oco.tosca.types.KeyPairPropertiesType#getUseExternalResource <em>Use External Resource</em>}</li>
 *   <li>{@link de.ugoe.cs.oco.tosca.types.KeyPairPropertiesType#getResourceId <em>Resource Id</em>}</li>
 *   <li>{@link de.ugoe.cs.oco.tosca.types.KeyPairPropertiesType#getPrivateKeyPath <em>Private Key Path</em>}</li>
 * </ul>
 *
 * @see de.ugoe.cs.oco.tosca.types.TypesPackage#getKeyPairPropertiesType()
 * @model extendedMetaData="name='KeyPairPropertiesType' kind='elementOnly'"
 * @generated
 */
public interface KeyPairPropertiesType extends EObject {
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
	 * @see de.ugoe.cs.oco.tosca.types.TypesPackage#getKeyPairPropertiesType_OpenstackConfig()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='element' name='openstack_config' namespace='##targetNamespace'"
	 * @generated
	 */
	String getOpenstackConfig();

	/**
	 * Sets the value of the '{@link de.ugoe.cs.oco.tosca.types.KeyPairPropertiesType#getOpenstackConfig <em>Openstack Config</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Openstack Config</em>' attribute.
	 * @see #getOpenstackConfig()
	 * @generated
	 */
	void setOpenstackConfig(String value);

	/**
	 * Returns the value of the '<em><b>Use External Resource</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Use External Resource</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Use External Resource</em>' attribute.
	 * @see #setUseExternalResource(String)
	 * @see de.ugoe.cs.oco.tosca.types.TypesPackage#getKeyPairPropertiesType_UseExternalResource()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='element' name='use_external_resource' namespace='##targetNamespace'"
	 * @generated
	 */
	String getUseExternalResource();

	/**
	 * Sets the value of the '{@link de.ugoe.cs.oco.tosca.types.KeyPairPropertiesType#getUseExternalResource <em>Use External Resource</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Use External Resource</em>' attribute.
	 * @see #getUseExternalResource()
	 * @generated
	 */
	void setUseExternalResource(String value);

	/**
	 * Returns the value of the '<em><b>Resource Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Resource Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resource Id</em>' attribute.
	 * @see #setResourceId(String)
	 * @see de.ugoe.cs.oco.tosca.types.TypesPackage#getKeyPairPropertiesType_ResourceId()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='element' name='resource_id' namespace='##targetNamespace'"
	 * @generated
	 */
	String getResourceId();

	/**
	 * Sets the value of the '{@link de.ugoe.cs.oco.tosca.types.KeyPairPropertiesType#getResourceId <em>Resource Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Resource Id</em>' attribute.
	 * @see #getResourceId()
	 * @generated
	 */
	void setResourceId(String value);

	/**
	 * Returns the value of the '<em><b>Private Key Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Private Key Path</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Private Key Path</em>' attribute.
	 * @see #setPrivateKeyPath(String)
	 * @see de.ugoe.cs.oco.tosca.types.TypesPackage#getKeyPairPropertiesType_PrivateKeyPath()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='element' name='private_key_path' namespace='##targetNamespace'"
	 * @generated
	 */
	String getPrivateKeyPath();

	/**
	 * Sets the value of the '{@link de.ugoe.cs.oco.tosca.types.KeyPairPropertiesType#getPrivateKeyPath <em>Private Key Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Private Key Path</em>' attribute.
	 * @see #getPrivateKeyPath()
	 * @generated
	 */
	void setPrivateKeyPath(String value);

} // KeyPairPropertiesType
