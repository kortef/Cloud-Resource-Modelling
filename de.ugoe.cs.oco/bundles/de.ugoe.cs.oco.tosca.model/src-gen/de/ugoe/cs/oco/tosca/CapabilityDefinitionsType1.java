/**
 */
package de.ugoe.cs.oco.tosca;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Capability Definitions Type1</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.ugoe.cs.oco.tosca.CapabilityDefinitionsType1#getCapabilityDefinition <em>Capability Definition</em>}</li>
 * </ul>
 *
 * @see de.ugoe.cs.oco.tosca.ToscaPackage#getCapabilityDefinitionsType1()
 * @model extendedMetaData="name='CapabilityDefinitions_._1_._type' kind='elementOnly'"
 * @generated
 */
public interface CapabilityDefinitionsType1 extends EObject {
	/**
	 * Returns the value of the '<em><b>Capability Definition</b></em>' containment reference list.
	 * The list contents are of type {@link de.ugoe.cs.oco.tosca.TCapabilityDefinition}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Capability Definition</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Capability Definition</em>' containment reference list.
	 * @see de.ugoe.cs.oco.tosca.ToscaPackage#getCapabilityDefinitionsType1_CapabilityDefinition()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='CapabilityDefinition' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<TCapabilityDefinition> getCapabilityDefinition();

} // CapabilityDefinitionsType1
