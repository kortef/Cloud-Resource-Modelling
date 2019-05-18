/**
 */
package de.ugoe.cs.as.tosca.types.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import de.ugoe.cs.as.tosca.types.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class TypesFactoryImpl extends EFactoryImpl implements TypesFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TypesFactory init() {
		try {
			TypesFactory theTypesFactory = (TypesFactory)EPackage.Registry.INSTANCE.getEFactory(TypesPackage.eNS_URI);
			if (theTypesFactory != null) {
				return theTypesFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new TypesFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypesFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case TypesPackage.CLOUDIFY_AGENT_PROPERTIES_TYPE: return createCloudifyAgentPropertiesType();
			case TypesPackage.DOCUMENT_ROOT: return createDocumentRoot();
			case TypesPackage.FLOATING_IP_PROPERTIES_TYPE: return createFloatingIPPropertiesType();
			case TypesPackage.HOST_PROPERTIES_TYPE: return createHostPropertiesType();
			case TypesPackage.KEY_PAIR_PROPERTIES_TYPE: return createKeyPairPropertiesType();
			case TypesPackage.OPEN_STACK_FLOATING_IP_PROPERTIES_TYPE: return createOpenStackFloatingIPPropertiesType();
			case TypesPackage.OPEN_STACK_SERVER_PROPERTIES_TYPE: return createOpenStackServerPropertiesType();
			case TypesPackage.OPEN_STACK_VOLUME_PROPERTIES_TYPE: return createOpenStackVolumePropertiesType();
			case TypesPackage.SCALING_GROUP_PROPERTIES_TYPE: return createScalingGroupPropertiesType();
			case TypesPackage.SCALING_PROPERTIES_TYPE: return createScalingPropertiesType();
			case TypesPackage.VOLUME_HOST_PROPERTIES_TYPE: return createVolumeHostPropertiesType();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CloudifyAgentPropertiesType createCloudifyAgentPropertiesType() {
		CloudifyAgentPropertiesTypeImpl cloudifyAgentPropertiesType = new CloudifyAgentPropertiesTypeImpl();
		return cloudifyAgentPropertiesType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DocumentRoot createDocumentRoot() {
		DocumentRootImpl documentRoot = new DocumentRootImpl();
		return documentRoot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FloatingIPPropertiesType createFloatingIPPropertiesType() {
		FloatingIPPropertiesTypeImpl floatingIPPropertiesType = new FloatingIPPropertiesTypeImpl();
		return floatingIPPropertiesType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HostPropertiesType createHostPropertiesType() {
		HostPropertiesTypeImpl hostPropertiesType = new HostPropertiesTypeImpl();
		return hostPropertiesType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public KeyPairPropertiesType createKeyPairPropertiesType() {
		KeyPairPropertiesTypeImpl keyPairPropertiesType = new KeyPairPropertiesTypeImpl();
		return keyPairPropertiesType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OpenStackFloatingIPPropertiesType createOpenStackFloatingIPPropertiesType() {
		OpenStackFloatingIPPropertiesTypeImpl openStackFloatingIPPropertiesType = new OpenStackFloatingIPPropertiesTypeImpl();
		return openStackFloatingIPPropertiesType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OpenStackServerPropertiesType createOpenStackServerPropertiesType() {
		OpenStackServerPropertiesTypeImpl openStackServerPropertiesType = new OpenStackServerPropertiesTypeImpl();
		return openStackServerPropertiesType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OpenStackVolumePropertiesType createOpenStackVolumePropertiesType() {
		OpenStackVolumePropertiesTypeImpl openStackVolumePropertiesType = new OpenStackVolumePropertiesTypeImpl();
		return openStackVolumePropertiesType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ScalingGroupPropertiesType createScalingGroupPropertiesType() {
		ScalingGroupPropertiesTypeImpl scalingGroupPropertiesType = new ScalingGroupPropertiesTypeImpl();
		return scalingGroupPropertiesType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ScalingPropertiesType createScalingPropertiesType() {
		ScalingPropertiesTypeImpl scalingPropertiesType = new ScalingPropertiesTypeImpl();
		return scalingPropertiesType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VolumeHostPropertiesType createVolumeHostPropertiesType() {
		VolumeHostPropertiesTypeImpl volumeHostPropertiesType = new VolumeHostPropertiesTypeImpl();
		return volumeHostPropertiesType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypesPackage getTypesPackage() {
		return (TypesPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static TypesPackage getPackage() {
		return TypesPackage.eINSTANCE;
	}

} //TypesFactoryImpl
