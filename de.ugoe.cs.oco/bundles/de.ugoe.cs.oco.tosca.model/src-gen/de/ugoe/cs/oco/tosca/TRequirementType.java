/**
 */
package de.ugoe.cs.oco.tosca;

import javax.xml.namespace.QName;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>TRequirement Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.ugoe.cs.oco.tosca.TRequirementType#getRequiredCapabilityType <em>Required Capability Type</em>}</li>
 *   <li>{@link de.ugoe.cs.oco.tosca.TRequirementType#getRequiredCapabilityTypeRef <em>Required Capability Type Ref</em>}</li>
 * </ul>
 *
 * @see de.ugoe.cs.oco.tosca.ToscaPackage#getTRequirementType()
 * @model extendedMetaData="name='tRequirementType' kind='elementOnly'"
 * @generated
 */
public interface TRequirementType extends TEntityType {
	/**
	 * Returns the value of the '<em><b>Required Capability Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Required Capability Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Required Capability Type</em>' attribute.
	 * @see #setRequiredCapabilityType(QName)
	 * @see de.ugoe.cs.oco.tosca.ToscaPackage#getTRequirementType_RequiredCapabilityType()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.QName"
	 *        extendedMetaData="kind='attribute' name='requiredCapabilityType'"
	 * @generated
	 */
	QName getRequiredCapabilityType();

	/**
	 * Sets the value of the '{@link de.ugoe.cs.oco.tosca.TRequirementType#getRequiredCapabilityType <em>Required Capability Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Required Capability Type</em>' attribute.
	 * @see #getRequiredCapabilityType()
	 * @generated
	 */
	void setRequiredCapabilityType(QName value);

	/**
	 * Returns the value of the '<em><b>Required Capability Type Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Required Capability Type Ref</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Required Capability Type Ref</em>' reference.
	 * @see #setRequiredCapabilityTypeRef(TCapabilityType)
	 * @see de.ugoe.cs.oco.tosca.ToscaPackage#getTRequirementType_RequiredCapabilityTypeRef()
	 * @model transient="true" derived="true"
	 * @generated
	 */
	TCapabilityType getRequiredCapabilityTypeRef();

	/**
	 * Sets the value of the '{@link de.ugoe.cs.oco.tosca.TRequirementType#getRequiredCapabilityTypeRef <em>Required Capability Type Ref</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Required Capability Type Ref</em>' reference.
	 * @see #getRequiredCapabilityTypeRef()
	 * @generated
	 */
	void setRequiredCapabilityTypeRef(TCapabilityType value);

} // TRequirementType
