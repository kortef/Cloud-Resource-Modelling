/**
 */
package de.ugoe.cs.oco.tosca;

import javax.xml.namespace.QName;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.xsd.XSDElementDeclaration;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Properties Definition Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.ugoe.cs.oco.tosca.PropertiesDefinitionType#getElement <em>Element</em>}</li>
 *   <li>{@link de.ugoe.cs.oco.tosca.PropertiesDefinitionType#getType <em>Type</em>}</li>
 *   <li>{@link de.ugoe.cs.oco.tosca.PropertiesDefinitionType#getElementRef <em>Element Ref</em>}</li>
 * </ul>
 *
 * @see de.ugoe.cs.oco.tosca.ToscaPackage#getPropertiesDefinitionType()
 * @model extendedMetaData="name='PropertiesDefinition_._type' kind='empty'"
 * @generated
 */
public interface PropertiesDefinitionType extends EObject {
	/**
	 * Returns the value of the '<em><b>Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Element</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Element</em>' attribute.
	 * @see #setElement(QName)
	 * @see de.ugoe.cs.oco.tosca.ToscaPackage#getPropertiesDefinitionType_Element()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.QName"
	 *        extendedMetaData="kind='attribute' name='element'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://oco.cs.ugoe.de/tosca!PropertiesDefinitionType!element'"
	 * @generated
	 */
	QName getElement();

	/**
	 * Sets the value of the '{@link de.ugoe.cs.oco.tosca.PropertiesDefinitionType#getElement <em>Element</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Element</em>' attribute.
	 * @see #getElement()
	 * @generated
	 */
	void setElement(QName value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see #setType(QName)
	 * @see de.ugoe.cs.oco.tosca.ToscaPackage#getPropertiesDefinitionType_Type()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.QName"
	 *        extendedMetaData="kind='attribute' name='type'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://oco.cs.ugoe.de/tosca!PropertiesDefinitionType!type'"
	 * @generated
	 */
	QName getType();

	/**
	 * Sets the value of the '{@link de.ugoe.cs.oco.tosca.PropertiesDefinitionType#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see #getType()
	 * @generated
	 */
	void setType(QName value);

	/**
	 * Returns the value of the '<em><b>Element Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Element Ref</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Element Ref</em>' reference.
	 * @see #setElementRef(XSDElementDeclaration)
	 * @see de.ugoe.cs.oco.tosca.ToscaPackage#getPropertiesDefinitionType_ElementRef()
	 * @model transient="true" derived="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://oco.cs.ugoe.de/tosca!PropertiesDefinitionType!elementRef'"
	 * @generated
	 */
	XSDElementDeclaration getElementRef();

	/**
	 * Sets the value of the '{@link de.ugoe.cs.oco.tosca.PropertiesDefinitionType#getElementRef <em>Element Ref</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Element Ref</em>' reference.
	 * @see #getElementRef()
	 * @generated
	 */
	void setElementRef(XSDElementDeclaration value);

} // PropertiesDefinitionType
