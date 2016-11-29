/**
 */
package de.ugoe.cs.oco.tosca.types;

import de.ugoe.cs.oco.tosca.PropertiesType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>MPI Host Properties Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.ugoe.cs.oco.tosca.types.MPIHostPropertiesType#getCloudifyAgent <em>Cloudify Agent</em>}</li>
 *   <li>{@link de.ugoe.cs.oco.tosca.types.MPIHostPropertiesType#getServer <em>Server</em>}</li>
 * </ul>
 *
 * @see de.ugoe.cs.oco.tosca.types.TypesPackage#getMPIHostPropertiesType()
 * @model extendedMetaData="name='MPIHostPropertiesType' kind='elementOnly'"
 * @generated
 */
public interface MPIHostPropertiesType extends PropertiesType {
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
	 * @see de.ugoe.cs.oco.tosca.types.TypesPackage#getMPIHostPropertiesType_CloudifyAgent()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='cloudify_agent' namespace='##targetNamespace'"
	 * @generated
	 */
	CloudifyAgentPropertiesType getCloudifyAgent();

	/**
	 * Sets the value of the '{@link de.ugoe.cs.oco.tosca.types.MPIHostPropertiesType#getCloudifyAgent <em>Cloudify Agent</em>}' containment reference.
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
	 * @see de.ugoe.cs.oco.tosca.types.TypesPackage#getMPIHostPropertiesType_Server()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='server' namespace='##targetNamespace'"
	 * @generated
	 */
	OpenStackServerPropertiesType getServer();

	/**
	 * Sets the value of the '{@link de.ugoe.cs.oco.tosca.types.MPIHostPropertiesType#getServer <em>Server</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Server</em>' containment reference.
	 * @see #getServer()
	 * @generated
	 */
	void setServer(OpenStackServerPropertiesType value);

} // MPIHostPropertiesType
