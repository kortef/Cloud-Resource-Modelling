package de.ugoe.cs.oco.usecases.test;

import java.io.BufferedWriter;
import java.io.File;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.eclipse.cmf.occi.core.Extension;
import org.eclipse.cmf.occi.core.OCCIPackage;
import org.eclipse.cmf.occi.core.util.OCCIResourceFactoryImpl;
import org.eclipse.cmf.occi.core.util.OcciRegistry;
import org.eclipse.cmf.occi.infrastructure.InfrastructurePackage;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.epsilon.emc.emf.CachedResourceSet;
import org.modmacao.ansibleconfiguration.AnsibleconfigurationPackage;
import org.modmacao.placement.PlacementPackage;
import org.modmacao.toscabasetypes.ToscabasetypesPackage;
import org.modmacao.toscaspecifictypes.ToscaspecifictypesPackage;

import de.ugoe.cs.oco.tosca.ToscaPackage;
import de.ugoe.cs.oco.tosca.util.ToscaResourceFactoryImpl;
import de.ugoe.cs.rwm.cocci.Comparator;
import de.ugoe.cs.rwm.docci.Deployer;
import de.ugoe.cs.rwm.docci.appdeployer.MartAppDeployerMaster;
import de.ugoe.cs.rwm.docci.appdeployer.MartAppDeployerSlave;
import de.ugoe.cs.rwm.docci.connector.Connector;
import de.ugoe.cs.rwm.docci.deprovisioner.Deprovisioner;
import de.ugoe.cs.rwm.docci.executor.Executor;
import de.ugoe.cs.rwm.docci.extractor.Extractor;
import de.ugoe.cs.rwm.docci.provisioner.Provisioner;
import modmacao.ModmacaoPackage;
import openstackruntime.OpenstackruntimePackage;
import ossweruntime.OssweruntimePackage;

public class TestUtil {
	/*static String UBUNTU_USERDATA = "I2Nsb3VkLWNvbmZpZwoKIyBVcGdyYWRlIHRoZSBpbnN0YW5jZSBvbiBmaXJzdCBib290CiMgKGllIHJ1biBhcHQtZ2V0IHVwZ3JhZGUpC"
			+ "iMKIyBEZWZhdWx0OiBmYWxzZQojIEFsaWFzZXM6IGFwdF91cGdyYWRlCnBhY2thZ2VfdXBncmFkZTogdHJ1ZQoKcGFja2FnZXM6CiAtIHB5dGhvbgoKd3Jpd"
			+ "GVfZmlsZXM6CiAgLSBwYXRoOiAvZXRjL25ldHdvcmsvaW50ZXJmYWNlcy5kLzUwLWNsb3VkLWluaXQuY2ZnCiAgICBjb250ZW50OiB8CiAgICAgIGF1dG8gb"
			+ "G8KICAgICAgaWZhY2UgbG8gaW5ldCBsb29wYmFjawogICAgICAKICAgICAgYXV0byBlbnMwCiAgICAgIGFsbG93LWhvdHBsdWcgZW5zMAogICAgICBpZmFjZ"
			+ "SBlbnMwIGluZXQgZGhjcAogICAgICAKICAgICAgYXV0byBlbnMxCiAgICAgIGFsbG93LWhvdHBsdWcgZW5zMQogICAgICBpZmFjZSBlbnMxIGluZXQgZGhjc"
			+ "AogICAgICAKICAgICAgYXV0byBlbnMyCiAgICAgIGFsbG93LWhvdHBsdWcgZW5zMgogICAgICBpZmFjZSBlbnMyIGluZXQgZGhjcAogICAgICAKICAgICAgY"
			+ "XV0byBlbnMzCiAgICAgIGFsbG93LWhvdHBsdWcgZW5zMwogICAgICBpZmFjZSBlbnMzIGluZXQgZGhjcAogICAgICAKICAgICAgYXV0byBlbnM0CiAgICAgI"
			+ "GFsbG93LWhvdHBsdWcgZW5zNAogICAgICBpZmFjZSBlbnM0IGluZXQgZGhjcAogICAgICAKICAgICAgYXV0byBlbnM1CiAgICAgIGFsbG93LWhvdHBsdWcgZ"
			+ "W5zNQogICAgICBpZmFjZSBlbnM1IGluZXQgZGhjcAogICAgICAKICAgICAgYXV0byBlbnM2CiAgICAgIGFsbG93LWhvdHBsdWcgZW5zNgogICAgICBpZmFjZ"
			+ "SBlbnM2IGluZXQgZGhjcAogICAgICAKICAgICAgYXV0byBlbnM3CiAgICAgIGFsbG93LWhvdHBsdWcgZW5zNwogICAgICBpZmFjZSBlbnM3IGluZXQgZGhjc"
			+ "AogICAgICAKICAgICAgYXV0byBlbnM4CiAgICAgIGFsbG93LWhvdHBsdWcgZW5zOAogICAgICBpZmFjZSBlbnM4IGluZXQgZGhjcAogICAgICAKICAgICAgY"
			+ "XV0byBlbnM5CiAgICAgIGFsbG93LWhvdHBsdWcgZW5zOQogICAgICBpZmFjZSBlbnM5IGluZXQgZGhjcAogICAgICAKICAgICAgYXV0byBlbnMxMAogICAgI"
			+ "CBhbGxvdy1ob3RwbHVnIGVuczEwCiAgICAgIGlmYWNlIGVuczEwIGluZXQgZGhjcAoKIyMj"; // Ubuntu userdata*/
	
