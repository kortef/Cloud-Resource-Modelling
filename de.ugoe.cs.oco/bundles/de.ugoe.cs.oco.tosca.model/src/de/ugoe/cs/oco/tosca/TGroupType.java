/**
 */
package de.ugoe.cs.oco.tosca;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>TGroup Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.ugoe.cs.oco.tosca.TGroupType#getRequirementDefinitions <em>Requirement Definitions</em>}</li>
 *   <li>{@link de.ugoe.cs.oco.tosca.TGroupType#getCapabilityDefinitions <em>Capability Definitions</em>}</li>
 * </ul>
 *
 * @see de.ugoe.cs.oco.tosca.ToscaPackage#getTGroupType()
 * @model
 * @generated
 */
public interface TGroupType extends TEntityType {

	/**
	 * Returns the value of the '<em><b>Requirement Definitions</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Requirement Definitions</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Requirement Definitions</em>' reference.
	 * @see #setRequirementDefinitions(RequirementDefinitionsType)
	 * @see de.ugoe.cs.oco.tosca.ToscaPackage#getTGroupType_RequirementDefinitions()
	 * @model
	 * @generated
	 */
	RequirementDefinitionsType getRequirementDefinitions();

	/**
	 * Sets the value of the '{@link de.ugoe.cs.oco.tosca.TGroupType#getRequirementDefinitions <em>Requirement Definitions</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Requirement Definitions</em>' reference.
	 * @see #getRequirementDefinitions()
	 * @generated
	 */
	void setRequirementDefinitions(RequirementDefinitionsType value);

	/**
	 * Returns the value of the '<em><b>Capability Definitions</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Capability Definitions</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Capability Definitions</em>' reference.
	 * @see #setCapabilityDefinitions(CapabilityDefinitionsType)
	 * @see de.ugoe.cs.oco.tosca.ToscaPackage#getTGroupType_CapabilityDefinitions()
	 * @model
	 * @generated
	 */
	CapabilityDefinitionsType getCapabilityDefinitions();

	/**
	 * Sets the value of the '{@link de.ugoe.cs.oco.tosca.TGroupType#getCapabilityDefinitions <em>Capability Definitions</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Capability Definitions</em>' reference.
	 * @see #getCapabilityDefinitions()
	 * @generated
	 */
	void setCapabilityDefinitions(CapabilityDefinitionsType value);
} // TGroupType
