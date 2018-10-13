/**
 */
package de.ugoe.cs.oco.tosca.impl;

import de.ugoe.cs.oco.tosca.CapabilityDefinitionsType1;
import de.ugoe.cs.oco.tosca.DerivedFromType2;
import de.ugoe.cs.oco.tosca.InterfacesType;
import de.ugoe.cs.oco.tosca.RequirementDefinitionsType1;
import de.ugoe.cs.oco.tosca.TEntityType;
import de.ugoe.cs.oco.tosca.TNodeType;
import de.ugoe.cs.oco.tosca.TTopologyElementInstanceStates;
import de.ugoe.cs.oco.tosca.ToscaPackage;

import de.ugoe.cs.oco.tosca.ToscaTables;
import java.lang.reflect.InvocationTargetException;
import java.util.Map;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

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
 * An implementation of the model object '<em><b>TNode Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.ugoe.cs.oco.tosca.impl.TNodeTypeImpl#getRequirementDefinitions <em>Requirement Definitions</em>}</li>
 *   <li>{@link de.ugoe.cs.oco.tosca.impl.TNodeTypeImpl#getCapabilityDefinitions <em>Capability Definitions</em>}</li>
 *   <li>{@link de.ugoe.cs.oco.tosca.impl.TNodeTypeImpl#getInstanceStates <em>Instance States</em>}</li>
 *   <li>{@link de.ugoe.cs.oco.tosca.impl.TNodeTypeImpl#getInterfaces <em>Interfaces</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TNodeTypeImpl extends TEntityTypeImpl implements TNodeType {
	/**
	 * The cached value of the '{@link #getRequirementDefinitions() <em>Requirement Definitions</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequirementDefinitions()
	 * @generated
	 * @ordered
	 */
	protected RequirementDefinitionsType1 requirementDefinitions;

	/**
	 * The cached value of the '{@link #getCapabilityDefinitions() <em>Capability Definitions</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCapabilityDefinitions()
	 * @generated
	 * @ordered
	 */
	protected CapabilityDefinitionsType1 capabilityDefinitions;

	/**
	 * The cached value of the '{@link #getInstanceStates() <em>Instance States</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInstanceStates()
	 * @generated
	 * @ordered
	 */
	protected TTopologyElementInstanceStates instanceStates;

	/**
	 * The cached value of the '{@link #getInterfaces() <em>Interfaces</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInterfaces()
	 * @generated
	 * @ordered
	 */
	protected InterfacesType interfaces;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TNodeTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ToscaPackage.Literals.TNODE_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RequirementDefinitionsType1 getRequirementDefinitions() {
		return requirementDefinitions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRequirementDefinitions(RequirementDefinitionsType1 newRequirementDefinitions, NotificationChain msgs) {
		RequirementDefinitionsType1 oldRequirementDefinitions = requirementDefinitions;
		requirementDefinitions = newRequirementDefinitions;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ToscaPackage.TNODE_TYPE__REQUIREMENT_DEFINITIONS, oldRequirementDefinitions, newRequirementDefinitions);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRequirementDefinitions(RequirementDefinitionsType1 newRequirementDefinitions) {
		if (newRequirementDefinitions != requirementDefinitions) {
			NotificationChain msgs = null;
			if (requirementDefinitions != null)
				msgs = ((InternalEObject)requirementDefinitions).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ToscaPackage.TNODE_TYPE__REQUIREMENT_DEFINITIONS, null, msgs);
			if (newRequirementDefinitions != null)
				msgs = ((InternalEObject)newRequirementDefinitions).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ToscaPackage.TNODE_TYPE__REQUIREMENT_DEFINITIONS, null, msgs);
			msgs = basicSetRequirementDefinitions(newRequirementDefinitions, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ToscaPackage.TNODE_TYPE__REQUIREMENT_DEFINITIONS, newRequirementDefinitions, newRequirementDefinitions));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CapabilityDefinitionsType1 getCapabilityDefinitions() {
		return capabilityDefinitions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCapabilityDefinitions(CapabilityDefinitionsType1 newCapabilityDefinitions, NotificationChain msgs) {
		CapabilityDefinitionsType1 oldCapabilityDefinitions = capabilityDefinitions;
		capabilityDefinitions = newCapabilityDefinitions;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ToscaPackage.TNODE_TYPE__CAPABILITY_DEFINITIONS, oldCapabilityDefinitions, newCapabilityDefinitions);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCapabilityDefinitions(CapabilityDefinitionsType1 newCapabilityDefinitions) {
		if (newCapabilityDefinitions != capabilityDefinitions) {
			NotificationChain msgs = null;
			if (capabilityDefinitions != null)
				msgs = ((InternalEObject)capabilityDefinitions).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ToscaPackage.TNODE_TYPE__CAPABILITY_DEFINITIONS, null, msgs);
			if (newCapabilityDefinitions != null)
				msgs = ((InternalEObject)newCapabilityDefinitions).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ToscaPackage.TNODE_TYPE__CAPABILITY_DEFINITIONS, null, msgs);
			msgs = basicSetCapabilityDefinitions(newCapabilityDefinitions, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ToscaPackage.TNODE_TYPE__CAPABILITY_DEFINITIONS, newCapabilityDefinitions, newCapabilityDefinitions));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TTopologyElementInstanceStates getInstanceStates() {
		return instanceStates;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInstanceStates(TTopologyElementInstanceStates newInstanceStates, NotificationChain msgs) {
		TTopologyElementInstanceStates oldInstanceStates = instanceStates;
		instanceStates = newInstanceStates;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ToscaPackage.TNODE_TYPE__INSTANCE_STATES, oldInstanceStates, newInstanceStates);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInstanceStates(TTopologyElementInstanceStates newInstanceStates) {
		if (newInstanceStates != instanceStates) {
			NotificationChain msgs = null;
			if (instanceStates != null)
				msgs = ((InternalEObject)instanceStates).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ToscaPackage.TNODE_TYPE__INSTANCE_STATES, null, msgs);
			if (newInstanceStates != null)
				msgs = ((InternalEObject)newInstanceStates).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ToscaPackage.TNODE_TYPE__INSTANCE_STATES, null, msgs);
			msgs = basicSetInstanceStates(newInstanceStates, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ToscaPackage.TNODE_TYPE__INSTANCE_STATES, newInstanceStates, newInstanceStates));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InterfacesType getInterfaces() {
		return interfaces;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInterfaces(InterfacesType newInterfaces, NotificationChain msgs) {
		InterfacesType oldInterfaces = interfaces;
		interfaces = newInterfaces;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ToscaPackage.TNODE_TYPE__INTERFACES, oldInterfaces, newInterfaces);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInterfaces(InterfacesType newInterfaces) {
		if (newInterfaces != interfaces) {
			NotificationChain msgs = null;
			if (interfaces != null)
				msgs = ((InternalEObject)interfaces).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ToscaPackage.TNODE_TYPE__INTERFACES, null, msgs);
			if (newInterfaces != null)
				msgs = ((InternalEObject)newInterfaces).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ToscaPackage.TNODE_TYPE__INTERFACES, null, msgs);
			msgs = basicSetInterfaces(newInterfaces, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ToscaPackage.TNODE_TYPE__INTERFACES, newInterfaces, newInterfaces));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean superTypeMustBeNodeType(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		/**
		 *
		 * inv superTypeMustBeNodeType:
		 *   let
		 *     severity : Integer[1] = 'TNodeType::superTypeMustBeNodeType'.getSeverity()
		 *   in
		 *     if severity <= 0
		 *     then true
		 *     else
		 *       let
		 *         result : type::Boolean[1] = if self.derivedFrom <> null
		 *         then
		 *           self.derivedFrom.referencedEntityType.oclIsKindOf(TNodeType)
		 *         else true
		 *         endif
		 *       in
		 *         'TNodeType::superTypeMustBeNodeType'.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
		 *     endif
		 */
		final /*@NonInvalid*/ Executor executor = PivotUtilInternal.getExecutor(this);
		final /*@NonInvalid*/ IdResolver idResolver = executor.getIdResolver();
		final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor, ToscaTables.STR_TNodeType_c_c_superTypeMustBeNodeType);
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
					final /*@NonInvalid*/ org.eclipse.ocl.pivot.Class TYP_tosca_c_c_TNodeType_0 = idResolver.getClass(ToscaTables.CLSSid_TNodeType, null);
					if (derivedFrom == null) {
						throw new InvalidValueException("Null source for \'\'http://oco.cs.ugoe.de/tosca\'::DerivedFromType2::referencedEntityType\'");
					}
					final /*@Thrown*/ TEntityType referencedEntityType = derivedFrom.getReferencedEntityType();
					final /*@Thrown*/ boolean oclIsKindOf = OclAnyOclIsKindOfOperation.INSTANCE.evaluate(executor, referencedEntityType, TYP_tosca_c_c_TNodeType_0).booleanValue();
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
			final /*@NonInvalid*/ boolean logDiagnostic = CGStringLogDiagnosticOperation.INSTANCE.evaluate(executor, TypeId.BOOLEAN, ToscaTables.STR_TNodeType_c_c_superTypeMustBeNodeType, this, (Object)null, diagnostics, context, (Object)null, severity_0, CAUGHT_result, ToscaTables.INT_0).booleanValue();
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
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ToscaPackage.TNODE_TYPE__REQUIREMENT_DEFINITIONS:
				return basicSetRequirementDefinitions(null, msgs);
			case ToscaPackage.TNODE_TYPE__CAPABILITY_DEFINITIONS:
				return basicSetCapabilityDefinitions(null, msgs);
			case ToscaPackage.TNODE_TYPE__INSTANCE_STATES:
				return basicSetInstanceStates(null, msgs);
			case ToscaPackage.TNODE_TYPE__INTERFACES:
				return basicSetInterfaces(null, msgs);
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
			case ToscaPackage.TNODE_TYPE__REQUIREMENT_DEFINITIONS:
				return getRequirementDefinitions();
			case ToscaPackage.TNODE_TYPE__CAPABILITY_DEFINITIONS:
				return getCapabilityDefinitions();
			case ToscaPackage.TNODE_TYPE__INSTANCE_STATES:
				return getInstanceStates();
			case ToscaPackage.TNODE_TYPE__INTERFACES:
				return getInterfaces();
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
			case ToscaPackage.TNODE_TYPE__REQUIREMENT_DEFINITIONS:
				setRequirementDefinitions((RequirementDefinitionsType1)newValue);
				return;
			case ToscaPackage.TNODE_TYPE__CAPABILITY_DEFINITIONS:
				setCapabilityDefinitions((CapabilityDefinitionsType1)newValue);
				return;
			case ToscaPackage.TNODE_TYPE__INSTANCE_STATES:
				setInstanceStates((TTopologyElementInstanceStates)newValue);
				return;
			case ToscaPackage.TNODE_TYPE__INTERFACES:
				setInterfaces((InterfacesType)newValue);
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
			case ToscaPackage.TNODE_TYPE__REQUIREMENT_DEFINITIONS:
				setRequirementDefinitions((RequirementDefinitionsType1)null);
				return;
			case ToscaPackage.TNODE_TYPE__CAPABILITY_DEFINITIONS:
				setCapabilityDefinitions((CapabilityDefinitionsType1)null);
				return;
			case ToscaPackage.TNODE_TYPE__INSTANCE_STATES:
				setInstanceStates((TTopologyElementInstanceStates)null);
				return;
			case ToscaPackage.TNODE_TYPE__INTERFACES:
				setInterfaces((InterfacesType)null);
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
			case ToscaPackage.TNODE_TYPE__REQUIREMENT_DEFINITIONS:
				return requirementDefinitions != null;
			case ToscaPackage.TNODE_TYPE__CAPABILITY_DEFINITIONS:
				return capabilityDefinitions != null;
			case ToscaPackage.TNODE_TYPE__INSTANCE_STATES:
				return instanceStates != null;
			case ToscaPackage.TNODE_TYPE__INTERFACES:
				return interfaces != null;
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
			case ToscaPackage.TNODE_TYPE___SUPER_TYPE_MUST_BE_NODE_TYPE__DIAGNOSTICCHAIN_MAP_1:
				return superTypeMustBeNodeType((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
		}
		return super.eInvoke(operationID, arguments);
	}

} //TNodeTypeImpl
