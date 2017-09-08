/**
 * Copyright (c) 2016-2017 Inria
 *  
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 * - Philippe Merle <philippe.merle@inria.fr>
 * - Faiez Zalila <faiez.zalila@inria.fr>
 *
 * Generated at Fri Sep 08 15:39:06 CEST 2017 from platform:/resource/de.ugoe.cs.oco.occi.configmanagement/model/configmanagement.occie by org.eclipse.cmf.occi.core.gen.connector
 */
package de.ugoe.cs.oco.occi.configmanagement.connector;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

import org.eclipse.cmf.occi.core.AttributeState;
import org.eclipse.cmf.occi.core.Link;
import org.eclipse.cmf.occi.infrastructure.Compute;
import org.eclipse.cmf.occi.infrastructure.Networkinterface;
import org.eclipse.emf.common.util.EList;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import de.ugoe.cs.oco.occi.configmanagement.Ansiblerole;
import de.ugoe.cs.oco.occi.configmanagement.Componenthosting;
import de.ugoe.cs.oco.occi.configmanagement.InstallationState;
import de.ugoe.cs.oco.occi.configmanagement.Managedcomponent;
/**
 * Connector implementation for the OCCI kind:
 * - scheme: http://oco.cs.ugoe.de/occi/configmanagement#
 * - term: roleattachment
 * - title: RoleAttachment
 */
public class RoleattachmentConnector extends de.ugoe.cs.oco.occi.configmanagement.impl.RoleattachmentImpl
{
	/**
	 * Initialize the logger.
	 */
	private static Logger LOGGER = LoggerFactory.getLogger(RoleattachmentConnector.class);

	// Start of user code Roleattachmentconnector_constructor
	/**
	 * Constructs a roleattachment connector.
	 */
	RoleattachmentConnector()
	{
		LOGGER.debug("Constructor called on " + this);
		// TODO: Implement this constructor.
	}
	// End of user code
	//
	// OCCI CRUD callback operations.
	//
	
	// Start of user code RoleattachmentocciCreate
	/**
	 * Called when this Roleattachment instance is completely created.
	 */
	@Override
	public void occiCreate()
	{
		LOGGER.debug("occiCreate() called on " + this);
		
		Managedcomponent component = (Managedcomponent) this.getTarget();
		String role = this.getRoleName();
		String ipaddress = this.getIPAddress();
		String user = this.getUser();
		
		ArrayList<String> roles = new ArrayList<String>();
		roles.add(role);
		
		String basedir = "/tmp/" + this.getTitle() + "_ansible";
		
		AnsibleHelper helper = new AnsibleHelper();
		try {
			helper.createConfiguration(Paths.get(".", "ansible.cfg"), null);
			
			Path playbook = helper.createPlaybook(ipaddress, roles, user, 
					Paths.get(basedir, "playbook.yml"));
			
			Path inventory = helper.createInventory(ipaddress, Paths.get(basedir, "inventory"));
			
			LOGGER.info("Executing role " + role + " on host " + ipaddress + " with user " + user);	
			int status = helper.executePlaybook(playbook, inventory);
			
			component.setOcciComponentInstallationstateMessage(Integer.toString(status));
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// Ansiblerole State Machine.
		switch(component.getOcciComponentInstallationstate().getValue()) {
		
		case InstallationState.UNINSTALLED_VALUE:
			component.setOcciComponentInstallationstate(InstallationState.INSTALLED);
			break;
		
		default:
			break;
		}
	}
	// End of user code

	// Start of user code Roleattachment_occiRetrieve_method
	/**
	 * Called when this Roleattachment instance must be retrieved.
	 */
	@Override
	public void occiRetrieve()
	{
		LOGGER.debug("occiRetrieve() called on " + this);
		// TODO: Implement this callback or remove this method.
	}
	// End of user code

	// Start of user code Roleattachment_occiUpdate_method
	/**
	 * Called when this Roleattachment instance is completely updated.
	 */
	@Override
	public void occiUpdate()
	{
		LOGGER.debug("occiUpdate() called on " + this);
		// TODO: Implement this callback or remove this method.
	}
	// End of user code

	// Start of user code RoleattachmentocciDelete_method
	/**
	 * Called when this Roleattachment instance will be deleted.
	 */
	@Override
	public void occiDelete()
	{
		LOGGER.debug("occiDelete() called on " + this);
		
		Managedcomponent component = (Managedcomponent) this.getTarget();
		String role = this.getRoleName();
		String ipaddress = this.getIPAddress();
		String user = this.getUser();
		
		role = role + "_rollback";
		ArrayList<String> roles = new ArrayList<String>();
		roles.add(role);
		
		String basedir = "/tmp/" + this.getTitle() + "_ansible";
		
		AnsibleHelper helper = new AnsibleHelper();
		try {
			helper.createConfiguration(Paths.get(".", "ansible.cfg"), null);
			
			Path playbook = helper.createPlaybook(ipaddress, roles, user, 
					Paths.get(basedir, "playbook.yml"));
			
			Path inventory = helper.createInventory(ipaddress, Paths.get(basedir, "inventory"));
			
			LOGGER.info("Executing role " + role + " on host " + ipaddress + " with user " + user);	
			int status = helper.executePlaybook(playbook, inventory);
			
			component.setOcciComponentInstallationstateMessage(Integer.toString(status));
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// Ansiblerole State Machine.
		switch(component.getOcciComponentInstallationstate().getValue()) {
		
		case InstallationState.INSTALLED_VALUE:
			component.setOcciComponentInstallationstate(InstallationState.UNINSTALLED);
			break;
		
		default:
			break;
		}
		
		
		
	}
	// End of user code

	//
	// Roleattachment actions.
	//
	private String getIPAddress(){
		Managedcomponent component = (Managedcomponent) this.getTarget();
		EList<Link> links = component.getLinks();
		Networkinterface networklink = null;
		Componenthosting hosting = null;
		String ipaddress = null;

		for (Link link:links) {
			if (link instanceof Componenthosting) {
				LOGGER.info("Found componenthosting for " + component);
				hosting = (Componenthosting) link;
				break;
			}	
		}
		if (hosting == null) {
			LOGGER.error("No hosting found for component " + component);	
		} else {
			Compute target = (Compute) hosting.getTarget();
			links = target.getLinks();

			for (Link link:links) {
				if (link instanceof Networkinterface) {
					LOGGER.info("Found network link for " + target);
					networklink = (Networkinterface) link;
					break;
				}	
			}
			if (networklink == null) {
				LOGGER.error("No network link found for " + target);	
			} else {
				for (AttributeState attribute: networklink.getAttributes() ) {
					if (attribute.getName().equals("occi.networkinterface.address")) {
						LOGGER.info("Found IP address for " + networklink);
						ipaddress = attribute.getValue();
						LOGGER.info("IP address is " + ipaddress);
					}
				}
			}
		}
		return ipaddress;
	}
	
	private String getUser() {
		String user = null;
		for (AttributeState attribute: this.getAttributes() ) {
			if (attribute.getName().equals("occi.ansible.user")) {
				user = attribute.getValue();
				LOGGER.info("User for rollattachment is " + user);
				break;
			}
		}
		return user;
	}
	
	private String getKeyName(){
		return null;
	}
	
	private String getRoleName() {
		Ansiblerole ansibleRole = (Ansiblerole) this.getSource();
		return ansibleRole.getOcciAnsibleRolename();
	}
	// End of user code
}	
