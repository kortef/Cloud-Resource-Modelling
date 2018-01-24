/**
 */
package pcg.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import pcg.PcgPackage;
import pcg.Resource;
import pcg.Vertex;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Vertex</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link pcg.impl.VertexImpl#getResources <em>Resources</em>}</li>
 *   <li>{@link pcg.impl.VertexImpl#getTitle <em>Title</em>}</li>
 *   <li>{@link pcg.impl.VertexImpl#getFixpointValue <em>Fixpoint Value</em>}</li>
 *   <li>{@link pcg.impl.VertexImpl#getKind <em>Kind</em>}</li>
 *   <li>{@link pcg.impl.VertexImpl#getNextFixpointValue <em>Next Fixpoint Value</em>}</li>
 * </ul>
 *
 * @generated
 */
public class VertexImpl extends EObjectImpl implements Vertex {
	/**
	 * The cached value of the '{@link #getResources() <em>Resources</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResources()
	 * @generated
	 * @ordered
	 */
	protected EList<Resource> resources;

	/**
	 * The default value of the '{@link #getTitle() <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTitle()
	 * @generated
	 * @ordered
	 */
	protected static final String TITLE_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getTitle() <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTitle()
	 * @generated
	 * @ordered
	 */
	protected String title = TITLE_EDEFAULT;

	/**
	 * The default value of the '{@link #getFixpointValue() <em>Fixpoint Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFixpointValue()
	 * @generated
	 * @ordered
	 */
	protected static final double FIXPOINT_VALUE_EDEFAULT = 1.0;

	/**
	 * The cached value of the '{@link #getFixpointValue() <em>Fixpoint Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFixpointValue()
	 * @generated
	 * @ordered
	 */
	protected double fixpointValue = FIXPOINT_VALUE_EDEFAULT;

	/**
	 * The default value of the '{@link #getKind() <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKind()
	 * @generated
	 * @ordered
	 */
	protected static final String KIND_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getKind() <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKind()
	 * @generated
	 * @ordered
	 */
	protected String kind = KIND_EDEFAULT;

	/**
	 * The default value of the '{@link #getNextFixpointValue() <em>Next Fixpoint Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNextFixpointValue()
	 * @generated
	 * @ordered
	 */
	protected static final double NEXT_FIXPOINT_VALUE_EDEFAULT = 1.0;

	/**
	 * The cached value of the '{@link #getNextFixpointValue() <em>Next Fixpoint Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNextFixpointValue()
	 * @generated
	 * @ordered
	 */
	protected double nextFixpointValue = NEXT_FIXPOINT_VALUE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VertexImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PcgPackage.Literals.VERTEX;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Resource> getResources() {
		if (resources == null) {
			resources = new EObjectContainmentEList<Resource>(Resource.class, this, PcgPackage.VERTEX__RESOURCES);
		}
		return resources;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTitle(String newTitle) {
		String oldTitle = title;
		title = newTitle;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PcgPackage.VERTEX__TITLE, oldTitle, title));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getFixpointValue() {
		return fixpointValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFixpointValue(double newFixpointValue) {
		double oldFixpointValue = fixpointValue;
		fixpointValue = newFixpointValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PcgPackage.VERTEX__FIXPOINT_VALUE, oldFixpointValue, fixpointValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getKind() {
		return kind;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setKind(String newKind) {
		String oldKind = kind;
		kind = newKind;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PcgPackage.VERTEX__KIND, oldKind, kind));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getNextFixpointValue() {
		return nextFixpointValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNextFixpointValue(double newNextFixpointValue) {
		double oldNextFixpointValue = nextFixpointValue;
		nextFixpointValue = newNextFixpointValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PcgPackage.VERTEX__NEXT_FIXPOINT_VALUE, oldNextFixpointValue, nextFixpointValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PcgPackage.VERTEX__RESOURCES:
				return ((InternalEList<?>)getResources()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PcgPackage.VERTEX__RESOURCES:
				return getResources();
			case PcgPackage.VERTEX__TITLE:
				return getTitle();
			case PcgPackage.VERTEX__FIXPOINT_VALUE:
				return getFixpointValue();
			case PcgPackage.VERTEX__KIND:
				return getKind();
			case PcgPackage.VERTEX__NEXT_FIXPOINT_VALUE:
				return getNextFixpointValue();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case PcgPackage.VERTEX__RESOURCES:
				getResources().clear();
				getResources().addAll((Collection<? extends Resource>)newValue);
				return;
			case PcgPackage.VERTEX__TITLE:
				setTitle((String)newValue);
				return;
			case PcgPackage.VERTEX__FIXPOINT_VALUE:
				setFixpointValue((Double)newValue);
				return;
			case PcgPackage.VERTEX__KIND:
				setKind((String)newValue);
				return;
			case PcgPackage.VERTEX__NEXT_FIXPOINT_VALUE:
				setNextFixpointValue((Double)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case PcgPackage.VERTEX__RESOURCES:
				getResources().clear();
				return;
			case PcgPackage.VERTEX__TITLE:
				setTitle(TITLE_EDEFAULT);
				return;
			case PcgPackage.VERTEX__FIXPOINT_VALUE:
				setFixpointValue(FIXPOINT_VALUE_EDEFAULT);
				return;
			case PcgPackage.VERTEX__KIND:
				setKind(KIND_EDEFAULT);
				return;
			case PcgPackage.VERTEX__NEXT_FIXPOINT_VALUE:
				setNextFixpointValue(NEXT_FIXPOINT_VALUE_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case PcgPackage.VERTEX__RESOURCES:
				return resources != null && !resources.isEmpty();
			case PcgPackage.VERTEX__TITLE:
				return TITLE_EDEFAULT == null ? title != null : !TITLE_EDEFAULT.equals(title);
			case PcgPackage.VERTEX__FIXPOINT_VALUE:
				return fixpointValue != FIXPOINT_VALUE_EDEFAULT;
			case PcgPackage.VERTEX__KIND:
				return KIND_EDEFAULT == null ? kind != null : !KIND_EDEFAULT.equals(kind);
			case PcgPackage.VERTEX__NEXT_FIXPOINT_VALUE:
				return nextFixpointValue != NEXT_FIXPOINT_VALUE_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (title: ");
		result.append(title);
		result.append(", fixpointValue: ");
		result.append(fixpointValue);
		result.append(", kind: ");
		result.append(kind);
		result.append(", nextFixpointValue: ");
		result.append(nextFixpointValue);
		result.append(')');
		return result.toString();
	}

} //VertexImpl
