/**
 */
package de.ugoe.cs.oco.tosca.types.impl;

import de.ugoe.cs.oco.tosca.types.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

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
			case TypesPackage.MPI_HOST_PROPERTIES_TYPE: return createMPIHostPropertiesType();
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
	public MPIHostPropertiesType createMPIHostPropertiesType() {
		MPIHostPropertiesTypeImpl mpiHostPropertiesType = new MPIHostPropertiesTypeImpl();
		return mpiHostPropertiesType;
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
