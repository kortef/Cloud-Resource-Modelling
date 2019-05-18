/**
 */
package de.ugoe.cs.as.tosca;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Property Constraints Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.ugoe.cs.as.tosca.PropertyConstraintsType#getPropertyConstraint <em>Property Constraint</em>}</li>
 * </ul>
 *
 * @see de.ugoe.cs.as.tosca.ToscaPackage#getPropertyConstraintsType()
 * @model extendedMetaData="name='PropertyConstraints_._type' kind='elementOnly'"
 * @generated
 */
public interface PropertyConstraintsType extends EObject {
	/**
	 * Returns the value of the '<em><b>Property Constraint</b></em>' containment reference list.
	 * The list contents are of type {@link de.ugoe.cs.as.tosca.TPropertyConstraint}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Property Constraint</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Property Constraint</em>' containment reference list.
	 * @see de.ugoe.cs.as.tosca.ToscaPackage#getPropertyConstraintsType_PropertyConstraint()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='PropertyConstraint' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<TPropertyConstraint> getPropertyConstraint();

} // PropertyConstraintsType