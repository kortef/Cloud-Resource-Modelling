/**
 */
package de.ugoe.cs.oco.tosca;

import java.util.Map;
import org.eclipse.emf.common.util.DiagnosticChain;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>TCapability Type</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see de.ugoe.cs.oco.tosca.ToscaPackage#getTCapabilityType()
 * @model extendedMetaData="name='tCapabilityType' kind='elementOnly'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore constraints='superTypeMustBeCapabilityType'"
 * @generated
 */
public interface TCapabilityType extends TEntityType {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='/**\n *\n * inv superTypeMustBeCapabilityType:\n *   let\n *     severity : Integer[1] = \'TCapabilityType::superTypeMustBeCapabilityType\'.getSeverity()\n *   in\n *     if severity &lt;= 0\n *     then true\n *     else\n *       let\n *         result : type::Boolean[1] = if self.derivedFrom &lt;&gt; null\n *         then\n *           self.derivedFrom.referencedEntityType.oclIsKindOf(TCapabilityType)\n *         else true\n *         endif\n *       in\n *         \'TCapabilityType::superTypeMustBeCapabilityType\'.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)\n *     endif\n \052/\nfinal /*@NonInvalid\052/ &lt;%org.eclipse.ocl.pivot.evaluation.Executor%&gt; executor = &lt;%org.eclipse.ocl.pivot.internal.utilities.PivotUtilInternal%&gt;.getExecutor(this);\nfinal /*@NonInvalid\052/ &lt;%org.eclipse.ocl.pivot.ids.IdResolver%&gt; idResolver = executor.getIdResolver();\nfinal /*@NonInvalid\052/ &lt;%org.eclipse.ocl.pivot.values.IntegerValue%&gt; severity_0 = &lt;%org.eclipse.ocl.pivot.library.string.CGStringGetSeverityOperation%&gt;.INSTANCE.evaluate(executor, &lt;%de.ugoe.cs.oco.tosca.ToscaTables%&gt;.STR_TCapabilityType_c_c_superTypeMustBeCapabilityType);\nfinal /*@NonInvalid\052/ boolean le = &lt;%org.eclipse.ocl.pivot.library.oclany.OclComparableLessThanEqualOperation%&gt;.INSTANCE.evaluate(executor, severity_0, &lt;%de.ugoe.cs.oco.tosca.ToscaTables%&gt;.INT_0).booleanValue();\n/*@NonInvalid\052/ boolean symbol_0;\nif (le) {\n\tsymbol_0 = &lt;%org.eclipse.ocl.pivot.utilities.ValueUtil%&gt;.TRUE_VALUE;\n}\nelse {\n\t/*@Caught\052/ /*@NonNull\052/ &lt;%java.lang.Object%&gt; CAUGHT_result;\n\ttry {\n\t\tfinal /*@NonInvalid\052/ &lt;%de.ugoe.cs.oco.tosca.DerivedFromType2%&gt; derivedFrom = this.getDerivedFrom();\n\t\tfinal /*@NonInvalid\052/ boolean ne = derivedFrom != null;\n\t\t/*@Thrown\052/ boolean result;\n\t\tif (ne) {\n\t\t\tfinal /*@NonInvalid\052/ &lt;%org.eclipse.ocl.pivot.Class%&gt; TYP_tosca_c_c_TCapabilityType_0 = idResolver.getClass(&lt;%de.ugoe.cs.oco.tosca.ToscaTables%&gt;.CLSSid_TCapabilityType, null);\n\t\t\tif (derivedFrom == null) {\n\t\t\t\tthrow new &lt;%org.eclipse.ocl.pivot.values.InvalidValueException%&gt;(\"Null source for \\\'\\\'http://oco.cs.ugoe.de/tosca\\\'::DerivedFromType2::referencedEntityType\\\'\");\n\t\t\t}\n\t\t\tfinal /*@Thrown\052/ &lt;%de.ugoe.cs.oco.tosca.TEntityType%&gt; referencedEntityType = derivedFrom.getReferencedEntityType();\n\t\t\tfinal /*@Thrown\052/ boolean oclIsKindOf = &lt;%org.eclipse.ocl.pivot.library.oclany.OclAnyOclIsKindOfOperation%&gt;.INSTANCE.evaluate(executor, referencedEntityType, TYP_tosca_c_c_TCapabilityType_0).booleanValue();\n\t\t\tresult = oclIsKindOf;\n\t\t}\n\t\telse {\n\t\t\tresult = &lt;%org.eclipse.ocl.pivot.utilities.ValueUtil%&gt;.TRUE_VALUE;\n\t\t}\n\t\tCAUGHT_result = result;\n\t}\n\tcatch (&lt;%java.lang.Exception%&gt; e) {\n\t\tCAUGHT_result = &lt;%org.eclipse.ocl.pivot.utilities.ValueUtil%&gt;.createInvalidValue(e);\n\t}\n\tfinal /*@NonInvalid\052/ boolean logDiagnostic = &lt;%org.eclipse.ocl.pivot.library.string.CGStringLogDiagnosticOperation%&gt;.INSTANCE.evaluate(executor, &lt;%org.eclipse.ocl.pivot.ids.TypeId%&gt;.BOOLEAN, &lt;%de.ugoe.cs.oco.tosca.ToscaTables%&gt;.STR_TCapabilityType_c_c_superTypeMustBeCapabilityType, this, (Object)null, diagnostics, context, (Object)null, severity_0, CAUGHT_result, &lt;%de.ugoe.cs.oco.tosca.ToscaTables%&gt;.INT_0).booleanValue();\n\tsymbol_0 = logDiagnostic;\n}\nreturn Boolean.TRUE == symbol_0;'"
	 * @generated
	 */
	boolean superTypeMustBeCapabilityType(DiagnosticChain diagnostics, Map<Object, Object> context);
} // TCapabilityType
