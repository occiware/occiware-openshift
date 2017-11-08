/**
 * Copyright (c) 2015-2017 Obeo, Inria
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 	
 * Contributors:
 * - William Piers <william.piers@obeo.fr>
 * - Philippe Merle <philippe.merle@inria.fr>
 * - Faiez Zalila <faiez.zalila@inria.fr>
 */
package org.eclipse.cmf.occi.openshift;

import org.eclipse.cmf.occi.platform.Component;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Occontainer</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.cmf.occi.openshift.Occontainer#getOpenshiftContainerName <em>Openshift Container Name</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.openshift.Occontainer#getOpenshiftContainerImage <em>Openshift Container Image</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.openshift.Occontainer#getOpenshiftContainerPortMappings <em>Openshift Container Port Mappings</em>}</li>
 * </ul>
 *
 * @see org.eclipse.cmf.occi.openshift.OpenshiftPackage#getOccontainer()
 * @model
 * @generated
 */
public interface Occontainer extends Component {
	/**
	 * Returns the value of the '<em><b>Openshift Container Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * name of the OpenShift container
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Openshift Container Name</em>' attribute.
	 * @see #setOpenshiftContainerName(String)
	 * @see org.eclipse.cmf.occi.openshift.OpenshiftPackage#getOccontainer_OpenshiftContainerName()
	 * @model dataType="org.eclipse.cmf.occi.core.String"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://occiware.org/openshift/ecore!Occontainer!openshiftContainerName'"
	 * @generated
	 */
	String getOpenshiftContainerName();

	/**
	 * Sets the value of the '{@link org.eclipse.cmf.occi.openshift.Occontainer#getOpenshiftContainerName <em>Openshift Container Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Openshift Container Name</em>' attribute.
	 * @see #getOpenshiftContainerName()
	 * @generated
	 */
	void setOpenshiftContainerName(String value);

	/**
	 * Returns the value of the '<em><b>Openshift Container Image</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Docker image of the OpenShift container
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Openshift Container Image</em>' attribute.
	 * @see #setOpenshiftContainerImage(String)
	 * @see org.eclipse.cmf.occi.openshift.OpenshiftPackage#getOccontainer_OpenshiftContainerImage()
	 * @model dataType="org.eclipse.cmf.occi.core.String"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://occiware.org/openshift/ecore!Occontainer!openshiftContainerImage'"
	 * @generated
	 */
	String getOpenshiftContainerImage();

	/**
	 * Sets the value of the '{@link org.eclipse.cmf.occi.openshift.Occontainer#getOpenshiftContainerImage <em>Openshift Container Image</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Openshift Container Image</em>' attribute.
	 * @see #getOpenshiftContainerImage()
	 * @generated
	 */
	void setOpenshiftContainerImage(String value);

	/**
	 * Returns the value of the '<em><b>Openshift Container Port Mappings</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * mappings (targetPort) of service ports (ports.port) to its pod's containers' ports (ports.containerPort), in the format :
	 * servicePort1-containerPort1,servicePort2-containerPort2
	 * Example : 8000-80,8443-443
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Openshift Container Port Mappings</em>' attribute.
	 * @see #setOpenshiftContainerPortMappings(String)
	 * @see org.eclipse.cmf.occi.openshift.OpenshiftPackage#getOccontainer_OpenshiftContainerPortMappings()
	 * @model dataType="org.eclipse.cmf.occi.core.String"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://occiware.org/openshift/ecore!Occontainer!openshiftContainerPortMappings'"
	 * @generated
	 */
	String getOpenshiftContainerPortMappings();

	/**
	 * Sets the value of the '{@link org.eclipse.cmf.occi.openshift.Occontainer#getOpenshiftContainerPortMappings <em>Openshift Container Port Mappings</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Openshift Container Port Mappings</em>' attribute.
	 * @see #getOpenshiftContainerPortMappings()
	 * @generated
	 */
	void setOpenshiftContainerPortMappings(String value);

} // Occontainer
