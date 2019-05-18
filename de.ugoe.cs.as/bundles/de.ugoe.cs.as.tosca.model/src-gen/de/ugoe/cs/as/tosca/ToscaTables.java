/*******************************************************************************
 *************************************************************************
 * This code is 100% auto-generated
 * from:
 *   /de.ugoe.cs.oco.tosca.model/model/tosca.ecore
 * using:
 *   /de.ugoe.cs.oco.tosca.model/model/tosca.genmodel
 *   org.eclipse.ocl.examples.codegen.oclinecore.OCLinEcoreTables
 *
 * Do not edit it.
 *******************************************************************************/
package de.ugoe.cs.as.tosca;

import org.eclipse.ocl.pivot.internal.library.ecore.EcoreExecutorEnumeration;
import org.eclipse.ocl.pivot.internal.library.ecore.EcoreExecutorEnumerationLiteral;
import org.eclipse.ocl.pivot.internal.library.ecore.EcoreExecutorPackage;
import org.eclipse.ocl.pivot.internal.library.ecore.EcoreExecutorProperty;
import org.eclipse.ocl.pivot.internal.library.ecore.EcoreExecutorType;
import org.eclipse.ocl.pivot.internal.library.ecore.EcoreLibraryOppositeProperty;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorFragment;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorOperation;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorProperty;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorPropertyWithImplementation;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorStandardLibrary;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorType;
import org.eclipse.ocl.pivot.oclstdlib.OCLstdlibTables;

import de.ugoe.cs.as.tosca.ToscaTables;

/**
 * ToscaTables provides the dispatch tables for the tosca for use by the OCL dispatcher.
 *
 * In order to ensure correct static initialization, a top level class element must be accessed
 * before any nested class element. Therefore an access to PACKAGE.getClass() is recommended.
 */
@SuppressWarnings("nls")
public class ToscaTables
{
	static {
		Init.initStart();
	}

	/**
	 *	The package descriptor for the package.
	 */
	public static final /*@NonNull*/ EcoreExecutorPackage PACKAGE = new EcoreExecutorPackage(ToscaPackage.eINSTANCE);

	/**
	 *	The library of all packages and types.
	 */
	public static final /*@NonNull*/ ExecutorStandardLibrary LIBRARY = OCLstdlibTables.LIBRARY;

	/**
	 *	Constants used by auto-generated code.
	 */
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.RootPackageId PACKid_$metamodel$ = org.eclipse.ocl.pivot.ids.IdManager.getRootPackageId("$metamodel$");
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.NsURIPackageId PACKid_http_c_s_s_oco_cs_ugoe_de_s_tosca = org.eclipse.ocl.pivot.ids.IdManager.getNsURIPackageId("http://oco.cs.ugoe.de/tosca", null, de.ugoe.cs.as.tosca.ToscaPackage.eINSTANCE);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.NsURIPackageId PACKid_http_c_s_s_www_eclipse_org_s_emf_s_2002_s_Ecore = org.eclipse.ocl.pivot.ids.IdManager.getNsURIPackageId("http://www.eclipse.org/emf/2002/Ecore", null, org.eclipse.emf.ecore.EcorePackage.eINSTANCE);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.NsURIPackageId PACKid_http_c_s_s_www_eclipse_org_s_emf_s_2003_s_XMLType = org.eclipse.ocl.pivot.ids.IdManager.getNsURIPackageId("http://www.eclipse.org/emf/2003/XMLType", null, org.eclipse.emf.ecore.xml.type.XMLTypePackage.eINSTANCE);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.NsURIPackageId PACKid_http_c_s_s_www_eclipse_org_s_xsd_s_2002_s_XSD = org.eclipse.ocl.pivot.ids.IdManager.getNsURIPackageId("http://www.eclipse.org/xsd/2002/XSD", null, org.eclipse.xsd.XSDPackage.eINSTANCE);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.NsURIPackageId PACKid_http_c_s_s_www_w3_org_s_XML_s_1998_s_namespace = org.eclipse.ocl.pivot.ids.IdManager.getNsURIPackageId("http://www.w3.org/XML/1998/namespace", null, org.eclipse.emf.ecore.xml.namespace.XMLNamespacePackage.eINSTANCE);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_ArtifactReferencesType = de.ugoe.cs.as.tosca.ToscaTables.PACKid_http_c_s_s_oco_cs_ugoe_de_s_tosca.getClassId("ArtifactReferencesType", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_CapabilitiesType = de.ugoe.cs.as.tosca.ToscaTables.PACKid_http_c_s_s_oco_cs_ugoe_de_s_tosca.getClassId("CapabilitiesType", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_CapabilitiesType1 = de.ugoe.cs.as.tosca.ToscaTables.PACKid_http_c_s_s_oco_cs_ugoe_de_s_tosca.getClassId("CapabilitiesType1", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_CapabilitiesType2 = de.ugoe.cs.as.tosca.ToscaTables.PACKid_http_c_s_s_oco_cs_ugoe_de_s_tosca.getClassId("CapabilitiesType2", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_CapabilityDefinitionsType = de.ugoe.cs.as.tosca.ToscaTables.PACKid_http_c_s_s_oco_cs_ugoe_de_s_tosca.getClassId("CapabilityDefinitionsType", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_CapabilityDefinitionsType1 = de.ugoe.cs.as.tosca.ToscaTables.PACKid_http_c_s_s_oco_cs_ugoe_de_s_tosca.getClassId("CapabilityDefinitionsType1", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_Class = de.ugoe.cs.as.tosca.ToscaTables.PACKid_$metamodel$.getClassId("Class", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_ConstraintsType = de.ugoe.cs.as.tosca.ToscaTables.PACKid_http_c_s_s_oco_cs_ugoe_de_s_tosca.getClassId("ConstraintsType", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_ConstraintsType1 = de.ugoe.cs.as.tosca.ToscaTables.PACKid_http_c_s_s_oco_cs_ugoe_de_s_tosca.getClassId("ConstraintsType1", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_DefinitionsType = de.ugoe.cs.as.tosca.ToscaTables.PACKid_http_c_s_s_oco_cs_ugoe_de_s_tosca.getClassId("DefinitionsType", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_DerivedFromType = de.ugoe.cs.as.tosca.ToscaTables.PACKid_http_c_s_s_oco_cs_ugoe_de_s_tosca.getClassId("DerivedFromType", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_DerivedFromType1 = de.ugoe.cs.as.tosca.ToscaTables.PACKid_http_c_s_s_oco_cs_ugoe_de_s_tosca.getClassId("DerivedFromType1", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_DerivedFromType2 = de.ugoe.cs.as.tosca.ToscaTables.PACKid_http_c_s_s_oco_cs_ugoe_de_s_tosca.getClassId("DerivedFromType2", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_DocumentRoot = de.ugoe.cs.as.tosca.ToscaTables.PACKid_http_c_s_s_oco_cs_ugoe_de_s_tosca.getClassId("DocumentRoot", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_EObject = de.ugoe.cs.as.tosca.ToscaTables.PACKid_http_c_s_s_www_eclipse_org_s_emf_s_2002_s_Ecore.getClassId("EObject", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_EStringToStringMapEntry = de.ugoe.cs.as.tosca.ToscaTables.PACKid_http_c_s_s_www_eclipse_org_s_emf_s_2002_s_Ecore.getClassId("EStringToStringMapEntry", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_ExcludeType = de.ugoe.cs.as.tosca.ToscaTables.PACKid_http_c_s_s_oco_cs_ugoe_de_s_tosca.getClassId("ExcludeType", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_ExtensionsType = de.ugoe.cs.as.tosca.ToscaTables.PACKid_http_c_s_s_oco_cs_ugoe_de_s_tosca.getClassId("ExtensionsType", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_ImplementationArtifactType = de.ugoe.cs.as.tosca.ToscaTables.PACKid_http_c_s_s_oco_cs_ugoe_de_s_tosca.getClassId("ImplementationArtifactType", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_IncludeType = de.ugoe.cs.as.tosca.ToscaTables.PACKid_http_c_s_s_oco_cs_ugoe_de_s_tosca.getClassId("IncludeType", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_InputParametersType = de.ugoe.cs.as.tosca.ToscaTables.PACKid_http_c_s_s_oco_cs_ugoe_de_s_tosca.getClassId("InputParametersType", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_InputParametersType1 = de.ugoe.cs.as.tosca.ToscaTables.PACKid_http_c_s_s_oco_cs_ugoe_de_s_tosca.getClassId("InputParametersType1", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_InstanceStateType = de.ugoe.cs.as.tosca.ToscaTables.PACKid_http_c_s_s_oco_cs_ugoe_de_s_tosca.getClassId("InstanceStateType", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_InterfacesType = de.ugoe.cs.as.tosca.ToscaTables.PACKid_http_c_s_s_oco_cs_ugoe_de_s_tosca.getClassId("InterfacesType", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_InterfacesType1 = de.ugoe.cs.as.tosca.ToscaTables.PACKid_http_c_s_s_oco_cs_ugoe_de_s_tosca.getClassId("InterfacesType1", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_InterfacesType2 = de.ugoe.cs.as.tosca.ToscaTables.PACKid_http_c_s_s_oco_cs_ugoe_de_s_tosca.getClassId("InterfacesType2", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_NodeOperationType = de.ugoe.cs.as.tosca.ToscaTables.PACKid_http_c_s_s_oco_cs_ugoe_de_s_tosca.getClassId("NodeOperationType", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_NodeTypeReferenceType = de.ugoe.cs.as.tosca.ToscaTables.PACKid_http_c_s_s_oco_cs_ugoe_de_s_tosca.getClassId("NodeTypeReferenceType", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_OutputParametersType = de.ugoe.cs.as.tosca.ToscaTables.PACKid_http_c_s_s_oco_cs_ugoe_de_s_tosca.getClassId("OutputParametersType", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_OutputParametersType1 = de.ugoe.cs.as.tosca.ToscaTables.PACKid_http_c_s_s_oco_cs_ugoe_de_s_tosca.getClassId("OutputParametersType1", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_PlanModelReferenceType = de.ugoe.cs.as.tosca.ToscaTables.PACKid_http_c_s_s_oco_cs_ugoe_de_s_tosca.getClassId("PlanModelReferenceType", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_PlanModelType = de.ugoe.cs.as.tosca.ToscaTables.PACKid_http_c_s_s_oco_cs_ugoe_de_s_tosca.getClassId("PlanModelType", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_PlanType = de.ugoe.cs.as.tosca.ToscaTables.PACKid_http_c_s_s_oco_cs_ugoe_de_s_tosca.getClassId("PlanType", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_PoliciesType = de.ugoe.cs.as.tosca.ToscaTables.PACKid_http_c_s_s_oco_cs_ugoe_de_s_tosca.getClassId("PoliciesType", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_PoliciesType1 = de.ugoe.cs.as.tosca.ToscaTables.PACKid_http_c_s_s_oco_cs_ugoe_de_s_tosca.getClassId("PoliciesType1", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_PoliciesType2 = de.ugoe.cs.as.tosca.ToscaTables.PACKid_http_c_s_s_oco_cs_ugoe_de_s_tosca.getClassId("PoliciesType2", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_PropertiesDefinitionType = de.ugoe.cs.as.tosca.ToscaTables.PACKid_http_c_s_s_oco_cs_ugoe_de_s_tosca.getClassId("PropertiesDefinitionType", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_PropertiesType = de.ugoe.cs.as.tosca.ToscaTables.PACKid_http_c_s_s_oco_cs_ugoe_de_s_tosca.getClassId("PropertiesType", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_PropertiesType1 = de.ugoe.cs.as.tosca.ToscaTables.PACKid_http_c_s_s_oco_cs_ugoe_de_s_tosca.getClassId("PropertiesType1", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_PropertyConstraintsType = de.ugoe.cs.as.tosca.ToscaTables.PACKid_http_c_s_s_oco_cs_ugoe_de_s_tosca.getClassId("PropertyConstraintsType", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_PropertyConstraintsType1 = de.ugoe.cs.as.tosca.ToscaTables.PACKid_http_c_s_s_oco_cs_ugoe_de_s_tosca.getClassId("PropertyConstraintsType1", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_PropertyMappingsType = de.ugoe.cs.as.tosca.ToscaTables.PACKid_http_c_s_s_oco_cs_ugoe_de_s_tosca.getClassId("PropertyMappingsType", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_RelationshipConstraintType = de.ugoe.cs.as.tosca.ToscaTables.PACKid_http_c_s_s_oco_cs_ugoe_de_s_tosca.getClassId("RelationshipConstraintType", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_RelationshipConstraintsType = de.ugoe.cs.as.tosca.ToscaTables.PACKid_http_c_s_s_oco_cs_ugoe_de_s_tosca.getClassId("RelationshipConstraintsType", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_RelationshipOperationType = de.ugoe.cs.as.tosca.ToscaTables.PACKid_http_c_s_s_oco_cs_ugoe_de_s_tosca.getClassId("RelationshipOperationType", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_RequirementDefinitionsType = de.ugoe.cs.as.tosca.ToscaTables.PACKid_http_c_s_s_oco_cs_ugoe_de_s_tosca.getClassId("RequirementDefinitionsType", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_RequirementDefinitionsType1 = de.ugoe.cs.as.tosca.ToscaTables.PACKid_http_c_s_s_oco_cs_ugoe_de_s_tosca.getClassId("RequirementDefinitionsType1", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_RequirementsType = de.ugoe.cs.as.tosca.ToscaTables.PACKid_http_c_s_s_oco_cs_ugoe_de_s_tosca.getClassId("RequirementsType", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_RequirementsType1 = de.ugoe.cs.as.tosca.ToscaTables.PACKid_http_c_s_s_oco_cs_ugoe_de_s_tosca.getClassId("RequirementsType1", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_RequirementsType2 = de.ugoe.cs.as.tosca.ToscaTables.PACKid_http_c_s_s_oco_cs_ugoe_de_s_tosca.getClassId("RequirementsType2", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_SourceElementType = de.ugoe.cs.as.tosca.ToscaTables.PACKid_http_c_s_s_oco_cs_ugoe_de_s_tosca.getClassId("SourceElementType", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_SourceInterfacesType = de.ugoe.cs.as.tosca.ToscaTables.PACKid_http_c_s_s_oco_cs_ugoe_de_s_tosca.getClassId("SourceInterfacesType", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_TAppliesTo = de.ugoe.cs.as.tosca.ToscaTables.PACKid_http_c_s_s_oco_cs_ugoe_de_s_tosca.getClassId("TAppliesTo", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_TArtifactReference = de.ugoe.cs.as.tosca.ToscaTables.PACKid_http_c_s_s_oco_cs_ugoe_de_s_tosca.getClassId("TArtifactReference", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_TArtifactTemplate = de.ugoe.cs.as.tosca.ToscaTables.PACKid_http_c_s_s_oco_cs_ugoe_de_s_tosca.getClassId("TArtifactTemplate", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_TArtifactType = de.ugoe.cs.as.tosca.ToscaTables.PACKid_http_c_s_s_oco_cs_ugoe_de_s_tosca.getClassId("TArtifactType", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_TBoundaryDefinitions = de.ugoe.cs.as.tosca.ToscaTables.PACKid_http_c_s_s_oco_cs_ugoe_de_s_tosca.getClassId("TBoundaryDefinitions", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_TCapability = de.ugoe.cs.as.tosca.ToscaTables.PACKid_http_c_s_s_oco_cs_ugoe_de_s_tosca.getClassId("TCapability", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_TCapabilityDefinition = de.ugoe.cs.as.tosca.ToscaTables.PACKid_http_c_s_s_oco_cs_ugoe_de_s_tosca.getClassId("TCapabilityDefinition", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_TCapabilityRef = de.ugoe.cs.as.tosca.ToscaTables.PACKid_http_c_s_s_oco_cs_ugoe_de_s_tosca.getClassId("TCapabilityRef", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_TCapabilityType = de.ugoe.cs.as.tosca.ToscaTables.PACKid_http_c_s_s_oco_cs_ugoe_de_s_tosca.getClassId("TCapabilityType", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_TCondition = de.ugoe.cs.as.tosca.ToscaTables.PACKid_http_c_s_s_oco_cs_ugoe_de_s_tosca.getClassId("TCondition", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_TConstraint = de.ugoe.cs.as.tosca.ToscaTables.PACKid_http_c_s_s_oco_cs_ugoe_de_s_tosca.getClassId("TConstraint", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_TDefinitions = de.ugoe.cs.as.tosca.ToscaTables.PACKid_http_c_s_s_oco_cs_ugoe_de_s_tosca.getClassId("TDefinitions", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_TDeploymentArtifact = de.ugoe.cs.as.tosca.ToscaTables.PACKid_http_c_s_s_oco_cs_ugoe_de_s_tosca.getClassId("TDeploymentArtifact", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_TDeploymentArtifacts = de.ugoe.cs.as.tosca.ToscaTables.PACKid_http_c_s_s_oco_cs_ugoe_de_s_tosca.getClassId("TDeploymentArtifacts", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_TDocumentation = de.ugoe.cs.as.tosca.ToscaTables.PACKid_http_c_s_s_oco_cs_ugoe_de_s_tosca.getClassId("TDocumentation", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_TEntityTemplate = de.ugoe.cs.as.tosca.ToscaTables.PACKid_http_c_s_s_oco_cs_ugoe_de_s_tosca.getClassId("TEntityTemplate", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_TEntityType = de.ugoe.cs.as.tosca.ToscaTables.PACKid_http_c_s_s_oco_cs_ugoe_de_s_tosca.getClassId("TEntityType", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_TExportedInterface = de.ugoe.cs.as.tosca.ToscaTables.PACKid_http_c_s_s_oco_cs_ugoe_de_s_tosca.getClassId("TExportedInterface", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_TExportedOperation = de.ugoe.cs.as.tosca.ToscaTables.PACKid_http_c_s_s_oco_cs_ugoe_de_s_tosca.getClassId("TExportedOperation", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_TExtensibleElements = de.ugoe.cs.as.tosca.ToscaTables.PACKid_http_c_s_s_oco_cs_ugoe_de_s_tosca.getClassId("TExtensibleElements", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_TExtension = de.ugoe.cs.as.tosca.ToscaTables.PACKid_http_c_s_s_oco_cs_ugoe_de_s_tosca.getClassId("TExtension", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_TExtensions = de.ugoe.cs.as.tosca.ToscaTables.PACKid_http_c_s_s_oco_cs_ugoe_de_s_tosca.getClassId("TExtensions", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_TGroupTemplate = de.ugoe.cs.as.tosca.ToscaTables.PACKid_http_c_s_s_oco_cs_ugoe_de_s_tosca.getClassId("TGroupTemplate", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_TGroupType = de.ugoe.cs.as.tosca.ToscaTables.PACKid_http_c_s_s_oco_cs_ugoe_de_s_tosca.getClassId("TGroupType", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_TImplementationArtifacts = de.ugoe.cs.as.tosca.ToscaTables.PACKid_http_c_s_s_oco_cs_ugoe_de_s_tosca.getClassId("TImplementationArtifacts", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_TImport = de.ugoe.cs.as.tosca.ToscaTables.PACKid_http_c_s_s_oco_cs_ugoe_de_s_tosca.getClassId("TImport", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_TInterface = de.ugoe.cs.as.tosca.ToscaTables.PACKid_http_c_s_s_oco_cs_ugoe_de_s_tosca.getClassId("TInterface", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_TNodeTemplate = de.ugoe.cs.as.tosca.ToscaTables.PACKid_http_c_s_s_oco_cs_ugoe_de_s_tosca.getClassId("TNodeTemplate", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_TNodeType = de.ugoe.cs.as.tosca.ToscaTables.PACKid_http_c_s_s_oco_cs_ugoe_de_s_tosca.getClassId("TNodeType", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_TNodeTypeImplementation = de.ugoe.cs.as.tosca.ToscaTables.PACKid_http_c_s_s_oco_cs_ugoe_de_s_tosca.getClassId("TNodeTypeImplementation", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_TOperation = de.ugoe.cs.as.tosca.ToscaTables.PACKid_http_c_s_s_oco_cs_ugoe_de_s_tosca.getClassId("TOperation", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_TParameter = de.ugoe.cs.as.tosca.ToscaTables.PACKid_http_c_s_s_oco_cs_ugoe_de_s_tosca.getClassId("TParameter", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_TPlan = de.ugoe.cs.as.tosca.ToscaTables.PACKid_http_c_s_s_oco_cs_ugoe_de_s_tosca.getClassId("TPlan", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_TPlans = de.ugoe.cs.as.tosca.ToscaTables.PACKid_http_c_s_s_oco_cs_ugoe_de_s_tosca.getClassId("TPlans", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_TPolicy = de.ugoe.cs.as.tosca.ToscaTables.PACKid_http_c_s_s_oco_cs_ugoe_de_s_tosca.getClassId("TPolicy", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_TPolicyTemplate = de.ugoe.cs.as.tosca.ToscaTables.PACKid_http_c_s_s_oco_cs_ugoe_de_s_tosca.getClassId("TPolicyTemplate", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_TPolicyType = de.ugoe.cs.as.tosca.ToscaTables.PACKid_http_c_s_s_oco_cs_ugoe_de_s_tosca.getClassId("TPolicyType", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_TPropertyConstraint = de.ugoe.cs.as.tosca.ToscaTables.PACKid_http_c_s_s_oco_cs_ugoe_de_s_tosca.getClassId("TPropertyConstraint", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_TPropertyMapping = de.ugoe.cs.as.tosca.ToscaTables.PACKid_http_c_s_s_oco_cs_ugoe_de_s_tosca.getClassId("TPropertyMapping", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_TRelationshipTemplate = de.ugoe.cs.as.tosca.ToscaTables.PACKid_http_c_s_s_oco_cs_ugoe_de_s_tosca.getClassId("TRelationshipTemplate", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_TRelationshipType = de.ugoe.cs.as.tosca.ToscaTables.PACKid_http_c_s_s_oco_cs_ugoe_de_s_tosca.getClassId("TRelationshipType", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_TRelationshipTypeImplementation = de.ugoe.cs.as.tosca.ToscaTables.PACKid_http_c_s_s_oco_cs_ugoe_de_s_tosca.getClassId("TRelationshipTypeImplementation", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_TRequiredContainerFeature = de.ugoe.cs.as.tosca.ToscaTables.PACKid_http_c_s_s_oco_cs_ugoe_de_s_tosca.getClassId("TRequiredContainerFeature", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_TRequiredContainerFeatures = de.ugoe.cs.as.tosca.ToscaTables.PACKid_http_c_s_s_oco_cs_ugoe_de_s_tosca.getClassId("TRequiredContainerFeatures", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_TRequirement = de.ugoe.cs.as.tosca.ToscaTables.PACKid_http_c_s_s_oco_cs_ugoe_de_s_tosca.getClassId("TRequirement", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_TRequirementDefinition = de.ugoe.cs.as.tosca.ToscaTables.PACKid_http_c_s_s_oco_cs_ugoe_de_s_tosca.getClassId("TRequirementDefinition", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_TRequirementRef = de.ugoe.cs.as.tosca.ToscaTables.PACKid_http_c_s_s_oco_cs_ugoe_de_s_tosca.getClassId("TRequirementRef", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_TRequirementType = de.ugoe.cs.as.tosca.ToscaTables.PACKid_http_c_s_s_oco_cs_ugoe_de_s_tosca.getClassId("TRequirementType", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_TServiceTemplate = de.ugoe.cs.as.tosca.ToscaTables.PACKid_http_c_s_s_oco_cs_ugoe_de_s_tosca.getClassId("TServiceTemplate", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_TTag = de.ugoe.cs.as.tosca.ToscaTables.PACKid_http_c_s_s_oco_cs_ugoe_de_s_tosca.getClassId("TTag", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_TTags = de.ugoe.cs.as.tosca.ToscaTables.PACKid_http_c_s_s_oco_cs_ugoe_de_s_tosca.getClassId("TTags", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_TTopologyElementInstanceStates = de.ugoe.cs.as.tosca.ToscaTables.PACKid_http_c_s_s_oco_cs_ugoe_de_s_tosca.getClassId("TTopologyElementInstanceStates", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_TTopologyTemplate = de.ugoe.cs.as.tosca.ToscaTables.PACKid_http_c_s_s_oco_cs_ugoe_de_s_tosca.getClassId("TTopologyTemplate", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_TargetElementType = de.ugoe.cs.as.tosca.ToscaTables.PACKid_http_c_s_s_oco_cs_ugoe_de_s_tosca.getClassId("TargetElementType", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_TargetInterfacesType = de.ugoe.cs.as.tosca.ToscaTables.PACKid_http_c_s_s_oco_cs_ugoe_de_s_tosca.getClassId("TargetInterfacesType", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_TypesType = de.ugoe.cs.as.tosca.ToscaTables.PACKid_http_c_s_s_oco_cs_ugoe_de_s_tosca.getClassId("TypesType", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_ValidSourceType = de.ugoe.cs.as.tosca.ToscaTables.PACKid_http_c_s_s_oco_cs_ugoe_de_s_tosca.getClassId("ValidSourceType", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_ValidTargetType = de.ugoe.cs.as.tosca.ToscaTables.PACKid_http_c_s_s_oco_cs_ugoe_de_s_tosca.getClassId("ValidTargetType", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_XSDElementDeclaration = de.ugoe.cs.as.tosca.ToscaTables.PACKid_http_c_s_s_www_eclipse_org_s_xsd_s_2002_s_XSD.getClassId("XSDElementDeclaration", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.DataTypeId DATAid_AnyURI = de.ugoe.cs.as.tosca.ToscaTables.PACKid_http_c_s_s_www_eclipse_org_s_emf_s_2003_s_XMLType.getDataTypeId("AnyURI", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.DataTypeId DATAid_EFeatureMapEntry = de.ugoe.cs.as.tosca.ToscaTables.PACKid_http_c_s_s_www_eclipse_org_s_emf_s_2002_s_Ecore.getDataTypeId("EFeatureMapEntry", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.DataTypeId DATAid_EResource = de.ugoe.cs.as.tosca.ToscaTables.PACKid_http_c_s_s_www_eclipse_org_s_emf_s_2002_s_Ecore.getDataTypeId("EResource", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.DataTypeId DATAid_ID = de.ugoe.cs.as.tosca.ToscaTables.PACKid_http_c_s_s_www_eclipse_org_s_emf_s_2003_s_XMLType.getDataTypeId("ID", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.DataTypeId DATAid_IDREF = de.ugoe.cs.as.tosca.ToscaTables.PACKid_http_c_s_s_www_eclipse_org_s_emf_s_2003_s_XMLType.getDataTypeId("IDREF", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.DataTypeId DATAid_Int = de.ugoe.cs.as.tosca.ToscaTables.PACKid_http_c_s_s_www_eclipse_org_s_emf_s_2003_s_XMLType.getDataTypeId("Int", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.DataTypeId DATAid_LangType = de.ugoe.cs.as.tosca.ToscaTables.PACKid_http_c_s_s_www_w3_org_s_XML_s_1998_s_namespace.getDataTypeId("LangType", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.DataTypeId DATAid_MaxInstancesType = de.ugoe.cs.as.tosca.ToscaTables.PACKid_http_c_s_s_oco_cs_ugoe_de_s_tosca.getDataTypeId("MaxInstancesType", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.DataTypeId DATAid_MaxInstancesType1 = de.ugoe.cs.as.tosca.ToscaTables.PACKid_http_c_s_s_oco_cs_ugoe_de_s_tosca.getDataTypeId("MaxInstancesType1", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.DataTypeId DATAid_NCName = de.ugoe.cs.as.tosca.ToscaTables.PACKid_http_c_s_s_www_eclipse_org_s_emf_s_2003_s_XMLType.getDataTypeId("NCName", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.DataTypeId DATAid_QName = de.ugoe.cs.as.tosca.ToscaTables.PACKid_http_c_s_s_www_eclipse_org_s_emf_s_2003_s_XMLType.getDataTypeId("QName", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.DataTypeId DATAid_UpperBoundType = de.ugoe.cs.as.tosca.ToscaTables.PACKid_http_c_s_s_oco_cs_ugoe_de_s_tosca.getDataTypeId("UpperBoundType", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.DataTypeId DATAid_UpperBoundType1 = de.ugoe.cs.as.tosca.ToscaTables.PACKid_http_c_s_s_oco_cs_ugoe_de_s_tosca.getDataTypeId("UpperBoundType1", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.EnumerationId ENUMid_TBoolean = de.ugoe.cs.as.tosca.ToscaTables.PACKid_http_c_s_s_oco_cs_ugoe_de_s_tosca.getEnumerationId("TBoolean");
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.EnumerationId ENUMid_ValidImportTypes = de.ugoe.cs.as.tosca.ToscaTables.PACKid_http_c_s_s_oco_cs_ugoe_de_s_tosca.getEnumerationId("ValidImportTypes");
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.values.IntegerValue INT_0 = org.eclipse.ocl.pivot.utilities.ValueUtil.integerValueOf("0");
	public static final /*@NonInvalid*/ java.lang.String STR_TCapabilityType_c_c_superTypeMustBeCapabilityType = "TCapabilityType::superTypeMustBeCapabilityType";
	public static final /*@NonInvalid*/ java.lang.String STR_TCapability_c_c_typeMustBeCapabilityType = "TCapability::typeMustBeCapabilityType";
	public static final /*@NonInvalid*/ java.lang.String STR_TNodeTemplate_c_c_capabilitiesMustBeDefinedInReferencedNodeType = "TNodeTemplate::capabilitiesMustBeDefinedInReferencedNodeType";
	public static final /*@NonInvalid*/ java.lang.String STR_TNodeTemplate_c_c_requirementsMustBeDefinedInReferencedNodeType = "TNodeTemplate::requirementsMustBeDefinedInReferencedNodeType";
	public static final /*@NonInvalid*/ java.lang.String STR_TNodeTemplate_c_c_typeMustBeNodeType = "TNodeTemplate::typeMustBeNodeType";
	public static final /*@NonInvalid*/ java.lang.String STR_TNodeType_c_c_superTypeMustBeNodeType = "TNodeType::superTypeMustBeNodeType";
	public static final /*@NonInvalid*/ java.lang.String STR_TRelationshipType_c_c_superTypeMustBeRelationshipType = "TRelationshipType::superTypeMustBeRelationshipType";
	public static final /*@NonInvalid*/ java.lang.String STR_TRequirementType_c_c_superTypeMustBeRequirementType = "TRequirementType::superTypeMustBeRequirementType";
	public static final /*@NonInvalid*/ java.lang.String STR_TRequirement_c_c_typeMustBeRequirementType = "TRequirement::typeMustBeRequirementType";
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.CollectionTypeId BAG_CLSSid_CapabilityDefinitionsType1 = org.eclipse.ocl.pivot.ids.TypeId.BAG.getSpecializedId(de.ugoe.cs.as.tosca.ToscaTables.CLSSid_CapabilityDefinitionsType1);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.CollectionTypeId BAG_CLSSid_DerivedFromType2 = org.eclipse.ocl.pivot.ids.TypeId.BAG.getSpecializedId(de.ugoe.cs.as.tosca.ToscaTables.CLSSid_DerivedFromType2);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.CollectionTypeId BAG_CLSSid_NodeOperationType = org.eclipse.ocl.pivot.ids.TypeId.BAG.getSpecializedId(de.ugoe.cs.as.tosca.ToscaTables.CLSSid_NodeOperationType);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.CollectionTypeId BAG_CLSSid_RelationshipOperationType = org.eclipse.ocl.pivot.ids.TypeId.BAG.getSpecializedId(de.ugoe.cs.as.tosca.ToscaTables.CLSSid_RelationshipOperationType);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.CollectionTypeId BAG_CLSSid_RequirementDefinitionsType1 = org.eclipse.ocl.pivot.ids.TypeId.BAG.getSpecializedId(de.ugoe.cs.as.tosca.ToscaTables.CLSSid_RequirementDefinitionsType1);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.CollectionTypeId BAG_CLSSid_SourceElementType = org.eclipse.ocl.pivot.ids.TypeId.BAG.getSpecializedId(de.ugoe.cs.as.tosca.ToscaTables.CLSSid_SourceElementType);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.CollectionTypeId BAG_CLSSid_TCapabilityDefinition = org.eclipse.ocl.pivot.ids.TypeId.BAG.getSpecializedId(de.ugoe.cs.as.tosca.ToscaTables.CLSSid_TCapabilityDefinition);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.CollectionTypeId BAG_CLSSid_TCapabilityRef = org.eclipse.ocl.pivot.ids.TypeId.BAG.getSpecializedId(de.ugoe.cs.as.tosca.ToscaTables.CLSSid_TCapabilityRef);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.CollectionTypeId BAG_CLSSid_TCapabilityType = org.eclipse.ocl.pivot.ids.TypeId.BAG.getSpecializedId(de.ugoe.cs.as.tosca.ToscaTables.CLSSid_TCapabilityType);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.CollectionTypeId BAG_CLSSid_TEntityTemplate = org.eclipse.ocl.pivot.ids.TypeId.BAG.getSpecializedId(de.ugoe.cs.as.tosca.ToscaTables.CLSSid_TEntityTemplate);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.CollectionTypeId BAG_CLSSid_TGroupTemplate = org.eclipse.ocl.pivot.ids.TypeId.BAG.getSpecializedId(de.ugoe.cs.as.tosca.ToscaTables.CLSSid_TGroupTemplate);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.CollectionTypeId BAG_CLSSid_TGroupType = org.eclipse.ocl.pivot.ids.TypeId.BAG.getSpecializedId(de.ugoe.cs.as.tosca.ToscaTables.CLSSid_TGroupType);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.CollectionTypeId BAG_CLSSid_TNodeType = org.eclipse.ocl.pivot.ids.TypeId.BAG.getSpecializedId(de.ugoe.cs.as.tosca.ToscaTables.CLSSid_TNodeType);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.CollectionTypeId BAG_CLSSid_TPropertyMapping = org.eclipse.ocl.pivot.ids.TypeId.BAG.getSpecializedId(de.ugoe.cs.as.tosca.ToscaTables.CLSSid_TPropertyMapping);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.CollectionTypeId BAG_CLSSid_TRequirementDefinition = org.eclipse.ocl.pivot.ids.TypeId.BAG.getSpecializedId(de.ugoe.cs.as.tosca.ToscaTables.CLSSid_TRequirementDefinition);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.CollectionTypeId BAG_CLSSid_TRequirementRef = org.eclipse.ocl.pivot.ids.TypeId.BAG.getSpecializedId(de.ugoe.cs.as.tosca.ToscaTables.CLSSid_TRequirementRef);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.CollectionTypeId BAG_CLSSid_TRequirementType = org.eclipse.ocl.pivot.ids.TypeId.BAG.getSpecializedId(de.ugoe.cs.as.tosca.ToscaTables.CLSSid_TRequirementType);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.CollectionTypeId BAG_CLSSid_TargetElementType = org.eclipse.ocl.pivot.ids.TypeId.BAG.getSpecializedId(de.ugoe.cs.as.tosca.ToscaTables.CLSSid_TargetElementType);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.CollectionTypeId ORD_CLSSid_DefinitionsType = org.eclipse.ocl.pivot.ids.TypeId.ORDERED_SET.getSpecializedId(de.ugoe.cs.as.tosca.ToscaTables.CLSSid_DefinitionsType);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.CollectionTypeId ORD_CLSSid_EStringToStringMapEntry = org.eclipse.ocl.pivot.ids.TypeId.ORDERED_SET.getSpecializedId(de.ugoe.cs.as.tosca.ToscaTables.CLSSid_EStringToStringMapEntry);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.CollectionTypeId ORD_CLSSid_ExcludeType = org.eclipse.ocl.pivot.ids.TypeId.ORDERED_SET.getSpecializedId(de.ugoe.cs.as.tosca.ToscaTables.CLSSid_ExcludeType);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.CollectionTypeId ORD_CLSSid_ImplementationArtifactType = org.eclipse.ocl.pivot.ids.TypeId.ORDERED_SET.getSpecializedId(de.ugoe.cs.as.tosca.ToscaTables.CLSSid_ImplementationArtifactType);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.CollectionTypeId ORD_CLSSid_IncludeType = org.eclipse.ocl.pivot.ids.TypeId.ORDERED_SET.getSpecializedId(de.ugoe.cs.as.tosca.ToscaTables.CLSSid_IncludeType);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.CollectionTypeId ORD_CLSSid_InstanceStateType = org.eclipse.ocl.pivot.ids.TypeId.ORDERED_SET.getSpecializedId(de.ugoe.cs.as.tosca.ToscaTables.CLSSid_InstanceStateType);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.CollectionTypeId ORD_CLSSid_NodeTypeReferenceType = org.eclipse.ocl.pivot.ids.TypeId.ORDERED_SET.getSpecializedId(de.ugoe.cs.as.tosca.ToscaTables.CLSSid_NodeTypeReferenceType);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.CollectionTypeId ORD_CLSSid_RelationshipConstraintType = org.eclipse.ocl.pivot.ids.TypeId.ORDERED_SET.getSpecializedId(de.ugoe.cs.as.tosca.ToscaTables.CLSSid_RelationshipConstraintType);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.CollectionTypeId ORD_CLSSid_TArtifactReference = org.eclipse.ocl.pivot.ids.TypeId.ORDERED_SET.getSpecializedId(de.ugoe.cs.as.tosca.ToscaTables.CLSSid_TArtifactReference);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.CollectionTypeId ORD_CLSSid_TArtifactTemplate = org.eclipse.ocl.pivot.ids.TypeId.ORDERED_SET.getSpecializedId(de.ugoe.cs.as.tosca.ToscaTables.CLSSid_TArtifactTemplate);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.CollectionTypeId ORD_CLSSid_TArtifactType = org.eclipse.ocl.pivot.ids.TypeId.ORDERED_SET.getSpecializedId(de.ugoe.cs.as.tosca.ToscaTables.CLSSid_TArtifactType);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.CollectionTypeId ORD_CLSSid_TCapability = org.eclipse.ocl.pivot.ids.TypeId.ORDERED_SET.getSpecializedId(de.ugoe.cs.as.tosca.ToscaTables.CLSSid_TCapability);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.CollectionTypeId ORD_CLSSid_TCapabilityDefinition = org.eclipse.ocl.pivot.ids.TypeId.ORDERED_SET.getSpecializedId(de.ugoe.cs.as.tosca.ToscaTables.CLSSid_TCapabilityDefinition);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.CollectionTypeId ORD_CLSSid_TCapabilityRef = org.eclipse.ocl.pivot.ids.TypeId.ORDERED_SET.getSpecializedId(de.ugoe.cs.as.tosca.ToscaTables.CLSSid_TCapabilityRef);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.CollectionTypeId ORD_CLSSid_TCapabilityType = org.eclipse.ocl.pivot.ids.TypeId.ORDERED_SET.getSpecializedId(de.ugoe.cs.as.tosca.ToscaTables.CLSSid_TCapabilityType);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.CollectionTypeId ORD_CLSSid_TConstraint = org.eclipse.ocl.pivot.ids.TypeId.ORDERED_SET.getSpecializedId(de.ugoe.cs.as.tosca.ToscaTables.CLSSid_TConstraint);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.CollectionTypeId ORD_CLSSid_TDeploymentArtifact = org.eclipse.ocl.pivot.ids.TypeId.ORDERED_SET.getSpecializedId(de.ugoe.cs.as.tosca.ToscaTables.CLSSid_TDeploymentArtifact);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.CollectionTypeId ORD_CLSSid_TDocumentation = org.eclipse.ocl.pivot.ids.TypeId.ORDERED_SET.getSpecializedId(de.ugoe.cs.as.tosca.ToscaTables.CLSSid_TDocumentation);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.CollectionTypeId ORD_CLSSid_TEntityTemplate = org.eclipse.ocl.pivot.ids.TypeId.ORDERED_SET.getSpecializedId(de.ugoe.cs.as.tosca.ToscaTables.CLSSid_TEntityTemplate);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.CollectionTypeId ORD_CLSSid_TEntityType = org.eclipse.ocl.pivot.ids.TypeId.ORDERED_SET.getSpecializedId(de.ugoe.cs.as.tosca.ToscaTables.CLSSid_TEntityType);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.CollectionTypeId ORD_CLSSid_TExportedInterface = org.eclipse.ocl.pivot.ids.TypeId.ORDERED_SET.getSpecializedId(de.ugoe.cs.as.tosca.ToscaTables.CLSSid_TExportedInterface);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.CollectionTypeId ORD_CLSSid_TExportedOperation = org.eclipse.ocl.pivot.ids.TypeId.ORDERED_SET.getSpecializedId(de.ugoe.cs.as.tosca.ToscaTables.CLSSid_TExportedOperation);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.CollectionTypeId ORD_CLSSid_TExtension = org.eclipse.ocl.pivot.ids.TypeId.ORDERED_SET.getSpecializedId(de.ugoe.cs.as.tosca.ToscaTables.CLSSid_TExtension);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.CollectionTypeId ORD_CLSSid_TGroupTemplate = org.eclipse.ocl.pivot.ids.TypeId.ORDERED_SET.getSpecializedId(de.ugoe.cs.as.tosca.ToscaTables.CLSSid_TGroupTemplate);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.CollectionTypeId ORD_CLSSid_TGroupType = org.eclipse.ocl.pivot.ids.TypeId.ORDERED_SET.getSpecializedId(de.ugoe.cs.as.tosca.ToscaTables.CLSSid_TGroupType);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.CollectionTypeId ORD_CLSSid_TImport = org.eclipse.ocl.pivot.ids.TypeId.ORDERED_SET.getSpecializedId(de.ugoe.cs.as.tosca.ToscaTables.CLSSid_TImport);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.CollectionTypeId ORD_CLSSid_TInterface = org.eclipse.ocl.pivot.ids.TypeId.ORDERED_SET.getSpecializedId(de.ugoe.cs.as.tosca.ToscaTables.CLSSid_TInterface);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.CollectionTypeId ORD_CLSSid_TNodeTemplate = org.eclipse.ocl.pivot.ids.TypeId.ORDERED_SET.getSpecializedId(de.ugoe.cs.as.tosca.ToscaTables.CLSSid_TNodeTemplate);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.CollectionTypeId ORD_CLSSid_TNodeType = org.eclipse.ocl.pivot.ids.TypeId.ORDERED_SET.getSpecializedId(de.ugoe.cs.as.tosca.ToscaTables.CLSSid_TNodeType);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.CollectionTypeId ORD_CLSSid_TNodeTypeImplementation = org.eclipse.ocl.pivot.ids.TypeId.ORDERED_SET.getSpecializedId(de.ugoe.cs.as.tosca.ToscaTables.CLSSid_TNodeTypeImplementation);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.CollectionTypeId ORD_CLSSid_TOperation = org.eclipse.ocl.pivot.ids.TypeId.ORDERED_SET.getSpecializedId(de.ugoe.cs.as.tosca.ToscaTables.CLSSid_TOperation);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.CollectionTypeId ORD_CLSSid_TParameter = org.eclipse.ocl.pivot.ids.TypeId.ORDERED_SET.getSpecializedId(de.ugoe.cs.as.tosca.ToscaTables.CLSSid_TParameter);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.CollectionTypeId ORD_CLSSid_TPlan = org.eclipse.ocl.pivot.ids.TypeId.ORDERED_SET.getSpecializedId(de.ugoe.cs.as.tosca.ToscaTables.CLSSid_TPlan);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.CollectionTypeId ORD_CLSSid_TPolicy = org.eclipse.ocl.pivot.ids.TypeId.ORDERED_SET.getSpecializedId(de.ugoe.cs.as.tosca.ToscaTables.CLSSid_TPolicy);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.CollectionTypeId ORD_CLSSid_TPolicyTemplate = org.eclipse.ocl.pivot.ids.TypeId.ORDERED_SET.getSpecializedId(de.ugoe.cs.as.tosca.ToscaTables.CLSSid_TPolicyTemplate);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.CollectionTypeId ORD_CLSSid_TPolicyType = org.eclipse.ocl.pivot.ids.TypeId.ORDERED_SET.getSpecializedId(de.ugoe.cs.as.tosca.ToscaTables.CLSSid_TPolicyType);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.CollectionTypeId ORD_CLSSid_TPropertyConstraint = org.eclipse.ocl.pivot.ids.TypeId.ORDERED_SET.getSpecializedId(de.ugoe.cs.as.tosca.ToscaTables.CLSSid_TPropertyConstraint);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.CollectionTypeId ORD_CLSSid_TPropertyMapping = org.eclipse.ocl.pivot.ids.TypeId.ORDERED_SET.getSpecializedId(de.ugoe.cs.as.tosca.ToscaTables.CLSSid_TPropertyMapping);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.CollectionTypeId ORD_CLSSid_TRelationshipTemplate = org.eclipse.ocl.pivot.ids.TypeId.ORDERED_SET.getSpecializedId(de.ugoe.cs.as.tosca.ToscaTables.CLSSid_TRelationshipTemplate);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.CollectionTypeId ORD_CLSSid_TRelationshipType = org.eclipse.ocl.pivot.ids.TypeId.ORDERED_SET.getSpecializedId(de.ugoe.cs.as.tosca.ToscaTables.CLSSid_TRelationshipType);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.CollectionTypeId ORD_CLSSid_TRelationshipTypeImplementation = org.eclipse.ocl.pivot.ids.TypeId.ORDERED_SET.getSpecializedId(de.ugoe.cs.as.tosca.ToscaTables.CLSSid_TRelationshipTypeImplementation);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.CollectionTypeId ORD_CLSSid_TRequiredContainerFeature = org.eclipse.ocl.pivot.ids.TypeId.ORDERED_SET.getSpecializedId(de.ugoe.cs.as.tosca.ToscaTables.CLSSid_TRequiredContainerFeature);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.CollectionTypeId ORD_CLSSid_TRequirement = org.eclipse.ocl.pivot.ids.TypeId.ORDERED_SET.getSpecializedId(de.ugoe.cs.as.tosca.ToscaTables.CLSSid_TRequirement);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.CollectionTypeId ORD_CLSSid_TRequirementDefinition = org.eclipse.ocl.pivot.ids.TypeId.ORDERED_SET.getSpecializedId(de.ugoe.cs.as.tosca.ToscaTables.CLSSid_TRequirementDefinition);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.CollectionTypeId ORD_CLSSid_TRequirementRef = org.eclipse.ocl.pivot.ids.TypeId.ORDERED_SET.getSpecializedId(de.ugoe.cs.as.tosca.ToscaTables.CLSSid_TRequirementRef);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.CollectionTypeId ORD_CLSSid_TRequirementType = org.eclipse.ocl.pivot.ids.TypeId.ORDERED_SET.getSpecializedId(de.ugoe.cs.as.tosca.ToscaTables.CLSSid_TRequirementType);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.CollectionTypeId ORD_CLSSid_TServiceTemplate = org.eclipse.ocl.pivot.ids.TypeId.ORDERED_SET.getSpecializedId(de.ugoe.cs.as.tosca.ToscaTables.CLSSid_TServiceTemplate);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.CollectionTypeId ORD_CLSSid_TTag = org.eclipse.ocl.pivot.ids.TypeId.ORDERED_SET.getSpecializedId(de.ugoe.cs.as.tosca.ToscaTables.CLSSid_TTag);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.CollectionTypeId ORD_DATAid_QName = org.eclipse.ocl.pivot.ids.TypeId.ORDERED_SET.getSpecializedId(de.ugoe.cs.as.tosca.ToscaTables.DATAid_QName);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.CollectionTypeId SEQ_CLSSid_TCapabilityType = org.eclipse.ocl.pivot.ids.TypeId.SEQUENCE.getSpecializedId(de.ugoe.cs.as.tosca.ToscaTables.CLSSid_TCapabilityType);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.CollectionTypeId SEQ_CLSSid_TRequirementType = org.eclipse.ocl.pivot.ids.TypeId.SEQUENCE.getSpecializedId(de.ugoe.cs.as.tosca.ToscaTables.CLSSid_TRequirementType);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.CollectionTypeId SEQ_DATAid_EFeatureMapEntry = org.eclipse.ocl.pivot.ids.TypeId.SEQUENCE.getSpecializedId(de.ugoe.cs.as.tosca.ToscaTables.DATAid_EFeatureMapEntry);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.CollectionTypeId SET_CLSSid_TNodeType = org.eclipse.ocl.pivot.ids.TypeId.SET.getSpecializedId(de.ugoe.cs.as.tosca.ToscaTables.CLSSid_TNodeType);

	/**
	 *	The type parameters for templated types and operations.
	 */
	public static class TypeParameters {
		static {
			Init.initStart();
			ToscaTables.init();
		}

		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of ToscaTables::TypeParameters and all preceding sub-packages.
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

		public static final /*@NonNull*/ EcoreExecutorType _ArtifactReferencesType = new EcoreExecutorType(ToscaPackage.Literals.ARTIFACT_REFERENCES_TYPE, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _CapabilitiesType = new EcoreExecutorType(ToscaPackage.Literals.CAPABILITIES_TYPE, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _CapabilitiesType1 = new EcoreExecutorType(ToscaPackage.Literals.CAPABILITIES_TYPE1, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _CapabilitiesType2 = new EcoreExecutorType(ToscaPackage.Literals.CAPABILITIES_TYPE2, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _CapabilityDefinitionsType = new EcoreExecutorType(ToscaPackage.Literals.CAPABILITY_DEFINITIONS_TYPE, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _CapabilityDefinitionsType1 = new EcoreExecutorType(ToscaPackage.Literals.CAPABILITY_DEFINITIONS_TYPE1, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _ConstraintsType = new EcoreExecutorType(ToscaPackage.Literals.CONSTRAINTS_TYPE, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _ConstraintsType1 = new EcoreExecutorType(ToscaPackage.Literals.CONSTRAINTS_TYPE1, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _DefinitionsType = new EcoreExecutorType(ToscaPackage.Literals.DEFINITIONS_TYPE, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _DerivedFromType = new EcoreExecutorType(ToscaPackage.Literals.DERIVED_FROM_TYPE, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _DerivedFromType1 = new EcoreExecutorType(ToscaPackage.Literals.DERIVED_FROM_TYPE1, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _DerivedFromType2 = new EcoreExecutorType(ToscaPackage.Literals.DERIVED_FROM_TYPE2, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _DocumentRoot = new EcoreExecutorType(ToscaPackage.Literals.DOCUMENT_ROOT, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _ExcludeType = new EcoreExecutorType(ToscaPackage.Literals.EXCLUDE_TYPE, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _ExtensionsType = new EcoreExecutorType(ToscaPackage.Literals.EXTENSIONS_TYPE, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _ImplementationArtifactType = new EcoreExecutorType(ToscaPackage.Literals.IMPLEMENTATION_ARTIFACT_TYPE, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _ImportedURI = new EcoreExecutorType("ImportedURI", PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _IncludeType = new EcoreExecutorType(ToscaPackage.Literals.INCLUDE_TYPE, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _InputParametersType = new EcoreExecutorType(ToscaPackage.Literals.INPUT_PARAMETERS_TYPE, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _InputParametersType1 = new EcoreExecutorType(ToscaPackage.Literals.INPUT_PARAMETERS_TYPE1, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _InstanceStateType = new EcoreExecutorType(ToscaPackage.Literals.INSTANCE_STATE_TYPE, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _InterfacesType = new EcoreExecutorType(ToscaPackage.Literals.INTERFACES_TYPE, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _InterfacesType1 = new EcoreExecutorType(ToscaPackage.Literals.INTERFACES_TYPE1, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _InterfacesType2 = new EcoreExecutorType(ToscaPackage.Literals.INTERFACES_TYPE2, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _MaxInstancesType = new EcoreExecutorType("MaxInstancesType", PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _MaxInstancesType1 = new EcoreExecutorType("MaxInstancesType1", PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _MaxInstancesTypeMember0 = new EcoreExecutorType("MaxInstancesTypeMember0", PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _MaxInstancesTypeMember01 = new EcoreExecutorType("MaxInstancesTypeMember01", PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorEnumeration _MaxInstancesTypeMember1 = new EcoreExecutorEnumeration(ToscaPackage.Literals.MAX_INSTANCES_TYPE_MEMBER1, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorEnumeration _MaxInstancesTypeMember11 = new EcoreExecutorEnumeration(ToscaPackage.Literals.MAX_INSTANCES_TYPE_MEMBER11, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _MaxInstancesTypeMember1Object = new EcoreExecutorType("MaxInstancesTypeMember1Object", PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _MaxInstancesTypeMember1Object1 = new EcoreExecutorType("MaxInstancesTypeMember1Object1", PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _NodeOperationType = new EcoreExecutorType(ToscaPackage.Literals.NODE_OPERATION_TYPE, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _NodeTypeReferenceType = new EcoreExecutorType(ToscaPackage.Literals.NODE_TYPE_REFERENCE_TYPE, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _OutputParametersType = new EcoreExecutorType(ToscaPackage.Literals.OUTPUT_PARAMETERS_TYPE, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _OutputParametersType1 = new EcoreExecutorType(ToscaPackage.Literals.OUTPUT_PARAMETERS_TYPE1, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _PlanModelReferenceType = new EcoreExecutorType(ToscaPackage.Literals.PLAN_MODEL_REFERENCE_TYPE, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _PlanModelType = new EcoreExecutorType(ToscaPackage.Literals.PLAN_MODEL_TYPE, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _PlanType = new EcoreExecutorType(ToscaPackage.Literals.PLAN_TYPE, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _PoliciesType = new EcoreExecutorType(ToscaPackage.Literals.POLICIES_TYPE, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _PoliciesType1 = new EcoreExecutorType(ToscaPackage.Literals.POLICIES_TYPE1, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _PoliciesType2 = new EcoreExecutorType(ToscaPackage.Literals.POLICIES_TYPE2, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _PropertiesDefinitionType = new EcoreExecutorType(ToscaPackage.Literals.PROPERTIES_DEFINITION_TYPE, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _PropertiesType = new EcoreExecutorType(ToscaPackage.Literals.PROPERTIES_TYPE, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _PropertiesType1 = new EcoreExecutorType(ToscaPackage.Literals.PROPERTIES_TYPE1, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _PropertyConstraintsType = new EcoreExecutorType(ToscaPackage.Literals.PROPERTY_CONSTRAINTS_TYPE, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _PropertyConstraintsType1 = new EcoreExecutorType(ToscaPackage.Literals.PROPERTY_CONSTRAINTS_TYPE1, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _PropertyMappingsType = new EcoreExecutorType(ToscaPackage.Literals.PROPERTY_MAPPINGS_TYPE, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _RelationshipConstraintType = new EcoreExecutorType(ToscaPackage.Literals.RELATIONSHIP_CONSTRAINT_TYPE, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _RelationshipConstraintsType = new EcoreExecutorType(ToscaPackage.Literals.RELATIONSHIP_CONSTRAINTS_TYPE, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _RelationshipOperationType = new EcoreExecutorType(ToscaPackage.Literals.RELATIONSHIP_OPERATION_TYPE, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _RequirementDefinitionsType = new EcoreExecutorType(ToscaPackage.Literals.REQUIREMENT_DEFINITIONS_TYPE, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _RequirementDefinitionsType1 = new EcoreExecutorType(ToscaPackage.Literals.REQUIREMENT_DEFINITIONS_TYPE1, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _RequirementsType = new EcoreExecutorType(ToscaPackage.Literals.REQUIREMENTS_TYPE, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _RequirementsType1 = new EcoreExecutorType(ToscaPackage.Literals.REQUIREMENTS_TYPE1, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _RequirementsType2 = new EcoreExecutorType(ToscaPackage.Literals.REQUIREMENTS_TYPE2, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _SourceElementType = new EcoreExecutorType(ToscaPackage.Literals.SOURCE_ELEMENT_TYPE, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _SourceInterfacesType = new EcoreExecutorType(ToscaPackage.Literals.SOURCE_INTERFACES_TYPE, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _TAppliesTo = new EcoreExecutorType(ToscaPackage.Literals.TAPPLIES_TO, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _TArtifactReference = new EcoreExecutorType(ToscaPackage.Literals.TARTIFACT_REFERENCE, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _TArtifactTemplate = new EcoreExecutorType(ToscaPackage.Literals.TARTIFACT_TEMPLATE, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _TArtifactType = new EcoreExecutorType(ToscaPackage.Literals.TARTIFACT_TYPE, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorEnumeration _TBoolean = new EcoreExecutorEnumeration(ToscaPackage.Literals.TBOOLEAN, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _TBooleanObject = new EcoreExecutorType("TBooleanObject", PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _TBoundaryDefinitions = new EcoreExecutorType(ToscaPackage.Literals.TBOUNDARY_DEFINITIONS, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _TCapability = new EcoreExecutorType(ToscaPackage.Literals.TCAPABILITY, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _TCapabilityDefinition = new EcoreExecutorType(ToscaPackage.Literals.TCAPABILITY_DEFINITION, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _TCapabilityRef = new EcoreExecutorType(ToscaPackage.Literals.TCAPABILITY_REF, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _TCapabilityType = new EcoreExecutorType(ToscaPackage.Literals.TCAPABILITY_TYPE, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _TCondition = new EcoreExecutorType(ToscaPackage.Literals.TCONDITION, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _TConstraint = new EcoreExecutorType(ToscaPackage.Literals.TCONSTRAINT, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _TDefinitions = new EcoreExecutorType(ToscaPackage.Literals.TDEFINITIONS, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _TDeploymentArtifact = new EcoreExecutorType(ToscaPackage.Literals.TDEPLOYMENT_ARTIFACT, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _TDeploymentArtifacts = new EcoreExecutorType(ToscaPackage.Literals.TDEPLOYMENT_ARTIFACTS, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _TDocumentation = new EcoreExecutorType(ToscaPackage.Literals.TDOCUMENTATION, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _TEntityTemplate = new EcoreExecutorType(ToscaPackage.Literals.TENTITY_TEMPLATE, PACKAGE, 0 | ExecutorType.ABSTRACT);
		public static final /*@NonNull*/ EcoreExecutorType _TEntityType = new EcoreExecutorType(ToscaPackage.Literals.TENTITY_TYPE, PACKAGE, 0 | ExecutorType.ABSTRACT);
		public static final /*@NonNull*/ EcoreExecutorType _TExportedInterface = new EcoreExecutorType(ToscaPackage.Literals.TEXPORTED_INTERFACE, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _TExportedOperation = new EcoreExecutorType(ToscaPackage.Literals.TEXPORTED_OPERATION, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _TExtensibleElements = new EcoreExecutorType(ToscaPackage.Literals.TEXTENSIBLE_ELEMENTS, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _TExtension = new EcoreExecutorType(ToscaPackage.Literals.TEXTENSION, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _TExtensions = new EcoreExecutorType(ToscaPackage.Literals.TEXTENSIONS, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _TGroupTemplate = new EcoreExecutorType(ToscaPackage.Literals.TGROUP_TEMPLATE, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _TGroupType = new EcoreExecutorType(ToscaPackage.Literals.TGROUP_TYPE, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _TImplementationArtifact = new EcoreExecutorType(ToscaPackage.Literals.TIMPLEMENTATION_ARTIFACT, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _TImplementationArtifacts = new EcoreExecutorType(ToscaPackage.Literals.TIMPLEMENTATION_ARTIFACTS, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _TImport = new EcoreExecutorType(ToscaPackage.Literals.TIMPORT, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _TInterface = new EcoreExecutorType(ToscaPackage.Literals.TINTERFACE, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _TNodeTemplate = new EcoreExecutorType(ToscaPackage.Literals.TNODE_TEMPLATE, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _TNodeType = new EcoreExecutorType(ToscaPackage.Literals.TNODE_TYPE, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _TNodeTypeImplementation = new EcoreExecutorType(ToscaPackage.Literals.TNODE_TYPE_IMPLEMENTATION, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _TOperation = new EcoreExecutorType(ToscaPackage.Literals.TOPERATION, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _TParameter = new EcoreExecutorType(ToscaPackage.Literals.TPARAMETER, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _TPlan = new EcoreExecutorType(ToscaPackage.Literals.TPLAN, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _TPlans = new EcoreExecutorType(ToscaPackage.Literals.TPLANS, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _TPolicy = new EcoreExecutorType(ToscaPackage.Literals.TPOLICY, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _TPolicyTemplate = new EcoreExecutorType(ToscaPackage.Literals.TPOLICY_TEMPLATE, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _TPolicyType = new EcoreExecutorType(ToscaPackage.Literals.TPOLICY_TYPE, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _TPropertyConstraint = new EcoreExecutorType(ToscaPackage.Literals.TPROPERTY_CONSTRAINT, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _TPropertyMapping = new EcoreExecutorType(ToscaPackage.Literals.TPROPERTY_MAPPING, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _TRelationshipTemplate = new EcoreExecutorType(ToscaPackage.Literals.TRELATIONSHIP_TEMPLATE, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _TRelationshipType = new EcoreExecutorType(ToscaPackage.Literals.TRELATIONSHIP_TYPE, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _TRelationshipTypeImplementation = new EcoreExecutorType(ToscaPackage.Literals.TRELATIONSHIP_TYPE_IMPLEMENTATION, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _TRequiredContainerFeature = new EcoreExecutorType(ToscaPackage.Literals.TREQUIRED_CONTAINER_FEATURE, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _TRequiredContainerFeatures = new EcoreExecutorType(ToscaPackage.Literals.TREQUIRED_CONTAINER_FEATURES, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _TRequirement = new EcoreExecutorType(ToscaPackage.Literals.TREQUIREMENT, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _TRequirementDefinition = new EcoreExecutorType(ToscaPackage.Literals.TREQUIREMENT_DEFINITION, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _TRequirementRef = new EcoreExecutorType(ToscaPackage.Literals.TREQUIREMENT_REF, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _TRequirementType = new EcoreExecutorType(ToscaPackage.Literals.TREQUIREMENT_TYPE, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _TServiceTemplate = new EcoreExecutorType(ToscaPackage.Literals.TSERVICE_TEMPLATE, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _TTag = new EcoreExecutorType(ToscaPackage.Literals.TTAG, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _TTags = new EcoreExecutorType(ToscaPackage.Literals.TTAGS, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _TTopologyElementInstanceStates = new EcoreExecutorType(ToscaPackage.Literals.TTOPOLOGY_ELEMENT_INSTANCE_STATES, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _TTopologyTemplate = new EcoreExecutorType(ToscaPackage.Literals.TTOPOLOGY_TEMPLATE, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _TargetElementType = new EcoreExecutorType(ToscaPackage.Literals.TARGET_ELEMENT_TYPE, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _TargetInterfacesType = new EcoreExecutorType(ToscaPackage.Literals.TARGET_INTERFACES_TYPE, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _TypesType = new EcoreExecutorType(ToscaPackage.Literals.TYPES_TYPE, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _UpperBoundType = new EcoreExecutorType("UpperBoundType", PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _UpperBoundType1 = new EcoreExecutorType("UpperBoundType1", PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _UpperBoundTypeMember0 = new EcoreExecutorType("UpperBoundTypeMember0", PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _UpperBoundTypeMember01 = new EcoreExecutorType("UpperBoundTypeMember01", PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorEnumeration _UpperBoundTypeMember1 = new EcoreExecutorEnumeration(ToscaPackage.Literals.UPPER_BOUND_TYPE_MEMBER1, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorEnumeration _UpperBoundTypeMember11 = new EcoreExecutorEnumeration(ToscaPackage.Literals.UPPER_BOUND_TYPE_MEMBER11, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _UpperBoundTypeMember1Object = new EcoreExecutorType("UpperBoundTypeMember1Object", PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _UpperBoundTypeMember1Object1 = new EcoreExecutorType("UpperBoundTypeMember1Object1", PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorEnumeration _ValidImportTypes = new EcoreExecutorEnumeration(ToscaPackage.Literals.VALID_IMPORT_TYPES, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _ValidSourceType = new EcoreExecutorType(ToscaPackage.Literals.VALID_SOURCE_TYPE, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _ValidTargetType = new EcoreExecutorType(ToscaPackage.Literals.VALID_TARGET_TYPE, PACKAGE, 0);

		private static final /*@NonNull*/ EcoreExecutorType /*@NonNull*/ [] types = {
			_ArtifactReferencesType,
			_CapabilitiesType,
			_CapabilitiesType1,
			_CapabilitiesType2,
			_CapabilityDefinitionsType,
			_CapabilityDefinitionsType1,
			_ConstraintsType,
			_ConstraintsType1,
			_DefinitionsType,
			_DerivedFromType,
			_DerivedFromType1,
			_DerivedFromType2,
			_DocumentRoot,
			_ExcludeType,
			_ExtensionsType,
			_ImplementationArtifactType,
			_ImportedURI,
			_IncludeType,
			_InputParametersType,
			_InputParametersType1,
			_InstanceStateType,
			_InterfacesType,
			_InterfacesType1,
			_InterfacesType2,
			_MaxInstancesType,
			_MaxInstancesType1,
			_MaxInstancesTypeMember0,
			_MaxInstancesTypeMember01,
			_MaxInstancesTypeMember1,
			_MaxInstancesTypeMember11,
			_MaxInstancesTypeMember1Object,
			_MaxInstancesTypeMember1Object1,
			_NodeOperationType,
			_NodeTypeReferenceType,
			_OutputParametersType,
			_OutputParametersType1,
			_PlanModelReferenceType,
			_PlanModelType,
			_PlanType,
			_PoliciesType,
			_PoliciesType1,
			_PoliciesType2,
			_PropertiesDefinitionType,
			_PropertiesType,
			_PropertiesType1,
			_PropertyConstraintsType,
			_PropertyConstraintsType1,
			_PropertyMappingsType,
			_RelationshipConstraintType,
			_RelationshipConstraintsType,
			_RelationshipOperationType,
			_RequirementDefinitionsType,
			_RequirementDefinitionsType1,
			_RequirementsType,
			_RequirementsType1,
			_RequirementsType2,
			_SourceElementType,
			_SourceInterfacesType,
			_TAppliesTo,
			_TArtifactReference,
			_TArtifactTemplate,
			_TArtifactType,
			_TBoolean,
			_TBooleanObject,
			_TBoundaryDefinitions,
			_TCapability,
			_TCapabilityDefinition,
			_TCapabilityRef,
			_TCapabilityType,
			_TCondition,
			_TConstraint,
			_TDefinitions,
			_TDeploymentArtifact,
			_TDeploymentArtifacts,
			_TDocumentation,
			_TEntityTemplate,
			_TEntityType,
			_TExportedInterface,
			_TExportedOperation,
			_TExtensibleElements,
			_TExtension,
			_TExtensions,
			_TGroupTemplate,
			_TGroupType,
			_TImplementationArtifact,
			_TImplementationArtifacts,
			_TImport,
			_TInterface,
			_TNodeTemplate,
			_TNodeType,
			_TNodeTypeImplementation,
			_TOperation,
			_TParameter,
			_TPlan,
			_TPlans,
			_TPolicy,
			_TPolicyTemplate,
			_TPolicyType,
			_TPropertyConstraint,
			_TPropertyMapping,
			_TRelationshipTemplate,
			_TRelationshipType,
			_TRelationshipTypeImplementation,
			_TRequiredContainerFeature,
			_TRequiredContainerFeatures,
			_TRequirement,
			_TRequirementDefinition,
			_TRequirementRef,
			_TRequirementType,
			_TServiceTemplate,
			_TTag,
			_TTags,
			_TTopologyElementInstanceStates,
			_TTopologyTemplate,
			_TargetElementType,
			_TargetInterfacesType,
			_TypesType,
			_UpperBoundType,
			_UpperBoundType1,
			_UpperBoundTypeMember0,
			_UpperBoundTypeMember01,
			_UpperBoundTypeMember1,
			_UpperBoundTypeMember11,
			_UpperBoundTypeMember1Object,
			_UpperBoundTypeMember1Object1,
			_ValidImportTypes,
			_ValidSourceType,
			_ValidTargetType
		};

		/*
		 *	Install the type descriptors in the package descriptor.
		 */
		static {
			PACKAGE.init(LIBRARY, types);
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of ToscaTables::Types and all preceding sub-packages.
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

		private static final /*@NonNull*/ ExecutorFragment _ArtifactReferencesType__ArtifactReferencesType = new ExecutorFragment(Types._ArtifactReferencesType, ToscaTables.Types._ArtifactReferencesType);
		private static final /*@NonNull*/ ExecutorFragment _ArtifactReferencesType__OclAny = new ExecutorFragment(Types._ArtifactReferencesType, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _ArtifactReferencesType__OclElement = new ExecutorFragment(Types._ArtifactReferencesType, OCLstdlibTables.Types._OclElement);

		private static final /*@NonNull*/ ExecutorFragment _CapabilitiesType__CapabilitiesType = new ExecutorFragment(Types._CapabilitiesType, ToscaTables.Types._CapabilitiesType);
		private static final /*@NonNull*/ ExecutorFragment _CapabilitiesType__OclAny = new ExecutorFragment(Types._CapabilitiesType, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _CapabilitiesType__OclElement = new ExecutorFragment(Types._CapabilitiesType, OCLstdlibTables.Types._OclElement);

		private static final /*@NonNull*/ ExecutorFragment _CapabilitiesType1__CapabilitiesType1 = new ExecutorFragment(Types._CapabilitiesType1, ToscaTables.Types._CapabilitiesType1);
		private static final /*@NonNull*/ ExecutorFragment _CapabilitiesType1__OclAny = new ExecutorFragment(Types._CapabilitiesType1, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _CapabilitiesType1__OclElement = new ExecutorFragment(Types._CapabilitiesType1, OCLstdlibTables.Types._OclElement);

		private static final /*@NonNull*/ ExecutorFragment _CapabilitiesType2__CapabilitiesType2 = new ExecutorFragment(Types._CapabilitiesType2, ToscaTables.Types._CapabilitiesType2);
		private static final /*@NonNull*/ ExecutorFragment _CapabilitiesType2__OclAny = new ExecutorFragment(Types._CapabilitiesType2, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _CapabilitiesType2__OclElement = new ExecutorFragment(Types._CapabilitiesType2, OCLstdlibTables.Types._OclElement);

		private static final /*@NonNull*/ ExecutorFragment _CapabilityDefinitionsType__CapabilityDefinitionsType = new ExecutorFragment(Types._CapabilityDefinitionsType, ToscaTables.Types._CapabilityDefinitionsType);
		private static final /*@NonNull*/ ExecutorFragment _CapabilityDefinitionsType__OclAny = new ExecutorFragment(Types._CapabilityDefinitionsType, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _CapabilityDefinitionsType__OclElement = new ExecutorFragment(Types._CapabilityDefinitionsType, OCLstdlibTables.Types._OclElement);

		private static final /*@NonNull*/ ExecutorFragment _CapabilityDefinitionsType1__CapabilityDefinitionsType1 = new ExecutorFragment(Types._CapabilityDefinitionsType1, ToscaTables.Types._CapabilityDefinitionsType1);
		private static final /*@NonNull*/ ExecutorFragment _CapabilityDefinitionsType1__OclAny = new ExecutorFragment(Types._CapabilityDefinitionsType1, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _CapabilityDefinitionsType1__OclElement = new ExecutorFragment(Types._CapabilityDefinitionsType1, OCLstdlibTables.Types._OclElement);

		private static final /*@NonNull*/ ExecutorFragment _ConstraintsType__ConstraintsType = new ExecutorFragment(Types._ConstraintsType, ToscaTables.Types._ConstraintsType);
		private static final /*@NonNull*/ ExecutorFragment _ConstraintsType__OclAny = new ExecutorFragment(Types._ConstraintsType, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _ConstraintsType__OclElement = new ExecutorFragment(Types._ConstraintsType, OCLstdlibTables.Types._OclElement);

		private static final /*@NonNull*/ ExecutorFragment _ConstraintsType1__ConstraintsType1 = new ExecutorFragment(Types._ConstraintsType1, ToscaTables.Types._ConstraintsType1);
		private static final /*@NonNull*/ ExecutorFragment _ConstraintsType1__OclAny = new ExecutorFragment(Types._ConstraintsType1, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _ConstraintsType1__OclElement = new ExecutorFragment(Types._ConstraintsType1, OCLstdlibTables.Types._OclElement);

		private static final /*@NonNull*/ ExecutorFragment _DefinitionsType__DefinitionsType = new ExecutorFragment(Types._DefinitionsType, ToscaTables.Types._DefinitionsType);
		private static final /*@NonNull*/ ExecutorFragment _DefinitionsType__OclAny = new ExecutorFragment(Types._DefinitionsType, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _DefinitionsType__OclElement = new ExecutorFragment(Types._DefinitionsType, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _DefinitionsType__TDefinitions = new ExecutorFragment(Types._DefinitionsType, ToscaTables.Types._TDefinitions);
		private static final /*@NonNull*/ ExecutorFragment _DefinitionsType__TExtensibleElements = new ExecutorFragment(Types._DefinitionsType, ToscaTables.Types._TExtensibleElements);

		private static final /*@NonNull*/ ExecutorFragment _DerivedFromType__DerivedFromType = new ExecutorFragment(Types._DerivedFromType, ToscaTables.Types._DerivedFromType);
		private static final /*@NonNull*/ ExecutorFragment _DerivedFromType__OclAny = new ExecutorFragment(Types._DerivedFromType, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _DerivedFromType__OclElement = new ExecutorFragment(Types._DerivedFromType, OCLstdlibTables.Types._OclElement);

		private static final /*@NonNull*/ ExecutorFragment _DerivedFromType1__DerivedFromType1 = new ExecutorFragment(Types._DerivedFromType1, ToscaTables.Types._DerivedFromType1);
		private static final /*@NonNull*/ ExecutorFragment _DerivedFromType1__OclAny = new ExecutorFragment(Types._DerivedFromType1, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _DerivedFromType1__OclElement = new ExecutorFragment(Types._DerivedFromType1, OCLstdlibTables.Types._OclElement);

		private static final /*@NonNull*/ ExecutorFragment _DerivedFromType2__DerivedFromType2 = new ExecutorFragment(Types._DerivedFromType2, ToscaTables.Types._DerivedFromType2);
		private static final /*@NonNull*/ ExecutorFragment _DerivedFromType2__OclAny = new ExecutorFragment(Types._DerivedFromType2, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _DerivedFromType2__OclElement = new ExecutorFragment(Types._DerivedFromType2, OCLstdlibTables.Types._OclElement);

		private static final /*@NonNull*/ ExecutorFragment _DocumentRoot__DocumentRoot = new ExecutorFragment(Types._DocumentRoot, ToscaTables.Types._DocumentRoot);
		private static final /*@NonNull*/ ExecutorFragment _DocumentRoot__OclAny = new ExecutorFragment(Types._DocumentRoot, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _DocumentRoot__OclElement = new ExecutorFragment(Types._DocumentRoot, OCLstdlibTables.Types._OclElement);

		private static final /*@NonNull*/ ExecutorFragment _ExcludeType__ExcludeType = new ExecutorFragment(Types._ExcludeType, ToscaTables.Types._ExcludeType);
		private static final /*@NonNull*/ ExecutorFragment _ExcludeType__OclAny = new ExecutorFragment(Types._ExcludeType, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _ExcludeType__OclElement = new ExecutorFragment(Types._ExcludeType, OCLstdlibTables.Types._OclElement);

		private static final /*@NonNull*/ ExecutorFragment _ExtensionsType__ExtensionsType = new ExecutorFragment(Types._ExtensionsType, ToscaTables.Types._ExtensionsType);
		private static final /*@NonNull*/ ExecutorFragment _ExtensionsType__OclAny = new ExecutorFragment(Types._ExtensionsType, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _ExtensionsType__OclElement = new ExecutorFragment(Types._ExtensionsType, OCLstdlibTables.Types._OclElement);

		private static final /*@NonNull*/ ExecutorFragment _ImplementationArtifactType__ImplementationArtifactType = new ExecutorFragment(Types._ImplementationArtifactType, ToscaTables.Types._ImplementationArtifactType);
		private static final /*@NonNull*/ ExecutorFragment _ImplementationArtifactType__OclAny = new ExecutorFragment(Types._ImplementationArtifactType, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _ImplementationArtifactType__OclElement = new ExecutorFragment(Types._ImplementationArtifactType, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _ImplementationArtifactType__TExtensibleElements = new ExecutorFragment(Types._ImplementationArtifactType, ToscaTables.Types._TExtensibleElements);
		private static final /*@NonNull*/ ExecutorFragment _ImplementationArtifactType__TImplementationArtifact = new ExecutorFragment(Types._ImplementationArtifactType, ToscaTables.Types._TImplementationArtifact);

		private static final /*@NonNull*/ ExecutorFragment _ImportedURI__ImportedURI = new ExecutorFragment(Types._ImportedURI, ToscaTables.Types._ImportedURI);
		private static final /*@NonNull*/ ExecutorFragment _ImportedURI__OclAny = new ExecutorFragment(Types._ImportedURI, OCLstdlibTables.Types._OclAny);

		private static final /*@NonNull*/ ExecutorFragment _IncludeType__IncludeType = new ExecutorFragment(Types._IncludeType, ToscaTables.Types._IncludeType);
		private static final /*@NonNull*/ ExecutorFragment _IncludeType__OclAny = new ExecutorFragment(Types._IncludeType, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _IncludeType__OclElement = new ExecutorFragment(Types._IncludeType, OCLstdlibTables.Types._OclElement);

		private static final /*@NonNull*/ ExecutorFragment _InputParametersType__InputParametersType = new ExecutorFragment(Types._InputParametersType, ToscaTables.Types._InputParametersType);
		private static final /*@NonNull*/ ExecutorFragment _InputParametersType__OclAny = new ExecutorFragment(Types._InputParametersType, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _InputParametersType__OclElement = new ExecutorFragment(Types._InputParametersType, OCLstdlibTables.Types._OclElement);

		private static final /*@NonNull*/ ExecutorFragment _InputParametersType1__InputParametersType1 = new ExecutorFragment(Types._InputParametersType1, ToscaTables.Types._InputParametersType1);
		private static final /*@NonNull*/ ExecutorFragment _InputParametersType1__OclAny = new ExecutorFragment(Types._InputParametersType1, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _InputParametersType1__OclElement = new ExecutorFragment(Types._InputParametersType1, OCLstdlibTables.Types._OclElement);

		private static final /*@NonNull*/ ExecutorFragment _InstanceStateType__InstanceStateType = new ExecutorFragment(Types._InstanceStateType, ToscaTables.Types._InstanceStateType);
		private static final /*@NonNull*/ ExecutorFragment _InstanceStateType__OclAny = new ExecutorFragment(Types._InstanceStateType, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _InstanceStateType__OclElement = new ExecutorFragment(Types._InstanceStateType, OCLstdlibTables.Types._OclElement);

		private static final /*@NonNull*/ ExecutorFragment _InterfacesType__InterfacesType = new ExecutorFragment(Types._InterfacesType, ToscaTables.Types._InterfacesType);
		private static final /*@NonNull*/ ExecutorFragment _InterfacesType__OclAny = new ExecutorFragment(Types._InterfacesType, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _InterfacesType__OclElement = new ExecutorFragment(Types._InterfacesType, OCLstdlibTables.Types._OclElement);

		private static final /*@NonNull*/ ExecutorFragment _InterfacesType1__InterfacesType1 = new ExecutorFragment(Types._InterfacesType1, ToscaTables.Types._InterfacesType1);
		private static final /*@NonNull*/ ExecutorFragment _InterfacesType1__OclAny = new ExecutorFragment(Types._InterfacesType1, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _InterfacesType1__OclElement = new ExecutorFragment(Types._InterfacesType1, OCLstdlibTables.Types._OclElement);

		private static final /*@NonNull*/ ExecutorFragment _InterfacesType2__InterfacesType2 = new ExecutorFragment(Types._InterfacesType2, ToscaTables.Types._InterfacesType2);
		private static final /*@NonNull*/ ExecutorFragment _InterfacesType2__OclAny = new ExecutorFragment(Types._InterfacesType2, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _InterfacesType2__OclElement = new ExecutorFragment(Types._InterfacesType2, OCLstdlibTables.Types._OclElement);

		private static final /*@NonNull*/ ExecutorFragment _MaxInstancesType__MaxInstancesType = new ExecutorFragment(Types._MaxInstancesType, ToscaTables.Types._MaxInstancesType);
		private static final /*@NonNull*/ ExecutorFragment _MaxInstancesType__OclAny = new ExecutorFragment(Types._MaxInstancesType, OCLstdlibTables.Types._OclAny);

		private static final /*@NonNull*/ ExecutorFragment _MaxInstancesType1__MaxInstancesType1 = new ExecutorFragment(Types._MaxInstancesType1, ToscaTables.Types._MaxInstancesType1);
		private static final /*@NonNull*/ ExecutorFragment _MaxInstancesType1__OclAny = new ExecutorFragment(Types._MaxInstancesType1, OCLstdlibTables.Types._OclAny);

		private static final /*@NonNull*/ ExecutorFragment _MaxInstancesTypeMember0__MaxInstancesTypeMember0 = new ExecutorFragment(Types._MaxInstancesTypeMember0, ToscaTables.Types._MaxInstancesTypeMember0);
		private static final /*@NonNull*/ ExecutorFragment _MaxInstancesTypeMember0__OclAny = new ExecutorFragment(Types._MaxInstancesTypeMember0, OCLstdlibTables.Types._OclAny);

		private static final /*@NonNull*/ ExecutorFragment _MaxInstancesTypeMember01__MaxInstancesTypeMember01 = new ExecutorFragment(Types._MaxInstancesTypeMember01, ToscaTables.Types._MaxInstancesTypeMember01);
		private static final /*@NonNull*/ ExecutorFragment _MaxInstancesTypeMember01__OclAny = new ExecutorFragment(Types._MaxInstancesTypeMember01, OCLstdlibTables.Types._OclAny);

		private static final /*@NonNull*/ ExecutorFragment _MaxInstancesTypeMember1__MaxInstancesTypeMember1 = new ExecutorFragment(Types._MaxInstancesTypeMember1, ToscaTables.Types._MaxInstancesTypeMember1);
		private static final /*@NonNull*/ ExecutorFragment _MaxInstancesTypeMember1__OclAny = new ExecutorFragment(Types._MaxInstancesTypeMember1, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _MaxInstancesTypeMember1__OclElement = new ExecutorFragment(Types._MaxInstancesTypeMember1, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _MaxInstancesTypeMember1__OclEnumeration = new ExecutorFragment(Types._MaxInstancesTypeMember1, OCLstdlibTables.Types._OclEnumeration);
		private static final /*@NonNull*/ ExecutorFragment _MaxInstancesTypeMember1__OclType = new ExecutorFragment(Types._MaxInstancesTypeMember1, OCLstdlibTables.Types._OclType);

		private static final /*@NonNull*/ ExecutorFragment _MaxInstancesTypeMember11__MaxInstancesTypeMember11 = new ExecutorFragment(Types._MaxInstancesTypeMember11, ToscaTables.Types._MaxInstancesTypeMember11);
		private static final /*@NonNull*/ ExecutorFragment _MaxInstancesTypeMember11__OclAny = new ExecutorFragment(Types._MaxInstancesTypeMember11, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _MaxInstancesTypeMember11__OclElement = new ExecutorFragment(Types._MaxInstancesTypeMember11, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _MaxInstancesTypeMember11__OclEnumeration = new ExecutorFragment(Types._MaxInstancesTypeMember11, OCLstdlibTables.Types._OclEnumeration);
		private static final /*@NonNull*/ ExecutorFragment _MaxInstancesTypeMember11__OclType = new ExecutorFragment(Types._MaxInstancesTypeMember11, OCLstdlibTables.Types._OclType);

		private static final /*@NonNull*/ ExecutorFragment _MaxInstancesTypeMember1Object__MaxInstancesTypeMember1Object = new ExecutorFragment(Types._MaxInstancesTypeMember1Object, ToscaTables.Types._MaxInstancesTypeMember1Object);
		private static final /*@NonNull*/ ExecutorFragment _MaxInstancesTypeMember1Object__OclAny = new ExecutorFragment(Types._MaxInstancesTypeMember1Object, OCLstdlibTables.Types._OclAny);

		private static final /*@NonNull*/ ExecutorFragment _MaxInstancesTypeMember1Object1__MaxInstancesTypeMember1Object1 = new ExecutorFragment(Types._MaxInstancesTypeMember1Object1, ToscaTables.Types._MaxInstancesTypeMember1Object1);
		private static final /*@NonNull*/ ExecutorFragment _MaxInstancesTypeMember1Object1__OclAny = new ExecutorFragment(Types._MaxInstancesTypeMember1Object1, OCLstdlibTables.Types._OclAny);

		private static final /*@NonNull*/ ExecutorFragment _NodeOperationType__NodeOperationType = new ExecutorFragment(Types._NodeOperationType, ToscaTables.Types._NodeOperationType);
		private static final /*@NonNull*/ ExecutorFragment _NodeOperationType__OclAny = new ExecutorFragment(Types._NodeOperationType, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _NodeOperationType__OclElement = new ExecutorFragment(Types._NodeOperationType, OCLstdlibTables.Types._OclElement);

		private static final /*@NonNull*/ ExecutorFragment _NodeTypeReferenceType__NodeTypeReferenceType = new ExecutorFragment(Types._NodeTypeReferenceType, ToscaTables.Types._NodeTypeReferenceType);
		private static final /*@NonNull*/ ExecutorFragment _NodeTypeReferenceType__OclAny = new ExecutorFragment(Types._NodeTypeReferenceType, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _NodeTypeReferenceType__OclElement = new ExecutorFragment(Types._NodeTypeReferenceType, OCLstdlibTables.Types._OclElement);

		private static final /*@NonNull*/ ExecutorFragment _OutputParametersType__OclAny = new ExecutorFragment(Types._OutputParametersType, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _OutputParametersType__OclElement = new ExecutorFragment(Types._OutputParametersType, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _OutputParametersType__OutputParametersType = new ExecutorFragment(Types._OutputParametersType, ToscaTables.Types._OutputParametersType);

		private static final /*@NonNull*/ ExecutorFragment _OutputParametersType1__OclAny = new ExecutorFragment(Types._OutputParametersType1, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _OutputParametersType1__OclElement = new ExecutorFragment(Types._OutputParametersType1, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _OutputParametersType1__OutputParametersType1 = new ExecutorFragment(Types._OutputParametersType1, ToscaTables.Types._OutputParametersType1);

		private static final /*@NonNull*/ ExecutorFragment _PlanModelReferenceType__OclAny = new ExecutorFragment(Types._PlanModelReferenceType, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _PlanModelReferenceType__OclElement = new ExecutorFragment(Types._PlanModelReferenceType, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _PlanModelReferenceType__PlanModelReferenceType = new ExecutorFragment(Types._PlanModelReferenceType, ToscaTables.Types._PlanModelReferenceType);

		private static final /*@NonNull*/ ExecutorFragment _PlanModelType__OclAny = new ExecutorFragment(Types._PlanModelType, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _PlanModelType__OclElement = new ExecutorFragment(Types._PlanModelType, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _PlanModelType__PlanModelType = new ExecutorFragment(Types._PlanModelType, ToscaTables.Types._PlanModelType);

		private static final /*@NonNull*/ ExecutorFragment _PlanType__OclAny = new ExecutorFragment(Types._PlanType, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _PlanType__OclElement = new ExecutorFragment(Types._PlanType, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _PlanType__PlanType = new ExecutorFragment(Types._PlanType, ToscaTables.Types._PlanType);

		private static final /*@NonNull*/ ExecutorFragment _PoliciesType__OclAny = new ExecutorFragment(Types._PoliciesType, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _PoliciesType__OclElement = new ExecutorFragment(Types._PoliciesType, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _PoliciesType__PoliciesType = new ExecutorFragment(Types._PoliciesType, ToscaTables.Types._PoliciesType);

		private static final /*@NonNull*/ ExecutorFragment _PoliciesType1__OclAny = new ExecutorFragment(Types._PoliciesType1, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _PoliciesType1__OclElement = new ExecutorFragment(Types._PoliciesType1, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _PoliciesType1__PoliciesType1 = new ExecutorFragment(Types._PoliciesType1, ToscaTables.Types._PoliciesType1);

		private static final /*@NonNull*/ ExecutorFragment _PoliciesType2__OclAny = new ExecutorFragment(Types._PoliciesType2, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _PoliciesType2__OclElement = new ExecutorFragment(Types._PoliciesType2, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _PoliciesType2__PoliciesType2 = new ExecutorFragment(Types._PoliciesType2, ToscaTables.Types._PoliciesType2);

		private static final /*@NonNull*/ ExecutorFragment _PropertiesDefinitionType__OclAny = new ExecutorFragment(Types._PropertiesDefinitionType, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _PropertiesDefinitionType__OclElement = new ExecutorFragment(Types._PropertiesDefinitionType, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _PropertiesDefinitionType__PropertiesDefinitionType = new ExecutorFragment(Types._PropertiesDefinitionType, ToscaTables.Types._PropertiesDefinitionType);

		private static final /*@NonNull*/ ExecutorFragment _PropertiesType__OclAny = new ExecutorFragment(Types._PropertiesType, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _PropertiesType__OclElement = new ExecutorFragment(Types._PropertiesType, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _PropertiesType__PropertiesType = new ExecutorFragment(Types._PropertiesType, ToscaTables.Types._PropertiesType);

		private static final /*@NonNull*/ ExecutorFragment _PropertiesType1__OclAny = new ExecutorFragment(Types._PropertiesType1, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _PropertiesType1__OclElement = new ExecutorFragment(Types._PropertiesType1, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _PropertiesType1__PropertiesType1 = new ExecutorFragment(Types._PropertiesType1, ToscaTables.Types._PropertiesType1);

		private static final /*@NonNull*/ ExecutorFragment _PropertyConstraintsType__OclAny = new ExecutorFragment(Types._PropertyConstraintsType, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _PropertyConstraintsType__OclElement = new ExecutorFragment(Types._PropertyConstraintsType, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _PropertyConstraintsType__PropertyConstraintsType = new ExecutorFragment(Types._PropertyConstraintsType, ToscaTables.Types._PropertyConstraintsType);

		private static final /*@NonNull*/ ExecutorFragment _PropertyConstraintsType1__OclAny = new ExecutorFragment(Types._PropertyConstraintsType1, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _PropertyConstraintsType1__OclElement = new ExecutorFragment(Types._PropertyConstraintsType1, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _PropertyConstraintsType1__PropertyConstraintsType1 = new ExecutorFragment(Types._PropertyConstraintsType1, ToscaTables.Types._PropertyConstraintsType1);

		private static final /*@NonNull*/ ExecutorFragment _PropertyMappingsType__OclAny = new ExecutorFragment(Types._PropertyMappingsType, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _PropertyMappingsType__OclElement = new ExecutorFragment(Types._PropertyMappingsType, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _PropertyMappingsType__PropertyMappingsType = new ExecutorFragment(Types._PropertyMappingsType, ToscaTables.Types._PropertyMappingsType);

		private static final /*@NonNull*/ ExecutorFragment _RelationshipConstraintType__OclAny = new ExecutorFragment(Types._RelationshipConstraintType, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _RelationshipConstraintType__OclElement = new ExecutorFragment(Types._RelationshipConstraintType, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _RelationshipConstraintType__RelationshipConstraintType = new ExecutorFragment(Types._RelationshipConstraintType, ToscaTables.Types._RelationshipConstraintType);

		private static final /*@NonNull*/ ExecutorFragment _RelationshipConstraintsType__OclAny = new ExecutorFragment(Types._RelationshipConstraintsType, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _RelationshipConstraintsType__OclElement = new ExecutorFragment(Types._RelationshipConstraintsType, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _RelationshipConstraintsType__RelationshipConstraintsType = new ExecutorFragment(Types._RelationshipConstraintsType, ToscaTables.Types._RelationshipConstraintsType);

		private static final /*@NonNull*/ ExecutorFragment _RelationshipOperationType__OclAny = new ExecutorFragment(Types._RelationshipOperationType, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _RelationshipOperationType__OclElement = new ExecutorFragment(Types._RelationshipOperationType, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _RelationshipOperationType__RelationshipOperationType = new ExecutorFragment(Types._RelationshipOperationType, ToscaTables.Types._RelationshipOperationType);

		private static final /*@NonNull*/ ExecutorFragment _RequirementDefinitionsType__OclAny = new ExecutorFragment(Types._RequirementDefinitionsType, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _RequirementDefinitionsType__OclElement = new ExecutorFragment(Types._RequirementDefinitionsType, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _RequirementDefinitionsType__RequirementDefinitionsType = new ExecutorFragment(Types._RequirementDefinitionsType, ToscaTables.Types._RequirementDefinitionsType);

		private static final /*@NonNull*/ ExecutorFragment _RequirementDefinitionsType1__OclAny = new ExecutorFragment(Types._RequirementDefinitionsType1, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _RequirementDefinitionsType1__OclElement = new ExecutorFragment(Types._RequirementDefinitionsType1, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _RequirementDefinitionsType1__RequirementDefinitionsType1 = new ExecutorFragment(Types._RequirementDefinitionsType1, ToscaTables.Types._RequirementDefinitionsType1);

		private static final /*@NonNull*/ ExecutorFragment _RequirementsType__OclAny = new ExecutorFragment(Types._RequirementsType, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _RequirementsType__OclElement = new ExecutorFragment(Types._RequirementsType, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _RequirementsType__RequirementsType = new ExecutorFragment(Types._RequirementsType, ToscaTables.Types._RequirementsType);

		private static final /*@NonNull*/ ExecutorFragment _RequirementsType1__OclAny = new ExecutorFragment(Types._RequirementsType1, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _RequirementsType1__OclElement = new ExecutorFragment(Types._RequirementsType1, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _RequirementsType1__RequirementsType1 = new ExecutorFragment(Types._RequirementsType1, ToscaTables.Types._RequirementsType1);

		private static final /*@NonNull*/ ExecutorFragment _RequirementsType2__OclAny = new ExecutorFragment(Types._RequirementsType2, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _RequirementsType2__OclElement = new ExecutorFragment(Types._RequirementsType2, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _RequirementsType2__RequirementsType2 = new ExecutorFragment(Types._RequirementsType2, ToscaTables.Types._RequirementsType2);

		private static final /*@NonNull*/ ExecutorFragment _SourceElementType__OclAny = new ExecutorFragment(Types._SourceElementType, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _SourceElementType__OclElement = new ExecutorFragment(Types._SourceElementType, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _SourceElementType__SourceElementType = new ExecutorFragment(Types._SourceElementType, ToscaTables.Types._SourceElementType);

		private static final /*@NonNull*/ ExecutorFragment _SourceInterfacesType__OclAny = new ExecutorFragment(Types._SourceInterfacesType, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _SourceInterfacesType__OclElement = new ExecutorFragment(Types._SourceInterfacesType, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _SourceInterfacesType__SourceInterfacesType = new ExecutorFragment(Types._SourceInterfacesType, ToscaTables.Types._SourceInterfacesType);

		private static final /*@NonNull*/ ExecutorFragment _TAppliesTo__OclAny = new ExecutorFragment(Types._TAppliesTo, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _TAppliesTo__OclElement = new ExecutorFragment(Types._TAppliesTo, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _TAppliesTo__TAppliesTo = new ExecutorFragment(Types._TAppliesTo, ToscaTables.Types._TAppliesTo);

		private static final /*@NonNull*/ ExecutorFragment _TArtifactReference__OclAny = new ExecutorFragment(Types._TArtifactReference, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _TArtifactReference__OclElement = new ExecutorFragment(Types._TArtifactReference, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _TArtifactReference__TArtifactReference = new ExecutorFragment(Types._TArtifactReference, ToscaTables.Types._TArtifactReference);

		private static final /*@NonNull*/ ExecutorFragment _TArtifactTemplate__OclAny = new ExecutorFragment(Types._TArtifactTemplate, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _TArtifactTemplate__OclElement = new ExecutorFragment(Types._TArtifactTemplate, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _TArtifactTemplate__TArtifactTemplate = new ExecutorFragment(Types._TArtifactTemplate, ToscaTables.Types._TArtifactTemplate);
		private static final /*@NonNull*/ ExecutorFragment _TArtifactTemplate__TEntityTemplate = new ExecutorFragment(Types._TArtifactTemplate, ToscaTables.Types._TEntityTemplate);
		private static final /*@NonNull*/ ExecutorFragment _TArtifactTemplate__TExtensibleElements = new ExecutorFragment(Types._TArtifactTemplate, ToscaTables.Types._TExtensibleElements);

		private static final /*@NonNull*/ ExecutorFragment _TArtifactType__OclAny = new ExecutorFragment(Types._TArtifactType, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _TArtifactType__OclElement = new ExecutorFragment(Types._TArtifactType, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _TArtifactType__TArtifactType = new ExecutorFragment(Types._TArtifactType, ToscaTables.Types._TArtifactType);
		private static final /*@NonNull*/ ExecutorFragment _TArtifactType__TEntityType = new ExecutorFragment(Types._TArtifactType, ToscaTables.Types._TEntityType);
		private static final /*@NonNull*/ ExecutorFragment _TArtifactType__TExtensibleElements = new ExecutorFragment(Types._TArtifactType, ToscaTables.Types._TExtensibleElements);

		private static final /*@NonNull*/ ExecutorFragment _TBoolean__OclAny = new ExecutorFragment(Types._TBoolean, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _TBoolean__OclElement = new ExecutorFragment(Types._TBoolean, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _TBoolean__OclEnumeration = new ExecutorFragment(Types._TBoolean, OCLstdlibTables.Types._OclEnumeration);
		private static final /*@NonNull*/ ExecutorFragment _TBoolean__OclType = new ExecutorFragment(Types._TBoolean, OCLstdlibTables.Types._OclType);
		private static final /*@NonNull*/ ExecutorFragment _TBoolean__TBoolean = new ExecutorFragment(Types._TBoolean, ToscaTables.Types._TBoolean);

		private static final /*@NonNull*/ ExecutorFragment _TBooleanObject__OclAny = new ExecutorFragment(Types._TBooleanObject, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _TBooleanObject__TBooleanObject = new ExecutorFragment(Types._TBooleanObject, ToscaTables.Types._TBooleanObject);

		private static final /*@NonNull*/ ExecutorFragment _TBoundaryDefinitions__OclAny = new ExecutorFragment(Types._TBoundaryDefinitions, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _TBoundaryDefinitions__OclElement = new ExecutorFragment(Types._TBoundaryDefinitions, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _TBoundaryDefinitions__TBoundaryDefinitions = new ExecutorFragment(Types._TBoundaryDefinitions, ToscaTables.Types._TBoundaryDefinitions);

		private static final /*@NonNull*/ ExecutorFragment _TCapability__OclAny = new ExecutorFragment(Types._TCapability, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _TCapability__OclElement = new ExecutorFragment(Types._TCapability, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _TCapability__TCapability = new ExecutorFragment(Types._TCapability, ToscaTables.Types._TCapability);
		private static final /*@NonNull*/ ExecutorFragment _TCapability__TEntityTemplate = new ExecutorFragment(Types._TCapability, ToscaTables.Types._TEntityTemplate);
		private static final /*@NonNull*/ ExecutorFragment _TCapability__TExtensibleElements = new ExecutorFragment(Types._TCapability, ToscaTables.Types._TExtensibleElements);

		private static final /*@NonNull*/ ExecutorFragment _TCapabilityDefinition__OclAny = new ExecutorFragment(Types._TCapabilityDefinition, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _TCapabilityDefinition__OclElement = new ExecutorFragment(Types._TCapabilityDefinition, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _TCapabilityDefinition__TCapabilityDefinition = new ExecutorFragment(Types._TCapabilityDefinition, ToscaTables.Types._TCapabilityDefinition);
		private static final /*@NonNull*/ ExecutorFragment _TCapabilityDefinition__TExtensibleElements = new ExecutorFragment(Types._TCapabilityDefinition, ToscaTables.Types._TExtensibleElements);

		private static final /*@NonNull*/ ExecutorFragment _TCapabilityRef__OclAny = new ExecutorFragment(Types._TCapabilityRef, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _TCapabilityRef__OclElement = new ExecutorFragment(Types._TCapabilityRef, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _TCapabilityRef__TCapabilityRef = new ExecutorFragment(Types._TCapabilityRef, ToscaTables.Types._TCapabilityRef);

		private static final /*@NonNull*/ ExecutorFragment _TCapabilityType__OclAny = new ExecutorFragment(Types._TCapabilityType, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _TCapabilityType__OclElement = new ExecutorFragment(Types._TCapabilityType, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _TCapabilityType__TCapabilityType = new ExecutorFragment(Types._TCapabilityType, ToscaTables.Types._TCapabilityType);
		private static final /*@NonNull*/ ExecutorFragment _TCapabilityType__TEntityType = new ExecutorFragment(Types._TCapabilityType, ToscaTables.Types._TEntityType);
		private static final /*@NonNull*/ ExecutorFragment _TCapabilityType__TExtensibleElements = new ExecutorFragment(Types._TCapabilityType, ToscaTables.Types._TExtensibleElements);

		private static final /*@NonNull*/ ExecutorFragment _TCondition__OclAny = new ExecutorFragment(Types._TCondition, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _TCondition__OclElement = new ExecutorFragment(Types._TCondition, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _TCondition__TCondition = new ExecutorFragment(Types._TCondition, ToscaTables.Types._TCondition);

		private static final /*@NonNull*/ ExecutorFragment _TConstraint__OclAny = new ExecutorFragment(Types._TConstraint, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _TConstraint__OclElement = new ExecutorFragment(Types._TConstraint, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _TConstraint__TConstraint = new ExecutorFragment(Types._TConstraint, ToscaTables.Types._TConstraint);

		private static final /*@NonNull*/ ExecutorFragment _TDefinitions__OclAny = new ExecutorFragment(Types._TDefinitions, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _TDefinitions__OclElement = new ExecutorFragment(Types._TDefinitions, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _TDefinitions__TDefinitions = new ExecutorFragment(Types._TDefinitions, ToscaTables.Types._TDefinitions);
		private static final /*@NonNull*/ ExecutorFragment _TDefinitions__TExtensibleElements = new ExecutorFragment(Types._TDefinitions, ToscaTables.Types._TExtensibleElements);

		private static final /*@NonNull*/ ExecutorFragment _TDeploymentArtifact__OclAny = new ExecutorFragment(Types._TDeploymentArtifact, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _TDeploymentArtifact__OclElement = new ExecutorFragment(Types._TDeploymentArtifact, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _TDeploymentArtifact__TDeploymentArtifact = new ExecutorFragment(Types._TDeploymentArtifact, ToscaTables.Types._TDeploymentArtifact);
		private static final /*@NonNull*/ ExecutorFragment _TDeploymentArtifact__TExtensibleElements = new ExecutorFragment(Types._TDeploymentArtifact, ToscaTables.Types._TExtensibleElements);

		private static final /*@NonNull*/ ExecutorFragment _TDeploymentArtifacts__OclAny = new ExecutorFragment(Types._TDeploymentArtifacts, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _TDeploymentArtifacts__OclElement = new ExecutorFragment(Types._TDeploymentArtifacts, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _TDeploymentArtifacts__TDeploymentArtifacts = new ExecutorFragment(Types._TDeploymentArtifacts, ToscaTables.Types._TDeploymentArtifacts);

		private static final /*@NonNull*/ ExecutorFragment _TDocumentation__OclAny = new ExecutorFragment(Types._TDocumentation, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _TDocumentation__OclElement = new ExecutorFragment(Types._TDocumentation, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _TDocumentation__TDocumentation = new ExecutorFragment(Types._TDocumentation, ToscaTables.Types._TDocumentation);

		private static final /*@NonNull*/ ExecutorFragment _TEntityTemplate__OclAny = new ExecutorFragment(Types._TEntityTemplate, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _TEntityTemplate__OclElement = new ExecutorFragment(Types._TEntityTemplate, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _TEntityTemplate__TEntityTemplate = new ExecutorFragment(Types._TEntityTemplate, ToscaTables.Types._TEntityTemplate);
		private static final /*@NonNull*/ ExecutorFragment _TEntityTemplate__TExtensibleElements = new ExecutorFragment(Types._TEntityTemplate, ToscaTables.Types._TExtensibleElements);

		private static final /*@NonNull*/ ExecutorFragment _TEntityType__OclAny = new ExecutorFragment(Types._TEntityType, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _TEntityType__OclElement = new ExecutorFragment(Types._TEntityType, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _TEntityType__TEntityType = new ExecutorFragment(Types._TEntityType, ToscaTables.Types._TEntityType);
		private static final /*@NonNull*/ ExecutorFragment _TEntityType__TExtensibleElements = new ExecutorFragment(Types._TEntityType, ToscaTables.Types._TExtensibleElements);

		private static final /*@NonNull*/ ExecutorFragment _TExportedInterface__OclAny = new ExecutorFragment(Types._TExportedInterface, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _TExportedInterface__OclElement = new ExecutorFragment(Types._TExportedInterface, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _TExportedInterface__TExportedInterface = new ExecutorFragment(Types._TExportedInterface, ToscaTables.Types._TExportedInterface);

		private static final /*@NonNull*/ ExecutorFragment _TExportedOperation__OclAny = new ExecutorFragment(Types._TExportedOperation, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _TExportedOperation__OclElement = new ExecutorFragment(Types._TExportedOperation, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _TExportedOperation__TExportedOperation = new ExecutorFragment(Types._TExportedOperation, ToscaTables.Types._TExportedOperation);

		private static final /*@NonNull*/ ExecutorFragment _TExtensibleElements__OclAny = new ExecutorFragment(Types._TExtensibleElements, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _TExtensibleElements__OclElement = new ExecutorFragment(Types._TExtensibleElements, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _TExtensibleElements__TExtensibleElements = new ExecutorFragment(Types._TExtensibleElements, ToscaTables.Types._TExtensibleElements);

		private static final /*@NonNull*/ ExecutorFragment _TExtension__OclAny = new ExecutorFragment(Types._TExtension, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _TExtension__OclElement = new ExecutorFragment(Types._TExtension, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _TExtension__TExtensibleElements = new ExecutorFragment(Types._TExtension, ToscaTables.Types._TExtensibleElements);
		private static final /*@NonNull*/ ExecutorFragment _TExtension__TExtension = new ExecutorFragment(Types._TExtension, ToscaTables.Types._TExtension);

		private static final /*@NonNull*/ ExecutorFragment _TExtensions__OclAny = new ExecutorFragment(Types._TExtensions, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _TExtensions__OclElement = new ExecutorFragment(Types._TExtensions, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _TExtensions__TExtensibleElements = new ExecutorFragment(Types._TExtensions, ToscaTables.Types._TExtensibleElements);
		private static final /*@NonNull*/ ExecutorFragment _TExtensions__TExtensions = new ExecutorFragment(Types._TExtensions, ToscaTables.Types._TExtensions);

		private static final /*@NonNull*/ ExecutorFragment _TGroupTemplate__OclAny = new ExecutorFragment(Types._TGroupTemplate, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _TGroupTemplate__OclElement = new ExecutorFragment(Types._TGroupTemplate, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _TGroupTemplate__TEntityTemplate = new ExecutorFragment(Types._TGroupTemplate, ToscaTables.Types._TEntityTemplate);
		private static final /*@NonNull*/ ExecutorFragment _TGroupTemplate__TExtensibleElements = new ExecutorFragment(Types._TGroupTemplate, ToscaTables.Types._TExtensibleElements);
		private static final /*@NonNull*/ ExecutorFragment _TGroupTemplate__TGroupTemplate = new ExecutorFragment(Types._TGroupTemplate, ToscaTables.Types._TGroupTemplate);

		private static final /*@NonNull*/ ExecutorFragment _TGroupType__OclAny = new ExecutorFragment(Types._TGroupType, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _TGroupType__OclElement = new ExecutorFragment(Types._TGroupType, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _TGroupType__TEntityType = new ExecutorFragment(Types._TGroupType, ToscaTables.Types._TEntityType);
		private static final /*@NonNull*/ ExecutorFragment _TGroupType__TExtensibleElements = new ExecutorFragment(Types._TGroupType, ToscaTables.Types._TExtensibleElements);
		private static final /*@NonNull*/ ExecutorFragment _TGroupType__TGroupType = new ExecutorFragment(Types._TGroupType, ToscaTables.Types._TGroupType);

		private static final /*@NonNull*/ ExecutorFragment _TImplementationArtifact__OclAny = new ExecutorFragment(Types._TImplementationArtifact, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _TImplementationArtifact__OclElement = new ExecutorFragment(Types._TImplementationArtifact, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _TImplementationArtifact__TExtensibleElements = new ExecutorFragment(Types._TImplementationArtifact, ToscaTables.Types._TExtensibleElements);
		private static final /*@NonNull*/ ExecutorFragment _TImplementationArtifact__TImplementationArtifact = new ExecutorFragment(Types._TImplementationArtifact, ToscaTables.Types._TImplementationArtifact);

		private static final /*@NonNull*/ ExecutorFragment _TImplementationArtifacts__OclAny = new ExecutorFragment(Types._TImplementationArtifacts, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _TImplementationArtifacts__OclElement = new ExecutorFragment(Types._TImplementationArtifacts, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _TImplementationArtifacts__TImplementationArtifacts = new ExecutorFragment(Types._TImplementationArtifacts, ToscaTables.Types._TImplementationArtifacts);

		private static final /*@NonNull*/ ExecutorFragment _TImport__OclAny = new ExecutorFragment(Types._TImport, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _TImport__OclElement = new ExecutorFragment(Types._TImport, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _TImport__TExtensibleElements = new ExecutorFragment(Types._TImport, ToscaTables.Types._TExtensibleElements);
		private static final /*@NonNull*/ ExecutorFragment _TImport__TImport = new ExecutorFragment(Types._TImport, ToscaTables.Types._TImport);

		private static final /*@NonNull*/ ExecutorFragment _TInterface__OclAny = new ExecutorFragment(Types._TInterface, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _TInterface__OclElement = new ExecutorFragment(Types._TInterface, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _TInterface__TInterface = new ExecutorFragment(Types._TInterface, ToscaTables.Types._TInterface);

		private static final /*@NonNull*/ ExecutorFragment _TNodeTemplate__OclAny = new ExecutorFragment(Types._TNodeTemplate, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _TNodeTemplate__OclElement = new ExecutorFragment(Types._TNodeTemplate, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _TNodeTemplate__TEntityTemplate = new ExecutorFragment(Types._TNodeTemplate, ToscaTables.Types._TEntityTemplate);
		private static final /*@NonNull*/ ExecutorFragment _TNodeTemplate__TExtensibleElements = new ExecutorFragment(Types._TNodeTemplate, ToscaTables.Types._TExtensibleElements);
		private static final /*@NonNull*/ ExecutorFragment _TNodeTemplate__TNodeTemplate = new ExecutorFragment(Types._TNodeTemplate, ToscaTables.Types._TNodeTemplate);

		private static final /*@NonNull*/ ExecutorFragment _TNodeType__OclAny = new ExecutorFragment(Types._TNodeType, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _TNodeType__OclElement = new ExecutorFragment(Types._TNodeType, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _TNodeType__TEntityType = new ExecutorFragment(Types._TNodeType, ToscaTables.Types._TEntityType);
		private static final /*@NonNull*/ ExecutorFragment _TNodeType__TExtensibleElements = new ExecutorFragment(Types._TNodeType, ToscaTables.Types._TExtensibleElements);
		private static final /*@NonNull*/ ExecutorFragment _TNodeType__TNodeType = new ExecutorFragment(Types._TNodeType, ToscaTables.Types._TNodeType);

		private static final /*@NonNull*/ ExecutorFragment _TNodeTypeImplementation__OclAny = new ExecutorFragment(Types._TNodeTypeImplementation, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _TNodeTypeImplementation__OclElement = new ExecutorFragment(Types._TNodeTypeImplementation, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _TNodeTypeImplementation__TExtensibleElements = new ExecutorFragment(Types._TNodeTypeImplementation, ToscaTables.Types._TExtensibleElements);
		private static final /*@NonNull*/ ExecutorFragment _TNodeTypeImplementation__TNodeTypeImplementation = new ExecutorFragment(Types._TNodeTypeImplementation, ToscaTables.Types._TNodeTypeImplementation);

		private static final /*@NonNull*/ ExecutorFragment _TOperation__OclAny = new ExecutorFragment(Types._TOperation, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _TOperation__OclElement = new ExecutorFragment(Types._TOperation, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _TOperation__TExtensibleElements = new ExecutorFragment(Types._TOperation, ToscaTables.Types._TExtensibleElements);
		private static final /*@NonNull*/ ExecutorFragment _TOperation__TOperation = new ExecutorFragment(Types._TOperation, ToscaTables.Types._TOperation);

		private static final /*@NonNull*/ ExecutorFragment _TParameter__OclAny = new ExecutorFragment(Types._TParameter, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _TParameter__OclElement = new ExecutorFragment(Types._TParameter, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _TParameter__TParameter = new ExecutorFragment(Types._TParameter, ToscaTables.Types._TParameter);

		private static final /*@NonNull*/ ExecutorFragment _TPlan__OclAny = new ExecutorFragment(Types._TPlan, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _TPlan__OclElement = new ExecutorFragment(Types._TPlan, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _TPlan__TExtensibleElements = new ExecutorFragment(Types._TPlan, ToscaTables.Types._TExtensibleElements);
		private static final /*@NonNull*/ ExecutorFragment _TPlan__TPlan = new ExecutorFragment(Types._TPlan, ToscaTables.Types._TPlan);

		private static final /*@NonNull*/ ExecutorFragment _TPlans__OclAny = new ExecutorFragment(Types._TPlans, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _TPlans__OclElement = new ExecutorFragment(Types._TPlans, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _TPlans__TPlans = new ExecutorFragment(Types._TPlans, ToscaTables.Types._TPlans);

		private static final /*@NonNull*/ ExecutorFragment _TPolicy__OclAny = new ExecutorFragment(Types._TPolicy, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _TPolicy__OclElement = new ExecutorFragment(Types._TPolicy, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _TPolicy__TExtensibleElements = new ExecutorFragment(Types._TPolicy, ToscaTables.Types._TExtensibleElements);
		private static final /*@NonNull*/ ExecutorFragment _TPolicy__TPolicy = new ExecutorFragment(Types._TPolicy, ToscaTables.Types._TPolicy);

		private static final /*@NonNull*/ ExecutorFragment _TPolicyTemplate__OclAny = new ExecutorFragment(Types._TPolicyTemplate, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _TPolicyTemplate__OclElement = new ExecutorFragment(Types._TPolicyTemplate, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _TPolicyTemplate__TEntityTemplate = new ExecutorFragment(Types._TPolicyTemplate, ToscaTables.Types._TEntityTemplate);
		private static final /*@NonNull*/ ExecutorFragment _TPolicyTemplate__TExtensibleElements = new ExecutorFragment(Types._TPolicyTemplate, ToscaTables.Types._TExtensibleElements);
		private static final /*@NonNull*/ ExecutorFragment _TPolicyTemplate__TPolicyTemplate = new ExecutorFragment(Types._TPolicyTemplate, ToscaTables.Types._TPolicyTemplate);

		private static final /*@NonNull*/ ExecutorFragment _TPolicyType__OclAny = new ExecutorFragment(Types._TPolicyType, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _TPolicyType__OclElement = new ExecutorFragment(Types._TPolicyType, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _TPolicyType__TEntityType = new ExecutorFragment(Types._TPolicyType, ToscaTables.Types._TEntityType);
		private static final /*@NonNull*/ ExecutorFragment _TPolicyType__TExtensibleElements = new ExecutorFragment(Types._TPolicyType, ToscaTables.Types._TExtensibleElements);
		private static final /*@NonNull*/ ExecutorFragment _TPolicyType__TPolicyType = new ExecutorFragment(Types._TPolicyType, ToscaTables.Types._TPolicyType);

		private static final /*@NonNull*/ ExecutorFragment _TPropertyConstraint__OclAny = new ExecutorFragment(Types._TPropertyConstraint, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _TPropertyConstraint__OclElement = new ExecutorFragment(Types._TPropertyConstraint, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _TPropertyConstraint__TConstraint = new ExecutorFragment(Types._TPropertyConstraint, ToscaTables.Types._TConstraint);
		private static final /*@NonNull*/ ExecutorFragment _TPropertyConstraint__TPropertyConstraint = new ExecutorFragment(Types._TPropertyConstraint, ToscaTables.Types._TPropertyConstraint);

		private static final /*@NonNull*/ ExecutorFragment _TPropertyMapping__OclAny = new ExecutorFragment(Types._TPropertyMapping, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _TPropertyMapping__OclElement = new ExecutorFragment(Types._TPropertyMapping, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _TPropertyMapping__TPropertyMapping = new ExecutorFragment(Types._TPropertyMapping, ToscaTables.Types._TPropertyMapping);

		private static final /*@NonNull*/ ExecutorFragment _TRelationshipTemplate__OclAny = new ExecutorFragment(Types._TRelationshipTemplate, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _TRelationshipTemplate__OclElement = new ExecutorFragment(Types._TRelationshipTemplate, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _TRelationshipTemplate__TEntityTemplate = new ExecutorFragment(Types._TRelationshipTemplate, ToscaTables.Types._TEntityTemplate);
		private static final /*@NonNull*/ ExecutorFragment _TRelationshipTemplate__TExtensibleElements = new ExecutorFragment(Types._TRelationshipTemplate, ToscaTables.Types._TExtensibleElements);
		private static final /*@NonNull*/ ExecutorFragment _TRelationshipTemplate__TRelationshipTemplate = new ExecutorFragment(Types._TRelationshipTemplate, ToscaTables.Types._TRelationshipTemplate);

		private static final /*@NonNull*/ ExecutorFragment _TRelationshipType__OclAny = new ExecutorFragment(Types._TRelationshipType, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _TRelationshipType__OclElement = new ExecutorFragment(Types._TRelationshipType, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _TRelationshipType__TEntityType = new ExecutorFragment(Types._TRelationshipType, ToscaTables.Types._TEntityType);
		private static final /*@NonNull*/ ExecutorFragment _TRelationshipType__TExtensibleElements = new ExecutorFragment(Types._TRelationshipType, ToscaTables.Types._TExtensibleElements);
		private static final /*@NonNull*/ ExecutorFragment _TRelationshipType__TRelationshipType = new ExecutorFragment(Types._TRelationshipType, ToscaTables.Types._TRelationshipType);

		private static final /*@NonNull*/ ExecutorFragment _TRelationshipTypeImplementation__OclAny = new ExecutorFragment(Types._TRelationshipTypeImplementation, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _TRelationshipTypeImplementation__OclElement = new ExecutorFragment(Types._TRelationshipTypeImplementation, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _TRelationshipTypeImplementation__TExtensibleElements = new ExecutorFragment(Types._TRelationshipTypeImplementation, ToscaTables.Types._TExtensibleElements);
		private static final /*@NonNull*/ ExecutorFragment _TRelationshipTypeImplementation__TRelationshipTypeImplementation = new ExecutorFragment(Types._TRelationshipTypeImplementation, ToscaTables.Types._TRelationshipTypeImplementation);

		private static final /*@NonNull*/ ExecutorFragment _TRequiredContainerFeature__OclAny = new ExecutorFragment(Types._TRequiredContainerFeature, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _TRequiredContainerFeature__OclElement = new ExecutorFragment(Types._TRequiredContainerFeature, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _TRequiredContainerFeature__TRequiredContainerFeature = new ExecutorFragment(Types._TRequiredContainerFeature, ToscaTables.Types._TRequiredContainerFeature);

		private static final /*@NonNull*/ ExecutorFragment _TRequiredContainerFeatures__OclAny = new ExecutorFragment(Types._TRequiredContainerFeatures, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _TRequiredContainerFeatures__OclElement = new ExecutorFragment(Types._TRequiredContainerFeatures, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _TRequiredContainerFeatures__TRequiredContainerFeatures = new ExecutorFragment(Types._TRequiredContainerFeatures, ToscaTables.Types._TRequiredContainerFeatures);

		private static final /*@NonNull*/ ExecutorFragment _TRequirement__OclAny = new ExecutorFragment(Types._TRequirement, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _TRequirement__OclElement = new ExecutorFragment(Types._TRequirement, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _TRequirement__TEntityTemplate = new ExecutorFragment(Types._TRequirement, ToscaTables.Types._TEntityTemplate);
		private static final /*@NonNull*/ ExecutorFragment _TRequirement__TExtensibleElements = new ExecutorFragment(Types._TRequirement, ToscaTables.Types._TExtensibleElements);
		private static final /*@NonNull*/ ExecutorFragment _TRequirement__TRequirement = new ExecutorFragment(Types._TRequirement, ToscaTables.Types._TRequirement);

		private static final /*@NonNull*/ ExecutorFragment _TRequirementDefinition__OclAny = new ExecutorFragment(Types._TRequirementDefinition, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _TRequirementDefinition__OclElement = new ExecutorFragment(Types._TRequirementDefinition, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _TRequirementDefinition__TExtensibleElements = new ExecutorFragment(Types._TRequirementDefinition, ToscaTables.Types._TExtensibleElements);
		private static final /*@NonNull*/ ExecutorFragment _TRequirementDefinition__TRequirementDefinition = new ExecutorFragment(Types._TRequirementDefinition, ToscaTables.Types._TRequirementDefinition);

		private static final /*@NonNull*/ ExecutorFragment _TRequirementRef__OclAny = new ExecutorFragment(Types._TRequirementRef, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _TRequirementRef__OclElement = new ExecutorFragment(Types._TRequirementRef, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _TRequirementRef__TRequirementRef = new ExecutorFragment(Types._TRequirementRef, ToscaTables.Types._TRequirementRef);

		private static final /*@NonNull*/ ExecutorFragment _TRequirementType__OclAny = new ExecutorFragment(Types._TRequirementType, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _TRequirementType__OclElement = new ExecutorFragment(Types._TRequirementType, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _TRequirementType__TEntityType = new ExecutorFragment(Types._TRequirementType, ToscaTables.Types._TEntityType);
		private static final /*@NonNull*/ ExecutorFragment _TRequirementType__TExtensibleElements = new ExecutorFragment(Types._TRequirementType, ToscaTables.Types._TExtensibleElements);
		private static final /*@NonNull*/ ExecutorFragment _TRequirementType__TRequirementType = new ExecutorFragment(Types._TRequirementType, ToscaTables.Types._TRequirementType);

		private static final /*@NonNull*/ ExecutorFragment _TServiceTemplate__OclAny = new ExecutorFragment(Types._TServiceTemplate, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _TServiceTemplate__OclElement = new ExecutorFragment(Types._TServiceTemplate, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _TServiceTemplate__TExtensibleElements = new ExecutorFragment(Types._TServiceTemplate, ToscaTables.Types._TExtensibleElements);
		private static final /*@NonNull*/ ExecutorFragment _TServiceTemplate__TServiceTemplate = new ExecutorFragment(Types._TServiceTemplate, ToscaTables.Types._TServiceTemplate);

		private static final /*@NonNull*/ ExecutorFragment _TTag__OclAny = new ExecutorFragment(Types._TTag, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _TTag__OclElement = new ExecutorFragment(Types._TTag, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _TTag__TTag = new ExecutorFragment(Types._TTag, ToscaTables.Types._TTag);

		private static final /*@NonNull*/ ExecutorFragment _TTags__OclAny = new ExecutorFragment(Types._TTags, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _TTags__OclElement = new ExecutorFragment(Types._TTags, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _TTags__TTags = new ExecutorFragment(Types._TTags, ToscaTables.Types._TTags);

		private static final /*@NonNull*/ ExecutorFragment _TTopologyElementInstanceStates__OclAny = new ExecutorFragment(Types._TTopologyElementInstanceStates, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _TTopologyElementInstanceStates__OclElement = new ExecutorFragment(Types._TTopologyElementInstanceStates, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _TTopologyElementInstanceStates__TTopologyElementInstanceStates = new ExecutorFragment(Types._TTopologyElementInstanceStates, ToscaTables.Types._TTopologyElementInstanceStates);

		private static final /*@NonNull*/ ExecutorFragment _TTopologyTemplate__OclAny = new ExecutorFragment(Types._TTopologyTemplate, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _TTopologyTemplate__OclElement = new ExecutorFragment(Types._TTopologyTemplate, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _TTopologyTemplate__TExtensibleElements = new ExecutorFragment(Types._TTopologyTemplate, ToscaTables.Types._TExtensibleElements);
		private static final /*@NonNull*/ ExecutorFragment _TTopologyTemplate__TTopologyTemplate = new ExecutorFragment(Types._TTopologyTemplate, ToscaTables.Types._TTopologyTemplate);

		private static final /*@NonNull*/ ExecutorFragment _TargetElementType__OclAny = new ExecutorFragment(Types._TargetElementType, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _TargetElementType__OclElement = new ExecutorFragment(Types._TargetElementType, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _TargetElementType__TargetElementType = new ExecutorFragment(Types._TargetElementType, ToscaTables.Types._TargetElementType);

		private static final /*@NonNull*/ ExecutorFragment _TargetInterfacesType__OclAny = new ExecutorFragment(Types._TargetInterfacesType, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _TargetInterfacesType__OclElement = new ExecutorFragment(Types._TargetInterfacesType, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _TargetInterfacesType__TargetInterfacesType = new ExecutorFragment(Types._TargetInterfacesType, ToscaTables.Types._TargetInterfacesType);

		private static final /*@NonNull*/ ExecutorFragment _TypesType__OclAny = new ExecutorFragment(Types._TypesType, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _TypesType__OclElement = new ExecutorFragment(Types._TypesType, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _TypesType__TypesType = new ExecutorFragment(Types._TypesType, ToscaTables.Types._TypesType);

		private static final /*@NonNull*/ ExecutorFragment _UpperBoundType__OclAny = new ExecutorFragment(Types._UpperBoundType, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _UpperBoundType__UpperBoundType = new ExecutorFragment(Types._UpperBoundType, ToscaTables.Types._UpperBoundType);

		private static final /*@NonNull*/ ExecutorFragment _UpperBoundType1__OclAny = new ExecutorFragment(Types._UpperBoundType1, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _UpperBoundType1__UpperBoundType1 = new ExecutorFragment(Types._UpperBoundType1, ToscaTables.Types._UpperBoundType1);

		private static final /*@NonNull*/ ExecutorFragment _UpperBoundTypeMember0__OclAny = new ExecutorFragment(Types._UpperBoundTypeMember0, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _UpperBoundTypeMember0__UpperBoundTypeMember0 = new ExecutorFragment(Types._UpperBoundTypeMember0, ToscaTables.Types._UpperBoundTypeMember0);

		private static final /*@NonNull*/ ExecutorFragment _UpperBoundTypeMember01__OclAny = new ExecutorFragment(Types._UpperBoundTypeMember01, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _UpperBoundTypeMember01__UpperBoundTypeMember01 = new ExecutorFragment(Types._UpperBoundTypeMember01, ToscaTables.Types._UpperBoundTypeMember01);

		private static final /*@NonNull*/ ExecutorFragment _UpperBoundTypeMember1__OclAny = new ExecutorFragment(Types._UpperBoundTypeMember1, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _UpperBoundTypeMember1__OclElement = new ExecutorFragment(Types._UpperBoundTypeMember1, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _UpperBoundTypeMember1__OclEnumeration = new ExecutorFragment(Types._UpperBoundTypeMember1, OCLstdlibTables.Types._OclEnumeration);
		private static final /*@NonNull*/ ExecutorFragment _UpperBoundTypeMember1__OclType = new ExecutorFragment(Types._UpperBoundTypeMember1, OCLstdlibTables.Types._OclType);
		private static final /*@NonNull*/ ExecutorFragment _UpperBoundTypeMember1__UpperBoundTypeMember1 = new ExecutorFragment(Types._UpperBoundTypeMember1, ToscaTables.Types._UpperBoundTypeMember1);

		private static final /*@NonNull*/ ExecutorFragment _UpperBoundTypeMember11__OclAny = new ExecutorFragment(Types._UpperBoundTypeMember11, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _UpperBoundTypeMember11__OclElement = new ExecutorFragment(Types._UpperBoundTypeMember11, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _UpperBoundTypeMember11__OclEnumeration = new ExecutorFragment(Types._UpperBoundTypeMember11, OCLstdlibTables.Types._OclEnumeration);
		private static final /*@NonNull*/ ExecutorFragment _UpperBoundTypeMember11__OclType = new ExecutorFragment(Types._UpperBoundTypeMember11, OCLstdlibTables.Types._OclType);
		private static final /*@NonNull*/ ExecutorFragment _UpperBoundTypeMember11__UpperBoundTypeMember11 = new ExecutorFragment(Types._UpperBoundTypeMember11, ToscaTables.Types._UpperBoundTypeMember11);

		private static final /*@NonNull*/ ExecutorFragment _UpperBoundTypeMember1Object__OclAny = new ExecutorFragment(Types._UpperBoundTypeMember1Object, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _UpperBoundTypeMember1Object__UpperBoundTypeMember1Object = new ExecutorFragment(Types._UpperBoundTypeMember1Object, ToscaTables.Types._UpperBoundTypeMember1Object);

		private static final /*@NonNull*/ ExecutorFragment _UpperBoundTypeMember1Object1__OclAny = new ExecutorFragment(Types._UpperBoundTypeMember1Object1, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _UpperBoundTypeMember1Object1__UpperBoundTypeMember1Object1 = new ExecutorFragment(Types._UpperBoundTypeMember1Object1, ToscaTables.Types._UpperBoundTypeMember1Object1);

		private static final /*@NonNull*/ ExecutorFragment _ValidImportTypes__OclAny = new ExecutorFragment(Types._ValidImportTypes, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _ValidImportTypes__OclElement = new ExecutorFragment(Types._ValidImportTypes, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _ValidImportTypes__OclEnumeration = new ExecutorFragment(Types._ValidImportTypes, OCLstdlibTables.Types._OclEnumeration);
		private static final /*@NonNull*/ ExecutorFragment _ValidImportTypes__OclType = new ExecutorFragment(Types._ValidImportTypes, OCLstdlibTables.Types._OclType);
		private static final /*@NonNull*/ ExecutorFragment _ValidImportTypes__ValidImportTypes = new ExecutorFragment(Types._ValidImportTypes, ToscaTables.Types._ValidImportTypes);

		private static final /*@NonNull*/ ExecutorFragment _ValidSourceType__OclAny = new ExecutorFragment(Types._ValidSourceType, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _ValidSourceType__OclElement = new ExecutorFragment(Types._ValidSourceType, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _ValidSourceType__ValidSourceType = new ExecutorFragment(Types._ValidSourceType, ToscaTables.Types._ValidSourceType);

		private static final /*@NonNull*/ ExecutorFragment _ValidTargetType__OclAny = new ExecutorFragment(Types._ValidTargetType, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _ValidTargetType__OclElement = new ExecutorFragment(Types._ValidTargetType, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _ValidTargetType__ValidTargetType = new ExecutorFragment(Types._ValidTargetType, ToscaTables.Types._ValidTargetType);

		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of ToscaTables::Fragments and all preceding sub-packages.
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
		 * Force initialization of the fields of ToscaTables::Parameters and all preceding sub-packages.
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
		 * Force initialization of the fields of ToscaTables::Operations and all preceding sub-packages.
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

		public static final /*@NonNull*/ ExecutorProperty _ArtifactReferencesType__artifactReference = new EcoreExecutorProperty(ToscaPackage.Literals.ARTIFACT_REFERENCES_TYPE__ARTIFACT_REFERENCE, Types._ArtifactReferencesType, 0);
		public static final /*@NonNull*/ ExecutorProperty _ArtifactReferencesType__TArtifactTemplate__artifactReferences = new ExecutorPropertyWithImplementation("TArtifactTemplate", Types._ArtifactReferencesType, 1, new EcoreLibraryOppositeProperty(ToscaPackage.Literals.TARTIFACT_TEMPLATE__ARTIFACT_REFERENCES));

		public static final /*@NonNull*/ ExecutorProperty _CapabilitiesType__capability = new EcoreExecutorProperty(ToscaPackage.Literals.CAPABILITIES_TYPE__CAPABILITY, Types._CapabilitiesType, 0);
		public static final /*@NonNull*/ ExecutorProperty _CapabilitiesType__TNodeTemplate__capabilities = new ExecutorPropertyWithImplementation("TNodeTemplate", Types._CapabilitiesType, 1, new EcoreLibraryOppositeProperty(ToscaPackage.Literals.TNODE_TEMPLATE__CAPABILITIES));

		public static final /*@NonNull*/ ExecutorProperty _CapabilitiesType1__capability = new EcoreExecutorProperty(ToscaPackage.Literals.CAPABILITIES_TYPE1__CAPABILITY, Types._CapabilitiesType1, 0);
		public static final /*@NonNull*/ ExecutorProperty _CapabilitiesType1__TGroupTemplate__capabilities = new ExecutorPropertyWithImplementation("TGroupTemplate", Types._CapabilitiesType1, 1, new EcoreLibraryOppositeProperty(ToscaPackage.Literals.TGROUP_TEMPLATE__CAPABILITIES));

		public static final /*@NonNull*/ ExecutorProperty _CapabilitiesType2__capability = new EcoreExecutorProperty(ToscaPackage.Literals.CAPABILITIES_TYPE2__CAPABILITY, Types._CapabilitiesType2, 0);
		public static final /*@NonNull*/ ExecutorProperty _CapabilitiesType2__TBoundaryDefinitions__capabilities = new ExecutorPropertyWithImplementation("TBoundaryDefinitions", Types._CapabilitiesType2, 1, new EcoreLibraryOppositeProperty(ToscaPackage.Literals.TBOUNDARY_DEFINITIONS__CAPABILITIES));

		public static final /*@NonNull*/ ExecutorProperty _CapabilityDefinitionsType__capabilityDefinition = new EcoreExecutorProperty(ToscaPackage.Literals.CAPABILITY_DEFINITIONS_TYPE__CAPABILITY_DEFINITION, Types._CapabilityDefinitionsType, 0);
		public static final /*@NonNull*/ ExecutorProperty _CapabilityDefinitionsType__TGroupType__capabilityDefinitions = new ExecutorPropertyWithImplementation("TGroupType", Types._CapabilityDefinitionsType, 1, new EcoreLibraryOppositeProperty(ToscaPackage.Literals.TGROUP_TYPE__CAPABILITY_DEFINITIONS));

		public static final /*@NonNull*/ ExecutorProperty _CapabilityDefinitionsType1__capabilityDefinition = new EcoreExecutorProperty(ToscaPackage.Literals.CAPABILITY_DEFINITIONS_TYPE1__CAPABILITY_DEFINITION, Types._CapabilityDefinitionsType1, 0);
		public static final /*@NonNull*/ ExecutorProperty _CapabilityDefinitionsType1__TNodeType__capabilityDefinitions = new ExecutorPropertyWithImplementation("TNodeType", Types._CapabilityDefinitionsType1, 1, new EcoreLibraryOppositeProperty(ToscaPackage.Literals.TNODE_TYPE__CAPABILITY_DEFINITIONS));

		public static final /*@NonNull*/ ExecutorProperty _ConstraintsType__constraint = new EcoreExecutorProperty(ToscaPackage.Literals.CONSTRAINTS_TYPE__CONSTRAINT, Types._ConstraintsType, 0);
		public static final /*@NonNull*/ ExecutorProperty _ConstraintsType__TCapabilityDefinition__constraints = new ExecutorPropertyWithImplementation("TCapabilityDefinition", Types._ConstraintsType, 1, new EcoreLibraryOppositeProperty(ToscaPackage.Literals.TCAPABILITY_DEFINITION__CONSTRAINTS));

		public static final /*@NonNull*/ ExecutorProperty _ConstraintsType1__constraint = new EcoreExecutorProperty(ToscaPackage.Literals.CONSTRAINTS_TYPE1__CONSTRAINT, Types._ConstraintsType1, 0);
		public static final /*@NonNull*/ ExecutorProperty _ConstraintsType1__TRequirementDefinition__constraints = new ExecutorPropertyWithImplementation("TRequirementDefinition", Types._ConstraintsType1, 1, new EcoreLibraryOppositeProperty(ToscaPackage.Literals.TREQUIREMENT_DEFINITION__CONSTRAINTS));

		public static final /*@NonNull*/ ExecutorProperty _DefinitionsType__DocumentRoot__definitions = new ExecutorPropertyWithImplementation("DocumentRoot", Types._DefinitionsType, 0, new EcoreLibraryOppositeProperty(ToscaPackage.Literals.DOCUMENT_ROOT__DEFINITIONS));

		public static final /*@NonNull*/ ExecutorProperty _DerivedFromType__nodeTypeImplementationRef = new EcoreExecutorProperty(ToscaPackage.Literals.DERIVED_FROM_TYPE__NODE_TYPE_IMPLEMENTATION_REF, Types._DerivedFromType, 0);
		public static final /*@NonNull*/ ExecutorProperty _DerivedFromType__TNodeTypeImplementation__derivedFrom = new ExecutorPropertyWithImplementation("TNodeTypeImplementation", Types._DerivedFromType, 1, new EcoreLibraryOppositeProperty(ToscaPackage.Literals.TNODE_TYPE_IMPLEMENTATION__DERIVED_FROM));

		public static final /*@NonNull*/ ExecutorProperty _DerivedFromType1__relationshipTypeImplementationRef = new EcoreExecutorProperty(ToscaPackage.Literals.DERIVED_FROM_TYPE1__RELATIONSHIP_TYPE_IMPLEMENTATION_REF, Types._DerivedFromType1, 0);
		public static final /*@NonNull*/ ExecutorProperty _DerivedFromType1__TRelationshipTypeImplementation__derivedFrom = new ExecutorPropertyWithImplementation("TRelationshipTypeImplementation", Types._DerivedFromType1, 1, new EcoreLibraryOppositeProperty(ToscaPackage.Literals.TRELATIONSHIP_TYPE_IMPLEMENTATION__DERIVED_FROM));

		public static final /*@NonNull*/ ExecutorProperty _DerivedFromType2__referencedEntityType = new EcoreExecutorProperty(ToscaPackage.Literals.DERIVED_FROM_TYPE2__REFERENCED_ENTITY_TYPE, Types._DerivedFromType2, 0);
		public static final /*@NonNull*/ ExecutorProperty _DerivedFromType2__typeRef = new EcoreExecutorProperty(ToscaPackage.Literals.DERIVED_FROM_TYPE2__TYPE_REF, Types._DerivedFromType2, 1);
		public static final /*@NonNull*/ ExecutorProperty _DerivedFromType2__TEntityType__derivedFrom = new ExecutorPropertyWithImplementation("TEntityType", Types._DerivedFromType2, 2, new EcoreLibraryOppositeProperty(ToscaPackage.Literals.TENTITY_TYPE__DERIVED_FROM));

		public static final /*@NonNull*/ ExecutorProperty _DocumentRoot__definitions = new EcoreExecutorProperty(ToscaPackage.Literals.DOCUMENT_ROOT__DEFINITIONS, Types._DocumentRoot, 0);
		public static final /*@NonNull*/ ExecutorProperty _DocumentRoot__documentation = new EcoreExecutorProperty(ToscaPackage.Literals.DOCUMENT_ROOT__DOCUMENTATION, Types._DocumentRoot, 1);
		public static final /*@NonNull*/ ExecutorProperty _DocumentRoot__mixed = new EcoreExecutorProperty(ToscaPackage.Literals.DOCUMENT_ROOT__MIXED, Types._DocumentRoot, 2);
		public static final /*@NonNull*/ ExecutorProperty _DocumentRoot__xMLNSPrefixMap = new EcoreExecutorProperty(ToscaPackage.Literals.DOCUMENT_ROOT__XMLNS_PREFIX_MAP, Types._DocumentRoot, 3);
		public static final /*@NonNull*/ ExecutorProperty _DocumentRoot__xSISchemaLocation = new EcoreExecutorProperty(ToscaPackage.Literals.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION, Types._DocumentRoot, 4);

		public static final /*@NonNull*/ ExecutorProperty _ExcludeType__pattern = new EcoreExecutorProperty(ToscaPackage.Literals.EXCLUDE_TYPE__PATTERN, Types._ExcludeType, 0);
		public static final /*@NonNull*/ ExecutorProperty _ExcludeType__TArtifactReference__exclude = new ExecutorPropertyWithImplementation("TArtifactReference", Types._ExcludeType, 1, new EcoreLibraryOppositeProperty(ToscaPackage.Literals.TARTIFACT_REFERENCE__EXCLUDE));

		public static final /*@NonNull*/ ExecutorProperty _ExtensionsType__extension = new EcoreExecutorProperty(ToscaPackage.Literals.EXTENSIONS_TYPE__EXTENSION, Types._ExtensionsType, 0);
		public static final /*@NonNull*/ ExecutorProperty _ExtensionsType__TDefinitions__extensions = new ExecutorPropertyWithImplementation("TDefinitions", Types._ExtensionsType, 1, new EcoreLibraryOppositeProperty(ToscaPackage.Literals.TDEFINITIONS__EXTENSIONS));

		public static final /*@NonNull*/ ExecutorProperty _ImplementationArtifactType__TImplementationArtifacts__implementationArtifact = new ExecutorPropertyWithImplementation("TImplementationArtifacts", Types._ImplementationArtifactType, 0, new EcoreLibraryOppositeProperty(ToscaPackage.Literals.TIMPLEMENTATION_ARTIFACTS__IMPLEMENTATION_ARTIFACT));

		public static final /*@NonNull*/ ExecutorProperty _IncludeType__pattern = new EcoreExecutorProperty(ToscaPackage.Literals.INCLUDE_TYPE__PATTERN, Types._IncludeType, 0);
		public static final /*@NonNull*/ ExecutorProperty _IncludeType__TArtifactReference__include = new ExecutorPropertyWithImplementation("TArtifactReference", Types._IncludeType, 1, new EcoreLibraryOppositeProperty(ToscaPackage.Literals.TARTIFACT_REFERENCE__INCLUDE));

		public static final /*@NonNull*/ ExecutorProperty _InputParametersType__inputParameter = new EcoreExecutorProperty(ToscaPackage.Literals.INPUT_PARAMETERS_TYPE__INPUT_PARAMETER, Types._InputParametersType, 0);
		public static final /*@NonNull*/ ExecutorProperty _InputParametersType__TPlan__inputParameters = new ExecutorPropertyWithImplementation("TPlan", Types._InputParametersType, 1, new EcoreLibraryOppositeProperty(ToscaPackage.Literals.TPLAN__INPUT_PARAMETERS));

		public static final /*@NonNull*/ ExecutorProperty _InputParametersType1__inputParameter = new EcoreExecutorProperty(ToscaPackage.Literals.INPUT_PARAMETERS_TYPE1__INPUT_PARAMETER, Types._InputParametersType1, 0);
		public static final /*@NonNull*/ ExecutorProperty _InputParametersType1__TOperation__inputParameters = new ExecutorPropertyWithImplementation("TOperation", Types._InputParametersType1, 1, new EcoreLibraryOppositeProperty(ToscaPackage.Literals.TOPERATION__INPUT_PARAMETERS));

		public static final /*@NonNull*/ ExecutorProperty _InstanceStateType__state = new EcoreExecutorProperty(ToscaPackage.Literals.INSTANCE_STATE_TYPE__STATE, Types._InstanceStateType, 0);
		public static final /*@NonNull*/ ExecutorProperty _InstanceStateType__TTopologyElementInstanceStates__instanceState = new ExecutorPropertyWithImplementation("TTopologyElementInstanceStates", Types._InstanceStateType, 1, new EcoreLibraryOppositeProperty(ToscaPackage.Literals.TTOPOLOGY_ELEMENT_INSTANCE_STATES__INSTANCE_STATE));

		public static final /*@NonNull*/ ExecutorProperty _InterfacesType__interface = new EcoreExecutorProperty(ToscaPackage.Literals.INTERFACES_TYPE__INTERFACE, Types._InterfacesType, 0);
		public static final /*@NonNull*/ ExecutorProperty _InterfacesType__TNodeType__interfaces = new ExecutorPropertyWithImplementation("TNodeType", Types._InterfacesType, 1, new EcoreLibraryOppositeProperty(ToscaPackage.Literals.TNODE_TYPE__INTERFACES));

		public static final /*@NonNull*/ ExecutorProperty _InterfacesType1__interface = new EcoreExecutorProperty(ToscaPackage.Literals.INTERFACES_TYPE1__INTERFACE, Types._InterfacesType1, 0);
		public static final /*@NonNull*/ ExecutorProperty _InterfacesType1__TGroupType__interfaces = new ExecutorPropertyWithImplementation("TGroupType", Types._InterfacesType1, 1, new EcoreLibraryOppositeProperty(ToscaPackage.Literals.TGROUP_TYPE__INTERFACES));

		public static final /*@NonNull*/ ExecutorProperty _InterfacesType2__interface = new EcoreExecutorProperty(ToscaPackage.Literals.INTERFACES_TYPE2__INTERFACE, Types._InterfacesType2, 0);
		public static final /*@NonNull*/ ExecutorProperty _InterfacesType2__TBoundaryDefinitions__interfaces = new ExecutorPropertyWithImplementation("TBoundaryDefinitions", Types._InterfacesType2, 1, new EcoreLibraryOppositeProperty(ToscaPackage.Literals.TBOUNDARY_DEFINITIONS__INTERFACES));

		public static final /*@NonNull*/ ExecutorProperty _NodeOperationType__interfaceName = new EcoreExecutorProperty(ToscaPackage.Literals.NODE_OPERATION_TYPE__INTERFACE_NAME, Types._NodeOperationType, 0);
		public static final /*@NonNull*/ ExecutorProperty _NodeOperationType__nodeRef = new EcoreExecutorProperty(ToscaPackage.Literals.NODE_OPERATION_TYPE__NODE_REF, Types._NodeOperationType, 1);
		public static final /*@NonNull*/ ExecutorProperty _NodeOperationType__operationName = new EcoreExecutorProperty(ToscaPackage.Literals.NODE_OPERATION_TYPE__OPERATION_NAME, Types._NodeOperationType, 2);
		public static final /*@NonNull*/ ExecutorProperty _NodeOperationType__TExportedOperation__nodeOperation = new ExecutorPropertyWithImplementation("TExportedOperation", Types._NodeOperationType, 3, new EcoreLibraryOppositeProperty(ToscaPackage.Literals.TEXPORTED_OPERATION__NODE_OPERATION));

		public static final /*@NonNull*/ ExecutorProperty _NodeTypeReferenceType__typeRef = new EcoreExecutorProperty(ToscaPackage.Literals.NODE_TYPE_REFERENCE_TYPE__TYPE_REF, Types._NodeTypeReferenceType, 0);
		public static final /*@NonNull*/ ExecutorProperty _NodeTypeReferenceType__TAppliesTo__nodeTypeReference = new ExecutorPropertyWithImplementation("TAppliesTo", Types._NodeTypeReferenceType, 1, new EcoreLibraryOppositeProperty(ToscaPackage.Literals.TAPPLIES_TO__NODE_TYPE_REFERENCE));

		public static final /*@NonNull*/ ExecutorProperty _OutputParametersType__outputParameter = new EcoreExecutorProperty(ToscaPackage.Literals.OUTPUT_PARAMETERS_TYPE__OUTPUT_PARAMETER, Types._OutputParametersType, 0);
		public static final /*@NonNull*/ ExecutorProperty _OutputParametersType__TPlan__outputParameters = new ExecutorPropertyWithImplementation("TPlan", Types._OutputParametersType, 1, new EcoreLibraryOppositeProperty(ToscaPackage.Literals.TPLAN__OUTPUT_PARAMETERS));

		public static final /*@NonNull*/ ExecutorProperty _OutputParametersType1__outputParameter = new EcoreExecutorProperty(ToscaPackage.Literals.OUTPUT_PARAMETERS_TYPE1__OUTPUT_PARAMETER, Types._OutputParametersType1, 0);
		public static final /*@NonNull*/ ExecutorProperty _OutputParametersType1__TOperation__outputParameters = new ExecutorPropertyWithImplementation("TOperation", Types._OutputParametersType1, 1, new EcoreLibraryOppositeProperty(ToscaPackage.Literals.TOPERATION__OUTPUT_PARAMETERS));

		public static final /*@NonNull*/ ExecutorProperty _PlanModelReferenceType__reference = new EcoreExecutorProperty(ToscaPackage.Literals.PLAN_MODEL_REFERENCE_TYPE__REFERENCE, Types._PlanModelReferenceType, 0);
		public static final /*@NonNull*/ ExecutorProperty _PlanModelReferenceType__TPlan__planModelReference = new ExecutorPropertyWithImplementation("TPlan", Types._PlanModelReferenceType, 1, new EcoreLibraryOppositeProperty(ToscaPackage.Literals.TPLAN__PLAN_MODEL_REFERENCE));

		public static final /*@NonNull*/ ExecutorProperty _PlanModelType__any = new EcoreExecutorProperty(ToscaPackage.Literals.PLAN_MODEL_TYPE__ANY, Types._PlanModelType, 0);
		public static final /*@NonNull*/ ExecutorProperty _PlanModelType__TPlan__planModel = new ExecutorPropertyWithImplementation("TPlan", Types._PlanModelType, 1, new EcoreLibraryOppositeProperty(ToscaPackage.Literals.TPLAN__PLAN_MODEL));

		public static final /*@NonNull*/ ExecutorProperty _PlanType__planRef = new EcoreExecutorProperty(ToscaPackage.Literals.PLAN_TYPE__PLAN_REF, Types._PlanType, 0);
		public static final /*@NonNull*/ ExecutorProperty _PlanType__TExportedOperation__plan = new ExecutorPropertyWithImplementation("TExportedOperation", Types._PlanType, 1, new EcoreLibraryOppositeProperty(ToscaPackage.Literals.TEXPORTED_OPERATION__PLAN));

		public static final /*@NonNull*/ ExecutorProperty _PoliciesType__policy = new EcoreExecutorProperty(ToscaPackage.Literals.POLICIES_TYPE__POLICY, Types._PoliciesType, 0);
		public static final /*@NonNull*/ ExecutorProperty _PoliciesType__TNodeTemplate__policies = new ExecutorPropertyWithImplementation("TNodeTemplate", Types._PoliciesType, 1, new EcoreLibraryOppositeProperty(ToscaPackage.Literals.TNODE_TEMPLATE__POLICIES));

		public static final /*@NonNull*/ ExecutorProperty _PoliciesType1__policy = new EcoreExecutorProperty(ToscaPackage.Literals.POLICIES_TYPE1__POLICY, Types._PoliciesType1, 0);
		public static final /*@NonNull*/ ExecutorProperty _PoliciesType1__TGroupTemplate__policies = new ExecutorPropertyWithImplementation("TGroupTemplate", Types._PoliciesType1, 1, new EcoreLibraryOppositeProperty(ToscaPackage.Literals.TGROUP_TEMPLATE__POLICIES));

		public static final /*@NonNull*/ ExecutorProperty _PoliciesType2__policy = new EcoreExecutorProperty(ToscaPackage.Literals.POLICIES_TYPE2__POLICY, Types._PoliciesType2, 0);
		public static final /*@NonNull*/ ExecutorProperty _PoliciesType2__TBoundaryDefinitions__policies = new ExecutorPropertyWithImplementation("TBoundaryDefinitions", Types._PoliciesType2, 1, new EcoreLibraryOppositeProperty(ToscaPackage.Literals.TBOUNDARY_DEFINITIONS__POLICIES));

		public static final /*@NonNull*/ ExecutorProperty _PropertiesDefinitionType__element = new EcoreExecutorProperty(ToscaPackage.Literals.PROPERTIES_DEFINITION_TYPE__ELEMENT, Types._PropertiesDefinitionType, 0);
		public static final /*@NonNull*/ ExecutorProperty _PropertiesDefinitionType__elementRef = new EcoreExecutorProperty(ToscaPackage.Literals.PROPERTIES_DEFINITION_TYPE__ELEMENT_REF, Types._PropertiesDefinitionType, 1);
		public static final /*@NonNull*/ ExecutorProperty _PropertiesDefinitionType__type = new EcoreExecutorProperty(ToscaPackage.Literals.PROPERTIES_DEFINITION_TYPE__TYPE, Types._PropertiesDefinitionType, 2);
		public static final /*@NonNull*/ ExecutorProperty _PropertiesDefinitionType__TEntityType__propertiesDefinition = new ExecutorPropertyWithImplementation("TEntityType", Types._PropertiesDefinitionType, 3, new EcoreLibraryOppositeProperty(ToscaPackage.Literals.TENTITY_TYPE__PROPERTIES_DEFINITION));

		public static final /*@NonNull*/ ExecutorProperty _PropertiesType__any = new EcoreExecutorProperty(ToscaPackage.Literals.PROPERTIES_TYPE__ANY, Types._PropertiesType, 0);
		public static final /*@NonNull*/ ExecutorProperty _PropertiesType__propertiesElement = new EcoreExecutorProperty(ToscaPackage.Literals.PROPERTIES_TYPE__PROPERTIES_ELEMENT, Types._PropertiesType, 1);
		public static final /*@NonNull*/ ExecutorProperty _PropertiesType__TEntityTemplate__properties = new ExecutorPropertyWithImplementation("TEntityTemplate", Types._PropertiesType, 2, new EcoreLibraryOppositeProperty(ToscaPackage.Literals.TENTITY_TEMPLATE__PROPERTIES));

		public static final /*@NonNull*/ ExecutorProperty _PropertiesType1__any = new EcoreExecutorProperty(ToscaPackage.Literals.PROPERTIES_TYPE1__ANY, Types._PropertiesType1, 0);
		public static final /*@NonNull*/ ExecutorProperty _PropertiesType1__propertiesElement = new EcoreExecutorProperty(ToscaPackage.Literals.PROPERTIES_TYPE1__PROPERTIES_ELEMENT, Types._PropertiesType1, 1);
		public static final /*@NonNull*/ ExecutorProperty _PropertiesType1__propertyMappings = new EcoreExecutorProperty(ToscaPackage.Literals.PROPERTIES_TYPE1__PROPERTY_MAPPINGS, Types._PropertiesType1, 2);
		public static final /*@NonNull*/ ExecutorProperty _PropertiesType1__TBoundaryDefinitions__properties = new ExecutorPropertyWithImplementation("TBoundaryDefinitions", Types._PropertiesType1, 3, new EcoreLibraryOppositeProperty(ToscaPackage.Literals.TBOUNDARY_DEFINITIONS__PROPERTIES));

		public static final /*@NonNull*/ ExecutorProperty _PropertyConstraintsType__propertyConstraint = new EcoreExecutorProperty(ToscaPackage.Literals.PROPERTY_CONSTRAINTS_TYPE__PROPERTY_CONSTRAINT, Types._PropertyConstraintsType, 0);
		public static final /*@NonNull*/ ExecutorProperty _PropertyConstraintsType__TEntityTemplate__propertyConstraints = new ExecutorPropertyWithImplementation("TEntityTemplate", Types._PropertyConstraintsType, 1, new EcoreLibraryOppositeProperty(ToscaPackage.Literals.TENTITY_TEMPLATE__PROPERTY_CONSTRAINTS));

		public static final /*@NonNull*/ ExecutorProperty _PropertyConstraintsType1__propertyConstraint = new EcoreExecutorProperty(ToscaPackage.Literals.PROPERTY_CONSTRAINTS_TYPE1__PROPERTY_CONSTRAINT, Types._PropertyConstraintsType1, 0);
		public static final /*@NonNull*/ ExecutorProperty _PropertyConstraintsType1__TBoundaryDefinitions__propertyConstraints = new ExecutorPropertyWithImplementation("TBoundaryDefinitions", Types._PropertyConstraintsType1, 1, new EcoreLibraryOppositeProperty(ToscaPackage.Literals.TBOUNDARY_DEFINITIONS__PROPERTY_CONSTRAINTS));

		public static final /*@NonNull*/ ExecutorProperty _PropertyMappingsType__propertyMapping = new EcoreExecutorProperty(ToscaPackage.Literals.PROPERTY_MAPPINGS_TYPE__PROPERTY_MAPPING, Types._PropertyMappingsType, 0);
		public static final /*@NonNull*/ ExecutorProperty _PropertyMappingsType__PropertiesType1__propertyMappings = new ExecutorPropertyWithImplementation("PropertiesType1", Types._PropertyMappingsType, 1, new EcoreLibraryOppositeProperty(ToscaPackage.Literals.PROPERTIES_TYPE1__PROPERTY_MAPPINGS));

		public static final /*@NonNull*/ ExecutorProperty _RelationshipConstraintType__any = new EcoreExecutorProperty(ToscaPackage.Literals.RELATIONSHIP_CONSTRAINT_TYPE__ANY, Types._RelationshipConstraintType, 0);
		public static final /*@NonNull*/ ExecutorProperty _RelationshipConstraintType__constraintType = new EcoreExecutorProperty(ToscaPackage.Literals.RELATIONSHIP_CONSTRAINT_TYPE__CONSTRAINT_TYPE, Types._RelationshipConstraintType, 1);
		public static final /*@NonNull*/ ExecutorProperty _RelationshipConstraintType__RelationshipConstraintsType__relationshipConstraint = new ExecutorPropertyWithImplementation("RelationshipConstraintsType", Types._RelationshipConstraintType, 2, new EcoreLibraryOppositeProperty(ToscaPackage.Literals.RELATIONSHIP_CONSTRAINTS_TYPE__RELATIONSHIP_CONSTRAINT));

		public static final /*@NonNull*/ ExecutorProperty _RelationshipConstraintsType__relationshipConstraint = new EcoreExecutorProperty(ToscaPackage.Literals.RELATIONSHIP_CONSTRAINTS_TYPE__RELATIONSHIP_CONSTRAINT, Types._RelationshipConstraintsType, 0);
		public static final /*@NonNull*/ ExecutorProperty _RelationshipConstraintsType__TRelationshipTemplate__relationshipConstraints = new ExecutorPropertyWithImplementation("TRelationshipTemplate", Types._RelationshipConstraintsType, 1, new EcoreLibraryOppositeProperty(ToscaPackage.Literals.TRELATIONSHIP_TEMPLATE__RELATIONSHIP_CONSTRAINTS));

		public static final /*@NonNull*/ ExecutorProperty _RelationshipOperationType__interfaceName = new EcoreExecutorProperty(ToscaPackage.Literals.RELATIONSHIP_OPERATION_TYPE__INTERFACE_NAME, Types._RelationshipOperationType, 0);
		public static final /*@NonNull*/ ExecutorProperty _RelationshipOperationType__operationName = new EcoreExecutorProperty(ToscaPackage.Literals.RELATIONSHIP_OPERATION_TYPE__OPERATION_NAME, Types._RelationshipOperationType, 1);
		public static final /*@NonNull*/ ExecutorProperty _RelationshipOperationType__relationshipRef = new EcoreExecutorProperty(ToscaPackage.Literals.RELATIONSHIP_OPERATION_TYPE__RELATIONSHIP_REF, Types._RelationshipOperationType, 2);
		public static final /*@NonNull*/ ExecutorProperty _RelationshipOperationType__TExportedOperation__relationshipOperation = new ExecutorPropertyWithImplementation("TExportedOperation", Types._RelationshipOperationType, 3, new EcoreLibraryOppositeProperty(ToscaPackage.Literals.TEXPORTED_OPERATION__RELATIONSHIP_OPERATION));

		public static final /*@NonNull*/ ExecutorProperty _RequirementDefinitionsType__requirementDefinition = new EcoreExecutorProperty(ToscaPackage.Literals.REQUIREMENT_DEFINITIONS_TYPE__REQUIREMENT_DEFINITION, Types._RequirementDefinitionsType, 0);
		public static final /*@NonNull*/ ExecutorProperty _RequirementDefinitionsType__TGroupType__requirementDefinitions = new ExecutorPropertyWithImplementation("TGroupType", Types._RequirementDefinitionsType, 1, new EcoreLibraryOppositeProperty(ToscaPackage.Literals.TGROUP_TYPE__REQUIREMENT_DEFINITIONS));

		public static final /*@NonNull*/ ExecutorProperty _RequirementDefinitionsType1__requirementDefinition = new EcoreExecutorProperty(ToscaPackage.Literals.REQUIREMENT_DEFINITIONS_TYPE1__REQUIREMENT_DEFINITION, Types._RequirementDefinitionsType1, 0);
		public static final /*@NonNull*/ ExecutorProperty _RequirementDefinitionsType1__TNodeType__requirementDefinitions = new ExecutorPropertyWithImplementation("TNodeType", Types._RequirementDefinitionsType1, 1, new EcoreLibraryOppositeProperty(ToscaPackage.Literals.TNODE_TYPE__REQUIREMENT_DEFINITIONS));

		public static final /*@NonNull*/ ExecutorProperty _RequirementsType__requirement = new EcoreExecutorProperty(ToscaPackage.Literals.REQUIREMENTS_TYPE__REQUIREMENT, Types._RequirementsType, 0);
		public static final /*@NonNull*/ ExecutorProperty _RequirementsType__TNodeTemplate__requirements = new ExecutorPropertyWithImplementation("TNodeTemplate", Types._RequirementsType, 1, new EcoreLibraryOppositeProperty(ToscaPackage.Literals.TNODE_TEMPLATE__REQUIREMENTS));

		public static final /*@NonNull*/ ExecutorProperty _RequirementsType1__requirement = new EcoreExecutorProperty(ToscaPackage.Literals.REQUIREMENTS_TYPE1__REQUIREMENT, Types._RequirementsType1, 0);
		public static final /*@NonNull*/ ExecutorProperty _RequirementsType1__TGroupTemplate__requirements = new ExecutorPropertyWithImplementation("TGroupTemplate", Types._RequirementsType1, 1, new EcoreLibraryOppositeProperty(ToscaPackage.Literals.TGROUP_TEMPLATE__REQUIREMENTS));

		public static final /*@NonNull*/ ExecutorProperty _RequirementsType2__requirement = new EcoreExecutorProperty(ToscaPackage.Literals.REQUIREMENTS_TYPE2__REQUIREMENT, Types._RequirementsType2, 0);
		public static final /*@NonNull*/ ExecutorProperty _RequirementsType2__TBoundaryDefinitions__requirements = new ExecutorPropertyWithImplementation("TBoundaryDefinitions", Types._RequirementsType2, 1, new EcoreLibraryOppositeProperty(ToscaPackage.Literals.TBOUNDARY_DEFINITIONS__REQUIREMENTS));

		public static final /*@NonNull*/ ExecutorProperty _SourceElementType__ref = new EcoreExecutorProperty(ToscaPackage.Literals.SOURCE_ELEMENT_TYPE__REF, Types._SourceElementType, 0);
		public static final /*@NonNull*/ ExecutorProperty _SourceElementType__TRelationshipTemplate__sourceElement = new ExecutorPropertyWithImplementation("TRelationshipTemplate", Types._SourceElementType, 1, new EcoreLibraryOppositeProperty(ToscaPackage.Literals.TRELATIONSHIP_TEMPLATE__SOURCE_ELEMENT));

		public static final /*@NonNull*/ ExecutorProperty _SourceInterfacesType__interface = new EcoreExecutorProperty(ToscaPackage.Literals.SOURCE_INTERFACES_TYPE__INTERFACE, Types._SourceInterfacesType, 0);
		public static final /*@NonNull*/ ExecutorProperty _SourceInterfacesType__TRelationshipType__sourceInterfaces = new ExecutorPropertyWithImplementation("TRelationshipType", Types._SourceInterfacesType, 1, new EcoreLibraryOppositeProperty(ToscaPackage.Literals.TRELATIONSHIP_TYPE__SOURCE_INTERFACES));

		public static final /*@NonNull*/ ExecutorProperty _TAppliesTo__nodeTypeReference = new EcoreExecutorProperty(ToscaPackage.Literals.TAPPLIES_TO__NODE_TYPE_REFERENCE, Types._TAppliesTo, 0);
		public static final /*@NonNull*/ ExecutorProperty _TAppliesTo__TPolicyType__appliesTo = new ExecutorPropertyWithImplementation("TPolicyType", Types._TAppliesTo, 1, new EcoreLibraryOppositeProperty(ToscaPackage.Literals.TPOLICY_TYPE__APPLIES_TO));

		public static final /*@NonNull*/ ExecutorProperty _TArtifactReference__exclude = new EcoreExecutorProperty(ToscaPackage.Literals.TARTIFACT_REFERENCE__EXCLUDE, Types._TArtifactReference, 0);
		public static final /*@NonNull*/ ExecutorProperty _TArtifactReference__group = new EcoreExecutorProperty(ToscaPackage.Literals.TARTIFACT_REFERENCE__GROUP, Types._TArtifactReference, 1);
		public static final /*@NonNull*/ ExecutorProperty _TArtifactReference__include = new EcoreExecutorProperty(ToscaPackage.Literals.TARTIFACT_REFERENCE__INCLUDE, Types._TArtifactReference, 2);
		public static final /*@NonNull*/ ExecutorProperty _TArtifactReference__reference = new EcoreExecutorProperty(ToscaPackage.Literals.TARTIFACT_REFERENCE__REFERENCE, Types._TArtifactReference, 3);
		public static final /*@NonNull*/ ExecutorProperty _TArtifactReference__ArtifactReferencesType__artifactReference = new ExecutorPropertyWithImplementation("ArtifactReferencesType", Types._TArtifactReference, 4, new EcoreLibraryOppositeProperty(ToscaPackage.Literals.ARTIFACT_REFERENCES_TYPE__ARTIFACT_REFERENCE));

		public static final /*@NonNull*/ ExecutorProperty _TArtifactTemplate__artifactReferences = new EcoreExecutorProperty(ToscaPackage.Literals.TARTIFACT_TEMPLATE__ARTIFACT_REFERENCES, Types._TArtifactTemplate, 0);
		public static final /*@NonNull*/ ExecutorProperty _TArtifactTemplate__name = new EcoreExecutorProperty(ToscaPackage.Literals.TARTIFACT_TEMPLATE__NAME, Types._TArtifactTemplate, 1);
		public static final /*@NonNull*/ ExecutorProperty _TArtifactTemplate__TDefinitions__artifactTemplate = new ExecutorPropertyWithImplementation("TDefinitions", Types._TArtifactTemplate, 2, new EcoreLibraryOppositeProperty(ToscaPackage.Literals.TDEFINITIONS__ARTIFACT_TEMPLATE));

		public static final /*@NonNull*/ ExecutorProperty _TArtifactType__TDefinitions__artifactType = new ExecutorPropertyWithImplementation("TDefinitions", Types._TArtifactType, 0, new EcoreLibraryOppositeProperty(ToscaPackage.Literals.TDEFINITIONS__ARTIFACT_TYPE));

		public static final /*@NonNull*/ ExecutorProperty _TBoundaryDefinitions__capabilities = new EcoreExecutorProperty(ToscaPackage.Literals.TBOUNDARY_DEFINITIONS__CAPABILITIES, Types._TBoundaryDefinitions, 0);
		public static final /*@NonNull*/ ExecutorProperty _TBoundaryDefinitions__interfaces = new EcoreExecutorProperty(ToscaPackage.Literals.TBOUNDARY_DEFINITIONS__INTERFACES, Types._TBoundaryDefinitions, 1);
		public static final /*@NonNull*/ ExecutorProperty _TBoundaryDefinitions__policies = new EcoreExecutorProperty(ToscaPackage.Literals.TBOUNDARY_DEFINITIONS__POLICIES, Types._TBoundaryDefinitions, 2);
		public static final /*@NonNull*/ ExecutorProperty _TBoundaryDefinitions__properties = new EcoreExecutorProperty(ToscaPackage.Literals.TBOUNDARY_DEFINITIONS__PROPERTIES, Types._TBoundaryDefinitions, 3);
		public static final /*@NonNull*/ ExecutorProperty _TBoundaryDefinitions__propertyConstraints = new EcoreExecutorProperty(ToscaPackage.Literals.TBOUNDARY_DEFINITIONS__PROPERTY_CONSTRAINTS, Types._TBoundaryDefinitions, 4);
		public static final /*@NonNull*/ ExecutorProperty _TBoundaryDefinitions__requirements = new EcoreExecutorProperty(ToscaPackage.Literals.TBOUNDARY_DEFINITIONS__REQUIREMENTS, Types._TBoundaryDefinitions, 5);
		public static final /*@NonNull*/ ExecutorProperty _TBoundaryDefinitions__TServiceTemplate__boundaryDefinitions = new ExecutorPropertyWithImplementation("TServiceTemplate", Types._TBoundaryDefinitions, 6, new EcoreLibraryOppositeProperty(ToscaPackage.Literals.TSERVICE_TEMPLATE__BOUNDARY_DEFINITIONS));

		public static final /*@NonNull*/ ExecutorProperty _TCapability__name = new EcoreExecutorProperty(ToscaPackage.Literals.TCAPABILITY__NAME, Types._TCapability, 0);
		public static final /*@NonNull*/ ExecutorProperty _TCapability__CapabilitiesType__capability = new ExecutorPropertyWithImplementation("CapabilitiesType", Types._TCapability, 1, new EcoreLibraryOppositeProperty(ToscaPackage.Literals.CAPABILITIES_TYPE__CAPABILITY));
		public static final /*@NonNull*/ ExecutorProperty _TCapability__CapabilitiesType1__capability = new ExecutorPropertyWithImplementation("CapabilitiesType1", Types._TCapability, 2, new EcoreLibraryOppositeProperty(ToscaPackage.Literals.CAPABILITIES_TYPE1__CAPABILITY));
		public static final /*@NonNull*/ ExecutorProperty _TCapability__TCapabilityRef__ref = new ExecutorPropertyWithImplementation("TCapabilityRef", Types._TCapability, 3, new EcoreLibraryOppositeProperty(ToscaPackage.Literals.TCAPABILITY_REF__REF));
		public static final /*@NonNull*/ ExecutorProperty _TCapability__TargetElementType__ref = new ExecutorPropertyWithImplementation("TargetElementType", Types._TCapability, 4, new EcoreLibraryOppositeProperty(ToscaPackage.Literals.TARGET_ELEMENT_TYPE__REF));

		public static final /*@NonNull*/ ExecutorProperty _TCapabilityDefinition__capabilityType = new EcoreExecutorProperty(ToscaPackage.Literals.TCAPABILITY_DEFINITION__CAPABILITY_TYPE, Types._TCapabilityDefinition, 0);
		public static final /*@NonNull*/ ExecutorProperty _TCapabilityDefinition__capabilityTypeRef = new EcoreExecutorProperty(ToscaPackage.Literals.TCAPABILITY_DEFINITION__CAPABILITY_TYPE_REF, Types._TCapabilityDefinition, 1);
		public static final /*@NonNull*/ ExecutorProperty _TCapabilityDefinition__constraints = new EcoreExecutorProperty(ToscaPackage.Literals.TCAPABILITY_DEFINITION__CONSTRAINTS, Types._TCapabilityDefinition, 2);
		public static final /*@NonNull*/ ExecutorProperty _TCapabilityDefinition__lowerBound = new EcoreExecutorProperty(ToscaPackage.Literals.TCAPABILITY_DEFINITION__LOWER_BOUND, Types._TCapabilityDefinition, 3);
		public static final /*@NonNull*/ ExecutorProperty _TCapabilityDefinition__name = new EcoreExecutorProperty(ToscaPackage.Literals.TCAPABILITY_DEFINITION__NAME, Types._TCapabilityDefinition, 4);
		public static final /*@NonNull*/ ExecutorProperty _TCapabilityDefinition__upperBound = new EcoreExecutorProperty(ToscaPackage.Literals.TCAPABILITY_DEFINITION__UPPER_BOUND, Types._TCapabilityDefinition, 5);
		public static final /*@NonNull*/ ExecutorProperty _TCapabilityDefinition__CapabilityDefinitionsType__capabilityDefinition = new ExecutorPropertyWithImplementation("CapabilityDefinitionsType", Types._TCapabilityDefinition, 6, new EcoreLibraryOppositeProperty(ToscaPackage.Literals.CAPABILITY_DEFINITIONS_TYPE__CAPABILITY_DEFINITION));
		public static final /*@NonNull*/ ExecutorProperty _TCapabilityDefinition__CapabilityDefinitionsType1__capabilityDefinition = new ExecutorPropertyWithImplementation("CapabilityDefinitionsType1", Types._TCapabilityDefinition, 7, new EcoreLibraryOppositeProperty(ToscaPackage.Literals.CAPABILITY_DEFINITIONS_TYPE1__CAPABILITY_DEFINITION));

		public static final /*@NonNull*/ ExecutorProperty _TCapabilityRef__name = new EcoreExecutorProperty(ToscaPackage.Literals.TCAPABILITY_REF__NAME, Types._TCapabilityRef, 0);
		public static final /*@NonNull*/ ExecutorProperty _TCapabilityRef__ref = new EcoreExecutorProperty(ToscaPackage.Literals.TCAPABILITY_REF__REF, Types._TCapabilityRef, 1);
		public static final /*@NonNull*/ ExecutorProperty _TCapabilityRef__CapabilitiesType2__capability = new ExecutorPropertyWithImplementation("CapabilitiesType2", Types._TCapabilityRef, 2, new EcoreLibraryOppositeProperty(ToscaPackage.Literals.CAPABILITIES_TYPE2__CAPABILITY));

		public static final /*@NonNull*/ ExecutorProperty _TCapabilityType__TCapabilityDefinition__capabilityTypeRef = new ExecutorPropertyWithImplementation("TCapabilityDefinition", Types._TCapabilityType, 0, new EcoreLibraryOppositeProperty(ToscaPackage.Literals.TCAPABILITY_DEFINITION__CAPABILITY_TYPE_REF));
		public static final /*@NonNull*/ ExecutorProperty _TCapabilityType__TDefinitions__capabilityType = new ExecutorPropertyWithImplementation("TDefinitions", Types._TCapabilityType, 1, new EcoreLibraryOppositeProperty(ToscaPackage.Literals.TDEFINITIONS__CAPABILITY_TYPE));
		public static final /*@NonNull*/ ExecutorProperty _TCapabilityType__TRequirementType__requiredCapabilityTypeRef = new ExecutorPropertyWithImplementation("TRequirementType", Types._TCapabilityType, 2, new EcoreLibraryOppositeProperty(ToscaPackage.Literals.TREQUIREMENT_TYPE__REQUIRED_CAPABILITY_TYPE_REF));

		public static final /*@NonNull*/ ExecutorProperty _TCondition__any = new EcoreExecutorProperty(ToscaPackage.Literals.TCONDITION__ANY, Types._TCondition, 0);
		public static final /*@NonNull*/ ExecutorProperty _TCondition__expressionLanguage = new EcoreExecutorProperty(ToscaPackage.Literals.TCONDITION__EXPRESSION_LANGUAGE, Types._TCondition, 1);
		public static final /*@NonNull*/ ExecutorProperty _TCondition__TPlan__precondition = new ExecutorPropertyWithImplementation("TPlan", Types._TCondition, 2, new EcoreLibraryOppositeProperty(ToscaPackage.Literals.TPLAN__PRECONDITION));

		public static final /*@NonNull*/ ExecutorProperty _TConstraint__any = new EcoreExecutorProperty(ToscaPackage.Literals.TCONSTRAINT__ANY, Types._TConstraint, 0);
		public static final /*@NonNull*/ ExecutorProperty _TConstraint__constraintType = new EcoreExecutorProperty(ToscaPackage.Literals.TCONSTRAINT__CONSTRAINT_TYPE, Types._TConstraint, 1);
		public static final /*@NonNull*/ ExecutorProperty _TConstraint__ConstraintsType__constraint = new ExecutorPropertyWithImplementation("ConstraintsType", Types._TConstraint, 2, new EcoreLibraryOppositeProperty(ToscaPackage.Literals.CONSTRAINTS_TYPE__CONSTRAINT));
		public static final /*@NonNull*/ ExecutorProperty _TConstraint__ConstraintsType1__constraint = new ExecutorPropertyWithImplementation("ConstraintsType1", Types._TConstraint, 3, new EcoreLibraryOppositeProperty(ToscaPackage.Literals.CONSTRAINTS_TYPE1__CONSTRAINT));

		public static final /*@NonNull*/ ExecutorProperty _TDefinitions__artifactTemplate = new EcoreExecutorProperty(ToscaPackage.Literals.TDEFINITIONS__ARTIFACT_TEMPLATE, Types._TDefinitions, 0);
		public static final /*@NonNull*/ ExecutorProperty _TDefinitions__artifactType = new EcoreExecutorProperty(ToscaPackage.Literals.TDEFINITIONS__ARTIFACT_TYPE, Types._TDefinitions, 1);
		public static final /*@NonNull*/ ExecutorProperty _TDefinitions__capabilityType = new EcoreExecutorProperty(ToscaPackage.Literals.TDEFINITIONS__CAPABILITY_TYPE, Types._TDefinitions, 2);
		public static final /*@NonNull*/ ExecutorProperty _TDefinitions__extensions = new EcoreExecutorProperty(ToscaPackage.Literals.TDEFINITIONS__EXTENSIONS, Types._TDefinitions, 3);
		public static final /*@NonNull*/ ExecutorProperty _TDefinitions__group = new EcoreExecutorProperty(ToscaPackage.Literals.TDEFINITIONS__GROUP, Types._TDefinitions, 4);
		public static final /*@NonNull*/ ExecutorProperty _TDefinitions__groupType = new EcoreExecutorProperty(ToscaPackage.Literals.TDEFINITIONS__GROUP_TYPE, Types._TDefinitions, 5);
		public static final /*@NonNull*/ ExecutorProperty _TDefinitions__id = new EcoreExecutorProperty(ToscaPackage.Literals.TDEFINITIONS__ID, Types._TDefinitions, 6);
		public static final /*@NonNull*/ ExecutorProperty _TDefinitions__import = new EcoreExecutorProperty(ToscaPackage.Literals.TDEFINITIONS__IMPORT, Types._TDefinitions, 7);
		public static final /*@NonNull*/ ExecutorProperty _TDefinitions__name = new EcoreExecutorProperty(ToscaPackage.Literals.TDEFINITIONS__NAME, Types._TDefinitions, 8);
		public static final /*@NonNull*/ ExecutorProperty _TDefinitions__nodeType = new EcoreExecutorProperty(ToscaPackage.Literals.TDEFINITIONS__NODE_TYPE, Types._TDefinitions, 9);
		public static final /*@NonNull*/ ExecutorProperty _TDefinitions__nodeTypeImplementation = new EcoreExecutorProperty(ToscaPackage.Literals.TDEFINITIONS__NODE_TYPE_IMPLEMENTATION, Types._TDefinitions, 10);
		public static final /*@NonNull*/ ExecutorProperty _TDefinitions__policyTemplate = new EcoreExecutorProperty(ToscaPackage.Literals.TDEFINITIONS__POLICY_TEMPLATE, Types._TDefinitions, 11);
		public static final /*@NonNull*/ ExecutorProperty _TDefinitions__policyType = new EcoreExecutorProperty(ToscaPackage.Literals.TDEFINITIONS__POLICY_TYPE, Types._TDefinitions, 12);
		public static final /*@NonNull*/ ExecutorProperty _TDefinitions__relationshipType = new EcoreExecutorProperty(ToscaPackage.Literals.TDEFINITIONS__RELATIONSHIP_TYPE, Types._TDefinitions, 13);
		public static final /*@NonNull*/ ExecutorProperty _TDefinitions__relationshipTypeImplementation = new EcoreExecutorProperty(ToscaPackage.Literals.TDEFINITIONS__RELATIONSHIP_TYPE_IMPLEMENTATION, Types._TDefinitions, 14);
		public static final /*@NonNull*/ ExecutorProperty _TDefinitions__requirementType = new EcoreExecutorProperty(ToscaPackage.Literals.TDEFINITIONS__REQUIREMENT_TYPE, Types._TDefinitions, 15);
		public static final /*@NonNull*/ ExecutorProperty _TDefinitions__serviceTemplate = new EcoreExecutorProperty(ToscaPackage.Literals.TDEFINITIONS__SERVICE_TEMPLATE, Types._TDefinitions, 16);
		public static final /*@NonNull*/ ExecutorProperty _TDefinitions__targetNamespace = new EcoreExecutorProperty(ToscaPackage.Literals.TDEFINITIONS__TARGET_NAMESPACE, Types._TDefinitions, 17);
		public static final /*@NonNull*/ ExecutorProperty _TDefinitions__types = new EcoreExecutorProperty(ToscaPackage.Literals.TDEFINITIONS__TYPES, Types._TDefinitions, 18);

		public static final /*@NonNull*/ ExecutorProperty _TDeploymentArtifact__artifactRef = new EcoreExecutorProperty(ToscaPackage.Literals.TDEPLOYMENT_ARTIFACT__ARTIFACT_REF, Types._TDeploymentArtifact, 0);
		public static final /*@NonNull*/ ExecutorProperty _TDeploymentArtifact__artifactType = new EcoreExecutorProperty(ToscaPackage.Literals.TDEPLOYMENT_ARTIFACT__ARTIFACT_TYPE, Types._TDeploymentArtifact, 1);
		public static final /*@NonNull*/ ExecutorProperty _TDeploymentArtifact__name = new EcoreExecutorProperty(ToscaPackage.Literals.TDEPLOYMENT_ARTIFACT__NAME, Types._TDeploymentArtifact, 2);
		public static final /*@NonNull*/ ExecutorProperty _TDeploymentArtifact__TDeploymentArtifacts__deploymentArtifact = new ExecutorPropertyWithImplementation("TDeploymentArtifacts", Types._TDeploymentArtifact, 3, new EcoreLibraryOppositeProperty(ToscaPackage.Literals.TDEPLOYMENT_ARTIFACTS__DEPLOYMENT_ARTIFACT));

		public static final /*@NonNull*/ ExecutorProperty _TDeploymentArtifacts__deploymentArtifact = new EcoreExecutorProperty(ToscaPackage.Literals.TDEPLOYMENT_ARTIFACTS__DEPLOYMENT_ARTIFACT, Types._TDeploymentArtifacts, 0);
		public static final /*@NonNull*/ ExecutorProperty _TDeploymentArtifacts__TGroupTemplate__deploymentArtifacts = new ExecutorPropertyWithImplementation("TGroupTemplate", Types._TDeploymentArtifacts, 1, new EcoreLibraryOppositeProperty(ToscaPackage.Literals.TGROUP_TEMPLATE__DEPLOYMENT_ARTIFACTS));
		public static final /*@NonNull*/ ExecutorProperty _TDeploymentArtifacts__TNodeTemplate__deploymentArtifacts = new ExecutorPropertyWithImplementation("TNodeTemplate", Types._TDeploymentArtifacts, 2, new EcoreLibraryOppositeProperty(ToscaPackage.Literals.TNODE_TEMPLATE__DEPLOYMENT_ARTIFACTS));
		public static final /*@NonNull*/ ExecutorProperty _TDeploymentArtifacts__TNodeTypeImplementation__deploymentArtifacts = new ExecutorPropertyWithImplementation("TNodeTypeImplementation", Types._TDeploymentArtifacts, 3, new EcoreLibraryOppositeProperty(ToscaPackage.Literals.TNODE_TYPE_IMPLEMENTATION__DEPLOYMENT_ARTIFACTS));

		public static final /*@NonNull*/ ExecutorProperty _TDocumentation__any = new EcoreExecutorProperty(ToscaPackage.Literals.TDOCUMENTATION__ANY, Types._TDocumentation, 0);
		public static final /*@NonNull*/ ExecutorProperty _TDocumentation__lang = new EcoreExecutorProperty(ToscaPackage.Literals.TDOCUMENTATION__LANG, Types._TDocumentation, 1);
		public static final /*@NonNull*/ ExecutorProperty _TDocumentation__mixed = new EcoreExecutorProperty(ToscaPackage.Literals.TDOCUMENTATION__MIXED, Types._TDocumentation, 2);
		public static final /*@NonNull*/ ExecutorProperty _TDocumentation__source = new EcoreExecutorProperty(ToscaPackage.Literals.TDOCUMENTATION__SOURCE, Types._TDocumentation, 3);
		public static final /*@NonNull*/ ExecutorProperty _TDocumentation__DocumentRoot__documentation = new ExecutorPropertyWithImplementation("DocumentRoot", Types._TDocumentation, 4, new EcoreLibraryOppositeProperty(ToscaPackage.Literals.DOCUMENT_ROOT__DOCUMENTATION));
		public static final /*@NonNull*/ ExecutorProperty _TDocumentation__TExtensibleElements__documentation = new ExecutorPropertyWithImplementation("TExtensibleElements", Types._TDocumentation, 5, new EcoreLibraryOppositeProperty(ToscaPackage.Literals.TEXTENSIBLE_ELEMENTS__DOCUMENTATION));

		public static final /*@NonNull*/ ExecutorProperty _TEntityTemplate__id = new EcoreExecutorProperty(ToscaPackage.Literals.TENTITY_TEMPLATE__ID, Types._TEntityTemplate, 0);
		public static final /*@NonNull*/ ExecutorProperty _TEntityTemplate__properties = new EcoreExecutorProperty(ToscaPackage.Literals.TENTITY_TEMPLATE__PROPERTIES, Types._TEntityTemplate, 1);
		public static final /*@NonNull*/ ExecutorProperty _TEntityTemplate__propertyConstraints = new EcoreExecutorProperty(ToscaPackage.Literals.TENTITY_TEMPLATE__PROPERTY_CONSTRAINTS, Types._TEntityTemplate, 2);
		public static final /*@NonNull*/ ExecutorProperty _TEntityTemplate__type = new EcoreExecutorProperty(ToscaPackage.Literals.TENTITY_TEMPLATE__TYPE, Types._TEntityTemplate, 3);
		public static final /*@NonNull*/ ExecutorProperty _TEntityTemplate__typeRef = new EcoreExecutorProperty(ToscaPackage.Literals.TENTITY_TEMPLATE__TYPE_REF, Types._TEntityTemplate, 4);
		public static final /*@NonNull*/ ExecutorProperty _TEntityTemplate__TGroupTemplate__member = new ExecutorPropertyWithImplementation("TGroupTemplate", Types._TEntityTemplate, 5, new EcoreLibraryOppositeProperty(ToscaPackage.Literals.TGROUP_TEMPLATE__MEMBER));
		public static final /*@NonNull*/ ExecutorProperty _TEntityTemplate__TPropertyMapping__targetObjectRef = new ExecutorPropertyWithImplementation("TPropertyMapping", Types._TEntityTemplate, 6, new EcoreLibraryOppositeProperty(ToscaPackage.Literals.TPROPERTY_MAPPING__TARGET_OBJECT_REF));

		public static final /*@NonNull*/ ExecutorProperty _TEntityType__abstract = new EcoreExecutorProperty(ToscaPackage.Literals.TENTITY_TYPE__ABSTRACT, Types._TEntityType, 0);
		public static final /*@NonNull*/ ExecutorProperty _TEntityType__derivedFrom = new EcoreExecutorProperty(ToscaPackage.Literals.TENTITY_TYPE__DERIVED_FROM, Types._TEntityType, 1);
		public static final /*@NonNull*/ ExecutorProperty _TEntityType__final = new EcoreExecutorProperty(ToscaPackage.Literals.TENTITY_TYPE__FINAL, Types._TEntityType, 2);
		public static final /*@NonNull*/ ExecutorProperty _TEntityType__name = new EcoreExecutorProperty(ToscaPackage.Literals.TENTITY_TYPE__NAME, Types._TEntityType, 3);
		public static final /*@NonNull*/ ExecutorProperty _TEntityType__propertiesDefinition = new EcoreExecutorProperty(ToscaPackage.Literals.TENTITY_TYPE__PROPERTIES_DEFINITION, Types._TEntityType, 4);
		public static final /*@NonNull*/ ExecutorProperty _TEntityType__tags = new EcoreExecutorProperty(ToscaPackage.Literals.TENTITY_TYPE__TAGS, Types._TEntityType, 5);
		public static final /*@NonNull*/ ExecutorProperty _TEntityType__targetNamespace = new EcoreExecutorProperty(ToscaPackage.Literals.TENTITY_TYPE__TARGET_NAMESPACE, Types._TEntityType, 6);
		public static final /*@NonNull*/ ExecutorProperty _TEntityType__DerivedFromType2__referencedEntityType = new ExecutorPropertyWithImplementation("DerivedFromType2", Types._TEntityType, 7, new EcoreLibraryOppositeProperty(ToscaPackage.Literals.DERIVED_FROM_TYPE2__REFERENCED_ENTITY_TYPE));
		public static final /*@NonNull*/ ExecutorProperty _TEntityType__TEntityTemplate__typeRef = new ExecutorPropertyWithImplementation("TEntityTemplate", Types._TEntityType, 8, new EcoreLibraryOppositeProperty(ToscaPackage.Literals.TENTITY_TEMPLATE__TYPE_REF));
		public static final /*@NonNull*/ ExecutorProperty _TEntityType__TGroupType__memberRefs = new ExecutorPropertyWithImplementation("TGroupType", Types._TEntityType, 9, new EcoreLibraryOppositeProperty(ToscaPackage.Literals.TGROUP_TYPE__MEMBER_REFS));

		public static final /*@NonNull*/ ExecutorProperty _TExportedInterface__name = new EcoreExecutorProperty(ToscaPackage.Literals.TEXPORTED_INTERFACE__NAME, Types._TExportedInterface, 0);
		public static final /*@NonNull*/ ExecutorProperty _TExportedInterface__operation = new EcoreExecutorProperty(ToscaPackage.Literals.TEXPORTED_INTERFACE__OPERATION, Types._TExportedInterface, 1);
		public static final /*@NonNull*/ ExecutorProperty _TExportedInterface__InterfacesType2__interface = new ExecutorPropertyWithImplementation("InterfacesType2", Types._TExportedInterface, 2, new EcoreLibraryOppositeProperty(ToscaPackage.Literals.INTERFACES_TYPE2__INTERFACE));

		public static final /*@NonNull*/ ExecutorProperty _TExportedOperation__name = new EcoreExecutorProperty(ToscaPackage.Literals.TEXPORTED_OPERATION__NAME, Types._TExportedOperation, 0);
		public static final /*@NonNull*/ ExecutorProperty _TExportedOperation__nodeOperation = new EcoreExecutorProperty(ToscaPackage.Literals.TEXPORTED_OPERATION__NODE_OPERATION, Types._TExportedOperation, 1);
		public static final /*@NonNull*/ ExecutorProperty _TExportedOperation__plan = new EcoreExecutorProperty(ToscaPackage.Literals.TEXPORTED_OPERATION__PLAN, Types._TExportedOperation, 2);
		public static final /*@NonNull*/ ExecutorProperty _TExportedOperation__relationshipOperation = new EcoreExecutorProperty(ToscaPackage.Literals.TEXPORTED_OPERATION__RELATIONSHIP_OPERATION, Types._TExportedOperation, 3);
		public static final /*@NonNull*/ ExecutorProperty _TExportedOperation__TExportedInterface__operation = new ExecutorPropertyWithImplementation("TExportedInterface", Types._TExportedOperation, 4, new EcoreLibraryOppositeProperty(ToscaPackage.Literals.TEXPORTED_INTERFACE__OPERATION));

		public static final /*@NonNull*/ ExecutorProperty _TExtensibleElements__any = new EcoreExecutorProperty(ToscaPackage.Literals.TEXTENSIBLE_ELEMENTS__ANY, Types._TExtensibleElements, 0);
		public static final /*@NonNull*/ ExecutorProperty _TExtensibleElements__anyAttribute = new EcoreExecutorProperty(ToscaPackage.Literals.TEXTENSIBLE_ELEMENTS__ANY_ATTRIBUTE, Types._TExtensibleElements, 1);
		public static final /*@NonNull*/ ExecutorProperty _TExtensibleElements__documentation = new EcoreExecutorProperty(ToscaPackage.Literals.TEXTENSIBLE_ELEMENTS__DOCUMENTATION, Types._TExtensibleElements, 2);

		public static final /*@NonNull*/ ExecutorProperty _TExtension__mustUnderstand = new EcoreExecutorProperty(ToscaPackage.Literals.TEXTENSION__MUST_UNDERSTAND, Types._TExtension, 0);
		public static final /*@NonNull*/ ExecutorProperty _TExtension__namespace = new EcoreExecutorProperty(ToscaPackage.Literals.TEXTENSION__NAMESPACE, Types._TExtension, 1);
		public static final /*@NonNull*/ ExecutorProperty _TExtension__ExtensionsType__extension = new ExecutorPropertyWithImplementation("ExtensionsType", Types._TExtension, 2, new EcoreLibraryOppositeProperty(ToscaPackage.Literals.EXTENSIONS_TYPE__EXTENSION));
		public static final /*@NonNull*/ ExecutorProperty _TExtension__TExtensions__extension = new ExecutorPropertyWithImplementation("TExtensions", Types._TExtension, 3, new EcoreLibraryOppositeProperty(ToscaPackage.Literals.TEXTENSIONS__EXTENSION));

		public static final /*@NonNull*/ ExecutorProperty _TExtensions__extension = new EcoreExecutorProperty(ToscaPackage.Literals.TEXTENSIONS__EXTENSION, Types._TExtensions, 0);

		public static final /*@NonNull*/ ExecutorProperty _TGroupTemplate__capabilities = new EcoreExecutorProperty(ToscaPackage.Literals.TGROUP_TEMPLATE__CAPABILITIES, Types._TGroupTemplate, 0);
		public static final /*@NonNull*/ ExecutorProperty _TGroupTemplate__deploymentArtifacts = new EcoreExecutorProperty(ToscaPackage.Literals.TGROUP_TEMPLATE__DEPLOYMENT_ARTIFACTS, Types._TGroupTemplate, 1);
		public static final /*@NonNull*/ ExecutorProperty _TGroupTemplate__maxInstances = new EcoreExecutorProperty(ToscaPackage.Literals.TGROUP_TEMPLATE__MAX_INSTANCES, Types._TGroupTemplate, 2);
		public static final /*@NonNull*/ ExecutorProperty _TGroupTemplate__member = new EcoreExecutorProperty(ToscaPackage.Literals.TGROUP_TEMPLATE__MEMBER, Types._TGroupTemplate, 3);
		public static final /*@NonNull*/ ExecutorProperty _TGroupTemplate__minInstances = new EcoreExecutorProperty(ToscaPackage.Literals.TGROUP_TEMPLATE__MIN_INSTANCES, Types._TGroupTemplate, 4);
		public static final /*@NonNull*/ ExecutorProperty _TGroupTemplate__name = new EcoreExecutorProperty(ToscaPackage.Literals.TGROUP_TEMPLATE__NAME, Types._TGroupTemplate, 5);
		public static final /*@NonNull*/ ExecutorProperty _TGroupTemplate__policies = new EcoreExecutorProperty(ToscaPackage.Literals.TGROUP_TEMPLATE__POLICIES, Types._TGroupTemplate, 6);
		public static final /*@NonNull*/ ExecutorProperty _TGroupTemplate__requirements = new EcoreExecutorProperty(ToscaPackage.Literals.TGROUP_TEMPLATE__REQUIREMENTS, Types._TGroupTemplate, 7);
		public static final /*@NonNull*/ ExecutorProperty _TGroupTemplate__TTopologyTemplate__groupTemplate = new ExecutorPropertyWithImplementation("TTopologyTemplate", Types._TGroupTemplate, 8, new EcoreLibraryOppositeProperty(ToscaPackage.Literals.TTOPOLOGY_TEMPLATE__GROUP_TEMPLATE));

		public static final /*@NonNull*/ ExecutorProperty _TGroupType__capabilityDefinitions = new EcoreExecutorProperty(ToscaPackage.Literals.TGROUP_TYPE__CAPABILITY_DEFINITIONS, Types._TGroupType, 0);
		public static final /*@NonNull*/ ExecutorProperty _TGroupType__instanceStates = new EcoreExecutorProperty(ToscaPackage.Literals.TGROUP_TYPE__INSTANCE_STATES, Types._TGroupType, 1);
		public static final /*@NonNull*/ ExecutorProperty _TGroupType__interfaces = new EcoreExecutorProperty(ToscaPackage.Literals.TGROUP_TYPE__INTERFACES, Types._TGroupType, 2);
		public static final /*@NonNull*/ ExecutorProperty _TGroupType__member = new EcoreExecutorProperty(ToscaPackage.Literals.TGROUP_TYPE__MEMBER, Types._TGroupType, 3);
		public static final /*@NonNull*/ ExecutorProperty _TGroupType__memberRefs = new EcoreExecutorProperty(ToscaPackage.Literals.TGROUP_TYPE__MEMBER_REFS, Types._TGroupType, 4);
		public static final /*@NonNull*/ ExecutorProperty _TGroupType__requirementDefinitions = new EcoreExecutorProperty(ToscaPackage.Literals.TGROUP_TYPE__REQUIREMENT_DEFINITIONS, Types._TGroupType, 5);
		public static final /*@NonNull*/ ExecutorProperty _TGroupType__TDefinitions__groupType = new ExecutorPropertyWithImplementation("TDefinitions", Types._TGroupType, 6, new EcoreLibraryOppositeProperty(ToscaPackage.Literals.TDEFINITIONS__GROUP_TYPE));

		public static final /*@NonNull*/ ExecutorProperty _TImplementationArtifact__artifactRef = new EcoreExecutorProperty(ToscaPackage.Literals.TIMPLEMENTATION_ARTIFACT__ARTIFACT_REF, Types._TImplementationArtifact, 0);
		public static final /*@NonNull*/ ExecutorProperty _TImplementationArtifact__artifactType = new EcoreExecutorProperty(ToscaPackage.Literals.TIMPLEMENTATION_ARTIFACT__ARTIFACT_TYPE, Types._TImplementationArtifact, 1);
		public static final /*@NonNull*/ ExecutorProperty _TImplementationArtifact__interfaceName = new EcoreExecutorProperty(ToscaPackage.Literals.TIMPLEMENTATION_ARTIFACT__INTERFACE_NAME, Types._TImplementationArtifact, 2);
		public static final /*@NonNull*/ ExecutorProperty _TImplementationArtifact__operationName = new EcoreExecutorProperty(ToscaPackage.Literals.TIMPLEMENTATION_ARTIFACT__OPERATION_NAME, Types._TImplementationArtifact, 3);

		public static final /*@NonNull*/ ExecutorProperty _TImplementationArtifacts__implementationArtifact = new EcoreExecutorProperty(ToscaPackage.Literals.TIMPLEMENTATION_ARTIFACTS__IMPLEMENTATION_ARTIFACT, Types._TImplementationArtifacts, 0);
		public static final /*@NonNull*/ ExecutorProperty _TImplementationArtifacts__TNodeTypeImplementation__implementationArtifacts = new ExecutorPropertyWithImplementation("TNodeTypeImplementation", Types._TImplementationArtifacts, 1, new EcoreLibraryOppositeProperty(ToscaPackage.Literals.TNODE_TYPE_IMPLEMENTATION__IMPLEMENTATION_ARTIFACTS));
		public static final /*@NonNull*/ ExecutorProperty _TImplementationArtifacts__TRelationshipTypeImplementation__implementationArtifacts = new ExecutorPropertyWithImplementation("TRelationshipTypeImplementation", Types._TImplementationArtifacts, 2, new EcoreLibraryOppositeProperty(ToscaPackage.Literals.TRELATIONSHIP_TYPE_IMPLEMENTATION__IMPLEMENTATION_ARTIFACTS));

		public static final /*@NonNull*/ ExecutorProperty _TImport__importType = new EcoreExecutorProperty(ToscaPackage.Literals.TIMPORT__IMPORT_TYPE, Types._TImport, 0);
		public static final /*@NonNull*/ ExecutorProperty _TImport__location = new EcoreExecutorProperty(ToscaPackage.Literals.TIMPORT__LOCATION, Types._TImport, 1);
		public static final /*@NonNull*/ ExecutorProperty _TImport__namespace = new EcoreExecutorProperty(ToscaPackage.Literals.TIMPORT__NAMESPACE, Types._TImport, 2);
		public static final /*@NonNull*/ ExecutorProperty _TImport__resource = new EcoreExecutorProperty(ToscaPackage.Literals.TIMPORT__RESOURCE, Types._TImport, 3);
		public static final /*@NonNull*/ ExecutorProperty _TImport__TDefinitions__import = new ExecutorPropertyWithImplementation("TDefinitions", Types._TImport, 4, new EcoreLibraryOppositeProperty(ToscaPackage.Literals.TDEFINITIONS__IMPORT));

		public static final /*@NonNull*/ ExecutorProperty _TInterface__name = new EcoreExecutorProperty(ToscaPackage.Literals.TINTERFACE__NAME, Types._TInterface, 0);
		public static final /*@NonNull*/ ExecutorProperty _TInterface__operation = new EcoreExecutorProperty(ToscaPackage.Literals.TINTERFACE__OPERATION, Types._TInterface, 1);
		public static final /*@NonNull*/ ExecutorProperty _TInterface__InterfacesType__interface = new ExecutorPropertyWithImplementation("InterfacesType", Types._TInterface, 2, new EcoreLibraryOppositeProperty(ToscaPackage.Literals.INTERFACES_TYPE__INTERFACE));
		public static final /*@NonNull*/ ExecutorProperty _TInterface__InterfacesType1__interface = new ExecutorPropertyWithImplementation("InterfacesType1", Types._TInterface, 3, new EcoreLibraryOppositeProperty(ToscaPackage.Literals.INTERFACES_TYPE1__INTERFACE));
		public static final /*@NonNull*/ ExecutorProperty _TInterface__SourceInterfacesType__interface = new ExecutorPropertyWithImplementation("SourceInterfacesType", Types._TInterface, 4, new EcoreLibraryOppositeProperty(ToscaPackage.Literals.SOURCE_INTERFACES_TYPE__INTERFACE));
		public static final /*@NonNull*/ ExecutorProperty _TInterface__TargetInterfacesType__interface = new ExecutorPropertyWithImplementation("TargetInterfacesType", Types._TInterface, 5, new EcoreLibraryOppositeProperty(ToscaPackage.Literals.TARGET_INTERFACES_TYPE__INTERFACE));

		public static final /*@NonNull*/ ExecutorProperty _TNodeTemplate__capabilities = new EcoreExecutorProperty(ToscaPackage.Literals.TNODE_TEMPLATE__CAPABILITIES, Types._TNodeTemplate, 0);
		public static final /*@NonNull*/ ExecutorProperty _TNodeTemplate__deploymentArtifacts = new EcoreExecutorProperty(ToscaPackage.Literals.TNODE_TEMPLATE__DEPLOYMENT_ARTIFACTS, Types._TNodeTemplate, 1);
		public static final /*@NonNull*/ ExecutorProperty _TNodeTemplate__maxInstances = new EcoreExecutorProperty(ToscaPackage.Literals.TNODE_TEMPLATE__MAX_INSTANCES, Types._TNodeTemplate, 2);
		public static final /*@NonNull*/ ExecutorProperty _TNodeTemplate__minInstances = new EcoreExecutorProperty(ToscaPackage.Literals.TNODE_TEMPLATE__MIN_INSTANCES, Types._TNodeTemplate, 3);
		public static final /*@NonNull*/ ExecutorProperty _TNodeTemplate__name = new EcoreExecutorProperty(ToscaPackage.Literals.TNODE_TEMPLATE__NAME, Types._TNodeTemplate, 4);
		public static final /*@NonNull*/ ExecutorProperty _TNodeTemplate__policies = new EcoreExecutorProperty(ToscaPackage.Literals.TNODE_TEMPLATE__POLICIES, Types._TNodeTemplate, 5);
		public static final /*@NonNull*/ ExecutorProperty _TNodeTemplate__requirements = new EcoreExecutorProperty(ToscaPackage.Literals.TNODE_TEMPLATE__REQUIREMENTS, Types._TNodeTemplate, 6);
		public static final /*@NonNull*/ ExecutorProperty _TNodeTemplate__TTopologyTemplate__nodeTemplate = new ExecutorPropertyWithImplementation("TTopologyTemplate", Types._TNodeTemplate, 7, new EcoreLibraryOppositeProperty(ToscaPackage.Literals.TTOPOLOGY_TEMPLATE__NODE_TEMPLATE));

		public static final /*@NonNull*/ ExecutorProperty _TNodeType__capabilityDefinitions = new EcoreExecutorProperty(ToscaPackage.Literals.TNODE_TYPE__CAPABILITY_DEFINITIONS, Types._TNodeType, 0);
		public static final /*@NonNull*/ ExecutorProperty _TNodeType__instanceStates = new EcoreExecutorProperty(ToscaPackage.Literals.TNODE_TYPE__INSTANCE_STATES, Types._TNodeType, 1);
		public static final /*@NonNull*/ ExecutorProperty _TNodeType__interfaces = new EcoreExecutorProperty(ToscaPackage.Literals.TNODE_TYPE__INTERFACES, Types._TNodeType, 2);
		public static final /*@NonNull*/ ExecutorProperty _TNodeType__requirementDefinitions = new EcoreExecutorProperty(ToscaPackage.Literals.TNODE_TYPE__REQUIREMENT_DEFINITIONS, Types._TNodeType, 3);
		public static final /*@NonNull*/ ExecutorProperty _TNodeType__NodeOperationType__nodeRef = new ExecutorPropertyWithImplementation("NodeOperationType", Types._TNodeType, 4, new EcoreLibraryOppositeProperty(ToscaPackage.Literals.NODE_OPERATION_TYPE__NODE_REF));
		public static final /*@NonNull*/ ExecutorProperty _TNodeType__TDefinitions__nodeType = new ExecutorPropertyWithImplementation("TDefinitions", Types._TNodeType, 5, new EcoreLibraryOppositeProperty(ToscaPackage.Literals.TDEFINITIONS__NODE_TYPE));

		public static final /*@NonNull*/ ExecutorProperty _TNodeTypeImplementation__abstract = new EcoreExecutorProperty(ToscaPackage.Literals.TNODE_TYPE_IMPLEMENTATION__ABSTRACT, Types._TNodeTypeImplementation, 0);
		public static final /*@NonNull*/ ExecutorProperty _TNodeTypeImplementation__deploymentArtifacts = new EcoreExecutorProperty(ToscaPackage.Literals.TNODE_TYPE_IMPLEMENTATION__DEPLOYMENT_ARTIFACTS, Types._TNodeTypeImplementation, 1);
		public static final /*@NonNull*/ ExecutorProperty _TNodeTypeImplementation__derivedFrom = new EcoreExecutorProperty(ToscaPackage.Literals.TNODE_TYPE_IMPLEMENTATION__DERIVED_FROM, Types._TNodeTypeImplementation, 2);
		public static final /*@NonNull*/ ExecutorProperty _TNodeTypeImplementation__final = new EcoreExecutorProperty(ToscaPackage.Literals.TNODE_TYPE_IMPLEMENTATION__FINAL, Types._TNodeTypeImplementation, 3);
		public static final /*@NonNull*/ ExecutorProperty _TNodeTypeImplementation__implementationArtifacts = new EcoreExecutorProperty(ToscaPackage.Literals.TNODE_TYPE_IMPLEMENTATION__IMPLEMENTATION_ARTIFACTS, Types._TNodeTypeImplementation, 4);
		public static final /*@NonNull*/ ExecutorProperty _TNodeTypeImplementation__name = new EcoreExecutorProperty(ToscaPackage.Literals.TNODE_TYPE_IMPLEMENTATION__NAME, Types._TNodeTypeImplementation, 5);
		public static final /*@NonNull*/ ExecutorProperty _TNodeTypeImplementation__nodeType = new EcoreExecutorProperty(ToscaPackage.Literals.TNODE_TYPE_IMPLEMENTATION__NODE_TYPE, Types._TNodeTypeImplementation, 6);
		public static final /*@NonNull*/ ExecutorProperty _TNodeTypeImplementation__requiredContainerFeatures = new EcoreExecutorProperty(ToscaPackage.Literals.TNODE_TYPE_IMPLEMENTATION__REQUIRED_CONTAINER_FEATURES, Types._TNodeTypeImplementation, 7);
		public static final /*@NonNull*/ ExecutorProperty _TNodeTypeImplementation__tags = new EcoreExecutorProperty(ToscaPackage.Literals.TNODE_TYPE_IMPLEMENTATION__TAGS, Types._TNodeTypeImplementation, 8);
		public static final /*@NonNull*/ ExecutorProperty _TNodeTypeImplementation__targetNamespace = new EcoreExecutorProperty(ToscaPackage.Literals.TNODE_TYPE_IMPLEMENTATION__TARGET_NAMESPACE, Types._TNodeTypeImplementation, 9);
		public static final /*@NonNull*/ ExecutorProperty _TNodeTypeImplementation__TDefinitions__nodeTypeImplementation = new ExecutorPropertyWithImplementation("TDefinitions", Types._TNodeTypeImplementation, 10, new EcoreLibraryOppositeProperty(ToscaPackage.Literals.TDEFINITIONS__NODE_TYPE_IMPLEMENTATION));

		public static final /*@NonNull*/ ExecutorProperty _TOperation__inputParameters = new EcoreExecutorProperty(ToscaPackage.Literals.TOPERATION__INPUT_PARAMETERS, Types._TOperation, 0);
		public static final /*@NonNull*/ ExecutorProperty _TOperation__name = new EcoreExecutorProperty(ToscaPackage.Literals.TOPERATION__NAME, Types._TOperation, 1);
		public static final /*@NonNull*/ ExecutorProperty _TOperation__outputParameters = new EcoreExecutorProperty(ToscaPackage.Literals.TOPERATION__OUTPUT_PARAMETERS, Types._TOperation, 2);
		public static final /*@NonNull*/ ExecutorProperty _TOperation__TInterface__operation = new ExecutorPropertyWithImplementation("TInterface", Types._TOperation, 3, new EcoreLibraryOppositeProperty(ToscaPackage.Literals.TINTERFACE__OPERATION));

		public static final /*@NonNull*/ ExecutorProperty _TParameter__name = new EcoreExecutorProperty(ToscaPackage.Literals.TPARAMETER__NAME, Types._TParameter, 0);
		public static final /*@NonNull*/ ExecutorProperty _TParameter__required = new EcoreExecutorProperty(ToscaPackage.Literals.TPARAMETER__REQUIRED, Types._TParameter, 1);
		public static final /*@NonNull*/ ExecutorProperty _TParameter__type = new EcoreExecutorProperty(ToscaPackage.Literals.TPARAMETER__TYPE, Types._TParameter, 2);
		public static final /*@NonNull*/ ExecutorProperty _TParameter__InputParametersType__inputParameter = new ExecutorPropertyWithImplementation("InputParametersType", Types._TParameter, 3, new EcoreLibraryOppositeProperty(ToscaPackage.Literals.INPUT_PARAMETERS_TYPE__INPUT_PARAMETER));
		public static final /*@NonNull*/ ExecutorProperty _TParameter__InputParametersType1__inputParameter = new ExecutorPropertyWithImplementation("InputParametersType1", Types._TParameter, 4, new EcoreLibraryOppositeProperty(ToscaPackage.Literals.INPUT_PARAMETERS_TYPE1__INPUT_PARAMETER));
		public static final /*@NonNull*/ ExecutorProperty _TParameter__OutputParametersType__outputParameter = new ExecutorPropertyWithImplementation("OutputParametersType", Types._TParameter, 5, new EcoreLibraryOppositeProperty(ToscaPackage.Literals.OUTPUT_PARAMETERS_TYPE__OUTPUT_PARAMETER));
		public static final /*@NonNull*/ ExecutorProperty _TParameter__OutputParametersType1__outputParameter = new ExecutorPropertyWithImplementation("OutputParametersType1", Types._TParameter, 6, new EcoreLibraryOppositeProperty(ToscaPackage.Literals.OUTPUT_PARAMETERS_TYPE1__OUTPUT_PARAMETER));

		public static final /*@NonNull*/ ExecutorProperty _TPlan__id = new EcoreExecutorProperty(ToscaPackage.Literals.TPLAN__ID, Types._TPlan, 0);
		public static final /*@NonNull*/ ExecutorProperty _TPlan__inputParameters = new EcoreExecutorProperty(ToscaPackage.Literals.TPLAN__INPUT_PARAMETERS, Types._TPlan, 1);
		public static final /*@NonNull*/ ExecutorProperty _TPlan__name = new EcoreExecutorProperty(ToscaPackage.Literals.TPLAN__NAME, Types._TPlan, 2);
		public static final /*@NonNull*/ ExecutorProperty _TPlan__outputParameters = new EcoreExecutorProperty(ToscaPackage.Literals.TPLAN__OUTPUT_PARAMETERS, Types._TPlan, 3);
		public static final /*@NonNull*/ ExecutorProperty _TPlan__planLanguage = new EcoreExecutorProperty(ToscaPackage.Literals.TPLAN__PLAN_LANGUAGE, Types._TPlan, 4);
		public static final /*@NonNull*/ ExecutorProperty _TPlan__planModel = new EcoreExecutorProperty(ToscaPackage.Literals.TPLAN__PLAN_MODEL, Types._TPlan, 5);
		public static final /*@NonNull*/ ExecutorProperty _TPlan__planModelReference = new EcoreExecutorProperty(ToscaPackage.Literals.TPLAN__PLAN_MODEL_REFERENCE, Types._TPlan, 6);
		public static final /*@NonNull*/ ExecutorProperty _TPlan__planType = new EcoreExecutorProperty(ToscaPackage.Literals.TPLAN__PLAN_TYPE, Types._TPlan, 7);
		public static final /*@NonNull*/ ExecutorProperty _TPlan__precondition = new EcoreExecutorProperty(ToscaPackage.Literals.TPLAN__PRECONDITION, Types._TPlan, 8);
		public static final /*@NonNull*/ ExecutorProperty _TPlan__TPlans__plan = new ExecutorPropertyWithImplementation("TPlans", Types._TPlan, 9, new EcoreLibraryOppositeProperty(ToscaPackage.Literals.TPLANS__PLAN));

		public static final /*@NonNull*/ ExecutorProperty _TPlans__plan = new EcoreExecutorProperty(ToscaPackage.Literals.TPLANS__PLAN, Types._TPlans, 0);
		public static final /*@NonNull*/ ExecutorProperty _TPlans__targetNamespace = new EcoreExecutorProperty(ToscaPackage.Literals.TPLANS__TARGET_NAMESPACE, Types._TPlans, 1);
		public static final /*@NonNull*/ ExecutorProperty _TPlans__TServiceTemplate__plans = new ExecutorPropertyWithImplementation("TServiceTemplate", Types._TPlans, 2, new EcoreLibraryOppositeProperty(ToscaPackage.Literals.TSERVICE_TEMPLATE__PLANS));

		public static final /*@NonNull*/ ExecutorProperty _TPolicy__name = new EcoreExecutorProperty(ToscaPackage.Literals.TPOLICY__NAME, Types._TPolicy, 0);
		public static final /*@NonNull*/ ExecutorProperty _TPolicy__policyRef = new EcoreExecutorProperty(ToscaPackage.Literals.TPOLICY__POLICY_REF, Types._TPolicy, 1);
		public static final /*@NonNull*/ ExecutorProperty _TPolicy__policyType = new EcoreExecutorProperty(ToscaPackage.Literals.TPOLICY__POLICY_TYPE, Types._TPolicy, 2);
		public static final /*@NonNull*/ ExecutorProperty _TPolicy__PoliciesType__policy = new ExecutorPropertyWithImplementation("PoliciesType", Types._TPolicy, 3, new EcoreLibraryOppositeProperty(ToscaPackage.Literals.POLICIES_TYPE__POLICY));
		public static final /*@NonNull*/ ExecutorProperty _TPolicy__PoliciesType1__policy = new ExecutorPropertyWithImplementation("PoliciesType1", Types._TPolicy, 4, new EcoreLibraryOppositeProperty(ToscaPackage.Literals.POLICIES_TYPE1__POLICY));
		public static final /*@NonNull*/ ExecutorProperty _TPolicy__PoliciesType2__policy = new ExecutorPropertyWithImplementation("PoliciesType2", Types._TPolicy, 5, new EcoreLibraryOppositeProperty(ToscaPackage.Literals.POLICIES_TYPE2__POLICY));

		public static final /*@NonNull*/ ExecutorProperty _TPolicyTemplate__name = new EcoreExecutorProperty(ToscaPackage.Literals.TPOLICY_TEMPLATE__NAME, Types._TPolicyTemplate, 0);
		public static final /*@NonNull*/ ExecutorProperty _TPolicyTemplate__TDefinitions__policyTemplate = new ExecutorPropertyWithImplementation("TDefinitions", Types._TPolicyTemplate, 1, new EcoreLibraryOppositeProperty(ToscaPackage.Literals.TDEFINITIONS__POLICY_TEMPLATE));

		public static final /*@NonNull*/ ExecutorProperty _TPolicyType__appliesTo = new EcoreExecutorProperty(ToscaPackage.Literals.TPOLICY_TYPE__APPLIES_TO, Types._TPolicyType, 0);
		public static final /*@NonNull*/ ExecutorProperty _TPolicyType__policyLanguage = new EcoreExecutorProperty(ToscaPackage.Literals.TPOLICY_TYPE__POLICY_LANGUAGE, Types._TPolicyType, 1);
		public static final /*@NonNull*/ ExecutorProperty _TPolicyType__TDefinitions__policyType = new ExecutorPropertyWithImplementation("TDefinitions", Types._TPolicyType, 2, new EcoreLibraryOppositeProperty(ToscaPackage.Literals.TDEFINITIONS__POLICY_TYPE));

		public static final /*@NonNull*/ ExecutorProperty _TPropertyConstraint__property = new EcoreExecutorProperty(ToscaPackage.Literals.TPROPERTY_CONSTRAINT__PROPERTY, Types._TPropertyConstraint, 0);
		public static final /*@NonNull*/ ExecutorProperty _TPropertyConstraint__PropertyConstraintsType__propertyConstraint = new ExecutorPropertyWithImplementation("PropertyConstraintsType", Types._TPropertyConstraint, 1, new EcoreLibraryOppositeProperty(ToscaPackage.Literals.PROPERTY_CONSTRAINTS_TYPE__PROPERTY_CONSTRAINT));
		public static final /*@NonNull*/ ExecutorProperty _TPropertyConstraint__PropertyConstraintsType1__propertyConstraint = new ExecutorPropertyWithImplementation("PropertyConstraintsType1", Types._TPropertyConstraint, 2, new EcoreLibraryOppositeProperty(ToscaPackage.Literals.PROPERTY_CONSTRAINTS_TYPE1__PROPERTY_CONSTRAINT));

		public static final /*@NonNull*/ ExecutorProperty _TPropertyMapping__serviceTemplatePropertyRef = new EcoreExecutorProperty(ToscaPackage.Literals.TPROPERTY_MAPPING__SERVICE_TEMPLATE_PROPERTY_REF, Types._TPropertyMapping, 0);
		public static final /*@NonNull*/ ExecutorProperty _TPropertyMapping__targetObjectRef = new EcoreExecutorProperty(ToscaPackage.Literals.TPROPERTY_MAPPING__TARGET_OBJECT_REF, Types._TPropertyMapping, 1);
		public static final /*@NonNull*/ ExecutorProperty _TPropertyMapping__targetPropertyRef = new EcoreExecutorProperty(ToscaPackage.Literals.TPROPERTY_MAPPING__TARGET_PROPERTY_REF, Types._TPropertyMapping, 2);
		public static final /*@NonNull*/ ExecutorProperty _TPropertyMapping__PropertyMappingsType__propertyMapping = new ExecutorPropertyWithImplementation("PropertyMappingsType", Types._TPropertyMapping, 3, new EcoreLibraryOppositeProperty(ToscaPackage.Literals.PROPERTY_MAPPINGS_TYPE__PROPERTY_MAPPING));

		public static final /*@NonNull*/ ExecutorProperty _TRelationshipTemplate__name = new EcoreExecutorProperty(ToscaPackage.Literals.TRELATIONSHIP_TEMPLATE__NAME, Types._TRelationshipTemplate, 0);
		public static final /*@NonNull*/ ExecutorProperty _TRelationshipTemplate__relationshipConstraints = new EcoreExecutorProperty(ToscaPackage.Literals.TRELATIONSHIP_TEMPLATE__RELATIONSHIP_CONSTRAINTS, Types._TRelationshipTemplate, 1);
		public static final /*@NonNull*/ ExecutorProperty _TRelationshipTemplate__sourceElement = new EcoreExecutorProperty(ToscaPackage.Literals.TRELATIONSHIP_TEMPLATE__SOURCE_ELEMENT, Types._TRelationshipTemplate, 2);
		public static final /*@NonNull*/ ExecutorProperty _TRelationshipTemplate__targetElement = new EcoreExecutorProperty(ToscaPackage.Literals.TRELATIONSHIP_TEMPLATE__TARGET_ELEMENT, Types._TRelationshipTemplate, 3);
		public static final /*@NonNull*/ ExecutorProperty _TRelationshipTemplate__TTopologyTemplate__relationshipTemplate = new ExecutorPropertyWithImplementation("TTopologyTemplate", Types._TRelationshipTemplate, 4, new EcoreLibraryOppositeProperty(ToscaPackage.Literals.TTOPOLOGY_TEMPLATE__RELATIONSHIP_TEMPLATE));

		public static final /*@NonNull*/ ExecutorProperty _TRelationshipType__instanceStates = new EcoreExecutorProperty(ToscaPackage.Literals.TRELATIONSHIP_TYPE__INSTANCE_STATES, Types._TRelationshipType, 0);
		public static final /*@NonNull*/ ExecutorProperty _TRelationshipType__sourceInterfaces = new EcoreExecutorProperty(ToscaPackage.Literals.TRELATIONSHIP_TYPE__SOURCE_INTERFACES, Types._TRelationshipType, 1);
		public static final /*@NonNull*/ ExecutorProperty _TRelationshipType__targetInterfaces = new EcoreExecutorProperty(ToscaPackage.Literals.TRELATIONSHIP_TYPE__TARGET_INTERFACES, Types._TRelationshipType, 2);
		public static final /*@NonNull*/ ExecutorProperty _TRelationshipType__validSource = new EcoreExecutorProperty(ToscaPackage.Literals.TRELATIONSHIP_TYPE__VALID_SOURCE, Types._TRelationshipType, 3);
		public static final /*@NonNull*/ ExecutorProperty _TRelationshipType__validTarget = new EcoreExecutorProperty(ToscaPackage.Literals.TRELATIONSHIP_TYPE__VALID_TARGET, Types._TRelationshipType, 4);
		public static final /*@NonNull*/ ExecutorProperty _TRelationshipType__RelationshipOperationType__relationshipRef = new ExecutorPropertyWithImplementation("RelationshipOperationType", Types._TRelationshipType, 5, new EcoreLibraryOppositeProperty(ToscaPackage.Literals.RELATIONSHIP_OPERATION_TYPE__RELATIONSHIP_REF));
		public static final /*@NonNull*/ ExecutorProperty _TRelationshipType__TDefinitions__relationshipType = new ExecutorPropertyWithImplementation("TDefinitions", Types._TRelationshipType, 6, new EcoreLibraryOppositeProperty(ToscaPackage.Literals.TDEFINITIONS__RELATIONSHIP_TYPE));

		public static final /*@NonNull*/ ExecutorProperty _TRelationshipTypeImplementation__abstract = new EcoreExecutorProperty(ToscaPackage.Literals.TRELATIONSHIP_TYPE_IMPLEMENTATION__ABSTRACT, Types._TRelationshipTypeImplementation, 0);
		public static final /*@NonNull*/ ExecutorProperty _TRelationshipTypeImplementation__derivedFrom = new EcoreExecutorProperty(ToscaPackage.Literals.TRELATIONSHIP_TYPE_IMPLEMENTATION__DERIVED_FROM, Types._TRelationshipTypeImplementation, 1);
		public static final /*@NonNull*/ ExecutorProperty _TRelationshipTypeImplementation__final = new EcoreExecutorProperty(ToscaPackage.Literals.TRELATIONSHIP_TYPE_IMPLEMENTATION__FINAL, Types._TRelationshipTypeImplementation, 2);
		public static final /*@NonNull*/ ExecutorProperty _TRelationshipTypeImplementation__implementationArtifacts = new EcoreExecutorProperty(ToscaPackage.Literals.TRELATIONSHIP_TYPE_IMPLEMENTATION__IMPLEMENTATION_ARTIFACTS, Types._TRelationshipTypeImplementation, 3);
		public static final /*@NonNull*/ ExecutorProperty _TRelationshipTypeImplementation__name = new EcoreExecutorProperty(ToscaPackage.Literals.TRELATIONSHIP_TYPE_IMPLEMENTATION__NAME, Types._TRelationshipTypeImplementation, 4);
		public static final /*@NonNull*/ ExecutorProperty _TRelationshipTypeImplementation__relationshipType = new EcoreExecutorProperty(ToscaPackage.Literals.TRELATIONSHIP_TYPE_IMPLEMENTATION__RELATIONSHIP_TYPE, Types._TRelationshipTypeImplementation, 5);
		public static final /*@NonNull*/ ExecutorProperty _TRelationshipTypeImplementation__requiredContainerFeatures = new EcoreExecutorProperty(ToscaPackage.Literals.TRELATIONSHIP_TYPE_IMPLEMENTATION__REQUIRED_CONTAINER_FEATURES, Types._TRelationshipTypeImplementation, 6);
		public static final /*@NonNull*/ ExecutorProperty _TRelationshipTypeImplementation__tags = new EcoreExecutorProperty(ToscaPackage.Literals.TRELATIONSHIP_TYPE_IMPLEMENTATION__TAGS, Types._TRelationshipTypeImplementation, 7);
		public static final /*@NonNull*/ ExecutorProperty _TRelationshipTypeImplementation__targetNamespace = new EcoreExecutorProperty(ToscaPackage.Literals.TRELATIONSHIP_TYPE_IMPLEMENTATION__TARGET_NAMESPACE, Types._TRelationshipTypeImplementation, 8);
		public static final /*@NonNull*/ ExecutorProperty _TRelationshipTypeImplementation__TDefinitions__relationshipTypeImplementation = new ExecutorPropertyWithImplementation("TDefinitions", Types._TRelationshipTypeImplementation, 9, new EcoreLibraryOppositeProperty(ToscaPackage.Literals.TDEFINITIONS__RELATIONSHIP_TYPE_IMPLEMENTATION));

		public static final /*@NonNull*/ ExecutorProperty _TRequiredContainerFeature__feature = new EcoreExecutorProperty(ToscaPackage.Literals.TREQUIRED_CONTAINER_FEATURE__FEATURE, Types._TRequiredContainerFeature, 0);
		public static final /*@NonNull*/ ExecutorProperty _TRequiredContainerFeature__TRequiredContainerFeatures__requiredContainerFeature = new ExecutorPropertyWithImplementation("TRequiredContainerFeatures", Types._TRequiredContainerFeature, 1, new EcoreLibraryOppositeProperty(ToscaPackage.Literals.TREQUIRED_CONTAINER_FEATURES__REQUIRED_CONTAINER_FEATURE));

		public static final /*@NonNull*/ ExecutorProperty _TRequiredContainerFeatures__requiredContainerFeature = new EcoreExecutorProperty(ToscaPackage.Literals.TREQUIRED_CONTAINER_FEATURES__REQUIRED_CONTAINER_FEATURE, Types._TRequiredContainerFeatures, 0);
		public static final /*@NonNull*/ ExecutorProperty _TRequiredContainerFeatures__TNodeTypeImplementation__requiredContainerFeatures = new ExecutorPropertyWithImplementation("TNodeTypeImplementation", Types._TRequiredContainerFeatures, 1, new EcoreLibraryOppositeProperty(ToscaPackage.Literals.TNODE_TYPE_IMPLEMENTATION__REQUIRED_CONTAINER_FEATURES));
		public static final /*@NonNull*/ ExecutorProperty _TRequiredContainerFeatures__TRelationshipTypeImplementation__requiredContainerFeatures = new ExecutorPropertyWithImplementation("TRelationshipTypeImplementation", Types._TRequiredContainerFeatures, 2, new EcoreLibraryOppositeProperty(ToscaPackage.Literals.TRELATIONSHIP_TYPE_IMPLEMENTATION__REQUIRED_CONTAINER_FEATURES));

		public static final /*@NonNull*/ ExecutorProperty _TRequirement__name = new EcoreExecutorProperty(ToscaPackage.Literals.TREQUIREMENT__NAME, Types._TRequirement, 0);
		public static final /*@NonNull*/ ExecutorProperty _TRequirement__RequirementsType__requirement = new ExecutorPropertyWithImplementation("RequirementsType", Types._TRequirement, 1, new EcoreLibraryOppositeProperty(ToscaPackage.Literals.REQUIREMENTS_TYPE__REQUIREMENT));
		public static final /*@NonNull*/ ExecutorProperty _TRequirement__RequirementsType1__requirement = new ExecutorPropertyWithImplementation("RequirementsType1", Types._TRequirement, 2, new EcoreLibraryOppositeProperty(ToscaPackage.Literals.REQUIREMENTS_TYPE1__REQUIREMENT));
		public static final /*@NonNull*/ ExecutorProperty _TRequirement__SourceElementType__ref = new ExecutorPropertyWithImplementation("SourceElementType", Types._TRequirement, 3, new EcoreLibraryOppositeProperty(ToscaPackage.Literals.SOURCE_ELEMENT_TYPE__REF));
		public static final /*@NonNull*/ ExecutorProperty _TRequirement__TRequirementRef__ref = new ExecutorPropertyWithImplementation("TRequirementRef", Types._TRequirement, 4, new EcoreLibraryOppositeProperty(ToscaPackage.Literals.TREQUIREMENT_REF__REF));

		public static final /*@NonNull*/ ExecutorProperty _TRequirementDefinition__constraints = new EcoreExecutorProperty(ToscaPackage.Literals.TREQUIREMENT_DEFINITION__CONSTRAINTS, Types._TRequirementDefinition, 0);
		public static final /*@NonNull*/ ExecutorProperty _TRequirementDefinition__lowerBound = new EcoreExecutorProperty(ToscaPackage.Literals.TREQUIREMENT_DEFINITION__LOWER_BOUND, Types._TRequirementDefinition, 1);
		public static final /*@NonNull*/ ExecutorProperty _TRequirementDefinition__name = new EcoreExecutorProperty(ToscaPackage.Literals.TREQUIREMENT_DEFINITION__NAME, Types._TRequirementDefinition, 2);
		public static final /*@NonNull*/ ExecutorProperty _TRequirementDefinition__requirementType = new EcoreExecutorProperty(ToscaPackage.Literals.TREQUIREMENT_DEFINITION__REQUIREMENT_TYPE, Types._TRequirementDefinition, 3);
		public static final /*@NonNull*/ ExecutorProperty _TRequirementDefinition__requirementTypeRef = new EcoreExecutorProperty(ToscaPackage.Literals.TREQUIREMENT_DEFINITION__REQUIREMENT_TYPE_REF, Types._TRequirementDefinition, 4);
		public static final /*@NonNull*/ ExecutorProperty _TRequirementDefinition__upperBound = new EcoreExecutorProperty(ToscaPackage.Literals.TREQUIREMENT_DEFINITION__UPPER_BOUND, Types._TRequirementDefinition, 5);
		public static final /*@NonNull*/ ExecutorProperty _TRequirementDefinition__RequirementDefinitionsType__requirementDefinition = new ExecutorPropertyWithImplementation("RequirementDefinitionsType", Types._TRequirementDefinition, 6, new EcoreLibraryOppositeProperty(ToscaPackage.Literals.REQUIREMENT_DEFINITIONS_TYPE__REQUIREMENT_DEFINITION));
		public static final /*@NonNull*/ ExecutorProperty _TRequirementDefinition__RequirementDefinitionsType1__requirementDefinition = new ExecutorPropertyWithImplementation("RequirementDefinitionsType1", Types._TRequirementDefinition, 7, new EcoreLibraryOppositeProperty(ToscaPackage.Literals.REQUIREMENT_DEFINITIONS_TYPE1__REQUIREMENT_DEFINITION));

		public static final /*@NonNull*/ ExecutorProperty _TRequirementRef__name = new EcoreExecutorProperty(ToscaPackage.Literals.TREQUIREMENT_REF__NAME, Types._TRequirementRef, 0);
		public static final /*@NonNull*/ ExecutorProperty _TRequirementRef__ref = new EcoreExecutorProperty(ToscaPackage.Literals.TREQUIREMENT_REF__REF, Types._TRequirementRef, 1);
		public static final /*@NonNull*/ ExecutorProperty _TRequirementRef__RequirementsType2__requirement = new ExecutorPropertyWithImplementation("RequirementsType2", Types._TRequirementRef, 2, new EcoreLibraryOppositeProperty(ToscaPackage.Literals.REQUIREMENTS_TYPE2__REQUIREMENT));

		public static final /*@NonNull*/ ExecutorProperty _TRequirementType__requiredCapabilityType = new EcoreExecutorProperty(ToscaPackage.Literals.TREQUIREMENT_TYPE__REQUIRED_CAPABILITY_TYPE, Types._TRequirementType, 0);
		public static final /*@NonNull*/ ExecutorProperty _TRequirementType__requiredCapabilityTypeRef = new EcoreExecutorProperty(ToscaPackage.Literals.TREQUIREMENT_TYPE__REQUIRED_CAPABILITY_TYPE_REF, Types._TRequirementType, 1);
		public static final /*@NonNull*/ ExecutorProperty _TRequirementType__TDefinitions__requirementType = new ExecutorPropertyWithImplementation("TDefinitions", Types._TRequirementType, 2, new EcoreLibraryOppositeProperty(ToscaPackage.Literals.TDEFINITIONS__REQUIREMENT_TYPE));
		public static final /*@NonNull*/ ExecutorProperty _TRequirementType__TRequirementDefinition__requirementTypeRef = new ExecutorPropertyWithImplementation("TRequirementDefinition", Types._TRequirementType, 3, new EcoreLibraryOppositeProperty(ToscaPackage.Literals.TREQUIREMENT_DEFINITION__REQUIREMENT_TYPE_REF));

		public static final /*@NonNull*/ ExecutorProperty _TServiceTemplate__boundaryDefinitions = new EcoreExecutorProperty(ToscaPackage.Literals.TSERVICE_TEMPLATE__BOUNDARY_DEFINITIONS, Types._TServiceTemplate, 0);
		public static final /*@NonNull*/ ExecutorProperty _TServiceTemplate__id = new EcoreExecutorProperty(ToscaPackage.Literals.TSERVICE_TEMPLATE__ID, Types._TServiceTemplate, 1);
		public static final /*@NonNull*/ ExecutorProperty _TServiceTemplate__name = new EcoreExecutorProperty(ToscaPackage.Literals.TSERVICE_TEMPLATE__NAME, Types._TServiceTemplate, 2);
		public static final /*@NonNull*/ ExecutorProperty _TServiceTemplate__plans = new EcoreExecutorProperty(ToscaPackage.Literals.TSERVICE_TEMPLATE__PLANS, Types._TServiceTemplate, 3);
		public static final /*@NonNull*/ ExecutorProperty _TServiceTemplate__substitutableNodeType = new EcoreExecutorProperty(ToscaPackage.Literals.TSERVICE_TEMPLATE__SUBSTITUTABLE_NODE_TYPE, Types._TServiceTemplate, 4);
		public static final /*@NonNull*/ ExecutorProperty _TServiceTemplate__tags = new EcoreExecutorProperty(ToscaPackage.Literals.TSERVICE_TEMPLATE__TAGS, Types._TServiceTemplate, 5);
		public static final /*@NonNull*/ ExecutorProperty _TServiceTemplate__targetNamespace = new EcoreExecutorProperty(ToscaPackage.Literals.TSERVICE_TEMPLATE__TARGET_NAMESPACE, Types._TServiceTemplate, 6);
		public static final /*@NonNull*/ ExecutorProperty _TServiceTemplate__topologyTemplate = new EcoreExecutorProperty(ToscaPackage.Literals.TSERVICE_TEMPLATE__TOPOLOGY_TEMPLATE, Types._TServiceTemplate, 7);
		public static final /*@NonNull*/ ExecutorProperty _TServiceTemplate__TDefinitions__serviceTemplate = new ExecutorPropertyWithImplementation("TDefinitions", Types._TServiceTemplate, 8, new EcoreLibraryOppositeProperty(ToscaPackage.Literals.TDEFINITIONS__SERVICE_TEMPLATE));

		public static final /*@NonNull*/ ExecutorProperty _TTag__name = new EcoreExecutorProperty(ToscaPackage.Literals.TTAG__NAME, Types._TTag, 0);
		public static final /*@NonNull*/ ExecutorProperty _TTag__value = new EcoreExecutorProperty(ToscaPackage.Literals.TTAG__VALUE, Types._TTag, 1);
		public static final /*@NonNull*/ ExecutorProperty _TTag__TTags__tag = new ExecutorPropertyWithImplementation("TTags", Types._TTag, 2, new EcoreLibraryOppositeProperty(ToscaPackage.Literals.TTAGS__TAG));

		public static final /*@NonNull*/ ExecutorProperty _TTags__tag = new EcoreExecutorProperty(ToscaPackage.Literals.TTAGS__TAG, Types._TTags, 0);
		public static final /*@NonNull*/ ExecutorProperty _TTags__TEntityType__tags = new ExecutorPropertyWithImplementation("TEntityType", Types._TTags, 1, new EcoreLibraryOppositeProperty(ToscaPackage.Literals.TENTITY_TYPE__TAGS));
		public static final /*@NonNull*/ ExecutorProperty _TTags__TNodeTypeImplementation__tags = new ExecutorPropertyWithImplementation("TNodeTypeImplementation", Types._TTags, 2, new EcoreLibraryOppositeProperty(ToscaPackage.Literals.TNODE_TYPE_IMPLEMENTATION__TAGS));
		public static final /*@NonNull*/ ExecutorProperty _TTags__TRelationshipTypeImplementation__tags = new ExecutorPropertyWithImplementation("TRelationshipTypeImplementation", Types._TTags, 3, new EcoreLibraryOppositeProperty(ToscaPackage.Literals.TRELATIONSHIP_TYPE_IMPLEMENTATION__TAGS));
		public static final /*@NonNull*/ ExecutorProperty _TTags__TServiceTemplate__tags = new ExecutorPropertyWithImplementation("TServiceTemplate", Types._TTags, 4, new EcoreLibraryOppositeProperty(ToscaPackage.Literals.TSERVICE_TEMPLATE__TAGS));

		public static final /*@NonNull*/ ExecutorProperty _TTopologyElementInstanceStates__instanceState = new EcoreExecutorProperty(ToscaPackage.Literals.TTOPOLOGY_ELEMENT_INSTANCE_STATES__INSTANCE_STATE, Types._TTopologyElementInstanceStates, 0);
		public static final /*@NonNull*/ ExecutorProperty _TTopologyElementInstanceStates__TGroupType__instanceStates = new ExecutorPropertyWithImplementation("TGroupType", Types._TTopologyElementInstanceStates, 1, new EcoreLibraryOppositeProperty(ToscaPackage.Literals.TGROUP_TYPE__INSTANCE_STATES));
		public static final /*@NonNull*/ ExecutorProperty _TTopologyElementInstanceStates__TNodeType__instanceStates = new ExecutorPropertyWithImplementation("TNodeType", Types._TTopologyElementInstanceStates, 2, new EcoreLibraryOppositeProperty(ToscaPackage.Literals.TNODE_TYPE__INSTANCE_STATES));
		public static final /*@NonNull*/ ExecutorProperty _TTopologyElementInstanceStates__TRelationshipType__instanceStates = new ExecutorPropertyWithImplementation("TRelationshipType", Types._TTopologyElementInstanceStates, 3, new EcoreLibraryOppositeProperty(ToscaPackage.Literals.TRELATIONSHIP_TYPE__INSTANCE_STATES));

		public static final /*@NonNull*/ ExecutorProperty _TTopologyTemplate__group = new EcoreExecutorProperty(ToscaPackage.Literals.TTOPOLOGY_TEMPLATE__GROUP, Types._TTopologyTemplate, 0);
		public static final /*@NonNull*/ ExecutorProperty _TTopologyTemplate__groupTemplate = new EcoreExecutorProperty(ToscaPackage.Literals.TTOPOLOGY_TEMPLATE__GROUP_TEMPLATE, Types._TTopologyTemplate, 1);
		public static final /*@NonNull*/ ExecutorProperty _TTopologyTemplate__nodeTemplate = new EcoreExecutorProperty(ToscaPackage.Literals.TTOPOLOGY_TEMPLATE__NODE_TEMPLATE, Types._TTopologyTemplate, 2);
		public static final /*@NonNull*/ ExecutorProperty _TTopologyTemplate__relationshipTemplate = new EcoreExecutorProperty(ToscaPackage.Literals.TTOPOLOGY_TEMPLATE__RELATIONSHIP_TEMPLATE, Types._TTopologyTemplate, 3);
		public static final /*@NonNull*/ ExecutorProperty _TTopologyTemplate__TServiceTemplate__topologyTemplate = new ExecutorPropertyWithImplementation("TServiceTemplate", Types._TTopologyTemplate, 4, new EcoreLibraryOppositeProperty(ToscaPackage.Literals.TSERVICE_TEMPLATE__TOPOLOGY_TEMPLATE));

		public static final /*@NonNull*/ ExecutorProperty _TargetElementType__ref = new EcoreExecutorProperty(ToscaPackage.Literals.TARGET_ELEMENT_TYPE__REF, Types._TargetElementType, 0);
		public static final /*@NonNull*/ ExecutorProperty _TargetElementType__TRelationshipTemplate__targetElement = new ExecutorPropertyWithImplementation("TRelationshipTemplate", Types._TargetElementType, 1, new EcoreLibraryOppositeProperty(ToscaPackage.Literals.TRELATIONSHIP_TEMPLATE__TARGET_ELEMENT));

		public static final /*@NonNull*/ ExecutorProperty _TargetInterfacesType__interface = new EcoreExecutorProperty(ToscaPackage.Literals.TARGET_INTERFACES_TYPE__INTERFACE, Types._TargetInterfacesType, 0);
		public static final /*@NonNull*/ ExecutorProperty _TargetInterfacesType__TRelationshipType__targetInterfaces = new ExecutorPropertyWithImplementation("TRelationshipType", Types._TargetInterfacesType, 1, new EcoreLibraryOppositeProperty(ToscaPackage.Literals.TRELATIONSHIP_TYPE__TARGET_INTERFACES));

		public static final /*@NonNull*/ ExecutorProperty _TypesType__any = new EcoreExecutorProperty(ToscaPackage.Literals.TYPES_TYPE__ANY, Types._TypesType, 0);
		public static final /*@NonNull*/ ExecutorProperty _TypesType__TDefinitions__types = new ExecutorPropertyWithImplementation("TDefinitions", Types._TypesType, 1, new EcoreLibraryOppositeProperty(ToscaPackage.Literals.TDEFINITIONS__TYPES));

		public static final /*@NonNull*/ ExecutorProperty _ValidSourceType__typeRef = new EcoreExecutorProperty(ToscaPackage.Literals.VALID_SOURCE_TYPE__TYPE_REF, Types._ValidSourceType, 0);
		public static final /*@NonNull*/ ExecutorProperty _ValidSourceType__TRelationshipType__validSource = new ExecutorPropertyWithImplementation("TRelationshipType", Types._ValidSourceType, 1, new EcoreLibraryOppositeProperty(ToscaPackage.Literals.TRELATIONSHIP_TYPE__VALID_SOURCE));

		public static final /*@NonNull*/ ExecutorProperty _ValidTargetType__typeRef = new EcoreExecutorProperty(ToscaPackage.Literals.VALID_TARGET_TYPE__TYPE_REF, Types._ValidTargetType, 0);
		public static final /*@NonNull*/ ExecutorProperty _ValidTargetType__TRelationshipType__validTarget = new ExecutorPropertyWithImplementation("TRelationshipType", Types._ValidTargetType, 1, new EcoreLibraryOppositeProperty(ToscaPackage.Literals.TRELATIONSHIP_TYPE__VALID_TARGET));
		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of ToscaTables::Properties and all preceding sub-packages.
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

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _ArtifactReferencesType =
		{
			Fragments._ArtifactReferencesType__OclAny /* 0 */,
			Fragments._ArtifactReferencesType__OclElement /* 1 */,
			Fragments._ArtifactReferencesType__ArtifactReferencesType /* 2 */
		};
		private static final int /*@NonNull*/ [] __ArtifactReferencesType = { 1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _CapabilitiesType =
		{
			Fragments._CapabilitiesType__OclAny /* 0 */,
			Fragments._CapabilitiesType__OclElement /* 1 */,
			Fragments._CapabilitiesType__CapabilitiesType /* 2 */
		};
		private static final int /*@NonNull*/ [] __CapabilitiesType = { 1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _CapabilitiesType1 =
		{
			Fragments._CapabilitiesType1__OclAny /* 0 */,
			Fragments._CapabilitiesType1__OclElement /* 1 */,
			Fragments._CapabilitiesType1__CapabilitiesType1 /* 2 */
		};
		private static final int /*@NonNull*/ [] __CapabilitiesType1 = { 1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _CapabilitiesType2 =
		{
			Fragments._CapabilitiesType2__OclAny /* 0 */,
			Fragments._CapabilitiesType2__OclElement /* 1 */,
			Fragments._CapabilitiesType2__CapabilitiesType2 /* 2 */
		};
		private static final int /*@NonNull*/ [] __CapabilitiesType2 = { 1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _CapabilityDefinitionsType =
		{
			Fragments._CapabilityDefinitionsType__OclAny /* 0 */,
			Fragments._CapabilityDefinitionsType__OclElement /* 1 */,
			Fragments._CapabilityDefinitionsType__CapabilityDefinitionsType /* 2 */
		};
		private static final int /*@NonNull*/ [] __CapabilityDefinitionsType = { 1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _CapabilityDefinitionsType1 =
		{
			Fragments._CapabilityDefinitionsType1__OclAny /* 0 */,
			Fragments._CapabilityDefinitionsType1__OclElement /* 1 */,
			Fragments._CapabilityDefinitionsType1__CapabilityDefinitionsType1 /* 2 */
		};
		private static final int /*@NonNull*/ [] __CapabilityDefinitionsType1 = { 1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _ConstraintsType =
		{
			Fragments._ConstraintsType__OclAny /* 0 */,
			Fragments._ConstraintsType__OclElement /* 1 */,
			Fragments._ConstraintsType__ConstraintsType /* 2 */
		};
		private static final int /*@NonNull*/ [] __ConstraintsType = { 1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _ConstraintsType1 =
		{
			Fragments._ConstraintsType1__OclAny /* 0 */,
			Fragments._ConstraintsType1__OclElement /* 1 */,
			Fragments._ConstraintsType1__ConstraintsType1 /* 2 */
		};
		private static final int /*@NonNull*/ [] __ConstraintsType1 = { 1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _DefinitionsType =
		{
			Fragments._DefinitionsType__OclAny /* 0 */,
			Fragments._DefinitionsType__OclElement /* 1 */,
			Fragments._DefinitionsType__TExtensibleElements /* 2 */,
			Fragments._DefinitionsType__TDefinitions /* 3 */,
			Fragments._DefinitionsType__DefinitionsType /* 4 */
		};
		private static final int /*@NonNull*/ [] __DefinitionsType = { 1,1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _DerivedFromType =
		{
			Fragments._DerivedFromType__OclAny /* 0 */,
			Fragments._DerivedFromType__OclElement /* 1 */,
			Fragments._DerivedFromType__DerivedFromType /* 2 */
		};
		private static final int /*@NonNull*/ [] __DerivedFromType = { 1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _DerivedFromType1 =
		{
			Fragments._DerivedFromType1__OclAny /* 0 */,
			Fragments._DerivedFromType1__OclElement /* 1 */,
			Fragments._DerivedFromType1__DerivedFromType1 /* 2 */
		};
		private static final int /*@NonNull*/ [] __DerivedFromType1 = { 1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _DerivedFromType2 =
		{
			Fragments._DerivedFromType2__OclAny /* 0 */,
			Fragments._DerivedFromType2__OclElement /* 1 */,
			Fragments._DerivedFromType2__DerivedFromType2 /* 2 */
		};
		private static final int /*@NonNull*/ [] __DerivedFromType2 = { 1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _DocumentRoot =
		{
			Fragments._DocumentRoot__OclAny /* 0 */,
			Fragments._DocumentRoot__OclElement /* 1 */,
			Fragments._DocumentRoot__DocumentRoot /* 2 */
		};
		private static final int /*@NonNull*/ [] __DocumentRoot = { 1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _ExcludeType =
		{
			Fragments._ExcludeType__OclAny /* 0 */,
			Fragments._ExcludeType__OclElement /* 1 */,
			Fragments._ExcludeType__ExcludeType /* 2 */
		};
		private static final int /*@NonNull*/ [] __ExcludeType = { 1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _ExtensionsType =
		{
			Fragments._ExtensionsType__OclAny /* 0 */,
			Fragments._ExtensionsType__OclElement /* 1 */,
			Fragments._ExtensionsType__ExtensionsType /* 2 */
		};
		private static final int /*@NonNull*/ [] __ExtensionsType = { 1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _ImplementationArtifactType =
		{
			Fragments._ImplementationArtifactType__OclAny /* 0 */,
			Fragments._ImplementationArtifactType__OclElement /* 1 */,
			Fragments._ImplementationArtifactType__TExtensibleElements /* 2 */,
			Fragments._ImplementationArtifactType__TImplementationArtifact /* 3 */,
			Fragments._ImplementationArtifactType__ImplementationArtifactType /* 4 */
		};
		private static final int /*@NonNull*/ [] __ImplementationArtifactType = { 1,1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _ImportedURI =
		{
			Fragments._ImportedURI__OclAny /* 0 */,
			Fragments._ImportedURI__ImportedURI /* 1 */
		};
		private static final int /*@NonNull*/ [] __ImportedURI = { 1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _IncludeType =
		{
			Fragments._IncludeType__OclAny /* 0 */,
			Fragments._IncludeType__OclElement /* 1 */,
			Fragments._IncludeType__IncludeType /* 2 */
		};
		private static final int /*@NonNull*/ [] __IncludeType = { 1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _InputParametersType =
		{
			Fragments._InputParametersType__OclAny /* 0 */,
			Fragments._InputParametersType__OclElement /* 1 */,
			Fragments._InputParametersType__InputParametersType /* 2 */
		};
		private static final int /*@NonNull*/ [] __InputParametersType = { 1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _InputParametersType1 =
		{
			Fragments._InputParametersType1__OclAny /* 0 */,
			Fragments._InputParametersType1__OclElement /* 1 */,
			Fragments._InputParametersType1__InputParametersType1 /* 2 */
		};
		private static final int /*@NonNull*/ [] __InputParametersType1 = { 1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _InstanceStateType =
		{
			Fragments._InstanceStateType__OclAny /* 0 */,
			Fragments._InstanceStateType__OclElement /* 1 */,
			Fragments._InstanceStateType__InstanceStateType /* 2 */
		};
		private static final int /*@NonNull*/ [] __InstanceStateType = { 1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _InterfacesType =
		{
			Fragments._InterfacesType__OclAny /* 0 */,
			Fragments._InterfacesType__OclElement /* 1 */,
			Fragments._InterfacesType__InterfacesType /* 2 */
		};
		private static final int /*@NonNull*/ [] __InterfacesType = { 1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _InterfacesType1 =
		{
			Fragments._InterfacesType1__OclAny /* 0 */,
			Fragments._InterfacesType1__OclElement /* 1 */,
			Fragments._InterfacesType1__InterfacesType1 /* 2 */
		};
		private static final int /*@NonNull*/ [] __InterfacesType1 = { 1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _InterfacesType2 =
		{
			Fragments._InterfacesType2__OclAny /* 0 */,
			Fragments._InterfacesType2__OclElement /* 1 */,
			Fragments._InterfacesType2__InterfacesType2 /* 2 */
		};
		private static final int /*@NonNull*/ [] __InterfacesType2 = { 1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _MaxInstancesType =
		{
			Fragments._MaxInstancesType__OclAny /* 0 */,
			Fragments._MaxInstancesType__MaxInstancesType /* 1 */
		};
		private static final int /*@NonNull*/ [] __MaxInstancesType = { 1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _MaxInstancesType1 =
		{
			Fragments._MaxInstancesType1__OclAny /* 0 */,
			Fragments._MaxInstancesType1__MaxInstancesType1 /* 1 */
		};
		private static final int /*@NonNull*/ [] __MaxInstancesType1 = { 1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _MaxInstancesTypeMember0 =
		{
			Fragments._MaxInstancesTypeMember0__OclAny /* 0 */,
			Fragments._MaxInstancesTypeMember0__MaxInstancesTypeMember0 /* 1 */
		};
		private static final int /*@NonNull*/ [] __MaxInstancesTypeMember0 = { 1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _MaxInstancesTypeMember01 =
		{
			Fragments._MaxInstancesTypeMember01__OclAny /* 0 */,
			Fragments._MaxInstancesTypeMember01__MaxInstancesTypeMember01 /* 1 */
		};
		private static final int /*@NonNull*/ [] __MaxInstancesTypeMember01 = { 1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _MaxInstancesTypeMember1 =
		{
			Fragments._MaxInstancesTypeMember1__OclAny /* 0 */,
			Fragments._MaxInstancesTypeMember1__OclElement /* 1 */,
			Fragments._MaxInstancesTypeMember1__OclType /* 2 */,
			Fragments._MaxInstancesTypeMember1__OclEnumeration /* 3 */,
			Fragments._MaxInstancesTypeMember1__MaxInstancesTypeMember1 /* 4 */
		};
		private static final int /*@NonNull*/ [] __MaxInstancesTypeMember1 = { 1,1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _MaxInstancesTypeMember11 =
		{
			Fragments._MaxInstancesTypeMember11__OclAny /* 0 */,
			Fragments._MaxInstancesTypeMember11__OclElement /* 1 */,
			Fragments._MaxInstancesTypeMember11__OclType /* 2 */,
			Fragments._MaxInstancesTypeMember11__OclEnumeration /* 3 */,
			Fragments._MaxInstancesTypeMember11__MaxInstancesTypeMember11 /* 4 */
		};
		private static final int /*@NonNull*/ [] __MaxInstancesTypeMember11 = { 1,1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _MaxInstancesTypeMember1Object =
		{
			Fragments._MaxInstancesTypeMember1Object__OclAny /* 0 */,
			Fragments._MaxInstancesTypeMember1Object__MaxInstancesTypeMember1Object /* 1 */
		};
		private static final int /*@NonNull*/ [] __MaxInstancesTypeMember1Object = { 1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _MaxInstancesTypeMember1Object1 =
		{
			Fragments._MaxInstancesTypeMember1Object1__OclAny /* 0 */,
			Fragments._MaxInstancesTypeMember1Object1__MaxInstancesTypeMember1Object1 /* 1 */
		};
		private static final int /*@NonNull*/ [] __MaxInstancesTypeMember1Object1 = { 1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _NodeOperationType =
		{
			Fragments._NodeOperationType__OclAny /* 0 */,
			Fragments._NodeOperationType__OclElement /* 1 */,
			Fragments._NodeOperationType__NodeOperationType /* 2 */
		};
		private static final int /*@NonNull*/ [] __NodeOperationType = { 1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _NodeTypeReferenceType =
		{
			Fragments._NodeTypeReferenceType__OclAny /* 0 */,
			Fragments._NodeTypeReferenceType__OclElement /* 1 */,
			Fragments._NodeTypeReferenceType__NodeTypeReferenceType /* 2 */
		};
		private static final int /*@NonNull*/ [] __NodeTypeReferenceType = { 1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _OutputParametersType =
		{
			Fragments._OutputParametersType__OclAny /* 0 */,
			Fragments._OutputParametersType__OclElement /* 1 */,
			Fragments._OutputParametersType__OutputParametersType /* 2 */
		};
		private static final int /*@NonNull*/ [] __OutputParametersType = { 1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _OutputParametersType1 =
		{
			Fragments._OutputParametersType1__OclAny /* 0 */,
			Fragments._OutputParametersType1__OclElement /* 1 */,
			Fragments._OutputParametersType1__OutputParametersType1 /* 2 */
		};
		private static final int /*@NonNull*/ [] __OutputParametersType1 = { 1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _PlanModelReferenceType =
		{
			Fragments._PlanModelReferenceType__OclAny /* 0 */,
			Fragments._PlanModelReferenceType__OclElement /* 1 */,
			Fragments._PlanModelReferenceType__PlanModelReferenceType /* 2 */
		};
		private static final int /*@NonNull*/ [] __PlanModelReferenceType = { 1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _PlanModelType =
		{
			Fragments._PlanModelType__OclAny /* 0 */,
			Fragments._PlanModelType__OclElement /* 1 */,
			Fragments._PlanModelType__PlanModelType /* 2 */
		};
		private static final int /*@NonNull*/ [] __PlanModelType = { 1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _PlanType =
		{
			Fragments._PlanType__OclAny /* 0 */,
			Fragments._PlanType__OclElement /* 1 */,
			Fragments._PlanType__PlanType /* 2 */
		};
		private static final int /*@NonNull*/ [] __PlanType = { 1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _PoliciesType =
		{
			Fragments._PoliciesType__OclAny /* 0 */,
			Fragments._PoliciesType__OclElement /* 1 */,
			Fragments._PoliciesType__PoliciesType /* 2 */
		};
		private static final int /*@NonNull*/ [] __PoliciesType = { 1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _PoliciesType1 =
		{
			Fragments._PoliciesType1__OclAny /* 0 */,
			Fragments._PoliciesType1__OclElement /* 1 */,
			Fragments._PoliciesType1__PoliciesType1 /* 2 */
		};
		private static final int /*@NonNull*/ [] __PoliciesType1 = { 1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _PoliciesType2 =
		{
			Fragments._PoliciesType2__OclAny /* 0 */,
			Fragments._PoliciesType2__OclElement /* 1 */,
			Fragments._PoliciesType2__PoliciesType2 /* 2 */
		};
		private static final int /*@NonNull*/ [] __PoliciesType2 = { 1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _PropertiesDefinitionType =
		{
			Fragments._PropertiesDefinitionType__OclAny /* 0 */,
			Fragments._PropertiesDefinitionType__OclElement /* 1 */,
			Fragments._PropertiesDefinitionType__PropertiesDefinitionType /* 2 */
		};
		private static final int /*@NonNull*/ [] __PropertiesDefinitionType = { 1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _PropertiesType =
		{
			Fragments._PropertiesType__OclAny /* 0 */,
			Fragments._PropertiesType__OclElement /* 1 */,
			Fragments._PropertiesType__PropertiesType /* 2 */
		};
		private static final int /*@NonNull*/ [] __PropertiesType = { 1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _PropertiesType1 =
		{
			Fragments._PropertiesType1__OclAny /* 0 */,
			Fragments._PropertiesType1__OclElement /* 1 */,
			Fragments._PropertiesType1__PropertiesType1 /* 2 */
		};
		private static final int /*@NonNull*/ [] __PropertiesType1 = { 1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _PropertyConstraintsType =
		{
			Fragments._PropertyConstraintsType__OclAny /* 0 */,
			Fragments._PropertyConstraintsType__OclElement /* 1 */,
			Fragments._PropertyConstraintsType__PropertyConstraintsType /* 2 */
		};
		private static final int /*@NonNull*/ [] __PropertyConstraintsType = { 1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _PropertyConstraintsType1 =
		{
			Fragments._PropertyConstraintsType1__OclAny /* 0 */,
			Fragments._PropertyConstraintsType1__OclElement /* 1 */,
			Fragments._PropertyConstraintsType1__PropertyConstraintsType1 /* 2 */
		};
		private static final int /*@NonNull*/ [] __PropertyConstraintsType1 = { 1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _PropertyMappingsType =
		{
			Fragments._PropertyMappingsType__OclAny /* 0 */,
			Fragments._PropertyMappingsType__OclElement /* 1 */,
			Fragments._PropertyMappingsType__PropertyMappingsType /* 2 */
		};
		private static final int /*@NonNull*/ [] __PropertyMappingsType = { 1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _RelationshipConstraintType =
		{
			Fragments._RelationshipConstraintType__OclAny /* 0 */,
			Fragments._RelationshipConstraintType__OclElement /* 1 */,
			Fragments._RelationshipConstraintType__RelationshipConstraintType /* 2 */
		};
		private static final int /*@NonNull*/ [] __RelationshipConstraintType = { 1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _RelationshipConstraintsType =
		{
			Fragments._RelationshipConstraintsType__OclAny /* 0 */,
			Fragments._RelationshipConstraintsType__OclElement /* 1 */,
			Fragments._RelationshipConstraintsType__RelationshipConstraintsType /* 2 */
		};
		private static final int /*@NonNull*/ [] __RelationshipConstraintsType = { 1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _RelationshipOperationType =
		{
			Fragments._RelationshipOperationType__OclAny /* 0 */,
			Fragments._RelationshipOperationType__OclElement /* 1 */,
			Fragments._RelationshipOperationType__RelationshipOperationType /* 2 */
		};
		private static final int /*@NonNull*/ [] __RelationshipOperationType = { 1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _RequirementDefinitionsType =
		{
			Fragments._RequirementDefinitionsType__OclAny /* 0 */,
			Fragments._RequirementDefinitionsType__OclElement /* 1 */,
			Fragments._RequirementDefinitionsType__RequirementDefinitionsType /* 2 */
		};
		private static final int /*@NonNull*/ [] __RequirementDefinitionsType = { 1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _RequirementDefinitionsType1 =
		{
			Fragments._RequirementDefinitionsType1__OclAny /* 0 */,
			Fragments._RequirementDefinitionsType1__OclElement /* 1 */,
			Fragments._RequirementDefinitionsType1__RequirementDefinitionsType1 /* 2 */
		};
		private static final int /*@NonNull*/ [] __RequirementDefinitionsType1 = { 1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _RequirementsType =
		{
			Fragments._RequirementsType__OclAny /* 0 */,
			Fragments._RequirementsType__OclElement /* 1 */,
			Fragments._RequirementsType__RequirementsType /* 2 */
		};
		private static final int /*@NonNull*/ [] __RequirementsType = { 1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _RequirementsType1 =
		{
			Fragments._RequirementsType1__OclAny /* 0 */,
			Fragments._RequirementsType1__OclElement /* 1 */,
			Fragments._RequirementsType1__RequirementsType1 /* 2 */
		};
		private static final int /*@NonNull*/ [] __RequirementsType1 = { 1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _RequirementsType2 =
		{
			Fragments._RequirementsType2__OclAny /* 0 */,
			Fragments._RequirementsType2__OclElement /* 1 */,
			Fragments._RequirementsType2__RequirementsType2 /* 2 */
		};
		private static final int /*@NonNull*/ [] __RequirementsType2 = { 1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _SourceElementType =
		{
			Fragments._SourceElementType__OclAny /* 0 */,
			Fragments._SourceElementType__OclElement /* 1 */,
			Fragments._SourceElementType__SourceElementType /* 2 */
		};
		private static final int /*@NonNull*/ [] __SourceElementType = { 1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _SourceInterfacesType =
		{
			Fragments._SourceInterfacesType__OclAny /* 0 */,
			Fragments._SourceInterfacesType__OclElement /* 1 */,
			Fragments._SourceInterfacesType__SourceInterfacesType /* 2 */
		};
		private static final int /*@NonNull*/ [] __SourceInterfacesType = { 1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _TAppliesTo =
		{
			Fragments._TAppliesTo__OclAny /* 0 */,
			Fragments._TAppliesTo__OclElement /* 1 */,
			Fragments._TAppliesTo__TAppliesTo /* 2 */
		};
		private static final int /*@NonNull*/ [] __TAppliesTo = { 1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _TArtifactReference =
		{
			Fragments._TArtifactReference__OclAny /* 0 */,
			Fragments._TArtifactReference__OclElement /* 1 */,
			Fragments._TArtifactReference__TArtifactReference /* 2 */
		};
		private static final int /*@NonNull*/ [] __TArtifactReference = { 1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _TArtifactTemplate =
		{
			Fragments._TArtifactTemplate__OclAny /* 0 */,
			Fragments._TArtifactTemplate__OclElement /* 1 */,
			Fragments._TArtifactTemplate__TExtensibleElements /* 2 */,
			Fragments._TArtifactTemplate__TEntityTemplate /* 3 */,
			Fragments._TArtifactTemplate__TArtifactTemplate /* 4 */
		};
		private static final int /*@NonNull*/ [] __TArtifactTemplate = { 1,1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _TArtifactType =
		{
			Fragments._TArtifactType__OclAny /* 0 */,
			Fragments._TArtifactType__OclElement /* 1 */,
			Fragments._TArtifactType__TExtensibleElements /* 2 */,
			Fragments._TArtifactType__TEntityType /* 3 */,
			Fragments._TArtifactType__TArtifactType /* 4 */
		};
		private static final int /*@NonNull*/ [] __TArtifactType = { 1,1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _TBoolean =
		{
			Fragments._TBoolean__OclAny /* 0 */,
			Fragments._TBoolean__OclElement /* 1 */,
			Fragments._TBoolean__OclType /* 2 */,
			Fragments._TBoolean__OclEnumeration /* 3 */,
			Fragments._TBoolean__TBoolean /* 4 */
		};
		private static final int /*@NonNull*/ [] __TBoolean = { 1,1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _TBooleanObject =
		{
			Fragments._TBooleanObject__OclAny /* 0 */,
			Fragments._TBooleanObject__TBooleanObject /* 1 */
		};
		private static final int /*@NonNull*/ [] __TBooleanObject = { 1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _TBoundaryDefinitions =
		{
			Fragments._TBoundaryDefinitions__OclAny /* 0 */,
			Fragments._TBoundaryDefinitions__OclElement /* 1 */,
			Fragments._TBoundaryDefinitions__TBoundaryDefinitions /* 2 */
		};
		private static final int /*@NonNull*/ [] __TBoundaryDefinitions = { 1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _TCapability =
		{
			Fragments._TCapability__OclAny /* 0 */,
			Fragments._TCapability__OclElement /* 1 */,
			Fragments._TCapability__TExtensibleElements /* 2 */,
			Fragments._TCapability__TEntityTemplate /* 3 */,
			Fragments._TCapability__TCapability /* 4 */
		};
		private static final int /*@NonNull*/ [] __TCapability = { 1,1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _TCapabilityDefinition =
		{
			Fragments._TCapabilityDefinition__OclAny /* 0 */,
			Fragments._TCapabilityDefinition__OclElement /* 1 */,
			Fragments._TCapabilityDefinition__TExtensibleElements /* 2 */,
			Fragments._TCapabilityDefinition__TCapabilityDefinition /* 3 */
		};
		private static final int /*@NonNull*/ [] __TCapabilityDefinition = { 1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _TCapabilityRef =
		{
			Fragments._TCapabilityRef__OclAny /* 0 */,
			Fragments._TCapabilityRef__OclElement /* 1 */,
			Fragments._TCapabilityRef__TCapabilityRef /* 2 */
		};
		private static final int /*@NonNull*/ [] __TCapabilityRef = { 1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _TCapabilityType =
		{
			Fragments._TCapabilityType__OclAny /* 0 */,
			Fragments._TCapabilityType__OclElement /* 1 */,
			Fragments._TCapabilityType__TExtensibleElements /* 2 */,
			Fragments._TCapabilityType__TEntityType /* 3 */,
			Fragments._TCapabilityType__TCapabilityType /* 4 */
		};
		private static final int /*@NonNull*/ [] __TCapabilityType = { 1,1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _TCondition =
		{
			Fragments._TCondition__OclAny /* 0 */,
			Fragments._TCondition__OclElement /* 1 */,
			Fragments._TCondition__TCondition /* 2 */
		};
		private static final int /*@NonNull*/ [] __TCondition = { 1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _TConstraint =
		{
			Fragments._TConstraint__OclAny /* 0 */,
			Fragments._TConstraint__OclElement /* 1 */,
			Fragments._TConstraint__TConstraint /* 2 */
		};
		private static final int /*@NonNull*/ [] __TConstraint = { 1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _TDefinitions =
		{
			Fragments._TDefinitions__OclAny /* 0 */,
			Fragments._TDefinitions__OclElement /* 1 */,
			Fragments._TDefinitions__TExtensibleElements /* 2 */,
			Fragments._TDefinitions__TDefinitions /* 3 */
		};
		private static final int /*@NonNull*/ [] __TDefinitions = { 1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _TDeploymentArtifact =
		{
			Fragments._TDeploymentArtifact__OclAny /* 0 */,
			Fragments._TDeploymentArtifact__OclElement /* 1 */,
			Fragments._TDeploymentArtifact__TExtensibleElements /* 2 */,
			Fragments._TDeploymentArtifact__TDeploymentArtifact /* 3 */
		};
		private static final int /*@NonNull*/ [] __TDeploymentArtifact = { 1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _TDeploymentArtifacts =
		{
			Fragments._TDeploymentArtifacts__OclAny /* 0 */,
			Fragments._TDeploymentArtifacts__OclElement /* 1 */,
			Fragments._TDeploymentArtifacts__TDeploymentArtifacts /* 2 */
		};
		private static final int /*@NonNull*/ [] __TDeploymentArtifacts = { 1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _TDocumentation =
		{
			Fragments._TDocumentation__OclAny /* 0 */,
			Fragments._TDocumentation__OclElement /* 1 */,
			Fragments._TDocumentation__TDocumentation /* 2 */
		};
		private static final int /*@NonNull*/ [] __TDocumentation = { 1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _TEntityTemplate =
		{
			Fragments._TEntityTemplate__OclAny /* 0 */,
			Fragments._TEntityTemplate__OclElement /* 1 */,
			Fragments._TEntityTemplate__TExtensibleElements /* 2 */,
			Fragments._TEntityTemplate__TEntityTemplate /* 3 */
		};
		private static final int /*@NonNull*/ [] __TEntityTemplate = { 1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _TEntityType =
		{
			Fragments._TEntityType__OclAny /* 0 */,
			Fragments._TEntityType__OclElement /* 1 */,
			Fragments._TEntityType__TExtensibleElements /* 2 */,
			Fragments._TEntityType__TEntityType /* 3 */
		};
		private static final int /*@NonNull*/ [] __TEntityType = { 1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _TExportedInterface =
		{
			Fragments._TExportedInterface__OclAny /* 0 */,
			Fragments._TExportedInterface__OclElement /* 1 */,
			Fragments._TExportedInterface__TExportedInterface /* 2 */
		};
		private static final int /*@NonNull*/ [] __TExportedInterface = { 1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _TExportedOperation =
		{
			Fragments._TExportedOperation__OclAny /* 0 */,
			Fragments._TExportedOperation__OclElement /* 1 */,
			Fragments._TExportedOperation__TExportedOperation /* 2 */
		};
		private static final int /*@NonNull*/ [] __TExportedOperation = { 1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _TExtensibleElements =
		{
			Fragments._TExtensibleElements__OclAny /* 0 */,
			Fragments._TExtensibleElements__OclElement /* 1 */,
			Fragments._TExtensibleElements__TExtensibleElements /* 2 */
		};
		private static final int /*@NonNull*/ [] __TExtensibleElements = { 1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _TExtension =
		{
			Fragments._TExtension__OclAny /* 0 */,
			Fragments._TExtension__OclElement /* 1 */,
			Fragments._TExtension__TExtensibleElements /* 2 */,
			Fragments._TExtension__TExtension /* 3 */
		};
		private static final int /*@NonNull*/ [] __TExtension = { 1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _TExtensions =
		{
			Fragments._TExtensions__OclAny /* 0 */,
			Fragments._TExtensions__OclElement /* 1 */,
			Fragments._TExtensions__TExtensibleElements /* 2 */,
			Fragments._TExtensions__TExtensions /* 3 */
		};
		private static final int /*@NonNull*/ [] __TExtensions = { 1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _TGroupTemplate =
		{
			Fragments._TGroupTemplate__OclAny /* 0 */,
			Fragments._TGroupTemplate__OclElement /* 1 */,
			Fragments._TGroupTemplate__TExtensibleElements /* 2 */,
			Fragments._TGroupTemplate__TEntityTemplate /* 3 */,
			Fragments._TGroupTemplate__TGroupTemplate /* 4 */
		};
		private static final int /*@NonNull*/ [] __TGroupTemplate = { 1,1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _TGroupType =
		{
			Fragments._TGroupType__OclAny /* 0 */,
			Fragments._TGroupType__OclElement /* 1 */,
			Fragments._TGroupType__TExtensibleElements /* 2 */,
			Fragments._TGroupType__TEntityType /* 3 */,
			Fragments._TGroupType__TGroupType /* 4 */
		};
		private static final int /*@NonNull*/ [] __TGroupType = { 1,1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _TImplementationArtifact =
		{
			Fragments._TImplementationArtifact__OclAny /* 0 */,
			Fragments._TImplementationArtifact__OclElement /* 1 */,
			Fragments._TImplementationArtifact__TExtensibleElements /* 2 */,
			Fragments._TImplementationArtifact__TImplementationArtifact /* 3 */
		};
		private static final int /*@NonNull*/ [] __TImplementationArtifact = { 1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _TImplementationArtifacts =
		{
			Fragments._TImplementationArtifacts__OclAny /* 0 */,
			Fragments._TImplementationArtifacts__OclElement /* 1 */,
			Fragments._TImplementationArtifacts__TImplementationArtifacts /* 2 */
		};
		private static final int /*@NonNull*/ [] __TImplementationArtifacts = { 1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _TImport =
		{
			Fragments._TImport__OclAny /* 0 */,
			Fragments._TImport__OclElement /* 1 */,
			Fragments._TImport__TExtensibleElements /* 2 */,
			Fragments._TImport__TImport /* 3 */
		};
		private static final int /*@NonNull*/ [] __TImport = { 1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _TInterface =
		{
			Fragments._TInterface__OclAny /* 0 */,
			Fragments._TInterface__OclElement /* 1 */,
			Fragments._TInterface__TInterface /* 2 */
		};
		private static final int /*@NonNull*/ [] __TInterface = { 1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _TNodeTemplate =
		{
			Fragments._TNodeTemplate__OclAny /* 0 */,
			Fragments._TNodeTemplate__OclElement /* 1 */,
			Fragments._TNodeTemplate__TExtensibleElements /* 2 */,
			Fragments._TNodeTemplate__TEntityTemplate /* 3 */,
			Fragments._TNodeTemplate__TNodeTemplate /* 4 */
		};
		private static final int /*@NonNull*/ [] __TNodeTemplate = { 1,1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _TNodeType =
		{
			Fragments._TNodeType__OclAny /* 0 */,
			Fragments._TNodeType__OclElement /* 1 */,
			Fragments._TNodeType__TExtensibleElements /* 2 */,
			Fragments._TNodeType__TEntityType /* 3 */,
			Fragments._TNodeType__TNodeType /* 4 */
		};
		private static final int /*@NonNull*/ [] __TNodeType = { 1,1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _TNodeTypeImplementation =
		{
			Fragments._TNodeTypeImplementation__OclAny /* 0 */,
			Fragments._TNodeTypeImplementation__OclElement /* 1 */,
			Fragments._TNodeTypeImplementation__TExtensibleElements /* 2 */,
			Fragments._TNodeTypeImplementation__TNodeTypeImplementation /* 3 */
		};
		private static final int /*@NonNull*/ [] __TNodeTypeImplementation = { 1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _TOperation =
		{
			Fragments._TOperation__OclAny /* 0 */,
			Fragments._TOperation__OclElement /* 1 */,
			Fragments._TOperation__TExtensibleElements /* 2 */,
			Fragments._TOperation__TOperation /* 3 */
		};
		private static final int /*@NonNull*/ [] __TOperation = { 1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _TParameter =
		{
			Fragments._TParameter__OclAny /* 0 */,
			Fragments._TParameter__OclElement /* 1 */,
			Fragments._TParameter__TParameter /* 2 */
		};
		private static final int /*@NonNull*/ [] __TParameter = { 1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _TPlan =
		{
			Fragments._TPlan__OclAny /* 0 */,
			Fragments._TPlan__OclElement /* 1 */,
			Fragments._TPlan__TExtensibleElements /* 2 */,
			Fragments._TPlan__TPlan /* 3 */
		};
		private static final int /*@NonNull*/ [] __TPlan = { 1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _TPlans =
		{
			Fragments._TPlans__OclAny /* 0 */,
			Fragments._TPlans__OclElement /* 1 */,
			Fragments._TPlans__TPlans /* 2 */
		};
		private static final int /*@NonNull*/ [] __TPlans = { 1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _TPolicy =
		{
			Fragments._TPolicy__OclAny /* 0 */,
			Fragments._TPolicy__OclElement /* 1 */,
			Fragments._TPolicy__TExtensibleElements /* 2 */,
			Fragments._TPolicy__TPolicy /* 3 */
		};
		private static final int /*@NonNull*/ [] __TPolicy = { 1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _TPolicyTemplate =
		{
			Fragments._TPolicyTemplate__OclAny /* 0 */,
			Fragments._TPolicyTemplate__OclElement /* 1 */,
			Fragments._TPolicyTemplate__TExtensibleElements /* 2 */,
			Fragments._TPolicyTemplate__TEntityTemplate /* 3 */,
			Fragments._TPolicyTemplate__TPolicyTemplate /* 4 */
		};
		private static final int /*@NonNull*/ [] __TPolicyTemplate = { 1,1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _TPolicyType =
		{
			Fragments._TPolicyType__OclAny /* 0 */,
			Fragments._TPolicyType__OclElement /* 1 */,
			Fragments._TPolicyType__TExtensibleElements /* 2 */,
			Fragments._TPolicyType__TEntityType /* 3 */,
			Fragments._TPolicyType__TPolicyType /* 4 */
		};
		private static final int /*@NonNull*/ [] __TPolicyType = { 1,1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _TPropertyConstraint =
		{
			Fragments._TPropertyConstraint__OclAny /* 0 */,
			Fragments._TPropertyConstraint__OclElement /* 1 */,
			Fragments._TPropertyConstraint__TConstraint /* 2 */,
			Fragments._TPropertyConstraint__TPropertyConstraint /* 3 */
		};
		private static final int /*@NonNull*/ [] __TPropertyConstraint = { 1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _TPropertyMapping =
		{
			Fragments._TPropertyMapping__OclAny /* 0 */,
			Fragments._TPropertyMapping__OclElement /* 1 */,
			Fragments._TPropertyMapping__TPropertyMapping /* 2 */
		};
		private static final int /*@NonNull*/ [] __TPropertyMapping = { 1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _TRelationshipTemplate =
		{
			Fragments._TRelationshipTemplate__OclAny /* 0 */,
			Fragments._TRelationshipTemplate__OclElement /* 1 */,
			Fragments._TRelationshipTemplate__TExtensibleElements /* 2 */,
			Fragments._TRelationshipTemplate__TEntityTemplate /* 3 */,
			Fragments._TRelationshipTemplate__TRelationshipTemplate /* 4 */
		};
		private static final int /*@NonNull*/ [] __TRelationshipTemplate = { 1,1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _TRelationshipType =
		{
			Fragments._TRelationshipType__OclAny /* 0 */,
			Fragments._TRelationshipType__OclElement /* 1 */,
			Fragments._TRelationshipType__TExtensibleElements /* 2 */,
			Fragments._TRelationshipType__TEntityType /* 3 */,
			Fragments._TRelationshipType__TRelationshipType /* 4 */
		};
		private static final int /*@NonNull*/ [] __TRelationshipType = { 1,1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _TRelationshipTypeImplementation =
		{
			Fragments._TRelationshipTypeImplementation__OclAny /* 0 */,
			Fragments._TRelationshipTypeImplementation__OclElement /* 1 */,
			Fragments._TRelationshipTypeImplementation__TExtensibleElements /* 2 */,
			Fragments._TRelationshipTypeImplementation__TRelationshipTypeImplementation /* 3 */
		};
		private static final int /*@NonNull*/ [] __TRelationshipTypeImplementation = { 1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _TRequiredContainerFeature =
		{
			Fragments._TRequiredContainerFeature__OclAny /* 0 */,
			Fragments._TRequiredContainerFeature__OclElement /* 1 */,
			Fragments._TRequiredContainerFeature__TRequiredContainerFeature /* 2 */
		};
		private static final int /*@NonNull*/ [] __TRequiredContainerFeature = { 1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _TRequiredContainerFeatures =
		{
			Fragments._TRequiredContainerFeatures__OclAny /* 0 */,
			Fragments._TRequiredContainerFeatures__OclElement /* 1 */,
			Fragments._TRequiredContainerFeatures__TRequiredContainerFeatures /* 2 */
		};
		private static final int /*@NonNull*/ [] __TRequiredContainerFeatures = { 1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _TRequirement =
		{
			Fragments._TRequirement__OclAny /* 0 */,
			Fragments._TRequirement__OclElement /* 1 */,
			Fragments._TRequirement__TExtensibleElements /* 2 */,
			Fragments._TRequirement__TEntityTemplate /* 3 */,
			Fragments._TRequirement__TRequirement /* 4 */
		};
		private static final int /*@NonNull*/ [] __TRequirement = { 1,1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _TRequirementDefinition =
		{
			Fragments._TRequirementDefinition__OclAny /* 0 */,
			Fragments._TRequirementDefinition__OclElement /* 1 */,
			Fragments._TRequirementDefinition__TExtensibleElements /* 2 */,
			Fragments._TRequirementDefinition__TRequirementDefinition /* 3 */
		};
		private static final int /*@NonNull*/ [] __TRequirementDefinition = { 1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _TRequirementRef =
		{
			Fragments._TRequirementRef__OclAny /* 0 */,
			Fragments._TRequirementRef__OclElement /* 1 */,
			Fragments._TRequirementRef__TRequirementRef /* 2 */
		};
		private static final int /*@NonNull*/ [] __TRequirementRef = { 1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _TRequirementType =
		{
			Fragments._TRequirementType__OclAny /* 0 */,
			Fragments._TRequirementType__OclElement /* 1 */,
			Fragments._TRequirementType__TExtensibleElements /* 2 */,
			Fragments._TRequirementType__TEntityType /* 3 */,
			Fragments._TRequirementType__TRequirementType /* 4 */
		};
		private static final int /*@NonNull*/ [] __TRequirementType = { 1,1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _TServiceTemplate =
		{
			Fragments._TServiceTemplate__OclAny /* 0 */,
			Fragments._TServiceTemplate__OclElement /* 1 */,
			Fragments._TServiceTemplate__TExtensibleElements /* 2 */,
			Fragments._TServiceTemplate__TServiceTemplate /* 3 */
		};
		private static final int /*@NonNull*/ [] __TServiceTemplate = { 1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _TTag =
		{
			Fragments._TTag__OclAny /* 0 */,
			Fragments._TTag__OclElement /* 1 */,
			Fragments._TTag__TTag /* 2 */
		};
		private static final int /*@NonNull*/ [] __TTag = { 1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _TTags =
		{
			Fragments._TTags__OclAny /* 0 */,
			Fragments._TTags__OclElement /* 1 */,
			Fragments._TTags__TTags /* 2 */
		};
		private static final int /*@NonNull*/ [] __TTags = { 1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _TTopologyElementInstanceStates =
		{
			Fragments._TTopologyElementInstanceStates__OclAny /* 0 */,
			Fragments._TTopologyElementInstanceStates__OclElement /* 1 */,
			Fragments._TTopologyElementInstanceStates__TTopologyElementInstanceStates /* 2 */
		};
		private static final int /*@NonNull*/ [] __TTopologyElementInstanceStates = { 1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _TTopologyTemplate =
		{
			Fragments._TTopologyTemplate__OclAny /* 0 */,
			Fragments._TTopologyTemplate__OclElement /* 1 */,
			Fragments._TTopologyTemplate__TExtensibleElements /* 2 */,
			Fragments._TTopologyTemplate__TTopologyTemplate /* 3 */
		};
		private static final int /*@NonNull*/ [] __TTopologyTemplate = { 1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _TargetElementType =
		{
			Fragments._TargetElementType__OclAny /* 0 */,
			Fragments._TargetElementType__OclElement /* 1 */,
			Fragments._TargetElementType__TargetElementType /* 2 */
		};
		private static final int /*@NonNull*/ [] __TargetElementType = { 1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _TargetInterfacesType =
		{
			Fragments._TargetInterfacesType__OclAny /* 0 */,
			Fragments._TargetInterfacesType__OclElement /* 1 */,
			Fragments._TargetInterfacesType__TargetInterfacesType /* 2 */
		};
		private static final int /*@NonNull*/ [] __TargetInterfacesType = { 1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _TypesType =
		{
			Fragments._TypesType__OclAny /* 0 */,
			Fragments._TypesType__OclElement /* 1 */,
			Fragments._TypesType__TypesType /* 2 */
		};
		private static final int /*@NonNull*/ [] __TypesType = { 1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _UpperBoundType =
		{
			Fragments._UpperBoundType__OclAny /* 0 */,
			Fragments._UpperBoundType__UpperBoundType /* 1 */
		};
		private static final int /*@NonNull*/ [] __UpperBoundType = { 1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _UpperBoundType1 =
		{
			Fragments._UpperBoundType1__OclAny /* 0 */,
			Fragments._UpperBoundType1__UpperBoundType1 /* 1 */
		};
		private static final int /*@NonNull*/ [] __UpperBoundType1 = { 1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _UpperBoundTypeMember0 =
		{
			Fragments._UpperBoundTypeMember0__OclAny /* 0 */,
			Fragments._UpperBoundTypeMember0__UpperBoundTypeMember0 /* 1 */
		};
		private static final int /*@NonNull*/ [] __UpperBoundTypeMember0 = { 1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _UpperBoundTypeMember01 =
		{
			Fragments._UpperBoundTypeMember01__OclAny /* 0 */,
			Fragments._UpperBoundTypeMember01__UpperBoundTypeMember01 /* 1 */
		};
		private static final int /*@NonNull*/ [] __UpperBoundTypeMember01 = { 1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _UpperBoundTypeMember1 =
		{
			Fragments._UpperBoundTypeMember1__OclAny /* 0 */,
			Fragments._UpperBoundTypeMember1__OclElement /* 1 */,
			Fragments._UpperBoundTypeMember1__OclType /* 2 */,
			Fragments._UpperBoundTypeMember1__OclEnumeration /* 3 */,
			Fragments._UpperBoundTypeMember1__UpperBoundTypeMember1 /* 4 */
		};
		private static final int /*@NonNull*/ [] __UpperBoundTypeMember1 = { 1,1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _UpperBoundTypeMember11 =
		{
			Fragments._UpperBoundTypeMember11__OclAny /* 0 */,
			Fragments._UpperBoundTypeMember11__OclElement /* 1 */,
			Fragments._UpperBoundTypeMember11__OclType /* 2 */,
			Fragments._UpperBoundTypeMember11__OclEnumeration /* 3 */,
			Fragments._UpperBoundTypeMember11__UpperBoundTypeMember11 /* 4 */
		};
		private static final int /*@NonNull*/ [] __UpperBoundTypeMember11 = { 1,1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _UpperBoundTypeMember1Object =
		{
			Fragments._UpperBoundTypeMember1Object__OclAny /* 0 */,
			Fragments._UpperBoundTypeMember1Object__UpperBoundTypeMember1Object /* 1 */
		};
		private static final int /*@NonNull*/ [] __UpperBoundTypeMember1Object = { 1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _UpperBoundTypeMember1Object1 =
		{
			Fragments._UpperBoundTypeMember1Object1__OclAny /* 0 */,
			Fragments._UpperBoundTypeMember1Object1__UpperBoundTypeMember1Object1 /* 1 */
		};
		private static final int /*@NonNull*/ [] __UpperBoundTypeMember1Object1 = { 1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _ValidImportTypes =
		{
			Fragments._ValidImportTypes__OclAny /* 0 */,
			Fragments._ValidImportTypes__OclElement /* 1 */,
			Fragments._ValidImportTypes__OclType /* 2 */,
			Fragments._ValidImportTypes__OclEnumeration /* 3 */,
			Fragments._ValidImportTypes__ValidImportTypes /* 4 */
		};
		private static final int /*@NonNull*/ [] __ValidImportTypes = { 1,1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _ValidSourceType =
		{
			Fragments._ValidSourceType__OclAny /* 0 */,
			Fragments._ValidSourceType__OclElement /* 1 */,
			Fragments._ValidSourceType__ValidSourceType /* 2 */
		};
		private static final int /*@NonNull*/ [] __ValidSourceType = { 1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _ValidTargetType =
		{
			Fragments._ValidTargetType__OclAny /* 0 */,
			Fragments._ValidTargetType__OclElement /* 1 */,
			Fragments._ValidTargetType__ValidTargetType /* 2 */
		};
		private static final int /*@NonNull*/ [] __ValidTargetType = { 1,1,1 };

		/**
		 *	Install the fragment descriptors in the class descriptors.
		 */
		static {
			Types._ArtifactReferencesType.initFragments(_ArtifactReferencesType, __ArtifactReferencesType);
			Types._CapabilitiesType.initFragments(_CapabilitiesType, __CapabilitiesType);
			Types._CapabilitiesType1.initFragments(_CapabilitiesType1, __CapabilitiesType1);
			Types._CapabilitiesType2.initFragments(_CapabilitiesType2, __CapabilitiesType2);
			Types._CapabilityDefinitionsType.initFragments(_CapabilityDefinitionsType, __CapabilityDefinitionsType);
			Types._CapabilityDefinitionsType1.initFragments(_CapabilityDefinitionsType1, __CapabilityDefinitionsType1);
			Types._ConstraintsType.initFragments(_ConstraintsType, __ConstraintsType);
			Types._ConstraintsType1.initFragments(_ConstraintsType1, __ConstraintsType1);
			Types._DefinitionsType.initFragments(_DefinitionsType, __DefinitionsType);
			Types._DerivedFromType.initFragments(_DerivedFromType, __DerivedFromType);
			Types._DerivedFromType1.initFragments(_DerivedFromType1, __DerivedFromType1);
			Types._DerivedFromType2.initFragments(_DerivedFromType2, __DerivedFromType2);
			Types._DocumentRoot.initFragments(_DocumentRoot, __DocumentRoot);
			Types._ExcludeType.initFragments(_ExcludeType, __ExcludeType);
			Types._ExtensionsType.initFragments(_ExtensionsType, __ExtensionsType);
			Types._ImplementationArtifactType.initFragments(_ImplementationArtifactType, __ImplementationArtifactType);
			Types._ImportedURI.initFragments(_ImportedURI, __ImportedURI);
			Types._IncludeType.initFragments(_IncludeType, __IncludeType);
			Types._InputParametersType.initFragments(_InputParametersType, __InputParametersType);
			Types._InputParametersType1.initFragments(_InputParametersType1, __InputParametersType1);
			Types._InstanceStateType.initFragments(_InstanceStateType, __InstanceStateType);
			Types._InterfacesType.initFragments(_InterfacesType, __InterfacesType);
			Types._InterfacesType1.initFragments(_InterfacesType1, __InterfacesType1);
			Types._InterfacesType2.initFragments(_InterfacesType2, __InterfacesType2);
			Types._MaxInstancesType.initFragments(_MaxInstancesType, __MaxInstancesType);
			Types._MaxInstancesType1.initFragments(_MaxInstancesType1, __MaxInstancesType1);
			Types._MaxInstancesTypeMember0.initFragments(_MaxInstancesTypeMember0, __MaxInstancesTypeMember0);
			Types._MaxInstancesTypeMember01.initFragments(_MaxInstancesTypeMember01, __MaxInstancesTypeMember01);
			Types._MaxInstancesTypeMember1.initFragments(_MaxInstancesTypeMember1, __MaxInstancesTypeMember1);
			Types._MaxInstancesTypeMember11.initFragments(_MaxInstancesTypeMember11, __MaxInstancesTypeMember11);
			Types._MaxInstancesTypeMember1Object.initFragments(_MaxInstancesTypeMember1Object, __MaxInstancesTypeMember1Object);
			Types._MaxInstancesTypeMember1Object1.initFragments(_MaxInstancesTypeMember1Object1, __MaxInstancesTypeMember1Object1);
			Types._NodeOperationType.initFragments(_NodeOperationType, __NodeOperationType);
			Types._NodeTypeReferenceType.initFragments(_NodeTypeReferenceType, __NodeTypeReferenceType);
			Types._OutputParametersType.initFragments(_OutputParametersType, __OutputParametersType);
			Types._OutputParametersType1.initFragments(_OutputParametersType1, __OutputParametersType1);
			Types._PlanModelReferenceType.initFragments(_PlanModelReferenceType, __PlanModelReferenceType);
			Types._PlanModelType.initFragments(_PlanModelType, __PlanModelType);
			Types._PlanType.initFragments(_PlanType, __PlanType);
			Types._PoliciesType.initFragments(_PoliciesType, __PoliciesType);
			Types._PoliciesType1.initFragments(_PoliciesType1, __PoliciesType1);
			Types._PoliciesType2.initFragments(_PoliciesType2, __PoliciesType2);
			Types._PropertiesDefinitionType.initFragments(_PropertiesDefinitionType, __PropertiesDefinitionType);
			Types._PropertiesType.initFragments(_PropertiesType, __PropertiesType);
			Types._PropertiesType1.initFragments(_PropertiesType1, __PropertiesType1);
			Types._PropertyConstraintsType.initFragments(_PropertyConstraintsType, __PropertyConstraintsType);
			Types._PropertyConstraintsType1.initFragments(_PropertyConstraintsType1, __PropertyConstraintsType1);
			Types._PropertyMappingsType.initFragments(_PropertyMappingsType, __PropertyMappingsType);
			Types._RelationshipConstraintType.initFragments(_RelationshipConstraintType, __RelationshipConstraintType);
			Types._RelationshipConstraintsType.initFragments(_RelationshipConstraintsType, __RelationshipConstraintsType);
			Types._RelationshipOperationType.initFragments(_RelationshipOperationType, __RelationshipOperationType);
			Types._RequirementDefinitionsType.initFragments(_RequirementDefinitionsType, __RequirementDefinitionsType);
			Types._RequirementDefinitionsType1.initFragments(_RequirementDefinitionsType1, __RequirementDefinitionsType1);
			Types._RequirementsType.initFragments(_RequirementsType, __RequirementsType);
			Types._RequirementsType1.initFragments(_RequirementsType1, __RequirementsType1);
			Types._RequirementsType2.initFragments(_RequirementsType2, __RequirementsType2);
			Types._SourceElementType.initFragments(_SourceElementType, __SourceElementType);
			Types._SourceInterfacesType.initFragments(_SourceInterfacesType, __SourceInterfacesType);
			Types._TAppliesTo.initFragments(_TAppliesTo, __TAppliesTo);
			Types._TArtifactReference.initFragments(_TArtifactReference, __TArtifactReference);
			Types._TArtifactTemplate.initFragments(_TArtifactTemplate, __TArtifactTemplate);
			Types._TArtifactType.initFragments(_TArtifactType, __TArtifactType);
			Types._TBoolean.initFragments(_TBoolean, __TBoolean);
			Types._TBooleanObject.initFragments(_TBooleanObject, __TBooleanObject);
			Types._TBoundaryDefinitions.initFragments(_TBoundaryDefinitions, __TBoundaryDefinitions);
			Types._TCapability.initFragments(_TCapability, __TCapability);
			Types._TCapabilityDefinition.initFragments(_TCapabilityDefinition, __TCapabilityDefinition);
			Types._TCapabilityRef.initFragments(_TCapabilityRef, __TCapabilityRef);
			Types._TCapabilityType.initFragments(_TCapabilityType, __TCapabilityType);
			Types._TCondition.initFragments(_TCondition, __TCondition);
			Types._TConstraint.initFragments(_TConstraint, __TConstraint);
			Types._TDefinitions.initFragments(_TDefinitions, __TDefinitions);
			Types._TDeploymentArtifact.initFragments(_TDeploymentArtifact, __TDeploymentArtifact);
			Types._TDeploymentArtifacts.initFragments(_TDeploymentArtifacts, __TDeploymentArtifacts);
			Types._TDocumentation.initFragments(_TDocumentation, __TDocumentation);
			Types._TEntityTemplate.initFragments(_TEntityTemplate, __TEntityTemplate);
			Types._TEntityType.initFragments(_TEntityType, __TEntityType);
			Types._TExportedInterface.initFragments(_TExportedInterface, __TExportedInterface);
			Types._TExportedOperation.initFragments(_TExportedOperation, __TExportedOperation);
			Types._TExtensibleElements.initFragments(_TExtensibleElements, __TExtensibleElements);
			Types._TExtension.initFragments(_TExtension, __TExtension);
			Types._TExtensions.initFragments(_TExtensions, __TExtensions);
			Types._TGroupTemplate.initFragments(_TGroupTemplate, __TGroupTemplate);
			Types._TGroupType.initFragments(_TGroupType, __TGroupType);
			Types._TImplementationArtifact.initFragments(_TImplementationArtifact, __TImplementationArtifact);
			Types._TImplementationArtifacts.initFragments(_TImplementationArtifacts, __TImplementationArtifacts);
			Types._TImport.initFragments(_TImport, __TImport);
			Types._TInterface.initFragments(_TInterface, __TInterface);
			Types._TNodeTemplate.initFragments(_TNodeTemplate, __TNodeTemplate);
			Types._TNodeType.initFragments(_TNodeType, __TNodeType);
			Types._TNodeTypeImplementation.initFragments(_TNodeTypeImplementation, __TNodeTypeImplementation);
			Types._TOperation.initFragments(_TOperation, __TOperation);
			Types._TParameter.initFragments(_TParameter, __TParameter);
			Types._TPlan.initFragments(_TPlan, __TPlan);
			Types._TPlans.initFragments(_TPlans, __TPlans);
			Types._TPolicy.initFragments(_TPolicy, __TPolicy);
			Types._TPolicyTemplate.initFragments(_TPolicyTemplate, __TPolicyTemplate);
			Types._TPolicyType.initFragments(_TPolicyType, __TPolicyType);
			Types._TPropertyConstraint.initFragments(_TPropertyConstraint, __TPropertyConstraint);
			Types._TPropertyMapping.initFragments(_TPropertyMapping, __TPropertyMapping);
			Types._TRelationshipTemplate.initFragments(_TRelationshipTemplate, __TRelationshipTemplate);
			Types._TRelationshipType.initFragments(_TRelationshipType, __TRelationshipType);
			Types._TRelationshipTypeImplementation.initFragments(_TRelationshipTypeImplementation, __TRelationshipTypeImplementation);
			Types._TRequiredContainerFeature.initFragments(_TRequiredContainerFeature, __TRequiredContainerFeature);
			Types._TRequiredContainerFeatures.initFragments(_TRequiredContainerFeatures, __TRequiredContainerFeatures);
			Types._TRequirement.initFragments(_TRequirement, __TRequirement);
			Types._TRequirementDefinition.initFragments(_TRequirementDefinition, __TRequirementDefinition);
			Types._TRequirementRef.initFragments(_TRequirementRef, __TRequirementRef);
			Types._TRequirementType.initFragments(_TRequirementType, __TRequirementType);
			Types._TServiceTemplate.initFragments(_TServiceTemplate, __TServiceTemplate);
			Types._TTag.initFragments(_TTag, __TTag);
			Types._TTags.initFragments(_TTags, __TTags);
			Types._TTopologyElementInstanceStates.initFragments(_TTopologyElementInstanceStates, __TTopologyElementInstanceStates);
			Types._TTopologyTemplate.initFragments(_TTopologyTemplate, __TTopologyTemplate);
			Types._TargetElementType.initFragments(_TargetElementType, __TargetElementType);
			Types._TargetInterfacesType.initFragments(_TargetInterfacesType, __TargetInterfacesType);
			Types._TypesType.initFragments(_TypesType, __TypesType);
			Types._UpperBoundType.initFragments(_UpperBoundType, __UpperBoundType);
			Types._UpperBoundType1.initFragments(_UpperBoundType1, __UpperBoundType1);
			Types._UpperBoundTypeMember0.initFragments(_UpperBoundTypeMember0, __UpperBoundTypeMember0);
			Types._UpperBoundTypeMember01.initFragments(_UpperBoundTypeMember01, __UpperBoundTypeMember01);
			Types._UpperBoundTypeMember1.initFragments(_UpperBoundTypeMember1, __UpperBoundTypeMember1);
			Types._UpperBoundTypeMember11.initFragments(_UpperBoundTypeMember11, __UpperBoundTypeMember11);
			Types._UpperBoundTypeMember1Object.initFragments(_UpperBoundTypeMember1Object, __UpperBoundTypeMember1Object);
			Types._UpperBoundTypeMember1Object1.initFragments(_UpperBoundTypeMember1Object1, __UpperBoundTypeMember1Object1);
			Types._ValidImportTypes.initFragments(_ValidImportTypes, __ValidImportTypes);
			Types._ValidSourceType.initFragments(_ValidSourceType, __ValidSourceType);
			Types._ValidTargetType.initFragments(_ValidTargetType, __ValidTargetType);

			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of ToscaTables::TypeFragments and all preceding sub-packages.
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

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _ArtifactReferencesType__ArtifactReferencesType = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _ArtifactReferencesType__OclAny = {
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
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _ArtifactReferencesType__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _CapabilitiesType__CapabilitiesType = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _CapabilitiesType__OclAny = {
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
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _CapabilitiesType__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _CapabilitiesType1__CapabilitiesType1 = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _CapabilitiesType1__OclAny = {
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
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _CapabilitiesType1__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _CapabilitiesType2__CapabilitiesType2 = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _CapabilitiesType2__OclAny = {
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
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _CapabilitiesType2__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _CapabilityDefinitionsType__CapabilityDefinitionsType = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _CapabilityDefinitionsType__OclAny = {
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
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _CapabilityDefinitionsType__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _CapabilityDefinitionsType1__CapabilityDefinitionsType1 = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _CapabilityDefinitionsType1__OclAny = {
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
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _CapabilityDefinitionsType1__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _ConstraintsType__ConstraintsType = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _ConstraintsType__OclAny = {
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
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _ConstraintsType__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _ConstraintsType1__ConstraintsType1 = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _ConstraintsType1__OclAny = {
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
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _ConstraintsType1__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _DefinitionsType__DefinitionsType = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _DefinitionsType__OclAny = {
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
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _DefinitionsType__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _DefinitionsType__TDefinitions = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _DefinitionsType__TExtensibleElements = {};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _DerivedFromType__DerivedFromType = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _DerivedFromType__OclAny = {
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
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _DerivedFromType__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _DerivedFromType1__DerivedFromType1 = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _DerivedFromType1__OclAny = {
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
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _DerivedFromType1__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _DerivedFromType2__DerivedFromType2 = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _DerivedFromType2__OclAny = {
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
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _DerivedFromType2__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _DocumentRoot__DocumentRoot = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _DocumentRoot__OclAny = {
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
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _DocumentRoot__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _ExcludeType__ExcludeType = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _ExcludeType__OclAny = {
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
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _ExcludeType__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _ExtensionsType__ExtensionsType = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _ExtensionsType__OclAny = {
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
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _ExtensionsType__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _ImplementationArtifactType__ImplementationArtifactType = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _ImplementationArtifactType__OclAny = {
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
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _ImplementationArtifactType__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _ImplementationArtifactType__TExtensibleElements = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _ImplementationArtifactType__TImplementationArtifact = {};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _ImportedURI__ImportedURI = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _ImportedURI__OclAny = {
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

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _IncludeType__IncludeType = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _IncludeType__OclAny = {
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
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _IncludeType__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _InputParametersType__InputParametersType = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _InputParametersType__OclAny = {
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
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _InputParametersType__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _InputParametersType1__InputParametersType1 = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _InputParametersType1__OclAny = {
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
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _InputParametersType1__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _InstanceStateType__InstanceStateType = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _InstanceStateType__OclAny = {
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
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _InstanceStateType__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _InterfacesType__InterfacesType = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _InterfacesType__OclAny = {
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
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _InterfacesType__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _InterfacesType1__InterfacesType1 = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _InterfacesType1__OclAny = {
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
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _InterfacesType1__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _InterfacesType2__InterfacesType2 = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _InterfacesType2__OclAny = {
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
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _InterfacesType2__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _MaxInstancesType__MaxInstancesType = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _MaxInstancesType__OclAny = {
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

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _MaxInstancesType1__MaxInstancesType1 = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _MaxInstancesType1__OclAny = {
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

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _MaxInstancesTypeMember0__MaxInstancesTypeMember0 = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _MaxInstancesTypeMember0__OclAny = {
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

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _MaxInstancesTypeMember01__MaxInstancesTypeMember01 = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _MaxInstancesTypeMember01__OclAny = {
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

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _MaxInstancesTypeMember1__MaxInstancesTypeMember1 = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _MaxInstancesTypeMember1__OclAny = {
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
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _MaxInstancesTypeMember1__OclElement = {
			OCLstdlibTables.Operations._OclEnumeration__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _MaxInstancesTypeMember1__OclEnumeration = {
			OCLstdlibTables.Operations._OclEnumeration__allInstances /* allInstances() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _MaxInstancesTypeMember1__OclType = {
			OCLstdlibTables.Operations._OclType__conformsTo /* conformsTo(OclType[?]) */
		};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _MaxInstancesTypeMember11__MaxInstancesTypeMember11 = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _MaxInstancesTypeMember11__OclAny = {
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
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _MaxInstancesTypeMember11__OclElement = {
			OCLstdlibTables.Operations._OclEnumeration__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _MaxInstancesTypeMember11__OclEnumeration = {
			OCLstdlibTables.Operations._OclEnumeration__allInstances /* allInstances() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _MaxInstancesTypeMember11__OclType = {
			OCLstdlibTables.Operations._OclType__conformsTo /* conformsTo(OclType[?]) */
		};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _MaxInstancesTypeMember1Object__MaxInstancesTypeMember1Object = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _MaxInstancesTypeMember1Object__OclAny = {
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

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _MaxInstancesTypeMember1Object1__MaxInstancesTypeMember1Object1 = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _MaxInstancesTypeMember1Object1__OclAny = {
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

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _NodeOperationType__NodeOperationType = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _NodeOperationType__OclAny = {
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
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _NodeOperationType__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _NodeTypeReferenceType__NodeTypeReferenceType = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _NodeTypeReferenceType__OclAny = {
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
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _NodeTypeReferenceType__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _OutputParametersType__OutputParametersType = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _OutputParametersType__OclAny = {
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
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _OutputParametersType__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _OutputParametersType1__OutputParametersType1 = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _OutputParametersType1__OclAny = {
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
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _OutputParametersType1__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _PlanModelReferenceType__PlanModelReferenceType = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _PlanModelReferenceType__OclAny = {
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
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _PlanModelReferenceType__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _PlanModelType__PlanModelType = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _PlanModelType__OclAny = {
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
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _PlanModelType__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _PlanType__PlanType = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _PlanType__OclAny = {
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
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _PlanType__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _PoliciesType__PoliciesType = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _PoliciesType__OclAny = {
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
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _PoliciesType__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _PoliciesType1__PoliciesType1 = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _PoliciesType1__OclAny = {
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
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _PoliciesType1__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _PoliciesType2__PoliciesType2 = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _PoliciesType2__OclAny = {
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
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _PoliciesType2__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _PropertiesDefinitionType__PropertiesDefinitionType = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _PropertiesDefinitionType__OclAny = {
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
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _PropertiesDefinitionType__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _PropertiesType__PropertiesType = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _PropertiesType__OclAny = {
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
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _PropertiesType__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _PropertiesType1__PropertiesType1 = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _PropertiesType1__OclAny = {
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
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _PropertiesType1__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _PropertyConstraintsType__PropertyConstraintsType = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _PropertyConstraintsType__OclAny = {
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
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _PropertyConstraintsType__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _PropertyConstraintsType1__PropertyConstraintsType1 = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _PropertyConstraintsType1__OclAny = {
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
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _PropertyConstraintsType1__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _PropertyMappingsType__PropertyMappingsType = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _PropertyMappingsType__OclAny = {
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
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _PropertyMappingsType__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _RelationshipConstraintType__RelationshipConstraintType = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _RelationshipConstraintType__OclAny = {
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
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _RelationshipConstraintType__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _RelationshipConstraintsType__RelationshipConstraintsType = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _RelationshipConstraintsType__OclAny = {
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
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _RelationshipConstraintsType__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _RelationshipOperationType__RelationshipOperationType = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _RelationshipOperationType__OclAny = {
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
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _RelationshipOperationType__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _RequirementDefinitionsType__RequirementDefinitionsType = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _RequirementDefinitionsType__OclAny = {
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
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _RequirementDefinitionsType__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _RequirementDefinitionsType1__RequirementDefinitionsType1 = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _RequirementDefinitionsType1__OclAny = {
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
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _RequirementDefinitionsType1__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _RequirementsType__RequirementsType = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _RequirementsType__OclAny = {
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
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _RequirementsType__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _RequirementsType1__RequirementsType1 = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _RequirementsType1__OclAny = {
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
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _RequirementsType1__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _RequirementsType2__RequirementsType2 = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _RequirementsType2__OclAny = {
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
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _RequirementsType2__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _SourceElementType__SourceElementType = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _SourceElementType__OclAny = {
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
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _SourceElementType__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _SourceInterfacesType__SourceInterfacesType = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _SourceInterfacesType__OclAny = {
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
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _SourceInterfacesType__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _TAppliesTo__TAppliesTo = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _TAppliesTo__OclAny = {
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
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _TAppliesTo__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _TArtifactReference__TArtifactReference = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _TArtifactReference__OclAny = {
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
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _TArtifactReference__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _TArtifactTemplate__TArtifactTemplate = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _TArtifactTemplate__OclAny = {
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
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _TArtifactTemplate__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _TArtifactTemplate__TEntityTemplate = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _TArtifactTemplate__TExtensibleElements = {};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _TArtifactType__TArtifactType = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _TArtifactType__OclAny = {
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
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _TArtifactType__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _TArtifactType__TEntityType = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _TArtifactType__TExtensibleElements = {};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _TBoolean__TBoolean = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _TBoolean__OclAny = {
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
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _TBoolean__OclElement = {
			OCLstdlibTables.Operations._OclEnumeration__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _TBoolean__OclEnumeration = {
			OCLstdlibTables.Operations._OclEnumeration__allInstances /* allInstances() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _TBoolean__OclType = {
			OCLstdlibTables.Operations._OclType__conformsTo /* conformsTo(OclType[?]) */
		};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _TBooleanObject__TBooleanObject = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _TBooleanObject__OclAny = {
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

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _TBoundaryDefinitions__TBoundaryDefinitions = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _TBoundaryDefinitions__OclAny = {
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
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _TBoundaryDefinitions__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _TCapability__TCapability = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _TCapability__OclAny = {
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
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _TCapability__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _TCapability__TEntityTemplate = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _TCapability__TExtensibleElements = {};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _TCapabilityDefinition__TCapabilityDefinition = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _TCapabilityDefinition__OclAny = {
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
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _TCapabilityDefinition__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _TCapabilityDefinition__TExtensibleElements = {};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _TCapabilityRef__TCapabilityRef = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _TCapabilityRef__OclAny = {
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
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _TCapabilityRef__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _TCapabilityType__TCapabilityType = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _TCapabilityType__OclAny = {
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
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _TCapabilityType__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _TCapabilityType__TEntityType = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _TCapabilityType__TExtensibleElements = {};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _TCondition__TCondition = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _TCondition__OclAny = {
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
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _TCondition__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _TConstraint__TConstraint = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _TConstraint__OclAny = {
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
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _TConstraint__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _TDefinitions__TDefinitions = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _TDefinitions__OclAny = {
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
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _TDefinitions__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _TDefinitions__TExtensibleElements = {};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _TDeploymentArtifact__TDeploymentArtifact = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _TDeploymentArtifact__OclAny = {
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
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _TDeploymentArtifact__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _TDeploymentArtifact__TExtensibleElements = {};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _TDeploymentArtifacts__TDeploymentArtifacts = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _TDeploymentArtifacts__OclAny = {
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
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _TDeploymentArtifacts__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _TDocumentation__TDocumentation = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _TDocumentation__OclAny = {
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
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _TDocumentation__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _TEntityTemplate__TEntityTemplate = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _TEntityTemplate__OclAny = {
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
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _TEntityTemplate__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _TEntityTemplate__TExtensibleElements = {};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _TEntityType__TEntityType = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _TEntityType__OclAny = {
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
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _TEntityType__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _TEntityType__TExtensibleElements = {};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _TExportedInterface__TExportedInterface = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _TExportedInterface__OclAny = {
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
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _TExportedInterface__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _TExportedOperation__TExportedOperation = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _TExportedOperation__OclAny = {
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
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _TExportedOperation__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _TExtensibleElements__TExtensibleElements = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _TExtensibleElements__OclAny = {
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
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _TExtensibleElements__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _TExtension__TExtension = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _TExtension__OclAny = {
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
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _TExtension__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _TExtension__TExtensibleElements = {};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _TExtensions__TExtensions = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _TExtensions__OclAny = {
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
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _TExtensions__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _TExtensions__TExtensibleElements = {};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _TGroupTemplate__TGroupTemplate = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _TGroupTemplate__OclAny = {
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
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _TGroupTemplate__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _TGroupTemplate__TEntityTemplate = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _TGroupTemplate__TExtensibleElements = {};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _TGroupType__TGroupType = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _TGroupType__OclAny = {
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
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _TGroupType__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _TGroupType__TEntityType = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _TGroupType__TExtensibleElements = {};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _TImplementationArtifact__TImplementationArtifact = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _TImplementationArtifact__OclAny = {
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
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _TImplementationArtifact__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _TImplementationArtifact__TExtensibleElements = {};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _TImplementationArtifacts__TImplementationArtifacts = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _TImplementationArtifacts__OclAny = {
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
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _TImplementationArtifacts__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _TImport__TImport = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _TImport__OclAny = {
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
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _TImport__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _TImport__TExtensibleElements = {};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _TInterface__TInterface = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _TInterface__OclAny = {
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
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _TInterface__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _TNodeTemplate__TNodeTemplate = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _TNodeTemplate__OclAny = {
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
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _TNodeTemplate__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _TNodeTemplate__TEntityTemplate = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _TNodeTemplate__TExtensibleElements = {};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _TNodeType__TNodeType = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _TNodeType__OclAny = {
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
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _TNodeType__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _TNodeType__TEntityType = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _TNodeType__TExtensibleElements = {};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _TNodeTypeImplementation__TNodeTypeImplementation = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _TNodeTypeImplementation__OclAny = {
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
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _TNodeTypeImplementation__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _TNodeTypeImplementation__TExtensibleElements = {};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _TOperation__TOperation = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _TOperation__OclAny = {
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
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _TOperation__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _TOperation__TExtensibleElements = {};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _TParameter__TParameter = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _TParameter__OclAny = {
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
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _TParameter__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _TPlan__TPlan = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _TPlan__OclAny = {
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
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _TPlan__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _TPlan__TExtensibleElements = {};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _TPlans__TPlans = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _TPlans__OclAny = {
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
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _TPlans__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _TPolicy__TPolicy = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _TPolicy__OclAny = {
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
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _TPolicy__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _TPolicy__TExtensibleElements = {};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _TPolicyTemplate__TPolicyTemplate = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _TPolicyTemplate__OclAny = {
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
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _TPolicyTemplate__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _TPolicyTemplate__TEntityTemplate = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _TPolicyTemplate__TExtensibleElements = {};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _TPolicyType__TPolicyType = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _TPolicyType__OclAny = {
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
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _TPolicyType__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _TPolicyType__TEntityType = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _TPolicyType__TExtensibleElements = {};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _TPropertyConstraint__TPropertyConstraint = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _TPropertyConstraint__OclAny = {
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
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _TPropertyConstraint__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _TPropertyConstraint__TConstraint = {};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _TPropertyMapping__TPropertyMapping = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _TPropertyMapping__OclAny = {
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
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _TPropertyMapping__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _TRelationshipTemplate__TRelationshipTemplate = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _TRelationshipTemplate__OclAny = {
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
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _TRelationshipTemplate__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _TRelationshipTemplate__TEntityTemplate = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _TRelationshipTemplate__TExtensibleElements = {};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _TRelationshipType__TRelationshipType = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _TRelationshipType__OclAny = {
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
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _TRelationshipType__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _TRelationshipType__TEntityType = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _TRelationshipType__TExtensibleElements = {};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _TRelationshipTypeImplementation__TRelationshipTypeImplementation = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _TRelationshipTypeImplementation__OclAny = {
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
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _TRelationshipTypeImplementation__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _TRelationshipTypeImplementation__TExtensibleElements = {};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _TRequiredContainerFeature__TRequiredContainerFeature = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _TRequiredContainerFeature__OclAny = {
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
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _TRequiredContainerFeature__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _TRequiredContainerFeatures__TRequiredContainerFeatures = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _TRequiredContainerFeatures__OclAny = {
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
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _TRequiredContainerFeatures__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _TRequirement__TRequirement = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _TRequirement__OclAny = {
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
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _TRequirement__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _TRequirement__TEntityTemplate = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _TRequirement__TExtensibleElements = {};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _TRequirementDefinition__TRequirementDefinition = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _TRequirementDefinition__OclAny = {
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
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _TRequirementDefinition__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _TRequirementDefinition__TExtensibleElements = {};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _TRequirementRef__TRequirementRef = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _TRequirementRef__OclAny = {
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
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _TRequirementRef__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _TRequirementType__TRequirementType = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _TRequirementType__OclAny = {
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
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _TRequirementType__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _TRequirementType__TEntityType = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _TRequirementType__TExtensibleElements = {};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _TServiceTemplate__TServiceTemplate = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _TServiceTemplate__OclAny = {
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
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _TServiceTemplate__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _TServiceTemplate__TExtensibleElements = {};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _TTag__TTag = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _TTag__OclAny = {
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
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _TTag__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _TTags__TTags = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _TTags__OclAny = {
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
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _TTags__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _TTopologyElementInstanceStates__TTopologyElementInstanceStates = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _TTopologyElementInstanceStates__OclAny = {
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
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _TTopologyElementInstanceStates__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _TTopologyTemplate__TTopologyTemplate = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _TTopologyTemplate__OclAny = {
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
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _TTopologyTemplate__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _TTopologyTemplate__TExtensibleElements = {};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _TargetElementType__TargetElementType = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _TargetElementType__OclAny = {
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
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _TargetElementType__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _TargetInterfacesType__TargetInterfacesType = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _TargetInterfacesType__OclAny = {
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
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _TargetInterfacesType__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _TypesType__TypesType = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _TypesType__OclAny = {
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
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _TypesType__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _UpperBoundType__UpperBoundType = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _UpperBoundType__OclAny = {
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

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _UpperBoundType1__UpperBoundType1 = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _UpperBoundType1__OclAny = {
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

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _UpperBoundTypeMember0__UpperBoundTypeMember0 = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _UpperBoundTypeMember0__OclAny = {
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

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _UpperBoundTypeMember01__UpperBoundTypeMember01 = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _UpperBoundTypeMember01__OclAny = {
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

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _UpperBoundTypeMember1__UpperBoundTypeMember1 = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _UpperBoundTypeMember1__OclAny = {
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
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _UpperBoundTypeMember1__OclElement = {
			OCLstdlibTables.Operations._OclEnumeration__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _UpperBoundTypeMember1__OclEnumeration = {
			OCLstdlibTables.Operations._OclEnumeration__allInstances /* allInstances() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _UpperBoundTypeMember1__OclType = {
			OCLstdlibTables.Operations._OclType__conformsTo /* conformsTo(OclType[?]) */
		};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _UpperBoundTypeMember11__UpperBoundTypeMember11 = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _UpperBoundTypeMember11__OclAny = {
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
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _UpperBoundTypeMember11__OclElement = {
			OCLstdlibTables.Operations._OclEnumeration__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _UpperBoundTypeMember11__OclEnumeration = {
			OCLstdlibTables.Operations._OclEnumeration__allInstances /* allInstances() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _UpperBoundTypeMember11__OclType = {
			OCLstdlibTables.Operations._OclType__conformsTo /* conformsTo(OclType[?]) */
		};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _UpperBoundTypeMember1Object__UpperBoundTypeMember1Object = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _UpperBoundTypeMember1Object__OclAny = {
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

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _UpperBoundTypeMember1Object1__UpperBoundTypeMember1Object1 = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _UpperBoundTypeMember1Object1__OclAny = {
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

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _ValidImportTypes__ValidImportTypes = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _ValidImportTypes__OclAny = {
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
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _ValidImportTypes__OclElement = {
			OCLstdlibTables.Operations._OclEnumeration__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _ValidImportTypes__OclEnumeration = {
			OCLstdlibTables.Operations._OclEnumeration__allInstances /* allInstances() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _ValidImportTypes__OclType = {
			OCLstdlibTables.Operations._OclType__conformsTo /* conformsTo(OclType[?]) */
		};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _ValidSourceType__ValidSourceType = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _ValidSourceType__OclAny = {
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
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _ValidSourceType__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _ValidTargetType__ValidTargetType = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _ValidTargetType__OclAny = {
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
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _ValidTargetType__OclElement = {
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
			Fragments._ArtifactReferencesType__ArtifactReferencesType.initOperations(_ArtifactReferencesType__ArtifactReferencesType);
			Fragments._ArtifactReferencesType__OclAny.initOperations(_ArtifactReferencesType__OclAny);
			Fragments._ArtifactReferencesType__OclElement.initOperations(_ArtifactReferencesType__OclElement);

			Fragments._CapabilitiesType__CapabilitiesType.initOperations(_CapabilitiesType__CapabilitiesType);
			Fragments._CapabilitiesType__OclAny.initOperations(_CapabilitiesType__OclAny);
			Fragments._CapabilitiesType__OclElement.initOperations(_CapabilitiesType__OclElement);

			Fragments._CapabilitiesType1__CapabilitiesType1.initOperations(_CapabilitiesType1__CapabilitiesType1);
			Fragments._CapabilitiesType1__OclAny.initOperations(_CapabilitiesType1__OclAny);
			Fragments._CapabilitiesType1__OclElement.initOperations(_CapabilitiesType1__OclElement);

			Fragments._CapabilitiesType2__CapabilitiesType2.initOperations(_CapabilitiesType2__CapabilitiesType2);
			Fragments._CapabilitiesType2__OclAny.initOperations(_CapabilitiesType2__OclAny);
			Fragments._CapabilitiesType2__OclElement.initOperations(_CapabilitiesType2__OclElement);

			Fragments._CapabilityDefinitionsType__CapabilityDefinitionsType.initOperations(_CapabilityDefinitionsType__CapabilityDefinitionsType);
			Fragments._CapabilityDefinitionsType__OclAny.initOperations(_CapabilityDefinitionsType__OclAny);
			Fragments._CapabilityDefinitionsType__OclElement.initOperations(_CapabilityDefinitionsType__OclElement);

			Fragments._CapabilityDefinitionsType1__CapabilityDefinitionsType1.initOperations(_CapabilityDefinitionsType1__CapabilityDefinitionsType1);
			Fragments._CapabilityDefinitionsType1__OclAny.initOperations(_CapabilityDefinitionsType1__OclAny);
			Fragments._CapabilityDefinitionsType1__OclElement.initOperations(_CapabilityDefinitionsType1__OclElement);

			Fragments._ConstraintsType__ConstraintsType.initOperations(_ConstraintsType__ConstraintsType);
			Fragments._ConstraintsType__OclAny.initOperations(_ConstraintsType__OclAny);
			Fragments._ConstraintsType__OclElement.initOperations(_ConstraintsType__OclElement);

			Fragments._ConstraintsType1__ConstraintsType1.initOperations(_ConstraintsType1__ConstraintsType1);
			Fragments._ConstraintsType1__OclAny.initOperations(_ConstraintsType1__OclAny);
			Fragments._ConstraintsType1__OclElement.initOperations(_ConstraintsType1__OclElement);

			Fragments._DefinitionsType__DefinitionsType.initOperations(_DefinitionsType__DefinitionsType);
			Fragments._DefinitionsType__OclAny.initOperations(_DefinitionsType__OclAny);
			Fragments._DefinitionsType__OclElement.initOperations(_DefinitionsType__OclElement);
			Fragments._DefinitionsType__TDefinitions.initOperations(_DefinitionsType__TDefinitions);
			Fragments._DefinitionsType__TExtensibleElements.initOperations(_DefinitionsType__TExtensibleElements);

			Fragments._DerivedFromType__DerivedFromType.initOperations(_DerivedFromType__DerivedFromType);
			Fragments._DerivedFromType__OclAny.initOperations(_DerivedFromType__OclAny);
			Fragments._DerivedFromType__OclElement.initOperations(_DerivedFromType__OclElement);

			Fragments._DerivedFromType1__DerivedFromType1.initOperations(_DerivedFromType1__DerivedFromType1);
			Fragments._DerivedFromType1__OclAny.initOperations(_DerivedFromType1__OclAny);
			Fragments._DerivedFromType1__OclElement.initOperations(_DerivedFromType1__OclElement);

			Fragments._DerivedFromType2__DerivedFromType2.initOperations(_DerivedFromType2__DerivedFromType2);
			Fragments._DerivedFromType2__OclAny.initOperations(_DerivedFromType2__OclAny);
			Fragments._DerivedFromType2__OclElement.initOperations(_DerivedFromType2__OclElement);

			Fragments._DocumentRoot__DocumentRoot.initOperations(_DocumentRoot__DocumentRoot);
			Fragments._DocumentRoot__OclAny.initOperations(_DocumentRoot__OclAny);
			Fragments._DocumentRoot__OclElement.initOperations(_DocumentRoot__OclElement);

			Fragments._ExcludeType__ExcludeType.initOperations(_ExcludeType__ExcludeType);
			Fragments._ExcludeType__OclAny.initOperations(_ExcludeType__OclAny);
			Fragments._ExcludeType__OclElement.initOperations(_ExcludeType__OclElement);

			Fragments._ExtensionsType__ExtensionsType.initOperations(_ExtensionsType__ExtensionsType);
			Fragments._ExtensionsType__OclAny.initOperations(_ExtensionsType__OclAny);
			Fragments._ExtensionsType__OclElement.initOperations(_ExtensionsType__OclElement);

			Fragments._ImplementationArtifactType__ImplementationArtifactType.initOperations(_ImplementationArtifactType__ImplementationArtifactType);
			Fragments._ImplementationArtifactType__OclAny.initOperations(_ImplementationArtifactType__OclAny);
			Fragments._ImplementationArtifactType__OclElement.initOperations(_ImplementationArtifactType__OclElement);
			Fragments._ImplementationArtifactType__TExtensibleElements.initOperations(_ImplementationArtifactType__TExtensibleElements);
			Fragments._ImplementationArtifactType__TImplementationArtifact.initOperations(_ImplementationArtifactType__TImplementationArtifact);

			Fragments._ImportedURI__ImportedURI.initOperations(_ImportedURI__ImportedURI);
			Fragments._ImportedURI__OclAny.initOperations(_ImportedURI__OclAny);

			Fragments._IncludeType__IncludeType.initOperations(_IncludeType__IncludeType);
			Fragments._IncludeType__OclAny.initOperations(_IncludeType__OclAny);
			Fragments._IncludeType__OclElement.initOperations(_IncludeType__OclElement);

			Fragments._InputParametersType__InputParametersType.initOperations(_InputParametersType__InputParametersType);
			Fragments._InputParametersType__OclAny.initOperations(_InputParametersType__OclAny);
			Fragments._InputParametersType__OclElement.initOperations(_InputParametersType__OclElement);

			Fragments._InputParametersType1__InputParametersType1.initOperations(_InputParametersType1__InputParametersType1);
			Fragments._InputParametersType1__OclAny.initOperations(_InputParametersType1__OclAny);
			Fragments._InputParametersType1__OclElement.initOperations(_InputParametersType1__OclElement);

			Fragments._InstanceStateType__InstanceStateType.initOperations(_InstanceStateType__InstanceStateType);
			Fragments._InstanceStateType__OclAny.initOperations(_InstanceStateType__OclAny);
			Fragments._InstanceStateType__OclElement.initOperations(_InstanceStateType__OclElement);

			Fragments._InterfacesType__InterfacesType.initOperations(_InterfacesType__InterfacesType);
			Fragments._InterfacesType__OclAny.initOperations(_InterfacesType__OclAny);
			Fragments._InterfacesType__OclElement.initOperations(_InterfacesType__OclElement);

			Fragments._InterfacesType1__InterfacesType1.initOperations(_InterfacesType1__InterfacesType1);
			Fragments._InterfacesType1__OclAny.initOperations(_InterfacesType1__OclAny);
			Fragments._InterfacesType1__OclElement.initOperations(_InterfacesType1__OclElement);

			Fragments._InterfacesType2__InterfacesType2.initOperations(_InterfacesType2__InterfacesType2);
			Fragments._InterfacesType2__OclAny.initOperations(_InterfacesType2__OclAny);
			Fragments._InterfacesType2__OclElement.initOperations(_InterfacesType2__OclElement);

			Fragments._MaxInstancesType__MaxInstancesType.initOperations(_MaxInstancesType__MaxInstancesType);
			Fragments._MaxInstancesType__OclAny.initOperations(_MaxInstancesType__OclAny);

			Fragments._MaxInstancesType1__MaxInstancesType1.initOperations(_MaxInstancesType1__MaxInstancesType1);
			Fragments._MaxInstancesType1__OclAny.initOperations(_MaxInstancesType1__OclAny);

			Fragments._MaxInstancesTypeMember0__MaxInstancesTypeMember0.initOperations(_MaxInstancesTypeMember0__MaxInstancesTypeMember0);
			Fragments._MaxInstancesTypeMember0__OclAny.initOperations(_MaxInstancesTypeMember0__OclAny);

			Fragments._MaxInstancesTypeMember01__MaxInstancesTypeMember01.initOperations(_MaxInstancesTypeMember01__MaxInstancesTypeMember01);
			Fragments._MaxInstancesTypeMember01__OclAny.initOperations(_MaxInstancesTypeMember01__OclAny);

			Fragments._MaxInstancesTypeMember1__MaxInstancesTypeMember1.initOperations(_MaxInstancesTypeMember1__MaxInstancesTypeMember1);
			Fragments._MaxInstancesTypeMember1__OclAny.initOperations(_MaxInstancesTypeMember1__OclAny);
			Fragments._MaxInstancesTypeMember1__OclElement.initOperations(_MaxInstancesTypeMember1__OclElement);
			Fragments._MaxInstancesTypeMember1__OclEnumeration.initOperations(_MaxInstancesTypeMember1__OclEnumeration);
			Fragments._MaxInstancesTypeMember1__OclType.initOperations(_MaxInstancesTypeMember1__OclType);

			Fragments._MaxInstancesTypeMember11__MaxInstancesTypeMember11.initOperations(_MaxInstancesTypeMember11__MaxInstancesTypeMember11);
			Fragments._MaxInstancesTypeMember11__OclAny.initOperations(_MaxInstancesTypeMember11__OclAny);
			Fragments._MaxInstancesTypeMember11__OclElement.initOperations(_MaxInstancesTypeMember11__OclElement);
			Fragments._MaxInstancesTypeMember11__OclEnumeration.initOperations(_MaxInstancesTypeMember11__OclEnumeration);
			Fragments._MaxInstancesTypeMember11__OclType.initOperations(_MaxInstancesTypeMember11__OclType);

			Fragments._MaxInstancesTypeMember1Object__MaxInstancesTypeMember1Object.initOperations(_MaxInstancesTypeMember1Object__MaxInstancesTypeMember1Object);
			Fragments._MaxInstancesTypeMember1Object__OclAny.initOperations(_MaxInstancesTypeMember1Object__OclAny);

			Fragments._MaxInstancesTypeMember1Object1__MaxInstancesTypeMember1Object1.initOperations(_MaxInstancesTypeMember1Object1__MaxInstancesTypeMember1Object1);
			Fragments._MaxInstancesTypeMember1Object1__OclAny.initOperations(_MaxInstancesTypeMember1Object1__OclAny);

			Fragments._NodeOperationType__NodeOperationType.initOperations(_NodeOperationType__NodeOperationType);
			Fragments._NodeOperationType__OclAny.initOperations(_NodeOperationType__OclAny);
			Fragments._NodeOperationType__OclElement.initOperations(_NodeOperationType__OclElement);

			Fragments._NodeTypeReferenceType__NodeTypeReferenceType.initOperations(_NodeTypeReferenceType__NodeTypeReferenceType);
			Fragments._NodeTypeReferenceType__OclAny.initOperations(_NodeTypeReferenceType__OclAny);
			Fragments._NodeTypeReferenceType__OclElement.initOperations(_NodeTypeReferenceType__OclElement);

			Fragments._OutputParametersType__OclAny.initOperations(_OutputParametersType__OclAny);
			Fragments._OutputParametersType__OclElement.initOperations(_OutputParametersType__OclElement);
			Fragments._OutputParametersType__OutputParametersType.initOperations(_OutputParametersType__OutputParametersType);

			Fragments._OutputParametersType1__OclAny.initOperations(_OutputParametersType1__OclAny);
			Fragments._OutputParametersType1__OclElement.initOperations(_OutputParametersType1__OclElement);
			Fragments._OutputParametersType1__OutputParametersType1.initOperations(_OutputParametersType1__OutputParametersType1);

			Fragments._PlanModelReferenceType__OclAny.initOperations(_PlanModelReferenceType__OclAny);
			Fragments._PlanModelReferenceType__OclElement.initOperations(_PlanModelReferenceType__OclElement);
			Fragments._PlanModelReferenceType__PlanModelReferenceType.initOperations(_PlanModelReferenceType__PlanModelReferenceType);

			Fragments._PlanModelType__OclAny.initOperations(_PlanModelType__OclAny);
			Fragments._PlanModelType__OclElement.initOperations(_PlanModelType__OclElement);
			Fragments._PlanModelType__PlanModelType.initOperations(_PlanModelType__PlanModelType);

			Fragments._PlanType__OclAny.initOperations(_PlanType__OclAny);
			Fragments._PlanType__OclElement.initOperations(_PlanType__OclElement);
			Fragments._PlanType__PlanType.initOperations(_PlanType__PlanType);

			Fragments._PoliciesType__OclAny.initOperations(_PoliciesType__OclAny);
			Fragments._PoliciesType__OclElement.initOperations(_PoliciesType__OclElement);
			Fragments._PoliciesType__PoliciesType.initOperations(_PoliciesType__PoliciesType);

			Fragments._PoliciesType1__OclAny.initOperations(_PoliciesType1__OclAny);
			Fragments._PoliciesType1__OclElement.initOperations(_PoliciesType1__OclElement);
			Fragments._PoliciesType1__PoliciesType1.initOperations(_PoliciesType1__PoliciesType1);

			Fragments._PoliciesType2__OclAny.initOperations(_PoliciesType2__OclAny);
			Fragments._PoliciesType2__OclElement.initOperations(_PoliciesType2__OclElement);
			Fragments._PoliciesType2__PoliciesType2.initOperations(_PoliciesType2__PoliciesType2);

			Fragments._PropertiesDefinitionType__OclAny.initOperations(_PropertiesDefinitionType__OclAny);
			Fragments._PropertiesDefinitionType__OclElement.initOperations(_PropertiesDefinitionType__OclElement);
			Fragments._PropertiesDefinitionType__PropertiesDefinitionType.initOperations(_PropertiesDefinitionType__PropertiesDefinitionType);

			Fragments._PropertiesType__OclAny.initOperations(_PropertiesType__OclAny);
			Fragments._PropertiesType__OclElement.initOperations(_PropertiesType__OclElement);
			Fragments._PropertiesType__PropertiesType.initOperations(_PropertiesType__PropertiesType);

			Fragments._PropertiesType1__OclAny.initOperations(_PropertiesType1__OclAny);
			Fragments._PropertiesType1__OclElement.initOperations(_PropertiesType1__OclElement);
			Fragments._PropertiesType1__PropertiesType1.initOperations(_PropertiesType1__PropertiesType1);

			Fragments._PropertyConstraintsType__OclAny.initOperations(_PropertyConstraintsType__OclAny);
			Fragments._PropertyConstraintsType__OclElement.initOperations(_PropertyConstraintsType__OclElement);
			Fragments._PropertyConstraintsType__PropertyConstraintsType.initOperations(_PropertyConstraintsType__PropertyConstraintsType);

			Fragments._PropertyConstraintsType1__OclAny.initOperations(_PropertyConstraintsType1__OclAny);
			Fragments._PropertyConstraintsType1__OclElement.initOperations(_PropertyConstraintsType1__OclElement);
			Fragments._PropertyConstraintsType1__PropertyConstraintsType1.initOperations(_PropertyConstraintsType1__PropertyConstraintsType1);

			Fragments._PropertyMappingsType__OclAny.initOperations(_PropertyMappingsType__OclAny);
			Fragments._PropertyMappingsType__OclElement.initOperations(_PropertyMappingsType__OclElement);
			Fragments._PropertyMappingsType__PropertyMappingsType.initOperations(_PropertyMappingsType__PropertyMappingsType);

			Fragments._RelationshipConstraintType__OclAny.initOperations(_RelationshipConstraintType__OclAny);
			Fragments._RelationshipConstraintType__OclElement.initOperations(_RelationshipConstraintType__OclElement);
			Fragments._RelationshipConstraintType__RelationshipConstraintType.initOperations(_RelationshipConstraintType__RelationshipConstraintType);

			Fragments._RelationshipConstraintsType__OclAny.initOperations(_RelationshipConstraintsType__OclAny);
			Fragments._RelationshipConstraintsType__OclElement.initOperations(_RelationshipConstraintsType__OclElement);
			Fragments._RelationshipConstraintsType__RelationshipConstraintsType.initOperations(_RelationshipConstraintsType__RelationshipConstraintsType);

			Fragments._RelationshipOperationType__OclAny.initOperations(_RelationshipOperationType__OclAny);
			Fragments._RelationshipOperationType__OclElement.initOperations(_RelationshipOperationType__OclElement);
			Fragments._RelationshipOperationType__RelationshipOperationType.initOperations(_RelationshipOperationType__RelationshipOperationType);

			Fragments._RequirementDefinitionsType__OclAny.initOperations(_RequirementDefinitionsType__OclAny);
			Fragments._RequirementDefinitionsType__OclElement.initOperations(_RequirementDefinitionsType__OclElement);
			Fragments._RequirementDefinitionsType__RequirementDefinitionsType.initOperations(_RequirementDefinitionsType__RequirementDefinitionsType);

			Fragments._RequirementDefinitionsType1__OclAny.initOperations(_RequirementDefinitionsType1__OclAny);
			Fragments._RequirementDefinitionsType1__OclElement.initOperations(_RequirementDefinitionsType1__OclElement);
			Fragments._RequirementDefinitionsType1__RequirementDefinitionsType1.initOperations(_RequirementDefinitionsType1__RequirementDefinitionsType1);

			Fragments._RequirementsType__OclAny.initOperations(_RequirementsType__OclAny);
			Fragments._RequirementsType__OclElement.initOperations(_RequirementsType__OclElement);
			Fragments._RequirementsType__RequirementsType.initOperations(_RequirementsType__RequirementsType);

			Fragments._RequirementsType1__OclAny.initOperations(_RequirementsType1__OclAny);
			Fragments._RequirementsType1__OclElement.initOperations(_RequirementsType1__OclElement);
			Fragments._RequirementsType1__RequirementsType1.initOperations(_RequirementsType1__RequirementsType1);

			Fragments._RequirementsType2__OclAny.initOperations(_RequirementsType2__OclAny);
			Fragments._RequirementsType2__OclElement.initOperations(_RequirementsType2__OclElement);
			Fragments._RequirementsType2__RequirementsType2.initOperations(_RequirementsType2__RequirementsType2);

			Fragments._SourceElementType__OclAny.initOperations(_SourceElementType__OclAny);
			Fragments._SourceElementType__OclElement.initOperations(_SourceElementType__OclElement);
			Fragments._SourceElementType__SourceElementType.initOperations(_SourceElementType__SourceElementType);

			Fragments._SourceInterfacesType__OclAny.initOperations(_SourceInterfacesType__OclAny);
			Fragments._SourceInterfacesType__OclElement.initOperations(_SourceInterfacesType__OclElement);
			Fragments._SourceInterfacesType__SourceInterfacesType.initOperations(_SourceInterfacesType__SourceInterfacesType);

			Fragments._TAppliesTo__OclAny.initOperations(_TAppliesTo__OclAny);
			Fragments._TAppliesTo__OclElement.initOperations(_TAppliesTo__OclElement);
			Fragments._TAppliesTo__TAppliesTo.initOperations(_TAppliesTo__TAppliesTo);

			Fragments._TArtifactReference__OclAny.initOperations(_TArtifactReference__OclAny);
			Fragments._TArtifactReference__OclElement.initOperations(_TArtifactReference__OclElement);
			Fragments._TArtifactReference__TArtifactReference.initOperations(_TArtifactReference__TArtifactReference);

			Fragments._TArtifactTemplate__OclAny.initOperations(_TArtifactTemplate__OclAny);
			Fragments._TArtifactTemplate__OclElement.initOperations(_TArtifactTemplate__OclElement);
			Fragments._TArtifactTemplate__TArtifactTemplate.initOperations(_TArtifactTemplate__TArtifactTemplate);
			Fragments._TArtifactTemplate__TEntityTemplate.initOperations(_TArtifactTemplate__TEntityTemplate);
			Fragments._TArtifactTemplate__TExtensibleElements.initOperations(_TArtifactTemplate__TExtensibleElements);

			Fragments._TArtifactType__OclAny.initOperations(_TArtifactType__OclAny);
			Fragments._TArtifactType__OclElement.initOperations(_TArtifactType__OclElement);
			Fragments._TArtifactType__TArtifactType.initOperations(_TArtifactType__TArtifactType);
			Fragments._TArtifactType__TEntityType.initOperations(_TArtifactType__TEntityType);
			Fragments._TArtifactType__TExtensibleElements.initOperations(_TArtifactType__TExtensibleElements);

			Fragments._TBoolean__OclAny.initOperations(_TBoolean__OclAny);
			Fragments._TBoolean__OclElement.initOperations(_TBoolean__OclElement);
			Fragments._TBoolean__OclEnumeration.initOperations(_TBoolean__OclEnumeration);
			Fragments._TBoolean__OclType.initOperations(_TBoolean__OclType);
			Fragments._TBoolean__TBoolean.initOperations(_TBoolean__TBoolean);

			Fragments._TBooleanObject__OclAny.initOperations(_TBooleanObject__OclAny);
			Fragments._TBooleanObject__TBooleanObject.initOperations(_TBooleanObject__TBooleanObject);

			Fragments._TBoundaryDefinitions__OclAny.initOperations(_TBoundaryDefinitions__OclAny);
			Fragments._TBoundaryDefinitions__OclElement.initOperations(_TBoundaryDefinitions__OclElement);
			Fragments._TBoundaryDefinitions__TBoundaryDefinitions.initOperations(_TBoundaryDefinitions__TBoundaryDefinitions);

			Fragments._TCapability__OclAny.initOperations(_TCapability__OclAny);
			Fragments._TCapability__OclElement.initOperations(_TCapability__OclElement);
			Fragments._TCapability__TCapability.initOperations(_TCapability__TCapability);
			Fragments._TCapability__TEntityTemplate.initOperations(_TCapability__TEntityTemplate);
			Fragments._TCapability__TExtensibleElements.initOperations(_TCapability__TExtensibleElements);

			Fragments._TCapabilityDefinition__OclAny.initOperations(_TCapabilityDefinition__OclAny);
			Fragments._TCapabilityDefinition__OclElement.initOperations(_TCapabilityDefinition__OclElement);
			Fragments._TCapabilityDefinition__TCapabilityDefinition.initOperations(_TCapabilityDefinition__TCapabilityDefinition);
			Fragments._TCapabilityDefinition__TExtensibleElements.initOperations(_TCapabilityDefinition__TExtensibleElements);

			Fragments._TCapabilityRef__OclAny.initOperations(_TCapabilityRef__OclAny);
			Fragments._TCapabilityRef__OclElement.initOperations(_TCapabilityRef__OclElement);
			Fragments._TCapabilityRef__TCapabilityRef.initOperations(_TCapabilityRef__TCapabilityRef);

			Fragments._TCapabilityType__OclAny.initOperations(_TCapabilityType__OclAny);
			Fragments._TCapabilityType__OclElement.initOperations(_TCapabilityType__OclElement);
			Fragments._TCapabilityType__TCapabilityType.initOperations(_TCapabilityType__TCapabilityType);
			Fragments._TCapabilityType__TEntityType.initOperations(_TCapabilityType__TEntityType);
			Fragments._TCapabilityType__TExtensibleElements.initOperations(_TCapabilityType__TExtensibleElements);

			Fragments._TCondition__OclAny.initOperations(_TCondition__OclAny);
			Fragments._TCondition__OclElement.initOperations(_TCondition__OclElement);
			Fragments._TCondition__TCondition.initOperations(_TCondition__TCondition);

			Fragments._TConstraint__OclAny.initOperations(_TConstraint__OclAny);
			Fragments._TConstraint__OclElement.initOperations(_TConstraint__OclElement);
			Fragments._TConstraint__TConstraint.initOperations(_TConstraint__TConstraint);

			Fragments._TDefinitions__OclAny.initOperations(_TDefinitions__OclAny);
			Fragments._TDefinitions__OclElement.initOperations(_TDefinitions__OclElement);
			Fragments._TDefinitions__TDefinitions.initOperations(_TDefinitions__TDefinitions);
			Fragments._TDefinitions__TExtensibleElements.initOperations(_TDefinitions__TExtensibleElements);

			Fragments._TDeploymentArtifact__OclAny.initOperations(_TDeploymentArtifact__OclAny);
			Fragments._TDeploymentArtifact__OclElement.initOperations(_TDeploymentArtifact__OclElement);
			Fragments._TDeploymentArtifact__TDeploymentArtifact.initOperations(_TDeploymentArtifact__TDeploymentArtifact);
			Fragments._TDeploymentArtifact__TExtensibleElements.initOperations(_TDeploymentArtifact__TExtensibleElements);

			Fragments._TDeploymentArtifacts__OclAny.initOperations(_TDeploymentArtifacts__OclAny);
			Fragments._TDeploymentArtifacts__OclElement.initOperations(_TDeploymentArtifacts__OclElement);
			Fragments._TDeploymentArtifacts__TDeploymentArtifacts.initOperations(_TDeploymentArtifacts__TDeploymentArtifacts);

			Fragments._TDocumentation__OclAny.initOperations(_TDocumentation__OclAny);
			Fragments._TDocumentation__OclElement.initOperations(_TDocumentation__OclElement);
			Fragments._TDocumentation__TDocumentation.initOperations(_TDocumentation__TDocumentation);

			Fragments._TEntityTemplate__OclAny.initOperations(_TEntityTemplate__OclAny);
			Fragments._TEntityTemplate__OclElement.initOperations(_TEntityTemplate__OclElement);
			Fragments._TEntityTemplate__TEntityTemplate.initOperations(_TEntityTemplate__TEntityTemplate);
			Fragments._TEntityTemplate__TExtensibleElements.initOperations(_TEntityTemplate__TExtensibleElements);

			Fragments._TEntityType__OclAny.initOperations(_TEntityType__OclAny);
			Fragments._TEntityType__OclElement.initOperations(_TEntityType__OclElement);
			Fragments._TEntityType__TEntityType.initOperations(_TEntityType__TEntityType);
			Fragments._TEntityType__TExtensibleElements.initOperations(_TEntityType__TExtensibleElements);

			Fragments._TExportedInterface__OclAny.initOperations(_TExportedInterface__OclAny);
			Fragments._TExportedInterface__OclElement.initOperations(_TExportedInterface__OclElement);
			Fragments._TExportedInterface__TExportedInterface.initOperations(_TExportedInterface__TExportedInterface);

			Fragments._TExportedOperation__OclAny.initOperations(_TExportedOperation__OclAny);
			Fragments._TExportedOperation__OclElement.initOperations(_TExportedOperation__OclElement);
			Fragments._TExportedOperation__TExportedOperation.initOperations(_TExportedOperation__TExportedOperation);

			Fragments._TExtensibleElements__OclAny.initOperations(_TExtensibleElements__OclAny);
			Fragments._TExtensibleElements__OclElement.initOperations(_TExtensibleElements__OclElement);
			Fragments._TExtensibleElements__TExtensibleElements.initOperations(_TExtensibleElements__TExtensibleElements);

			Fragments._TExtension__OclAny.initOperations(_TExtension__OclAny);
			Fragments._TExtension__OclElement.initOperations(_TExtension__OclElement);
			Fragments._TExtension__TExtensibleElements.initOperations(_TExtension__TExtensibleElements);
			Fragments._TExtension__TExtension.initOperations(_TExtension__TExtension);

			Fragments._TExtensions__OclAny.initOperations(_TExtensions__OclAny);
			Fragments._TExtensions__OclElement.initOperations(_TExtensions__OclElement);
			Fragments._TExtensions__TExtensibleElements.initOperations(_TExtensions__TExtensibleElements);
			Fragments._TExtensions__TExtensions.initOperations(_TExtensions__TExtensions);

			Fragments._TGroupTemplate__OclAny.initOperations(_TGroupTemplate__OclAny);
			Fragments._TGroupTemplate__OclElement.initOperations(_TGroupTemplate__OclElement);
			Fragments._TGroupTemplate__TEntityTemplate.initOperations(_TGroupTemplate__TEntityTemplate);
			Fragments._TGroupTemplate__TExtensibleElements.initOperations(_TGroupTemplate__TExtensibleElements);
			Fragments._TGroupTemplate__TGroupTemplate.initOperations(_TGroupTemplate__TGroupTemplate);

			Fragments._TGroupType__OclAny.initOperations(_TGroupType__OclAny);
			Fragments._TGroupType__OclElement.initOperations(_TGroupType__OclElement);
			Fragments._TGroupType__TEntityType.initOperations(_TGroupType__TEntityType);
			Fragments._TGroupType__TExtensibleElements.initOperations(_TGroupType__TExtensibleElements);
			Fragments._TGroupType__TGroupType.initOperations(_TGroupType__TGroupType);

			Fragments._TImplementationArtifact__OclAny.initOperations(_TImplementationArtifact__OclAny);
			Fragments._TImplementationArtifact__OclElement.initOperations(_TImplementationArtifact__OclElement);
			Fragments._TImplementationArtifact__TExtensibleElements.initOperations(_TImplementationArtifact__TExtensibleElements);
			Fragments._TImplementationArtifact__TImplementationArtifact.initOperations(_TImplementationArtifact__TImplementationArtifact);

			Fragments._TImplementationArtifacts__OclAny.initOperations(_TImplementationArtifacts__OclAny);
			Fragments._TImplementationArtifacts__OclElement.initOperations(_TImplementationArtifacts__OclElement);
			Fragments._TImplementationArtifacts__TImplementationArtifacts.initOperations(_TImplementationArtifacts__TImplementationArtifacts);

			Fragments._TImport__OclAny.initOperations(_TImport__OclAny);
			Fragments._TImport__OclElement.initOperations(_TImport__OclElement);
			Fragments._TImport__TExtensibleElements.initOperations(_TImport__TExtensibleElements);
			Fragments._TImport__TImport.initOperations(_TImport__TImport);

			Fragments._TInterface__OclAny.initOperations(_TInterface__OclAny);
			Fragments._TInterface__OclElement.initOperations(_TInterface__OclElement);
			Fragments._TInterface__TInterface.initOperations(_TInterface__TInterface);

			Fragments._TNodeTemplate__OclAny.initOperations(_TNodeTemplate__OclAny);
			Fragments._TNodeTemplate__OclElement.initOperations(_TNodeTemplate__OclElement);
			Fragments._TNodeTemplate__TEntityTemplate.initOperations(_TNodeTemplate__TEntityTemplate);
			Fragments._TNodeTemplate__TExtensibleElements.initOperations(_TNodeTemplate__TExtensibleElements);
			Fragments._TNodeTemplate__TNodeTemplate.initOperations(_TNodeTemplate__TNodeTemplate);

			Fragments._TNodeType__OclAny.initOperations(_TNodeType__OclAny);
			Fragments._TNodeType__OclElement.initOperations(_TNodeType__OclElement);
			Fragments._TNodeType__TEntityType.initOperations(_TNodeType__TEntityType);
			Fragments._TNodeType__TExtensibleElements.initOperations(_TNodeType__TExtensibleElements);
			Fragments._TNodeType__TNodeType.initOperations(_TNodeType__TNodeType);

			Fragments._TNodeTypeImplementation__OclAny.initOperations(_TNodeTypeImplementation__OclAny);
			Fragments._TNodeTypeImplementation__OclElement.initOperations(_TNodeTypeImplementation__OclElement);
			Fragments._TNodeTypeImplementation__TExtensibleElements.initOperations(_TNodeTypeImplementation__TExtensibleElements);
			Fragments._TNodeTypeImplementation__TNodeTypeImplementation.initOperations(_TNodeTypeImplementation__TNodeTypeImplementation);

			Fragments._TOperation__OclAny.initOperations(_TOperation__OclAny);
			Fragments._TOperation__OclElement.initOperations(_TOperation__OclElement);
			Fragments._TOperation__TExtensibleElements.initOperations(_TOperation__TExtensibleElements);
			Fragments._TOperation__TOperation.initOperations(_TOperation__TOperation);

			Fragments._TParameter__OclAny.initOperations(_TParameter__OclAny);
			Fragments._TParameter__OclElement.initOperations(_TParameter__OclElement);
			Fragments._TParameter__TParameter.initOperations(_TParameter__TParameter);

			Fragments._TPlan__OclAny.initOperations(_TPlan__OclAny);
			Fragments._TPlan__OclElement.initOperations(_TPlan__OclElement);
			Fragments._TPlan__TExtensibleElements.initOperations(_TPlan__TExtensibleElements);
			Fragments._TPlan__TPlan.initOperations(_TPlan__TPlan);

			Fragments._TPlans__OclAny.initOperations(_TPlans__OclAny);
			Fragments._TPlans__OclElement.initOperations(_TPlans__OclElement);
			Fragments._TPlans__TPlans.initOperations(_TPlans__TPlans);

			Fragments._TPolicy__OclAny.initOperations(_TPolicy__OclAny);
			Fragments._TPolicy__OclElement.initOperations(_TPolicy__OclElement);
			Fragments._TPolicy__TExtensibleElements.initOperations(_TPolicy__TExtensibleElements);
			Fragments._TPolicy__TPolicy.initOperations(_TPolicy__TPolicy);

			Fragments._TPolicyTemplate__OclAny.initOperations(_TPolicyTemplate__OclAny);
			Fragments._TPolicyTemplate__OclElement.initOperations(_TPolicyTemplate__OclElement);
			Fragments._TPolicyTemplate__TEntityTemplate.initOperations(_TPolicyTemplate__TEntityTemplate);
			Fragments._TPolicyTemplate__TExtensibleElements.initOperations(_TPolicyTemplate__TExtensibleElements);
			Fragments._TPolicyTemplate__TPolicyTemplate.initOperations(_TPolicyTemplate__TPolicyTemplate);

			Fragments._TPolicyType__OclAny.initOperations(_TPolicyType__OclAny);
			Fragments._TPolicyType__OclElement.initOperations(_TPolicyType__OclElement);
			Fragments._TPolicyType__TEntityType.initOperations(_TPolicyType__TEntityType);
			Fragments._TPolicyType__TExtensibleElements.initOperations(_TPolicyType__TExtensibleElements);
			Fragments._TPolicyType__TPolicyType.initOperations(_TPolicyType__TPolicyType);

			Fragments._TPropertyConstraint__OclAny.initOperations(_TPropertyConstraint__OclAny);
			Fragments._TPropertyConstraint__OclElement.initOperations(_TPropertyConstraint__OclElement);
			Fragments._TPropertyConstraint__TConstraint.initOperations(_TPropertyConstraint__TConstraint);
			Fragments._TPropertyConstraint__TPropertyConstraint.initOperations(_TPropertyConstraint__TPropertyConstraint);

			Fragments._TPropertyMapping__OclAny.initOperations(_TPropertyMapping__OclAny);
			Fragments._TPropertyMapping__OclElement.initOperations(_TPropertyMapping__OclElement);
			Fragments._TPropertyMapping__TPropertyMapping.initOperations(_TPropertyMapping__TPropertyMapping);

			Fragments._TRelationshipTemplate__OclAny.initOperations(_TRelationshipTemplate__OclAny);
			Fragments._TRelationshipTemplate__OclElement.initOperations(_TRelationshipTemplate__OclElement);
			Fragments._TRelationshipTemplate__TEntityTemplate.initOperations(_TRelationshipTemplate__TEntityTemplate);
			Fragments._TRelationshipTemplate__TExtensibleElements.initOperations(_TRelationshipTemplate__TExtensibleElements);
			Fragments._TRelationshipTemplate__TRelationshipTemplate.initOperations(_TRelationshipTemplate__TRelationshipTemplate);

			Fragments._TRelationshipType__OclAny.initOperations(_TRelationshipType__OclAny);
			Fragments._TRelationshipType__OclElement.initOperations(_TRelationshipType__OclElement);
			Fragments._TRelationshipType__TEntityType.initOperations(_TRelationshipType__TEntityType);
			Fragments._TRelationshipType__TExtensibleElements.initOperations(_TRelationshipType__TExtensibleElements);
			Fragments._TRelationshipType__TRelationshipType.initOperations(_TRelationshipType__TRelationshipType);

			Fragments._TRelationshipTypeImplementation__OclAny.initOperations(_TRelationshipTypeImplementation__OclAny);
			Fragments._TRelationshipTypeImplementation__OclElement.initOperations(_TRelationshipTypeImplementation__OclElement);
			Fragments._TRelationshipTypeImplementation__TExtensibleElements.initOperations(_TRelationshipTypeImplementation__TExtensibleElements);
			Fragments._TRelationshipTypeImplementation__TRelationshipTypeImplementation.initOperations(_TRelationshipTypeImplementation__TRelationshipTypeImplementation);

			Fragments._TRequiredContainerFeature__OclAny.initOperations(_TRequiredContainerFeature__OclAny);
			Fragments._TRequiredContainerFeature__OclElement.initOperations(_TRequiredContainerFeature__OclElement);
			Fragments._TRequiredContainerFeature__TRequiredContainerFeature.initOperations(_TRequiredContainerFeature__TRequiredContainerFeature);

			Fragments._TRequiredContainerFeatures__OclAny.initOperations(_TRequiredContainerFeatures__OclAny);
			Fragments._TRequiredContainerFeatures__OclElement.initOperations(_TRequiredContainerFeatures__OclElement);
			Fragments._TRequiredContainerFeatures__TRequiredContainerFeatures.initOperations(_TRequiredContainerFeatures__TRequiredContainerFeatures);

			Fragments._TRequirement__OclAny.initOperations(_TRequirement__OclAny);
			Fragments._TRequirement__OclElement.initOperations(_TRequirement__OclElement);
			Fragments._TRequirement__TEntityTemplate.initOperations(_TRequirement__TEntityTemplate);
			Fragments._TRequirement__TExtensibleElements.initOperations(_TRequirement__TExtensibleElements);
			Fragments._TRequirement__TRequirement.initOperations(_TRequirement__TRequirement);

			Fragments._TRequirementDefinition__OclAny.initOperations(_TRequirementDefinition__OclAny);
			Fragments._TRequirementDefinition__OclElement.initOperations(_TRequirementDefinition__OclElement);
			Fragments._TRequirementDefinition__TExtensibleElements.initOperations(_TRequirementDefinition__TExtensibleElements);
			Fragments._TRequirementDefinition__TRequirementDefinition.initOperations(_TRequirementDefinition__TRequirementDefinition);

			Fragments._TRequirementRef__OclAny.initOperations(_TRequirementRef__OclAny);
			Fragments._TRequirementRef__OclElement.initOperations(_TRequirementRef__OclElement);
			Fragments._TRequirementRef__TRequirementRef.initOperations(_TRequirementRef__TRequirementRef);

			Fragments._TRequirementType__OclAny.initOperations(_TRequirementType__OclAny);
			Fragments._TRequirementType__OclElement.initOperations(_TRequirementType__OclElement);
			Fragments._TRequirementType__TEntityType.initOperations(_TRequirementType__TEntityType);
			Fragments._TRequirementType__TExtensibleElements.initOperations(_TRequirementType__TExtensibleElements);
			Fragments._TRequirementType__TRequirementType.initOperations(_TRequirementType__TRequirementType);

			Fragments._TServiceTemplate__OclAny.initOperations(_TServiceTemplate__OclAny);
			Fragments._TServiceTemplate__OclElement.initOperations(_TServiceTemplate__OclElement);
			Fragments._TServiceTemplate__TExtensibleElements.initOperations(_TServiceTemplate__TExtensibleElements);
			Fragments._TServiceTemplate__TServiceTemplate.initOperations(_TServiceTemplate__TServiceTemplate);

			Fragments._TTag__OclAny.initOperations(_TTag__OclAny);
			Fragments._TTag__OclElement.initOperations(_TTag__OclElement);
			Fragments._TTag__TTag.initOperations(_TTag__TTag);

			Fragments._TTags__OclAny.initOperations(_TTags__OclAny);
			Fragments._TTags__OclElement.initOperations(_TTags__OclElement);
			Fragments._TTags__TTags.initOperations(_TTags__TTags);

			Fragments._TTopologyElementInstanceStates__OclAny.initOperations(_TTopologyElementInstanceStates__OclAny);
			Fragments._TTopologyElementInstanceStates__OclElement.initOperations(_TTopologyElementInstanceStates__OclElement);
			Fragments._TTopologyElementInstanceStates__TTopologyElementInstanceStates.initOperations(_TTopologyElementInstanceStates__TTopologyElementInstanceStates);

			Fragments._TTopologyTemplate__OclAny.initOperations(_TTopologyTemplate__OclAny);
			Fragments._TTopologyTemplate__OclElement.initOperations(_TTopologyTemplate__OclElement);
			Fragments._TTopologyTemplate__TExtensibleElements.initOperations(_TTopologyTemplate__TExtensibleElements);
			Fragments._TTopologyTemplate__TTopologyTemplate.initOperations(_TTopologyTemplate__TTopologyTemplate);

			Fragments._TargetElementType__OclAny.initOperations(_TargetElementType__OclAny);
			Fragments._TargetElementType__OclElement.initOperations(_TargetElementType__OclElement);
			Fragments._TargetElementType__TargetElementType.initOperations(_TargetElementType__TargetElementType);

			Fragments._TargetInterfacesType__OclAny.initOperations(_TargetInterfacesType__OclAny);
			Fragments._TargetInterfacesType__OclElement.initOperations(_TargetInterfacesType__OclElement);
			Fragments._TargetInterfacesType__TargetInterfacesType.initOperations(_TargetInterfacesType__TargetInterfacesType);

			Fragments._TypesType__OclAny.initOperations(_TypesType__OclAny);
			Fragments._TypesType__OclElement.initOperations(_TypesType__OclElement);
			Fragments._TypesType__TypesType.initOperations(_TypesType__TypesType);

			Fragments._UpperBoundType__OclAny.initOperations(_UpperBoundType__OclAny);
			Fragments._UpperBoundType__UpperBoundType.initOperations(_UpperBoundType__UpperBoundType);

			Fragments._UpperBoundType1__OclAny.initOperations(_UpperBoundType1__OclAny);
			Fragments._UpperBoundType1__UpperBoundType1.initOperations(_UpperBoundType1__UpperBoundType1);

			Fragments._UpperBoundTypeMember0__OclAny.initOperations(_UpperBoundTypeMember0__OclAny);
			Fragments._UpperBoundTypeMember0__UpperBoundTypeMember0.initOperations(_UpperBoundTypeMember0__UpperBoundTypeMember0);

			Fragments._UpperBoundTypeMember01__OclAny.initOperations(_UpperBoundTypeMember01__OclAny);
			Fragments._UpperBoundTypeMember01__UpperBoundTypeMember01.initOperations(_UpperBoundTypeMember01__UpperBoundTypeMember01);

			Fragments._UpperBoundTypeMember1__OclAny.initOperations(_UpperBoundTypeMember1__OclAny);
			Fragments._UpperBoundTypeMember1__OclElement.initOperations(_UpperBoundTypeMember1__OclElement);
			Fragments._UpperBoundTypeMember1__OclEnumeration.initOperations(_UpperBoundTypeMember1__OclEnumeration);
			Fragments._UpperBoundTypeMember1__OclType.initOperations(_UpperBoundTypeMember1__OclType);
			Fragments._UpperBoundTypeMember1__UpperBoundTypeMember1.initOperations(_UpperBoundTypeMember1__UpperBoundTypeMember1);

			Fragments._UpperBoundTypeMember11__OclAny.initOperations(_UpperBoundTypeMember11__OclAny);
			Fragments._UpperBoundTypeMember11__OclElement.initOperations(_UpperBoundTypeMember11__OclElement);
			Fragments._UpperBoundTypeMember11__OclEnumeration.initOperations(_UpperBoundTypeMember11__OclEnumeration);
			Fragments._UpperBoundTypeMember11__OclType.initOperations(_UpperBoundTypeMember11__OclType);
			Fragments._UpperBoundTypeMember11__UpperBoundTypeMember11.initOperations(_UpperBoundTypeMember11__UpperBoundTypeMember11);

			Fragments._UpperBoundTypeMember1Object__OclAny.initOperations(_UpperBoundTypeMember1Object__OclAny);
			Fragments._UpperBoundTypeMember1Object__UpperBoundTypeMember1Object.initOperations(_UpperBoundTypeMember1Object__UpperBoundTypeMember1Object);

			Fragments._UpperBoundTypeMember1Object1__OclAny.initOperations(_UpperBoundTypeMember1Object1__OclAny);
			Fragments._UpperBoundTypeMember1Object1__UpperBoundTypeMember1Object1.initOperations(_UpperBoundTypeMember1Object1__UpperBoundTypeMember1Object1);

			Fragments._ValidImportTypes__OclAny.initOperations(_ValidImportTypes__OclAny);
			Fragments._ValidImportTypes__OclElement.initOperations(_ValidImportTypes__OclElement);
			Fragments._ValidImportTypes__OclEnumeration.initOperations(_ValidImportTypes__OclEnumeration);
			Fragments._ValidImportTypes__OclType.initOperations(_ValidImportTypes__OclType);
			Fragments._ValidImportTypes__ValidImportTypes.initOperations(_ValidImportTypes__ValidImportTypes);

			Fragments._ValidSourceType__OclAny.initOperations(_ValidSourceType__OclAny);
			Fragments._ValidSourceType__OclElement.initOperations(_ValidSourceType__OclElement);
			Fragments._ValidSourceType__ValidSourceType.initOperations(_ValidSourceType__ValidSourceType);

			Fragments._ValidTargetType__OclAny.initOperations(_ValidTargetType__OclAny);
			Fragments._ValidTargetType__OclElement.initOperations(_ValidTargetType__OclElement);
			Fragments._ValidTargetType__ValidTargetType.initOperations(_ValidTargetType__ValidTargetType);

			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of ToscaTables::FragmentOperations and all preceding sub-packages.
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

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _ArtifactReferencesType = {
			ToscaTables.Properties._ArtifactReferencesType__artifactReference
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _CapabilitiesType = {
			ToscaTables.Properties._CapabilitiesType__capability
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _CapabilitiesType1 = {
			ToscaTables.Properties._CapabilitiesType1__capability
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _CapabilitiesType2 = {
			ToscaTables.Properties._CapabilitiesType2__capability
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _CapabilityDefinitionsType = {
			ToscaTables.Properties._CapabilityDefinitionsType__capabilityDefinition
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _CapabilityDefinitionsType1 = {
			ToscaTables.Properties._CapabilityDefinitionsType1__capabilityDefinition
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _ConstraintsType = {
			ToscaTables.Properties._ConstraintsType__constraint
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _ConstraintsType1 = {
			ToscaTables.Properties._ConstraintsType1__constraint
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _DefinitionsType = {
			ToscaTables.Properties._TExtensibleElements__any,
			ToscaTables.Properties._TExtensibleElements__anyAttribute,
			ToscaTables.Properties._TDefinitions__artifactTemplate,
			ToscaTables.Properties._TDefinitions__artifactType,
			ToscaTables.Properties._TDefinitions__capabilityType,
			ToscaTables.Properties._TExtensibleElements__documentation,
			ToscaTables.Properties._TDefinitions__extensions,
			ToscaTables.Properties._TDefinitions__group,
			ToscaTables.Properties._TDefinitions__groupType,
			ToscaTables.Properties._TDefinitions__id,
			ToscaTables.Properties._TDefinitions__import,
			ToscaTables.Properties._TDefinitions__name,
			ToscaTables.Properties._TDefinitions__nodeType,
			ToscaTables.Properties._TDefinitions__nodeTypeImplementation,
			ToscaTables.Properties._TDefinitions__policyTemplate,
			ToscaTables.Properties._TDefinitions__policyType,
			ToscaTables.Properties._TDefinitions__relationshipType,
			ToscaTables.Properties._TDefinitions__relationshipTypeImplementation,
			ToscaTables.Properties._TDefinitions__requirementType,
			ToscaTables.Properties._TDefinitions__serviceTemplate,
			ToscaTables.Properties._TDefinitions__targetNamespace,
			ToscaTables.Properties._TDefinitions__types
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _DerivedFromType = {
			ToscaTables.Properties._DerivedFromType__nodeTypeImplementationRef
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _DerivedFromType1 = {
			ToscaTables.Properties._DerivedFromType1__relationshipTypeImplementationRef
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _DerivedFromType2 = {
			ToscaTables.Properties._DerivedFromType2__referencedEntityType,
			ToscaTables.Properties._DerivedFromType2__typeRef
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _DocumentRoot = {
			ToscaTables.Properties._DocumentRoot__definitions,
			ToscaTables.Properties._DocumentRoot__documentation,
			ToscaTables.Properties._DocumentRoot__mixed,
			ToscaTables.Properties._DocumentRoot__xMLNSPrefixMap,
			ToscaTables.Properties._DocumentRoot__xSISchemaLocation
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _ExcludeType = {
			ToscaTables.Properties._ExcludeType__pattern
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _ExtensionsType = {
			ToscaTables.Properties._ExtensionsType__extension
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _ImplementationArtifactType = {
			ToscaTables.Properties._TExtensibleElements__any,
			ToscaTables.Properties._TExtensibleElements__anyAttribute,
			ToscaTables.Properties._TImplementationArtifact__artifactRef,
			ToscaTables.Properties._TImplementationArtifact__artifactType,
			ToscaTables.Properties._TExtensibleElements__documentation,
			ToscaTables.Properties._TImplementationArtifact__interfaceName,
			ToscaTables.Properties._TImplementationArtifact__operationName
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _ImportedURI = {};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _IncludeType = {
			ToscaTables.Properties._IncludeType__pattern
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _InputParametersType = {
			ToscaTables.Properties._InputParametersType__inputParameter
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _InputParametersType1 = {
			ToscaTables.Properties._InputParametersType1__inputParameter
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _InstanceStateType = {
			ToscaTables.Properties._InstanceStateType__state
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _InterfacesType = {
			ToscaTables.Properties._InterfacesType__interface
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _InterfacesType1 = {
			ToscaTables.Properties._InterfacesType1__interface
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _InterfacesType2 = {
			ToscaTables.Properties._InterfacesType2__interface
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _MaxInstancesType = {};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _MaxInstancesType1 = {};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _MaxInstancesTypeMember0 = {};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _MaxInstancesTypeMember01 = {};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _MaxInstancesTypeMember1 = {};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _MaxInstancesTypeMember11 = {};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _MaxInstancesTypeMember1Object = {};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _MaxInstancesTypeMember1Object1 = {};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _NodeOperationType = {
			ToscaTables.Properties._NodeOperationType__interfaceName,
			ToscaTables.Properties._NodeOperationType__nodeRef,
			ToscaTables.Properties._NodeOperationType__operationName
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _NodeTypeReferenceType = {
			ToscaTables.Properties._NodeTypeReferenceType__typeRef
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _OutputParametersType = {
			ToscaTables.Properties._OutputParametersType__outputParameter
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _OutputParametersType1 = {
			ToscaTables.Properties._OutputParametersType1__outputParameter
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _PlanModelReferenceType = {
			ToscaTables.Properties._PlanModelReferenceType__reference
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _PlanModelType = {
			ToscaTables.Properties._PlanModelType__any
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _PlanType = {
			ToscaTables.Properties._PlanType__planRef
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _PoliciesType = {
			ToscaTables.Properties._PoliciesType__policy
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _PoliciesType1 = {
			ToscaTables.Properties._PoliciesType1__policy
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _PoliciesType2 = {
			ToscaTables.Properties._PoliciesType2__policy
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _PropertiesDefinitionType = {
			ToscaTables.Properties._PropertiesDefinitionType__element,
			ToscaTables.Properties._PropertiesDefinitionType__elementRef,
			ToscaTables.Properties._PropertiesDefinitionType__type
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _PropertiesType = {
			ToscaTables.Properties._PropertiesType__any,
			ToscaTables.Properties._PropertiesType__propertiesElement
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _PropertiesType1 = {
			ToscaTables.Properties._PropertiesType1__any,
			ToscaTables.Properties._PropertiesType1__propertiesElement,
			ToscaTables.Properties._PropertiesType1__propertyMappings
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _PropertyConstraintsType = {
			ToscaTables.Properties._PropertyConstraintsType__propertyConstraint
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _PropertyConstraintsType1 = {
			ToscaTables.Properties._PropertyConstraintsType1__propertyConstraint
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _PropertyMappingsType = {
			ToscaTables.Properties._PropertyMappingsType__propertyMapping
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _RelationshipConstraintType = {
			ToscaTables.Properties._RelationshipConstraintType__any,
			ToscaTables.Properties._RelationshipConstraintType__constraintType
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _RelationshipConstraintsType = {
			ToscaTables.Properties._RelationshipConstraintsType__relationshipConstraint
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _RelationshipOperationType = {
			ToscaTables.Properties._RelationshipOperationType__interfaceName,
			ToscaTables.Properties._RelationshipOperationType__operationName,
			ToscaTables.Properties._RelationshipOperationType__relationshipRef
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _RequirementDefinitionsType = {
			ToscaTables.Properties._RequirementDefinitionsType__requirementDefinition
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _RequirementDefinitionsType1 = {
			ToscaTables.Properties._RequirementDefinitionsType1__requirementDefinition
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _RequirementsType = {
			ToscaTables.Properties._RequirementsType__requirement
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _RequirementsType1 = {
			ToscaTables.Properties._RequirementsType1__requirement
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _RequirementsType2 = {
			ToscaTables.Properties._RequirementsType2__requirement
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _SourceElementType = {
			ToscaTables.Properties._SourceElementType__ref
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _SourceInterfacesType = {
			ToscaTables.Properties._SourceInterfacesType__interface
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _TAppliesTo = {
			ToscaTables.Properties._TAppliesTo__nodeTypeReference
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _TArtifactReference = {
			ToscaTables.Properties._TArtifactReference__exclude,
			ToscaTables.Properties._TArtifactReference__group,
			ToscaTables.Properties._TArtifactReference__include,
			ToscaTables.Properties._TArtifactReference__reference
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _TArtifactTemplate = {
			ToscaTables.Properties._TExtensibleElements__any,
			ToscaTables.Properties._TExtensibleElements__anyAttribute,
			ToscaTables.Properties._TArtifactTemplate__artifactReferences,
			ToscaTables.Properties._TExtensibleElements__documentation,
			ToscaTables.Properties._TEntityTemplate__id,
			ToscaTables.Properties._TArtifactTemplate__name,
			ToscaTables.Properties._TEntityTemplate__properties,
			ToscaTables.Properties._TEntityTemplate__propertyConstraints,
			ToscaTables.Properties._TEntityTemplate__type,
			ToscaTables.Properties._TEntityTemplate__typeRef
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _TArtifactType = {
			ToscaTables.Properties._TEntityType__abstract,
			ToscaTables.Properties._TExtensibleElements__any,
			ToscaTables.Properties._TExtensibleElements__anyAttribute,
			ToscaTables.Properties._TEntityType__derivedFrom,
			ToscaTables.Properties._TExtensibleElements__documentation,
			ToscaTables.Properties._TEntityType__final,
			ToscaTables.Properties._TEntityType__name,
			ToscaTables.Properties._TEntityType__propertiesDefinition,
			ToscaTables.Properties._TEntityType__tags,
			ToscaTables.Properties._TEntityType__targetNamespace
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _TBoolean = {};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _TBooleanObject = {};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _TBoundaryDefinitions = {
			ToscaTables.Properties._TBoundaryDefinitions__capabilities,
			ToscaTables.Properties._TBoundaryDefinitions__interfaces,
			ToscaTables.Properties._TBoundaryDefinitions__policies,
			ToscaTables.Properties._TBoundaryDefinitions__properties,
			ToscaTables.Properties._TBoundaryDefinitions__propertyConstraints,
			ToscaTables.Properties._TBoundaryDefinitions__requirements
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _TCapability = {
			ToscaTables.Properties._TExtensibleElements__any,
			ToscaTables.Properties._TExtensibleElements__anyAttribute,
			ToscaTables.Properties._TExtensibleElements__documentation,
			ToscaTables.Properties._TEntityTemplate__id,
			ToscaTables.Properties._TCapability__name,
			ToscaTables.Properties._TEntityTemplate__properties,
			ToscaTables.Properties._TEntityTemplate__propertyConstraints,
			ToscaTables.Properties._TEntityTemplate__type,
			ToscaTables.Properties._TEntityTemplate__typeRef
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _TCapabilityDefinition = {
			ToscaTables.Properties._TExtensibleElements__any,
			ToscaTables.Properties._TExtensibleElements__anyAttribute,
			ToscaTables.Properties._TCapabilityDefinition__capabilityType,
			ToscaTables.Properties._TCapabilityDefinition__capabilityTypeRef,
			ToscaTables.Properties._TCapabilityDefinition__constraints,
			ToscaTables.Properties._TExtensibleElements__documentation,
			ToscaTables.Properties._TCapabilityDefinition__lowerBound,
			ToscaTables.Properties._TCapabilityDefinition__name,
			ToscaTables.Properties._TCapabilityDefinition__upperBound
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _TCapabilityRef = {
			ToscaTables.Properties._TCapabilityRef__name,
			ToscaTables.Properties._TCapabilityRef__ref
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _TCapabilityType = {
			ToscaTables.Properties._TEntityType__abstract,
			ToscaTables.Properties._TExtensibleElements__any,
			ToscaTables.Properties._TExtensibleElements__anyAttribute,
			ToscaTables.Properties._TEntityType__derivedFrom,
			ToscaTables.Properties._TExtensibleElements__documentation,
			ToscaTables.Properties._TEntityType__final,
			ToscaTables.Properties._TEntityType__name,
			ToscaTables.Properties._TEntityType__propertiesDefinition,
			ToscaTables.Properties._TEntityType__tags,
			ToscaTables.Properties._TEntityType__targetNamespace
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _TCondition = {
			ToscaTables.Properties._TCondition__any,
			ToscaTables.Properties._TCondition__expressionLanguage
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _TConstraint = {
			ToscaTables.Properties._TConstraint__any,
			ToscaTables.Properties._TConstraint__constraintType
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _TDefinitions = {
			ToscaTables.Properties._TExtensibleElements__any,
			ToscaTables.Properties._TExtensibleElements__anyAttribute,
			ToscaTables.Properties._TDefinitions__artifactTemplate,
			ToscaTables.Properties._TDefinitions__artifactType,
			ToscaTables.Properties._TDefinitions__capabilityType,
			ToscaTables.Properties._TExtensibleElements__documentation,
			ToscaTables.Properties._TDefinitions__extensions,
			ToscaTables.Properties._TDefinitions__group,
			ToscaTables.Properties._TDefinitions__groupType,
			ToscaTables.Properties._TDefinitions__id,
			ToscaTables.Properties._TDefinitions__import,
			ToscaTables.Properties._TDefinitions__name,
			ToscaTables.Properties._TDefinitions__nodeType,
			ToscaTables.Properties._TDefinitions__nodeTypeImplementation,
			ToscaTables.Properties._TDefinitions__policyTemplate,
			ToscaTables.Properties._TDefinitions__policyType,
			ToscaTables.Properties._TDefinitions__relationshipType,
			ToscaTables.Properties._TDefinitions__relationshipTypeImplementation,
			ToscaTables.Properties._TDefinitions__requirementType,
			ToscaTables.Properties._TDefinitions__serviceTemplate,
			ToscaTables.Properties._TDefinitions__targetNamespace,
			ToscaTables.Properties._TDefinitions__types
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _TDeploymentArtifact = {
			ToscaTables.Properties._TExtensibleElements__any,
			ToscaTables.Properties._TExtensibleElements__anyAttribute,
			ToscaTables.Properties._TDeploymentArtifact__artifactRef,
			ToscaTables.Properties._TDeploymentArtifact__artifactType,
			ToscaTables.Properties._TExtensibleElements__documentation,
			ToscaTables.Properties._TDeploymentArtifact__name
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _TDeploymentArtifacts = {
			ToscaTables.Properties._TDeploymentArtifacts__deploymentArtifact
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _TDocumentation = {
			ToscaTables.Properties._TDocumentation__any,
			ToscaTables.Properties._TDocumentation__lang,
			ToscaTables.Properties._TDocumentation__mixed,
			ToscaTables.Properties._TDocumentation__source
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _TEntityTemplate = {
			ToscaTables.Properties._TExtensibleElements__any,
			ToscaTables.Properties._TExtensibleElements__anyAttribute,
			ToscaTables.Properties._TExtensibleElements__documentation,
			ToscaTables.Properties._TEntityTemplate__id,
			ToscaTables.Properties._TEntityTemplate__properties,
			ToscaTables.Properties._TEntityTemplate__propertyConstraints,
			ToscaTables.Properties._TEntityTemplate__type,
			ToscaTables.Properties._TEntityTemplate__typeRef
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _TEntityType = {
			ToscaTables.Properties._TEntityType__abstract,
			ToscaTables.Properties._TExtensibleElements__any,
			ToscaTables.Properties._TExtensibleElements__anyAttribute,
			ToscaTables.Properties._TEntityType__derivedFrom,
			ToscaTables.Properties._TExtensibleElements__documentation,
			ToscaTables.Properties._TEntityType__final,
			ToscaTables.Properties._TEntityType__name,
			ToscaTables.Properties._TEntityType__propertiesDefinition,
			ToscaTables.Properties._TEntityType__tags,
			ToscaTables.Properties._TEntityType__targetNamespace
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _TExportedInterface = {
			ToscaTables.Properties._TExportedInterface__name,
			ToscaTables.Properties._TExportedInterface__operation
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _TExportedOperation = {
			ToscaTables.Properties._TExportedOperation__name,
			ToscaTables.Properties._TExportedOperation__nodeOperation,
			ToscaTables.Properties._TExportedOperation__plan,
			ToscaTables.Properties._TExportedOperation__relationshipOperation
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _TExtensibleElements = {
			ToscaTables.Properties._TExtensibleElements__any,
			ToscaTables.Properties._TExtensibleElements__anyAttribute,
			ToscaTables.Properties._TExtensibleElements__documentation
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _TExtension = {
			ToscaTables.Properties._TExtensibleElements__any,
			ToscaTables.Properties._TExtensibleElements__anyAttribute,
			ToscaTables.Properties._TExtensibleElements__documentation,
			ToscaTables.Properties._TExtension__mustUnderstand,
			ToscaTables.Properties._TExtension__namespace
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _TExtensions = {
			ToscaTables.Properties._TExtensibleElements__any,
			ToscaTables.Properties._TExtensibleElements__anyAttribute,
			ToscaTables.Properties._TExtensibleElements__documentation,
			ToscaTables.Properties._TExtensions__extension
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _TGroupTemplate = {
			ToscaTables.Properties._TExtensibleElements__any,
			ToscaTables.Properties._TExtensibleElements__anyAttribute,
			ToscaTables.Properties._TGroupTemplate__capabilities,
			ToscaTables.Properties._TGroupTemplate__deploymentArtifacts,
			ToscaTables.Properties._TExtensibleElements__documentation,
			ToscaTables.Properties._TEntityTemplate__id,
			ToscaTables.Properties._TGroupTemplate__maxInstances,
			ToscaTables.Properties._TGroupTemplate__member,
			ToscaTables.Properties._TGroupTemplate__minInstances,
			ToscaTables.Properties._TGroupTemplate__name,
			ToscaTables.Properties._TGroupTemplate__policies,
			ToscaTables.Properties._TEntityTemplate__properties,
			ToscaTables.Properties._TEntityTemplate__propertyConstraints,
			ToscaTables.Properties._TGroupTemplate__requirements,
			ToscaTables.Properties._TEntityTemplate__type,
			ToscaTables.Properties._TEntityTemplate__typeRef
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _TGroupType = {
			ToscaTables.Properties._TEntityType__abstract,
			ToscaTables.Properties._TExtensibleElements__any,
			ToscaTables.Properties._TExtensibleElements__anyAttribute,
			ToscaTables.Properties._TGroupType__capabilityDefinitions,
			ToscaTables.Properties._TEntityType__derivedFrom,
			ToscaTables.Properties._TExtensibleElements__documentation,
			ToscaTables.Properties._TEntityType__final,
			ToscaTables.Properties._TGroupType__instanceStates,
			ToscaTables.Properties._TGroupType__interfaces,
			ToscaTables.Properties._TGroupType__member,
			ToscaTables.Properties._TGroupType__memberRefs,
			ToscaTables.Properties._TEntityType__name,
			ToscaTables.Properties._TEntityType__propertiesDefinition,
			ToscaTables.Properties._TGroupType__requirementDefinitions,
			ToscaTables.Properties._TEntityType__tags,
			ToscaTables.Properties._TEntityType__targetNamespace
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _TImplementationArtifact = {
			ToscaTables.Properties._TExtensibleElements__any,
			ToscaTables.Properties._TExtensibleElements__anyAttribute,
			ToscaTables.Properties._TImplementationArtifact__artifactRef,
			ToscaTables.Properties._TImplementationArtifact__artifactType,
			ToscaTables.Properties._TExtensibleElements__documentation,
			ToscaTables.Properties._TImplementationArtifact__interfaceName,
			ToscaTables.Properties._TImplementationArtifact__operationName
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _TImplementationArtifacts = {
			ToscaTables.Properties._TImplementationArtifacts__implementationArtifact
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _TImport = {
			ToscaTables.Properties._TExtensibleElements__any,
			ToscaTables.Properties._TExtensibleElements__anyAttribute,
			ToscaTables.Properties._TExtensibleElements__documentation,
			ToscaTables.Properties._TImport__importType,
			ToscaTables.Properties._TImport__location,
			ToscaTables.Properties._TImport__namespace,
			ToscaTables.Properties._TImport__resource
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _TInterface = {
			ToscaTables.Properties._TInterface__name,
			ToscaTables.Properties._TInterface__operation
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _TNodeTemplate = {
			ToscaTables.Properties._TExtensibleElements__any,
			ToscaTables.Properties._TExtensibleElements__anyAttribute,
			ToscaTables.Properties._TNodeTemplate__capabilities,
			ToscaTables.Properties._TNodeTemplate__deploymentArtifacts,
			ToscaTables.Properties._TExtensibleElements__documentation,
			ToscaTables.Properties._TEntityTemplate__id,
			ToscaTables.Properties._TNodeTemplate__maxInstances,
			ToscaTables.Properties._TNodeTemplate__minInstances,
			ToscaTables.Properties._TNodeTemplate__name,
			ToscaTables.Properties._TNodeTemplate__policies,
			ToscaTables.Properties._TEntityTemplate__properties,
			ToscaTables.Properties._TEntityTemplate__propertyConstraints,
			ToscaTables.Properties._TNodeTemplate__requirements,
			ToscaTables.Properties._TEntityTemplate__type,
			ToscaTables.Properties._TEntityTemplate__typeRef
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _TNodeType = {
			ToscaTables.Properties._TEntityType__abstract,
			ToscaTables.Properties._TExtensibleElements__any,
			ToscaTables.Properties._TExtensibleElements__anyAttribute,
			ToscaTables.Properties._TNodeType__capabilityDefinitions,
			ToscaTables.Properties._TEntityType__derivedFrom,
			ToscaTables.Properties._TExtensibleElements__documentation,
			ToscaTables.Properties._TEntityType__final,
			ToscaTables.Properties._TNodeType__instanceStates,
			ToscaTables.Properties._TNodeType__interfaces,
			ToscaTables.Properties._TEntityType__name,
			ToscaTables.Properties._TEntityType__propertiesDefinition,
			ToscaTables.Properties._TNodeType__requirementDefinitions,
			ToscaTables.Properties._TEntityType__tags,
			ToscaTables.Properties._TEntityType__targetNamespace
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _TNodeTypeImplementation = {
			ToscaTables.Properties._TNodeTypeImplementation__abstract,
			ToscaTables.Properties._TExtensibleElements__any,
			ToscaTables.Properties._TExtensibleElements__anyAttribute,
			ToscaTables.Properties._TNodeTypeImplementation__deploymentArtifacts,
			ToscaTables.Properties._TNodeTypeImplementation__derivedFrom,
			ToscaTables.Properties._TExtensibleElements__documentation,
			ToscaTables.Properties._TNodeTypeImplementation__final,
			ToscaTables.Properties._TNodeTypeImplementation__implementationArtifacts,
			ToscaTables.Properties._TNodeTypeImplementation__name,
			ToscaTables.Properties._TNodeTypeImplementation__nodeType,
			ToscaTables.Properties._TNodeTypeImplementation__requiredContainerFeatures,
			ToscaTables.Properties._TNodeTypeImplementation__tags,
			ToscaTables.Properties._TNodeTypeImplementation__targetNamespace
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _TOperation = {
			ToscaTables.Properties._TExtensibleElements__any,
			ToscaTables.Properties._TExtensibleElements__anyAttribute,
			ToscaTables.Properties._TExtensibleElements__documentation,
			ToscaTables.Properties._TOperation__inputParameters,
			ToscaTables.Properties._TOperation__name,
			ToscaTables.Properties._TOperation__outputParameters
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _TParameter = {
			ToscaTables.Properties._TParameter__name,
			ToscaTables.Properties._TParameter__required,
			ToscaTables.Properties._TParameter__type
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _TPlan = {
			ToscaTables.Properties._TExtensibleElements__any,
			ToscaTables.Properties._TExtensibleElements__anyAttribute,
			ToscaTables.Properties._TExtensibleElements__documentation,
			ToscaTables.Properties._TPlan__id,
			ToscaTables.Properties._TPlan__inputParameters,
			ToscaTables.Properties._TPlan__name,
			ToscaTables.Properties._TPlan__outputParameters,
			ToscaTables.Properties._TPlan__planLanguage,
			ToscaTables.Properties._TPlan__planModel,
			ToscaTables.Properties._TPlan__planModelReference,
			ToscaTables.Properties._TPlan__planType,
			ToscaTables.Properties._TPlan__precondition
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _TPlans = {
			ToscaTables.Properties._TPlans__plan,
			ToscaTables.Properties._TPlans__targetNamespace
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _TPolicy = {
			ToscaTables.Properties._TExtensibleElements__any,
			ToscaTables.Properties._TExtensibleElements__anyAttribute,
			ToscaTables.Properties._TExtensibleElements__documentation,
			ToscaTables.Properties._TPolicy__name,
			ToscaTables.Properties._TPolicy__policyRef,
			ToscaTables.Properties._TPolicy__policyType
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _TPolicyTemplate = {
			ToscaTables.Properties._TExtensibleElements__any,
			ToscaTables.Properties._TExtensibleElements__anyAttribute,
			ToscaTables.Properties._TExtensibleElements__documentation,
			ToscaTables.Properties._TEntityTemplate__id,
			ToscaTables.Properties._TPolicyTemplate__name,
			ToscaTables.Properties._TEntityTemplate__properties,
			ToscaTables.Properties._TEntityTemplate__propertyConstraints,
			ToscaTables.Properties._TEntityTemplate__type,
			ToscaTables.Properties._TEntityTemplate__typeRef
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _TPolicyType = {
			ToscaTables.Properties._TEntityType__abstract,
			ToscaTables.Properties._TExtensibleElements__any,
			ToscaTables.Properties._TExtensibleElements__anyAttribute,
			ToscaTables.Properties._TPolicyType__appliesTo,
			ToscaTables.Properties._TEntityType__derivedFrom,
			ToscaTables.Properties._TExtensibleElements__documentation,
			ToscaTables.Properties._TEntityType__final,
			ToscaTables.Properties._TEntityType__name,
			ToscaTables.Properties._TPolicyType__policyLanguage,
			ToscaTables.Properties._TEntityType__propertiesDefinition,
			ToscaTables.Properties._TEntityType__tags,
			ToscaTables.Properties._TEntityType__targetNamespace
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _TPropertyConstraint = {
			ToscaTables.Properties._TConstraint__any,
			ToscaTables.Properties._TConstraint__constraintType,
			ToscaTables.Properties._TPropertyConstraint__property
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _TPropertyMapping = {
			ToscaTables.Properties._TPropertyMapping__serviceTemplatePropertyRef,
			ToscaTables.Properties._TPropertyMapping__targetObjectRef,
			ToscaTables.Properties._TPropertyMapping__targetPropertyRef
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _TRelationshipTemplate = {
			ToscaTables.Properties._TExtensibleElements__any,
			ToscaTables.Properties._TExtensibleElements__anyAttribute,
			ToscaTables.Properties._TExtensibleElements__documentation,
			ToscaTables.Properties._TEntityTemplate__id,
			ToscaTables.Properties._TRelationshipTemplate__name,
			ToscaTables.Properties._TEntityTemplate__properties,
			ToscaTables.Properties._TEntityTemplate__propertyConstraints,
			ToscaTables.Properties._TRelationshipTemplate__relationshipConstraints,
			ToscaTables.Properties._TRelationshipTemplate__sourceElement,
			ToscaTables.Properties._TRelationshipTemplate__targetElement,
			ToscaTables.Properties._TEntityTemplate__type,
			ToscaTables.Properties._TEntityTemplate__typeRef
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _TRelationshipType = {
			ToscaTables.Properties._TEntityType__abstract,
			ToscaTables.Properties._TExtensibleElements__any,
			ToscaTables.Properties._TExtensibleElements__anyAttribute,
			ToscaTables.Properties._TEntityType__derivedFrom,
			ToscaTables.Properties._TExtensibleElements__documentation,
			ToscaTables.Properties._TEntityType__final,
			ToscaTables.Properties._TRelationshipType__instanceStates,
			ToscaTables.Properties._TEntityType__name,
			ToscaTables.Properties._TEntityType__propertiesDefinition,
			ToscaTables.Properties._TRelationshipType__sourceInterfaces,
			ToscaTables.Properties._TEntityType__tags,
			ToscaTables.Properties._TRelationshipType__targetInterfaces,
			ToscaTables.Properties._TEntityType__targetNamespace,
			ToscaTables.Properties._TRelationshipType__validSource,
			ToscaTables.Properties._TRelationshipType__validTarget
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _TRelationshipTypeImplementation = {
			ToscaTables.Properties._TRelationshipTypeImplementation__abstract,
			ToscaTables.Properties._TExtensibleElements__any,
			ToscaTables.Properties._TExtensibleElements__anyAttribute,
			ToscaTables.Properties._TRelationshipTypeImplementation__derivedFrom,
			ToscaTables.Properties._TExtensibleElements__documentation,
			ToscaTables.Properties._TRelationshipTypeImplementation__final,
			ToscaTables.Properties._TRelationshipTypeImplementation__implementationArtifacts,
			ToscaTables.Properties._TRelationshipTypeImplementation__name,
			ToscaTables.Properties._TRelationshipTypeImplementation__relationshipType,
			ToscaTables.Properties._TRelationshipTypeImplementation__requiredContainerFeatures,
			ToscaTables.Properties._TRelationshipTypeImplementation__tags,
			ToscaTables.Properties._TRelationshipTypeImplementation__targetNamespace
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _TRequiredContainerFeature = {
			ToscaTables.Properties._TRequiredContainerFeature__feature
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _TRequiredContainerFeatures = {
			ToscaTables.Properties._TRequiredContainerFeatures__requiredContainerFeature
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _TRequirement = {
			ToscaTables.Properties._TExtensibleElements__any,
			ToscaTables.Properties._TExtensibleElements__anyAttribute,
			ToscaTables.Properties._TExtensibleElements__documentation,
			ToscaTables.Properties._TEntityTemplate__id,
			ToscaTables.Properties._TRequirement__name,
			ToscaTables.Properties._TEntityTemplate__properties,
			ToscaTables.Properties._TEntityTemplate__propertyConstraints,
			ToscaTables.Properties._TEntityTemplate__type,
			ToscaTables.Properties._TEntityTemplate__typeRef
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _TRequirementDefinition = {
			ToscaTables.Properties._TExtensibleElements__any,
			ToscaTables.Properties._TExtensibleElements__anyAttribute,
			ToscaTables.Properties._TRequirementDefinition__constraints,
			ToscaTables.Properties._TExtensibleElements__documentation,
			ToscaTables.Properties._TRequirementDefinition__lowerBound,
			ToscaTables.Properties._TRequirementDefinition__name,
			ToscaTables.Properties._TRequirementDefinition__requirementType,
			ToscaTables.Properties._TRequirementDefinition__requirementTypeRef,
			ToscaTables.Properties._TRequirementDefinition__upperBound
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _TRequirementRef = {
			ToscaTables.Properties._TRequirementRef__name,
			ToscaTables.Properties._TRequirementRef__ref
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _TRequirementType = {
			ToscaTables.Properties._TEntityType__abstract,
			ToscaTables.Properties._TExtensibleElements__any,
			ToscaTables.Properties._TExtensibleElements__anyAttribute,
			ToscaTables.Properties._TEntityType__derivedFrom,
			ToscaTables.Properties._TExtensibleElements__documentation,
			ToscaTables.Properties._TEntityType__final,
			ToscaTables.Properties._TEntityType__name,
			ToscaTables.Properties._TEntityType__propertiesDefinition,
			ToscaTables.Properties._TRequirementType__requiredCapabilityType,
			ToscaTables.Properties._TRequirementType__requiredCapabilityTypeRef,
			ToscaTables.Properties._TEntityType__tags,
			ToscaTables.Properties._TEntityType__targetNamespace
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _TServiceTemplate = {
			ToscaTables.Properties._TExtensibleElements__any,
			ToscaTables.Properties._TExtensibleElements__anyAttribute,
			ToscaTables.Properties._TServiceTemplate__boundaryDefinitions,
			ToscaTables.Properties._TExtensibleElements__documentation,
			ToscaTables.Properties._TServiceTemplate__id,
			ToscaTables.Properties._TServiceTemplate__name,
			ToscaTables.Properties._TServiceTemplate__plans,
			ToscaTables.Properties._TServiceTemplate__substitutableNodeType,
			ToscaTables.Properties._TServiceTemplate__tags,
			ToscaTables.Properties._TServiceTemplate__targetNamespace,
			ToscaTables.Properties._TServiceTemplate__topologyTemplate
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _TTag = {
			ToscaTables.Properties._TTag__name,
			ToscaTables.Properties._TTag__value
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _TTags = {
			ToscaTables.Properties._TTags__tag
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _TTopologyElementInstanceStates = {
			ToscaTables.Properties._TTopologyElementInstanceStates__instanceState
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _TTopologyTemplate = {
			ToscaTables.Properties._TExtensibleElements__any,
			ToscaTables.Properties._TExtensibleElements__anyAttribute,
			ToscaTables.Properties._TExtensibleElements__documentation,
			ToscaTables.Properties._TTopologyTemplate__group,
			ToscaTables.Properties._TTopologyTemplate__groupTemplate,
			ToscaTables.Properties._TTopologyTemplate__nodeTemplate,
			ToscaTables.Properties._TTopologyTemplate__relationshipTemplate
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _TargetElementType = {
			ToscaTables.Properties._TargetElementType__ref
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _TargetInterfacesType = {
			ToscaTables.Properties._TargetInterfacesType__interface
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _TypesType = {
			ToscaTables.Properties._TypesType__any
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _UpperBoundType = {};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _UpperBoundType1 = {};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _UpperBoundTypeMember0 = {};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _UpperBoundTypeMember01 = {};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _UpperBoundTypeMember1 = {};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _UpperBoundTypeMember11 = {};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _UpperBoundTypeMember1Object = {};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _UpperBoundTypeMember1Object1 = {};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _ValidImportTypes = {};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _ValidSourceType = {
			ToscaTables.Properties._ValidSourceType__typeRef
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _ValidTargetType = {
			ToscaTables.Properties._ValidTargetType__typeRef
		};

		/**
		 *	Install the property descriptors in the fragment descriptors.
		 */
		static {
			Fragments._ArtifactReferencesType__ArtifactReferencesType.initProperties(_ArtifactReferencesType);
			Fragments._CapabilitiesType__CapabilitiesType.initProperties(_CapabilitiesType);
			Fragments._CapabilitiesType1__CapabilitiesType1.initProperties(_CapabilitiesType1);
			Fragments._CapabilitiesType2__CapabilitiesType2.initProperties(_CapabilitiesType2);
			Fragments._CapabilityDefinitionsType__CapabilityDefinitionsType.initProperties(_CapabilityDefinitionsType);
			Fragments._CapabilityDefinitionsType1__CapabilityDefinitionsType1.initProperties(_CapabilityDefinitionsType1);
			Fragments._ConstraintsType__ConstraintsType.initProperties(_ConstraintsType);
			Fragments._ConstraintsType1__ConstraintsType1.initProperties(_ConstraintsType1);
			Fragments._DefinitionsType__DefinitionsType.initProperties(_DefinitionsType);
			Fragments._DerivedFromType__DerivedFromType.initProperties(_DerivedFromType);
			Fragments._DerivedFromType1__DerivedFromType1.initProperties(_DerivedFromType1);
			Fragments._DerivedFromType2__DerivedFromType2.initProperties(_DerivedFromType2);
			Fragments._DocumentRoot__DocumentRoot.initProperties(_DocumentRoot);
			Fragments._ExcludeType__ExcludeType.initProperties(_ExcludeType);
			Fragments._ExtensionsType__ExtensionsType.initProperties(_ExtensionsType);
			Fragments._ImplementationArtifactType__ImplementationArtifactType.initProperties(_ImplementationArtifactType);
			Fragments._ImportedURI__ImportedURI.initProperties(_ImportedURI);
			Fragments._IncludeType__IncludeType.initProperties(_IncludeType);
			Fragments._InputParametersType__InputParametersType.initProperties(_InputParametersType);
			Fragments._InputParametersType1__InputParametersType1.initProperties(_InputParametersType1);
			Fragments._InstanceStateType__InstanceStateType.initProperties(_InstanceStateType);
			Fragments._InterfacesType__InterfacesType.initProperties(_InterfacesType);
			Fragments._InterfacesType1__InterfacesType1.initProperties(_InterfacesType1);
			Fragments._InterfacesType2__InterfacesType2.initProperties(_InterfacesType2);
			Fragments._MaxInstancesType__MaxInstancesType.initProperties(_MaxInstancesType);
			Fragments._MaxInstancesType1__MaxInstancesType1.initProperties(_MaxInstancesType1);
			Fragments._MaxInstancesTypeMember0__MaxInstancesTypeMember0.initProperties(_MaxInstancesTypeMember0);
			Fragments._MaxInstancesTypeMember01__MaxInstancesTypeMember01.initProperties(_MaxInstancesTypeMember01);
			Fragments._MaxInstancesTypeMember1__MaxInstancesTypeMember1.initProperties(_MaxInstancesTypeMember1);
			Fragments._MaxInstancesTypeMember11__MaxInstancesTypeMember11.initProperties(_MaxInstancesTypeMember11);
			Fragments._MaxInstancesTypeMember1Object__MaxInstancesTypeMember1Object.initProperties(_MaxInstancesTypeMember1Object);
			Fragments._MaxInstancesTypeMember1Object1__MaxInstancesTypeMember1Object1.initProperties(_MaxInstancesTypeMember1Object1);
			Fragments._NodeOperationType__NodeOperationType.initProperties(_NodeOperationType);
			Fragments._NodeTypeReferenceType__NodeTypeReferenceType.initProperties(_NodeTypeReferenceType);
			Fragments._OutputParametersType__OutputParametersType.initProperties(_OutputParametersType);
			Fragments._OutputParametersType1__OutputParametersType1.initProperties(_OutputParametersType1);
			Fragments._PlanModelReferenceType__PlanModelReferenceType.initProperties(_PlanModelReferenceType);
			Fragments._PlanModelType__PlanModelType.initProperties(_PlanModelType);
			Fragments._PlanType__PlanType.initProperties(_PlanType);
			Fragments._PoliciesType__PoliciesType.initProperties(_PoliciesType);
			Fragments._PoliciesType1__PoliciesType1.initProperties(_PoliciesType1);
			Fragments._PoliciesType2__PoliciesType2.initProperties(_PoliciesType2);
			Fragments._PropertiesDefinitionType__PropertiesDefinitionType.initProperties(_PropertiesDefinitionType);
			Fragments._PropertiesType__PropertiesType.initProperties(_PropertiesType);
			Fragments._PropertiesType1__PropertiesType1.initProperties(_PropertiesType1);
			Fragments._PropertyConstraintsType__PropertyConstraintsType.initProperties(_PropertyConstraintsType);
			Fragments._PropertyConstraintsType1__PropertyConstraintsType1.initProperties(_PropertyConstraintsType1);
			Fragments._PropertyMappingsType__PropertyMappingsType.initProperties(_PropertyMappingsType);
			Fragments._RelationshipConstraintType__RelationshipConstraintType.initProperties(_RelationshipConstraintType);
			Fragments._RelationshipConstraintsType__RelationshipConstraintsType.initProperties(_RelationshipConstraintsType);
			Fragments._RelationshipOperationType__RelationshipOperationType.initProperties(_RelationshipOperationType);
			Fragments._RequirementDefinitionsType__RequirementDefinitionsType.initProperties(_RequirementDefinitionsType);
			Fragments._RequirementDefinitionsType1__RequirementDefinitionsType1.initProperties(_RequirementDefinitionsType1);
			Fragments._RequirementsType__RequirementsType.initProperties(_RequirementsType);
			Fragments._RequirementsType1__RequirementsType1.initProperties(_RequirementsType1);
			Fragments._RequirementsType2__RequirementsType2.initProperties(_RequirementsType2);
			Fragments._SourceElementType__SourceElementType.initProperties(_SourceElementType);
			Fragments._SourceInterfacesType__SourceInterfacesType.initProperties(_SourceInterfacesType);
			Fragments._TAppliesTo__TAppliesTo.initProperties(_TAppliesTo);
			Fragments._TArtifactReference__TArtifactReference.initProperties(_TArtifactReference);
			Fragments._TArtifactTemplate__TArtifactTemplate.initProperties(_TArtifactTemplate);
			Fragments._TArtifactType__TArtifactType.initProperties(_TArtifactType);
			Fragments._TBoolean__TBoolean.initProperties(_TBoolean);
			Fragments._TBooleanObject__TBooleanObject.initProperties(_TBooleanObject);
			Fragments._TBoundaryDefinitions__TBoundaryDefinitions.initProperties(_TBoundaryDefinitions);
			Fragments._TCapability__TCapability.initProperties(_TCapability);
			Fragments._TCapabilityDefinition__TCapabilityDefinition.initProperties(_TCapabilityDefinition);
			Fragments._TCapabilityRef__TCapabilityRef.initProperties(_TCapabilityRef);
			Fragments._TCapabilityType__TCapabilityType.initProperties(_TCapabilityType);
			Fragments._TCondition__TCondition.initProperties(_TCondition);
			Fragments._TConstraint__TConstraint.initProperties(_TConstraint);
			Fragments._TDefinitions__TDefinitions.initProperties(_TDefinitions);
			Fragments._TDeploymentArtifact__TDeploymentArtifact.initProperties(_TDeploymentArtifact);
			Fragments._TDeploymentArtifacts__TDeploymentArtifacts.initProperties(_TDeploymentArtifacts);
			Fragments._TDocumentation__TDocumentation.initProperties(_TDocumentation);
			Fragments._TEntityTemplate__TEntityTemplate.initProperties(_TEntityTemplate);
			Fragments._TEntityType__TEntityType.initProperties(_TEntityType);
			Fragments._TExportedInterface__TExportedInterface.initProperties(_TExportedInterface);
			Fragments._TExportedOperation__TExportedOperation.initProperties(_TExportedOperation);
			Fragments._TExtensibleElements__TExtensibleElements.initProperties(_TExtensibleElements);
			Fragments._TExtension__TExtension.initProperties(_TExtension);
			Fragments._TExtensions__TExtensions.initProperties(_TExtensions);
			Fragments._TGroupTemplate__TGroupTemplate.initProperties(_TGroupTemplate);
			Fragments._TGroupType__TGroupType.initProperties(_TGroupType);
			Fragments._TImplementationArtifact__TImplementationArtifact.initProperties(_TImplementationArtifact);
			Fragments._TImplementationArtifacts__TImplementationArtifacts.initProperties(_TImplementationArtifacts);
			Fragments._TImport__TImport.initProperties(_TImport);
			Fragments._TInterface__TInterface.initProperties(_TInterface);
			Fragments._TNodeTemplate__TNodeTemplate.initProperties(_TNodeTemplate);
			Fragments._TNodeType__TNodeType.initProperties(_TNodeType);
			Fragments._TNodeTypeImplementation__TNodeTypeImplementation.initProperties(_TNodeTypeImplementation);
			Fragments._TOperation__TOperation.initProperties(_TOperation);
			Fragments._TParameter__TParameter.initProperties(_TParameter);
			Fragments._TPlan__TPlan.initProperties(_TPlan);
			Fragments._TPlans__TPlans.initProperties(_TPlans);
			Fragments._TPolicy__TPolicy.initProperties(_TPolicy);
			Fragments._TPolicyTemplate__TPolicyTemplate.initProperties(_TPolicyTemplate);
			Fragments._TPolicyType__TPolicyType.initProperties(_TPolicyType);
			Fragments._TPropertyConstraint__TPropertyConstraint.initProperties(_TPropertyConstraint);
			Fragments._TPropertyMapping__TPropertyMapping.initProperties(_TPropertyMapping);
			Fragments._TRelationshipTemplate__TRelationshipTemplate.initProperties(_TRelationshipTemplate);
			Fragments._TRelationshipType__TRelationshipType.initProperties(_TRelationshipType);
			Fragments._TRelationshipTypeImplementation__TRelationshipTypeImplementation.initProperties(_TRelationshipTypeImplementation);
			Fragments._TRequiredContainerFeature__TRequiredContainerFeature.initProperties(_TRequiredContainerFeature);
			Fragments._TRequiredContainerFeatures__TRequiredContainerFeatures.initProperties(_TRequiredContainerFeatures);
			Fragments._TRequirement__TRequirement.initProperties(_TRequirement);
			Fragments._TRequirementDefinition__TRequirementDefinition.initProperties(_TRequirementDefinition);
			Fragments._TRequirementRef__TRequirementRef.initProperties(_TRequirementRef);
			Fragments._TRequirementType__TRequirementType.initProperties(_TRequirementType);
			Fragments._TServiceTemplate__TServiceTemplate.initProperties(_TServiceTemplate);
			Fragments._TTag__TTag.initProperties(_TTag);
			Fragments._TTags__TTags.initProperties(_TTags);
			Fragments._TTopologyElementInstanceStates__TTopologyElementInstanceStates.initProperties(_TTopologyElementInstanceStates);
			Fragments._TTopologyTemplate__TTopologyTemplate.initProperties(_TTopologyTemplate);
			Fragments._TargetElementType__TargetElementType.initProperties(_TargetElementType);
			Fragments._TargetInterfacesType__TargetInterfacesType.initProperties(_TargetInterfacesType);
			Fragments._TypesType__TypesType.initProperties(_TypesType);
			Fragments._UpperBoundType__UpperBoundType.initProperties(_UpperBoundType);
			Fragments._UpperBoundType1__UpperBoundType1.initProperties(_UpperBoundType1);
			Fragments._UpperBoundTypeMember0__UpperBoundTypeMember0.initProperties(_UpperBoundTypeMember0);
			Fragments._UpperBoundTypeMember01__UpperBoundTypeMember01.initProperties(_UpperBoundTypeMember01);
			Fragments._UpperBoundTypeMember1__UpperBoundTypeMember1.initProperties(_UpperBoundTypeMember1);
			Fragments._UpperBoundTypeMember11__UpperBoundTypeMember11.initProperties(_UpperBoundTypeMember11);
			Fragments._UpperBoundTypeMember1Object__UpperBoundTypeMember1Object.initProperties(_UpperBoundTypeMember1Object);
			Fragments._UpperBoundTypeMember1Object1__UpperBoundTypeMember1Object1.initProperties(_UpperBoundTypeMember1Object1);
			Fragments._ValidImportTypes__ValidImportTypes.initProperties(_ValidImportTypes);
			Fragments._ValidSourceType__ValidSourceType.initProperties(_ValidSourceType);
			Fragments._ValidTargetType__ValidTargetType.initProperties(_ValidTargetType);

			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of ToscaTables::FragmentProperties and all preceding sub-packages.
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

		public static final /*@NonNull*/ EcoreExecutorEnumerationLiteral _MaxInstancesTypeMember1__unbounded = new EcoreExecutorEnumerationLiteral(ToscaPackage.Literals.MAX_INSTANCES_TYPE_MEMBER1.getEEnumLiteral("unbounded"), Types._MaxInstancesTypeMember1, 0);
		private static final /*@NonNull*/ EcoreExecutorEnumerationLiteral /*@NonNull*/ [] _MaxInstancesTypeMember1 = {
			_MaxInstancesTypeMember1__unbounded
		};

		public static final /*@NonNull*/ EcoreExecutorEnumerationLiteral _MaxInstancesTypeMember11__unbounded = new EcoreExecutorEnumerationLiteral(ToscaPackage.Literals.MAX_INSTANCES_TYPE_MEMBER11.getEEnumLiteral("unbounded"), Types._MaxInstancesTypeMember11, 0);
		private static final /*@NonNull*/ EcoreExecutorEnumerationLiteral /*@NonNull*/ [] _MaxInstancesTypeMember11 = {
			_MaxInstancesTypeMember11__unbounded
		};

		public static final /*@NonNull*/ EcoreExecutorEnumerationLiteral _TBoolean__yes = new EcoreExecutorEnumerationLiteral(ToscaPackage.Literals.TBOOLEAN.getEEnumLiteral("yes"), Types._TBoolean, 0);
		public static final /*@NonNull*/ EcoreExecutorEnumerationLiteral _TBoolean__no = new EcoreExecutorEnumerationLiteral(ToscaPackage.Literals.TBOOLEAN.getEEnumLiteral("no"), Types._TBoolean, 1);
		private static final /*@NonNull*/ EcoreExecutorEnumerationLiteral /*@NonNull*/ [] _TBoolean = {
			_TBoolean__yes,
			_TBoolean__no
		};

		public static final /*@NonNull*/ EcoreExecutorEnumerationLiteral _UpperBoundTypeMember1__unbounded = new EcoreExecutorEnumerationLiteral(ToscaPackage.Literals.UPPER_BOUND_TYPE_MEMBER1.getEEnumLiteral("unbounded"), Types._UpperBoundTypeMember1, 0);
		private static final /*@NonNull*/ EcoreExecutorEnumerationLiteral /*@NonNull*/ [] _UpperBoundTypeMember1 = {
			_UpperBoundTypeMember1__unbounded
		};

		public static final /*@NonNull*/ EcoreExecutorEnumerationLiteral _UpperBoundTypeMember11__unbounded = new EcoreExecutorEnumerationLiteral(ToscaPackage.Literals.UPPER_BOUND_TYPE_MEMBER11.getEEnumLiteral("unbounded"), Types._UpperBoundTypeMember11, 0);
		private static final /*@NonNull*/ EcoreExecutorEnumerationLiteral /*@NonNull*/ [] _UpperBoundTypeMember11 = {
			_UpperBoundTypeMember11__unbounded
		};

		public static final /*@NonNull*/ EcoreExecutorEnumerationLiteral _ValidImportTypes__TOSCAType = new EcoreExecutorEnumerationLiteral(ToscaPackage.Literals.VALID_IMPORT_TYPES.getEEnumLiteral("TOSCAType"), Types._ValidImportTypes, 0);
		public static final /*@NonNull*/ EcoreExecutorEnumerationLiteral _ValidImportTypes__XSDType = new EcoreExecutorEnumerationLiteral(ToscaPackage.Literals.VALID_IMPORT_TYPES.getEEnumLiteral("XSDType"), Types._ValidImportTypes, 1);
		private static final /*@NonNull*/ EcoreExecutorEnumerationLiteral /*@NonNull*/ [] _ValidImportTypes = {
			_ValidImportTypes__TOSCAType,
			_ValidImportTypes__XSDType
		};

		/**
		 *	Install the enumeration literals in the enumerations.
		 */
		static {
			Types._MaxInstancesTypeMember1.initLiterals(_MaxInstancesTypeMember1);
			Types._MaxInstancesTypeMember11.initLiterals(_MaxInstancesTypeMember11);
			Types._TBoolean.initLiterals(_TBoolean);
			Types._UpperBoundTypeMember1.initLiterals(_UpperBoundTypeMember1);
			Types._UpperBoundTypeMember11.initLiterals(_UpperBoundTypeMember11);
			Types._ValidImportTypes.initLiterals(_ValidImportTypes);

			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of ToscaTables::EnumerationLiterals and all preceding sub-packages.
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
