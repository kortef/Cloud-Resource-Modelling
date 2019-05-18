/**
 */
package de.ugoe.cs.as.tosca;

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
 *   <li>{@link de.ugoe.cs.as.tosca.DerivedFromType2#getTypeRef <em>Type Ref</em>}</li>
 *   <li>{@link de.ugoe.cs.as.tosca.DerivedFromType2#getReferencedEntityType <em>Referenced Entity Type</em>}</li>
 * </ul>
 *
 * @see de.ugoe.cs.as.tosca.ToscaPackage#getDerivedFromType2()
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
	 * @see de.ugoe.cs.as.tosca.ToscaPackage#getDerivedFromType2_TypeRef()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.QName" required="true"
	 *        extendedMetaData="kind='attribute' name='typeRef'"
	 * @generated
	 */
	QName getTypeRef();

	/**
	 * Sets the value of the '{@link de.ugoe.cs.as.tosca.DerivedFromType2#getTypeRef <em>Type Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type Ref</em>' attribute.
	 * @see #getTypeRef()
	 * @generated
	 */
	void setTypeRef(QName value);

	/**
	 * Returns the value of the '<em><b>Referenced Entity Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Referenced Entity Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Referenced Entity Type</em>' reference.
	 * @see #setReferencedEntityType(TEntityType)
	 * @see de.ugoe.cs.as.tosca.ToscaPackage#getDerivedFromType2_ReferencedEntityType()
	 * @model transient="true" derived="true"
	 * @generated
	 */
	TEntityType getReferencedEntityType();

	/**
	 * Sets the value of the '{@link de.ugoe.cs.as.tosca.DerivedFromType2#getReferencedEntityType <em>Referenced Entity Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Referenced Entity Type</em>' reference.
	 * @see #getReferencedEntityType()
	 * @generated
	 */
	void setReferencedEntityType(TEntityType value);

} // DerivedFromType2
