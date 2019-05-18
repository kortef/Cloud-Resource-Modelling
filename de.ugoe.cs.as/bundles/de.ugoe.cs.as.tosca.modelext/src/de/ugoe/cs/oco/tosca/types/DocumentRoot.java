/**
 */
package de.ugoe.cs.oco.tosca.types;

import org.eclipse.emf.common.util.EMap;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Document Root</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.ugoe.cs.oco.tosca.types.DocumentRoot#getMixed <em>Mixed</em>}</li>
 *   <li>{@link de.ugoe.cs.oco.tosca.types.DocumentRoot#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}</li>
 *   <li>{@link de.ugoe.cs.oco.tosca.types.DocumentRoot#getXSISchemaLocation <em>XSI Schema Location</em>}</li>
 *   <li>{@link de.ugoe.cs.oco.tosca.types.DocumentRoot#getCloudifyAgentProperties <em>Cloudify Agent Properties</em>}</li>
 *   <li>{@link de.ugoe.cs.oco.tosca.types.DocumentRoot#getFloatingIPProperties <em>Floating IP Properties</em>}</li>
 *   <li>{@link de.ugoe.cs.oco.tosca.types.DocumentRoot#getKeyPairProperties <em>Key Pair Properties</em>}</li>
 *   <li>{@link de.ugoe.cs.oco.tosca.types.DocumentRoot#getMPIHostProperties <em>MPI Host Properties</em>}</li>
 *   <li>{@link de.ugoe.cs.oco.tosca.types.DocumentRoot#getOpenStackFloatingIPProperties <em>Open Stack Floating IP Properties</em>}</li>
 *   <li>{@link de.ugoe.cs.oco.tosca.types.DocumentRoot#getOpenStackProperties <em>Open Stack Properties</em>}</li>
 *   <li>{@link de.ugoe.cs.oco.tosca.types.DocumentRoot#getOpenStackVolumeProperties <em>Open Stack Volume Properties</em>}</li>
 *   <li>{@link de.ugoe.cs.oco.tosca.types.DocumentRoot#getScalingGroupProperties <em>Scaling Group Properties</em>}</li>
 *   <li>{@link de.ugoe.cs.oco.tosca.types.DocumentRoot#getVolumeHostPropertiesType <em>Volume Host Properties Type</em>}</li>
 * </ul>
 *
 * @see de.ugoe.cs.oco.tosca.types.TypesPackage#getDocumentRoot()
 * @model extendedMetaData="name='' kind='mixed'"
 * @generated
 */
public interface DocumentRoot extends EObject {
	/**
	 * Returns the value of the '<em><b>Mixed</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mixed</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mixed</em>' attribute list.
	 * @see de.ugoe.cs.oco.tosca.types.TypesPackage#getDocumentRoot_Mixed()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='elementWildcard' name=':mixed'"
	 * @generated
	 */
	FeatureMap getMixed();

	/**
	 * Returns the value of the '<em><b>XMLNS Prefix Map</b></em>' map.
	 * The key is of type {@link java.lang.String},
	 * and the value is of type {@link java.lang.String},
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>XMLNS Prefix Map</em>' map isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>XMLNS Prefix Map</em>' map.
	 * @see de.ugoe.cs.oco.tosca.types.TypesPackage#getDocumentRoot_XMLNSPrefixMap()
	 * @model mapType="org.eclipse.emf.ecore.EStringToStringMapEntry<org.eclipse.emf.ecore.EString, org.eclipse.emf.ecore.EString>" transient="true"
	 *        extendedMetaData="kind='attribute' name='xmlns:prefix'"
	 * @generated
	 */
	EMap<String, String> getXMLNSPrefixMap();

	/**
	 * Returns the value of the '<em><b>XSI Schema Location</b></em>' map.
	 * The key is of type {@link java.lang.String},
	 * and the value is of type {@link java.lang.String},
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>XSI Schema Location</em>' map isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>XSI Schema Location</em>' map.
	 * @see de.ugoe.cs.oco.tosca.types.TypesPackage#getDocumentRoot_XSISchemaLocation()
	 * @model mapType="org.eclipse.emf.ecore.EStringToStringMapEntry<org.eclipse.emf.ecore.EString, org.eclipse.emf.ecore.EString>" transient="true"
	 *        extendedMetaData="kind='attribute' name='xsi:schemaLocation'"
	 * @generated
	 */
	EMap<String, String> getXSISchemaLocation();

	/**
	 * Returns the value of the '<em><b>Cloudify Agent Properties</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cloudify Agent Properties</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cloudify Agent Properties</em>' containment reference.
	 * @see #setCloudifyAgentProperties(CloudifyAgentPropertiesType)
	 * @see de.ugoe.cs.oco.tosca.types.TypesPackage#getDocumentRoot_CloudifyAgentProperties()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='CloudifyAgentProperties' namespace='##targetNamespace'"
	 * @generated
	 */
	CloudifyAgentPropertiesType getCloudifyAgentProperties();

	/**
	 * Sets the value of the '{@link de.ugoe.cs.oco.tosca.types.DocumentRoot#getCloudifyAgentProperties <em>Cloudify Agent Properties</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cloudify Agent Properties</em>' containment reference.
	 * @see #getCloudifyAgentProperties()
	 * @generated
	 */
	void setCloudifyAgentProperties(CloudifyAgentPropertiesType value);

	/**
	 * Returns the value of the '<em><b>Floating IP Properties</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Floating IP Properties</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Floating IP Properties</em>' containment reference.
	 * @see #setFloatingIPProperties(FloatingIPPropertiesType)
	 * @see de.ugoe.cs.oco.tosca.types.TypesPackage#getDocumentRoot_FloatingIPProperties()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='FloatingIPProperties' namespace='##targetNamespace'"
	 * @generated
	 */
	FloatingIPPropertiesType getFloatingIPProperties();

	/**
	 * Sets the value of the '{@link de.ugoe.cs.oco.tosca.types.DocumentRoot#getFloatingIPProperties <em>Floating IP Properties</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Floating IP Properties</em>' containment reference.
	 * @see #getFloatingIPProperties()
	 * @generated
	 */
	void setFloatingIPProperties(FloatingIPPropertiesType value);

	/**
	 * Returns the value of the '<em><b>Key Pair Properties</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Key Pair Properties</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Key Pair Properties</em>' containment reference.
	 * @see #setKeyPairProperties(KeyPairPropertiesType)
	 * @see de.ugoe.cs.oco.tosca.types.TypesPackage#getDocumentRoot_KeyPairProperties()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='KeyPairProperties' namespace='##targetNamespace'"
	 * @generated
	 */
	KeyPairPropertiesType getKeyPairProperties();

	/**
	 * Sets the value of the '{@link de.ugoe.cs.oco.tosca.types.DocumentRoot#getKeyPairProperties <em>Key Pair Properties</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Key Pair Properties</em>' containment reference.
	 * @see #getKeyPairProperties()
	 * @generated
	 */
	void setKeyPairProperties(KeyPairPropertiesType value);

	/**
	 * Returns the value of the '<em><b>MPI Host Properties</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>MPI Host Properties</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>MPI Host Properties</em>' containment reference.
	 * @see #setMPIHostProperties(HostPropertiesType)
	 * @see de.ugoe.cs.oco.tosca.types.TypesPackage#getDocumentRoot_MPIHostProperties()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='MPIHostProperties' namespace='##targetNamespace'"
	 * @generated
	 */
	HostPropertiesType getMPIHostProperties();

	/**
	 * Sets the value of the '{@link de.ugoe.cs.oco.tosca.types.DocumentRoot#getMPIHostProperties <em>MPI Host Properties</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>MPI Host Properties</em>' containment reference.
	 * @see #getMPIHostProperties()
	 * @generated
	 */
	void setMPIHostProperties(HostPropertiesType value);

	/**
	 * Returns the value of the '<em><b>Open Stack Floating IP Properties</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Open Stack Floating IP Properties</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Open Stack Floating IP Properties</em>' containment reference.
	 * @see #setOpenStackFloatingIPProperties(OpenStackFloatingIPPropertiesType)
	 * @see de.ugoe.cs.oco.tosca.types.TypesPackage#getDocumentRoot_OpenStackFloatingIPProperties()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='OpenStackFloatingIPProperties' namespace='##targetNamespace'"
	 * @generated
	 */
	OpenStackFloatingIPPropertiesType getOpenStackFloatingIPProperties();

	/**
	 * Sets the value of the '{@link de.ugoe.cs.oco.tosca.types.DocumentRoot#getOpenStackFloatingIPProperties <em>Open Stack Floating IP Properties</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Open Stack Floating IP Properties</em>' containment reference.
	 * @see #getOpenStackFloatingIPProperties()
	 * @generated
	 */
	void setOpenStackFloatingIPProperties(OpenStackFloatingIPPropertiesType value);

	/**
	 * Returns the value of the '<em><b>Open Stack Properties</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Open Stack Properties</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Open Stack Properties</em>' containment reference.
	 * @see #setOpenStackProperties(OpenStackServerPropertiesType)
	 * @see de.ugoe.cs.oco.tosca.types.TypesPackage#getDocumentRoot_OpenStackProperties()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='OpenStackProperties' namespace='##targetNamespace'"
	 * @generated
	 */
	OpenStackServerPropertiesType getOpenStackProperties();

	/**
	 * Sets the value of the '{@link de.ugoe.cs.oco.tosca.types.DocumentRoot#getOpenStackProperties <em>Open Stack Properties</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Open Stack Properties</em>' containment reference.
	 * @see #getOpenStackProperties()
	 * @generated
	 */
	void setOpenStackProperties(OpenStackServerPropertiesType value);

	/**
	 * Returns the value of the '<em><b>Open Stack Volume Properties</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Open Stack Volume Properties</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Open Stack Volume Properties</em>' containment reference.
	 * @see #setOpenStackVolumeProperties(OpenStackVolumePropertiesType)
	 * @see de.ugoe.cs.oco.tosca.types.TypesPackage#getDocumentRoot_OpenStackVolumeProperties()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='OpenStackVolumeProperties' namespace='##targetNamespace'"
	 * @generated
	 */
	OpenStackVolumePropertiesType getOpenStackVolumeProperties();

	/**
	 * Sets the value of the '{@link de.ugoe.cs.oco.tosca.types.DocumentRoot#getOpenStackVolumeProperties <em>Open Stack Volume Properties</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Open Stack Volume Properties</em>' containment reference.
	 * @see #getOpenStackVolumeProperties()
	 * @generated
	 */
	void setOpenStackVolumeProperties(OpenStackVolumePropertiesType value);

	/**
	 * Returns the value of the '<em><b>Scaling Group Properties</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Scaling Group Properties</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Scaling Group Properties</em>' containment reference.
	 * @see #setScalingGroupProperties(ScalingGroupPropertiesType)
	 * @see de.ugoe.cs.oco.tosca.types.TypesPackage#getDocumentRoot_ScalingGroupProperties()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ScalingGroupProperties' namespace='##targetNamespace'"
	 * @generated
	 */
	ScalingGroupPropertiesType getScalingGroupProperties();

	/**
	 * Sets the value of the '{@link de.ugoe.cs.oco.tosca.types.DocumentRoot#getScalingGroupProperties <em>Scaling Group Properties</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Scaling Group Properties</em>' containment reference.
	 * @see #getScalingGroupProperties()
	 * @generated
	 */
	void setScalingGroupProperties(ScalingGroupPropertiesType value);

	/**
	 * Returns the value of the '<em><b>Volume Host Properties Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Volume Host Properties Type</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Volume Host Properties Type</em>' containment reference.
	 * @see #setVolumeHostPropertiesType(VolumeHostPropertiesType)
	 * @see de.ugoe.cs.oco.tosca.types.TypesPackage#getDocumentRoot_VolumeHostPropertiesType()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='VolumeHostPropertiesType' namespace='##targetNamespace'"
	 * @generated
	 */
	VolumeHostPropertiesType getVolumeHostPropertiesType();

	/**
	 * Sets the value of the '{@link de.ugoe.cs.oco.tosca.types.DocumentRoot#getVolumeHostPropertiesType <em>Volume Host Properties Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Volume Host Properties Type</em>' containment reference.
	 * @see #getVolumeHostPropertiesType()
	 * @generated
	 */
	void setVolumeHostPropertiesType(VolumeHostPropertiesType value);

} // DocumentRoot
