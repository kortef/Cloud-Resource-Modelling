/**
 */
package de.ugoe.cs.oco.tosca;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>TRelationship Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.ugoe.cs.oco.tosca.TRelationshipType#getInstanceStates <em>Instance States</em>}</li>
 *   <li>{@link de.ugoe.cs.oco.tosca.TRelationshipType#getSourceInterfaces <em>Source Interfaces</em>}</li>
 *   <li>{@link de.ugoe.cs.oco.tosca.TRelationshipType#getTargetInterfaces <em>Target Interfaces</em>}</li>
 *   <li>{@link de.ugoe.cs.oco.tosca.TRelationshipType#getValidSource <em>Valid Source</em>}</li>
 *   <li>{@link de.ugoe.cs.oco.tosca.TRelationshipType#getValidTarget <em>Valid Target</em>}</li>
 * </ul>
 *
 * @see de.ugoe.cs.oco.tosca.ToscaPackage#getTRelationshipType()
 * @model extendedMetaData="name='tRelationshipType' kind='elementOnly'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore constraints='superTypeMustBeRelationshipType'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot superTypeMustBeRelationshipType='if self.derivedFrom &lt;&gt; null then self.derivedFrom.referencedEntityType.oclIsKindOf(TRelationshipType) else true endif'"
 * @generated
 */
public interface TRelationshipType extends TEntityType {
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
	 * @see de.ugoe.cs.oco.tosca.ToscaPackage#getTRelationshipType_InstanceStates()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='InstanceStates' namespace='##targetNamespace'"
	 * @generated
	 */
	TTopologyElementInstanceStates getInstanceStates();

	/**
	 * Sets the value of the '{@link de.ugoe.cs.oco.tosca.TRelationshipType#getInstanceStates <em>Instance States</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Instance States</em>' containment reference.
	 * @see #getInstanceStates()
	 * @generated
	 */
	void setInstanceStates(TTopologyElementInstanceStates value);

	/**
	 * Returns the value of the '<em><b>Source Interfaces</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source Interfaces</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source Interfaces</em>' containment reference.
	 * @see #setSourceInterfaces(SourceInterfacesType)
	 * @see de.ugoe.cs.oco.tosca.ToscaPackage#getTRelationshipType_SourceInterfaces()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='SourceInterfaces' namespace='##targetNamespace'"
	 * @generated
	 */
	SourceInterfacesType getSourceInterfaces();

	/**
	 * Sets the value of the '{@link de.ugoe.cs.oco.tosca.TRelationshipType#getSourceInterfaces <em>Source Interfaces</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source Interfaces</em>' containment reference.
	 * @see #getSourceInterfaces()
	 * @generated
	 */
	void setSourceInterfaces(SourceInterfacesType value);

	/**
	 * Returns the value of the '<em><b>Target Interfaces</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target Interfaces</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target Interfaces</em>' containment reference.
	 * @see #setTargetInterfaces(TargetInterfacesType)
	 * @see de.ugoe.cs.oco.tosca.ToscaPackage#getTRelationshipType_TargetInterfaces()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='TargetInterfaces' namespace='##targetNamespace'"
	 * @generated
	 */
	TargetInterfacesType getTargetInterfaces();

	/**
	 * Sets the value of the '{@link de.ugoe.cs.oco.tosca.TRelationshipType#getTargetInterfaces <em>Target Interfaces</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target Interfaces</em>' containment reference.
	 * @see #getTargetInterfaces()
	 * @generated
	 */
	void setTargetInterfaces(TargetInterfacesType value);

	/**
	 * Returns the value of the '<em><b>Valid Source</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Valid Source</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Valid Source</em>' containment reference.
	 * @see #setValidSource(ValidSourceType)
	 * @see de.ugoe.cs.oco.tosca.ToscaPackage#getTRelationshipType_ValidSource()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ValidSource' namespace='##targetNamespace'"
	 * @generated
	 */
	ValidSourceType getValidSource();

	/**
	 * Sets the value of the '{@link de.ugoe.cs.oco.tosca.TRelationshipType#getValidSource <em>Valid Source</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Valid Source</em>' containment reference.
	 * @see #getValidSource()
	 * @generated
	 */
	void setValidSource(ValidSourceType value);

	/**
	 * Returns the value of the '<em><b>Valid Target</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Valid Target</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Valid Target</em>' containment reference.
	 * @see #setValidTarget(ValidTargetType)
	 * @see de.ugoe.cs.oco.tosca.ToscaPackage#getTRelationshipType_ValidTarget()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ValidTarget' namespace='##targetNamespace'"
	 * @generated
	 */
	ValidTargetType getValidTarget();

	/**
	 * Sets the value of the '{@link de.ugoe.cs.oco.tosca.TRelationshipType#getValidTarget <em>Valid Target</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Valid Target</em>' containment reference.
	 * @see #getValidTarget()
	 * @generated
	 */
	void setValidTarget(ValidTargetType value);

} // TRelationshipType
