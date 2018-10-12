/**
 */
package de.ugoe.cs.oco.tosca;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Relationship Constraints Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.ugoe.cs.oco.tosca.RelationshipConstraintsType#getRelationshipConstraint <em>Relationship Constraint</em>}</li>
 * </ul>
 *
 * @see de.ugoe.cs.oco.tosca.ToscaPackage#getRelationshipConstraintsType()
 * @model extendedMetaData="name='RelationshipConstraints_._type' kind='elementOnly'"
 * @generated
 */
public interface RelationshipConstraintsType extends EObject {
	/**
	 * Returns the value of the '<em><b>Relationship Constraint</b></em>' containment reference list.
	 * The list contents are of type {@link de.ugoe.cs.oco.tosca.RelationshipConstraintType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Relationship Constraint</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Relationship Constraint</em>' containment reference list.
	 * @see de.ugoe.cs.oco.tosca.ToscaPackage#getRelationshipConstraintsType_RelationshipConstraint()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='RelationshipConstraint' namespace='##targetNamespace'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://oco.cs.ugoe.de/tosca!RelationshipConstraintsType!relationshipConstraint'"
	 * @generated
	 */
	EList<RelationshipConstraintType> getRelationshipConstraint();

} // RelationshipConstraintsType