	static String UBUNTU_USERDATA = "IyEvYmluL2Jhc2gKCnN5c3RlbWN0bCBzdG9wIGFwdC1kYWlseS5zZXJ2aWNlCnN5c3RlbWN0bCBraWxsIC0ta2lsbC13aG89YW"
			+ "xsIGFwdC1kYWlseS5zZXJ2aWNlCgoK";
	
	static String CENTOS_USERDATA = "IyEvYmluL2Jhc2gKCmNwIC9ldGMvc3lzY29uZmlnL25ldHdvcmstc2NyaXB0cy9pZmNmZy1ldGgwIC9ldGMvc3lzY29uZmlnL25ldHdvc"
			+ "mstc2NyaXB0cy9pZmNmZy1ldGgxCnN1ZG8gc2VkIC1pICdzL2V0aDAvZXRoMS9nJyAvZXRjL3N5c2NvbmZpZy9uZXR3b3JrLXNjcmlwdHMvaWZjZmctZXRoM"
			+ "QppZnVwIGV0aDEKCgoK"; // Centos userdata	*/
	static String PUBLICKEY = "ssh-rsa AAAAB3NzaC1yc2EAAAADAQABAAABAQC3y+/DnTyhETdDGREFT9PzqA3DWY3h5O5l0cgRu37NiWSyHJUD8RgdRXd/GtJ4iNQq"
			+ "udvvABNYR65304o6ayO9nZKsyL4Q0o789eCiqk6oU/gY7t8LotJYpvk5Hn+bEznaykmZmOJ/56vSigntUKjke0TMCOrnzof765mapePZkT4Vqj1gD6owpLce"
			+ "Gd3iLK8kd+iKISyp9Ca4Q1D6hXmLdw0aB4t8eJr+rulPvjU1WoqE/miU76+Qj5/foMNwiEJN2GpNSUdTv9+FBpi4AESGpeOukVlOsZQshmKzeQqUnjb/R8ZS"
			+ "jebZOwmE+KZBHg39iIiqumK4vppYhk5huUeV";
	static String MANNETID = "urn:uuid:29d78078-fb4c-47aa-a9af-b8aaf3339590";
	static String MANNETRUNTIMEID = "29d78078-fb4c-47aa-a9af-b8aaf3339590";
	
	static long lastLog = 0;
	
