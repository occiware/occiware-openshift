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

/**
 * Connector EFactory for the OCCI extension:
 * - name: openshift
 * - scheme: http://occiware.org/openshift#
 */
public class ConnectorFactory extends org.eclipse.cmf.occi.openshift.impl.OpenshiftFactoryImpl
{
	/**
	 * EFactory method for OCCI kind:
	 * - scheme: http://occiware.org/openshift#
	 * - term: ocnamespace
	 * - title: 
	 */
	@Override
	public org.eclipse.cmf.occi.openshift.Ocnamespace createOcnamespace() {
		return new OcnamespaceConnector();
	}

	/**
	 * EFactory method for OCCI kind:
	 * - scheme: http://occiware.org/openshift#
	 * - term: ocservicepod
	 * - title: 
	 */
	@Override
	public org.eclipse.cmf.occi.openshift.Ocservicepod createOcservicepod() {
		return new OcservicepodConnector();
	}

	/**
	 * EFactory method for OCCI kind:
	 * - scheme: http://occiware.org/openshift#
	 * - term: occontainer
	 * - title: 
	 */
	@Override
	public org.eclipse.cmf.occi.openshift.Occontainer createOccontainer() {
		return new OccontainerConnector();
	}

	/**
	 * EFactory method for OCCI kind:
	 * - scheme: http://occiware.org/openshift#
	 * - term: ocservicepodtocontainer
	 * - title: 
	 */
	@Override
	public org.eclipse.cmf.occi.openshift.Ocservicepodtocontainer createOcservicepodtocontainer() {
		return new OcservicepodtocontainerConnector();
	}

}
