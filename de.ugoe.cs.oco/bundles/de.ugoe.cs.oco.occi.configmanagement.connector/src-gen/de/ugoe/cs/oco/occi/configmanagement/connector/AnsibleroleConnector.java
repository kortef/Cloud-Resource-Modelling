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
 * Generated at Thu Sep 07 11:19:52 CEST 2017 from platform:/resource/de.ugoe.cs.oco.occi.configmanagement/model/configmanagement.occie by org.eclipse.cmf.occi.core.gen.connector
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

import de.ugoe.cs.oco.occi.configmanagement.InstallationState;
import de.ugoe.cs.oco.occi.configmanagement.Roleattachment;
/**
 * Connector implementation for the OCCI kind:
 * - scheme: http://oco.cs.ugoe.de/occi/configmanagement#
 * - term: ansiblerole
 * - title: ManagedComponent
 */
public class AnsibleroleConnector extends de.ugoe.cs.oco.occi.configmanagement.impl.AnsibleroleImpl
{
	/**
	 * Initialize the logger.
	 */
	private static Logger LOGGER = LoggerFactory.getLogger(AnsibleroleConnector.class);

	// Start of user code Ansibleroleconnector_constructor
	/**
	 * Constructs a ansiblerole connector.
	 */
	AnsibleroleConnector()
	{
		LOGGER.debug("Constructor called on " + this);
		// TODO: Implement this constructor.
	}
	// End of user code
	//
	// OCCI CRUD callback operations.
	//
	
	// Start of user code AnsibleroleocciCreate
	/**
	 * Called when this Ansiblerole instance is completely created.
	 */
	@Override
	public void occiCreate()
	{
		LOGGER.debug("occiCreate() called on " + this);
		// TODO: Implement this callback or remove this method.
	}
	// End of user code

	// Start of user code Ansiblerole_occiRetrieve_method
	/**
	 * Called when this Ansiblerole instance must be retrieved.
	 */
	@Override
	public void occiRetrieve()
	{
		LOGGER.debug("occiRetrieve() called on " + this);
		// TODO: Implement this callback or remove this method.
	}
	// End of user code

	// Start of user code Ansiblerole_occiUpdate_method
	/**
	 * Called when this Ansiblerole instance is completely updated.
	 */
	@Override
	public void occiUpdate()
	{
		LOGGER.debug("occiUpdate() called on " + this);
		// TODO: Implement this callback or remove this method.
	}
	// End of user code

	// Start of user code AnsibleroleocciDelete_method
	/**
	 * Called when this Ansiblerole instance will be deleted.
	 */
	@Override
	public void occiDelete()
	{
		LOGGER.debug("occiDelete() called on " + this);
		// TODO: Implement this callback or remove this method.
	}
	// End of user code

	//
	// Ansiblerole actions.
	//
	// Start of user code Ansiblerole_Kind_attachrole_action
	/**
	 * Implement OCCI action:
     * - scheme: http://oco.cs.ugoe.de/occi/configmanagement/ansiblerole/action#
     * - term: attachrole
     * - title: attachRole
	 */
	@Override
	public void attachrole()
	{
		LOGGER.debug("Action attachrole() called on " + this);
		
		String role = this.getOcciAnsibleRolename();
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
			
			this.setOcciAnsibleInstallationstateMessage(Integer.toString(status));
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// Ansiblerole State Machine.
		switch(this.getOcciAnsibleInstallationstate().getValue()) {
		
		case InstallationState.UNINSTALLED_VALUE:
			this.setOcciAnsibleInstallationstate(InstallationState.INSTALLED);
			break;
		
		default:
			break;
		}
	}
		// End of user code

	// Start of user code Ansiblerole_Kind_detachrole_action
	/**
	 * Implement OCCI action:
	 * - scheme: http://oco.cs.ugoe.de/occi/configmanagement/managedcomponent/action#
	 * - term: detachrole
	 * - title: 
	 */
	@Override
	public void detachrole(){
		LOGGER.debug("Action detachrole() called on " + this);

		String role = this.getOcciAnsibleRolename();
		role = role + "_rollback";
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
			
			LOGGER.info("Executing role " + role + " on host " + ipaddress);	
			int status = helper.executePlaybook(playbook, inventory);
			
			this.setOcciAnsibleInstallationstateMessage(Integer.toString(status));
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		// Ansiblerole State Machine.
		switch(this.getOcciAnsibleInstallationstate().getValue()) {
		case InstallationState.INSTALLED_VALUE:
			this.setOcciAnsibleInstallationstate(InstallationState.UNINSTALLED);
			break;
		
		default:
			break;
		}
	}
	private String getIPAddress(){
		EList<Link> links = this.getLinks();
		Roleattachment attachment = null;
		Networkinterface networklink = null;
		String ipaddress = null;

		for (Link link:links) {
			if (link instanceof Roleattachment) {
				LOGGER.info("Found roleattachment for " + this);
				attachment = (Roleattachment) link;
				break;
			}	
		}
		if (attachment == null) {
			LOGGER.error("No roleattachment found for " + this);	
		} else {
			Compute target = (Compute) attachment.getTarget();
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
		EList<Link> links = this.getLinks();
		Roleattachment attachment = null;
		String user = null;

		for (Link link:links) {
			if (link instanceof Roleattachment) {
				LOGGER.info("Found roleattachment for " + this);
				attachment = (Roleattachment) link;
				LOGGER.info("Rollattachment is " + attachment);
				for (AttributeState attribute: attachment.getAttributes() ) {
					if (attribute.getName().equals("occi.ansible.user")) {
						user = attribute.getValue();
						LOGGER.info("User for rollattachment is " + user);
						break;
					}
				}
				break;
			}	
		}
		if (attachment == null) {
			LOGGER.error("No role attachment found for " + this);	
		}
		
		return user;
	}
	
	private String getKeyName(){
		return null;
	}
	// End of user code

}	
