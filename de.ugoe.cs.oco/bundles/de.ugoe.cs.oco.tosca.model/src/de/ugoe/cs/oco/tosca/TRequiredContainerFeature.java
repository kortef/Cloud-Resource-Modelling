/**
 */
package de.ugoe.cs.oco.tosca;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>TRequired Container Feature</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.ugoe.cs.oco.tosca.TRequiredContainerFeature#getFeature <em>Feature</em>}</li>
 * </ul>
 *
 * @see de.ugoe.cs.oco.tosca.ToscaPackage#getTRequiredContainerFeature()
 * @model extendedMetaData="name='tRequiredContainerFeature' kind='empty'"
 * @generated
 */
public interface TRequiredContainerFeature extends EObject {
	/**
	 * Returns the value of the '<em><b>Feature</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Feature</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Feature</em>' attribute.
	 * @see #setFeature(String)
	 * @see de.ugoe.cs.oco.tosca.ToscaPackage#getTRequiredContainerFeature_Feature()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnyURI" required="true"
	 *        extendedMetaData="kind='attribute' name='feature'"
	 * @generated
	 */
	String getFeature();

	/**
	 * Sets the value of the '{@link de.ugoe.cs.oco.tosca.TRequiredContainerFeature#getFeature <em>Feature</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Feature</em>' attribute.
	 * @see #getFeature()
	 * @generated
	 */
	void setFeature(String value);

} // TRequiredContainerFeature
