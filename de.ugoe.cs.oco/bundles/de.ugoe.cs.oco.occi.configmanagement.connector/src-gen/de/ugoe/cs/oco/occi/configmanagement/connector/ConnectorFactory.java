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

/**
 * Connector EFactory for the OCCI extension:
 * - name: configmanagement
 * - scheme: http://oco.cs.ugoe.de/occi/configmanagement#
 */
public class ConnectorFactory extends de.ugoe.cs.oco.occi.configmanagement.impl.ConfigmanagementFactoryImpl
{
	/**
	 * EFactory method for OCCI kind:
	 * - scheme: http://oco.cs.ugoe.de/occi/configmanagement#
	 * - term: ansiblerole
	 * - title: AnsibleRole
	 */
	@Override
	public de.ugoe.cs.oco.occi.configmanagement.Ansiblerole createAnsiblerole() {
		return new AnsibleroleConnector();
	}

	/**
	 * EFactory method for OCCI kind:
	 * - scheme: http://oco.cs.ugoe.de/occi/configmanagement#
	 * - term: roleattachment
	 * - title: RoleAttachment
	 */
	@Override
	public de.ugoe.cs.oco.occi.configmanagement.Roleattachment createRoleattachment() {
		return new RoleattachmentConnector();
	}

	/**
	 * EFactory method for OCCI kind:
	 * - scheme: http://oco.cs.ugoe.de/occi/configmanagement#
	 * - term: managedcomponent
	 * - title: ManagedComponent
	 */
	@Override
	public de.ugoe.cs.oco.occi.configmanagement.Managedcomponent createManagedcomponent() {
		return new ManagedcomponentConnector();
	}

	/**
	 * EFactory method for OCCI kind:
	 * - scheme: http://oco.cs.ugoe.de/occi/configmanagement#
	 * - term: componenthosting
	 * - title: 
	 */
	@Override
	public de.ugoe.cs.oco.occi.configmanagement.Componenthosting createComponenthosting() {
		return new ComponenthostingConnector();
	}

}
