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
 * @model
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

} // Roleattachment
