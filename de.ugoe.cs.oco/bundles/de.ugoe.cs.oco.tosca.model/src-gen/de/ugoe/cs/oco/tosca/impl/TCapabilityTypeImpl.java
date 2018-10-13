/**
 */
package de.ugoe.cs.oco.tosca.impl;

import de.ugoe.cs.oco.tosca.DerivedFromType2;
import de.ugoe.cs.oco.tosca.TCapabilityType;
import de.ugoe.cs.oco.tosca.TEntityType;
import de.ugoe.cs.oco.tosca.ToscaPackage;

import de.ugoe.cs.oco.tosca.ToscaTables;
import java.lang.reflect.InvocationTargetException;
import java.util.Map;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
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
 * An implementation of the model object '<em><b>TCapability Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class TCapabilityTypeImpl extends TEntityTypeImpl implements TCapabilityType {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TCapabilityTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ToscaPackage.Literals.TCAPABILITY_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean superTypeMustBeCapabilityType(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		/**
		 *
		 * inv superTypeMustBeCapabilityType:
		 *   let
		 *     severity : Integer[1] = 'TCapabilityType::superTypeMustBeCapabilityType'.getSeverity()
		 *   in
		 *     if severity <= 0
		 *     then true
		 *     else
		 *       let
		 *         result : type::Boolean[1] = if self.derivedFrom <> null
		 *         then
		 *           self.derivedFrom.referencedEntityType.oclIsKindOf(TCapabilityType)
		 *         else true
		 *         endif
		 *       in
		 *         'TCapabilityType::superTypeMustBeCapabilityType'.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
		 *     endif
		 */
		final /*@NonInvalid*/ Executor executor = PivotUtilInternal.getExecutor(this);
		final /*@NonInvalid*/ IdResolver idResolver = executor.getIdResolver();
		final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor, ToscaTables.STR_TCapabilityType_c_c_superTypeMustBeCapabilityType);
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
					final /*@NonInvalid*/ org.eclipse.ocl.pivot.Class TYP_tosca_c_c_TCapabilityType_0 = idResolver.getClass(ToscaTables.CLSSid_TCapabilityType, null);
					if (derivedFrom == null) {
						throw new InvalidValueException("Null source for \'\'http://oco.cs.ugoe.de/tosca\'::DerivedFromType2::referencedEntityType\'");
					}
					final /*@Thrown*/ TEntityType referencedEntityType = derivedFrom.getReferencedEntityType();
					final /*@Thrown*/ boolean oclIsKindOf = OclAnyOclIsKindOfOperation.INSTANCE.evaluate(executor, referencedEntityType, TYP_tosca_c_c_TCapabilityType_0).booleanValue();
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
			final /*@NonInvalid*/ boolean logDiagnostic = CGStringLogDiagnosticOperation.INSTANCE.evaluate(executor, TypeId.BOOLEAN, ToscaTables.STR_TCapabilityType_c_c_superTypeMustBeCapabilityType, this, (Object)null, diagnostics, context, (Object)null, severity_0, CAUGHT_result, ToscaTables.INT_0).booleanValue();
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
	@SuppressWarnings("unchecked")
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case ToscaPackage.TCAPABILITY_TYPE___SUPER_TYPE_MUST_BE_CAPABILITY_TYPE__DIAGNOSTICCHAIN_MAP_1:
				return superTypeMustBeCapabilityType((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
		}
		return super.eInvoke(operationID, arguments);
	}

} //TCapabilityTypeImpl
