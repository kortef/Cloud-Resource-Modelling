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

import org.eclipse.cmf.occi.core.Resource;
import org.eclipse.cmf.occi.platform.Component;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ansiblerole</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * AnsibleRole
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.ugoe.cs.oco.occi.configmanagement.Ansiblerole#getOcciAnsibleRolename <em>Occi Ansible Rolename</em>}</li>
 * </ul>
 *
 * @see de.ugoe.cs.oco.occi.configmanagement.ConfigmanagementPackage#getAnsiblerole()
 * @model
 * @generated
 */
public interface Ansiblerole extends Resource {
	/**
	 * Returns the value of the '<em><b>Occi Ansible Rolename</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Occi Ansible Rolename</em>' attribute.
	 * @see #setOcciAnsibleRolename(String)
	 * @see de.ugoe.cs.oco.occi.configmanagement.ConfigmanagementPackage#getAnsiblerole_OcciAnsibleRolename()
	 * @model dataType="org.eclipse.cmf.occi.core.String"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://oco.cs.ugoe.de/occi/configmanagement/ecore!Ansiblerole!occiAnsibleRolename'"
	 * @generated
	 */
	String getOcciAnsibleRolename();

	/**
	 * Sets the value of the '{@link de.ugoe.cs.oco.occi.configmanagement.Ansiblerole#getOcciAnsibleRolename <em>Occi Ansible Rolename</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Occi Ansible Rolename</em>' attribute.
	 * @see #getOcciAnsibleRolename()
	 * @generated
	 */
	void setOcciAnsibleRolename(String value);

} // Ansiblerole
