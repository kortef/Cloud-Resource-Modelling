/**
 */
package de.ugoe.cs.oco.tosca;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Requirement Definitions Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.ugoe.cs.oco.tosca.RequirementDefinitionsType#getRequirementDefinition <em>Requirement Definition</em>}</li>
 * </ul>
 *
 * @see de.ugoe.cs.oco.tosca.ToscaPackage#getRequirementDefinitionsType()
 * @model extendedMetaData="name='RequirementDefinitions_._type' kind='elementOnly'"
 * @generated
 */
public interface RequirementDefinitionsType extends EObject {
	/**
	 * Returns the value of the '<em><b>Requirement Definition</b></em>' containment reference list.
	 * The list contents are of type {@link de.ugoe.cs.oco.tosca.TRequirementDefinition}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Requirement Definition</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Requirement Definition</em>' containment reference list.
	 * @see de.ugoe.cs.oco.tosca.ToscaPackage#getRequirementDefinitionsType_RequirementDefinition()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='RequirementDefinition' namespace='##targetNamespace'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://oco.cs.ugoe.de/tosca!RequirementDefinitionsType!requirementDefinition'"
	 * @generated
	 */
	EList<TRequirementDefinition> getRequirementDefinition();

} // RequirementDefinitionsType
