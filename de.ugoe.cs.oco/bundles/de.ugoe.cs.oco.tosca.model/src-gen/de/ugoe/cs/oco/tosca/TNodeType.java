/**
 */
package de.ugoe.cs.oco.tosca;

import java.util.Map;
import org.eclipse.emf.common.util.DiagnosticChain;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>TNode Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.ugoe.cs.oco.tosca.TNodeType#getRequirementDefinitions <em>Requirement Definitions</em>}</li>
 *   <li>{@link de.ugoe.cs.oco.tosca.TNodeType#getCapabilityDefinitions <em>Capability Definitions</em>}</li>
 *   <li>{@link de.ugoe.cs.oco.tosca.TNodeType#getInstanceStates <em>Instance States</em>}</li>
 *   <li>{@link de.ugoe.cs.oco.tosca.TNodeType#getInterfaces <em>Interfaces</em>}</li>
 * </ul>
 *
 * @see de.ugoe.cs.oco.tosca.ToscaPackage#getTNodeType()
 * @model extendedMetaData="name='tNodeType' kind='elementOnly'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore constraints='superTypeMustBeNodeType'"
 * @generated
 */
public interface TNodeType extends TEntityType {
	/**
	 * Returns the value of the '<em><b>Requirement Definitions</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Requirement Definitions</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Requirement Definitions</em>' containment reference.
	 * @see #setRequirementDefinitions(RequirementDefinitionsType1)
	 * @see de.ugoe.cs.oco.tosca.ToscaPackage#getTNodeType_RequirementDefinitions()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='RequirementDefinitions' namespace='##targetNamespace'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://oco.cs.ugoe.de/tosca!TNodeType!requirementDefinitions'"
	 * @generated
	 */
	RequirementDefinitionsType1 getRequirementDefinitions();

	/**
	 * Sets the value of the '{@link de.ugoe.cs.oco.tosca.TNodeType#getRequirementDefinitions <em>Requirement Definitions</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Requirement Definitions</em>' containment reference.
	 * @see #getRequirementDefinitions()
	 * @generated
	 */
	void setRequirementDefinitions(RequirementDefinitionsType1 value);

	/**
	 * Returns the value of the '<em><b>Capability Definitions</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Capability Definitions</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Capability Definitions</em>' containment reference.
	 * @see #setCapabilityDefinitions(CapabilityDefinitionsType1)
	 * @see de.ugoe.cs.oco.tosca.ToscaPackage#getTNodeType_CapabilityDefinitions()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='CapabilityDefinitions' namespace='##targetNamespace'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://oco.cs.ugoe.de/tosca!TNodeType!capabilityDefinitions'"
	 * @generated
	 */
	CapabilityDefinitionsType1 getCapabilityDefinitions();

	/**
	 * Sets the value of the '{@link de.ugoe.cs.oco.tosca.TNodeType#getCapabilityDefinitions <em>Capability Definitions</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Capability Definitions</em>' containment reference.
	 * @see #getCapabilityDefinitions()
	 * @generated
	 */
	void setCapabilityDefinitions(CapabilityDefinitionsType1 value);

	/**
	 * Returns the value of the '<em><b>Instance States</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Instance States</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Instance States</em>' containment reference.
	 * @see #setInstanceStates(TTopologyElementInstanceStates)
	 * @see de.ugoe.cs.oco.tosca.ToscaPackage#getTNodeType_InstanceStates()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='InstanceStates' namespace='##targetNamespace'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://oco.cs.ugoe.de/tosca!TNodeType!instanceStates'"
	 * @generated
	 */
	TTopologyElementInstanceStates getInstanceStates();

	/**
	 * Sets the value of the '{@link de.ugoe.cs.oco.tosca.TNodeType#getInstanceStates <em>Instance States</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Instance States</em>' containment reference.
	 * @see #getInstanceStates()
	 * @generated
	 */
	void setInstanceStates(TTopologyElementInstanceStates value);

	/**
	 * Returns the value of the '<em><b>Interfaces</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Interfaces</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Interfaces</em>' containment reference.
	 * @see #setInterfaces(InterfacesType)
	 * @see de.ugoe.cs.oco.tosca.ToscaPackage#getTNodeType_Interfaces()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Interfaces' namespace='##targetNamespace'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://oco.cs.ugoe.de/tosca!TNodeType!interfaces'"
	 * @generated
	 */
	InterfacesType getInterfaces();

	/**
	 * Sets the value of the '{@link de.ugoe.cs.oco.tosca.TNodeType#getInterfaces <em>Interfaces</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Interfaces</em>' containment reference.
	 * @see #getInterfaces()
	 * @generated
	 */
	void setInterfaces(InterfacesType value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='/**\n *\n * inv superTypeMustBeNodeType:\n *   let\n *     severity : Integer[1] = \'TNodeType::superTypeMustBeNodeType\'.getSeverity()\n *   in\n *     if severity &lt;= 0\n *     then true\n *     else\n *       let\n *         result : type::Boolean[1] = if self.derivedFrom &lt;&gt; null\n *         then\n *           self.derivedFrom.referencedEntityType.oclIsKindOf(TNodeType)\n *         else true\n *         endif\n *       in\n *         \'TNodeType::superTypeMustBeNodeType\'.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)\n *     endif\n \052/\nfinal /*@NonInvalid\052/ &lt;%org.eclipse.ocl.pivot.evaluation.Executor%&gt; executor = &lt;%org.eclipse.ocl.pivot.internal.utilities.PivotUtilInternal%&gt;.getExecutor(this);\nfinal /*@NonInvalid\052/ &lt;%org.eclipse.ocl.pivot.ids.IdResolver%&gt; idResolver = executor.getIdResolver();\nfinal /*@NonInvalid\052/ &lt;%org.eclipse.ocl.pivot.values.IntegerValue%&gt; severity_0 = &lt;%org.eclipse.ocl.pivot.library.string.CGStringGetSeverityOperation%&gt;.INSTANCE.evaluate(executor, &lt;%de.ugoe.cs.oco.tosca.ToscaTables%&gt;.STR_TNodeType_c_c_superTypeMustBeNodeType);\nfinal /*@NonInvalid\052/ boolean le = &lt;%org.eclipse.ocl.pivot.library.oclany.OclComparableLessThanEqualOperation%&gt;.INSTANCE.evaluate(executor, severity_0, &lt;%de.ugoe.cs.oco.tosca.ToscaTables%&gt;.INT_0).booleanValue();\n/*@NonInvalid\052/ boolean symbol_0;\nif (le) {\n\tsymbol_0 = &lt;%org.eclipse.ocl.pivot.utilities.ValueUtil%&gt;.TRUE_VALUE;\n}\nelse {\n\t/*@Caught\052/ /*@NonNull\052/ &lt;%java.lang.Object%&gt; CAUGHT_result;\n\ttry {\n\t\tfinal /*@NonInvalid\052/ &lt;%de.ugoe.cs.oco.tosca.DerivedFromType2%&gt; derivedFrom = this.getDerivedFrom();\n\t\tfinal /*@NonInvalid\052/ boolean ne = derivedFrom != null;\n\t\t/*@Thrown\052/ boolean result;\n\t\tif (ne) {\n\t\t\tfinal /*@NonInvalid\052/ &lt;%org.eclipse.ocl.pivot.Class%&gt; TYP_tosca_c_c_TNodeType_0 = idResolver.getClass(&lt;%de.ugoe.cs.oco.tosca.ToscaTables%&gt;.CLSSid_TNodeType, null);\n\t\t\tif (derivedFrom == null) {\n\t\t\t\tthrow new &lt;%org.eclipse.ocl.pivot.values.InvalidValueException%&gt;(\"Null source for \\\'\\\'http://oco.cs.ugoe.de/tosca\\\'::DerivedFromType2::referencedEntityType\\\'\");\n\t\t\t}\n\t\t\tfinal /*@Thrown\052/ &lt;%de.ugoe.cs.oco.tosca.TEntityType%&gt; referencedEntityType = derivedFrom.getReferencedEntityType();\n\t\t\tfinal /*@Thrown\052/ boolean oclIsKindOf = &lt;%org.eclipse.ocl.pivot.library.oclany.OclAnyOclIsKindOfOperation%&gt;.INSTANCE.evaluate(executor, referencedEntityType, TYP_tosca_c_c_TNodeType_0).booleanValue();\n\t\t\tresult = oclIsKindOf;\n\t\t}\n\t\telse {\n\t\t\tresult = &lt;%org.eclipse.ocl.pivot.utilities.ValueUtil%&gt;.TRUE_VALUE;\n\t\t}\n\t\tCAUGHT_result = result;\n\t}\n\tcatch (&lt;%java.lang.Exception%&gt; e) {\n\t\tCAUGHT_result = &lt;%org.eclipse.ocl.pivot.utilities.ValueUtil%&gt;.createInvalidValue(e);\n\t}\n\tfinal /*@NonInvalid\052/ boolean logDiagnostic = &lt;%org.eclipse.ocl.pivot.library.string.CGStringLogDiagnosticOperation%&gt;.INSTANCE.evaluate(executor, &lt;%org.eclipse.ocl.pivot.ids.TypeId%&gt;.BOOLEAN, &lt;%de.ugoe.cs.oco.tosca.ToscaTables%&gt;.STR_TNodeType_c_c_superTypeMustBeNodeType, this, (Object)null, diagnostics, context, (Object)null, severity_0, CAUGHT_result, &lt;%de.ugoe.cs.oco.tosca.ToscaTables%&gt;.INT_0).booleanValue();\n\tsymbol_0 = logDiagnostic;\n}\nreturn Boolean.TRUE == symbol_0;'"
	 * @generated
	 */
	boolean superTypeMustBeNodeType(DiagnosticChain diagnostics, Map<Object, Object> context);

} // TNodeType
