/**
 */
package de.ugoe.cs.oco.tosca;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Requirements Type2</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.ugoe.cs.oco.tosca.RequirementsType2#getRequirement <em>Requirement</em>}</li>
 * </ul>
 *
 * @see de.ugoe.cs.oco.tosca.ToscaPackage#getRequirementsType2()
 * @model extendedMetaData="name='Requirements_._2_._type' kind='elementOnly'"
 * @generated
 */
public interface RequirementsType2 extends EObject {
	/**
	 * Returns the value of the '<em><b>Requirement</b></em>' containment reference list.
	 * The list contents are of type {@link de.ugoe.cs.oco.tosca.TRequirementRef}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Requirement</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Requirement</em>' containment reference list.
	 * @see de.ugoe.cs.oco.tosca.ToscaPackage#getRequirementsType2_Requirement()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Requirement' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<TRequirementRef> getRequirement();

} // RequirementsType2
