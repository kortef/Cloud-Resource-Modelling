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
import de.ugoe.cs.oco.occi.configmanagement.Componenthosting;
import de.ugoe.cs.oco.occi.configmanagement.ConfigmanagementFactory;
import de.ugoe.cs.oco.occi.configmanagement.ConfigmanagementPackage;
import de.ugoe.cs.oco.occi.configmanagement.InstallationState;
import de.ugoe.cs.oco.occi.configmanagement.Managedcomponent;
import de.ugoe.cs.oco.occi.configmanagement.Roleattachment;

import de.ugoe.cs.oco.occi.configmanagement.util.ConfigmanagementValidator;

import org.eclipse.cmf.occi.core.OCCIPackage;

import org.eclipse.cmf.occi.infrastructure.InfrastructurePackage;

import org.eclipse.cmf.occi.platform.PlatformPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EValidator;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ConfigmanagementPackageImpl extends EPackageImpl implements ConfigmanagementPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ansibleroleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass roleattachmentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass managedcomponentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass componenthostingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum installationStateEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see de.ugoe.cs.oco.occi.configmanagement.ConfigmanagementPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ConfigmanagementPackageImpl() {
		super(eNS_URI, ConfigmanagementFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link ConfigmanagementPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ConfigmanagementPackage init() {
		if (isInited) return (ConfigmanagementPackage)EPackage.Registry.INSTANCE.getEPackage(ConfigmanagementPackage.eNS_URI);

		// Obtain or create and register package
		ConfigmanagementPackageImpl theConfigmanagementPackage = (ConfigmanagementPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof ConfigmanagementPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new ConfigmanagementPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		InfrastructurePackage.eINSTANCE.eClass();
		PlatformPackage.eINSTANCE.eClass();
		OCCIPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theConfigmanagementPackage.createPackageContents();

		// Initialize created meta-data
		theConfigmanagementPackage.initializePackageContents();

		// Register package validator
		EValidator.Registry.INSTANCE.put
			(theConfigmanagementPackage, 
			 new EValidator.Descriptor() {
				 public EValidator getEValidator() {
					 return ConfigmanagementValidator.INSTANCE;
				 }
			 });

		// Mark meta-data to indicate it can't be changed
		theConfigmanagementPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ConfigmanagementPackage.eNS_URI, theConfigmanagementPackage);
		return theConfigmanagementPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAnsiblerole() {
		return ansibleroleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAnsiblerole_OcciAnsibleRolename() {
		return (EAttribute)ansibleroleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRoleattachment() {
		return roleattachmentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRoleattachment_OcciAnsibleUser() {
		return (EAttribute)roleattachmentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getManagedcomponent() {
		return managedcomponentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getManagedcomponent_OcciComponentInstallationstate() {
		return (EAttribute)managedcomponentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getManagedcomponent_OcciComponentInstallationstateMessage() {
		return (EAttribute)managedcomponentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getComponenthosting() {
		return componenthostingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getComponenthosting__TargetConstraint__DiagnosticChain_Map() {
		return componenthostingEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getInstallationState() {
		return installationStateEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConfigmanagementFactory getConfigmanagementFactory() {
		return (ConfigmanagementFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		ansibleroleEClass = createEClass(ANSIBLEROLE);
		createEAttribute(ansibleroleEClass, ANSIBLEROLE__OCCI_ANSIBLE_ROLENAME);

		roleattachmentEClass = createEClass(ROLEATTACHMENT);
		createEAttribute(roleattachmentEClass, ROLEATTACHMENT__OCCI_ANSIBLE_USER);

		managedcomponentEClass = createEClass(MANAGEDCOMPONENT);
		createEAttribute(managedcomponentEClass, MANAGEDCOMPONENT__OCCI_COMPONENT_INSTALLATIONSTATE);
		createEAttribute(managedcomponentEClass, MANAGEDCOMPONENT__OCCI_COMPONENT_INSTALLATIONSTATE_MESSAGE);

		componenthostingEClass = createEClass(COMPONENTHOSTING);
		createEOperation(componenthostingEClass, COMPONENTHOSTING___TARGET_CONSTRAINT__DIAGNOSTICCHAIN_MAP);

		// Create enums
		installationStateEEnum = createEEnum(INSTALLATION_STATE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		OCCIPackage theOCCIPackage = (OCCIPackage)EPackage.Registry.INSTANCE.getEPackage(OCCIPackage.eNS_URI);
		PlatformPackage thePlatformPackage = (PlatformPackage)EPackage.Registry.INSTANCE.getEPackage(PlatformPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		ansibleroleEClass.getESuperTypes().add(theOCCIPackage.getResource());
		roleattachmentEClass.getESuperTypes().add(theOCCIPackage.getLink());
		managedcomponentEClass.getESuperTypes().add(thePlatformPackage.getComponent());
		componenthostingEClass.getESuperTypes().add(theOCCIPackage.getLink());

		// Initialize classes, features, and operations; add parameters
		initEClass(ansibleroleEClass, Ansiblerole.class, "Ansiblerole", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAnsiblerole_OcciAnsibleRolename(), theOCCIPackage.getString(), "occiAnsibleRolename", null, 0, 1, Ansiblerole.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(roleattachmentEClass, Roleattachment.class, "Roleattachment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRoleattachment_OcciAnsibleUser(), theOCCIPackage.getString(), "occiAnsibleUser", null, 1, 1, Roleattachment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(managedcomponentEClass, Managedcomponent.class, "Managedcomponent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getManagedcomponent_OcciComponentInstallationstate(), this.getInstallationState(), "occiComponentInstallationstate", "uninstalled", 0, 1, Managedcomponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getManagedcomponent_OcciComponentInstallationstateMessage(), theOCCIPackage.getString(), "occiComponentInstallationstateMessage", null, 0, 1, Managedcomponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(componenthostingEClass, Componenthosting.class, "Componenthosting", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		EOperation op = initEOperation(getComponenthosting__TargetConstraint__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "targetConstraint", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		EGenericType g1 = createEGenericType(ecorePackage.getEMap());
		EGenericType g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(installationStateEEnum, InstallationState.class, "InstallationState");
		addEEnumLiteral(installationStateEEnum, InstallationState.INSTALLED);
		addEEnumLiteral(installationStateEEnum, InstallationState.UNINSTALLED);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://www.eclipse.org/emf/2002/Ecore
		createEcoreAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/Ecore</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createEcoreAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/Ecore";	
		addAnnotation
		  (this, 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (componenthostingEClass, 
		   source, 
		   new String[] {
			 "constraints", "targetConstraint"
		   });
	}

} //ConfigmanagementPackageImpl
