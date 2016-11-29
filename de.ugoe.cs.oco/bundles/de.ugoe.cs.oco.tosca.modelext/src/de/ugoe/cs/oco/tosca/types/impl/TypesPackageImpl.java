/**
 */
package de.ugoe.cs.oco.tosca.types.impl;

import de.ugoe.cs.oco.tosca.ToscaPackage;

import de.ugoe.cs.oco.tosca.types.CloudifyAgentPropertiesType;
import de.ugoe.cs.oco.tosca.types.MPIHostPropertiesType;
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
	private EClass mpiHostPropertiesTypeEClass = null;

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
	public EClass getMPIHostPropertiesType() {
		return mpiHostPropertiesTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMPIHostPropertiesType_CloudifyAgent() {
		return (EReference)mpiHostPropertiesTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMPIHostPropertiesType_Server() {
		return (EReference)mpiHostPropertiesTypeEClass.getEStructuralFeatures().get(1);
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

		mpiHostPropertiesTypeEClass = createEClass(MPI_HOST_PROPERTIES_TYPE);
		createEReference(mpiHostPropertiesTypeEClass, MPI_HOST_PROPERTIES_TYPE__CLOUDIFY_AGENT);
		createEReference(mpiHostPropertiesTypeEClass, MPI_HOST_PROPERTIES_TYPE__SERVER);

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
		ToscaPackage theToscaPackage = (ToscaPackage)EPackage.Registry.INSTANCE.getEPackage(ToscaPackage.eNS_URI);
		XMLTypePackage theXMLTypePackage = (XMLTypePackage)EPackage.Registry.INSTANCE.getEPackage(XMLTypePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		cloudifyAgentPropertiesTypeEClass.getESuperTypes().add(theToscaPackage.getPropertiesType());
		mpiHostPropertiesTypeEClass.getESuperTypes().add(theToscaPackage.getPropertiesType());
		openStackServerPropertiesTypeEClass.getESuperTypes().add(theToscaPackage.getPropertiesType());
		openStackVolumePropertiesTypeEClass.getESuperTypes().add(theToscaPackage.getPropertiesType());
		scalingGroupPropertiesTypeEClass.getESuperTypes().add(theToscaPackage.getPropertiesType());
		scalingPropertiesTypeEClass.getESuperTypes().add(theToscaPackage.getPropertiesType());
		volumeHostPropertiesTypeEClass.getESuperTypes().add(theToscaPackage.getPropertiesType());

		// Initialize classes, features, and operations; add parameters
		initEClass(cloudifyAgentPropertiesTypeEClass, CloudifyAgentPropertiesType.class, "CloudifyAgentPropertiesType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCloudifyAgentPropertiesType_User(), theXMLTypePackage.getString(), "user", null, 1, 1, CloudifyAgentPropertiesType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(mpiHostPropertiesTypeEClass, MPIHostPropertiesType.class, "MPIHostPropertiesType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMPIHostPropertiesType_CloudifyAgent(), this.getCloudifyAgentPropertiesType(), null, "cloudifyAgent", null, 1, 1, MPIHostPropertiesType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMPIHostPropertiesType_Server(), this.getOpenStackServerPropertiesType(), null, "server", null, 1, 1, MPIHostPropertiesType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

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
		  (mpiHostPropertiesTypeEClass, 
		   source, 
		   new String[] {
			 "name", "MPIHostPropertiesType",
			 "kind", "elementOnly"
		   });	
		addAnnotation
		  (getMPIHostPropertiesType_CloudifyAgent(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "cloudify_agent",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getMPIHostPropertiesType_Server(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "server",
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
