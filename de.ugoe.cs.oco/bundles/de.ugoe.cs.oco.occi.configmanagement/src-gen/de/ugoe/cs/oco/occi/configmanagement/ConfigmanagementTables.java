/*******************************************************************************
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
 *************************************************************************
 * This code is 100% auto-generated
 * from:
 *   /de.ugoe.cs.oco.occi.configmanagement/model/configmanagement.ecore
 * using:
 *   /de.ugoe.cs.oco.occi.configmanagement/model/configmanagement.genmodel
 *   org.eclipse.ocl.examples.codegen.oclinecore.OCLinEcoreTables
 *
 * Do not edit it.
 *******************************************************************************/
package de.ugoe.cs.oco.occi.configmanagement;

import de.ugoe.cs.oco.occi.configmanagement.ConfigmanagementTables;
import org.eclipse.cmf.occi.core.OCCITables;
import org.eclipse.cmf.occi.platform.PlatformTables;
import org.eclipse.ocl.pivot.internal.library.ecore.EcoreExecutorEnumeration;
import org.eclipse.ocl.pivot.internal.library.ecore.EcoreExecutorEnumerationLiteral;
import org.eclipse.ocl.pivot.internal.library.ecore.EcoreExecutorPackage;
import org.eclipse.ocl.pivot.internal.library.ecore.EcoreExecutorProperty;
import org.eclipse.ocl.pivot.internal.library.ecore.EcoreExecutorType;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorFragment;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorOperation;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorProperty;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorStandardLibrary;
import org.eclipse.ocl.pivot.oclstdlib.OCLstdlibTables;

/**
 * ConfigmanagementTables provides the dispatch tables for the configmanagement for use by the OCL dispatcher.
 *
 * In order to ensure correct static initialization, a top level class element must be accessed
 * before any nested class element. Therefore an access to PACKAGE.getClass() is recommended.
 */
@SuppressWarnings("nls")
public class ConfigmanagementTables
{
	static {
		Init.initStart();
	}

	/**
	 *	The package descriptor for the package.
	 */
	public static final /*@NonNull*/ EcoreExecutorPackage PACKAGE = new EcoreExecutorPackage(ConfigmanagementPackage.eINSTANCE);

	/**
	 *	The library of all packages and types.
	 */
	public static final /*@NonNull*/ ExecutorStandardLibrary LIBRARY = OCLstdlibTables.LIBRARY;

