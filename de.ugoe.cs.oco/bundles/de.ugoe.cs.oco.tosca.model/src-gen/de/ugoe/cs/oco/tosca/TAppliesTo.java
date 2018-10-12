/**
 */
package de.ugoe.cs.oco.tosca;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>TApplies To</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.ugoe.cs.oco.tosca.TAppliesTo#getNodeTypeReference <em>Node Type Reference</em>}</li>
 * </ul>
 *
 * @see de.ugoe.cs.oco.tosca.ToscaPackage#getTAppliesTo()
 * @model extendedMetaData="name='tAppliesTo' kind='elementOnly'"
 * @generated
 */
public interface TAppliesTo extends EObject {
	/**
	 * Returns the value of the '<em><b>Node Type Reference</b></em>' containment reference list.
	 * The list contents are of type {@link de.ugoe.cs.oco.tosca.NodeTypeReferenceType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Node Type Reference</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Node Type Reference</em>' containment reference list.
	 * @see de.ugoe.cs.oco.tosca.ToscaPackage#getTAppliesTo_NodeTypeReference()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='NodeTypeReference' namespace='##targetNamespace'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://oco.cs.ugoe.de/tosca!TAppliesTo!nodeTypeReference'"
	 * @generated
	 */
	EList<NodeTypeReferenceType> getNodeTypeReference();

} // TAppliesTo
