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
	 * The feature id for the '<em><b>User</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOUDIFY_AGENT_PROPERTIES_TYPE__USER = 0;

	/**
	 * The number of structural features of the '<em>Cloudify Agent Properties Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOUDIFY_AGENT_PROPERTIES_TYPE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Cloudify Agent Properties Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOUDIFY_AGENT_PROPERTIES_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.ugoe.cs.oco.tosca.types.impl.DocumentRootImpl <em>Document Root</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.ugoe.cs.oco.tosca.types.impl.DocumentRootImpl
	 * @see de.ugoe.cs.oco.tosca.types.impl.TypesPackageImpl#getDocumentRoot()
	 * @generated
	 */
	int DOCUMENT_ROOT = 1;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__MIXED = 0;

	/**
	 * The feature id for the '<em><b>XMLNS Prefix Map</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__XMLNS_PREFIX_MAP = 1;

	/**
	 * The feature id for the '<em><b>XSI Schema Location</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__XSI_SCHEMA_LOCATION = 2;

	/**
	 * The feature id for the '<em><b>Cloudify Agent Properties</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__CLOUDIFY_AGENT_PROPERTIES = 3;

	/**
	 * The feature id for the '<em><b>Floating IP Properties</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__FLOATING_IP_PROPERTIES = 4;

	/**
	 * The feature id for the '<em><b>Key Pair Properties</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__KEY_PAIR_PROPERTIES = 5;

	/**
	 * The feature id for the '<em><b>MPI Host Properties</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__MPI_HOST_PROPERTIES = 6;

	/**
	 * The feature id for the '<em><b>Open Stack Floating IP Properties</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__OPEN_STACK_FLOATING_IP_PROPERTIES = 7;

	/**
	 * The feature id for the '<em><b>Open Stack Properties</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__OPEN_STACK_PROPERTIES = 8;

	/**
	 * The feature id for the '<em><b>Open Stack Volume Properties</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__OPEN_STACK_VOLUME_PROPERTIES = 9;

	/**
	 * The feature id for the '<em><b>Scaling Group Properties</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__SCALING_GROUP_PROPERTIES = 10;

	/**
	 * The feature id for the '<em><b>Volume Host Properties Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__VOLUME_HOST_PROPERTIES_TYPE = 11;

	/**
	 * The number of structural features of the '<em>Document Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT_FEATURE_COUNT = 12;

	/**
	 * The number of operations of the '<em>Document Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.ugoe.cs.oco.tosca.types.impl.FloatingIPPropertiesTypeImpl <em>Floating IP Properties Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.ugoe.cs.oco.tosca.types.impl.FloatingIPPropertiesTypeImpl
	 * @see de.ugoe.cs.oco.tosca.types.impl.TypesPackageImpl#getFloatingIPPropertiesType()
	 * @generated
	 */
	int FLOATING_IP_PROPERTIES_TYPE = 2;

	/**
	 * The feature id for the '<em><b>Floating Network Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOATING_IP_PROPERTIES_TYPE__FLOATING_NETWORK_NAME = 0;

	/**
	 * The number of structural features of the '<em>Floating IP Properties Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOATING_IP_PROPERTIES_TYPE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Floating IP Properties Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOATING_IP_PROPERTIES_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.ugoe.cs.oco.tosca.types.impl.HostPropertiesTypeImpl <em>Host Properties Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.ugoe.cs.oco.tosca.types.impl.HostPropertiesTypeImpl
	 * @see de.ugoe.cs.oco.tosca.types.impl.TypesPackageImpl#getHostPropertiesType()
	 * @generated
	 */
	int HOST_PROPERTIES_TYPE = 3;

	/**
	 * The feature id for the '<em><b>Any</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOST_PROPERTIES_TYPE__ANY = ToscaPackage.PROPERTIES_TYPE__ANY;

	/**
	 * The feature id for the '<em><b>Openstack Config</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOST_PROPERTIES_TYPE__OPENSTACK_CONFIG = ToscaPackage.PROPERTIES_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Management Network Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOST_PROPERTIES_TYPE__MANAGEMENT_NETWORK_NAME = ToscaPackage.PROPERTIES_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Agent Config</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOST_PROPERTIES_TYPE__AGENT_CONFIG = ToscaPackage.PROPERTIES_TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Cloudify Agent</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOST_PROPERTIES_TYPE__CLOUDIFY_AGENT = ToscaPackage.PROPERTIES_TYPE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Server</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOST_PROPERTIES_TYPE__SERVER = ToscaPackage.PROPERTIES_TYPE_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Host Properties Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOST_PROPERTIES_TYPE_FEATURE_COUNT = ToscaPackage.PROPERTIES_TYPE_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Host Properties Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOST_PROPERTIES_TYPE_OPERATION_COUNT = ToscaPackage.PROPERTIES_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.ugoe.cs.oco.tosca.types.impl.KeyPairPropertiesTypeImpl <em>Key Pair Properties Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.ugoe.cs.oco.tosca.types.impl.KeyPairPropertiesTypeImpl
	 * @see de.ugoe.cs.oco.tosca.types.impl.TypesPackageImpl#getKeyPairPropertiesType()
	 * @generated
	 */
	int KEY_PAIR_PROPERTIES_TYPE = 4;

	/**
	 * The feature id for the '<em><b>Openstack Config</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEY_PAIR_PROPERTIES_TYPE__OPENSTACK_CONFIG = 0;

	/**
	 * The feature id for the '<em><b>Use External Resource</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEY_PAIR_PROPERTIES_TYPE__USE_EXTERNAL_RESOURCE = 1;

	/**
	 * The feature id for the '<em><b>Resource Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEY_PAIR_PROPERTIES_TYPE__RESOURCE_ID = 2;

	/**
	 * The feature id for the '<em><b>Private Key Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEY_PAIR_PROPERTIES_TYPE__PRIVATE_KEY_PATH = 3;

	/**
	 * The number of structural features of the '<em>Key Pair Properties Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEY_PAIR_PROPERTIES_TYPE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Key Pair Properties Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEY_PAIR_PROPERTIES_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.ugoe.cs.oco.tosca.types.impl.OpenStackFloatingIPPropertiesTypeImpl <em>Open Stack Floating IP Properties Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.ugoe.cs.oco.tosca.types.impl.OpenStackFloatingIPPropertiesTypeImpl
	 * @see de.ugoe.cs.oco.tosca.types.impl.TypesPackageImpl#getOpenStackFloatingIPPropertiesType()
	 * @generated
	 */
	int OPEN_STACK_FLOATING_IP_PROPERTIES_TYPE = 5;

	/**
	 * The feature id for the '<em><b>Openstack Config</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPEN_STACK_FLOATING_IP_PROPERTIES_TYPE__OPENSTACK_CONFIG = 0;

	/**
	 * The feature id for the '<em><b>Floatingip</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPEN_STACK_FLOATING_IP_PROPERTIES_TYPE__FLOATINGIP = 1;

	/**
	 * The number of structural features of the '<em>Open Stack Floating IP Properties Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPEN_STACK_FLOATING_IP_PROPERTIES_TYPE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Open Stack Floating IP Properties Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPEN_STACK_FLOATING_IP_PROPERTIES_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.ugoe.cs.oco.tosca.types.impl.OpenStackServerPropertiesTypeImpl <em>Open Stack Server Properties Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.ugoe.cs.oco.tosca.types.impl.OpenStackServerPropertiesTypeImpl
	 * @see de.ugoe.cs.oco.tosca.types.impl.TypesPackageImpl#getOpenStackServerPropertiesType()
	 * @generated
	 */
	int OPEN_STACK_SERVER_PROPERTIES_TYPE = 6;

	/**
	 * The feature id for the '<em><b>Image</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPEN_STACK_SERVER_PROPERTIES_TYPE__IMAGE = 0;

	/**
	 * The feature id for the '<em><b>Flavor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPEN_STACK_SERVER_PROPERTIES_TYPE__FLAVOR = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPEN_STACK_SERVER_PROPERTIES_TYPE__NAME = 2;

	/**
	 * The number of structural features of the '<em>Open Stack Server Properties Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPEN_STACK_SERVER_PROPERTIES_TYPE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Open Stack Server Properties Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPEN_STACK_SERVER_PROPERTIES_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.ugoe.cs.oco.tosca.types.impl.OpenStackVolumePropertiesTypeImpl <em>Open Stack Volume Properties Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.ugoe.cs.oco.tosca.types.impl.OpenStackVolumePropertiesTypeImpl
	 * @see de.ugoe.cs.oco.tosca.types.impl.TypesPackageImpl#getOpenStackVolumePropertiesType()
	 * @generated
	 */
	int OPEN_STACK_VOLUME_PROPERTIES_TYPE = 7;

	/**
	 * The feature id for the '<em><b>Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPEN_STACK_VOLUME_PROPERTIES_TYPE__SIZE = 0;

	/**
	 * The number of structural features of the '<em>Open Stack Volume Properties Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPEN_STACK_VOLUME_PROPERTIES_TYPE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Open Stack Volume Properties Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPEN_STACK_VOLUME_PROPERTIES_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.ugoe.cs.oco.tosca.types.impl.ScalingGroupPropertiesTypeImpl <em>Scaling Group Properties Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.ugoe.cs.oco.tosca.types.impl.ScalingGroupPropertiesTypeImpl
	 * @see de.ugoe.cs.oco.tosca.types.impl.TypesPackageImpl#getScalingGroupPropertiesType()
	 * @generated
	 */
	int SCALING_GROUP_PROPERTIES_TYPE = 8;

	/**
	 * The feature id for the '<em><b>Scale</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCALING_GROUP_PROPERTIES_TYPE__SCALE = 0;

	/**
	 * The number of structural features of the '<em>Scaling Group Properties Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCALING_GROUP_PROPERTIES_TYPE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Scaling Group Properties Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCALING_GROUP_PROPERTIES_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.ugoe.cs.oco.tosca.types.impl.ScalingPropertiesTypeImpl <em>Scaling Properties Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.ugoe.cs.oco.tosca.types.impl.ScalingPropertiesTypeImpl
	 * @see de.ugoe.cs.oco.tosca.types.impl.TypesPackageImpl#getScalingPropertiesType()
	 * @generated
	 */
	int SCALING_PROPERTIES_TYPE = 9;

	/**
	 * The feature id for the '<em><b>Instances</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCALING_PROPERTIES_TYPE__INSTANCES = 0;

	/**
	 * The number of structural features of the '<em>Scaling Properties Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCALING_PROPERTIES_TYPE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Scaling Properties Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCALING_PROPERTIES_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.ugoe.cs.oco.tosca.types.impl.VolumeHostPropertiesTypeImpl <em>Volume Host Properties Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.ugoe.cs.oco.tosca.types.impl.VolumeHostPropertiesTypeImpl
	 * @see de.ugoe.cs.oco.tosca.types.impl.TypesPackageImpl#getVolumeHostPropertiesType()
	 * @generated
	 */
	int VOLUME_HOST_PROPERTIES_TYPE = 10;

	/**
	 * The feature id for the '<em><b>Volume</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOLUME_HOST_PROPERTIES_TYPE__VOLUME = 0;

	/**
	 * The number of structural features of the '<em>Volume Host Properties Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOLUME_HOST_PROPERTIES_TYPE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Volume Host Properties Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOLUME_HOST_PROPERTIES_TYPE_OPERATION_COUNT = 0;


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
	 * Returns the meta object for class '{@link de.ugoe.cs.oco.tosca.types.DocumentRoot <em>Document Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Document Root</em>'.
	 * @see de.ugoe.cs.oco.tosca.types.DocumentRoot
	 * @generated
	 */
	EClass getDocumentRoot();

	/**
	 * Returns the meta object for the attribute list '{@link de.ugoe.cs.oco.tosca.types.DocumentRoot#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see de.ugoe.cs.oco.tosca.types.DocumentRoot#getMixed()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Mixed();

	/**
	 * Returns the meta object for the map '{@link de.ugoe.cs.oco.tosca.types.DocumentRoot#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>XMLNS Prefix Map</em>'.
	 * @see de.ugoe.cs.oco.tosca.types.DocumentRoot#getXMLNSPrefixMap()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_XMLNSPrefixMap();

	/**
	 * Returns the meta object for the map '{@link de.ugoe.cs.oco.tosca.types.DocumentRoot#getXSISchemaLocation <em>XSI Schema Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>XSI Schema Location</em>'.
	 * @see de.ugoe.cs.oco.tosca.types.DocumentRoot#getXSISchemaLocation()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_XSISchemaLocation();

	/**
	 * Returns the meta object for the containment reference '{@link de.ugoe.cs.oco.tosca.types.DocumentRoot#getCloudifyAgentProperties <em>Cloudify Agent Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Cloudify Agent Properties</em>'.
	 * @see de.ugoe.cs.oco.tosca.types.DocumentRoot#getCloudifyAgentProperties()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_CloudifyAgentProperties();

	/**
	 * Returns the meta object for the containment reference '{@link de.ugoe.cs.oco.tosca.types.DocumentRoot#getFloatingIPProperties <em>Floating IP Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Floating IP Properties</em>'.
	 * @see de.ugoe.cs.oco.tosca.types.DocumentRoot#getFloatingIPProperties()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_FloatingIPProperties();

	/**
	 * Returns the meta object for the containment reference '{@link de.ugoe.cs.oco.tosca.types.DocumentRoot#getKeyPairProperties <em>Key Pair Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Key Pair Properties</em>'.
	 * @see de.ugoe.cs.oco.tosca.types.DocumentRoot#getKeyPairProperties()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_KeyPairProperties();

	/**
	 * Returns the meta object for the containment reference '{@link de.ugoe.cs.oco.tosca.types.DocumentRoot#getMPIHostProperties <em>MPI Host Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>MPI Host Properties</em>'.
	 * @see de.ugoe.cs.oco.tosca.types.DocumentRoot#getMPIHostProperties()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_MPIHostProperties();

	/**
	 * Returns the meta object for the containment reference '{@link de.ugoe.cs.oco.tosca.types.DocumentRoot#getOpenStackFloatingIPProperties <em>Open Stack Floating IP Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Open Stack Floating IP Properties</em>'.
	 * @see de.ugoe.cs.oco.tosca.types.DocumentRoot#getOpenStackFloatingIPProperties()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_OpenStackFloatingIPProperties();

	/**
	 * Returns the meta object for the containment reference '{@link de.ugoe.cs.oco.tosca.types.DocumentRoot#getOpenStackProperties <em>Open Stack Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Open Stack Properties</em>'.
	 * @see de.ugoe.cs.oco.tosca.types.DocumentRoot#getOpenStackProperties()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_OpenStackProperties();

	/**
	 * Returns the meta object for the containment reference '{@link de.ugoe.cs.oco.tosca.types.DocumentRoot#getOpenStackVolumeProperties <em>Open Stack Volume Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Open Stack Volume Properties</em>'.
	 * @see de.ugoe.cs.oco.tosca.types.DocumentRoot#getOpenStackVolumeProperties()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_OpenStackVolumeProperties();

	/**
	 * Returns the meta object for the containment reference '{@link de.ugoe.cs.oco.tosca.types.DocumentRoot#getScalingGroupProperties <em>Scaling Group Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Scaling Group Properties</em>'.
	 * @see de.ugoe.cs.oco.tosca.types.DocumentRoot#getScalingGroupProperties()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_ScalingGroupProperties();

	/**
	 * Returns the meta object for the containment reference '{@link de.ugoe.cs.oco.tosca.types.DocumentRoot#getVolumeHostPropertiesType <em>Volume Host Properties Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Volume Host Properties Type</em>'.
	 * @see de.ugoe.cs.oco.tosca.types.DocumentRoot#getVolumeHostPropertiesType()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_VolumeHostPropertiesType();

	/**
	 * Returns the meta object for class '{@link de.ugoe.cs.oco.tosca.types.FloatingIPPropertiesType <em>Floating IP Properties Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Floating IP Properties Type</em>'.
	 * @see de.ugoe.cs.oco.tosca.types.FloatingIPPropertiesType
	 * @generated
	 */
	EClass getFloatingIPPropertiesType();

	/**
	 * Returns the meta object for the attribute '{@link de.ugoe.cs.oco.tosca.types.FloatingIPPropertiesType#getFloatingNetworkName <em>Floating Network Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Floating Network Name</em>'.
	 * @see de.ugoe.cs.oco.tosca.types.FloatingIPPropertiesType#getFloatingNetworkName()
	 * @see #getFloatingIPPropertiesType()
	 * @generated
	 */
	EAttribute getFloatingIPPropertiesType_FloatingNetworkName();

	/**
	 * Returns the meta object for class '{@link de.ugoe.cs.oco.tosca.types.HostPropertiesType <em>Host Properties Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Host Properties Type</em>'.
	 * @see de.ugoe.cs.oco.tosca.types.HostPropertiesType
	 * @generated
	 */
	EClass getHostPropertiesType();

	/**
	 * Returns the meta object for the attribute '{@link de.ugoe.cs.oco.tosca.types.HostPropertiesType#getOpenstackConfig <em>Openstack Config</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Openstack Config</em>'.
	 * @see de.ugoe.cs.oco.tosca.types.HostPropertiesType#getOpenstackConfig()
	 * @see #getHostPropertiesType()
	 * @generated
	 */
	EAttribute getHostPropertiesType_OpenstackConfig();

	/**
	 * Returns the meta object for the attribute '{@link de.ugoe.cs.oco.tosca.types.HostPropertiesType#getManagementNetworkName <em>Management Network Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Management Network Name</em>'.
	 * @see de.ugoe.cs.oco.tosca.types.HostPropertiesType#getManagementNetworkName()
	 * @see #getHostPropertiesType()
	 * @generated
	 */
	EAttribute getHostPropertiesType_ManagementNetworkName();

	/**
	 * Returns the meta object for the attribute '{@link de.ugoe.cs.oco.tosca.types.HostPropertiesType#getAgentConfig <em>Agent Config</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Agent Config</em>'.
	 * @see de.ugoe.cs.oco.tosca.types.HostPropertiesType#getAgentConfig()
	 * @see #getHostPropertiesType()
	 * @generated
	 */
	EAttribute getHostPropertiesType_AgentConfig();

	/**
	 * Returns the meta object for the containment reference '{@link de.ugoe.cs.oco.tosca.types.HostPropertiesType#getCloudifyAgent <em>Cloudify Agent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Cloudify Agent</em>'.
	 * @see de.ugoe.cs.oco.tosca.types.HostPropertiesType#getCloudifyAgent()
	 * @see #getHostPropertiesType()
	 * @generated
	 */
	EReference getHostPropertiesType_CloudifyAgent();

	/**
	 * Returns the meta object for the containment reference '{@link de.ugoe.cs.oco.tosca.types.HostPropertiesType#getServer <em>Server</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Server</em>'.
	 * @see de.ugoe.cs.oco.tosca.types.HostPropertiesType#getServer()
	 * @see #getHostPropertiesType()
	 * @generated
	 */
	EReference getHostPropertiesType_Server();

	/**
	 * Returns the meta object for class '{@link de.ugoe.cs.oco.tosca.types.KeyPairPropertiesType <em>Key Pair Properties Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Key Pair Properties Type</em>'.
	 * @see de.ugoe.cs.oco.tosca.types.KeyPairPropertiesType
	 * @generated
	 */
	EClass getKeyPairPropertiesType();

	/**
	 * Returns the meta object for the attribute '{@link de.ugoe.cs.oco.tosca.types.KeyPairPropertiesType#getOpenstackConfig <em>Openstack Config</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Openstack Config</em>'.
	 * @see de.ugoe.cs.oco.tosca.types.KeyPairPropertiesType#getOpenstackConfig()
	 * @see #getKeyPairPropertiesType()
	 * @generated
	 */
	EAttribute getKeyPairPropertiesType_OpenstackConfig();

	/**
	 * Returns the meta object for the attribute '{@link de.ugoe.cs.oco.tosca.types.KeyPairPropertiesType#getUseExternalResource <em>Use External Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Use External Resource</em>'.
	 * @see de.ugoe.cs.oco.tosca.types.KeyPairPropertiesType#getUseExternalResource()
	 * @see #getKeyPairPropertiesType()
	 * @generated
	 */
	EAttribute getKeyPairPropertiesType_UseExternalResource();

	/**
	 * Returns the meta object for the attribute '{@link de.ugoe.cs.oco.tosca.types.KeyPairPropertiesType#getResourceId <em>Resource Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Resource Id</em>'.
	 * @see de.ugoe.cs.oco.tosca.types.KeyPairPropertiesType#getResourceId()
	 * @see #getKeyPairPropertiesType()
	 * @generated
	 */
	EAttribute getKeyPairPropertiesType_ResourceId();

	/**
	 * Returns the meta object for the attribute '{@link de.ugoe.cs.oco.tosca.types.KeyPairPropertiesType#getPrivateKeyPath <em>Private Key Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Private Key Path</em>'.
	 * @see de.ugoe.cs.oco.tosca.types.KeyPairPropertiesType#getPrivateKeyPath()
	 * @see #getKeyPairPropertiesType()
	 * @generated
	 */
	EAttribute getKeyPairPropertiesType_PrivateKeyPath();

	/**
	 * Returns the meta object for class '{@link de.ugoe.cs.oco.tosca.types.OpenStackFloatingIPPropertiesType <em>Open Stack Floating IP Properties Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Open Stack Floating IP Properties Type</em>'.
	 * @see de.ugoe.cs.oco.tosca.types.OpenStackFloatingIPPropertiesType
	 * @generated
	 */
	EClass getOpenStackFloatingIPPropertiesType();

	/**
	 * Returns the meta object for the attribute '{@link de.ugoe.cs.oco.tosca.types.OpenStackFloatingIPPropertiesType#getOpenstackConfig <em>Openstack Config</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Openstack Config</em>'.
	 * @see de.ugoe.cs.oco.tosca.types.OpenStackFloatingIPPropertiesType#getOpenstackConfig()
	 * @see #getOpenStackFloatingIPPropertiesType()
	 * @generated
	 */
	EAttribute getOpenStackFloatingIPPropertiesType_OpenstackConfig();

	/**
	 * Returns the meta object for the containment reference '{@link de.ugoe.cs.oco.tosca.types.OpenStackFloatingIPPropertiesType#getFloatingip <em>Floatingip</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Floatingip</em>'.
	 * @see de.ugoe.cs.oco.tosca.types.OpenStackFloatingIPPropertiesType#getFloatingip()
	 * @see #getOpenStackFloatingIPPropertiesType()
	 * @generated
	 */
	EReference getOpenStackFloatingIPPropertiesType_Floatingip();

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
		 * The meta object literal for the '{@link de.ugoe.cs.oco.tosca.types.impl.DocumentRootImpl <em>Document Root</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.ugoe.cs.oco.tosca.types.impl.DocumentRootImpl
		 * @see de.ugoe.cs.oco.tosca.types.impl.TypesPackageImpl#getDocumentRoot()
		 * @generated
		 */
		EClass DOCUMENT_ROOT = eINSTANCE.getDocumentRoot();

		/**
		 * The meta object literal for the '<em><b>Mixed</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__MIXED = eINSTANCE.getDocumentRoot_Mixed();

		/**
		 * The meta object literal for the '<em><b>XMLNS Prefix Map</b></em>' map feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__XMLNS_PREFIX_MAP = eINSTANCE.getDocumentRoot_XMLNSPrefixMap();

		/**
		 * The meta object literal for the '<em><b>XSI Schema Location</b></em>' map feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__XSI_SCHEMA_LOCATION = eINSTANCE.getDocumentRoot_XSISchemaLocation();

		/**
		 * The meta object literal for the '<em><b>Cloudify Agent Properties</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__CLOUDIFY_AGENT_PROPERTIES = eINSTANCE.getDocumentRoot_CloudifyAgentProperties();

		/**
		 * The meta object literal for the '<em><b>Floating IP Properties</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__FLOATING_IP_PROPERTIES = eINSTANCE.getDocumentRoot_FloatingIPProperties();

		/**
		 * The meta object literal for the '<em><b>Key Pair Properties</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__KEY_PAIR_PROPERTIES = eINSTANCE.getDocumentRoot_KeyPairProperties();

		/**
		 * The meta object literal for the '<em><b>MPI Host Properties</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__MPI_HOST_PROPERTIES = eINSTANCE.getDocumentRoot_MPIHostProperties();

		/**
		 * The meta object literal for the '<em><b>Open Stack Floating IP Properties</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__OPEN_STACK_FLOATING_IP_PROPERTIES = eINSTANCE.getDocumentRoot_OpenStackFloatingIPProperties();

		/**
		 * The meta object literal for the '<em><b>Open Stack Properties</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__OPEN_STACK_PROPERTIES = eINSTANCE.getDocumentRoot_OpenStackProperties();

		/**
		 * The meta object literal for the '<em><b>Open Stack Volume Properties</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__OPEN_STACK_VOLUME_PROPERTIES = eINSTANCE.getDocumentRoot_OpenStackVolumeProperties();

		/**
		 * The meta object literal for the '<em><b>Scaling Group Properties</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__SCALING_GROUP_PROPERTIES = eINSTANCE.getDocumentRoot_ScalingGroupProperties();

		/**
		 * The meta object literal for the '<em><b>Volume Host Properties Type</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__VOLUME_HOST_PROPERTIES_TYPE = eINSTANCE.getDocumentRoot_VolumeHostPropertiesType();

		/**
		 * The meta object literal for the '{@link de.ugoe.cs.oco.tosca.types.impl.FloatingIPPropertiesTypeImpl <em>Floating IP Properties Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.ugoe.cs.oco.tosca.types.impl.FloatingIPPropertiesTypeImpl
		 * @see de.ugoe.cs.oco.tosca.types.impl.TypesPackageImpl#getFloatingIPPropertiesType()
		 * @generated
		 */
		EClass FLOATING_IP_PROPERTIES_TYPE = eINSTANCE.getFloatingIPPropertiesType();

		/**
		 * The meta object literal for the '<em><b>Floating Network Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FLOATING_IP_PROPERTIES_TYPE__FLOATING_NETWORK_NAME = eINSTANCE.getFloatingIPPropertiesType_FloatingNetworkName();

		/**
		 * The meta object literal for the '{@link de.ugoe.cs.oco.tosca.types.impl.HostPropertiesTypeImpl <em>Host Properties Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.ugoe.cs.oco.tosca.types.impl.HostPropertiesTypeImpl
		 * @see de.ugoe.cs.oco.tosca.types.impl.TypesPackageImpl#getHostPropertiesType()
		 * @generated
		 */
		EClass HOST_PROPERTIES_TYPE = eINSTANCE.getHostPropertiesType();

		/**
		 * The meta object literal for the '<em><b>Openstack Config</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HOST_PROPERTIES_TYPE__OPENSTACK_CONFIG = eINSTANCE.getHostPropertiesType_OpenstackConfig();

		/**
		 * The meta object literal for the '<em><b>Management Network Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HOST_PROPERTIES_TYPE__MANAGEMENT_NETWORK_NAME = eINSTANCE.getHostPropertiesType_ManagementNetworkName();

		/**
		 * The meta object literal for the '<em><b>Agent Config</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HOST_PROPERTIES_TYPE__AGENT_CONFIG = eINSTANCE.getHostPropertiesType_AgentConfig();

		/**
		 * The meta object literal for the '<em><b>Cloudify Agent</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HOST_PROPERTIES_TYPE__CLOUDIFY_AGENT = eINSTANCE.getHostPropertiesType_CloudifyAgent();

		/**
		 * The meta object literal for the '<em><b>Server</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HOST_PROPERTIES_TYPE__SERVER = eINSTANCE.getHostPropertiesType_Server();

		/**
		 * The meta object literal for the '{@link de.ugoe.cs.oco.tosca.types.impl.KeyPairPropertiesTypeImpl <em>Key Pair Properties Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.ugoe.cs.oco.tosca.types.impl.KeyPairPropertiesTypeImpl
		 * @see de.ugoe.cs.oco.tosca.types.impl.TypesPackageImpl#getKeyPairPropertiesType()
		 * @generated
		 */
		EClass KEY_PAIR_PROPERTIES_TYPE = eINSTANCE.getKeyPairPropertiesType();

		/**
		 * The meta object literal for the '<em><b>Openstack Config</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute KEY_PAIR_PROPERTIES_TYPE__OPENSTACK_CONFIG = eINSTANCE.getKeyPairPropertiesType_OpenstackConfig();

		/**
		 * The meta object literal for the '<em><b>Use External Resource</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute KEY_PAIR_PROPERTIES_TYPE__USE_EXTERNAL_RESOURCE = eINSTANCE.getKeyPairPropertiesType_UseExternalResource();

		/**
		 * The meta object literal for the '<em><b>Resource Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute KEY_PAIR_PROPERTIES_TYPE__RESOURCE_ID = eINSTANCE.getKeyPairPropertiesType_ResourceId();

		/**
		 * The meta object literal for the '<em><b>Private Key Path</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute KEY_PAIR_PROPERTIES_TYPE__PRIVATE_KEY_PATH = eINSTANCE.getKeyPairPropertiesType_PrivateKeyPath();

		/**
		 * The meta object literal for the '{@link de.ugoe.cs.oco.tosca.types.impl.OpenStackFloatingIPPropertiesTypeImpl <em>Open Stack Floating IP Properties Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.ugoe.cs.oco.tosca.types.impl.OpenStackFloatingIPPropertiesTypeImpl
		 * @see de.ugoe.cs.oco.tosca.types.impl.TypesPackageImpl#getOpenStackFloatingIPPropertiesType()
		 * @generated
		 */
		EClass OPEN_STACK_FLOATING_IP_PROPERTIES_TYPE = eINSTANCE.getOpenStackFloatingIPPropertiesType();

		/**
		 * The meta object literal for the '<em><b>Openstack Config</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPEN_STACK_FLOATING_IP_PROPERTIES_TYPE__OPENSTACK_CONFIG = eINSTANCE.getOpenStackFloatingIPPropertiesType_OpenstackConfig();

		/**
		 * The meta object literal for the '<em><b>Floatingip</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPEN_STACK_FLOATING_IP_PROPERTIES_TYPE__FLOATINGIP = eINSTANCE.getOpenStackFloatingIPPropertiesType_Floatingip();

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
