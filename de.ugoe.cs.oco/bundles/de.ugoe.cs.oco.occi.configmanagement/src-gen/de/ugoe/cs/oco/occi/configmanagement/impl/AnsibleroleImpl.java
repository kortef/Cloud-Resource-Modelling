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
package de.ugoe.cs.oco.occi.configmanagement.impl;

import de.ugoe.cs.oco.occi.configmanagement.Ansiblerole;
import de.ugoe.cs.oco.occi.configmanagement.ConfigmanagementPackage;
import de.ugoe.cs.oco.occi.configmanagement.InstallationState;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.cmf.occi.core.impl.ResourceImpl;
import org.eclipse.cmf.occi.platform.impl.ComponentImpl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ansiblerole</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.ugoe.cs.oco.occi.configmanagement.impl.AnsibleroleImpl#getOcciAnsibleRolename <em>Occi Ansible Rolename</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AnsibleroleImpl extends ResourceImpl implements Ansiblerole {
	/**
	 * The default value of the '{@link #getOcciAnsibleRolename() <em>Occi Ansible Rolename</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOcciAnsibleRolename()
	 * @generated
	 * @ordered
	 */
	protected static final String OCCI_ANSIBLE_ROLENAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOcciAnsibleRolename() <em>Occi Ansible Rolename</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOcciAnsibleRolename()
	 * @generated
	 * @ordered
	 */
	protected String occiAnsibleRolename = OCCI_ANSIBLE_ROLENAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AnsibleroleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConfigmanagementPackage.Literals.ANSIBLEROLE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getOcciAnsibleRolename() {
		return occiAnsibleRolename;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOcciAnsibleRolename(String newOcciAnsibleRolename) {
		String oldOcciAnsibleRolename = occiAnsibleRolename;
		occiAnsibleRolename = newOcciAnsibleRolename;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConfigmanagementPackage.ANSIBLEROLE__OCCI_ANSIBLE_ROLENAME, oldOcciAnsibleRolename, occiAnsibleRolename));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ConfigmanagementPackage.ANSIBLEROLE__OCCI_ANSIBLE_ROLENAME:
				return getOcciAnsibleRolename();
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
			case ConfigmanagementPackage.ANSIBLEROLE__OCCI_ANSIBLE_ROLENAME:
				setOcciAnsibleRolename((String)newValue);
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
			case ConfigmanagementPackage.ANSIBLEROLE__OCCI_ANSIBLE_ROLENAME:
				setOcciAnsibleRolename(OCCI_ANSIBLE_ROLENAME_EDEFAULT);
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
			case ConfigmanagementPackage.ANSIBLEROLE__OCCI_ANSIBLE_ROLENAME:
				return OCCI_ANSIBLE_ROLENAME_EDEFAULT == null ? occiAnsibleRolename != null : !OCCI_ANSIBLE_ROLENAME_EDEFAULT.equals(occiAnsibleRolename);
		}
		return super.eIsSet(featureID);
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
		result.append(" (occiAnsibleRolename: ");
		result.append(occiAnsibleRolename);
		result.append(')');
		return result.toString();
	}

} //AnsibleroleImpl
