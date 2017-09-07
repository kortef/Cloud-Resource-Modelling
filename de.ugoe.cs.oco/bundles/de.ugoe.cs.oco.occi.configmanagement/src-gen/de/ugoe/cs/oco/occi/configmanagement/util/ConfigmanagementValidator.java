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
package de.ugoe.cs.oco.occi.configmanagement.util;

import de.ugoe.cs.oco.occi.configmanagement.*;

import java.util.Map;

import org.eclipse.cmf.occi.core.util.OCCIValidator;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see de.ugoe.cs.oco.occi.configmanagement.ConfigmanagementPackage
 * @generated
 */
public class ConfigmanagementValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final ConfigmanagementValidator INSTANCE = new ConfigmanagementValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "de.ugoe.cs.oco.occi.configmanagement";

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Target Constraint' of 'Roleattachment'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ROLEATTACHMENT__TARGET_CONSTRAINT = 1;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 1;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants in a derived class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final int DIAGNOSTIC_CODE_COUNT = GENERATED_DIAGNOSTIC_CODE_COUNT;

	/**
	 * The cached base package validator.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OCCIValidator occiValidator;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConfigmanagementValidator() {
		super();
		occiValidator = OCCIValidator.INSTANCE;
	}

	/**
	 * Returns the package of this validator switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EPackage getEPackage() {
	  return ConfigmanagementPackage.eINSTANCE;
	}

	/**
	 * Calls <code>validateXXX</code> for the corresponding classifier of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean validate(int classifierID, Object value, DiagnosticChain diagnostics, Map<Object, Object> context) {
		switch (classifierID) {
			case ConfigmanagementPackage.ANSIBLEROLE:
				return validateAnsiblerole((Ansiblerole)value, diagnostics, context);
			case ConfigmanagementPackage.ROLEATTACHMENT:
				return validateRoleattachment((Roleattachment)value, diagnostics, context);
			case ConfigmanagementPackage.INSTALLATION_STATE:
				return validateInstallationState((InstallationState)value, diagnostics, context);
			default:
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAnsiblerole(Ansiblerole ansiblerole, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(ansiblerole, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(ansiblerole, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(ansiblerole, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(ansiblerole, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(ansiblerole, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(ansiblerole, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(ansiblerole, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(ansiblerole, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(ansiblerole, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateEntity_IdUnique(ansiblerole, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateEntity_AttributesNameUnique(ansiblerole, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateEntity_KindCompatibleWithOneAppliesOfEachMixin(ansiblerole, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateResource_ResourceKindIsInParent(ansiblerole, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRoleattachment(Roleattachment roleattachment, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(roleattachment, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(roleattachment, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(roleattachment, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(roleattachment, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(roleattachment, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(roleattachment, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(roleattachment, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(roleattachment, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(roleattachment, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateEntity_IdUnique(roleattachment, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateEntity_AttributesNameUnique(roleattachment, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateEntity_KindCompatibleWithOneAppliesOfEachMixin(roleattachment, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateLink_LinkKindIsInParent(roleattachment, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateLink_sourceReferenceInvariant(roleattachment, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateLink_targetReferenceInvariant(roleattachment, diagnostics, context);
		if (result || diagnostics != null) result &= validateRoleattachment_targetConstraint(roleattachment, diagnostics, context);
		return result;
	}

	/**
	 * Validates the targetConstraint constraint of '<em>Roleattachment</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRoleattachment_targetConstraint(Roleattachment roleattachment, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return roleattachment.targetConstraint(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInstallationState(InstallationState installationState, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * Returns the resource locator that will be used to fetch messages for this validator's diagnostics.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		// TODO
		// Specialize this to return a resource locator for messages specific to this validator.
		// Ensure that you remove @generated or mark it @generated NOT
		return super.getResourceLocator();
	}

} //ConfigmanagementValidator
