/**
 */
package de.ugoe.cs.as.mappingdsl.model.mapping.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import de.ugoe.cs.as.mappingdsl.model.mapping.ComparisonOperatorType;
import de.ugoe.cs.as.mappingdsl.model.mapping.Expression;
import de.ugoe.cs.as.mappingdsl.model.mapping.Mapping;
import de.ugoe.cs.as.mappingdsl.model.mapping.MappingPackage;
import de.ugoe.cs.as.mappingdsl.model.mapping.Parameter;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Mapping</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.ugoe.cs.as.mappingdsl.model.mapping.impl.MappingImpl#getTargetParameter <em>Target Parameter</em>}</li>
 *   <li>{@link de.ugoe.cs.as.mappingdsl.model.mapping.impl.MappingImpl#getComperator <em>Comperator</em>}</li>
 *   <li>{@link de.ugoe.cs.as.mappingdsl.model.mapping.impl.MappingImpl#getExpression <em>Expression</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MappingImpl extends MinimalEObjectImpl.Container implements Mapping {
	/**
	 * The cached value of the '{@link #getTargetParameter() <em>Target Parameter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetParameter()
	 * @generated
	 * @ordered
	 */
	protected Parameter targetParameter;

	/**
	 * The default value of the '{@link #getComperator() <em>Comperator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComperator()
	 * @generated
	 * @ordered
	 */
	protected static final ComparisonOperatorType COMPERATOR_EDEFAULT = ComparisonOperatorType.EQUAL;

	/**
	 * The cached value of the '{@link #getComperator() <em>Comperator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComperator()
	 * @generated
	 * @ordered
	 */
	protected ComparisonOperatorType comperator = COMPERATOR_EDEFAULT;

	/**
	 * The cached value of the '{@link #getExpression() <em>Expression</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExpression()
	 * @generated
	 * @ordered
	 */
	protected Expression expression;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MappingImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MappingPackage.Literals.MAPPING;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Parameter getTargetParameter() {
		return targetParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTargetParameter(Parameter newTargetParameter, NotificationChain msgs) {
		Parameter oldTargetParameter = targetParameter;
		targetParameter = newTargetParameter;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MappingPackage.MAPPING__TARGET_PARAMETER, oldTargetParameter, newTargetParameter);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTargetParameter(Parameter newTargetParameter) {
		if (newTargetParameter != targetParameter) {
			NotificationChain msgs = null;
			if (targetParameter != null)
				msgs = ((InternalEObject)targetParameter).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MappingPackage.MAPPING__TARGET_PARAMETER, null, msgs);
			if (newTargetParameter != null)
				msgs = ((InternalEObject)newTargetParameter).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MappingPackage.MAPPING__TARGET_PARAMETER, null, msgs);
			msgs = basicSetTargetParameter(newTargetParameter, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MappingPackage.MAPPING__TARGET_PARAMETER, newTargetParameter, newTargetParameter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComparisonOperatorType getComperator() {
		return comperator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setComperator(ComparisonOperatorType newComperator) {
		ComparisonOperatorType oldComperator = comperator;
		comperator = newComperator == null ? COMPERATOR_EDEFAULT : newComperator;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MappingPackage.MAPPING__COMPERATOR, oldComperator, comperator));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression getExpression() {
		return expression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetExpression(Expression newExpression, NotificationChain msgs) {
		Expression oldExpression = expression;
		expression = newExpression;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MappingPackage.MAPPING__EXPRESSION, oldExpression, newExpression);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExpression(Expression newExpression) {
		if (newExpression != expression) {
			NotificationChain msgs = null;
			if (expression != null)
				msgs = ((InternalEObject)expression).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MappingPackage.MAPPING__EXPRESSION, null, msgs);
			if (newExpression != null)
				msgs = ((InternalEObject)newExpression).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MappingPackage.MAPPING__EXPRESSION, null, msgs);
			msgs = basicSetExpression(newExpression, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MappingPackage.MAPPING__EXPRESSION, newExpression, newExpression));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MappingPackage.MAPPING__TARGET_PARAMETER:
				return basicSetTargetParameter(null, msgs);
			case MappingPackage.MAPPING__EXPRESSION:
				return basicSetExpression(null, msgs);
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
			case MappingPackage.MAPPING__TARGET_PARAMETER:
				return getTargetParameter();
			case MappingPackage.MAPPING__COMPERATOR:
				return getComperator();
			case MappingPackage.MAPPING__EXPRESSION:
				return getExpression();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case MappingPackage.MAPPING__TARGET_PARAMETER:
				setTargetParameter((Parameter)newValue);
				return;
			case MappingPackage.MAPPING__COMPERATOR:
				setComperator((ComparisonOperatorType)newValue);
				return;
			case MappingPackage.MAPPING__EXPRESSION:
				setExpression((Expression)newValue);
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
			case MappingPackage.MAPPING__TARGET_PARAMETER:
				setTargetParameter((Parameter)null);
				return;
			case MappingPackage.MAPPING__COMPERATOR:
				setComperator(COMPERATOR_EDEFAULT);
				return;
			case MappingPackage.MAPPING__EXPRESSION:
				setExpression((Expression)null);
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
			case MappingPackage.MAPPING__TARGET_PARAMETER:
				return targetParameter != null;
			case MappingPackage.MAPPING__COMPERATOR:
				return comperator != COMPERATOR_EDEFAULT;
			case MappingPackage.MAPPING__EXPRESSION:
				return expression != null;
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
		result.append(" (comperator: ");
		result.append(comperator);
		result.append(')');
		return result.toString();
	}

} //MappingImpl
