/**
 */
package de.ugoe.cs.oco.tosca.types.impl;

import de.ugoe.cs.oco.tosca.ToscaPackage;

import de.ugoe.cs.oco.tosca.types.CloudifyAgentPropertiesType;
import de.ugoe.cs.oco.tosca.types.DocumentRoot;
import de.ugoe.cs.oco.tosca.types.FloatingIPPropertiesType;
import de.ugoe.cs.oco.tosca.types.HostPropertiesType;
import de.ugoe.cs.oco.tosca.types.KeyPairPropertiesType;
import de.ugoe.cs.oco.tosca.types.OpenStackFloatingIPPropertiesType;
import de.ugoe.cs.oco.tosca.types.OpenStackServerPropertiesType;
import de.ugoe.cs.oco.tosca.types.OpenStackVolumePropertiesType;
import de.ugoe.cs.oco.tosca.types.ScalingGroupPropertiesType;
import de.ugoe.cs.oco.tosca.types.ScalingPropertiesType;
import de.ugoe.cs.oco.tosca.types.TypesFactory;
import de.ugoe.cs.oco.tosca.types.TypesPackage;
import de.ugoe.cs.oco.tosca.types.VolumeHostPropertiesType;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.emf.ecore.xml.type.XMLTypePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class TypesPackageImpl extends EPackageImpl implements TypesPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cloudifyAgentPropertiesTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass documentRootEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass floatingIPPropertiesTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hostPropertiesTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass keyPairPropertiesTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass openStackFloatingIPPropertiesTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass openStackServerPropertiesTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass openStackVolumePropertiesTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass scalingGroupPropertiesTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass scalingPropertiesTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass volumeHostPropertiesTypeEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see de.ugoe.cs.oco.tosca.types.TypesPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private TypesPackageImpl() {
		super(eNS_URI, TypesFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link TypesPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static TypesPackage init() {
		if (isInited) return (TypesPackage)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI);

		// Obtain or create and register package
		TypesPackageImpl theTypesPackage = (TypesPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof TypesPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new TypesPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		ToscaPackage.eINSTANCE.eClass();
		XMLTypePackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theTypesPackage.createPackageContents();

		// Initialize created meta-data
		theTypesPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theTypesPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(TypesPackage.eNS_URI, theTypesPackage);
		return theTypesPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCloudifyAgentPropertiesType() {
		return cloudifyAgentPropertiesTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCloudifyAgentPropertiesType_User() {
		return (EAttribute)cloudifyAgentPropertiesTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDocumentRoot() {
		return documentRootEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_Mixed() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_XMLNSPrefixMap() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_XSISchemaLocation() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_CloudifyAgentProperties() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_FloatingIPProperties() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_KeyPairProperties() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_MPIHostProperties() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_OpenStackFloatingIPProperties() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_OpenStackProperties() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_OpenStackVolumeProperties() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ScalingGroupProperties() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_VolumeHostPropertiesType() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFloatingIPPropertiesType() {
		return floatingIPPropertiesTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFloatingIPPropertiesType_FloatingNetworkName() {
		return (EAttribute)floatingIPPropertiesTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHostPropertiesType() {
		return hostPropertiesTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHostPropertiesType_OpenstackConfig() {
		return (EAttribute)hostPropertiesTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHostPropertiesType_ManagementNetworkName() {
		return (EAttribute)hostPropertiesTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHostPropertiesType_AgentConfig() {
		return (EAttribute)hostPropertiesTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHostPropertiesType_CloudifyAgent() {
		return (EReference)hostPropertiesTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHostPropertiesType_Server() {
		return (EReference)hostPropertiesTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getKeyPairPropertiesType() {
		return keyPairPropertiesTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getKeyPairPropertiesType_OpenstackConfig() {
		return (EAttribute)keyPairPropertiesTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getKeyPairPropertiesType_UseExternalResource() {
		return (EAttribute)keyPairPropertiesTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getKeyPairPropertiesType_ResourceId() {
		return (EAttribute)keyPairPropertiesTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getKeyPairPropertiesType_PrivateKeyPath() {
		return (EAttribute)keyPairPropertiesTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOpenStackFloatingIPPropertiesType() {
		return openStackFloatingIPPropertiesTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOpenStackFloatingIPPropertiesType_OpenstackConfig() {
		return (EAttribute)openStackFloatingIPPropertiesTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOpenStackFloatingIPPropertiesType_Floatingip() {
		return (EReference)openStackFloatingIPPropertiesTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOpenStackServerPropertiesType() {
		return openStackServerPropertiesTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOpenStackServerPropertiesType_Image() {
		return (EAttribute)openStackServerPropertiesTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOpenStackServerPropertiesType_Flavor() {
		return (EAttribute)openStackServerPropertiesTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOpenStackServerPropertiesType_Name() {
		return (EAttribute)openStackServerPropertiesTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOpenStackVolumePropertiesType() {
		return openStackVolumePropertiesTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOpenStackVolumePropertiesType_Size() {
		return (EAttribute)openStackVolumePropertiesTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getScalingGroupPropertiesType() {
		return scalingGroupPropertiesTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getScalingGroupPropertiesType_Scale() {
		return (EReference)scalingGroupPropertiesTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getScalingPropertiesType() {
		return scalingPropertiesTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getScalingPropertiesType_Instances() {
		return (EAttribute)scalingPropertiesTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVolumeHostPropertiesType() {
		return volumeHostPropertiesTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVolumeHostPropertiesType_Volume() {
		return (EReference)volumeHostPropertiesTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypesFactory getTypesFactory() {
		return (TypesFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		cloudifyAgentPropertiesTypeEClass = createEClass(CLOUDIFY_AGENT_PROPERTIES_TYPE);
		createEAttribute(cloudifyAgentPropertiesTypeEClass, CLOUDIFY_AGENT_PROPERTIES_TYPE__USER);

		documentRootEClass = createEClass(DOCUMENT_ROOT);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__MIXED);
		createEReference(documentRootEClass, DOCUMENT_ROOT__XMLNS_PREFIX_MAP);
		createEReference(documentRootEClass, DOCUMENT_ROOT__XSI_SCHEMA_LOCATION);
		createEReference(documentRootEClass, DOCUMENT_ROOT__CLOUDIFY_AGENT_PROPERTIES);
		createEReference(documentRootEClass, DOCUMENT_ROOT__FLOATING_IP_PROPERTIES);
		createEReference(documentRootEClass, DOCUMENT_ROOT__KEY_PAIR_PROPERTIES);
		createEReference(documentRootEClass, DOCUMENT_ROOT__MPI_HOST_PROPERTIES);
		createEReference(documentRootEClass, DOCUMENT_ROOT__OPEN_STACK_FLOATING_IP_PROPERTIES);
		createEReference(documentRootEClass, DOCUMENT_ROOT__OPEN_STACK_PROPERTIES);
		createEReference(documentRootEClass, DOCUMENT_ROOT__OPEN_STACK_VOLUME_PROPERTIES);
		createEReference(documentRootEClass, DOCUMENT_ROOT__SCALING_GROUP_PROPERTIES);
		createEReference(documentRootEClass, DOCUMENT_ROOT__VOLUME_HOST_PROPERTIES_TYPE);

		floatingIPPropertiesTypeEClass = createEClass(FLOATING_IP_PROPERTIES_TYPE);
		createEAttribute(floatingIPPropertiesTypeEClass, FLOATING_IP_PROPERTIES_TYPE__FLOATING_NETWORK_NAME);

		hostPropertiesTypeEClass = createEClass(HOST_PROPERTIES_TYPE);
		createEAttribute(hostPropertiesTypeEClass, HOST_PROPERTIES_TYPE__OPENSTACK_CONFIG);
		createEAttribute(hostPropertiesTypeEClass, HOST_PROPERTIES_TYPE__MANAGEMENT_NETWORK_NAME);
		createEAttribute(hostPropertiesTypeEClass, HOST_PROPERTIES_TYPE__AGENT_CONFIG);
		createEReference(hostPropertiesTypeEClass, HOST_PROPERTIES_TYPE__CLOUDIFY_AGENT);
		createEReference(hostPropertiesTypeEClass, HOST_PROPERTIES_TYPE__SERVER);

		keyPairPropertiesTypeEClass = createEClass(KEY_PAIR_PROPERTIES_TYPE);
		createEAttribute(keyPairPropertiesTypeEClass, KEY_PAIR_PROPERTIES_TYPE__OPENSTACK_CONFIG);
		createEAttribute(keyPairPropertiesTypeEClass, KEY_PAIR_PROPERTIES_TYPE__USE_EXTERNAL_RESOURCE);
		createEAttribute(keyPairPropertiesTypeEClass, KEY_PAIR_PROPERTIES_TYPE__RESOURCE_ID);
		createEAttribute(keyPairPropertiesTypeEClass, KEY_PAIR_PROPERTIES_TYPE__PRIVATE_KEY_PATH);

		openStackFloatingIPPropertiesTypeEClass = createEClass(OPEN_STACK_FLOATING_IP_PROPERTIES_TYPE);
		createEAttribute(openStackFloatingIPPropertiesTypeEClass, OPEN_STACK_FLOATING_IP_PROPERTIES_TYPE__OPENSTACK_CONFIG);
		createEReference(openStackFloatingIPPropertiesTypeEClass, OPEN_STACK_FLOATING_IP_PROPERTIES_TYPE__FLOATINGIP);

		openStackServerPropertiesTypeEClass = createEClass(OPEN_STACK_SERVER_PROPERTIES_TYPE);
		createEAttribute(openStackServerPropertiesTypeEClass, OPEN_STACK_SERVER_PROPERTIES_TYPE__IMAGE);
		createEAttribute(openStackServerPropertiesTypeEClass, OPEN_STACK_SERVER_PROPERTIES_TYPE__FLAVOR);
		createEAttribute(openStackServerPropertiesTypeEClass, OPEN_STACK_SERVER_PROPERTIES_TYPE__NAME);

		openStackVolumePropertiesTypeEClass = createEClass(OPEN_STACK_VOLUME_PROPERTIES_TYPE);
		createEAttribute(openStackVolumePropertiesTypeEClass, OPEN_STACK_VOLUME_PROPERTIES_TYPE__SIZE);

		scalingGroupPropertiesTypeEClass = createEClass(SCALING_GROUP_PROPERTIES_TYPE);
		createEReference(scalingGroupPropertiesTypeEClass, SCALING_GROUP_PROPERTIES_TYPE__SCALE);

		scalingPropertiesTypeEClass = createEClass(SCALING_PROPERTIES_TYPE);
		createEAttribute(scalingPropertiesTypeEClass, SCALING_PROPERTIES_TYPE__INSTANCES);

		volumeHostPropertiesTypeEClass = createEClass(VOLUME_HOST_PROPERTIES_TYPE);
		createEReference(volumeHostPropertiesTypeEClass, VOLUME_HOST_PROPERTIES_TYPE__VOLUME);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		XMLTypePackage theXMLTypePackage = (XMLTypePackage)EPackage.Registry.INSTANCE.getEPackage(XMLTypePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes, features, and operations; add parameters
		initEClass(cloudifyAgentPropertiesTypeEClass, CloudifyAgentPropertiesType.class, "CloudifyAgentPropertiesType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCloudifyAgentPropertiesType_User(), theXMLTypePackage.getString(), "user", null, 1, 1, CloudifyAgentPropertiesType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(documentRootEClass, DocumentRoot.class, "DocumentRoot", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDocumentRoot_Mixed(), ecorePackage.getEFeatureMapEntry(), "mixed", null, 0, -1, null, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_XMLNSPrefixMap(), ecorePackage.getEStringToStringMapEntry(), null, "xMLNSPrefixMap", null, 0, -1, null, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_XSISchemaLocation(), ecorePackage.getEStringToStringMapEntry(), null, "xSISchemaLocation", null, 0, -1, null, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_CloudifyAgentProperties(), this.getCloudifyAgentPropertiesType(), null, "cloudifyAgentProperties", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_FloatingIPProperties(), this.getFloatingIPPropertiesType(), null, "floatingIPProperties", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_KeyPairProperties(), this.getKeyPairPropertiesType(), null, "keyPairProperties", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_MPIHostProperties(), this.getHostPropertiesType(), null, "mPIHostProperties", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_OpenStackFloatingIPProperties(), this.getOpenStackFloatingIPPropertiesType(), null, "openStackFloatingIPProperties", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_OpenStackProperties(), this.getOpenStackServerPropertiesType(), null, "openStackProperties", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_OpenStackVolumeProperties(), this.getOpenStackVolumePropertiesType(), null, "openStackVolumeProperties", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_ScalingGroupProperties(), this.getScalingGroupPropertiesType(), null, "scalingGroupProperties", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_VolumeHostPropertiesType(), this.getVolumeHostPropertiesType(), null, "volumeHostPropertiesType", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(floatingIPPropertiesTypeEClass, FloatingIPPropertiesType.class, "FloatingIPPropertiesType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFloatingIPPropertiesType_FloatingNetworkName(), theXMLTypePackage.getString(), "floatingNetworkName", null, 1, 1, FloatingIPPropertiesType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(hostPropertiesTypeEClass, HostPropertiesType.class, "HostPropertiesType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getHostPropertiesType_OpenstackConfig(), theXMLTypePackage.getString(), "openstackConfig", null, 1, 1, HostPropertiesType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getHostPropertiesType_ManagementNetworkName(), theXMLTypePackage.getString(), "managementNetworkName", null, 1, 1, HostPropertiesType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getHostPropertiesType_AgentConfig(), theXMLTypePackage.getString(), "agentConfig", null, 1, 1, HostPropertiesType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getHostPropertiesType_CloudifyAgent(), this.getCloudifyAgentPropertiesType(), null, "cloudifyAgent", null, 1, 1, HostPropertiesType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getHostPropertiesType_Server(), this.getOpenStackServerPropertiesType(), null, "server", null, 1, 1, HostPropertiesType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(keyPairPropertiesTypeEClass, KeyPairPropertiesType.class, "KeyPairPropertiesType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getKeyPairPropertiesType_OpenstackConfig(), theXMLTypePackage.getString(), "openstackConfig", null, 1, 1, KeyPairPropertiesType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getKeyPairPropertiesType_UseExternalResource(), theXMLTypePackage.getString(), "useExternalResource", null, 1, 1, KeyPairPropertiesType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getKeyPairPropertiesType_ResourceId(), theXMLTypePackage.getString(), "resourceId", null, 1, 1, KeyPairPropertiesType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getKeyPairPropertiesType_PrivateKeyPath(), theXMLTypePackage.getString(), "privateKeyPath", null, 1, 1, KeyPairPropertiesType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(openStackFloatingIPPropertiesTypeEClass, OpenStackFloatingIPPropertiesType.class, "OpenStackFloatingIPPropertiesType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOpenStackFloatingIPPropertiesType_OpenstackConfig(), theXMLTypePackage.getString(), "openstackConfig", null, 1, 1, OpenStackFloatingIPPropertiesType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOpenStackFloatingIPPropertiesType_Floatingip(), this.getFloatingIPPropertiesType(), null, "floatingip", null, 1, 1, OpenStackFloatingIPPropertiesType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(openStackServerPropertiesTypeEClass, OpenStackServerPropertiesType.class, "OpenStackServerPropertiesType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOpenStackServerPropertiesType_Image(), theXMLTypePackage.getString(), "image", null, 1, 1, OpenStackServerPropertiesType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOpenStackServerPropertiesType_Flavor(), theXMLTypePackage.getString(), "flavor", null, 1, 1, OpenStackServerPropertiesType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOpenStackServerPropertiesType_Name(), theXMLTypePackage.getString(), "name", null, 1, 1, OpenStackServerPropertiesType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(openStackVolumePropertiesTypeEClass, OpenStackVolumePropertiesType.class, "OpenStackVolumePropertiesType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOpenStackVolumePropertiesType_Size(), theXMLTypePackage.getString(), "size", null, 1, 1, OpenStackVolumePropertiesType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(scalingGroupPropertiesTypeEClass, ScalingGroupPropertiesType.class, "ScalingGroupPropertiesType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getScalingGroupPropertiesType_Scale(), this.getScalingPropertiesType(), null, "scale", null, 1, 1, ScalingGroupPropertiesType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(scalingPropertiesTypeEClass, ScalingPropertiesType.class, "ScalingPropertiesType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getScalingPropertiesType_Instances(), theXMLTypePackage.getString(), "instances", null, 1, 1, ScalingPropertiesType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(volumeHostPropertiesTypeEClass, VolumeHostPropertiesType.class, "VolumeHostPropertiesType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getVolumeHostPropertiesType_Volume(), this.getOpenStackVolumePropertiesType(), null, "volume", null, 1, 1, VolumeHostPropertiesType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http:///org/eclipse/emf/ecore/util/ExtendedMetaData
		createExtendedMetaDataAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http:///org/eclipse/emf/ecore/util/ExtendedMetaData</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createExtendedMetaDataAnnotations() {
		String source = "http:///org/eclipse/emf/ecore/util/ExtendedMetaData";	
		addAnnotation
		  (cloudifyAgentPropertiesTypeEClass, 
		   source, 
		   new String[] {
			 "name", "CloudifyAgentPropertiesType",
			 "kind", "elementOnly"
		   });	
		addAnnotation
		  (getCloudifyAgentPropertiesType_User(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "user",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (documentRootEClass, 
		   source, 
		   new String[] {
			 "name", "",
			 "kind", "mixed"
		   });	
		addAnnotation
		  (getDocumentRoot_Mixed(), 
		   source, 
		   new String[] {
			 "kind", "elementWildcard",
			 "name", ":mixed"
		   });	
		addAnnotation
		  (getDocumentRoot_XMLNSPrefixMap(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "xmlns:prefix"
		   });	
		addAnnotation
		  (getDocumentRoot_XSISchemaLocation(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "xsi:schemaLocation"
		   });	
		addAnnotation
		  (getDocumentRoot_CloudifyAgentProperties(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "CloudifyAgentProperties",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getDocumentRoot_FloatingIPProperties(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "FloatingIPProperties",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getDocumentRoot_KeyPairProperties(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "KeyPairProperties",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getDocumentRoot_MPIHostProperties(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "MPIHostProperties",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getDocumentRoot_OpenStackFloatingIPProperties(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "OpenStackFloatingIPProperties",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getDocumentRoot_OpenStackProperties(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "OpenStackProperties",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getDocumentRoot_OpenStackVolumeProperties(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "OpenStackVolumeProperties",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getDocumentRoot_ScalingGroupProperties(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "ScalingGroupProperties",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getDocumentRoot_VolumeHostPropertiesType(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "VolumeHostPropertiesType",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (floatingIPPropertiesTypeEClass, 
		   source, 
		   new String[] {
			 "name", "FloatingIPPropertiesType",
			 "kind", "elementOnly"
		   });	
		addAnnotation
		  (getFloatingIPPropertiesType_FloatingNetworkName(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "floating_network_name",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (hostPropertiesTypeEClass, 
		   source, 
		   new String[] {
			 "name", "HostPropertiesType",
			 "kind", "elementOnly"
		   });	
		addAnnotation
		  (getHostPropertiesType_OpenstackConfig(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "openstack_config",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getHostPropertiesType_ManagementNetworkName(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "management_network_name",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getHostPropertiesType_AgentConfig(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "agent_config",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getHostPropertiesType_CloudifyAgent(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "cloudify_agent",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getHostPropertiesType_Server(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "server",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (keyPairPropertiesTypeEClass, 
		   source, 
		   new String[] {
			 "name", "KeyPairPropertiesType",
			 "kind", "elementOnly"
		   });	
		addAnnotation
		  (getKeyPairPropertiesType_OpenstackConfig(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "openstack_config",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getKeyPairPropertiesType_UseExternalResource(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "use_external_resource",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getKeyPairPropertiesType_ResourceId(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "resource_id",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getKeyPairPropertiesType_PrivateKeyPath(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "private_key_path",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (openStackFloatingIPPropertiesTypeEClass, 
		   source, 
		   new String[] {
			 "name", "OpenStackFloatingIPPropertiesType",
			 "kind", "elementOnly"
		   });	
		addAnnotation
		  (getOpenStackFloatingIPPropertiesType_OpenstackConfig(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "openstack_config",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getOpenStackFloatingIPPropertiesType_Floatingip(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "floatingip",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (openStackServerPropertiesTypeEClass, 
		   source, 
		   new String[] {
			 "name", "OpenStackServerPropertiesType",
			 "kind", "elementOnly"
		   });	
		addAnnotation
		  (getOpenStackServerPropertiesType_Image(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "image",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getOpenStackServerPropertiesType_Flavor(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "flavor",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getOpenStackServerPropertiesType_Name(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "name",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (openStackVolumePropertiesTypeEClass, 
		   source, 
		   new String[] {
			 "name", "OpenStackVolumePropertiesType",
			 "kind", "elementOnly"
		   });	
		addAnnotation
		  (getOpenStackVolumePropertiesType_Size(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "size",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (scalingGroupPropertiesTypeEClass, 
		   source, 
		   new String[] {
			 "name", "ScalingGroupPropertiesType",
			 "kind", "elementOnly"
		   });	
		addAnnotation
		  (getScalingGroupPropertiesType_Scale(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "scale",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (scalingPropertiesTypeEClass, 
		   source, 
		   new String[] {
			 "name", "ScalingPropertiesType",
			 "kind", "elementOnly"
		   });	
		addAnnotation
		  (getScalingPropertiesType_Instances(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "instances",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (volumeHostPropertiesTypeEClass, 
		   source, 
		   new String[] {
			 "name", "VolumeHostPropertiesType",
			 "kind", "elementOnly"
		   });	
		addAnnotation
		  (getVolumeHostPropertiesType_Volume(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "volume",
			 "namespace", "##targetNamespace"
		   });
	}

} //TypesPackageImpl
