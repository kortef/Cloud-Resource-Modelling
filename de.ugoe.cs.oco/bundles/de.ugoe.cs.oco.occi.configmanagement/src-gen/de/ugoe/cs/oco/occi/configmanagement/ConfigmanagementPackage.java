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

import org.eclipse.cmf.occi.core.OCCIPackage;

import org.eclipse.cmf.occi.platform.PlatformPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see de.ugoe.cs.oco.occi.configmanagement.ConfigmanagementFactory
 * @model kind="package"
 * @generated
 */
public interface ConfigmanagementPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "configmanagement";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://oco.cs.ugoe.de/occi/configmanagement/ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "configmanagement";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ConfigmanagementPackage eINSTANCE = de.ugoe.cs.oco.occi.configmanagement.impl.ConfigmanagementPackageImpl.init();

	/**
	 * The meta object id for the '{@link de.ugoe.cs.oco.occi.configmanagement.impl.AnsibleroleImpl <em>Ansiblerole</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.ugoe.cs.oco.occi.configmanagement.impl.AnsibleroleImpl
	 * @see de.ugoe.cs.oco.occi.configmanagement.impl.ConfigmanagementPackageImpl#getAnsiblerole()
	 * @generated
	 */
	int ANSIBLEROLE = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANSIBLEROLE__ID = OCCIPackage.RESOURCE__ID;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANSIBLEROLE__TITLE = OCCIPackage.RESOURCE__TITLE;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANSIBLEROLE__KIND = OCCIPackage.RESOURCE__KIND;

	/**
	 * The feature id for the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANSIBLEROLE__LOCATION = OCCIPackage.RESOURCE__LOCATION;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANSIBLEROLE__ATTRIBUTES = OCCIPackage.RESOURCE__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Mixins</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANSIBLEROLE__MIXINS = OCCIPackage.RESOURCE__MIXINS;

	/**
	 * The feature id for the '<em><b>Parts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANSIBLEROLE__PARTS = OCCIPackage.RESOURCE__PARTS;

	/**
	 * The feature id for the '<em><b>Summary</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANSIBLEROLE__SUMMARY = OCCIPackage.RESOURCE__SUMMARY;

	/**
	 * The feature id for the '<em><b>Links</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANSIBLEROLE__LINKS = OCCIPackage.RESOURCE__LINKS;

	/**
	 * The feature id for the '<em><b>Rlinks</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANSIBLEROLE__RLINKS = OCCIPackage.RESOURCE__RLINKS;

	/**
	 * The feature id for the '<em><b>Occi Ansible Rolename</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANSIBLEROLE__OCCI_ANSIBLE_ROLENAME = OCCIPackage.RESOURCE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Ansiblerole</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANSIBLEROLE_FEATURE_COUNT = OCCIPackage.RESOURCE_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Occi Create</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANSIBLEROLE___OCCI_CREATE = OCCIPackage.RESOURCE___OCCI_CREATE;

	/**
	 * The operation id for the '<em>Occi Retrieve</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANSIBLEROLE___OCCI_RETRIEVE = OCCIPackage.RESOURCE___OCCI_RETRIEVE;

	/**
	 * The operation id for the '<em>Occi Update</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANSIBLEROLE___OCCI_UPDATE = OCCIPackage.RESOURCE___OCCI_UPDATE;

	/**
	 * The operation id for the '<em>Occi Delete</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANSIBLEROLE___OCCI_DELETE = OCCIPackage.RESOURCE___OCCI_DELETE;

	/**
	 * The number of operations of the '<em>Ansiblerole</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANSIBLEROLE_OPERATION_COUNT = OCCIPackage.RESOURCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.ugoe.cs.oco.occi.configmanagement.impl.RoleattachmentImpl <em>Roleattachment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.ugoe.cs.oco.occi.configmanagement.impl.RoleattachmentImpl
	 * @see de.ugoe.cs.oco.occi.configmanagement.impl.ConfigmanagementPackageImpl#getRoleattachment()
	 * @generated
	 */
	int ROLEATTACHMENT = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLEATTACHMENT__ID = OCCIPackage.LINK__ID;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLEATTACHMENT__TITLE = OCCIPackage.LINK__TITLE;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLEATTACHMENT__KIND = OCCIPackage.LINK__KIND;

	/**
	 * The feature id for the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLEATTACHMENT__LOCATION = OCCIPackage.LINK__LOCATION;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLEATTACHMENT__ATTRIBUTES = OCCIPackage.LINK__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Mixins</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLEATTACHMENT__MIXINS = OCCIPackage.LINK__MIXINS;

	/**
	 * The feature id for the '<em><b>Parts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLEATTACHMENT__PARTS = OCCIPackage.LINK__PARTS;

	/**
	 * The feature id for the '<em><b>Source</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLEATTACHMENT__SOURCE = OCCIPackage.LINK__SOURCE;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLEATTACHMENT__TARGET = OCCIPackage.LINK__TARGET;

	/**
	 * The feature id for the '<em><b>Occi Ansible User</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLEATTACHMENT__OCCI_ANSIBLE_USER = OCCIPackage.LINK_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Roleattachment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLEATTACHMENT_FEATURE_COUNT = OCCIPackage.LINK_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Occi Create</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLEATTACHMENT___OCCI_CREATE = OCCIPackage.LINK___OCCI_CREATE;

	/**
	 * The operation id for the '<em>Occi Retrieve</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLEATTACHMENT___OCCI_RETRIEVE = OCCIPackage.LINK___OCCI_RETRIEVE;

	/**
	 * The operation id for the '<em>Occi Update</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLEATTACHMENT___OCCI_UPDATE = OCCIPackage.LINK___OCCI_UPDATE;

	/**
	 * The operation id for the '<em>Occi Delete</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLEATTACHMENT___OCCI_DELETE = OCCIPackage.LINK___OCCI_DELETE;

	/**
	 * The number of operations of the '<em>Roleattachment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLEATTACHMENT_OPERATION_COUNT = OCCIPackage.LINK_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.ugoe.cs.oco.occi.configmanagement.impl.ManagedcomponentImpl <em>Managedcomponent</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.ugoe.cs.oco.occi.configmanagement.impl.ManagedcomponentImpl
	 * @see de.ugoe.cs.oco.occi.configmanagement.impl.ConfigmanagementPackageImpl#getManagedcomponent()
	 * @generated
	 */
	int MANAGEDCOMPONENT = 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANAGEDCOMPONENT__ID = PlatformPackage.COMPONENT__ID;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANAGEDCOMPONENT__TITLE = PlatformPackage.COMPONENT__TITLE;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANAGEDCOMPONENT__KIND = PlatformPackage.COMPONENT__KIND;

	/**
	 * The feature id for the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANAGEDCOMPONENT__LOCATION = PlatformPackage.COMPONENT__LOCATION;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANAGEDCOMPONENT__ATTRIBUTES = PlatformPackage.COMPONENT__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Mixins</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANAGEDCOMPONENT__MIXINS = PlatformPackage.COMPONENT__MIXINS;

	/**
	 * The feature id for the '<em><b>Parts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANAGEDCOMPONENT__PARTS = PlatformPackage.COMPONENT__PARTS;

	/**
	 * The feature id for the '<em><b>Summary</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANAGEDCOMPONENT__SUMMARY = PlatformPackage.COMPONENT__SUMMARY;

	/**
	 * The feature id for the '<em><b>Links</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANAGEDCOMPONENT__LINKS = PlatformPackage.COMPONENT__LINKS;

	/**
	 * The feature id for the '<em><b>Rlinks</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANAGEDCOMPONENT__RLINKS = PlatformPackage.COMPONENT__RLINKS;

	/**
	 * The feature id for the '<em><b>Occi Component State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANAGEDCOMPONENT__OCCI_COMPONENT_STATE = PlatformPackage.COMPONENT__OCCI_COMPONENT_STATE;

	/**
	 * The feature id for the '<em><b>Occi Component State Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANAGEDCOMPONENT__OCCI_COMPONENT_STATE_MESSAGE = PlatformPackage.COMPONENT__OCCI_COMPONENT_STATE_MESSAGE;

	/**
	 * The feature id for the '<em><b>Occi Component Installationstate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANAGEDCOMPONENT__OCCI_COMPONENT_INSTALLATIONSTATE = PlatformPackage.COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Occi Component Installationstate Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANAGEDCOMPONENT__OCCI_COMPONENT_INSTALLATIONSTATE_MESSAGE = PlatformPackage.COMPONENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Managedcomponent</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANAGEDCOMPONENT_FEATURE_COUNT = PlatformPackage.COMPONENT_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Occi Create</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANAGEDCOMPONENT___OCCI_CREATE = PlatformPackage.COMPONENT___OCCI_CREATE;

	/**
	 * The operation id for the '<em>Occi Retrieve</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANAGEDCOMPONENT___OCCI_RETRIEVE = PlatformPackage.COMPONENT___OCCI_RETRIEVE;

	/**
	 * The operation id for the '<em>Occi Update</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANAGEDCOMPONENT___OCCI_UPDATE = PlatformPackage.COMPONENT___OCCI_UPDATE;

	/**
	 * The operation id for the '<em>Occi Delete</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANAGEDCOMPONENT___OCCI_DELETE = PlatformPackage.COMPONENT___OCCI_DELETE;

	/**
	 * The operation id for the '<em>Start</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANAGEDCOMPONENT___START = PlatformPackage.COMPONENT___START;

	/**
	 * The operation id for the '<em>Stop</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANAGEDCOMPONENT___STOP = PlatformPackage.COMPONENT___STOP;

	/**
	 * The number of operations of the '<em>Managedcomponent</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANAGEDCOMPONENT_OPERATION_COUNT = PlatformPackage.COMPONENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.ugoe.cs.oco.occi.configmanagement.impl.ComponenthostingImpl <em>Componenthosting</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.ugoe.cs.oco.occi.configmanagement.impl.ComponenthostingImpl
	 * @see de.ugoe.cs.oco.occi.configmanagement.impl.ConfigmanagementPackageImpl#getComponenthosting()
	 * @generated
	 */
	int COMPONENTHOSTING = 3;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENTHOSTING__ID = OCCIPackage.LINK__ID;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENTHOSTING__TITLE = OCCIPackage.LINK__TITLE;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENTHOSTING__KIND = OCCIPackage.LINK__KIND;

	/**
	 * The feature id for the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENTHOSTING__LOCATION = OCCIPackage.LINK__LOCATION;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENTHOSTING__ATTRIBUTES = OCCIPackage.LINK__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Mixins</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENTHOSTING__MIXINS = OCCIPackage.LINK__MIXINS;

	/**
	 * The feature id for the '<em><b>Parts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENTHOSTING__PARTS = OCCIPackage.LINK__PARTS;

	/**
	 * The feature id for the '<em><b>Source</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENTHOSTING__SOURCE = OCCIPackage.LINK__SOURCE;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENTHOSTING__TARGET = OCCIPackage.LINK__TARGET;

	/**
	 * The number of structural features of the '<em>Componenthosting</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENTHOSTING_FEATURE_COUNT = OCCIPackage.LINK_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Occi Create</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENTHOSTING___OCCI_CREATE = OCCIPackage.LINK___OCCI_CREATE;

	/**
	 * The operation id for the '<em>Occi Retrieve</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENTHOSTING___OCCI_RETRIEVE = OCCIPackage.LINK___OCCI_RETRIEVE;

	/**
	 * The operation id for the '<em>Occi Update</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENTHOSTING___OCCI_UPDATE = OCCIPackage.LINK___OCCI_UPDATE;

	/**
	 * The operation id for the '<em>Occi Delete</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENTHOSTING___OCCI_DELETE = OCCIPackage.LINK___OCCI_DELETE;

	/**
	 * The operation id for the '<em>Target Constraint</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENTHOSTING___TARGET_CONSTRAINT__DIAGNOSTICCHAIN_MAP = OCCIPackage.LINK_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Componenthosting</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENTHOSTING_OPERATION_COUNT = OCCIPackage.LINK_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link de.ugoe.cs.oco.occi.configmanagement.InstallationState <em>Installation State</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.ugoe.cs.oco.occi.configmanagement.InstallationState
	 * @see de.ugoe.cs.oco.occi.configmanagement.impl.ConfigmanagementPackageImpl#getInstallationState()
	 * @generated
	 */
	int INSTALLATION_STATE = 4;


	/**
	 * Returns the meta object for class '{@link de.ugoe.cs.oco.occi.configmanagement.Ansiblerole <em>Ansiblerole</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ansiblerole</em>'.
	 * @see de.ugoe.cs.oco.occi.configmanagement.Ansiblerole
	 * @generated
	 */
	EClass getAnsiblerole();

	/**
	 * Returns the meta object for the attribute '{@link de.ugoe.cs.oco.occi.configmanagement.Ansiblerole#getOcciAnsibleRolename <em>Occi Ansible Rolename</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Occi Ansible Rolename</em>'.
	 * @see de.ugoe.cs.oco.occi.configmanagement.Ansiblerole#getOcciAnsibleRolename()
	 * @see #getAnsiblerole()
	 * @generated
	 */
	EAttribute getAnsiblerole_OcciAnsibleRolename();

	/**
	 * Returns the meta object for class '{@link de.ugoe.cs.oco.occi.configmanagement.Roleattachment <em>Roleattachment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Roleattachment</em>'.
	 * @see de.ugoe.cs.oco.occi.configmanagement.Roleattachment
	 * @generated
	 */
	EClass getRoleattachment();

	/**
	 * Returns the meta object for the attribute '{@link de.ugoe.cs.oco.occi.configmanagement.Roleattachment#getOcciAnsibleUser <em>Occi Ansible User</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Occi Ansible User</em>'.
	 * @see de.ugoe.cs.oco.occi.configmanagement.Roleattachment#getOcciAnsibleUser()
	 * @see #getRoleattachment()
	 * @generated
	 */
	EAttribute getRoleattachment_OcciAnsibleUser();

	/**
	 * Returns the meta object for class '{@link de.ugoe.cs.oco.occi.configmanagement.Managedcomponent <em>Managedcomponent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Managedcomponent</em>'.
	 * @see de.ugoe.cs.oco.occi.configmanagement.Managedcomponent
	 * @generated
	 */
	EClass getManagedcomponent();

	/**
	 * Returns the meta object for the attribute '{@link de.ugoe.cs.oco.occi.configmanagement.Managedcomponent#getOcciComponentInstallationstate <em>Occi Component Installationstate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Occi Component Installationstate</em>'.
	 * @see de.ugoe.cs.oco.occi.configmanagement.Managedcomponent#getOcciComponentInstallationstate()
	 * @see #getManagedcomponent()
	 * @generated
	 */
	EAttribute getManagedcomponent_OcciComponentInstallationstate();

	/**
	 * Returns the meta object for the attribute '{@link de.ugoe.cs.oco.occi.configmanagement.Managedcomponent#getOcciComponentInstallationstateMessage <em>Occi Component Installationstate Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Occi Component Installationstate Message</em>'.
	 * @see de.ugoe.cs.oco.occi.configmanagement.Managedcomponent#getOcciComponentInstallationstateMessage()
	 * @see #getManagedcomponent()
	 * @generated
	 */
	EAttribute getManagedcomponent_OcciComponentInstallationstateMessage();

	/**
	 * Returns the meta object for class '{@link de.ugoe.cs.oco.occi.configmanagement.Componenthosting <em>Componenthosting</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Componenthosting</em>'.
	 * @see de.ugoe.cs.oco.occi.configmanagement.Componenthosting
	 * @generated
	 */
	EClass getComponenthosting();

	/**
	 * Returns the meta object for the '{@link de.ugoe.cs.oco.occi.configmanagement.Componenthosting#targetConstraint(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Target Constraint</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Target Constraint</em>' operation.
	 * @see de.ugoe.cs.oco.occi.configmanagement.Componenthosting#targetConstraint(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getComponenthosting__TargetConstraint__DiagnosticChain_Map();

	/**
	 * Returns the meta object for enum '{@link de.ugoe.cs.oco.occi.configmanagement.InstallationState <em>Installation State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Installation State</em>'.
	 * @see de.ugoe.cs.oco.occi.configmanagement.InstallationState
	 * @generated
	 */
	EEnum getInstallationState();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ConfigmanagementFactory getConfigmanagementFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link de.ugoe.cs.oco.occi.configmanagement.impl.AnsibleroleImpl <em>Ansiblerole</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.ugoe.cs.oco.occi.configmanagement.impl.AnsibleroleImpl
		 * @see de.ugoe.cs.oco.occi.configmanagement.impl.ConfigmanagementPackageImpl#getAnsiblerole()
		 * @generated
		 */
		EClass ANSIBLEROLE = eINSTANCE.getAnsiblerole();

		/**
		 * The meta object literal for the '<em><b>Occi Ansible Rolename</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ANSIBLEROLE__OCCI_ANSIBLE_ROLENAME = eINSTANCE.getAnsiblerole_OcciAnsibleRolename();

		/**
		 * The meta object literal for the '{@link de.ugoe.cs.oco.occi.configmanagement.impl.RoleattachmentImpl <em>Roleattachment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.ugoe.cs.oco.occi.configmanagement.impl.RoleattachmentImpl
		 * @see de.ugoe.cs.oco.occi.configmanagement.impl.ConfigmanagementPackageImpl#getRoleattachment()
		 * @generated
		 */
		EClass ROLEATTACHMENT = eINSTANCE.getRoleattachment();

		/**
		 * The meta object literal for the '<em><b>Occi Ansible User</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROLEATTACHMENT__OCCI_ANSIBLE_USER = eINSTANCE.getRoleattachment_OcciAnsibleUser();

		/**
		 * The meta object literal for the '{@link de.ugoe.cs.oco.occi.configmanagement.impl.ManagedcomponentImpl <em>Managedcomponent</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.ugoe.cs.oco.occi.configmanagement.impl.ManagedcomponentImpl
		 * @see de.ugoe.cs.oco.occi.configmanagement.impl.ConfigmanagementPackageImpl#getManagedcomponent()
		 * @generated
		 */
		EClass MANAGEDCOMPONENT = eINSTANCE.getManagedcomponent();

		/**
		 * The meta object literal for the '<em><b>Occi Component Installationstate</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MANAGEDCOMPONENT__OCCI_COMPONENT_INSTALLATIONSTATE = eINSTANCE.getManagedcomponent_OcciComponentInstallationstate();

		/**
		 * The meta object literal for the '<em><b>Occi Component Installationstate Message</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MANAGEDCOMPONENT__OCCI_COMPONENT_INSTALLATIONSTATE_MESSAGE = eINSTANCE.getManagedcomponent_OcciComponentInstallationstateMessage();

		/**
		 * The meta object literal for the '{@link de.ugoe.cs.oco.occi.configmanagement.impl.ComponenthostingImpl <em>Componenthosting</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.ugoe.cs.oco.occi.configmanagement.impl.ComponenthostingImpl
		 * @see de.ugoe.cs.oco.occi.configmanagement.impl.ConfigmanagementPackageImpl#getComponenthosting()
		 * @generated
		 */
		EClass COMPONENTHOSTING = eINSTANCE.getComponenthosting();

		/**
		 * The meta object literal for the '<em><b>Target Constraint</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation COMPONENTHOSTING___TARGET_CONSTRAINT__DIAGNOSTICCHAIN_MAP = eINSTANCE.getComponenthosting__TargetConstraint__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '{@link de.ugoe.cs.oco.occi.configmanagement.InstallationState <em>Installation State</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.ugoe.cs.oco.occi.configmanagement.InstallationState
		 * @see de.ugoe.cs.oco.occi.configmanagement.impl.ConfigmanagementPackageImpl#getInstallationState()
		 * @generated
		 */
		EEnum INSTALLATION_STATE = eINSTANCE.getInstallationState();

	}

} //ConfigmanagementPackage
