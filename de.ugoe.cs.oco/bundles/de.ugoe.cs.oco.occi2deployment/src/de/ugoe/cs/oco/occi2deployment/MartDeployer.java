package de.ugoe.cs.oco.occi2deployment;

import java.nio.file.Path;
import java.util.List;

import org.eclipse.cmf.occi.core.Configuration;
import org.eclipse.cmf.occi.core.OCCIPackage;
import org.eclipse.cmf.occi.core.Resource;
import org.eclipse.cmf.occi.core.util.OcciRegistry;
import org.eclipse.cmf.occi.infrastructure.InfrastructurePackage;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.epsilon.emc.emf.CachedResourceSet;
import org.eclipse.uml2.uml.Model;
import org.modmacao.placement.PlacementPackage;

import de.ugoe.cs.oco.occi2deployment.adapter.ElementAdapter;
import de.ugoe.cs.oco.occi2deployment.comparator.Comparator;
import de.ugoe.cs.oco.occi2deployment.comparator.ComparatorFactory;
import de.ugoe.cs.oco.occi2deployment.connector.MartConnector;
import de.ugoe.cs.oco.occi2deployment.deprovisioner.Deprovisioner;
import de.ugoe.cs.oco.occi2deployment.execution.Executor;
import de.ugoe.cs.oco.occi2deployment.execution.ExecutorFactory;
import de.ugoe.cs.oco.occi2deployment.provisioner.OOIProvisioner;
import de.ugoe.cs.oco.occi2deployment.provisioner.Provisioner;
import de.ugoe.cs.oco.occi2deployment.provisioner.ProvisionerFactory;
import de.ugoe.cs.oco.occi2deployment.transformation.Transformator;
import de.ugoe.cs.oco.occi2deployment.transformation.TransformatorFactory;
import modmacao.ModmacaoPackage;
import openstackruntime.OpenstackruntimePackage;
import ossweruntime.OssweruntimePackage;

public class MartDeployer extends AbsDeployer{
	public void deploy(Path targetConfigPath, MartConnector conn) {
		InfrastructurePackage.eINSTANCE.eClass();
		OCCIPackage.eINSTANCE.eClass();
		ModmacaoPackage.eINSTANCE.eClass();
		OpenstackruntimePackage.eINSTANCE.eClass();
		OssweruntimePackage.eINSTANCE.eClass();
		PlacementPackage.eINSTANCE.eClass();
		
		OcciRegistry.getInstance().registerExtension("http://schemas.modmacao.org/modmacao#", "/home/erbel/git/open-cloud-orchestrator/de.ugoe.cs.oco/bundles/de.ugoe.cs.oco.occi2deployment/extensions/modmacao.occie");
		OcciRegistry.getInstance().registerExtension("http://schemas.modmacao.org/openstack/runtime#", "/home/erbel/git/open-cloud-orchestrator/de.ugoe.cs.oco/bundles/de.ugoe.cs.oco.occi2deployment/extensions/openstackruntime.occie");
		OcciRegistry.getInstance().registerExtension("http://schemas.modmacao.org/openstack/swe#", "/home/erbel/git/open-cloud-orchestrator/de.ugoe.cs.oco/bundles/de.ugoe.cs.oco.occi2deployment/extensions/ossweruntime.occie");
		OcciRegistry.getInstance().registerExtension("http://schemas.occiware.org/placement#", "/home/erbel/git/open-cloud-orchestrator/de.ugoe.cs.oco/bundles/de.ugoe.cs.oco.occi2deployment/extensions/placement.occie");
		OcciRegistry.getInstance().registerExtension("http://schemas.ogf.org/occi/infrastructure#", InfrastructurePackage.class.getClassLoader().getResource("model/Infrastructure.occie").toString());
		
		conn.loadRuntimeModel("models", "model-anonymous.occic", runtimePath.toString());
		
		org.eclipse.emf.ecore.resource.Resource runtimeModel = ModelUtility.loadOCCIResource(runtimePath, null);	
		org.eclipse.emf.ecore.resource.Resource targetModel = ModelUtility.loadOCCIResource(targetConfigPath, null);
		
		if(ModelUtility.getOCCIConfigurationContents(runtimeModel).size() < 0){
			log.info("Chosen: Initial Deployment, Amount of Resources in Runtimemodel: " + ModelUtility.getOCCIConfigurationContents(runtimeModel).size());
			this.initialDeploy(targetModel, conn);
		}
		else{
			log.info("Chosen: Adaptation Process");
			//Adapt to runtime model, when extractor is up to date again
			//Or check if runtime model equals sysmodel
			this.adapt(runtimeModel, targetModel, conn);
		}
	}

	private void adapt(org.eclipse.emf.ecore.resource.Resource runtimeModel, org.eclipse.emf.ecore.resource.Resource targetModel, MartConnector conn) {
		EList<EObject> occiModel = ModelUtility.getOCCIConfigurationContents(targetModel);
		//Compare Models
		CachedResourceSet.getCache().clear();
		Comparator comparator = ComparatorFactory.getComparator("Simple", runtimeModel, targetModel, null);
		
		Executor exec = ExecutorFactory.getExecutor("Mart", conn);
		
		//Deprovision Missing Elements
		Deprovisioner deprovisioner = new Deprovisioner(exec);
		deprovisioner.deprovision(comparator.getMissingElements());
		
		//Adapt adapted elements
		//ElementAdapter adapter = new ElementAdapter(exec);
		//adapter.update(comparator.getAdaptedElements(), comparator.getMatches());
		
		//Create Provisioning Plan
		List<EObject> removeFromPOG = new BasicEList<EObject>();
		removeFromPOG.addAll(comparator.getOldElements());
		removeFromPOG.addAll(comparator.getAdaptedElements());
		Model provisioningPlan = generateProvisioningPlan(targetModel, removeFromPOG);
		
		//Start provisioning
		Provisioner provisioner = ProvisionerFactory.getProvisioner("Mart", new ModelUtility().findInitialNode(provisioningPlan), occiModel, exec, null);
		provisioner.provisionElements();	
		
		log.info("Deployment process finished");
	}

	private void initialDeploy(org.eclipse.emf.ecore.resource.Resource targetModel, MartConnector conn) {
		EList<EObject> occiModel = ModelUtility.getOCCIConfigurationContents(targetModel);
		//OCCI2POG
		Transformator occiToPog = TransformatorFactory.getTransformator("OCCI2POG");
		occiToPog.transform(targetModel, pogPath);
		//POG2ProvPlan
		Transformator pogToProvPlan = TransformatorFactory.getTransformator("POG2ProvPlan");
		pogToProvPlan.transform(pogPath, provPlanPath);
		//LoadProvPlan
		Model provisioningPlan = ModelUtility.loadUML(provPlanPath);	
		//START PROVISIONING
		Executor exec = ExecutorFactory.getExecutor("Mart", conn);
		
		Provisioner provisioner = ProvisionerFactory.getProvisioner("Mart", new ModelUtility().findInitialNode(provisioningPlan), occiModel, exec, null);
		provisioner.provisionElements();
		
	}
}
