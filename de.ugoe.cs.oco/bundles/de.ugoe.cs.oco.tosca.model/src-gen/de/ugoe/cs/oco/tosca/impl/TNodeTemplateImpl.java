/**
 */
package de.ugoe.cs.oco.tosca.impl;

import de.ugoe.cs.oco.tosca.CapabilitiesType;
import de.ugoe.cs.oco.tosca.CapabilityDefinitionsType1;
import de.ugoe.cs.oco.tosca.DerivedFromType2;
import de.ugoe.cs.oco.tosca.PoliciesType;
import de.ugoe.cs.oco.tosca.RequirementDefinitionsType1;
import de.ugoe.cs.oco.tosca.RequirementsType;
import de.ugoe.cs.oco.tosca.TCapability;
import de.ugoe.cs.oco.tosca.TCapabilityDefinition;
import de.ugoe.cs.oco.tosca.TCapabilityType;
import de.ugoe.cs.oco.tosca.TDeploymentArtifacts;
import de.ugoe.cs.oco.tosca.TEntityType;
import de.ugoe.cs.oco.tosca.TNodeTemplate;
import de.ugoe.cs.oco.tosca.TNodeType;
import de.ugoe.cs.oco.tosca.TRequirement;
import de.ugoe.cs.oco.tosca.TRequirementDefinition;
import de.ugoe.cs.oco.tosca.TRequirementType;
import de.ugoe.cs.oco.tosca.ToscaFactory;
import de.ugoe.cs.oco.tosca.ToscaPackage;
import de.ugoe.cs.oco.tosca.ToscaTables;
import java.lang.reflect.InvocationTargetException;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.ocl.pivot.StandardLibrary;
import org.eclipse.ocl.pivot.evaluation.Executor;
import org.eclipse.ocl.pivot.ids.IdResolver;
import org.eclipse.ocl.pivot.ids.TypeId;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorSingleIterationManager;
import org.eclipse.ocl.pivot.internal.utilities.PivotUtilInternal;
import org.eclipse.ocl.pivot.library.AbstractBinaryOperation;
import org.eclipse.ocl.pivot.library.LibraryIteration;
import org.eclipse.ocl.pivot.library.collection.CollectionIncludesOperation;
import org.eclipse.ocl.pivot.library.logical.BooleanAndOperation;
import org.eclipse.ocl.pivot.library.logical.BooleanOrOperation;
import org.eclipse.ocl.pivot.library.oclany.OclAnyOclAsSetOperation;
import org.eclipse.ocl.pivot.library.oclany.OclAnyOclAsTypeOperation;
import org.eclipse.ocl.pivot.library.oclany.OclAnyOclIsKindOfOperation;
import org.eclipse.ocl.pivot.library.oclany.OclComparableLessThanEqualOperation;
import org.eclipse.ocl.pivot.library.string.CGStringGetSeverityOperation;
import org.eclipse.ocl.pivot.library.string.CGStringLogDiagnosticOperation;
import org.eclipse.ocl.pivot.messages.PivotMessages;
import org.eclipse.ocl.pivot.oclstdlib.OCLstdlibTables;
import org.eclipse.ocl.pivot.utilities.ClassUtil;
import org.eclipse.ocl.pivot.utilities.ValueUtil;
import org.eclipse.ocl.pivot.values.BagValue;
import org.eclipse.ocl.pivot.values.IntegerValue;
import org.eclipse.ocl.pivot.values.InvalidValueException;
import org.eclipse.ocl.pivot.values.OrderedSetValue;
import org.eclipse.ocl.pivot.values.SequenceValue;
import org.eclipse.ocl.pivot.values.SetValue;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>TNode Template</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.ugoe.cs.oco.tosca.impl.TNodeTemplateImpl#getRequirements <em>Requirements</em>}</li>
 *   <li>{@link de.ugoe.cs.oco.tosca.impl.TNodeTemplateImpl#getCapabilities <em>Capabilities</em>}</li>
 *   <li>{@link de.ugoe.cs.oco.tosca.impl.TNodeTemplateImpl#getPolicies <em>Policies</em>}</li>
 *   <li>{@link de.ugoe.cs.oco.tosca.impl.TNodeTemplateImpl#getDeploymentArtifacts <em>Deployment Artifacts</em>}</li>
 *   <li>{@link de.ugoe.cs.oco.tosca.impl.TNodeTemplateImpl#getMaxInstances <em>Max Instances</em>}</li>
 *   <li>{@link de.ugoe.cs.oco.tosca.impl.TNodeTemplateImpl#getMinInstances <em>Min Instances</em>}</li>
 *   <li>{@link de.ugoe.cs.oco.tosca.impl.TNodeTemplateImpl#getName <em>Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TNodeTemplateImpl extends TEntityTemplateImpl implements TNodeTemplate {
	/**
	 * The cached value of the '{@link #getRequirements() <em>Requirements</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequirements()
	 * @generated
	 * @ordered
	 */
	protected RequirementsType requirements;

	/**
	 * The cached value of the '{@link #getCapabilities() <em>Capabilities</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCapabilities()
	 * @generated
	 * @ordered
	 */
	protected CapabilitiesType capabilities;

	/**
	 * The cached value of the '{@link #getPolicies() <em>Policies</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPolicies()
	 * @generated
	 * @ordered
	 */
	protected PoliciesType policies;

	/**
	 * The cached value of the '{@link #getDeploymentArtifacts() <em>Deployment Artifacts</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeploymentArtifacts()
	 * @generated
	 * @ordered
	 */
	protected TDeploymentArtifacts deploymentArtifacts;

	/**
	 * The default value of the '{@link #getMaxInstances() <em>Max Instances</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxInstances()
	 * @generated
	 * @ordered
	 */
	protected static final Object MAX_INSTANCES_EDEFAULT = ToscaFactory.eINSTANCE.createFromString(ToscaPackage.eINSTANCE.getMaxInstancesType1(), "1");

	/**
	 * The cached value of the '{@link #getMaxInstances() <em>Max Instances</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxInstances()
	 * @generated
	 * @ordered
	 */
	protected Object maxInstances = MAX_INSTANCES_EDEFAULT;

	/**
	 * This is true if the Max Instances attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean maxInstancesESet;

	/**
	 * The default value of the '{@link #getMinInstances() <em>Min Instances</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinInstances()
	 * @generated
	 * @ordered
	 */
	protected static final int MIN_INSTANCES_EDEFAULT = 1;

	/**
	 * The cached value of the '{@link #getMinInstances() <em>Min Instances</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinInstances()
	 * @generated
	 * @ordered
	 */
	protected int minInstances = MIN_INSTANCES_EDEFAULT;

	/**
	 * This is true if the Min Instances attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean minInstancesESet;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TNodeTemplateImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ToscaPackage.Literals.TNODE_TEMPLATE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RequirementsType getRequirements() {
		return requirements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRequirements(RequirementsType newRequirements, NotificationChain msgs) {
		RequirementsType oldRequirements = requirements;
		requirements = newRequirements;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ToscaPackage.TNODE_TEMPLATE__REQUIREMENTS, oldRequirements, newRequirements);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRequirements(RequirementsType newRequirements) {
		if (newRequirements != requirements) {
			NotificationChain msgs = null;
			if (requirements != null)
				msgs = ((InternalEObject)requirements).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ToscaPackage.TNODE_TEMPLATE__REQUIREMENTS, null, msgs);
			if (newRequirements != null)
				msgs = ((InternalEObject)newRequirements).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ToscaPackage.TNODE_TEMPLATE__REQUIREMENTS, null, msgs);
			msgs = basicSetRequirements(newRequirements, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ToscaPackage.TNODE_TEMPLATE__REQUIREMENTS, newRequirements, newRequirements));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CapabilitiesType getCapabilities() {
		return capabilities;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCapabilities(CapabilitiesType newCapabilities, NotificationChain msgs) {
		CapabilitiesType oldCapabilities = capabilities;
		capabilities = newCapabilities;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ToscaPackage.TNODE_TEMPLATE__CAPABILITIES, oldCapabilities, newCapabilities);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCapabilities(CapabilitiesType newCapabilities) {
		if (newCapabilities != capabilities) {
			NotificationChain msgs = null;
			if (capabilities != null)
				msgs = ((InternalEObject)capabilities).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ToscaPackage.TNODE_TEMPLATE__CAPABILITIES, null, msgs);
			if (newCapabilities != null)
				msgs = ((InternalEObject)newCapabilities).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ToscaPackage.TNODE_TEMPLATE__CAPABILITIES, null, msgs);
			msgs = basicSetCapabilities(newCapabilities, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ToscaPackage.TNODE_TEMPLATE__CAPABILITIES, newCapabilities, newCapabilities));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PoliciesType getPolicies() {
		return policies;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPolicies(PoliciesType newPolicies, NotificationChain msgs) {
		PoliciesType oldPolicies = policies;
		policies = newPolicies;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ToscaPackage.TNODE_TEMPLATE__POLICIES, oldPolicies, newPolicies);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPolicies(PoliciesType newPolicies) {
		if (newPolicies != policies) {
			NotificationChain msgs = null;
			if (policies != null)
				msgs = ((InternalEObject)policies).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ToscaPackage.TNODE_TEMPLATE__POLICIES, null, msgs);
			if (newPolicies != null)
				msgs = ((InternalEObject)newPolicies).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ToscaPackage.TNODE_TEMPLATE__POLICIES, null, msgs);
			msgs = basicSetPolicies(newPolicies, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ToscaPackage.TNODE_TEMPLATE__POLICIES, newPolicies, newPolicies));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TDeploymentArtifacts getDeploymentArtifacts() {
		return deploymentArtifacts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDeploymentArtifacts(TDeploymentArtifacts newDeploymentArtifacts, NotificationChain msgs) {
		TDeploymentArtifacts oldDeploymentArtifacts = deploymentArtifacts;
		deploymentArtifacts = newDeploymentArtifacts;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ToscaPackage.TNODE_TEMPLATE__DEPLOYMENT_ARTIFACTS, oldDeploymentArtifacts, newDeploymentArtifacts);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDeploymentArtifacts(TDeploymentArtifacts newDeploymentArtifacts) {
		if (newDeploymentArtifacts != deploymentArtifacts) {
			NotificationChain msgs = null;
			if (deploymentArtifacts != null)
				msgs = ((InternalEObject)deploymentArtifacts).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ToscaPackage.TNODE_TEMPLATE__DEPLOYMENT_ARTIFACTS, null, msgs);
			if (newDeploymentArtifacts != null)
				msgs = ((InternalEObject)newDeploymentArtifacts).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ToscaPackage.TNODE_TEMPLATE__DEPLOYMENT_ARTIFACTS, null, msgs);
			msgs = basicSetDeploymentArtifacts(newDeploymentArtifacts, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ToscaPackage.TNODE_TEMPLATE__DEPLOYMENT_ARTIFACTS, newDeploymentArtifacts, newDeploymentArtifacts));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getMaxInstances() {
		return maxInstances;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaxInstances(Object newMaxInstances) {
		Object oldMaxInstances = maxInstances;
		maxInstances = newMaxInstances;
		boolean oldMaxInstancesESet = maxInstancesESet;
		maxInstancesESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ToscaPackage.TNODE_TEMPLATE__MAX_INSTANCES, oldMaxInstances, maxInstances, !oldMaxInstancesESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetMaxInstances() {
		Object oldMaxInstances = maxInstances;
		boolean oldMaxInstancesESet = maxInstancesESet;
		maxInstances = MAX_INSTANCES_EDEFAULT;
		maxInstancesESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, ToscaPackage.TNODE_TEMPLATE__MAX_INSTANCES, oldMaxInstances, MAX_INSTANCES_EDEFAULT, oldMaxInstancesESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetMaxInstances() {
		return maxInstancesESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getMinInstances() {
		return minInstances;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMinInstances(int newMinInstances) {
		int oldMinInstances = minInstances;
		minInstances = newMinInstances;
		boolean oldMinInstancesESet = minInstancesESet;
		minInstancesESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ToscaPackage.TNODE_TEMPLATE__MIN_INSTANCES, oldMinInstances, minInstances, !oldMinInstancesESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetMinInstances() {
		int oldMinInstances = minInstances;
		boolean oldMinInstancesESet = minInstancesESet;
		minInstances = MIN_INSTANCES_EDEFAULT;
		minInstancesESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, ToscaPackage.TNODE_TEMPLATE__MIN_INSTANCES, oldMinInstances, MIN_INSTANCES_EDEFAULT, oldMinInstancesESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetMinInstances() {
		return minInstancesESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ToscaPackage.TNODE_TEMPLATE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean requirementsMustBeDefinedInReferencedNodeType(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		/**
		 *
		 * inv requirementsMustBeDefinedInReferencedNodeType:
		 *   let
		 *     severity : Integer[1] = 'TNodeTemplate::requirementsMustBeDefinedInReferencedNodeType'.getSeverity()
		 *   in
		 *     if severity <= 0
		 *     then true
		 *     else
		 *       let
		 *         result : type::Boolean[?] = if
		 *           self.typeRef.oclIsKindOf(TNodeType) and self.requirements <> null
		 *         then
		 *           if
		 *             self.requirements.requirement->forAll(
		 *               self.typeRef.oclAsType(TNodeType).requirementDefinitions <> null and
		 *               self.typeRef.oclAsType(TNodeType)
		 *               .requirementDefinitions.requirementDefinition->collect(requirementTypeRef)
		 *               ->includes(typeRef) or
		 *               self.typeRef.oclAsType(TNodeType)
		 *               ->closure(
		 *                 if derivedFrom <> null
		 *                 then derivedFrom.referencedEntityType
		 *                 else null
		 *                 endif)
		 *               ->select(et | et <> null)
		 *               ->collect(oclAsType(TNodeType))
		 *               ->collect(requirementDefinitions)
		 *               ->select(cd | cd <> null)
		 *               ->collect(requirementDefinition.requirementTypeRef)
		 *               ->includes(typeRef))
		 *           then true
		 *           else null
		 *           endif
		 *         else true
		 *         endif
		 *       in
		 *         'TNodeTemplate::requirementsMustBeDefinedInReferencedNodeType'.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
		 *     endif
		 */
		final /*@NonInvalid*/ Executor executor = PivotUtilInternal.getExecutor(this);
		final /*@NonInvalid*/ IdResolver idResolver = executor.getIdResolver();
		final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor, ToscaTables.STR_TNodeTemplate_c_c_requirementsMustBeDefinedInReferencedNodeType);
		final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE.evaluate(executor, severity_0, ToscaTables.INT_0).booleanValue();
		/*@NonInvalid*/ boolean symbol_4;
		if (le) {
			symbol_4 = ValueUtil.TRUE_VALUE;
		}
		else {
			final /*@NonInvalid*/ RequirementsType requirements = this.getRequirements();
			/*@Caught*/ /*@NonNull*/ Object CAUGHT_oclIsKindOf;
			try {
				final /*@NonInvalid*/ org.eclipse.ocl.pivot.Class TYP_tosca_c_c_TNodeType_0 = idResolver.getClass(ToscaTables.CLSSid_TNodeType, null);
				final /*@NonInvalid*/ TEntityType typeRef = this.getTypeRef();
				final /*@Thrown*/ boolean oclIsKindOf = OclAnyOclIsKindOfOperation.INSTANCE.evaluate(executor, typeRef, TYP_tosca_c_c_TNodeType_0).booleanValue();
				CAUGHT_oclIsKindOf = oclIsKindOf;
			}
			catch (Exception e) {
				CAUGHT_oclIsKindOf = ValueUtil.createInvalidValue(e);
			}
			final /*@NonInvalid*/ boolean ne = requirements != null;
			final /*@Thrown*/ Boolean and = BooleanAndOperation.INSTANCE.evaluate(CAUGHT_oclIsKindOf, ne);
			if (and == null) {
				throw new InvalidValueException("Null if condition");
			}
			/*@NonInvalid*/ Boolean result;
			if (and) {
				if (requirements == null) {
					throw new InvalidValueException("Null source for \'\'http://oco.cs.ugoe.de/tosca\'::RequirementsType::requirement\'");
				}
				final /*@Thrown*/ List<TRequirement> requirement = requirements.getRequirement();
				final /*@Thrown*/ OrderedSetValue BOXED_requirement = idResolver.createOrderedSetOfAll(ToscaTables.ORD_CLSSid_TRequirement, requirement);
				/*@Thrown*/ Object accumulator = ValueUtil.TRUE_VALUE;
				/*@NonNull*/ Iterator<Object> ITERATOR__1_5 = BOXED_requirement.iterator();
				/*@Thrown*/ Boolean forAll;
				while (true) {
					if (!ITERATOR__1_5.hasNext()) {
						if (accumulator == null) {
							forAll = null;
						}
						else if (accumulator == ValueUtil.TRUE_VALUE) {
							forAll = ValueUtil.TRUE_VALUE;
						}
						else {
							throw (InvalidValueException)accumulator;
						}
						break;
					}
					/*@NonInvalid*/ TRequirement _1_5 = (TRequirement)ITERATOR__1_5.next();
					/**
					 *
					 * self.typeRef.oclAsType(TNodeType).requirementDefinitions <> null and
					 * self.typeRef.oclAsType(TNodeType)
					 * .requirementDefinitions.requirementDefinition->collect(requirementTypeRef)
					 * ->includes(typeRef) or
					 * self.typeRef.oclAsType(TNodeType)
					 * ->closure(
					 *   if derivedFrom <> null
					 *   then derivedFrom.referencedEntityType
					 *   else null
					 *   endif)
					 * ->select(et | et <> null)
					 * ->collect(oclAsType(TNodeType))
					 * ->collect(requirementDefinitions)
					 * ->select(cd | cd <> null)
					 * ->collect(requirementDefinition.requirementTypeRef)
					 * ->includes(typeRef)
					 */
					final /*@NonInvalid*/ StandardLibrary standardLibrary = idResolver.getStandardLibrary();
					/*@Caught*/ /*@Nullable*/ Object CAUGHT_or;
					try {
						/*@Caught*/ /*@Nullable*/ Object CAUGHT_and_0;
						try {
							/*@Caught*/ /*@NonNull*/ Object CAUGHT_ne_0;
							try {
								final /*@NonInvalid*/ org.eclipse.ocl.pivot.Class TYP_tosca_c_c_TNodeType_1 = idResolver.getClass(ToscaTables.CLSSid_TNodeType, null);
								final /*@NonInvalid*/ TEntityType typeRef_0 = this.getTypeRef();
								final /*@Thrown*/ TNodeType oclAsType = ClassUtil.nonNullState((TNodeType)OclAnyOclAsTypeOperation.INSTANCE.evaluate(executor, typeRef_0, TYP_tosca_c_c_TNodeType_1));
								final /*@Thrown*/ RequirementDefinitionsType1 requirementDefinitions = oclAsType.getRequirementDefinitions();
								final /*@Thrown*/ boolean ne_0 = requirementDefinitions != null;
								CAUGHT_ne_0 = ne_0;
							}
							catch (Exception e) {
								CAUGHT_ne_0 = ValueUtil.createInvalidValue(e);
							}
							/*@Caught*/ /*@NonNull*/ Object CAUGHT_includes;
							try {
								final /*@NonInvalid*/ org.eclipse.ocl.pivot.Class TYP_tosca_c_c_TNodeType_2 = idResolver.getClass(ToscaTables.CLSSid_TNodeType, null);
								final /*@NonInvalid*/ TEntityType typeRef_1 = this.getTypeRef();
								final /*@Thrown*/ TNodeType oclAsType_0 = ClassUtil.nonNullState((TNodeType)OclAnyOclAsTypeOperation.INSTANCE.evaluate(executor, typeRef_1, TYP_tosca_c_c_TNodeType_2));
								final /*@Thrown*/ RequirementDefinitionsType1 requirementDefinitions_0 = oclAsType_0.getRequirementDefinitions();
								if (requirementDefinitions_0 == null) {
									throw new InvalidValueException("Null source for \'\'http://oco.cs.ugoe.de/tosca\'::RequirementDefinitionsType1::requirementDefinition\'");
								}
								final /*@Thrown*/ List<TRequirementDefinition> requirementDefinition = requirementDefinitions_0.getRequirementDefinition();
								final /*@Thrown*/ OrderedSetValue BOXED_requirementDefinition = idResolver.createOrderedSetOfAll(ToscaTables.ORD_CLSSid_TRequirementDefinition, requirementDefinition);
								/*@Thrown*/ SequenceValue.Accumulator accumulator_0 = ValueUtil.createSequenceAccumulatorValue(ToscaTables.SEQ_CLSSid_TRequirementType);
								/*@NonNull*/ Iterator<Object> ITERATOR__1 = BOXED_requirementDefinition.iterator();
								/*@Thrown*/ SequenceValue collect;
								while (true) {
									if (!ITERATOR__1.hasNext()) {
										collect = accumulator_0;
										break;
									}
									/*@NonInvalid*/ TRequirementDefinition _1 = (TRequirementDefinition)ITERATOR__1.next();
									/**
									 * requirementTypeRef
									 */
									final /*@NonInvalid*/ TRequirementType requirementTypeRef = _1.getRequirementTypeRef();
									//
									accumulator_0.add(requirementTypeRef);
								}
								final /*@NonInvalid*/ TEntityType typeRef_2 = _1_5.getTypeRef();
								final /*@Thrown*/ boolean includes = CollectionIncludesOperation.INSTANCE.evaluate(collect, typeRef_2).booleanValue();
								CAUGHT_includes = includes;
							}
							catch (Exception e) {
								CAUGHT_includes = ValueUtil.createInvalidValue(e);
							}
							final /*@Thrown*/ Boolean and_0 = BooleanAndOperation.INSTANCE.evaluate(CAUGHT_ne_0, CAUGHT_includes);
							CAUGHT_and_0 = and_0;
						}
						catch (Exception e) {
							CAUGHT_and_0 = ValueUtil.createInvalidValue(e);
						}
						/*@Caught*/ /*@NonNull*/ Object CAUGHT_includes_0;
						try {
							final /*@NonInvalid*/ org.eclipse.ocl.pivot.Class TYP_tosca_c_c_TNodeType_4 = idResolver.getClass(ToscaTables.CLSSid_TNodeType, null);
							final /*@NonInvalid*/ TEntityType typeRef_3 = this.getTypeRef();
							final /*@Thrown*/ TNodeType oclAsType_1 = ClassUtil.nonNullState((TNodeType)OclAnyOclAsTypeOperation.INSTANCE.evaluate(executor, typeRef_3, TYP_tosca_c_c_TNodeType_4));
							final /*@Thrown*/ SetValue oclAsSet = OclAnyOclAsSetOperation.INSTANCE.evaluate(executor, ToscaTables.SET_CLSSid_TNodeType, oclAsType_1);
							final org.eclipse.ocl.pivot.Class TYPE_closure_0 = executor.getStaticTypeOf(oclAsSet);
							final LibraryIteration.LibraryIterationExtension IMPL_closure_0 = (LibraryIteration.LibraryIterationExtension)TYPE_closure_0.lookupImplementation(standardLibrary, OCLstdlibTables.Operations._Set__closure);
							final /*@NonNull*/ Object ACC_closure_0 = IMPL_closure_0.createAccumulatorValue(executor, ToscaTables.SET_CLSSid_TNodeType, ToscaTables.CLSSid_TEntityType);
							/**
							 * Implementation of the iterator body.
							 */
							final /*@NonNull*/ AbstractBinaryOperation BODY_closure_0 = new AbstractBinaryOperation() {
								/**
								 *
								 * if derivedFrom <> null
								 * then derivedFrom.referencedEntityType
								 * else null
								 * endif
								 */
								@Override
								public /*@Nullable*/ Object evaluate(final /*@NonNull*/ Executor executor, final /*@NonNull*/ TypeId typeId, final /*@Nullable*/ Object oclAsSet, final /*@NonInvalid*/ Object _1_0) {
									final /*@NonInvalid*/ TNodeType symbol_0 = (TNodeType)_1_0;
									if (symbol_0 == null) {
										throw new InvalidValueException("Null source for \'\'http://oco.cs.ugoe.de/tosca\'::TEntityType::derivedFrom\'");
									}
									final /*@Thrown*/ DerivedFromType2 derivedFrom = symbol_0.getDerivedFrom();
									final /*@Thrown*/ boolean ne_1 = derivedFrom != null;
									/*@Thrown*/ TEntityType symbol_2;
									if (ne_1) {
										if (derivedFrom == null) {
											throw new InvalidValueException("Null source for \'\'http://oco.cs.ugoe.de/tosca\'::DerivedFromType2::referencedEntityType\'");
										}
										final /*@Thrown*/ TEntityType referencedEntityType = derivedFrom.getReferencedEntityType();
										symbol_2 = referencedEntityType;
									}
									else {
										symbol_2 = null;
									}
									return symbol_2;
								}
							};
							final /*@NonNull*/  ExecutorSingleIterationManager MGR_closure_0 = new ExecutorSingleIterationManager(executor, ToscaTables.SET_CLSSid_TNodeType, BODY_closure_0, oclAsSet, ACC_closure_0);
							final /*@Thrown*/ SetValue closure = ClassUtil.nonNullState((SetValue)IMPL_closure_0.evaluateIteration(MGR_closure_0));
							/*@Thrown*/ SetValue.Accumulator accumulator_1 = ValueUtil.createSetAccumulatorValue(ToscaTables.SET_CLSSid_TNodeType);
							/*@Nullable*/ Iterator<Object> ITERATOR_et = closure.iterator();
							/*@Thrown*/ SetValue select_0;
							while (true) {
								if (!ITERATOR_et.hasNext()) {
									select_0 = accumulator_1;
									break;
								}
								/*@NonInvalid*/ TNodeType et = (TNodeType)ITERATOR_et.next();
								/**
								 * et <> null
								 */
								final /*@NonInvalid*/ boolean ne_2 = et != null;
								//
								if (ne_2 == ValueUtil.TRUE_VALUE) {
									accumulator_1.add(et);
								}
							}
							/*@Thrown*/ BagValue.Accumulator accumulator_2 = ValueUtil.createBagAccumulatorValue(ToscaTables.BAG_CLSSid_TNodeType);
							/*@Nullable*/ Iterator<Object> ITERATOR__1_1 = select_0.iterator();
							/*@Thrown*/ BagValue collect_2;
							while (true) {
								if (!ITERATOR__1_1.hasNext()) {
									collect_2 = accumulator_2;
									break;
								}
								/*@NonInvalid*/ TNodeType _1_1 = (TNodeType)ITERATOR__1_1.next();
								/**
								 * oclAsType(TNodeType)
								 */
								final /*@Thrown*/ TNodeType oclAsType_2 = ClassUtil.nonNullState((TNodeType)OclAnyOclAsTypeOperation.INSTANCE.evaluate(executor, _1_1, TYP_tosca_c_c_TNodeType_4));
								//
								accumulator_2.add(oclAsType_2);
							}
							/*@Thrown*/ BagValue.Accumulator accumulator_3 = ValueUtil.createBagAccumulatorValue(ToscaTables.BAG_CLSSid_RequirementDefinitionsType1);
							/*@NonNull*/ Iterator<Object> ITERATOR__1_2 = collect_2.iterator();
							/*@Thrown*/ BagValue collect_1;
							while (true) {
								if (!ITERATOR__1_2.hasNext()) {
									collect_1 = accumulator_3;
									break;
								}
								/*@NonInvalid*/ TNodeType _1_2 = (TNodeType)ITERATOR__1_2.next();
								/**
								 * requirementDefinitions
								 */
								final /*@NonInvalid*/ RequirementDefinitionsType1 requirementDefinitions_1 = _1_2.getRequirementDefinitions();
								//
								accumulator_3.add(requirementDefinitions_1);
							}
							/*@Thrown*/ BagValue.Accumulator accumulator_4 = ValueUtil.createBagAccumulatorValue(ToscaTables.BAG_CLSSid_RequirementDefinitionsType1);
							/*@Nullable*/ Iterator<Object> ITERATOR_cd = collect_1.iterator();
							/*@Thrown*/ BagValue select;
							while (true) {
								if (!ITERATOR_cd.hasNext()) {
									select = accumulator_4;
									break;
								}
								/*@NonInvalid*/ RequirementDefinitionsType1 cd = (RequirementDefinitionsType1)ITERATOR_cd.next();
								/**
								 * cd <> null
								 */
								final /*@NonInvalid*/ boolean ne_3 = cd != null;
								//
								if (ne_3 == ValueUtil.TRUE_VALUE) {
									accumulator_4.add(cd);
								}
							}
							/*@Thrown*/ BagValue.Accumulator accumulator_5 = ValueUtil.createBagAccumulatorValue(ToscaTables.BAG_CLSSid_TRequirementType);
							/*@Nullable*/ Iterator<Object> ITERATOR__1_4 = select.iterator();
							/*@Thrown*/ BagValue collect_0;
							while (true) {
								if (!ITERATOR__1_4.hasNext()) {
									collect_0 = accumulator_5;
									break;
								}
								/*@NonInvalid*/ RequirementDefinitionsType1 _1_4 = (RequirementDefinitionsType1)ITERATOR__1_4.next();
								/**
								 * requirementDefinition.requirementTypeRef
								 */
								if (_1_4 == null) {
									throw new InvalidValueException("Null source for \'\'http://oco.cs.ugoe.de/tosca\'::RequirementDefinitionsType1::requirementDefinition\'");
								}
								final /*@Thrown*/ List<TRequirementDefinition> requirementDefinition_0 = _1_4.getRequirementDefinition();
								final /*@Thrown*/ OrderedSetValue BOXED_requirementDefinition_0 = idResolver.createOrderedSetOfAll(ToscaTables.ORD_CLSSid_TRequirementDefinition, requirementDefinition_0);
								/*@Thrown*/ SequenceValue.Accumulator accumulator_6 = ValueUtil.createSequenceAccumulatorValue(ToscaTables.SEQ_CLSSid_TRequirementType);
								/*@NonNull*/ Iterator<Object> ITERATOR__1_3 = BOXED_requirementDefinition_0.iterator();
								/*@Thrown*/ SequenceValue collect_3;
								while (true) {
									if (!ITERATOR__1_3.hasNext()) {
										collect_3 = accumulator_6;
										break;
									}
									/*@NonInvalid*/ TRequirementDefinition _1_3 = (TRequirementDefinition)ITERATOR__1_3.next();
									/**
									 * requirementTypeRef
									 */
									final /*@NonInvalid*/ TRequirementType requirementTypeRef_0 = _1_3.getRequirementTypeRef();
									//
									accumulator_6.add(requirementTypeRef_0);
								}
								//
								for (Object value : collect_3.flatten().getElements()) {
									accumulator_5.add(value);
								}
							}
							final /*@NonInvalid*/ TEntityType typeRef_4 = _1_5.getTypeRef();
							final /*@Thrown*/ boolean includes_0 = CollectionIncludesOperation.INSTANCE.evaluate(collect_0, typeRef_4).booleanValue();
							CAUGHT_includes_0 = includes_0;
						}
						catch (Exception e) {
							CAUGHT_includes_0 = ValueUtil.createInvalidValue(e);
						}
						final /*@Thrown*/ Boolean or = BooleanOrOperation.INSTANCE.evaluate(CAUGHT_and_0, CAUGHT_includes_0);
						CAUGHT_or = or;
					}
					catch (Exception e) {
						CAUGHT_or = ValueUtil.createInvalidValue(e);
					}
					//
					if (CAUGHT_or == ValueUtil.FALSE_VALUE) {					// Normal unsuccessful body evaluation result
						forAll = ValueUtil.FALSE_VALUE;
						break;														// Stop immediately
					}
					else if (CAUGHT_or == ValueUtil.TRUE_VALUE) {				// Normal successful body evaluation result
						;															// Carry on
					}
					else if (CAUGHT_or == null) {								// Abnormal null body evaluation result
						if (accumulator == ValueUtil.TRUE_VALUE) {
							accumulator = null;										// Cache a null failure
						}
					}
					else if (CAUGHT_or instanceof InvalidValueException) {		// Abnormal exception evaluation result
						accumulator = CAUGHT_or;									// Cache an exception failure
					}
					else {															// Impossible badly typed result
						accumulator = new InvalidValueException(PivotMessages.NonBooleanBody, "forAll");
					}
				}
				if (forAll == null) {
					throw new InvalidValueException("Null if condition");
				}
				/*@NonInvalid*/ Boolean symbol_3;
				if (forAll) {
					symbol_3 = ValueUtil.TRUE_VALUE;
				}
				else {
					symbol_3 = null;
				}
				result = symbol_3;
			}
			else {
				result = ValueUtil.TRUE_VALUE;
			}
			final /*@NonInvalid*/ boolean logDiagnostic = CGStringLogDiagnosticOperation.INSTANCE.evaluate(executor, TypeId.BOOLEAN, ToscaTables.STR_TNodeTemplate_c_c_requirementsMustBeDefinedInReferencedNodeType, this, (Object)null, diagnostics, context, (Object)null, severity_0, result, ToscaTables.INT_0).booleanValue();
			symbol_4 = logDiagnostic;
		}
		return Boolean.TRUE == symbol_4;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean typeMustBeNodeType(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		/**
		 *
		 * inv typeMustBeNodeType:
		 *   let
		 *     severity : Integer[1] = 'TNodeTemplate::typeMustBeNodeType'.getSeverity()
		 *   in
		 *     if severity <= 0
		 *     then true
		 *     else
		 *       let
		 *         result : type::Boolean[1] = self.typeRef.oclIsKindOf(TNodeType)
		 *       in
		 *         'TNodeTemplate::typeMustBeNodeType'.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
		 *     endif
		 */
		final /*@NonInvalid*/ Executor executor = PivotUtilInternal.getExecutor(this);
		final /*@NonInvalid*/ IdResolver idResolver = executor.getIdResolver();
		final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor, ToscaTables.STR_TNodeTemplate_c_c_typeMustBeNodeType);
		final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE.evaluate(executor, severity_0, ToscaTables.INT_0).booleanValue();
		/*@NonInvalid*/ boolean symbol_0;
		if (le) {
			symbol_0 = ValueUtil.TRUE_VALUE;
		}
		else {
			/*@Caught*/ /*@NonNull*/ Object CAUGHT_result;
			try {
				final /*@NonInvalid*/ org.eclipse.ocl.pivot.Class TYP_tosca_c_c_TNodeType = idResolver.getClass(ToscaTables.CLSSid_TNodeType, null);
				final /*@NonInvalid*/ TEntityType typeRef = this.getTypeRef();
				final /*@Thrown*/ boolean result = OclAnyOclIsKindOfOperation.INSTANCE.evaluate(executor, typeRef, TYP_tosca_c_c_TNodeType).booleanValue();
				CAUGHT_result = result;
			}
			catch (Exception e) {
				CAUGHT_result = ValueUtil.createInvalidValue(e);
			}
			final /*@NonInvalid*/ boolean logDiagnostic = CGStringLogDiagnosticOperation.INSTANCE.evaluate(executor, TypeId.BOOLEAN, ToscaTables.STR_TNodeTemplate_c_c_typeMustBeNodeType, this, (Object)null, diagnostics, context, (Object)null, severity_0, CAUGHT_result, ToscaTables.INT_0).booleanValue();
			symbol_0 = logDiagnostic;
		}
		return Boolean.TRUE == symbol_0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean capabilitiesMustBeDefinedInReferencedNodeType(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		/**
		 *
		 * inv capabilitiesMustBeDefinedInReferencedNodeType:
		 *   let
		 *     severity : Integer[1] = 'TNodeTemplate::capabilitiesMustBeDefinedInReferencedNodeType'.getSeverity()
		 *   in
		 *     if severity <= 0
		 *     then true
		 *     else
		 *       let
		 *         result : type::Boolean[?] = if
		 *           self.typeRef.oclIsKindOf(TNodeType) and self.capabilities <> null
		 *         then
		 *           if
		 *             self.capabilities.capability->forAll(
		 *               self.typeRef.oclAsType(TNodeType).capabilityDefinitions <> null and
		 *               self.typeRef.oclAsType(TNodeType)
		 *               .capabilityDefinitions.capabilityDefinition->collect(capabilityTypeRef)
		 *               ->includes(typeRef) or
		 *               self.typeRef.oclAsType(TNodeType)
		 *               ->closure(
		 *                 if derivedFrom <> null
		 *                 then derivedFrom.referencedEntityType
		 *                 else null
		 *                 endif)
		 *               ->select(et | et <> null)
		 *               ->collect(oclAsType(TNodeType))
		 *               ->collect(capabilityDefinitions)
		 *               ->select(cd | cd <> null)
		 *               ->collect(capabilityDefinition.capabilityTypeRef)
		 *               ->includes(typeRef))
		 *           then true
		 *           else null
		 *           endif
		 *         else true
		 *         endif
		 *       in
		 *         'TNodeTemplate::capabilitiesMustBeDefinedInReferencedNodeType'.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
		 *     endif
		 */
		final /*@NonInvalid*/ Executor executor = PivotUtilInternal.getExecutor(this);
		final /*@NonInvalid*/ IdResolver idResolver = executor.getIdResolver();
		final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor, ToscaTables.STR_TNodeTemplate_c_c_capabilitiesMustBeDefinedInReferencedNodeType);
		final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE.evaluate(executor, severity_0, ToscaTables.INT_0).booleanValue();
		/*@NonInvalid*/ boolean symbol_4;
		if (le) {
			symbol_4 = ValueUtil.TRUE_VALUE;
		}
		else {
			final /*@NonInvalid*/ CapabilitiesType capabilities = this.getCapabilities();
			/*@Caught*/ /*@NonNull*/ Object CAUGHT_oclIsKindOf;
			try {
				final /*@NonInvalid*/ org.eclipse.ocl.pivot.Class TYP_tosca_c_c_TNodeType_0 = idResolver.getClass(ToscaTables.CLSSid_TNodeType, null);
				final /*@NonInvalid*/ TEntityType typeRef = this.getTypeRef();
				final /*@Thrown*/ boolean oclIsKindOf = OclAnyOclIsKindOfOperation.INSTANCE.evaluate(executor, typeRef, TYP_tosca_c_c_TNodeType_0).booleanValue();
				CAUGHT_oclIsKindOf = oclIsKindOf;
			}
			catch (Exception e) {
				CAUGHT_oclIsKindOf = ValueUtil.createInvalidValue(e);
			}
			final /*@NonInvalid*/ boolean ne = capabilities != null;
			final /*@Thrown*/ Boolean and = BooleanAndOperation.INSTANCE.evaluate(CAUGHT_oclIsKindOf, ne);
			if (and == null) {
				throw new InvalidValueException("Null if condition");
			}
			/*@NonInvalid*/ Boolean result;
			if (and) {
				if (capabilities == null) {
					throw new InvalidValueException("Null source for \'\'http://oco.cs.ugoe.de/tosca\'::CapabilitiesType::capability\'");
				}
				final /*@Thrown*/ List<TCapability> capability = capabilities.getCapability();
				final /*@Thrown*/ OrderedSetValue BOXED_capability = idResolver.createOrderedSetOfAll(ToscaTables.ORD_CLSSid_TCapability, capability);
				/*@Thrown*/ Object accumulator = ValueUtil.TRUE_VALUE;
				/*@NonNull*/ Iterator<Object> ITERATOR__1_5 = BOXED_capability.iterator();
				/*@Thrown*/ Boolean forAll;
				while (true) {
					if (!ITERATOR__1_5.hasNext()) {
						if (accumulator == null) {
							forAll = null;
						}
						else if (accumulator == ValueUtil.TRUE_VALUE) {
							forAll = ValueUtil.TRUE_VALUE;
						}
						else {
							throw (InvalidValueException)accumulator;
						}
						break;
					}
					/*@NonInvalid*/ TCapability _1_5 = (TCapability)ITERATOR__1_5.next();
					/**
					 *
					 * self.typeRef.oclAsType(TNodeType).capabilityDefinitions <> null and
					 * self.typeRef.oclAsType(TNodeType)
					 * .capabilityDefinitions.capabilityDefinition->collect(capabilityTypeRef)
					 * ->includes(typeRef) or
					 * self.typeRef.oclAsType(TNodeType)
					 * ->closure(
					 *   if derivedFrom <> null
					 *   then derivedFrom.referencedEntityType
					 *   else null
					 *   endif)
					 * ->select(et | et <> null)
					 * ->collect(oclAsType(TNodeType))
					 * ->collect(capabilityDefinitions)
					 * ->select(cd | cd <> null)
					 * ->collect(capabilityDefinition.capabilityTypeRef)
					 * ->includes(typeRef)
					 */
					final /*@NonInvalid*/ StandardLibrary standardLibrary = idResolver.getStandardLibrary();
					/*@Caught*/ /*@Nullable*/ Object CAUGHT_or;
					try {
						/*@Caught*/ /*@Nullable*/ Object CAUGHT_and_0;
						try {
							/*@Caught*/ /*@NonNull*/ Object CAUGHT_ne_0;
							try {
								final /*@NonInvalid*/ org.eclipse.ocl.pivot.Class TYP_tosca_c_c_TNodeType_1 = idResolver.getClass(ToscaTables.CLSSid_TNodeType, null);
								final /*@NonInvalid*/ TEntityType typeRef_0 = this.getTypeRef();
								final /*@Thrown*/ TNodeType oclAsType = ClassUtil.nonNullState((TNodeType)OclAnyOclAsTypeOperation.INSTANCE.evaluate(executor, typeRef_0, TYP_tosca_c_c_TNodeType_1));
								final /*@Thrown*/ CapabilityDefinitionsType1 capabilityDefinitions = oclAsType.getCapabilityDefinitions();
								final /*@Thrown*/ boolean ne_0 = capabilityDefinitions != null;
								CAUGHT_ne_0 = ne_0;
							}
							catch (Exception e) {
								CAUGHT_ne_0 = ValueUtil.createInvalidValue(e);
							}
							/*@Caught*/ /*@NonNull*/ Object CAUGHT_includes;
							try {
								final /*@NonInvalid*/ org.eclipse.ocl.pivot.Class TYP_tosca_c_c_TNodeType_2 = idResolver.getClass(ToscaTables.CLSSid_TNodeType, null);
								final /*@NonInvalid*/ TEntityType typeRef_1 = this.getTypeRef();
								final /*@Thrown*/ TNodeType oclAsType_0 = ClassUtil.nonNullState((TNodeType)OclAnyOclAsTypeOperation.INSTANCE.evaluate(executor, typeRef_1, TYP_tosca_c_c_TNodeType_2));
								final /*@Thrown*/ CapabilityDefinitionsType1 capabilityDefinitions_0 = oclAsType_0.getCapabilityDefinitions();
								if (capabilityDefinitions_0 == null) {
									throw new InvalidValueException("Null source for \'\'http://oco.cs.ugoe.de/tosca\'::CapabilityDefinitionsType1::capabilityDefinition\'");
								}
								final /*@Thrown*/ List<TCapabilityDefinition> capabilityDefinition = capabilityDefinitions_0.getCapabilityDefinition();
								final /*@Thrown*/ OrderedSetValue BOXED_capabilityDefinition = idResolver.createOrderedSetOfAll(ToscaTables.ORD_CLSSid_TCapabilityDefinition, capabilityDefinition);
								/*@Thrown*/ SequenceValue.Accumulator accumulator_0 = ValueUtil.createSequenceAccumulatorValue(ToscaTables.SEQ_CLSSid_TCapabilityType);
								/*@NonNull*/ Iterator<Object> ITERATOR__1 = BOXED_capabilityDefinition.iterator();
								/*@Thrown*/ SequenceValue collect;
								while (true) {
									if (!ITERATOR__1.hasNext()) {
										collect = accumulator_0;
										break;
									}
									/*@NonInvalid*/ TCapabilityDefinition _1 = (TCapabilityDefinition)ITERATOR__1.next();
									/**
									 * capabilityTypeRef
									 */
									final /*@NonInvalid*/ TCapabilityType capabilityTypeRef = _1.getCapabilityTypeRef();
									//
									accumulator_0.add(capabilityTypeRef);
								}
								final /*@NonInvalid*/ TEntityType typeRef_2 = _1_5.getTypeRef();
								final /*@Thrown*/ boolean includes = CollectionIncludesOperation.INSTANCE.evaluate(collect, typeRef_2).booleanValue();
								CAUGHT_includes = includes;
							}
							catch (Exception e) {
								CAUGHT_includes = ValueUtil.createInvalidValue(e);
							}
							final /*@Thrown*/ Boolean and_0 = BooleanAndOperation.INSTANCE.evaluate(CAUGHT_ne_0, CAUGHT_includes);
							CAUGHT_and_0 = and_0;
						}
						catch (Exception e) {
							CAUGHT_and_0 = ValueUtil.createInvalidValue(e);
						}
						/*@Caught*/ /*@NonNull*/ Object CAUGHT_includes_0;
						try {
							final /*@NonInvalid*/ org.eclipse.ocl.pivot.Class TYP_tosca_c_c_TNodeType_4 = idResolver.getClass(ToscaTables.CLSSid_TNodeType, null);
							final /*@NonInvalid*/ TEntityType typeRef_3 = this.getTypeRef();
							final /*@Thrown*/ TNodeType oclAsType_1 = ClassUtil.nonNullState((TNodeType)OclAnyOclAsTypeOperation.INSTANCE.evaluate(executor, typeRef_3, TYP_tosca_c_c_TNodeType_4));
							final /*@Thrown*/ SetValue oclAsSet = OclAnyOclAsSetOperation.INSTANCE.evaluate(executor, ToscaTables.SET_CLSSid_TNodeType, oclAsType_1);
							final org.eclipse.ocl.pivot.Class TYPE_closure_0 = executor.getStaticTypeOf(oclAsSet);
							final LibraryIteration.LibraryIterationExtension IMPL_closure_0 = (LibraryIteration.LibraryIterationExtension)TYPE_closure_0.lookupImplementation(standardLibrary, OCLstdlibTables.Operations._Set__closure);
							final /*@NonNull*/ Object ACC_closure_0 = IMPL_closure_0.createAccumulatorValue(executor, ToscaTables.SET_CLSSid_TNodeType, ToscaTables.CLSSid_TEntityType);
							/**
							 * Implementation of the iterator body.
							 */
							final /*@NonNull*/ AbstractBinaryOperation BODY_closure_0 = new AbstractBinaryOperation() {
								/**
								 *
								 * if derivedFrom <> null
								 * then derivedFrom.referencedEntityType
								 * else null
								 * endif
								 */
								@Override
								public /*@Nullable*/ Object evaluate(final /*@NonNull*/ Executor executor, final /*@NonNull*/ TypeId typeId, final /*@Nullable*/ Object oclAsSet, final /*@NonInvalid*/ Object _1_0) {
									final /*@NonInvalid*/ TNodeType symbol_0 = (TNodeType)_1_0;
									if (symbol_0 == null) {
										throw new InvalidValueException("Null source for \'\'http://oco.cs.ugoe.de/tosca\'::TEntityType::derivedFrom\'");
									}
									final /*@Thrown*/ DerivedFromType2 derivedFrom = symbol_0.getDerivedFrom();
									final /*@Thrown*/ boolean ne_1 = derivedFrom != null;
									/*@Thrown*/ TEntityType symbol_2;
									if (ne_1) {
										if (derivedFrom == null) {
											throw new InvalidValueException("Null source for \'\'http://oco.cs.ugoe.de/tosca\'::DerivedFromType2::referencedEntityType\'");
										}
										final /*@Thrown*/ TEntityType referencedEntityType = derivedFrom.getReferencedEntityType();
										symbol_2 = referencedEntityType;
									}
									else {
										symbol_2 = null;
									}
									return symbol_2;
								}
							};
							final /*@NonNull*/  ExecutorSingleIterationManager MGR_closure_0 = new ExecutorSingleIterationManager(executor, ToscaTables.SET_CLSSid_TNodeType, BODY_closure_0, oclAsSet, ACC_closure_0);
							final /*@Thrown*/ SetValue closure = ClassUtil.nonNullState((SetValue)IMPL_closure_0.evaluateIteration(MGR_closure_0));
							/*@Thrown*/ SetValue.Accumulator accumulator_1 = ValueUtil.createSetAccumulatorValue(ToscaTables.SET_CLSSid_TNodeType);
							/*@Nullable*/ Iterator<Object> ITERATOR_et = closure.iterator();
							/*@Thrown*/ SetValue select_0;
							while (true) {
								if (!ITERATOR_et.hasNext()) {
									select_0 = accumulator_1;
									break;
								}
								/*@NonInvalid*/ TNodeType et = (TNodeType)ITERATOR_et.next();
								/**
								 * et <> null
								 */
								final /*@NonInvalid*/ boolean ne_2 = et != null;
								//
								if (ne_2 == ValueUtil.TRUE_VALUE) {
									accumulator_1.add(et);
								}
							}
							/*@Thrown*/ BagValue.Accumulator accumulator_2 = ValueUtil.createBagAccumulatorValue(ToscaTables.BAG_CLSSid_TNodeType);
							/*@Nullable*/ Iterator<Object> ITERATOR__1_1 = select_0.iterator();
							/*@Thrown*/ BagValue collect_2;
							while (true) {
								if (!ITERATOR__1_1.hasNext()) {
									collect_2 = accumulator_2;
									break;
								}
								/*@NonInvalid*/ TNodeType _1_1 = (TNodeType)ITERATOR__1_1.next();
								/**
								 * oclAsType(TNodeType)
								 */
								final /*@Thrown*/ TNodeType oclAsType_2 = ClassUtil.nonNullState((TNodeType)OclAnyOclAsTypeOperation.INSTANCE.evaluate(executor, _1_1, TYP_tosca_c_c_TNodeType_4));
								//
								accumulator_2.add(oclAsType_2);
							}
							/*@Thrown*/ BagValue.Accumulator accumulator_3 = ValueUtil.createBagAccumulatorValue(ToscaTables.BAG_CLSSid_CapabilityDefinitionsType1);
							/*@NonNull*/ Iterator<Object> ITERATOR__1_2 = collect_2.iterator();
							/*@Thrown*/ BagValue collect_1;
							while (true) {
								if (!ITERATOR__1_2.hasNext()) {
									collect_1 = accumulator_3;
									break;
								}
								/*@NonInvalid*/ TNodeType _1_2 = (TNodeType)ITERATOR__1_2.next();
								/**
								 * capabilityDefinitions
								 */
								final /*@NonInvalid*/ CapabilityDefinitionsType1 capabilityDefinitions_1 = _1_2.getCapabilityDefinitions();
								//
								accumulator_3.add(capabilityDefinitions_1);
							}
							/*@Thrown*/ BagValue.Accumulator accumulator_4 = ValueUtil.createBagAccumulatorValue(ToscaTables.BAG_CLSSid_CapabilityDefinitionsType1);
							/*@Nullable*/ Iterator<Object> ITERATOR_cd = collect_1.iterator();
							/*@Thrown*/ BagValue select;
							while (true) {
								if (!ITERATOR_cd.hasNext()) {
									select = accumulator_4;
									break;
								}
								/*@NonInvalid*/ CapabilityDefinitionsType1 cd = (CapabilityDefinitionsType1)ITERATOR_cd.next();
								/**
								 * cd <> null
								 */
								final /*@NonInvalid*/ boolean ne_3 = cd != null;
								//
								if (ne_3 == ValueUtil.TRUE_VALUE) {
									accumulator_4.add(cd);
								}
							}
							/*@Thrown*/ BagValue.Accumulator accumulator_5 = ValueUtil.createBagAccumulatorValue(ToscaTables.BAG_CLSSid_TCapabilityType);
							/*@Nullable*/ Iterator<Object> ITERATOR__1_4 = select.iterator();
							/*@Thrown*/ BagValue collect_0;
							while (true) {
								if (!ITERATOR__1_4.hasNext()) {
									collect_0 = accumulator_5;
									break;
								}
								/*@NonInvalid*/ CapabilityDefinitionsType1 _1_4 = (CapabilityDefinitionsType1)ITERATOR__1_4.next();
								/**
								 * capabilityDefinition.capabilityTypeRef
								 */
								if (_1_4 == null) {
									throw new InvalidValueException("Null source for \'\'http://oco.cs.ugoe.de/tosca\'::CapabilityDefinitionsType1::capabilityDefinition\'");
								}
								final /*@Thrown*/ List<TCapabilityDefinition> capabilityDefinition_0 = _1_4.getCapabilityDefinition();
								final /*@Thrown*/ OrderedSetValue BOXED_capabilityDefinition_0 = idResolver.createOrderedSetOfAll(ToscaTables.ORD_CLSSid_TCapabilityDefinition, capabilityDefinition_0);
								/*@Thrown*/ SequenceValue.Accumulator accumulator_6 = ValueUtil.createSequenceAccumulatorValue(ToscaTables.SEQ_CLSSid_TCapabilityType);
								/*@NonNull*/ Iterator<Object> ITERATOR__1_3 = BOXED_capabilityDefinition_0.iterator();
								/*@Thrown*/ SequenceValue collect_3;
								while (true) {
									if (!ITERATOR__1_3.hasNext()) {
										collect_3 = accumulator_6;
										break;
									}
									/*@NonInvalid*/ TCapabilityDefinition _1_3 = (TCapabilityDefinition)ITERATOR__1_3.next();
									/**
									 * capabilityTypeRef
									 */
									final /*@NonInvalid*/ TCapabilityType capabilityTypeRef_0 = _1_3.getCapabilityTypeRef();
									//
									accumulator_6.add(capabilityTypeRef_0);
								}
								//
								for (Object value : collect_3.flatten().getElements()) {
									accumulator_5.add(value);
								}
							}
							final /*@NonInvalid*/ TEntityType typeRef_4 = _1_5.getTypeRef();
							final /*@Thrown*/ boolean includes_0 = CollectionIncludesOperation.INSTANCE.evaluate(collect_0, typeRef_4).booleanValue();
							CAUGHT_includes_0 = includes_0;
						}
						catch (Exception e) {
							CAUGHT_includes_0 = ValueUtil.createInvalidValue(e);
						}
						final /*@Thrown*/ Boolean or = BooleanOrOperation.INSTANCE.evaluate(CAUGHT_and_0, CAUGHT_includes_0);
						CAUGHT_or = or;
					}
					catch (Exception e) {
						CAUGHT_or = ValueUtil.createInvalidValue(e);
					}
					//
					if (CAUGHT_or == ValueUtil.FALSE_VALUE) {					// Normal unsuccessful body evaluation result
						forAll = ValueUtil.FALSE_VALUE;
						break;														// Stop immediately
					}
					else if (CAUGHT_or == ValueUtil.TRUE_VALUE) {				// Normal successful body evaluation result
						;															// Carry on
					}
					else if (CAUGHT_or == null) {								// Abnormal null body evaluation result
						if (accumulator == ValueUtil.TRUE_VALUE) {
							accumulator = null;										// Cache a null failure
						}
					}
					else if (CAUGHT_or instanceof InvalidValueException) {		// Abnormal exception evaluation result
						accumulator = CAUGHT_or;									// Cache an exception failure
					}
					else {															// Impossible badly typed result
						accumulator = new InvalidValueException(PivotMessages.NonBooleanBody, "forAll");
					}
				}
				if (forAll == null) {
					throw new InvalidValueException("Null if condition");
				}
				/*@NonInvalid*/ Boolean symbol_3;
				if (forAll) {
					symbol_3 = ValueUtil.TRUE_VALUE;
				}
				else {
					symbol_3 = null;
				}
				result = symbol_3;
			}
			else {
				result = ValueUtil.TRUE_VALUE;
			}
			final /*@NonInvalid*/ boolean logDiagnostic = CGStringLogDiagnosticOperation.INSTANCE.evaluate(executor, TypeId.BOOLEAN, ToscaTables.STR_TNodeTemplate_c_c_capabilitiesMustBeDefinedInReferencedNodeType, this, (Object)null, diagnostics, context, (Object)null, severity_0, result, ToscaTables.INT_0).booleanValue();
			symbol_4 = logDiagnostic;
		}
		return Boolean.TRUE == symbol_4;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ToscaPackage.TNODE_TEMPLATE__REQUIREMENTS:
				return basicSetRequirements(null, msgs);
			case ToscaPackage.TNODE_TEMPLATE__CAPABILITIES:
				return basicSetCapabilities(null, msgs);
			case ToscaPackage.TNODE_TEMPLATE__POLICIES:
				return basicSetPolicies(null, msgs);
			case ToscaPackage.TNODE_TEMPLATE__DEPLOYMENT_ARTIFACTS:
				return basicSetDeploymentArtifacts(null, msgs);
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
			case ToscaPackage.TNODE_TEMPLATE__REQUIREMENTS:
				return getRequirements();
			case ToscaPackage.TNODE_TEMPLATE__CAPABILITIES:
				return getCapabilities();
			case ToscaPackage.TNODE_TEMPLATE__POLICIES:
				return getPolicies();
			case ToscaPackage.TNODE_TEMPLATE__DEPLOYMENT_ARTIFACTS:
				return getDeploymentArtifacts();
			case ToscaPackage.TNODE_TEMPLATE__MAX_INSTANCES:
				return getMaxInstances();
			case ToscaPackage.TNODE_TEMPLATE__MIN_INSTANCES:
				return getMinInstances();
			case ToscaPackage.TNODE_TEMPLATE__NAME:
				return getName();
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
			case ToscaPackage.TNODE_TEMPLATE__REQUIREMENTS:
				setRequirements((RequirementsType)newValue);
				return;
			case ToscaPackage.TNODE_TEMPLATE__CAPABILITIES:
				setCapabilities((CapabilitiesType)newValue);
				return;
			case ToscaPackage.TNODE_TEMPLATE__POLICIES:
				setPolicies((PoliciesType)newValue);
				return;
			case ToscaPackage.TNODE_TEMPLATE__DEPLOYMENT_ARTIFACTS:
				setDeploymentArtifacts((TDeploymentArtifacts)newValue);
				return;
			case ToscaPackage.TNODE_TEMPLATE__MAX_INSTANCES:
				setMaxInstances(newValue);
				return;
			case ToscaPackage.TNODE_TEMPLATE__MIN_INSTANCES:
				setMinInstances((Integer)newValue);
				return;
			case ToscaPackage.TNODE_TEMPLATE__NAME:
				setName((String)newValue);
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
			case ToscaPackage.TNODE_TEMPLATE__REQUIREMENTS:
				setRequirements((RequirementsType)null);
				return;
			case ToscaPackage.TNODE_TEMPLATE__CAPABILITIES:
				setCapabilities((CapabilitiesType)null);
				return;
			case ToscaPackage.TNODE_TEMPLATE__POLICIES:
				setPolicies((PoliciesType)null);
				return;
			case ToscaPackage.TNODE_TEMPLATE__DEPLOYMENT_ARTIFACTS:
				setDeploymentArtifacts((TDeploymentArtifacts)null);
				return;
			case ToscaPackage.TNODE_TEMPLATE__MAX_INSTANCES:
				unsetMaxInstances();
				return;
			case ToscaPackage.TNODE_TEMPLATE__MIN_INSTANCES:
				unsetMinInstances();
				return;
			case ToscaPackage.TNODE_TEMPLATE__NAME:
				setName(NAME_EDEFAULT);
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
			case ToscaPackage.TNODE_TEMPLATE__REQUIREMENTS:
				return requirements != null;
			case ToscaPackage.TNODE_TEMPLATE__CAPABILITIES:
				return capabilities != null;
			case ToscaPackage.TNODE_TEMPLATE__POLICIES:
				return policies != null;
			case ToscaPackage.TNODE_TEMPLATE__DEPLOYMENT_ARTIFACTS:
				return deploymentArtifacts != null;
			case ToscaPackage.TNODE_TEMPLATE__MAX_INSTANCES:
				return isSetMaxInstances();
			case ToscaPackage.TNODE_TEMPLATE__MIN_INSTANCES:
				return isSetMinInstances();
			case ToscaPackage.TNODE_TEMPLATE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
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
			case ToscaPackage.TNODE_TEMPLATE___TYPE_MUST_BE_NODE_TYPE__DIAGNOSTICCHAIN_MAP:
				return typeMustBeNodeType((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case ToscaPackage.TNODE_TEMPLATE___REQUIREMENTS_MUST_BE_DEFINED_IN_REFERENCED_NODE_TYPE__DIAGNOSTICCHAIN_MAP:
				return requirementsMustBeDefinedInReferencedNodeType((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case ToscaPackage.TNODE_TEMPLATE___CAPABILITIES_MUST_BE_DEFINED_IN_REFERENCED_NODE_TYPE__DIAGNOSTICCHAIN_MAP:
				return capabilitiesMustBeDefinedInReferencedNodeType((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
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
		result.append(" (maxInstances: ");
		if (maxInstancesESet) result.append(maxInstances); else result.append("<unset>");
		result.append(", minInstances: ");
		if (minInstancesESet) result.append(minInstances); else result.append("<unset>");
		result.append(", name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //TNodeTemplateImpl
