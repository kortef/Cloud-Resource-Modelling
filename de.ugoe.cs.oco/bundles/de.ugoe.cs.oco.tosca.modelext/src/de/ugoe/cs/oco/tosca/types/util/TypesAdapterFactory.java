/**
 */
package de.ugoe.cs.oco.tosca.types.util;

import de.ugoe.cs.oco.tosca.types.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see de.ugoe.cs.oco.tosca.types.TypesPackage
 * @generated
 */
public class TypesAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static TypesPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypesAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = TypesPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypesSwitch<Adapter> modelSwitch =
		new TypesSwitch<Adapter>() {
			@Override
			public Adapter caseCloudifyAgentPropertiesType(CloudifyAgentPropertiesType object) {
				return createCloudifyAgentPropertiesTypeAdapter();
			}
			@Override
			public Adapter caseDocumentRoot(DocumentRoot object) {
				return createDocumentRootAdapter();
			}
			@Override
			public Adapter caseFloatingIPPropertiesType(FloatingIPPropertiesType object) {
				return createFloatingIPPropertiesTypeAdapter();
			}
			@Override
			public Adapter caseHostPropertiesType(HostPropertiesType object) {
				return createHostPropertiesTypeAdapter();
			}
			@Override
			public Adapter caseKeyPairPropertiesType(KeyPairPropertiesType object) {
				return createKeyPairPropertiesTypeAdapter();
			}
			@Override
			public Adapter caseOpenStackFloatingIPPropertiesType(OpenStackFloatingIPPropertiesType object) {
				return createOpenStackFloatingIPPropertiesTypeAdapter();
			}
			@Override
			public Adapter caseOpenStackServerPropertiesType(OpenStackServerPropertiesType object) {
				return createOpenStackServerPropertiesTypeAdapter();
			}
			@Override
			public Adapter caseOpenStackVolumePropertiesType(OpenStackVolumePropertiesType object) {
				return createOpenStackVolumePropertiesTypeAdapter();
			}
			@Override
			public Adapter caseScalingGroupPropertiesType(ScalingGroupPropertiesType object) {
				return createScalingGroupPropertiesTypeAdapter();
			}
			@Override
			public Adapter caseScalingPropertiesType(ScalingPropertiesType object) {
				return createScalingPropertiesTypeAdapter();
			}
			@Override
			public Adapter caseVolumeHostPropertiesType(VolumeHostPropertiesType object) {
				return createVolumeHostPropertiesTypeAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link de.ugoe.cs.oco.tosca.types.CloudifyAgentPropertiesType <em>Cloudify Agent Properties Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.ugoe.cs.oco.tosca.types.CloudifyAgentPropertiesType
	 * @generated
	 */
	public Adapter createCloudifyAgentPropertiesTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.ugoe.cs.oco.tosca.types.DocumentRoot <em>Document Root</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.ugoe.cs.oco.tosca.types.DocumentRoot
	 * @generated
	 */
	public Adapter createDocumentRootAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.ugoe.cs.oco.tosca.types.FloatingIPPropertiesType <em>Floating IP Properties Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.ugoe.cs.oco.tosca.types.FloatingIPPropertiesType
	 * @generated
	 */
	public Adapter createFloatingIPPropertiesTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.ugoe.cs.oco.tosca.types.HostPropertiesType <em>Host Properties Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.ugoe.cs.oco.tosca.types.HostPropertiesType
	 * @generated
	 */
	public Adapter createHostPropertiesTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.ugoe.cs.oco.tosca.types.KeyPairPropertiesType <em>Key Pair Properties Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.ugoe.cs.oco.tosca.types.KeyPairPropertiesType
	 * @generated
	 */
	public Adapter createKeyPairPropertiesTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.ugoe.cs.oco.tosca.types.OpenStackFloatingIPPropertiesType <em>Open Stack Floating IP Properties Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.ugoe.cs.oco.tosca.types.OpenStackFloatingIPPropertiesType
	 * @generated
	 */
	public Adapter createOpenStackFloatingIPPropertiesTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.ugoe.cs.oco.tosca.types.OpenStackServerPropertiesType <em>Open Stack Server Properties Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.ugoe.cs.oco.tosca.types.OpenStackServerPropertiesType
	 * @generated
	 */
	public Adapter createOpenStackServerPropertiesTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.ugoe.cs.oco.tosca.types.OpenStackVolumePropertiesType <em>Open Stack Volume Properties Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.ugoe.cs.oco.tosca.types.OpenStackVolumePropertiesType
	 * @generated
	 */
	public Adapter createOpenStackVolumePropertiesTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.ugoe.cs.oco.tosca.types.ScalingGroupPropertiesType <em>Scaling Group Properties Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.ugoe.cs.oco.tosca.types.ScalingGroupPropertiesType
	 * @generated
	 */
	public Adapter createScalingGroupPropertiesTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.ugoe.cs.oco.tosca.types.ScalingPropertiesType <em>Scaling Properties Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.ugoe.cs.oco.tosca.types.ScalingPropertiesType
	 * @generated
	 */
	public Adapter createScalingPropertiesTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.ugoe.cs.oco.tosca.types.VolumeHostPropertiesType <em>Volume Host Properties Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.ugoe.cs.oco.tosca.types.VolumeHostPropertiesType
	 * @generated
	 */
	public Adapter createVolumeHostPropertiesTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //TypesAdapterFactory
