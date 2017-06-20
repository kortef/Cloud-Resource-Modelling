/**
 */
package pcg;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Vertex</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link pcg.Vertex#getResources <em>Resources</em>}</li>
 *   <li>{@link pcg.Vertex#getTitle <em>Title</em>}</li>
 *   <li>{@link pcg.Vertex#getFixpointValue <em>Fixpoint Value</em>}</li>
 *   <li>{@link pcg.Vertex#getKind <em>Kind</em>}</li>
 *   <li>{@link pcg.Vertex#getNextFixpointValue <em>Next Fixpoint Value</em>}</li>
 * </ul>
 *
 * @see pcg.PcgPackage#getVertex()
 * @model
 * @generated
 */
public interface Vertex extends EObject {
	/**
	 * Returns the value of the '<em><b>Resources</b></em>' containment reference list.
	 * The list contents are of type {@link pcg.Resource}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Resources</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resources</em>' containment reference list.
	 * @see pcg.PcgPackage#getVertex_Resources()
	 * @model containment="true" lower="2" upper="2"
	 * @generated
	 */
	EList<Resource> getResources();

	/**
	 * Returns the value of the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Title</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Title</em>' attribute.
	 * @see #setTitle(String)
	 * @see pcg.PcgPackage#getVertex_Title()
	 * @model required="true"
	 * @generated
	 */
	String getTitle();

	/**
	 * Sets the value of the '{@link pcg.Vertex#getTitle <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Title</em>' attribute.
	 * @see #getTitle()
	 * @generated
	 */
	void setTitle(String value);

	/**
	 * Returns the value of the '<em><b>Fixpoint Value</b></em>' attribute.
	 * The default value is <code>"1.0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fixpoint Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fixpoint Value</em>' attribute.
	 * @see #setFixpointValue(double)
	 * @see pcg.PcgPackage#getVertex_FixpointValue()
	 * @model default="1.0" required="true"
	 * @generated
	 */
	double getFixpointValue();

	/**
	 * Sets the value of the '{@link pcg.Vertex#getFixpointValue <em>Fixpoint Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fixpoint Value</em>' attribute.
	 * @see #getFixpointValue()
	 * @generated
	 */
	void setFixpointValue(double value);

	/**
	 * Returns the value of the '<em><b>Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Kind</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Kind</em>' attribute.
	 * @see #setKind(String)
	 * @see pcg.PcgPackage#getVertex_Kind()
	 * @model required="true"
	 * @generated
	 */
	String getKind();

	/**
	 * Sets the value of the '{@link pcg.Vertex#getKind <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Kind</em>' attribute.
	 * @see #getKind()
	 * @generated
	 */
	void setKind(String value);

	/**
	 * Returns the value of the '<em><b>Next Fixpoint Value</b></em>' attribute.
	 * The default value is <code>"1.0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Next Fixpoint Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Next Fixpoint Value</em>' attribute.
	 * @see #setNextFixpointValue(double)
	 * @see pcg.PcgPackage#getVertex_NextFixpointValue()
	 * @model default="1.0" required="true"
	 * @generated
	 */
	double getNextFixpointValue();

	/**
	 * Sets the value of the '{@link pcg.Vertex#getNextFixpointValue <em>Next Fixpoint Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Next Fixpoint Value</em>' attribute.
	 * @see #getNextFixpointValue()
	 * @generated
	 */
	void setNextFixpointValue(double value);

} // Vertex
