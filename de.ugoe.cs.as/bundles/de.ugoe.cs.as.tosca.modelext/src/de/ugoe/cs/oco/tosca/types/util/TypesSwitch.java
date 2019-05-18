/**
 */
package de.ugoe.cs.oco.tosca.types.util;

import de.ugoe.cs.oco.tosca.PropertiesType;
import de.ugoe.cs.oco.tosca.types.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see de.ugoe.cs.oco.tosca.types.TypesPackage
 * @generated
 */
public class TypesSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static TypesPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypesSwitch() {
		if (modelPackage == null) {
			modelPackage = TypesPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case TypesPackage.CLOUDIFY_AGENT_PROPERTIES_TYPE: {
				CloudifyAgentPropertiesType cloudifyAgentPropertiesType = (CloudifyAgentPropertiesType)theEObject;
				T result = caseCloudifyAgentPropertiesType(cloudifyAgentPropertiesType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypesPackage.DOCUMENT_ROOT: {
				DocumentRoot documentRoot = (DocumentRoot)theEObject;
				T result = caseDocumentRoot(documentRoot);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypesPackage.FLOATING_IP_PROPERTIES_TYPE: {
				FloatingIPPropertiesType floatingIPPropertiesType = (FloatingIPPropertiesType)theEObject;
				T result = caseFloatingIPPropertiesType(floatingIPPropertiesType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypesPackage.HOST_PROPERTIES_TYPE: {
				HostPropertiesType hostPropertiesType = (HostPropertiesType)theEObject;
				T result = caseHostPropertiesType(hostPropertiesType);
				if (result == null) result = casePropertiesType(hostPropertiesType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypesPackage.KEY_PAIR_PROPERTIES_TYPE: {
				KeyPairPropertiesType keyPairPropertiesType = (KeyPairPropertiesType)theEObject;
				T result = caseKeyPairPropertiesType(keyPairPropertiesType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypesPackage.OPEN_STACK_FLOATING_IP_PROPERTIES_TYPE: {
				OpenStackFloatingIPPropertiesType openStackFloatingIPPropertiesType = (OpenStackFloatingIPPropertiesType)theEObject;
				T result = caseOpenStackFloatingIPPropertiesType(openStackFloatingIPPropertiesType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypesPackage.OPEN_STACK_SERVER_PROPERTIES_TYPE: {
				OpenStackServerPropertiesType openStackServerPropertiesType = (OpenStackServerPropertiesType)theEObject;
				T result = caseOpenStackServerPropertiesType(openStackServerPropertiesType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypesPackage.OPEN_STACK_VOLUME_PROPERTIES_TYPE: {
				OpenStackVolumePropertiesType openStackVolumePropertiesType = (OpenStackVolumePropertiesType)theEObject;
				T result = caseOpenStackVolumePropertiesType(openStackVolumePropertiesType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypesPackage.SCALING_GROUP_PROPERTIES_TYPE: {
				ScalingGroupPropertiesType scalingGroupPropertiesType = (ScalingGroupPropertiesType)theEObject;
				T result = caseScalingGroupPropertiesType(scalingGroupPropertiesType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypesPackage.SCALING_PROPERTIES_TYPE: {
				ScalingPropertiesType scalingPropertiesType = (ScalingPropertiesType)theEObject;
				T result = caseScalingPropertiesType(scalingPropertiesType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypesPackage.VOLUME_HOST_PROPERTIES_TYPE: {
				VolumeHostPropertiesType volumeHostPropertiesType = (VolumeHostPropertiesType)theEObject;
				T result = caseVolumeHostPropertiesType(volumeHostPropertiesType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Cloudify Agent Properties Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Cloudify Agent Properties Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCloudifyAgentPropertiesType(CloudifyAgentPropertiesType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Document Root</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Document Root</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDocumentRoot(DocumentRoot object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Floating IP Properties Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Floating IP Properties Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFloatingIPPropertiesType(FloatingIPPropertiesType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Host Properties Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Host Properties Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHostPropertiesType(HostPropertiesType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Key Pair Properties Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Key Pair Properties Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseKeyPairPropertiesType(KeyPairPropertiesType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Open Stack Floating IP Properties Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Open Stack Floating IP Properties Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOpenStackFloatingIPPropertiesType(OpenStackFloatingIPPropertiesType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Open Stack Server Properties Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Open Stack Server Properties Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOpenStackServerPropertiesType(OpenStackServerPropertiesType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Open Stack Volume Properties Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Open Stack Volume Properties Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOpenStackVolumePropertiesType(OpenStackVolumePropertiesType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Scaling Group Properties Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Scaling Group Properties Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseScalingGroupPropertiesType(ScalingGroupPropertiesType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Scaling Properties Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Scaling Properties Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseScalingPropertiesType(ScalingPropertiesType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Volume Host Properties Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Volume Host Properties Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVolumeHostPropertiesType(VolumeHostPropertiesType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Properties Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Properties Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePropertiesType(PropertiesType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //TypesSwitch
