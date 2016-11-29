/**
 */
package de.ugoe.cs.oco.tosca;

import javax.xml.namespace.QName;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Derived From Type2</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.ugoe.cs.oco.tosca.DerivedFromType2#getTypeRef <em>Type Ref</em>}</li>
 * </ul>
 *
 * @see de.ugoe.cs.oco.tosca.ToscaPackage#getDerivedFromType2()
 * @model extendedMetaData="name='DerivedFrom_._2_._type' kind='empty'"
 * @generated
 */
public interface DerivedFromType2 extends EObject {
	/**
	 * Returns the value of the '<em><b>Type Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type Ref</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type Ref</em>' attribute.
	 * @see #setTypeRef(QName)
	 * @see de.ugoe.cs.oco.tosca.ToscaPackage#getDerivedFromType2_TypeRef()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.QName" required="true"
	 *        extendedMetaData="kind='attribute' name='typeRef'"
	 * @generated
	 */
	QName getTypeRef();

	/**
	 * Sets the value of the '{@link de.ugoe.cs.oco.tosca.DerivedFromType2#getTypeRef <em>Type Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type Ref</em>' attribute.
	 * @see #getTypeRef()
	 * @generated
	 */
	void setTypeRef(QName value);

} // DerivedFromType2
