/**
 */
package de.ugoe.cs.oco.tosca;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>TProperty Mapping</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.ugoe.cs.oco.tosca.TPropertyMapping#getTargetObjectRef <em>Target Object Ref</em>}</li>
 *   <li>{@link de.ugoe.cs.oco.tosca.TPropertyMapping#getServiceTemplatePropertyRef <em>Service Template Property Ref</em>}</li>
 *   <li>{@link de.ugoe.cs.oco.tosca.TPropertyMapping#getTargetPropertyRef <em>Target Property Ref</em>}</li>
 * </ul>
 *
 * @see de.ugoe.cs.oco.tosca.ToscaPackage#getTPropertyMapping()
 * @model extendedMetaData="name='tPropertyMapping' kind='empty'"
 * @generated
 */
public interface TPropertyMapping extends EObject {
	/**
	 * Returns the value of the '<em><b>Service Template Property Ref</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Service Template Property Ref</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Service Template Property Ref</em>' attribute.
	 * @see #setServiceTemplatePropertyRef(String)
	 * @see de.ugoe.cs.oco.tosca.ToscaPackage#getTPropertyMapping_ServiceTemplatePropertyRef()
	 * @model default="" required="true"
	 *        extendedMetaData="kind='attribute' name='serviceTemplatePropertyRef'"
	 * @generated
	 */
	String getServiceTemplatePropertyRef();

	/**
	 * Sets the value of the '{@link de.ugoe.cs.oco.tosca.TPropertyMapping#getServiceTemplatePropertyRef <em>Service Template Property Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Service Template Property Ref</em>' attribute.
	 * @see #getServiceTemplatePropertyRef()
	 * @generated
	 */
	void setServiceTemplatePropertyRef(String value);

	/**
	 * Returns the value of the '<em><b>Target Object Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target Object Ref</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target Object Ref</em>' reference.
	 * @see #setTargetObjectRef(TEntityTemplate)
	 * @see de.ugoe.cs.oco.tosca.ToscaPackage#getTPropertyMapping_TargetObjectRef()
	 * @model required="true"
	 *        extendedMetaData="kind='attribute' name='targetObjectRef'"
	 * @generated
	 */
	TEntityTemplate getTargetObjectRef();

	/**
	 * Sets the value of the '{@link de.ugoe.cs.oco.tosca.TPropertyMapping#getTargetObjectRef <em>Target Object Ref</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target Object Ref</em>' reference.
	 * @see #getTargetObjectRef()
	 * @generated
	 */
	void setTargetObjectRef(TEntityTemplate value);

	/**
	 * Returns the value of the '<em><b>Target Property Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target Property Ref</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target Property Ref</em>' attribute.
	 * @see #setTargetPropertyRef(String)
	 * @see de.ugoe.cs.oco.tosca.ToscaPackage#getTPropertyMapping_TargetPropertyRef()
	 * @model required="true"
	 *        extendedMetaData="kind='attribute' name='targetPropertyRef'"
	 * @generated
	 */
	String getTargetPropertyRef();

	/**
	 * Sets the value of the '{@link de.ugoe.cs.oco.tosca.TPropertyMapping#getTargetPropertyRef <em>Target Property Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target Property Ref</em>' attribute.
	 * @see #getTargetPropertyRef()
	 * @generated
	 */
	void setTargetPropertyRef(String value);

} // TPropertyMapping
