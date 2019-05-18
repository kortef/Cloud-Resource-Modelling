/**
 */
package de.ugoe.cs.oco.tosca;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>TNode Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.ugoe.cs.oco.tosca.TNodeType#getRequirementDefinitions <em>Requirement Definitions</em>}</li>
 *   <li>{@link de.ugoe.cs.oco.tosca.TNodeType#getCapabilityDefinitions <em>Capability Definitions</em>}</li>
 *   <li>{@link de.ugoe.cs.oco.tosca.TNodeType#getInstanceStates <em>Instance States</em>}</li>
 *   <li>{@link de.ugoe.cs.oco.tosca.TNodeType#getInterfaces <em>Interfaces</em>}</li>
 * </ul>
 *
 * @see de.ugoe.cs.oco.tosca.ToscaPackage#getTNodeType()
 * @model extendedMetaData="name='tNodeType' kind='elementOnly'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore constraints='superTypeMustBeNodeType'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot superTypeMustBeNodeType='if self.derivedFrom &lt;&gt; null then self.derivedFrom.referencedEntityType.oclIsKindOf(TNodeType) else true endif'"
 * @generated
 */
public interface TNodeType extends TEntityType {
	/**
	 * Returns the value of the '<em><b>Requirement Definitions</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Requirement Definitions</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Requirement Definitions</em>' containment reference.
	 * @see #setRequirementDefinitions(RequirementDefinitionsType1)
	 * @see de.ugoe.cs.oco.tosca.ToscaPackage#getTNodeType_RequirementDefinitions()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='RequirementDefinitions' namespace='##targetNamespace'"
	 * @generated
	 */
	RequirementDefinitionsType1 getRequirementDefinitions();

	/**
	 * Sets the value of the '{@link de.ugoe.cs.oco.tosca.TNodeType#getRequirementDefinitions <em>Requirement Definitions</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Requirement Definitions</em>' containment reference.
	 * @see #getRequirementDefinitions()
	 * @generated
	 */
	void setRequirementDefinitions(RequirementDefinitionsType1 value);

	/**
	 * Returns the value of the '<em><b>Capability Definitions</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Capability Definitions</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Capability Definitions</em>' containment reference.
	 * @see #setCapabilityDefinitions(CapabilityDefinitionsType1)
	 * @see de.ugoe.cs.oco.tosca.ToscaPackage#getTNodeType_CapabilityDefinitions()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='CapabilityDefinitions' namespace='##targetNamespace'"
	 * @generated
	 */
	CapabilityDefinitionsType1 getCapabilityDefinitions();

	/**
	 * Sets the value of the '{@link de.ugoe.cs.oco.tosca.TNodeType#getCapabilityDefinitions <em>Capability Definitions</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Capability Definitions</em>' containment reference.
	 * @see #getCapabilityDefinitions()
	 * @generated
	 */
	void setCapabilityDefinitions(CapabilityDefinitionsType1 value);

	/**
	 * Returns the value of the '<em><b>Instance States</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Instance States</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Instance States</em>' containment reference.
	 * @see #setInstanceStates(TTopologyElementInstanceStates)
	 * @see de.ugoe.cs.oco.tosca.ToscaPackage#getTNodeType_InstanceStates()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='InstanceStates' namespace='##targetNamespace'"
	 * @generated
	 */
	TTopologyElementInstanceStates getInstanceStates();

	/**
	 * Sets the value of the '{@link de.ugoe.cs.oco.tosca.TNodeType#getInstanceStates <em>Instance States</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Instance States</em>' containment reference.
	 * @see #getInstanceStates()
	 * @generated
	 */
	void setInstanceStates(TTopologyElementInstanceStates value);

	/**
	 * Returns the value of the '<em><b>Interfaces</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Interfaces</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Interfaces</em>' containment reference.
	 * @see #setInterfaces(InterfacesType)
	 * @see de.ugoe.cs.oco.tosca.ToscaPackage#getTNodeType_Interfaces()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Interfaces' namespace='##targetNamespace'"
	 * @generated
	 */
	InterfacesType getInterfaces();

	/**
	 * Sets the value of the '{@link de.ugoe.cs.oco.tosca.TNodeType#getInterfaces <em>Interfaces</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Interfaces</em>' containment reference.
	 * @see #getInterfaces()
	 * @generated
	 */
	void setInterfaces(InterfacesType value);

} // TNodeType
