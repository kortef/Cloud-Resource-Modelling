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
 *   <li>{@link de.ugoe.cs.oco.occi.configmanagement.impl.AnsibleroleImpl#getOcciAnsibleInstallationstate <em>Occi Ansible Installationstate</em>}</li>
 *   <li>{@link de.ugoe.cs.oco.occi.configmanagement.impl.AnsibleroleImpl#getOcciAnsibleInstallationstateMessage <em>Occi Ansible Installationstate Message</em>}</li>
 *   <li>{@link de.ugoe.cs.oco.occi.configmanagement.impl.AnsibleroleImpl#getOcciAnsibleRolename <em>Occi Ansible Rolename</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AnsibleroleImpl extends ComponentImpl implements Ansiblerole {
	/**
	 * The default value of the '{@link #getOcciAnsibleInstallationstate() <em>Occi Ansible Installationstate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOcciAnsibleInstallationstate()
	 * @generated
	 * @ordered
	 */
	protected static final InstallationState OCCI_ANSIBLE_INSTALLATIONSTATE_EDEFAULT = InstallationState.INSTALLED;

	/**
	 * The cached value of the '{@link #getOcciAnsibleInstallationstate() <em>Occi Ansible Installationstate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOcciAnsibleInstallationstate()
	 * @generated
	 * @ordered
	 */
	protected InstallationState occiAnsibleInstallationstate = OCCI_ANSIBLE_INSTALLATIONSTATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getOcciAnsibleInstallationstateMessage() <em>Occi Ansible Installationstate Message</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOcciAnsibleInstallationstateMessage()
	 * @generated
	 * @ordered
	 */
	protected static final String OCCI_ANSIBLE_INSTALLATIONSTATE_MESSAGE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOcciAnsibleInstallationstateMessage() <em>Occi Ansible Installationstate Message</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOcciAnsibleInstallationstateMessage()
	 * @generated
	 * @ordered
	 */
	protected String occiAnsibleInstallationstateMessage = OCCI_ANSIBLE_INSTALLATIONSTATE_MESSAGE_EDEFAULT;

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
	public InstallationState getOcciAnsibleInstallationstate() {
		return occiAnsibleInstallationstate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOcciAnsibleInstallationstate(InstallationState newOcciAnsibleInstallationstate) {
		InstallationState oldOcciAnsibleInstallationstate = occiAnsibleInstallationstate;
		occiAnsibleInstallationstate = newOcciAnsibleInstallationstate == null ? OCCI_ANSIBLE_INSTALLATIONSTATE_EDEFAULT : newOcciAnsibleInstallationstate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConfigmanagementPackage.ANSIBLEROLE__OCCI_ANSIBLE_INSTALLATIONSTATE, oldOcciAnsibleInstallationstate, occiAnsibleInstallationstate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getOcciAnsibleInstallationstateMessage() {
		return occiAnsibleInstallationstateMessage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOcciAnsibleInstallationstateMessage(String newOcciAnsibleInstallationstateMessage) {
		String oldOcciAnsibleInstallationstateMessage = occiAnsibleInstallationstateMessage;
		occiAnsibleInstallationstateMessage = newOcciAnsibleInstallationstateMessage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConfigmanagementPackage.ANSIBLEROLE__OCCI_ANSIBLE_INSTALLATIONSTATE_MESSAGE, oldOcciAnsibleInstallationstateMessage, occiAnsibleInstallationstateMessage));
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
	public void attachrole() {
		throw new UnsupportedOperationException();  // FIXME Unimplemented http://oco.cs.ugoe.de/occi/configmanagement/ecore!Ansiblerole!attachrole()
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void detachrole() {
		throw new UnsupportedOperationException();  // FIXME Unimplemented http://oco.cs.ugoe.de/occi/configmanagement/ecore!Ansiblerole!detachrole()
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ConfigmanagementPackage.ANSIBLEROLE__OCCI_ANSIBLE_INSTALLATIONSTATE:
				return getOcciAnsibleInstallationstate();
			case ConfigmanagementPackage.ANSIBLEROLE__OCCI_ANSIBLE_INSTALLATIONSTATE_MESSAGE:
				return getOcciAnsibleInstallationstateMessage();
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
			case ConfigmanagementPackage.ANSIBLEROLE__OCCI_ANSIBLE_INSTALLATIONSTATE:
				setOcciAnsibleInstallationstate((InstallationState)newValue);
				return;
			case ConfigmanagementPackage.ANSIBLEROLE__OCCI_ANSIBLE_INSTALLATIONSTATE_MESSAGE:
				setOcciAnsibleInstallationstateMessage((String)newValue);
				return;
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
			case ConfigmanagementPackage.ANSIBLEROLE__OCCI_ANSIBLE_INSTALLATIONSTATE:
				setOcciAnsibleInstallationstate(OCCI_ANSIBLE_INSTALLATIONSTATE_EDEFAULT);
				return;
			case ConfigmanagementPackage.ANSIBLEROLE__OCCI_ANSIBLE_INSTALLATIONSTATE_MESSAGE:
				setOcciAnsibleInstallationstateMessage(OCCI_ANSIBLE_INSTALLATIONSTATE_MESSAGE_EDEFAULT);
				return;
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
			case ConfigmanagementPackage.ANSIBLEROLE__OCCI_ANSIBLE_INSTALLATIONSTATE:
				return occiAnsibleInstallationstate != OCCI_ANSIBLE_INSTALLATIONSTATE_EDEFAULT;
			case ConfigmanagementPackage.ANSIBLEROLE__OCCI_ANSIBLE_INSTALLATIONSTATE_MESSAGE:
				return OCCI_ANSIBLE_INSTALLATIONSTATE_MESSAGE_EDEFAULT == null ? occiAnsibleInstallationstateMessage != null : !OCCI_ANSIBLE_INSTALLATIONSTATE_MESSAGE_EDEFAULT.equals(occiAnsibleInstallationstateMessage);
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
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case ConfigmanagementPackage.ANSIBLEROLE___ATTACHROLE:
				attachrole();
				return null;
			case ConfigmanagementPackage.ANSIBLEROLE___DETACHROLE:
				detachrole();
				return null;
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
		result.append(" (occiAnsibleInstallationstate: ");
		result.append(occiAnsibleInstallationstate);
		result.append(", occiAnsibleInstallationstateMessage: ");
		result.append(occiAnsibleInstallationstateMessage);
		result.append(", occiAnsibleRolename: ");
		result.append(occiAnsibleRolename);
		result.append(')');
		return result.toString();
	}

} //AnsibleroleImpl
