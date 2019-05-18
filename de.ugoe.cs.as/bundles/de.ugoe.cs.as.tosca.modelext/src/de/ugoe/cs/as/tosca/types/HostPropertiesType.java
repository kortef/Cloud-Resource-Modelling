/**
 */
package de.ugoe.cs.as.tosca.types;

import de.ugoe.cs.as.tosca.PropertiesType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Host Properties Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.ugoe.cs.as.tosca.types.HostPropertiesType#getOpenstackConfig <em>Openstack Config</em>}</li>
 *   <li>{@link de.ugoe.cs.as.tosca.types.HostPropertiesType#getManagementNetworkName <em>Management Network Name</em>}</li>
 *   <li>{@link de.ugoe.cs.as.tosca.types.HostPropertiesType#getAgentConfig <em>Agent Config</em>}</li>
 *   <li>{@link de.ugoe.cs.as.tosca.types.HostPropertiesType#getCloudifyAgent <em>Cloudify Agent</em>}</li>
 *   <li>{@link de.ugoe.cs.as.tosca.types.HostPropertiesType#getServer <em>Server</em>}</li>
 * </ul>
 *
 * @see de.ugoe.cs.as.tosca.types.TypesPackage#getHostPropertiesType()
 * @model extendedMetaData="name='HostPropertiesType' kind='elementOnly'"
 * @generated
 */
public interface HostPropertiesType extends PropertiesType {
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
	 * @see de.ugoe.cs.as.tosca.types.TypesPackage#getHostPropertiesType_OpenstackConfig()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='element' name='openstack_config' namespace='##targetNamespace'"
	 * @generated
	 */
	String getOpenstackConfig();

	/**
	 * Sets the value of the '{@link de.ugoe.cs.as.tosca.types.HostPropertiesType#getOpenstackConfig <em>Openstack Config</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Openstack Config</em>' attribute.
	 * @see #getOpenstackConfig()
	 * @generated
	 */
	void setOpenstackConfig(String value);

	/**
	 * Returns the value of the '<em><b>Management Network Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Management Network Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Management Network Name</em>' attribute.
	 * @see #setManagementNetworkName(String)
	 * @see de.ugoe.cs.as.tosca.types.TypesPackage#getHostPropertiesType_ManagementNetworkName()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='element' name='management_network_name' namespace='##targetNamespace'"
	 * @generated
	 */
	String getManagementNetworkName();

	/**
	 * Sets the value of the '{@link de.ugoe.cs.as.tosca.types.HostPropertiesType#getManagementNetworkName <em>Management Network Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Management Network Name</em>' attribute.
	 * @see #getManagementNetworkName()
	 * @generated
	 */
	void setManagementNetworkName(String value);

	/**
	 * Returns the value of the '<em><b>Agent Config</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Agent Config</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Agent Config</em>' attribute.
	 * @see #setAgentConfig(String)
	 * @see de.ugoe.cs.as.tosca.types.TypesPackage#getHostPropertiesType_AgentConfig()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='element' name='agent_config' namespace='##targetNamespace'"
	 * @generated
	 */
	String getAgentConfig();

	/**
	 * Sets the value of the '{@link de.ugoe.cs.as.tosca.types.HostPropertiesType#getAgentConfig <em>Agent Config</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Agent Config</em>' attribute.
	 * @see #getAgentConfig()
	 * @generated
	 */
	void setAgentConfig(String value);

	/**
	 * Returns the value of the '<em><b>Cloudify Agent</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cloudify Agent</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cloudify Agent</em>' containment reference.
	 * @see #setCloudifyAgent(CloudifyAgentPropertiesType)
	 * @see de.ugoe.cs.as.tosca.types.TypesPackage#getHostPropertiesType_CloudifyAgent()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='cloudify_agent' namespace='##targetNamespace'"
	 * @generated
	 */
	CloudifyAgentPropertiesType getCloudifyAgent();

	/**
	 * Sets the value of the '{@link de.ugoe.cs.as.tosca.types.HostPropertiesType#getCloudifyAgent <em>Cloudify Agent</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cloudify Agent</em>' containment reference.
	 * @see #getCloudifyAgent()
	 * @generated
	 */
	void setCloudifyAgent(CloudifyAgentPropertiesType value);

	/**
	 * Returns the value of the '<em><b>Server</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Server</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Server</em>' containment reference.
	 * @see #setServer(OpenStackServerPropertiesType)
	 * @see de.ugoe.cs.as.tosca.types.TypesPackage#getHostPropertiesType_Server()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='server' namespace='##targetNamespace'"
	 * @generated
	 */
	OpenStackServerPropertiesType getServer();

	/**
	 * Sets the value of the '{@link de.ugoe.cs.as.tosca.types.HostPropertiesType#getServer <em>Server</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Server</em>' containment reference.
	 * @see #getServer()
	 * @generated
	 */
	void setServer(OpenStackServerPropertiesType value);

} // HostPropertiesType
