/**
 */
package de.ugoe.cs.oco.tosca;

import javax.xml.namespace.QName;
import org.eclipse.emf.common.util.EList;


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
 *   <li>{@link de.ugoe.cs.oco.tosca.TGroupType#getInstanceStates <em>Instance States</em>}</li>
 *   <li>{@link de.ugoe.cs.oco.tosca.TGroupType#getInterfaces <em>Interfaces</em>}</li>
 *   <li>{@link de.ugoe.cs.oco.tosca.TGroupType#getMember <em>Member</em>}</li>
 *   <li>{@link de.ugoe.cs.oco.tosca.TGroupType#getMemberRefs <em>Member Refs</em>}</li>
 * </ul>
 *
 * @see de.ugoe.cs.oco.tosca.ToscaPackage#getTGroupType()
 * @model extendedMetaData="name='tGroupType' kind='elementOnly'"
 * @generated
 */
public interface TGroupType extends TEntityType {
	/**
	 * Returns the value of the '<em><b>Requirement Definitions</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Requirement Definitions</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Requirement Definitions</em>' containment reference.
	 * @see #setRequirementDefinitions(RequirementDefinitionsType)
	 * @see de.ugoe.cs.oco.tosca.ToscaPackage#getTGroupType_RequirementDefinitions()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='RequirementDefinitions' namespace='##targetNamespace'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://oco.cs.ugoe.de/tosca!TGroupType!requirementDefinitions'"
	 * @generated
	 */
	RequirementDefinitionsType getRequirementDefinitions();

	/**
	 * Sets the value of the '{@link de.ugoe.cs.oco.tosca.TGroupType#getRequirementDefinitions <em>Requirement Definitions</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Requirement Definitions</em>' containment reference.
	 * @see #getRequirementDefinitions()
	 * @generated
	 */
	void setRequirementDefinitions(RequirementDefinitionsType value);

	/**
	 * Returns the value of the '<em><b>Capability Definitions</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Capability Definitions</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Capability Definitions</em>' containment reference.
	 * @see #setCapabilityDefinitions(CapabilityDefinitionsType)
	 * @see de.ugoe.cs.oco.tosca.ToscaPackage#getTGroupType_CapabilityDefinitions()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='CapabilityDefinitions' namespace='##targetNamespace'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://oco.cs.ugoe.de/tosca!TGroupType!capabilityDefinitions'"
	 * @generated
	 */
	CapabilityDefinitionsType getCapabilityDefinitions();

	/**
	 * Sets the value of the '{@link de.ugoe.cs.oco.tosca.TGroupType#getCapabilityDefinitions <em>Capability Definitions</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Capability Definitions</em>' containment reference.
	 * @see #getCapabilityDefinitions()
	 * @generated
	 */
	void setCapabilityDefinitions(CapabilityDefinitionsType value);

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
	 * @see de.ugoe.cs.oco.tosca.ToscaPackage#getTGroupType_InstanceStates()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='InstanceStates' namespace='##targetNamespace'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://oco.cs.ugoe.de/tosca!TGroupType!instanceStates'"
	 * @generated
	 */
	TTopologyElementInstanceStates getInstanceStates();

	/**
	 * Sets the value of the '{@link de.ugoe.cs.oco.tosca.TGroupType#getInstanceStates <em>Instance States</em>}' containment reference.
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
	 * @see #setInterfaces(InterfacesType1)
	 * @see de.ugoe.cs.oco.tosca.ToscaPackage#getTGroupType_Interfaces()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Interfaces' namespace='##targetNamespace'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://oco.cs.ugoe.de/tosca!TGroupType!interfaces'"
	 * @generated
	 */
	InterfacesType1 getInterfaces();

	/**
	 * Sets the value of the '{@link de.ugoe.cs.oco.tosca.TGroupType#getInterfaces <em>Interfaces</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Interfaces</em>' containment reference.
	 * @see #getInterfaces()
	 * @generated
	 */
	void setInterfaces(InterfacesType1 value);

	/**
	 * Returns the value of the '<em><b>Member</b></em>' attribute list.
	 * The list contents are of type {@link javax.xml.namespace.QName}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Member</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Member</em>' attribute list.
	 * @see de.ugoe.cs.oco.tosca.ToscaPackage#getTGroupType_Member()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.QName"
	 *        extendedMetaData="kind='element' name='Member' namespace='##targetNamespace'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://oco.cs.ugoe.de/tosca!TGroupType!member'"
	 * @generated
	 */
	EList<QName> getMember();

	/**
	 * Returns the value of the '<em><b>Member Refs</b></em>' reference list.
	 * The list contents are of type {@link de.ugoe.cs.oco.tosca.TEntityType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Member Refs</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Member Refs</em>' reference list.
	 * @see de.ugoe.cs.oco.tosca.ToscaPackage#getTGroupType_MemberRefs()
	 * @model transient="true" derived="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://oco.cs.ugoe.de/tosca!TGroupType!memberRefs'"
	 * @generated
	 */
	EList<TEntityType> getMemberRefs();

} // TGroupType