	/**
	 *	Constants used by auto-generated code.
	 */
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.RootPackageId PACKid_$metamodel$ = org.eclipse.ocl.pivot.ids.IdManager.getRootPackageId("$metamodel$");
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.NsURIPackageId PACKid_http_c_s_s_oco_cs_ugoe_de_s_occi_s_configmanagement_s_ecore = org.eclipse.ocl.pivot.ids.IdManager.getNsURIPackageId("http://oco.cs.ugoe.de/occi/configmanagement/ecore", null, de.ugoe.cs.oco.occi.configmanagement.ConfigmanagementPackage.eINSTANCE);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.NsURIPackageId PACKid_http_c_s_s_schemas_ogf_org_s_occi_s_core_s_ecore = org.eclipse.ocl.pivot.ids.IdManager.getNsURIPackageId("http://schemas.ogf.org/occi/core/ecore", "occi", org.eclipse.cmf.occi.core.OCCIPackage.eINSTANCE);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.NsURIPackageId PACKid_http_c_s_s_schemas_ogf_org_s_occi_s_infrastructure_s_ecore = org.eclipse.ocl.pivot.ids.IdManager.getNsURIPackageId("http://schemas.ogf.org/occi/infrastructure/ecore", null, org.eclipse.cmf.occi.infrastructure.InfrastructurePackage.eINSTANCE);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_Class = de.ugoe.cs.oco.occi.configmanagement.ConfigmanagementTables.PACKid_$metamodel$.getClassId("Class", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_Componenthosting = de.ugoe.cs.oco.occi.configmanagement.ConfigmanagementTables.PACKid_http_c_s_s_oco_cs_ugoe_de_s_occi_s_configmanagement_s_ecore.getClassId("Componenthosting", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_Compute = de.ugoe.cs.oco.occi.configmanagement.ConfigmanagementTables.PACKid_http_c_s_s_schemas_ogf_org_s_occi_s_infrastructure_s_ecore.getClassId("Compute", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_Resource = de.ugoe.cs.oco.occi.configmanagement.ConfigmanagementTables.PACKid_http_c_s_s_schemas_ogf_org_s_occi_s_core_s_ecore.getClassId("Resource", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.EnumerationId ENUMid_InstallationState = de.ugoe.cs.oco.occi.configmanagement.ConfigmanagementTables.PACKid_http_c_s_s_oco_cs_ugoe_de_s_occi_s_configmanagement_s_ecore.getEnumerationId("InstallationState");
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.values.IntegerValue INT_0 = org.eclipse.ocl.pivot.utilities.ValueUtil.integerValueOf("0");
	public static final /*@NonInvalid*/ java.lang.String STR_Componenthosting_c_c_targetConstraint = "Componenthosting::targetConstraint";

	/**
	 *	The type parameters for templated types and operations.
	 */
	public static class TypeParameters {
		static {
			Init.initStart();
			ConfigmanagementTables.init();
		}

		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of ConfigmanagementTables::TypeParameters and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The type descriptors for each type.
	 */
	public static class Types {
		static {
			Init.initStart();
			TypeParameters.init();
		}

		public static final /*@NonNull*/ EcoreExecutorType _Ansiblerole = new EcoreExecutorType(ConfigmanagementPackage.Literals.ANSIBLEROLE, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _Componenthosting = new EcoreExecutorType(ConfigmanagementPackage.Literals.COMPONENTHOSTING, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorEnumeration _InstallationState = new EcoreExecutorEnumeration(ConfigmanagementPackage.Literals.INSTALLATION_STATE, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _Managedcomponent = new EcoreExecutorType(ConfigmanagementPackage.Literals.MANAGEDCOMPONENT, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _Roleattachment = new EcoreExecutorType(ConfigmanagementPackage.Literals.ROLEATTACHMENT, PACKAGE, 0);

		private static final /*@NonNull*/ EcoreExecutorType /*@NonNull*/ [] types = {
			_Ansiblerole,
			_Componenthosting,
			_InstallationState,
			_Managedcomponent,
			_Roleattachment
		};

		/*
		 *	Install the type descriptors in the package descriptor.
		 */
		static {
			PACKAGE.init(LIBRARY, types);
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of ConfigmanagementTables::Types and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The fragment descriptors for the local elements of each type and its supertypes.
	 */
	public static class Fragments {
		static {
			Init.initStart();
			Types.init();
		}

		private static final /*@NonNull*/ ExecutorFragment _Ansiblerole__Ansiblerole = new ExecutorFragment(Types._Ansiblerole, ConfigmanagementTables.Types._Ansiblerole);
		private static final /*@NonNull*/ ExecutorFragment _Ansiblerole__Entity = new ExecutorFragment(Types._Ansiblerole, OCCITables.Types._Entity);
		private static final /*@NonNull*/ ExecutorFragment _Ansiblerole__OclAny = new ExecutorFragment(Types._Ansiblerole, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _Ansiblerole__OclElement = new ExecutorFragment(Types._Ansiblerole, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _Ansiblerole__Resource = new ExecutorFragment(Types._Ansiblerole, OCCITables.Types._Resource);

		private static final /*@NonNull*/ ExecutorFragment _Componenthosting__Componenthosting = new ExecutorFragment(Types._Componenthosting, ConfigmanagementTables.Types._Componenthosting);
		private static final /*@NonNull*/ ExecutorFragment _Componenthosting__Entity = new ExecutorFragment(Types._Componenthosting, OCCITables.Types._Entity);
		private static final /*@NonNull*/ ExecutorFragment _Componenthosting__Link = new ExecutorFragment(Types._Componenthosting, OCCITables.Types._Link);
		private static final /*@NonNull*/ ExecutorFragment _Componenthosting__OclAny = new ExecutorFragment(Types._Componenthosting, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _Componenthosting__OclElement = new ExecutorFragment(Types._Componenthosting, OCLstdlibTables.Types._OclElement);

		private static final /*@NonNull*/ ExecutorFragment _InstallationState__InstallationState = new ExecutorFragment(Types._InstallationState, ConfigmanagementTables.Types._InstallationState);
		private static final /*@NonNull*/ ExecutorFragment _InstallationState__OclAny = new ExecutorFragment(Types._InstallationState, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _InstallationState__OclElement = new ExecutorFragment(Types._InstallationState, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _InstallationState__OclEnumeration = new ExecutorFragment(Types._InstallationState, OCLstdlibTables.Types._OclEnumeration);
		private static final /*@NonNull*/ ExecutorFragment _InstallationState__OclType = new ExecutorFragment(Types._InstallationState, OCLstdlibTables.Types._OclType);

		private static final /*@NonNull*/ ExecutorFragment _Managedcomponent__Component = new ExecutorFragment(Types._Managedcomponent, PlatformTables.Types._Component);
		private static final /*@NonNull*/ ExecutorFragment _Managedcomponent__Entity = new ExecutorFragment(Types._Managedcomponent, OCCITables.Types._Entity);
		private static final /*@NonNull*/ ExecutorFragment _Managedcomponent__Managedcomponent = new ExecutorFragment(Types._Managedcomponent, ConfigmanagementTables.Types._Managedcomponent);
		private static final /*@NonNull*/ ExecutorFragment _Managedcomponent__OclAny = new ExecutorFragment(Types._Managedcomponent, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _Managedcomponent__OclElement = new ExecutorFragment(Types._Managedcomponent, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _Managedcomponent__Resource = new ExecutorFragment(Types._Managedcomponent, OCCITables.Types._Resource);

		private static final /*@NonNull*/ ExecutorFragment _Roleattachment__Entity = new ExecutorFragment(Types._Roleattachment, OCCITables.Types._Entity);
		private static final /*@NonNull*/ ExecutorFragment _Roleattachment__Link = new ExecutorFragment(Types._Roleattachment, OCCITables.Types._Link);
		private static final /*@NonNull*/ ExecutorFragment _Roleattachment__OclAny = new ExecutorFragment(Types._Roleattachment, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _Roleattachment__OclElement = new ExecutorFragment(Types._Roleattachment, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _Roleattachment__Roleattachment = new ExecutorFragment(Types._Roleattachment, ConfigmanagementTables.Types._Roleattachment);

		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of ConfigmanagementTables::Fragments and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The parameter lists shared by operations.
	 *
	 * @noextend This class is not intended to be subclassed by clients.
	 * @noinstantiate This class is not intended to be instantiated by clients.
	 * @noreference This class is not intended to be referenced by clients.
	 */
	public static class Parameters {
		static {
			Init.initStart();
			Fragments.init();
		}


		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of ConfigmanagementTables::Parameters and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The operation descriptors for each operation of each type.
	 *
	 * @noextend This class is not intended to be subclassed by clients.
	 * @noinstantiate This class is not intended to be instantiated by clients.
	 * @noreference This class is not intended to be referenced by clients.
	 */
	public static class Operations {
		static {
			Init.initStart();
			Parameters.init();
		}

		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of ConfigmanagementTables::Operations and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The property descriptors for each property of each type.
	 *
	 * @noextend This class is not intended to be subclassed by clients.
	 * @noinstantiate This class is not intended to be instantiated by clients.
	 * @noreference This class is not intended to be referenced by clients.
	 */
	public static class Properties {
		static {
			Init.initStart();
			Operations.init();
		}

		public static final /*@NonNull*/ ExecutorProperty _Ansiblerole__occiAnsibleRolename = new EcoreExecutorProperty(ConfigmanagementPackage.Literals.ANSIBLEROLE__OCCI_ANSIBLE_ROLENAME, Types._Ansiblerole, 0);

		public static final /*@NonNull*/ ExecutorProperty _Managedcomponent__occiComponentInstallationstate = new EcoreExecutorProperty(ConfigmanagementPackage.Literals.MANAGEDCOMPONENT__OCCI_COMPONENT_INSTALLATIONSTATE, Types._Managedcomponent, 0);
		public static final /*@NonNull*/ ExecutorProperty _Managedcomponent__occiComponentInstallationstateMessage = new EcoreExecutorProperty(ConfigmanagementPackage.Literals.MANAGEDCOMPONENT__OCCI_COMPONENT_INSTALLATIONSTATE_MESSAGE, Types._Managedcomponent, 1);

		public static final /*@NonNull*/ ExecutorProperty _Roleattachment__occiAnsibleUser = new EcoreExecutorProperty(ConfigmanagementPackage.Literals.ROLEATTACHMENT__OCCI_ANSIBLE_USER, Types._Roleattachment, 0);
		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of ConfigmanagementTables::Properties and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The fragments for all base types in depth order: OclAny first, OclSelf last.
	 */
	public static class TypeFragments {
		static {
			Init.initStart();
			Properties.init();
		}

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _Ansiblerole =
		{
			Fragments._Ansiblerole__OclAny /* 0 */,
			Fragments._Ansiblerole__OclElement /* 1 */,
			Fragments._Ansiblerole__Entity /* 2 */,
			Fragments._Ansiblerole__Resource /* 3 */,
			Fragments._Ansiblerole__Ansiblerole /* 4 */
		};
		private static final int /*@NonNull*/ [] __Ansiblerole = { 1,1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _Componenthosting =
		{
			Fragments._Componenthosting__OclAny /* 0 */,
			Fragments._Componenthosting__OclElement /* 1 */,
			Fragments._Componenthosting__Entity /* 2 */,
			Fragments._Componenthosting__Link /* 3 */,
			Fragments._Componenthosting__Componenthosting /* 4 */
		};
		private static final int /*@NonNull*/ [] __Componenthosting = { 1,1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _InstallationState =
		{
			Fragments._InstallationState__OclAny /* 0 */,
			Fragments._InstallationState__OclElement /* 1 */,
			Fragments._InstallationState__OclType /* 2 */,
			Fragments._InstallationState__OclEnumeration /* 3 */,
			Fragments._InstallationState__InstallationState /* 4 */
		};
		private static final int /*@NonNull*/ [] __InstallationState = { 1,1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _Managedcomponent =
		{
			Fragments._Managedcomponent__OclAny /* 0 */,
			Fragments._Managedcomponent__OclElement /* 1 */,
			Fragments._Managedcomponent__Entity /* 2 */,
			Fragments._Managedcomponent__Resource /* 3 */,
			Fragments._Managedcomponent__Component /* 4 */,
			Fragments._Managedcomponent__Managedcomponent /* 5 */
		};
		private static final int /*@NonNull*/ [] __Managedcomponent = { 1,1,1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _Roleattachment =
		{
			Fragments._Roleattachment__OclAny /* 0 */,
			Fragments._Roleattachment__OclElement /* 1 */,
			Fragments._Roleattachment__Entity /* 2 */,
			Fragments._Roleattachment__Link /* 3 */,
			Fragments._Roleattachment__Roleattachment /* 4 */
		};
		private static final int /*@NonNull*/ [] __Roleattachment = { 1,1,1,1,1 };

		/**
		 *	Install the fragment descriptors in the class descriptors.
		 */
		static {
			Types._Ansiblerole.initFragments(_Ansiblerole, __Ansiblerole);
			Types._Componenthosting.initFragments(_Componenthosting, __Componenthosting);
			Types._InstallationState.initFragments(_InstallationState, __InstallationState);
			Types._Managedcomponent.initFragments(_Managedcomponent, __Managedcomponent);
			Types._Roleattachment.initFragments(_Roleattachment, __Roleattachment);

			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of ConfigmanagementTables::TypeFragments and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The lists of local operations or local operation overrides for each fragment of each type.
	 */
	public static class FragmentOperations {
		static {
			Init.initStart();
			TypeFragments.init();
		}

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Ansiblerole__Ansiblerole = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Ansiblerole__Entity = {
			OCCITables.Operations._Entity__occiCreate /* occiCreate() */,
			OCCITables.Operations._Entity__occiCreate /* occiCreate() */,
			OCCITables.Operations._Entity__occiDelete /* occiDelete() */,
			OCCITables.Operations._Entity__occiDelete /* occiDelete() */,
			OCCITables.Operations._Entity__occiRetrieve /* occiRetrieve() */,
			OCCITables.Operations._Entity__occiRetrieve /* occiRetrieve() */,
			OCCITables.Operations._Entity__occiUpdate /* occiUpdate() */,
			OCCITables.Operations._Entity__occiUpdate /* occiUpdate() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Ansiblerole__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[?]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Ansiblerole__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Ansiblerole__Resource = {};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Componenthosting__Componenthosting = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Componenthosting__Entity = {
			OCCITables.Operations._Entity__occiCreate /* occiCreate() */,
			OCCITables.Operations._Entity__occiCreate /* occiCreate() */,
			OCCITables.Operations._Entity__occiDelete /* occiDelete() */,
			OCCITables.Operations._Entity__occiDelete /* occiDelete() */,
			OCCITables.Operations._Entity__occiRetrieve /* occiRetrieve() */,
			OCCITables.Operations._Entity__occiRetrieve /* occiRetrieve() */,
			OCCITables.Operations._Entity__occiUpdate /* occiUpdate() */,
			OCCITables.Operations._Entity__occiUpdate /* occiUpdate() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Componenthosting__Link = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Componenthosting__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[?]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Componenthosting__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _InstallationState__InstallationState = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _InstallationState__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[?]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _InstallationState__OclElement = {
			OCLstdlibTables.Operations._OclEnumeration__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _InstallationState__OclEnumeration = {
			OCLstdlibTables.Operations._OclEnumeration__allInstances /* allInstances() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _InstallationState__OclType = {
			OCLstdlibTables.Operations._OclType__conformsTo /* conformsTo(OclType[?]) */
		};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Managedcomponent__Managedcomponent = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Managedcomponent__Component = {
			PlatformTables.Operations._Component__start /* start() */,
			PlatformTables.Operations._Component__start /* start() */,
			PlatformTables.Operations._Component__stop /* stop() */,
			PlatformTables.Operations._Component__stop /* stop() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Managedcomponent__Entity = {
			OCCITables.Operations._Entity__occiCreate /* occiCreate() */,
			OCCITables.Operations._Entity__occiCreate /* occiCreate() */,
			OCCITables.Operations._Entity__occiDelete /* occiDelete() */,
			OCCITables.Operations._Entity__occiDelete /* occiDelete() */,
			OCCITables.Operations._Entity__occiRetrieve /* occiRetrieve() */,
			OCCITables.Operations._Entity__occiRetrieve /* occiRetrieve() */,
			OCCITables.Operations._Entity__occiUpdate /* occiUpdate() */,
			OCCITables.Operations._Entity__occiUpdate /* occiUpdate() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Managedcomponent__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[?]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Managedcomponent__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Managedcomponent__Resource = {};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Roleattachment__Roleattachment = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Roleattachment__Entity = {
			OCCITables.Operations._Entity__occiCreate /* occiCreate() */,
			OCCITables.Operations._Entity__occiCreate /* occiCreate() */,
			OCCITables.Operations._Entity__occiDelete /* occiDelete() */,
			OCCITables.Operations._Entity__occiDelete /* occiDelete() */,
			OCCITables.Operations._Entity__occiRetrieve /* occiRetrieve() */,
			OCCITables.Operations._Entity__occiRetrieve /* occiRetrieve() */,
			OCCITables.Operations._Entity__occiUpdate /* occiUpdate() */,
			OCCITables.Operations._Entity__occiUpdate /* occiUpdate() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Roleattachment__Link = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Roleattachment__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[?]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Roleattachment__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		/*
		 *	Install the operation descriptors in the fragment descriptors.
		 */
		static {
			Fragments._Ansiblerole__Ansiblerole.initOperations(_Ansiblerole__Ansiblerole);
			Fragments._Ansiblerole__Entity.initOperations(_Ansiblerole__Entity);
			Fragments._Ansiblerole__OclAny.initOperations(_Ansiblerole__OclAny);
			Fragments._Ansiblerole__OclElement.initOperations(_Ansiblerole__OclElement);
			Fragments._Ansiblerole__Resource.initOperations(_Ansiblerole__Resource);

			Fragments._Componenthosting__Componenthosting.initOperations(_Componenthosting__Componenthosting);
			Fragments._Componenthosting__Entity.initOperations(_Componenthosting__Entity);
			Fragments._Componenthosting__Link.initOperations(_Componenthosting__Link);
			Fragments._Componenthosting__OclAny.initOperations(_Componenthosting__OclAny);
			Fragments._Componenthosting__OclElement.initOperations(_Componenthosting__OclElement);

			Fragments._InstallationState__InstallationState.initOperations(_InstallationState__InstallationState);
			Fragments._InstallationState__OclAny.initOperations(_InstallationState__OclAny);
			Fragments._InstallationState__OclElement.initOperations(_InstallationState__OclElement);
			Fragments._InstallationState__OclEnumeration.initOperations(_InstallationState__OclEnumeration);
			Fragments._InstallationState__OclType.initOperations(_InstallationState__OclType);

			Fragments._Managedcomponent__Component.initOperations(_Managedcomponent__Component);
			Fragments._Managedcomponent__Entity.initOperations(_Managedcomponent__Entity);
			Fragments._Managedcomponent__Managedcomponent.initOperations(_Managedcomponent__Managedcomponent);
			Fragments._Managedcomponent__OclAny.initOperations(_Managedcomponent__OclAny);
			Fragments._Managedcomponent__OclElement.initOperations(_Managedcomponent__OclElement);
			Fragments._Managedcomponent__Resource.initOperations(_Managedcomponent__Resource);

			Fragments._Roleattachment__Entity.initOperations(_Roleattachment__Entity);
			Fragments._Roleattachment__Link.initOperations(_Roleattachment__Link);
			Fragments._Roleattachment__OclAny.initOperations(_Roleattachment__OclAny);
			Fragments._Roleattachment__OclElement.initOperations(_Roleattachment__OclElement);
			Fragments._Roleattachment__Roleattachment.initOperations(_Roleattachment__Roleattachment);

			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of ConfigmanagementTables::FragmentOperations and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The lists of local properties for the local fragment of each type.
	 */
	public static class FragmentProperties {
		static {
			Init.initStart();
			FragmentOperations.init();
		}

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _Ansiblerole = {
			ConfigmanagementTables.Properties._Ansiblerole__occiAnsibleRolename
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _Componenthosting = {};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _InstallationState = {};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _Managedcomponent = {
			ConfigmanagementTables.Properties._Managedcomponent__occiComponentInstallationstate,
			ConfigmanagementTables.Properties._Managedcomponent__occiComponentInstallationstateMessage
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _Roleattachment = {
			ConfigmanagementTables.Properties._Roleattachment__occiAnsibleUser
		};

		/**
		 *	Install the property descriptors in the fragment descriptors.
		 */
		static {
			Fragments._Ansiblerole__Ansiblerole.initProperties(_Ansiblerole);
			Fragments._Componenthosting__Componenthosting.initProperties(_Componenthosting);
			Fragments._InstallationState__InstallationState.initProperties(_InstallationState);
			Fragments._Managedcomponent__Managedcomponent.initProperties(_Managedcomponent);
			Fragments._Roleattachment__Roleattachment.initProperties(_Roleattachment);

			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of ConfigmanagementTables::FragmentProperties and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The lists of enumeration literals for each enumeration.
	 */
	public static class EnumerationLiterals {
		static {
			Init.initStart();
			FragmentProperties.init();
		}

		public static final /*@NonNull*/ EcoreExecutorEnumerationLiteral _InstallationState__installed = new EcoreExecutorEnumerationLiteral(ConfigmanagementPackage.Literals.INSTALLATION_STATE.getEEnumLiteral("installed"), Types._InstallationState, 0);
		public static final /*@NonNull*/ EcoreExecutorEnumerationLiteral _InstallationState__uninstalled = new EcoreExecutorEnumerationLiteral(ConfigmanagementPackage.Literals.INSTALLATION_STATE.getEEnumLiteral("uninstalled"), Types._InstallationState, 1);
		private static final /*@NonNull*/ EcoreExecutorEnumerationLiteral /*@NonNull*/ [] _InstallationState = {
			_InstallationState__installed,
			_InstallationState__uninstalled
		};

		/**
		 *	Install the enumeration literals in the enumerations.
		 */
		static {
			Types._InstallationState.initLiterals(_InstallationState);

			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of ConfigmanagementTables::EnumerationLiterals and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 * The multiple packages above avoid problems with the Java 65536 byte limit but introduce a difficulty in ensuring that
	 * static construction occurs in the disciplined order of the packages when construction may start in any of the packages.
	 * The problem is resolved by ensuring that the static construction of each package first initializes its immediate predecessor.
	 * On completion of predecessor initialization, the residual packages are initialized by starting an initialization in the last package.
	 * This class maintains a count so that the various predecessors can distinguish whether they are the starting point and so
	 * ensure that residual construction occurs just once after all predecessors.
	 */
	private static class Init {
		/**
		 * Counter of nested static constructions. On return to zero residual construction starts. -ve once residual construction started.
		 */
		private static int initCount = 0;

		/**
		 * Invoked at the start of a static construction to defer residual cobstruction until primary constructions complete.
		 */
		private static void initStart() {
			if (initCount >= 0) {
				initCount++;
			}
		}

		/**
		 * Invoked at the end of a static construction to activate residual cobstruction once primary constructions complete.
		 */
		private static void initEnd() {
			if (initCount > 0) {
				if (--initCount == 0) {
					initCount = -1;
					EnumerationLiterals.init();
				}
			}
		}
	}

	static {
		Init.initEnd();
	}

	/*
	 * Force initialization of outer fields. Inner fields are lazily initialized.
	 */
	public static void init() {}
}
