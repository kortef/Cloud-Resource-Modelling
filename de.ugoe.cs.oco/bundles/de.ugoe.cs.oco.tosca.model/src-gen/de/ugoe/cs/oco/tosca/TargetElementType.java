/**
 */
package de.ugoe.cs.oco.tosca;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Target Element Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.ugoe.cs.oco.tosca.TargetElementType#getRef <em>Ref</em>}</li>
 * </ul>
 *
 * @see de.ugoe.cs.oco.tosca.ToscaPackage#getTargetElementType()
 * @model extendedMetaData="name='TargetElement_._type' kind='empty'"
 * @generated
 */
public interface TargetElementType extends EObject {
	/**
	 * Returns the value of the '<em><b>Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ref</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ref</em>' reference.
	 * @see #setRef(TCapability)
	 * @see de.ugoe.cs.oco.tosca.ToscaPackage#getTargetElementType_Ref()
	 * @model resolveProxies="false" required="true"
	 *        extendedMetaData="kind='attribute' name='ref'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://oco.cs.ugoe.de/tosca!TargetElementType!ref'"
	 * @generated
	 */
	TCapability getRef();

	/**
	 * Sets the value of the '{@link de.ugoe.cs.oco.tosca.TargetElementType#getRef <em>Ref</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ref</em>' reference.
	 * @see #getRef()
	 * @generated
	 */
	void setRef(TCapability value);

} // TargetElementType
