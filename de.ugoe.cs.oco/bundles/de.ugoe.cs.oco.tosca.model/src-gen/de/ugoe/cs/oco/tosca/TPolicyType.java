/**
 */
package de.ugoe.cs.oco.tosca;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>TPolicy Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.ugoe.cs.oco.tosca.TPolicyType#getAppliesTo <em>Applies To</em>}</li>
 *   <li>{@link de.ugoe.cs.oco.tosca.TPolicyType#getPolicyLanguage <em>Policy Language</em>}</li>
 * </ul>
 *
 * @see de.ugoe.cs.oco.tosca.ToscaPackage#getTPolicyType()
 * @model extendedMetaData="name='tPolicyType' kind='elementOnly'"
 * @generated
 */
public interface TPolicyType extends TEntityType {
	/**
	 * Returns the value of the '<em><b>Applies To</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Applies To</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Applies To</em>' containment reference.
	 * @see #setAppliesTo(TAppliesTo)
	 * @see de.ugoe.cs.oco.tosca.ToscaPackage#getTPolicyType_AppliesTo()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='AppliesTo' namespace='##targetNamespace'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://oco.cs.ugoe.de/tosca!TPolicyType!appliesTo'"
	 * @generated
	 */
	TAppliesTo getAppliesTo();

	/**
	 * Sets the value of the '{@link de.ugoe.cs.oco.tosca.TPolicyType#getAppliesTo <em>Applies To</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Applies To</em>' containment reference.
	 * @see #getAppliesTo()
	 * @generated
	 */
	void setAppliesTo(TAppliesTo value);

	/**
	 * Returns the value of the '<em><b>Policy Language</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Policy Language</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Policy Language</em>' attribute.
	 * @see #setPolicyLanguage(String)
	 * @see de.ugoe.cs.oco.tosca.ToscaPackage#getTPolicyType_PolicyLanguage()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnyURI"
	 *        extendedMetaData="kind='attribute' name='policyLanguage'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://oco.cs.ugoe.de/tosca!TPolicyType!policyLanguage'"
	 * @generated
	 */
	String getPolicyLanguage();

	/**
	 * Sets the value of the '{@link de.ugoe.cs.oco.tosca.TPolicyType#getPolicyLanguage <em>Policy Language</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Policy Language</em>' attribute.
	 * @see #getPolicyLanguage()
	 * @generated
	 */
	void setPolicyLanguage(String value);

} // TPolicyType
