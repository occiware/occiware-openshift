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
 * Generated at Wed Nov 08 18:55:10 CET 2017 from platform:/resource/org.eclipse.cmf.occi.openshift/model/openshift.occie by org.eclipse.cmf.occi.core.gen.connector
 */
package org.eclipse.cmf.occi.openshift.connector;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;



/**
 * Connector implementation for the OCCI kind:
 * - scheme: http://occiware.org/openshift#
 * - term: ocservicepod
 * - title: 
 */
public class OcservicepodConnector extends org.eclipse.cmf.occi.openshift.impl.OcservicepodImpl
{
	/**
	 * Initialize the logger.
	 */
	private static Logger LOGGER = LoggerFactory.getLogger(OcservicepodConnector.class);

	// Start of user code Ocservicepodconnector_constructor
	/**
	 * Constructs a ocservicepod connector.
	 */
	OcservicepodConnector()
	{
		LOGGER.debug("Constructor called on " + this);
		// TODO: Implement this constructor.
	}
	// End of user code
	//
	// OCCI CRUD callback operations.
	//
	
	// Start of user code OcservicepodocciCreate
	/**
	 * Called when this Ocservicepod instance is completely created.
	 */
	@Override
	public void occiCreate()
	{
		LOGGER.debug("occiCreate() called on " + this);
		System.err.println("OCServicePod create " + this);
		// TODO: Implement this callback or remove this method.
	}
	// End of user code

	// Start of user code Ocservicepod_occiRetrieve_method
	/**
	 * Called when this Ocservicepod instance must be retrieved.
	 */
	@Override
	public void occiRetrieve()
	{
		LOGGER.debug("occiRetrieve() called on " + this);
		// TODO: Implement this callback or remove this method.
	}
	// End of user code

	// Start of user code Ocservicepod_occiUpdate_method
	/**
	 * Called when this Ocservicepod instance is completely updated.
	 */
	@Override
	public void occiUpdate()
	{
		LOGGER.debug("occiUpdate() called on " + this);
		System.err.println("OCServicePod update " + this);
		// TODO: Implement this callback or remove this method.
	}
	// End of user code

	// Start of user code OcservicepodocciDelete_method
	/**
	 * Called when this Ocservicepod instance will be deleted.
	 */
	@Override
	public void occiDelete()
	{
		LOGGER.debug("occiDelete() called on " + this);
		// TODO: Implement this callback or remove this method.
	}
	// End of user code

	//
	// Ocservicepod actions.
	//

	// Start of user code Ocservicepod_Kind_Start_action
	/**
	 * Implement OCCI action:
     * - scheme: http://schemas.ogf.org/occi/platform/component/action#
     * - term: start
     * - title: Start the application.
	 */
	@Override
	public void start()
	{
		LOGGER.debug("Action start() called on " + this);

		// TODO: Implement how to start this ocservicepod.
	}
	// End of user code
	// Start of user code Ocservicepod_Kind_Stop_action
	/**
	 * Implement OCCI action:
     * - scheme: http://schemas.ogf.org/occi/platform/component/action#
     * - term: stop
     * - title: Stop the application.
	 */
	@Override
	public void stop()
	{
		LOGGER.debug("Action stop() called on " + this);

		// TODO: Implement how to stop this ocservicepod.
	}
	// End of user code
		


}	
