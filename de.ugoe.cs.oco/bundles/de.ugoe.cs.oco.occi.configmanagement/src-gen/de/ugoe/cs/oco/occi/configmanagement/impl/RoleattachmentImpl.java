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

import de.ugoe.cs.oco.occi.configmanagement.ConfigmanagementPackage;
import de.ugoe.cs.oco.occi.configmanagement.ConfigmanagementTables;
import de.ugoe.cs.oco.occi.configmanagement.Roleattachment;

import java.lang.reflect.InvocationTargetException;

import java.util.Map;

import org.eclipse.cmf.occi.core.Resource;

import org.eclipse.cmf.occi.core.impl.LinkImpl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.ocl.pivot.evaluation.Executor;

import org.eclipse.ocl.pivot.ids.IdResolver;
import org.eclipse.ocl.pivot.ids.TypeId;

import org.eclipse.ocl.pivot.internal.utilities.PivotUtilInternal;

import org.eclipse.ocl.pivot.library.oclany.OclAnyOclIsKindOfOperation;
import org.eclipse.ocl.pivot.library.oclany.OclComparableLessThanEqualOperation;

import org.eclipse.ocl.pivot.library.string.CGStringGetSeverityOperation;
import org.eclipse.ocl.pivot.library.string.CGStringLogDiagnosticOperation;

import org.eclipse.ocl.pivot.utilities.ValueUtil;

import org.eclipse.ocl.pivot.values.IntegerValue;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Roleattachment</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.ugoe.cs.oco.occi.configmanagement.impl.RoleattachmentImpl#getOcciAnsibleUser <em>Occi Ansible User</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RoleattachmentImpl extends LinkImpl implements Roleattachment {
	/**
	 * The default value of the '{@link #getOcciAnsibleUser() <em>Occi Ansible User</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOcciAnsibleUser()
	 * @generated
	 * @ordered
	 */
	protected static final String OCCI_ANSIBLE_USER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOcciAnsibleUser() <em>Occi Ansible User</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOcciAnsibleUser()
	 * @generated
	 * @ordered
	 */
	protected String occiAnsibleUser = OCCI_ANSIBLE_USER_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RoleattachmentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConfigmanagementPackage.Literals.ROLEATTACHMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getOcciAnsibleUser() {
		return occiAnsibleUser;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOcciAnsibleUser(String newOcciAnsibleUser) {
		String oldOcciAnsibleUser = occiAnsibleUser;
		occiAnsibleUser = newOcciAnsibleUser;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConfigmanagementPackage.ROLEATTACHMENT__OCCI_ANSIBLE_USER, oldOcciAnsibleUser, occiAnsibleUser));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ConfigmanagementPackage.ROLEATTACHMENT__OCCI_ANSIBLE_USER:
				return getOcciAnsibleUser();
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
			case ConfigmanagementPackage.ROLEATTACHMENT__OCCI_ANSIBLE_USER:
				setOcciAnsibleUser((String)newValue);
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
			case ConfigmanagementPackage.ROLEATTACHMENT__OCCI_ANSIBLE_USER:
				setOcciAnsibleUser(OCCI_ANSIBLE_USER_EDEFAULT);
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
			case ConfigmanagementPackage.ROLEATTACHMENT__OCCI_ANSIBLE_USER:
				return OCCI_ANSIBLE_USER_EDEFAULT == null ? occiAnsibleUser != null : !OCCI_ANSIBLE_USER_EDEFAULT.equals(occiAnsibleUser);
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
		result.append(" (occiAnsibleUser: ");
		result.append(occiAnsibleUser);
		result.append(')');
		return result.toString();
	}

} //RoleattachmentImpl
