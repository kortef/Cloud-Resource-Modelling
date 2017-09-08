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

import de.ugoe.cs.oco.occi.configmanagement.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ConfigmanagementFactoryImpl extends EFactoryImpl implements ConfigmanagementFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ConfigmanagementFactory init() {
		try {
			ConfigmanagementFactory theConfigmanagementFactory = (ConfigmanagementFactory)EPackage.Registry.INSTANCE.getEFactory(ConfigmanagementPackage.eNS_URI);
			if (theConfigmanagementFactory != null) {
				return theConfigmanagementFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ConfigmanagementFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConfigmanagementFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case ConfigmanagementPackage.ANSIBLEROLE: return createAnsiblerole();
			case ConfigmanagementPackage.ROLEATTACHMENT: return createRoleattachment();
			case ConfigmanagementPackage.MANAGEDCOMPONENT: return createManagedcomponent();
			case ConfigmanagementPackage.COMPONENTHOSTING: return createComponenthosting();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case ConfigmanagementPackage.INSTALLATION_STATE:
				return createInstallationStateFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case ConfigmanagementPackage.INSTALLATION_STATE:
				return convertInstallationStateToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Ansiblerole createAnsiblerole() {
		AnsibleroleImpl ansiblerole = new AnsibleroleImpl();
		return ansiblerole;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Roleattachment createRoleattachment() {
		RoleattachmentImpl roleattachment = new RoleattachmentImpl();
		return roleattachment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Managedcomponent createManagedcomponent() {
		ManagedcomponentImpl managedcomponent = new ManagedcomponentImpl();
		return managedcomponent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Componenthosting createComponenthosting() {
		ComponenthostingImpl componenthosting = new ComponenthostingImpl();
		return componenthosting;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InstallationState createInstallationStateFromString(EDataType eDataType, String initialValue) {
		InstallationState result = InstallationState.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertInstallationStateToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConfigmanagementPackage getConfigmanagementPackage() {
		return (ConfigmanagementPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ConfigmanagementPackage getPackage() {
		return ConfigmanagementPackage.eINSTANCE;
	}

} //ConfigmanagementFactoryImpl
