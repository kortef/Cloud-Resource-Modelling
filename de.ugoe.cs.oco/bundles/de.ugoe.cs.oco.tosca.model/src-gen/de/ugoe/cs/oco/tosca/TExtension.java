/**
 */
package de.ugoe.cs.oco.tosca;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>TExtension</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.ugoe.cs.oco.tosca.TExtension#getMustUnderstand <em>Must Understand</em>}</li>
 *   <li>{@link de.ugoe.cs.oco.tosca.TExtension#getNamespace <em>Namespace</em>}</li>
 * </ul>
 *
 * @see de.ugoe.cs.oco.tosca.ToscaPackage#getTExtension()
 * @model extendedMetaData="name='tExtension' kind='elementOnly'"
 * @generated
 */
public interface TExtension extends TExtensibleElements {
	/**
	 * Returns the value of the '<em><b>Must Understand</b></em>' attribute.
	 * The default value is <code>"yes"</code>.
	 * The literals are from the enumeration {@link de.ugoe.cs.oco.tosca.TBoolean}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Must Understand</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Must Understand</em>' attribute.
	 * @see de.ugoe.cs.oco.tosca.TBoolean
	 * @see #isSetMustUnderstand()
	 * @see #unsetMustUnderstand()
	 * @see #setMustUnderstand(TBoolean)
	 * @see de.ugoe.cs.oco.tosca.ToscaPackage#getTExtension_MustUnderstand()
	 * @model default="yes" unsettable="true"
	 *        extendedMetaData="kind='attribute' name='mustUnderstand'"
	 * @generated
	 */
	TBoolean getMustUnderstand();

	/**
	 * Sets the value of the '{@link de.ugoe.cs.oco.tosca.TExtension#getMustUnderstand <em>Must Understand</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Must Understand</em>' attribute.
	 * @see de.ugoe.cs.oco.tosca.TBoolean
	 * @see #isSetMustUnderstand()
	 * @see #unsetMustUnderstand()
	 * @see #getMustUnderstand()
	 * @generated
	 */
	void setMustUnderstand(TBoolean value);

	/**
	 * Unsets the value of the '{@link de.ugoe.cs.oco.tosca.TExtension#getMustUnderstand <em>Must Understand</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetMustUnderstand()
	 * @see #getMustUnderstand()
	 * @see #setMustUnderstand(TBoolean)
	 * @generated
	 */
	void unsetMustUnderstand();

	/**
	 * Returns whether the value of the '{@link de.ugoe.cs.oco.tosca.TExtension#getMustUnderstand <em>Must Understand</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Must Understand</em>' attribute is set.
	 * @see #unsetMustUnderstand()
	 * @see #getMustUnderstand()
	 * @see #setMustUnderstand(TBoolean)
	 * @generated
	 */
	boolean isSetMustUnderstand();

	/**
	 * Returns the value of the '<em><b>Namespace</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Namespace</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Namespace</em>' attribute.
	 * @see #setNamespace(String)
	 * @see de.ugoe.cs.oco.tosca.ToscaPackage#getTExtension_Namespace()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnyURI" required="true"
	 *        extendedMetaData="kind='attribute' name='namespace'"
	 * @generated
	 */
	String getNamespace();

	/**
	 * Sets the value of the '{@link de.ugoe.cs.oco.tosca.TExtension#getNamespace <em>Namespace</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Namespace</em>' attribute.
	 * @see #getNamespace()
	 * @generated
	 */
	void setNamespace(String value);

} // TExtension
