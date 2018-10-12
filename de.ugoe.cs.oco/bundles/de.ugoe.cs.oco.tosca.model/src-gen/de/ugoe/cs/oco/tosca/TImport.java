/**
 */
package de.ugoe.cs.oco.tosca;

import org.eclipse.emf.ecore.resource.Resource;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>TImport</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.ugoe.cs.oco.tosca.TImport#getImportType <em>Import Type</em>}</li>
 *   <li>{@link de.ugoe.cs.oco.tosca.TImport#getLocation <em>Location</em>}</li>
 *   <li>{@link de.ugoe.cs.oco.tosca.TImport#getNamespace <em>Namespace</em>}</li>
 *   <li>{@link de.ugoe.cs.oco.tosca.TImport#getResource <em>Resource</em>}</li>
 * </ul>
 *
 * @see de.ugoe.cs.oco.tosca.ToscaPackage#getTImport()
 * @model extendedMetaData="name='tImport' kind='elementOnly'"
 * @generated
 */
public interface TImport extends TExtensibleElements {
	/**
	 * Returns the value of the '<em><b>Import Type</b></em>' attribute.
	 * The literals are from the enumeration {@link de.ugoe.cs.oco.tosca.ValidImportTypes}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Import Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Import Type</em>' attribute.
	 * @see de.ugoe.cs.oco.tosca.ValidImportTypes
	 * @see #setImportType(ValidImportTypes)
	 * @see de.ugoe.cs.oco.tosca.ToscaPackage#getTImport_ImportType()
	 * @model required="true"
	 *        extendedMetaData="kind='attribute' name='importType'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://oco.cs.ugoe.de/tosca!TImport!importType'"
	 * @generated
	 */
	ValidImportTypes getImportType();

	/**
	 * Sets the value of the '{@link de.ugoe.cs.oco.tosca.TImport#getImportType <em>Import Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Import Type</em>' attribute.
	 * @see de.ugoe.cs.oco.tosca.ValidImportTypes
	 * @see #getImportType()
	 * @generated
	 */
	void setImportType(ValidImportTypes value);

	/**
	 * Returns the value of the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Location</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Location</em>' attribute.
	 * @see #setLocation(String)
	 * @see de.ugoe.cs.oco.tosca.ToscaPackage#getTImport_Location()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnyURI"
	 *        extendedMetaData="kind='attribute' name='location'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://oco.cs.ugoe.de/tosca!TImport!location'"
	 * @generated
	 */
	String getLocation();

	/**
	 * Sets the value of the '{@link de.ugoe.cs.oco.tosca.TImport#getLocation <em>Location</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Location</em>' attribute.
	 * @see #getLocation()
	 * @generated
	 */
	void setLocation(String value);

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
	 * @see de.ugoe.cs.oco.tosca.ToscaPackage#getTImport_Namespace()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnyURI"
	 *        extendedMetaData="kind='attribute' name='namespace'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://oco.cs.ugoe.de/tosca!TImport!namespace'"
	 * @generated
	 */
	String getNamespace();

	/**
	 * Sets the value of the '{@link de.ugoe.cs.oco.tosca.TImport#getNamespace <em>Namespace</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Namespace</em>' attribute.
	 * @see #getNamespace()
	 * @generated
	 */
	void setNamespace(String value);

	/**
	 * Returns the value of the '<em><b>Resource</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Resource</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resource</em>' attribute.
	 * @see #setResource(Resource)
	 * @see de.ugoe.cs.oco.tosca.ToscaPackage#getTImport_Resource()
	 * @model transient="true" derived="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://oco.cs.ugoe.de/tosca!TImport!resource'"
	 * @generated
	 */
	Resource getResource();

	/**
	 * Sets the value of the '{@link de.ugoe.cs.oco.tosca.TImport#getResource <em>Resource</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Resource</em>' attribute.
	 * @see #getResource()
	 * @generated
	 */
	void setResource(Resource value);

} // TImport
