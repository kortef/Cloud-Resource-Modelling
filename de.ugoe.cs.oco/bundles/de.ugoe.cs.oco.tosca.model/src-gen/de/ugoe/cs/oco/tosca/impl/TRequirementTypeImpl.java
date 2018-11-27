/**
 */
package de.ugoe.cs.oco.tosca.impl;

import de.ugoe.cs.oco.tosca.DerivedFromType2;
import de.ugoe.cs.oco.tosca.TCapabilityType;
import de.ugoe.cs.oco.tosca.TEntityType;
import de.ugoe.cs.oco.tosca.TRequirementType;
import de.ugoe.cs.oco.tosca.ToscaPackage;
import de.ugoe.cs.oco.tosca.ToscaTables;
import de.ugoe.cs.oco.tosca.util.ToscaModelUtil;

import java.lang.reflect.InvocationTargetException;
import java.util.Map;
import javax.xml.namespace.QName;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.ocl.pivot.evaluation.Executor;
import org.eclipse.ocl.pivot.ids.IdResolver;
import org.eclipse.ocl.pivot.ids.TypeId;
import org.eclipse.ocl.pivot.internal.utilities.PivotUtilInternal;
import org.eclipse.ocl.pivot.library.oclany.OclAnyOclIsKindOfOperation;
import org.eclipse.ocl.pivot.library.oclany.OclComparableLessThanEqualOperation;
import org.eclipse.ocl.pivot.library.string.CGStringGetSeverityOperation;
import org.eclipse.ocl.pivot.library.string.CGStringLogDiagnosticOperation;
import org.eclipse.ocl.pivot.utilities.ValueUtil;
import org.eclipse.ocl.pivot.values.IntegerValue;
import org.eclipse.ocl.pivot.values.InvalidValueException;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>TRequirement Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.ugoe.cs.oco.tosca.impl.TRequirementTypeImpl#getRequiredCapabilityType <em>Required Capability Type</em>}</li>
 *   <li>{@link de.ugoe.cs.oco.tosca.impl.TRequirementTypeImpl#getRequiredCapabilityTypeRef <em>Required Capability Type Ref</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TRequirementTypeImpl extends TEntityTypeImpl implements TRequirementType {
	/**
	 * The default value of the '{@link #getRequiredCapabilityType() <em>Required Capability Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequiredCapabilityType()
	 * @generated
	 * @ordered
	 */
	protected static final QName REQUIRED_CAPABILITY_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRequiredCapabilityType() <em>Required Capability Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequiredCapabilityType()
	 * @generated
	 * @ordered
	 */
	protected QName requiredCapabilityType = REQUIRED_CAPABILITY_TYPE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getRequiredCapabilityTypeRef() <em>Required Capability Type Ref</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequiredCapabilityTypeRef()
	 * @generated
	 * @ordered
	 */
	protected TCapabilityType requiredCapabilityTypeRef;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TRequirementTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ToscaPackage.Literals.TREQUIREMENT_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QName getRequiredCapabilityType() {
		return requiredCapabilityType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRequiredCapabilityType(QName newRequiredCapabilityType) {
		QName oldRequiredCapabilityType = requiredCapabilityType;
		requiredCapabilityType = newRequiredCapabilityType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ToscaPackage.TREQUIREMENT_TYPE__REQUIRED_CAPABILITY_TYPE, oldRequiredCapabilityType, requiredCapabilityType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public TCapabilityType getRequiredCapabilityTypeRef() {
		if (requiredCapabilityTypeRef == null) {
			if (getRequiredCapabilityType() != null) {
				requiredCapabilityTypeRef = (TCapabilityType) ToscaModelUtil.resolveType(this, getRequiredCapabilityType());
			}
		}
		
		if (requiredCapabilityTypeRef != null && requiredCapabilityTypeRef.eIsProxy()) {
			InternalEObject oldRequiredCapabilityTypeRef = (InternalEObject)requiredCapabilityTypeRef;
			requiredCapabilityTypeRef = (TCapabilityType)eResolveProxy(oldRequiredCapabilityTypeRef);
			if (requiredCapabilityTypeRef != oldRequiredCapabilityTypeRef) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ToscaPackage.TREQUIREMENT_TYPE__REQUIRED_CAPABILITY_TYPE_REF, oldRequiredCapabilityTypeRef, requiredCapabilityTypeRef));
			}
		}
		return requiredCapabilityTypeRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TCapabilityType basicGetRequiredCapabilityTypeRef() {
		return requiredCapabilityTypeRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void setRequiredCapabilityTypeRef(TCapabilityType newRequiredCapabilityTypeRef) {
		setRequiredCapabilityType(ToscaModelUtil.getQualifiedName(newRequiredCapabilityTypeRef));
		
		TCapabilityType oldRequiredCapabilityTypeRef = requiredCapabilityTypeRef;
		requiredCapabilityTypeRef = newRequiredCapabilityTypeRef;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ToscaPackage.TREQUIREMENT_TYPE__REQUIRED_CAPABILITY_TYPE_REF, oldRequiredCapabilityTypeRef, requiredCapabilityTypeRef));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean superTypeMustBeRequirementType(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		/**
		 *
		 * inv superTypeMustBeRequirementType:
		 *   let
		 *     severity : Integer[1] = 'TRequirementType::superTypeMustBeRequirementType'.getSeverity()
		 *   in
		 *     if severity <= 0
		 *     then true
		 *     else
		 *       let
		 *         result : type::Boolean[1] = if self.derivedFrom <> null
		 *         then
		 *           self.derivedFrom.referencedEntityType.oclIsKindOf(TRequirementType)
		 *         else true
		 *         endif
		 *       in
		 *         'TRequirementType::superTypeMustBeRequirementType'.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
		 *     endif
		 */
		final /*@NonInvalid*/ Executor executor = PivotUtilInternal.getExecutor(this);
		final /*@NonInvalid*/ IdResolver idResolver = executor.getIdResolver();
		final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor, ToscaTables.STR_TRequirementType_c_c_superTypeMustBeRequirementType);
		final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE.evaluate(executor, severity_0, ToscaTables.INT_0).booleanValue();
		/*@NonInvalid*/ boolean symbol_0;
		if (le) {
			symbol_0 = ValueUtil.TRUE_VALUE;
		}
		else {
			/*@Caught*/ /*@NonNull*/ Object CAUGHT_result;
			try {
				final /*@NonInvalid*/ DerivedFromType2 derivedFrom = this.getDerivedFrom();
				final /*@NonInvalid*/ boolean ne = derivedFrom != null;
				/*@Thrown*/ boolean result;
				if (ne) {
					final /*@NonInvalid*/ org.eclipse.ocl.pivot.Class TYP_tosca_c_c_TRequirementType_0 = idResolver.getClass(ToscaTables.CLSSid_TRequirementType, null);
					if (derivedFrom == null) {
						throw new InvalidValueException("Null source for \'\'http://oco.cs.ugoe.de/tosca\'::DerivedFromType2::referencedEntityType\'");
					}
					final /*@Thrown*/ TEntityType referencedEntityType = derivedFrom.getReferencedEntityType();
					final /*@Thrown*/ boolean oclIsKindOf = OclAnyOclIsKindOfOperation.INSTANCE.evaluate(executor, referencedEntityType, TYP_tosca_c_c_TRequirementType_0).booleanValue();
					result = oclIsKindOf;
				}
				else {
					result = ValueUtil.TRUE_VALUE;
				}
				CAUGHT_result = result;
			}
			catch (Exception e) {
				CAUGHT_result = ValueUtil.createInvalidValue(e);
			}
			final /*@NonInvalid*/ boolean logDiagnostic = CGStringLogDiagnosticOperation.INSTANCE.evaluate(executor, TypeId.BOOLEAN, ToscaTables.STR_TRequirementType_c_c_superTypeMustBeRequirementType, this, (Object)null, diagnostics, context, (Object)null, severity_0, CAUGHT_result, ToscaTables.INT_0).booleanValue();
			symbol_0 = logDiagnostic;
		}
		return Boolean.TRUE == symbol_0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ToscaPackage.TREQUIREMENT_TYPE__REQUIRED_CAPABILITY_TYPE:
				return getRequiredCapabilityType();
			case ToscaPackage.TREQUIREMENT_TYPE__REQUIRED_CAPABILITY_TYPE_REF:
				if (resolve) return getRequiredCapabilityTypeRef();
				return basicGetRequiredCapabilityTypeRef();
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
			case ToscaPackage.TREQUIREMENT_TYPE__REQUIRED_CAPABILITY_TYPE:
				setRequiredCapabilityType((QName)newValue);
				return;
			case ToscaPackage.TREQUIREMENT_TYPE__REQUIRED_CAPABILITY_TYPE_REF:
				setRequiredCapabilityTypeRef((TCapabilityType)newValue);
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
			case ToscaPackage.TREQUIREMENT_TYPE__REQUIRED_CAPABILITY_TYPE:
				setRequiredCapabilityType(REQUIRED_CAPABILITY_TYPE_EDEFAULT);
				return;
			case ToscaPackage.TREQUIREMENT_TYPE__REQUIRED_CAPABILITY_TYPE_REF:
				setRequiredCapabilityTypeRef((TCapabilityType)null);
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
			case ToscaPackage.TREQUIREMENT_TYPE__REQUIRED_CAPABILITY_TYPE:
				return REQUIRED_CAPABILITY_TYPE_EDEFAULT == null ? requiredCapabilityType != null : !REQUIRED_CAPABILITY_TYPE_EDEFAULT.equals(requiredCapabilityType);
			case ToscaPackage.TREQUIREMENT_TYPE__REQUIRED_CAPABILITY_TYPE_REF:
				return requiredCapabilityTypeRef != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	@SuppressWarnings("unchecked")
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case ToscaPackage.TREQUIREMENT_TYPE___SUPER_TYPE_MUST_BE_REQUIREMENT_TYPE__DIAGNOSTICCHAIN_MAP:
				return superTypeMustBeRequirementType((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
		}
		return super.eInvoke(operationID, arguments);
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
		result.append(" (requiredCapabilityType: ");
		result.append(requiredCapabilityType);
		result.append(')');
		return result.toString();
	}

} //TRequirementTypeImpl
