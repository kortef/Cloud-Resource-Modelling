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

import org.eclipse.cmf.occi.platform.Component;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ansiblerole</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * ManagedComponent
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.ugoe.cs.oco.occi.configmanagement.Ansiblerole#getOcciAnsibleInstallationstate <em>Occi Ansible Installationstate</em>}</li>
 *   <li>{@link de.ugoe.cs.oco.occi.configmanagement.Ansiblerole#getOcciAnsibleInstallationstateMessage <em>Occi Ansible Installationstate Message</em>}</li>
 *   <li>{@link de.ugoe.cs.oco.occi.configmanagement.Ansiblerole#getOcciAnsibleRolename <em>Occi Ansible Rolename</em>}</li>
 * </ul>
 *
 * @see de.ugoe.cs.oco.occi.configmanagement.ConfigmanagementPackage#getAnsiblerole()
 * @model
 * @generated
 */
public interface Ansiblerole extends Component {
	/**
	 * Returns the value of the '<em><b>Occi Ansible Installationstate</b></em>' attribute.
	 * The literals are from the enumeration {@link de.ugoe.cs.oco.occi.configmanagement.InstallationState}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Occi Ansible Installationstate</em>' attribute.
	 * @see de.ugoe.cs.oco.occi.configmanagement.InstallationState
	 * @see #setOcciAnsibleInstallationstate(InstallationState)
	 * @see de.ugoe.cs.oco.occi.configmanagement.ConfigmanagementPackage#getAnsiblerole_OcciAnsibleInstallationstate()
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://oco.cs.ugoe.de/occi/configmanagement/ecore!Ansiblerole!occiAnsibleInstallationstate'"
	 * @generated
	 */
	InstallationState getOcciAnsibleInstallationstate();

	/**
	 * Sets the value of the '{@link de.ugoe.cs.oco.occi.configmanagement.Ansiblerole#getOcciAnsibleInstallationstate <em>Occi Ansible Installationstate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Occi Ansible Installationstate</em>' attribute.
	 * @see de.ugoe.cs.oco.occi.configmanagement.InstallationState
	 * @see #getOcciAnsibleInstallationstate()
	 * @generated
	 */
	void setOcciAnsibleInstallationstate(InstallationState value);

	/**
	 * Returns the value of the '<em><b>Occi Ansible Installationstate Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Occi Ansible Installationstate Message</em>' attribute.
	 * @see #setOcciAnsibleInstallationstateMessage(String)
	 * @see de.ugoe.cs.oco.occi.configmanagement.ConfigmanagementPackage#getAnsiblerole_OcciAnsibleInstallationstateMessage()
	 * @model dataType="org.eclipse.cmf.occi.core.String"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://oco.cs.ugoe.de/occi/configmanagement/ecore!Ansiblerole!occiAnsibleInstallationstateMessage'"
	 * @generated
	 */
	String getOcciAnsibleInstallationstateMessage();

	/**
	 * Sets the value of the '{@link de.ugoe.cs.oco.occi.configmanagement.Ansiblerole#getOcciAnsibleInstallationstateMessage <em>Occi Ansible Installationstate Message</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Occi Ansible Installationstate Message</em>' attribute.
	 * @see #getOcciAnsibleInstallationstateMessage()
	 * @generated
	 */
	void setOcciAnsibleInstallationstateMessage(String value);

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

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * attachRole
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='throw new UnsupportedOperationException();  // FIXME Unimplemented http://oco.cs.ugoe.de/occi/configmanagement/ecore!Ansiblerole!attachrole()'"
	 * @generated
	 */
	void attachrole();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * detachRole
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='throw new UnsupportedOperationException();  // FIXME Unimplemented http://oco.cs.ugoe.de/occi/configmanagement/ecore!Ansiblerole!detachrole()'"
	 * @generated
	 */
	void detachrole();

} // Ansiblerole
