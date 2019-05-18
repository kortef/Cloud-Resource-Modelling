/**
 */
package de.ugoe.cs.as.tosca.types;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see de.ugoe.cs.as.tosca.types.TypesPackage
 * @generated
 */
public interface TypesFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	TypesFactory eINSTANCE = de.ugoe.cs.as.tosca.types.impl.TypesFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Cloudify Agent Properties Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Cloudify Agent Properties Type</em>'.
	 * @generated
	 */
	CloudifyAgentPropertiesType createCloudifyAgentPropertiesType();

	/**
	 * Returns a new object of class '<em>Document Root</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Document Root</em>'.
	 * @generated
	 */
	DocumentRoot createDocumentRoot();

	/**
	 * Returns a new object of class '<em>Floating IP Properties Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Floating IP Properties Type</em>'.
	 * @generated
	 */
	FloatingIPPropertiesType createFloatingIPPropertiesType();

	/**
	 * Returns a new object of class '<em>Host Properties Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Host Properties Type</em>'.
	 * @generated
	 */
	HostPropertiesType createHostPropertiesType();

	/**
	 * Returns a new object of class '<em>Key Pair Properties Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Key Pair Properties Type</em>'.
	 * @generated
	 */
	KeyPairPropertiesType createKeyPairPropertiesType();

	/**
	 * Returns a new object of class '<em>Open Stack Floating IP Properties Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Open Stack Floating IP Properties Type</em>'.
	 * @generated
	 */
	OpenStackFloatingIPPropertiesType createOpenStackFloatingIPPropertiesType();

	/**
	 * Returns a new object of class '<em>Open Stack Server Properties Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Open Stack Server Properties Type</em>'.
	 * @generated
	 */
	OpenStackServerPropertiesType createOpenStackServerPropertiesType();

	/**
	 * Returns a new object of class '<em>Open Stack Volume Properties Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Open Stack Volume Properties Type</em>'.
	 * @generated
	 */
	OpenStackVolumePropertiesType createOpenStackVolumePropertiesType();

	/**
	 * Returns a new object of class '<em>Scaling Group Properties Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Scaling Group Properties Type</em>'.
	 * @generated
	 */
	ScalingGroupPropertiesType createScalingGroupPropertiesType();

	/**
	 * Returns a new object of class '<em>Scaling Properties Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Scaling Properties Type</em>'.
	 * @generated
	 */
	ScalingPropertiesType createScalingPropertiesType();

	/**
	 * Returns a new object of class '<em>Volume Host Properties Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Volume Host Properties Type</em>'.
	 * @generated
	 */
	VolumeHostPropertiesType createVolumeHostPropertiesType();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	TypesPackage getTypesPackage();

} //TypesFactory
