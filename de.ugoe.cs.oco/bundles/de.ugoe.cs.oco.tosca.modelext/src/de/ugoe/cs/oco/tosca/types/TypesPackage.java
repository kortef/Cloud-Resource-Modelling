/**
 */
package de.ugoe.cs.oco.tosca.types;

import de.ugoe.cs.oco.tosca.ToscaPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see de.ugoe.cs.oco.tosca.types.TypesFactory
 * @model kind="package"
 * @generated
 */
public interface TypesPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "types";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://swe.simpaas.tosca.de/PropertyTypes";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "types";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	TypesPackage eINSTANCE = de.ugoe.cs.oco.tosca.types.impl.TypesPackageImpl.init();

	/**
	 * The meta object id for the '{@link de.ugoe.cs.oco.tosca.types.impl.CloudifyAgentPropertiesTypeImpl <em>Cloudify Agent Properties Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.ugoe.cs.oco.tosca.types.impl.CloudifyAgentPropertiesTypeImpl
	 * @see de.ugoe.cs.oco.tosca.types.impl.TypesPackageImpl#getCloudifyAgentPropertiesType()
	 * @generated
	 */
	int CLOUDIFY_AGENT_PROPERTIES_TYPE = 0;

	/**
	 * The feature id for the '<em><b>Any</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOUDIFY_AGENT_PROPERTIES_TYPE__ANY = ToscaPackage.PROPERTIES_TYPE__ANY;

	/**
	 * The feature id for the '<em><b>User</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOUDIFY_AGENT_PROPERTIES_TYPE__USER = ToscaPackage.PROPERTIES_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Cloudify Agent Properties Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOUDIFY_AGENT_PROPERTIES_TYPE_FEATURE_COUNT = ToscaPackage.PROPERTIES_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Cloudify Agent Properties Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOUDIFY_AGENT_PROPERTIES_TYPE_OPERATION_COUNT = ToscaPackage.PROPERTIES_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.ugoe.cs.oco.tosca.types.impl.MPIHostPropertiesTypeImpl <em>MPI Host Properties Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.ugoe.cs.oco.tosca.types.impl.MPIHostPropertiesTypeImpl
	 * @see de.ugoe.cs.oco.tosca.types.impl.TypesPackageImpl#getMPIHostPropertiesType()
	 * @generated
	 */
	int MPI_HOST_PROPERTIES_TYPE = 1;

	/**
	 * The feature id for the '<em><b>Any</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MPI_HOST_PROPERTIES_TYPE__ANY = ToscaPackage.PROPERTIES_TYPE__ANY;

	/**
	 * The feature id for the '<em><b>Cloudify Agent</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MPI_HOST_PROPERTIES_TYPE__CLOUDIFY_AGENT = ToscaPackage.PROPERTIES_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Server</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MPI_HOST_PROPERTIES_TYPE__SERVER = ToscaPackage.PROPERTIES_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>MPI Host Properties Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MPI_HOST_PROPERTIES_TYPE_FEATURE_COUNT = ToscaPackage.PROPERTIES_TYPE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>MPI Host Properties Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MPI_HOST_PROPERTIES_TYPE_OPERATION_COUNT = ToscaPackage.PROPERTIES_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.ugoe.cs.oco.tosca.types.impl.OpenStackServerPropertiesTypeImpl <em>Open Stack Server Properties Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.ugoe.cs.oco.tosca.types.impl.OpenStackServerPropertiesTypeImpl
	 * @see de.ugoe.cs.oco.tosca.types.impl.TypesPackageImpl#getOpenStackServerPropertiesType()
	 * @generated
	 */
	int OPEN_STACK_SERVER_PROPERTIES_TYPE = 2;

	/**
	 * The feature id for the '<em><b>Any</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPEN_STACK_SERVER_PROPERTIES_TYPE__ANY = ToscaPackage.PROPERTIES_TYPE__ANY;

	/**
	 * The feature id for the '<em><b>Image</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPEN_STACK_SERVER_PROPERTIES_TYPE__IMAGE = ToscaPackage.PROPERTIES_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Flavor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPEN_STACK_SERVER_PROPERTIES_TYPE__FLAVOR = ToscaPackage.PROPERTIES_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPEN_STACK_SERVER_PROPERTIES_TYPE__NAME = ToscaPackage.PROPERTIES_TYPE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Open Stack Server Properties Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPEN_STACK_SERVER_PROPERTIES_TYPE_FEATURE_COUNT = ToscaPackage.PROPERTIES_TYPE_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Open Stack Server Properties Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPEN_STACK_SERVER_PROPERTIES_TYPE_OPERATION_COUNT = ToscaPackage.PROPERTIES_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.ugoe.cs.oco.tosca.types.impl.OpenStackVolumePropertiesTypeImpl <em>Open Stack Volume Properties Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.ugoe.cs.oco.tosca.types.impl.OpenStackVolumePropertiesTypeImpl
	 * @see de.ugoe.cs.oco.tosca.types.impl.TypesPackageImpl#getOpenStackVolumePropertiesType()
	 * @generated
	 */
	int OPEN_STACK_VOLUME_PROPERTIES_TYPE = 3;

	/**
	 * The feature id for the '<em><b>Any</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPEN_STACK_VOLUME_PROPERTIES_TYPE__ANY = ToscaPackage.PROPERTIES_TYPE__ANY;

	/**
	 * The feature id for the '<em><b>Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPEN_STACK_VOLUME_PROPERTIES_TYPE__SIZE = ToscaPackage.PROPERTIES_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Open Stack Volume Properties Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPEN_STACK_VOLUME_PROPERTIES_TYPE_FEATURE_COUNT = ToscaPackage.PROPERTIES_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Open Stack Volume Properties Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPEN_STACK_VOLUME_PROPERTIES_TYPE_OPERATION_COUNT = ToscaPackage.PROPERTIES_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.ugoe.cs.oco.tosca.types.impl.ScalingGroupPropertiesTypeImpl <em>Scaling Group Properties Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.ugoe.cs.oco.tosca.types.impl.ScalingGroupPropertiesTypeImpl
	 * @see de.ugoe.cs.oco.tosca.types.impl.TypesPackageImpl#getScalingGroupPropertiesType()
	 * @generated
	 */
	int SCALING_GROUP_PROPERTIES_TYPE = 4;

	/**
	 * The feature id for the '<em><b>Any</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCALING_GROUP_PROPERTIES_TYPE__ANY = ToscaPackage.PROPERTIES_TYPE__ANY;

	/**
	 * The feature id for the '<em><b>Scale</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCALING_GROUP_PROPERTIES_TYPE__SCALE = ToscaPackage.PROPERTIES_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Scaling Group Properties Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCALING_GROUP_PROPERTIES_TYPE_FEATURE_COUNT = ToscaPackage.PROPERTIES_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Scaling Group Properties Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCALING_GROUP_PROPERTIES_TYPE_OPERATION_COUNT = ToscaPackage.PROPERTIES_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.ugoe.cs.oco.tosca.types.impl.ScalingPropertiesTypeImpl <em>Scaling Properties Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.ugoe.cs.oco.tosca.types.impl.ScalingPropertiesTypeImpl
	 * @see de.ugoe.cs.oco.tosca.types.impl.TypesPackageImpl#getScalingPropertiesType()
	 * @generated
	 */
	int SCALING_PROPERTIES_TYPE = 5;

	/**
	 * The feature id for the '<em><b>Any</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCALING_PROPERTIES_TYPE__ANY = ToscaPackage.PROPERTIES_TYPE__ANY;

	/**
	 * The feature id for the '<em><b>Instances</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCALING_PROPERTIES_TYPE__INSTANCES = ToscaPackage.PROPERTIES_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Scaling Properties Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCALING_PROPERTIES_TYPE_FEATURE_COUNT = ToscaPackage.PROPERTIES_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Scaling Properties Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCALING_PROPERTIES_TYPE_OPERATION_COUNT = ToscaPackage.PROPERTIES_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.ugoe.cs.oco.tosca.types.impl.VolumeHostPropertiesTypeImpl <em>Volume Host Properties Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.ugoe.cs.oco.tosca.types.impl.VolumeHostPropertiesTypeImpl
	 * @see de.ugoe.cs.oco.tosca.types.impl.TypesPackageImpl#getVolumeHostPropertiesType()
	 * @generated
	 */
	int VOLUME_HOST_PROPERTIES_TYPE = 6;

	/**
	 * The feature id for the '<em><b>Any</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOLUME_HOST_PROPERTIES_TYPE__ANY = ToscaPackage.PROPERTIES_TYPE__ANY;

	/**
	 * The feature id for the '<em><b>Volume</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOLUME_HOST_PROPERTIES_TYPE__VOLUME = ToscaPackage.PROPERTIES_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Volume Host Properties Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOLUME_HOST_PROPERTIES_TYPE_FEATURE_COUNT = ToscaPackage.PROPERTIES_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Volume Host Properties Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOLUME_HOST_PROPERTIES_TYPE_OPERATION_COUNT = ToscaPackage.PROPERTIES_TYPE_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link de.ugoe.cs.oco.tosca.types.CloudifyAgentPropertiesType <em>Cloudify Agent Properties Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cloudify Agent Properties Type</em>'.
	 * @see de.ugoe.cs.oco.tosca.types.CloudifyAgentPropertiesType
	 * @generated
	 */
	EClass getCloudifyAgentPropertiesType();

	/**
	 * Returns the meta object for the attribute '{@link de.ugoe.cs.oco.tosca.types.CloudifyAgentPropertiesType#getUser <em>User</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>User</em>'.
	 * @see de.ugoe.cs.oco.tosca.types.CloudifyAgentPropertiesType#getUser()
	 * @see #getCloudifyAgentPropertiesType()
	 * @generated
	 */
	EAttribute getCloudifyAgentPropertiesType_User();

	/**
	 * Returns the meta object for class '{@link de.ugoe.cs.oco.tosca.types.MPIHostPropertiesType <em>MPI Host Properties Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>MPI Host Properties Type</em>'.
	 * @see de.ugoe.cs.oco.tosca.types.MPIHostPropertiesType
	 * @generated
	 */
	EClass getMPIHostPropertiesType();

	/**
	 * Returns the meta object for the containment reference '{@link de.ugoe.cs.oco.tosca.types.MPIHostPropertiesType#getCloudifyAgent <em>Cloudify Agent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Cloudify Agent</em>'.
	 * @see de.ugoe.cs.oco.tosca.types.MPIHostPropertiesType#getCloudifyAgent()
	 * @see #getMPIHostPropertiesType()
	 * @generated
	 */
	EReference getMPIHostPropertiesType_CloudifyAgent();

	/**
	 * Returns the meta object for the containment reference '{@link de.ugoe.cs.oco.tosca.types.MPIHostPropertiesType#getServer <em>Server</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Server</em>'.
	 * @see de.ugoe.cs.oco.tosca.types.MPIHostPropertiesType#getServer()
	 * @see #getMPIHostPropertiesType()
	 * @generated
	 */
	EReference getMPIHostPropertiesType_Server();

	/**
	 * Returns the meta object for class '{@link de.ugoe.cs.oco.tosca.types.OpenStackServerPropertiesType <em>Open Stack Server Properties Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Open Stack Server Properties Type</em>'.
	 * @see de.ugoe.cs.oco.tosca.types.OpenStackServerPropertiesType
	 * @generated
	 */
	EClass getOpenStackServerPropertiesType();

	/**
	 * Returns the meta object for the attribute '{@link de.ugoe.cs.oco.tosca.types.OpenStackServerPropertiesType#getImage <em>Image</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Image</em>'.
	 * @see de.ugoe.cs.oco.tosca.types.OpenStackServerPropertiesType#getImage()
	 * @see #getOpenStackServerPropertiesType()
	 * @generated
	 */
	EAttribute getOpenStackServerPropertiesType_Image();

	/**
	 * Returns the meta object for the attribute '{@link de.ugoe.cs.oco.tosca.types.OpenStackServerPropertiesType#getFlavor <em>Flavor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Flavor</em>'.
	 * @see de.ugoe.cs.oco.tosca.types.OpenStackServerPropertiesType#getFlavor()
	 * @see #getOpenStackServerPropertiesType()
	 * @generated
	 */
	EAttribute getOpenStackServerPropertiesType_Flavor();

	/**
	 * Returns the meta object for the attribute '{@link de.ugoe.cs.oco.tosca.types.OpenStackServerPropertiesType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see de.ugoe.cs.oco.tosca.types.OpenStackServerPropertiesType#getName()
	 * @see #getOpenStackServerPropertiesType()
	 * @generated
	 */
	EAttribute getOpenStackServerPropertiesType_Name();

	/**
	 * Returns the meta object for class '{@link de.ugoe.cs.oco.tosca.types.OpenStackVolumePropertiesType <em>Open Stack Volume Properties Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Open Stack Volume Properties Type</em>'.
	 * @see de.ugoe.cs.oco.tosca.types.OpenStackVolumePropertiesType
	 * @generated
	 */
	EClass getOpenStackVolumePropertiesType();

	/**
	 * Returns the meta object for the attribute '{@link de.ugoe.cs.oco.tosca.types.OpenStackVolumePropertiesType#getSize <em>Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Size</em>'.
	 * @see de.ugoe.cs.oco.tosca.types.OpenStackVolumePropertiesType#getSize()
	 * @see #getOpenStackVolumePropertiesType()
	 * @generated
	 */
	EAttribute getOpenStackVolumePropertiesType_Size();

	/**
	 * Returns the meta object for class '{@link de.ugoe.cs.oco.tosca.types.ScalingGroupPropertiesType <em>Scaling Group Properties Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Scaling Group Properties Type</em>'.
	 * @see de.ugoe.cs.oco.tosca.types.ScalingGroupPropertiesType
	 * @generated
	 */
	EClass getScalingGroupPropertiesType();

	/**
	 * Returns the meta object for the containment reference '{@link de.ugoe.cs.oco.tosca.types.ScalingGroupPropertiesType#getScale <em>Scale</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Scale</em>'.
	 * @see de.ugoe.cs.oco.tosca.types.ScalingGroupPropertiesType#getScale()
	 * @see #getScalingGroupPropertiesType()
	 * @generated
	 */
	EReference getScalingGroupPropertiesType_Scale();

	/**
	 * Returns the meta object for class '{@link de.ugoe.cs.oco.tosca.types.ScalingPropertiesType <em>Scaling Properties Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Scaling Properties Type</em>'.
	 * @see de.ugoe.cs.oco.tosca.types.ScalingPropertiesType
	 * @generated
	 */
	EClass getScalingPropertiesType();

	/**
	 * Returns the meta object for the attribute '{@link de.ugoe.cs.oco.tosca.types.ScalingPropertiesType#getInstances <em>Instances</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Instances</em>'.
	 * @see de.ugoe.cs.oco.tosca.types.ScalingPropertiesType#getInstances()
	 * @see #getScalingPropertiesType()
	 * @generated
	 */
	EAttribute getScalingPropertiesType_Instances();

	/**
	 * Returns the meta object for class '{@link de.ugoe.cs.oco.tosca.types.VolumeHostPropertiesType <em>Volume Host Properties Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Volume Host Properties Type</em>'.
	 * @see de.ugoe.cs.oco.tosca.types.VolumeHostPropertiesType
	 * @generated
	 */
	EClass getVolumeHostPropertiesType();

	/**
	 * Returns the meta object for the containment reference '{@link de.ugoe.cs.oco.tosca.types.VolumeHostPropertiesType#getVolume <em>Volume</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Volume</em>'.
	 * @see de.ugoe.cs.oco.tosca.types.VolumeHostPropertiesType#getVolume()
	 * @see #getVolumeHostPropertiesType()
	 * @generated
	 */
	EReference getVolumeHostPropertiesType_Volume();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	TypesFactory getTypesFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link de.ugoe.cs.oco.tosca.types.impl.CloudifyAgentPropertiesTypeImpl <em>Cloudify Agent Properties Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.ugoe.cs.oco.tosca.types.impl.CloudifyAgentPropertiesTypeImpl
		 * @see de.ugoe.cs.oco.tosca.types.impl.TypesPackageImpl#getCloudifyAgentPropertiesType()
		 * @generated
		 */
		EClass CLOUDIFY_AGENT_PROPERTIES_TYPE = eINSTANCE.getCloudifyAgentPropertiesType();

		/**
		 * The meta object literal for the '<em><b>User</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLOUDIFY_AGENT_PROPERTIES_TYPE__USER = eINSTANCE.getCloudifyAgentPropertiesType_User();

		/**
		 * The meta object literal for the '{@link de.ugoe.cs.oco.tosca.types.impl.MPIHostPropertiesTypeImpl <em>MPI Host Properties Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.ugoe.cs.oco.tosca.types.impl.MPIHostPropertiesTypeImpl
		 * @see de.ugoe.cs.oco.tosca.types.impl.TypesPackageImpl#getMPIHostPropertiesType()
		 * @generated
		 */
		EClass MPI_HOST_PROPERTIES_TYPE = eINSTANCE.getMPIHostPropertiesType();

		/**
		 * The meta object literal for the '<em><b>Cloudify Agent</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MPI_HOST_PROPERTIES_TYPE__CLOUDIFY_AGENT = eINSTANCE.getMPIHostPropertiesType_CloudifyAgent();

		/**
		 * The meta object literal for the '<em><b>Server</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MPI_HOST_PROPERTIES_TYPE__SERVER = eINSTANCE.getMPIHostPropertiesType_Server();

		/**
		 * The meta object literal for the '{@link de.ugoe.cs.oco.tosca.types.impl.OpenStackServerPropertiesTypeImpl <em>Open Stack Server Properties Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.ugoe.cs.oco.tosca.types.impl.OpenStackServerPropertiesTypeImpl
		 * @see de.ugoe.cs.oco.tosca.types.impl.TypesPackageImpl#getOpenStackServerPropertiesType()
		 * @generated
		 */
		EClass OPEN_STACK_SERVER_PROPERTIES_TYPE = eINSTANCE.getOpenStackServerPropertiesType();

		/**
		 * The meta object literal for the '<em><b>Image</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPEN_STACK_SERVER_PROPERTIES_TYPE__IMAGE = eINSTANCE.getOpenStackServerPropertiesType_Image();

		/**
		 * The meta object literal for the '<em><b>Flavor</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPEN_STACK_SERVER_PROPERTIES_TYPE__FLAVOR = eINSTANCE.getOpenStackServerPropertiesType_Flavor();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPEN_STACK_SERVER_PROPERTIES_TYPE__NAME = eINSTANCE.getOpenStackServerPropertiesType_Name();

		/**
		 * The meta object literal for the '{@link de.ugoe.cs.oco.tosca.types.impl.OpenStackVolumePropertiesTypeImpl <em>Open Stack Volume Properties Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.ugoe.cs.oco.tosca.types.impl.OpenStackVolumePropertiesTypeImpl
		 * @see de.ugoe.cs.oco.tosca.types.impl.TypesPackageImpl#getOpenStackVolumePropertiesType()
		 * @generated
		 */
		EClass OPEN_STACK_VOLUME_PROPERTIES_TYPE = eINSTANCE.getOpenStackVolumePropertiesType();

		/**
		 * The meta object literal for the '<em><b>Size</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPEN_STACK_VOLUME_PROPERTIES_TYPE__SIZE = eINSTANCE.getOpenStackVolumePropertiesType_Size();

		/**
		 * The meta object literal for the '{@link de.ugoe.cs.oco.tosca.types.impl.ScalingGroupPropertiesTypeImpl <em>Scaling Group Properties Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.ugoe.cs.oco.tosca.types.impl.ScalingGroupPropertiesTypeImpl
		 * @see de.ugoe.cs.oco.tosca.types.impl.TypesPackageImpl#getScalingGroupPropertiesType()
		 * @generated
		 */
		EClass SCALING_GROUP_PROPERTIES_TYPE = eINSTANCE.getScalingGroupPropertiesType();

		/**
		 * The meta object literal for the '<em><b>Scale</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCALING_GROUP_PROPERTIES_TYPE__SCALE = eINSTANCE.getScalingGroupPropertiesType_Scale();

		/**
		 * The meta object literal for the '{@link de.ugoe.cs.oco.tosca.types.impl.ScalingPropertiesTypeImpl <em>Scaling Properties Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.ugoe.cs.oco.tosca.types.impl.ScalingPropertiesTypeImpl
		 * @see de.ugoe.cs.oco.tosca.types.impl.TypesPackageImpl#getScalingPropertiesType()
		 * @generated
		 */
		EClass SCALING_PROPERTIES_TYPE = eINSTANCE.getScalingPropertiesType();

		/**
		 * The meta object literal for the '<em><b>Instances</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCALING_PROPERTIES_TYPE__INSTANCES = eINSTANCE.getScalingPropertiesType_Instances();

		/**
		 * The meta object literal for the '{@link de.ugoe.cs.oco.tosca.types.impl.VolumeHostPropertiesTypeImpl <em>Volume Host Properties Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.ugoe.cs.oco.tosca.types.impl.VolumeHostPropertiesTypeImpl
		 * @see de.ugoe.cs.oco.tosca.types.impl.TypesPackageImpl#getVolumeHostPropertiesType()
		 * @generated
		 */
		EClass VOLUME_HOST_PROPERTIES_TYPE = eINSTANCE.getVolumeHostPropertiesType();

		/**
		 * The meta object literal for the '<em><b>Volume</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VOLUME_HOST_PROPERTIES_TYPE__VOLUME = eINSTANCE.getVolumeHostPropertiesType_Volume();

	}

} //TypesPackage
