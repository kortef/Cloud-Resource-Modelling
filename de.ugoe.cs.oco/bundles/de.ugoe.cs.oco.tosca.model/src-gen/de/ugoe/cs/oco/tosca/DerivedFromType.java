/**
 */
package de.ugoe.cs.oco.tosca;

import javax.xml.namespace.QName;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Derived From Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.ugoe.cs.oco.tosca.DerivedFromType#getNodeTypeImplementationRef <em>Node Type Implementation Ref</em>}</li>
 * </ul>
 *
 * @see de.ugoe.cs.oco.tosca.ToscaPackage#getDerivedFromType()
 * @model extendedMetaData="name='DerivedFrom_._type' kind='empty'"
 * @generated
 */
public interface DerivedFromType extends EObject {
	/**
	 * Returns the value of the '<em><b>Node Type Implementation Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Node Type Implementation Ref</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Node Type Implementation Ref</em>' attribute.
	 * @see #setNodeTypeImplementationRef(QName)
	 * @see de.ugoe.cs.oco.tosca.ToscaPackage#getDerivedFromType_NodeTypeImplementationRef()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.QName" required="true"
	 *        extendedMetaData="kind='attribute' name='nodeTypeImplementationRef'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://oco.cs.ugoe.de/tosca!DerivedFromType!nodeTypeImplementationRef'"
	 * @generated
	 */
	QName getNodeTypeImplementationRef();

	/**
	 * Sets the value of the '{@link de.ugoe.cs.oco.tosca.DerivedFromType#getNodeTypeImplementationRef <em>Node Type Implementation Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Node Type Implementation Ref</em>' attribute.
	 * @see #getNodeTypeImplementationRef()
	 * @generated
	 */
	void setNodeTypeImplementationRef(QName value);

} // DerivedFromType
