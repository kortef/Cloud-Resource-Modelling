/**
 */
package de.ugoe.cs.oco.tosca;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Input Parameters Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.ugoe.cs.oco.tosca.InputParametersType#getInputParameter <em>Input Parameter</em>}</li>
 * </ul>
 *
 * @see de.ugoe.cs.oco.tosca.ToscaPackage#getInputParametersType()
 * @model extendedMetaData="name='InputParameters_._type' kind='elementOnly'"
 * @generated
 */
public interface InputParametersType extends EObject {
	/**
	 * Returns the value of the '<em><b>Input Parameter</b></em>' containment reference list.
	 * The list contents are of type {@link de.ugoe.cs.oco.tosca.TParameter}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Input Parameter</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Input Parameter</em>' containment reference list.
	 * @see de.ugoe.cs.oco.tosca.ToscaPackage#getInputParametersType_InputParameter()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='InputParameter' namespace='##targetNamespace'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://oco.cs.ugoe.de/tosca!InputParametersType!inputParameter'"
	 * @generated
	 */
	EList<TParameter> getInputParameter();

} // InputParametersType
