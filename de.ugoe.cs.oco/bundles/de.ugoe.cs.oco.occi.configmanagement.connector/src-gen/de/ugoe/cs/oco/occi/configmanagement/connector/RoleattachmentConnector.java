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

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

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
		// TODO: Implement this callback or remove this method.
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
		// TODO: Implement this callback or remove this method.
	}
	// End of user code

	//
	// Roleattachment actions.
	//
}	