	protected static void loadAndRegisterOCCIExtensions(String basepath, ResourceSet set) {
		if (basepath != null && set != null) {
			List<File> occiExtFileList =  new LinkedList<File>();
			List<Resource> occiExtResources = new LinkedList<Resource>();
			File inputDir = new File(basepath); 
			try {
				for (File file: inputDir.listFiles()) {
					if (file.getName().endsWith(".occie")) {
						occiExtFileList.add(file);
					}
				}

				for (File file: occiExtFileList) {
					System.out.println("Found extension file: " + file);
					URI uri = URI.createFileURI(file.getAbsolutePath());
					Resource resource = set.getResource(uri, true);
					Extension extension = (Extension) resource.getContents().get(0);
					Resource inMemoryResource = set.createResource(URI.createURI(extension.getScheme()));
					inMemoryResource.getContents().add(extension);
					occiExtResources.add(inMemoryResource);
					OcciRegistry.getInstance().registerExtension(extension.getScheme(), uri.toString());
				}

			} catch (Exception e) {}
		}
	    
		OcciRegistry.getInstance().registerExtension(InfrastructurePackage.eNS_URI.replaceFirst("/ecore", "#"),
				InfrastructurePackage.class.getClassLoader().getResource("model/Infrastructure.occie").toString());
		OcciRegistry.getInstance().registerExtension(ModmacaoPackage.eNS_URI.replaceFirst("/ecore", "#"),
				ModmacaoPackage.class.getClassLoader().getResource("model/modmacao.occie").toString());
		OcciRegistry.getInstance().registerExtension(OCCIPackage.eNS_URI.replaceFirst("/ecore", "#"),
				OCCIPackage.class.getClassLoader().getResource("model/Core.occie").toString());
		OcciRegistry.getInstance().registerExtension(OssweruntimePackage.eNS_URI.replaceFirst("/ecore", "#"),
				OssweruntimePackage.class.getClassLoader().getResource("model/ossweruntime.occie").toString());
		OcciRegistry.getInstance().registerExtension(OpenstackruntimePackage.eNS_URI.replaceFirst("/ecore", "#"),
				OpenstackruntimePackage.class.getClassLoader().getResource("model/openstackruntime.occie").toString());
		OcciRegistry.getInstance().registerExtension(AnsibleconfigurationPackage.eNS_URI.replaceFirst("/ecore", "#"),
				AnsibleconfigurationPackage.class.getClassLoader().getResource("model/ansibleconfiguration.occie").toString());
	
	}
	
	protected static void setLoggerConfiguration() {
		Logger.getLogger(Executor.class.getName()).setLevel(Level.DEBUG);
		Logger.getLogger(Extractor.class.getName()).setLevel(Level.DEBUG);
		Logger.getLogger(Provisioner.class.getName()).setLevel(Level.DEBUG);
		Logger.getLogger(Comparator.class.getName()).setLevel(Level.DEBUG);
		Logger.getLogger(Deprovisioner.class.getName()).setLevel(Level.INFO);
		Logger.getLogger(Connector.class.getName()).setLevel(Level.DEBUG);
		Logger.getLogger(Deployer.class.getName()).setLevel(Level.INFO);
		Logger.getLogger(MartAppDeployerMaster.class.getName()).setLevel(Level.DEBUG);
		Logger.getLogger(MartAppDeployerSlave.class.getName()).setLevel(Level.DEBUG); 
		Logger.getLogger(OcciRegistry.class.getName()).setLevel(Level.DEBUG);
	}
	
	protected static void initializePackages() {
		CachedResourceSet.getCache().clear();
		ToscaPackage.eINSTANCE.eClass();
		ToscabasetypesPackage.eINSTANCE.eClass();
		ToscaspecifictypesPackage.eINSTANCE.eClass();
		
		OCCIPackage.eINSTANCE.eClass();
		InfrastructurePackage.eINSTANCE.eClass();
		ModmacaoPackage.eINSTANCE.eClass();
		OpenstackruntimePackage.eINSTANCE.eClass();
		PlacementPackage.eINSTANCE.eClass();
		OssweruntimePackage.eINSTANCE.eClass();
		AnsibleconfigurationPackage.eINSTANCE.eClass();
	}
	
	protected static void initializeRuntime() {
		EcorePlugin.ExtensionProcessor.process(null);
	}
	
	
	protected static void registerFactories() {
		Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
	    Map<String, Object> m = reg.getExtensionToFactoryMap();
	    m.put("tosca", new ToscaResourceFactoryImpl());
	    m.put("toscac", new ToscaResourceFactoryImpl());
	    m.put("occie", new OCCIResourceFactoryImpl());
	    m.put("occic", new OCCIResourceFactoryImpl());
	    m.put("*", new XMIResourceFactoryImpl());
		
	}
	
	private static long getTimestamp() {
		return System.currentTimeMillis();
	}
	
	protected static void log(BufferedWriter bw, String message) throws IOException {
		long currentTime = getTimestamp();
		long elapsedMiliSecs = currentTime - lastLog;
		bw.write(elapsedMiliSecs + ":" + currentTime  + ": " + message);
		bw.newLine();
		
		lastLog = currentTime;
	}
	
	protected static void resetLogTimer() {
		lastLog = getTimestamp();
	}
	

	
}
