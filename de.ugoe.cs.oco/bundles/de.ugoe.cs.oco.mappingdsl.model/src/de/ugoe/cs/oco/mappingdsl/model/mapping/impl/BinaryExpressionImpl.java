/**
 */
package de.ugoe.cs.oco.mappingdsl.model.mapping.impl;

import de.ugoe.cs.oco.mappingdsl.model.mapping.BinaryExpression;
import de.ugoe.cs.oco.mappingdsl.model.mapping.BinaryExpressionOperatorType;
import de.ugoe.cs.oco.mappingdsl.model.mapping.Expression;
import de.ugoe.cs.oco.mappingdsl.model.mapping.MappingPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Binary Expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.ugoe.cs.oco.mappingdsl.model.mapping.impl.BinaryExpressionImpl#getPart1 <em>Part1</em>}</li>
 *   <li>{@link de.ugoe.cs.oco.mappingdsl.model.mapping.impl.BinaryExpressionImpl#getPart2 <em>Part2</em>}</li>
 *   <li>{@link de.ugoe.cs.oco.mappingdsl.model.mapping.impl.BinaryExpressionImpl#getOperator <em>Operator</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BinaryExpressionImpl extends ExpressionImpl implements BinaryExpression {
	/**
	 * The cached value of the '{@link #getPart1() <em>Part1</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPart1()
	 * @generated
	 * @ordered
	 */
	protected Expression part1;

	/**
	 * The cached value of the '{@link #getPart2() <em>Part2</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPart2()
	 * @generated
	 * @ordered
	 */
	protected Expression part2;

	/**
	 * The default value of the '{@link #getOperator() <em>Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperator()
	 * @generated
	 * @ordered
	 */
	protected static final BinaryExpressionOperatorType OPERATOR_EDEFAULT = BinaryExpressionOperatorType.MINUS;

	/**
	 * The cached value of the '{@link #getOperator() <em>Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperator()
	 * @generated
	 * @ordered
	 */
	protected BinaryExpressionOperatorType operator = OPERATOR_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BinaryExpressionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MappingPackage.Literals.BINARY_EXPRESSION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression getPart1() {
		return part1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPart1(Expression newPart1, NotificationChain msgs) {
		Expression oldPart1 = part1;
		part1 = newPart1;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MappingPackage.BINARY_EXPRESSION__PART1, oldPart1, newPart1);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPart1(Expression newPart1) {
		if (newPart1 != part1) {
			NotificationChain msgs = null;
			if (part1 != null)
				msgs = ((InternalEObject)part1).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MappingPackage.BINARY_EXPRESSION__PART1, null, msgs);
			if (newPart1 != null)
				msgs = ((InternalEObject)newPart1).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MappingPackage.BINARY_EXPRESSION__PART1, null, msgs);
			msgs = basicSetPart1(newPart1, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MappingPackage.BINARY_EXPRESSION__PART1, newPart1, newPart1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression getPart2() {
		return part2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPart2(Expression newPart2, NotificationChain msgs) {
		Expression oldPart2 = part2;
		part2 = newPart2;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MappingPackage.BINARY_EXPRESSION__PART2, oldPart2, newPart2);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPart2(Expression newPart2) {
		if (newPart2 != part2) {
			NotificationChain msgs = null;
			if (part2 != null)
				msgs = ((InternalEObject)part2).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MappingPackage.BINARY_EXPRESSION__PART2, null, msgs);
			if (newPart2 != null)
				msgs = ((InternalEObject)newPart2).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MappingPackage.BINARY_EXPRESSION__PART2, null, msgs);
			msgs = basicSetPart2(newPart2, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MappingPackage.BINARY_EXPRESSION__PART2, newPart2, newPart2));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BinaryExpressionOperatorType getOperator() {
		return operator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOperator(BinaryExpressionOperatorType newOperator) {
		BinaryExpressionOperatorType oldOperator = operator;
		operator = newOperator == null ? OPERATOR_EDEFAULT : newOperator;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MappingPackage.BINARY_EXPRESSION__OPERATOR, oldOperator, operator));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MappingPackage.BINARY_EXPRESSION__PART1:
				return basicSetPart1(null, msgs);
			case MappingPackage.BINARY_EXPRESSION__PART2:
				return basicSetPart2(null, msgs);
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
			case MappingPackage.BINARY_EXPRESSION__PART1:
				return getPart1();
			case MappingPackage.BINARY_EXPRESSION__PART2:
				return getPart2();
			case MappingPackage.BINARY_EXPRESSION__OPERATOR:
				return getOperator();
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
			case MappingPackage.BINARY_EXPRESSION__PART1:
				setPart1((Expression)newValue);
				return;
			case MappingPackage.BINARY_EXPRESSION__PART2:
				setPart2((Expression)newValue);
				return;
			case MappingPackage.BINARY_EXPRESSION__OPERATOR:
				setOperator((BinaryExpressionOperatorType)newValue);
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
			case MappingPackage.BINARY_EXPRESSION__PART1:
				setPart1((Expression)null);
				return;
			case MappingPackage.BINARY_EXPRESSION__PART2:
				setPart2((Expression)null);
				return;
			case MappingPackage.BINARY_EXPRESSION__OPERATOR:
				setOperator(OPERATOR_EDEFAULT);
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
			case MappingPackage.BINARY_EXPRESSION__PART1:
				return part1 != null;
			case MappingPackage.BINARY_EXPRESSION__PART2:
				return part2 != null;
			case MappingPackage.BINARY_EXPRESSION__OPERATOR:
				return operator != OPERATOR_EDEFAULT;
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
		result.append(" (operator: ");
		result.append(operator);
		result.append(')');
		return result.toString();
	}

} //BinaryExpressionImpl
