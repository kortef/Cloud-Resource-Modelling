/**
 */
package de.ugoe.cs.oco.tosca;

import java.util.Map;
import javax.xml.namespace.QName;
import org.eclipse.emf.common.util.DiagnosticChain;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>TRequirement Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.ugoe.cs.oco.tosca.TRequirementType#getRequiredCapabilityType <em>Required Capability Type</em>}</li>
 *   <li>{@link de.ugoe.cs.oco.tosca.TRequirementType#getRequiredCapabilityTypeRef <em>Required Capability Type Ref</em>}</li>
 * </ul>
 *
 * @see de.ugoe.cs.oco.tosca.ToscaPackage#getTRequirementType()
 * @model extendedMetaData="name='tRequirementType' kind='elementOnly'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore constraints='superTypeMustBeRequirementType'"
 * @generated
 */
public interface TRequirementType extends TEntityType {
	/**
	 * Returns the value of the '<em><b>Required Capability Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Required Capability Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Required Capability Type</em>' attribute.
	 * @see #setRequiredCapabilityType(QName)
	 * @see de.ugoe.cs.oco.tosca.ToscaPackage#getTRequirementType_RequiredCapabilityType()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.QName"
	 *        extendedMetaData="kind='attribute' name='requiredCapabilityType'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://oco.cs.ugoe.de/tosca!TRequirementType!requiredCapabilityType'"
	 * @generated
	 */
	QName getRequiredCapabilityType();

	/**
	 * Sets the value of the '{@link de.ugoe.cs.oco.tosca.TRequirementType#getRequiredCapabilityType <em>Required Capability Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Required Capability Type</em>' attribute.
	 * @see #getRequiredCapabilityType()
	 * @generated
	 */
	void setRequiredCapabilityType(QName value);

	/**
	 * Returns the value of the '<em><b>Required Capability Type Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Required Capability Type Ref</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Required Capability Type Ref</em>' reference.
	 * @see #setRequiredCapabilityTypeRef(TCapabilityType)
	 * @see de.ugoe.cs.oco.tosca.ToscaPackage#getTRequirementType_RequiredCapabilityTypeRef()
	 * @model transient="true" derived="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://oco.cs.ugoe.de/tosca!TRequirementType!requiredCapabilityTypeRef'"
	 * @generated
	 */
	TCapabilityType getRequiredCapabilityTypeRef();

	/**
	 * Sets the value of the '{@link de.ugoe.cs.oco.tosca.TRequirementType#getRequiredCapabilityTypeRef <em>Required Capability Type Ref</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Required Capability Type Ref</em>' reference.
	 * @see #getRequiredCapabilityTypeRef()
	 * @generated
	 */
	void setRequiredCapabilityTypeRef(TCapabilityType value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='/**\n *\n * inv superTypeMustBeRequirementType:\n *   let\n *     severity : Integer[1] = \'TRequirementType::superTypeMustBeRequirementType\'.getSeverity()\n *   in\n *     if severity &lt;= 0\n *     then true\n *     else\n *       let\n *         result : type::Boolean[1] = if self.derivedFrom &lt;&gt; null\n *         then\n *           self.derivedFrom.referencedEntityType.oclIsKindOf(TRequirementType)\n *         else true\n *         endif\n *       in\n *         \'TRequirementType::superTypeMustBeRequirementType\'.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)\n *     endif\n \052/\nfinal /*@NonInvalid\052/ &lt;%org.eclipse.ocl.pivot.evaluation.Executor%&gt; executor = &lt;%org.eclipse.ocl.pivot.internal.utilities.PivotUtilInternal%&gt;.getExecutor(this);\nfinal /*@NonInvalid\052/ &lt;%org.eclipse.ocl.pivot.ids.IdResolver%&gt; idResolver = executor.getIdResolver();\nfinal /*@NonInvalid\052/ &lt;%org.eclipse.ocl.pivot.values.IntegerValue%&gt; severity_0 = &lt;%org.eclipse.ocl.pivot.library.string.CGStringGetSeverityOperation%&gt;.INSTANCE.evaluate(executor, &lt;%de.ugoe.cs.oco.tosca.ToscaTables%&gt;.STR_TRequirementType_c_c_superTypeMustBeRequirementType);\nfinal /*@NonInvalid\052/ boolean le = &lt;%org.eclipse.ocl.pivot.library.oclany.OclComparableLessThanEqualOperation%&gt;.INSTANCE.evaluate(executor, severity_0, &lt;%de.ugoe.cs.oco.tosca.ToscaTables%&gt;.INT_0).booleanValue();\n/*@NonInvalid\052/ boolean symbol_0;\nif (le) {\n\tsymbol_0 = &lt;%org.eclipse.ocl.pivot.utilities.ValueUtil%&gt;.TRUE_VALUE;\n}\nelse {\n\t/*@Caught\052/ /*@NonNull\052/ &lt;%java.lang.Object%&gt; CAUGHT_result;\n\ttry {\n\t\tfinal /*@NonInvalid\052/ &lt;%de.ugoe.cs.oco.tosca.DerivedFromType2%&gt; derivedFrom = this.getDerivedFrom();\n\t\tfinal /*@NonInvalid\052/ boolean ne = derivedFrom != null;\n\t\t/*@Thrown\052/ boolean result;\n\t\tif (ne) {\n\t\t\tfinal /*@NonInvalid\052/ &lt;%org.eclipse.ocl.pivot.Class%&gt; TYP_tosca_c_c_TRequirementType_0 = idResolver.getClass(&lt;%de.ugoe.cs.oco.tosca.ToscaTables%&gt;.CLSSid_TRequirementType, null);\n\t\t\tif (derivedFrom == null) {\n\t\t\t\tthrow new &lt;%org.eclipse.ocl.pivot.values.InvalidValueException%&gt;(\"Null source for \\\'\\\'http://oco.cs.ugoe.de/tosca\\\'::DerivedFromType2::referencedEntityType\\\'\");\n\t\t\t}\n\t\t\tfinal /*@Thrown\052/ &lt;%de.ugoe.cs.oco.tosca.TEntityType%&gt; referencedEntityType = derivedFrom.getReferencedEntityType();\n\t\t\tfinal /*@Thrown\052/ boolean oclIsKindOf = &lt;%org.eclipse.ocl.pivot.library.oclany.OclAnyOclIsKindOfOperation%&gt;.INSTANCE.evaluate(executor, referencedEntityType, TYP_tosca_c_c_TRequirementType_0).booleanValue();\n\t\t\tresult = oclIsKindOf;\n\t\t}\n\t\telse {\n\t\t\tresult = &lt;%org.eclipse.ocl.pivot.utilities.ValueUtil%&gt;.TRUE_VALUE;\n\t\t}\n\t\tCAUGHT_result = result;\n\t}\n\tcatch (&lt;%java.lang.Exception%&gt; e) {\n\t\tCAUGHT_result = &lt;%org.eclipse.ocl.pivot.utilities.ValueUtil%&gt;.createInvalidValue(e);\n\t}\n\tfinal /*@NonInvalid\052/ boolean logDiagnostic = &lt;%org.eclipse.ocl.pivot.library.string.CGStringLogDiagnosticOperation%&gt;.INSTANCE.evaluate(executor, &lt;%org.eclipse.ocl.pivot.ids.TypeId%&gt;.BOOLEAN, &lt;%de.ugoe.cs.oco.tosca.ToscaTables%&gt;.STR_TRequirementType_c_c_superTypeMustBeRequirementType, this, (Object)null, diagnostics, context, (Object)null, severity_0, CAUGHT_result, &lt;%de.ugoe.cs.oco.tosca.ToscaTables%&gt;.INT_0).booleanValue();\n\tsymbol_0 = logDiagnostic;\n}\nreturn Boolean.TRUE == symbol_0;'"
	 * @generated
	 */
	boolean superTypeMustBeRequirementType(DiagnosticChain diagnostics, Map<Object, Object> context);

} // TRequirementType
