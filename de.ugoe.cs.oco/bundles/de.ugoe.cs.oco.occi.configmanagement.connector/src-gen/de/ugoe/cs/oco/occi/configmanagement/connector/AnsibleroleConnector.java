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

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Connector implementation for the OCCI kind:
 * - scheme: http://oco.cs.ugoe.de/occi/configmanagement#
 * - term: ansiblerole
 * - title: AnsibleRole
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
}	
