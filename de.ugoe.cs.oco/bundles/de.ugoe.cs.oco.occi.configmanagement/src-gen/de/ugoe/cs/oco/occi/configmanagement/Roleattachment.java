/**
 * Copyright (c) 2015-2017 Obeo, Inria
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 	
 * Contributors:
 * - William Piers <william.piers@obeo.fr>
 * - Philippe Merle <philippe.merle@inria.fr>
 * - Faiez Zalila <faiez.zalila@inria.fr>
 */
package de.ugoe.cs.oco.occi.configmanagement;

import java.util.Map;

import org.eclipse.cmf.occi.core.Link;

import org.eclipse.emf.common.util.DiagnosticChain;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Roleattachment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * RoleAttachment
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.ugoe.cs.oco.occi.configmanagement.Roleattachment#getOcciAnsibleUser <em>Occi Ansible User</em>}</li>
 * </ul>
 *
 * @see de.ugoe.cs.oco.occi.configmanagement.ConfigmanagementPackage#getRoleattachment()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='targetConstraint'"
 * @generated
 */
public interface Roleattachment extends Link {
	/**
	 * Returns the value of the '<em><b>Occi Ansible User</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Occi Ansible User</em>' attribute.
	 * @see #setOcciAnsibleUser(String)
	 * @see de.ugoe.cs.oco.occi.configmanagement.ConfigmanagementPackage#getRoleattachment_OcciAnsibleUser()
	 * @model dataType="org.eclipse.cmf.occi.core.String" required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://oco.cs.ugoe.de/occi/configmanagement/ecore!Roleattachment!occiAnsibleUser'"
	 * @generated
	 */
	String getOcciAnsibleUser();

	/**
	 * Sets the value of the '{@link de.ugoe.cs.oco.occi.configmanagement.Roleattachment#getOcciAnsibleUser <em>Occi Ansible User</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Occi Ansible User</em>' attribute.
	 * @see #getOcciAnsibleUser()
	 * @generated
	 */
	void setOcciAnsibleUser(String value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='/**\n *\n * inv targetConstraint:\n *   let severity : Integer[1] = \'Roleattachment::targetConstraint\'.getSeverity()\n *   in\n *     if severity &lt;= 0\n *     then true\n *     else\n *       let\n *         result : occi::Boolean[1] = self.target.oclIsKindOf(infrastructure::Compute)\n *       in\n *         \'Roleattachment::targetConstraint\'.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)\n *     endif\n \052/\nfinal /*@NonInvalid\052/ &lt;%org.eclipse.ocl.pivot.evaluation.Executor%&gt; executor = &lt;%org.eclipse.ocl.pivot.internal.utilities.PivotUtilInternal%&gt;.getExecutor(this);\nfinal /*@NonInvalid\052/ &lt;%org.eclipse.ocl.pivot.ids.IdResolver%&gt; idResolver = executor.getIdResolver();\nfinal /*@NonInvalid\052/ &lt;%org.eclipse.ocl.pivot.values.IntegerValue%&gt; severity_0 = &lt;%org.eclipse.ocl.pivot.library.string.CGStringGetSeverityOperation%&gt;.INSTANCE.evaluate(executor, &lt;%de.ugoe.cs.oco.occi.configmanagement.ConfigmanagementTables%&gt;.STR_Roleattachment_c_c_targetConstraint);\nfinal /*@NonInvalid\052/ boolean le = &lt;%org.eclipse.ocl.pivot.library.oclany.OclComparableLessThanEqualOperation%&gt;.INSTANCE.evaluate(executor, severity_0, &lt;%de.ugoe.cs.oco.occi.configmanagement.ConfigmanagementTables%&gt;.INT_0).booleanValue();\n/*@NonInvalid\052/ boolean symbol_0;\nif (le) {\n\tsymbol_0 = &lt;%org.eclipse.ocl.pivot.utilities.ValueUtil%&gt;.TRUE_VALUE;\n}\nelse {\n\tfinal /*@NonInvalid\052/ &lt;%org.eclipse.ocl.pivot.Class%&gt; TYP_infrastructure_c_c_Compute = idResolver.getClass(&lt;%de.ugoe.cs.oco.occi.configmanagement.ConfigmanagementTables%&gt;.CLSSid_Compute, null);\n\tfinal /*@NonInvalid\052/ &lt;%org.eclipse.cmf.occi.core.Resource%&gt; target = this.getTarget();\n\tfinal /*@NonInvalid\052/ boolean result = &lt;%org.eclipse.ocl.pivot.library.oclany.OclAnyOclIsKindOfOperation%&gt;.INSTANCE.evaluate(executor, target, TYP_infrastructure_c_c_Compute).booleanValue();\n\tfinal /*@NonInvalid\052/ boolean logDiagnostic = &lt;%org.eclipse.ocl.pivot.library.string.CGStringLogDiagnosticOperation%&gt;.INSTANCE.evaluate(executor, &lt;%org.eclipse.ocl.pivot.ids.TypeId%&gt;.BOOLEAN, &lt;%de.ugoe.cs.oco.occi.configmanagement.ConfigmanagementTables%&gt;.STR_Roleattachment_c_c_targetConstraint, this, (Object)null, diagnostics, context, (Object)null, severity_0, result, &lt;%de.ugoe.cs.oco.occi.configmanagement.ConfigmanagementTables%&gt;.INT_0).booleanValue();\n\tsymbol_0 = logDiagnostic;\n}\nreturn Boolean.TRUE == symbol_0;'"
	 * @generated
	 */
	boolean targetConstraint(DiagnosticChain diagnostics, Map<Object, Object> context);

} // Roleattachment
