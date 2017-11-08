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
 * A representation of the model object '<em><b>Ocservicepod</b></em>'.
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
 *   <li>{@link org.eclipse.cmf.occi.openshift.Ocservicepod#getOpenshiftServicepodName <em>Openshift Servicepod Name</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.openshift.Ocservicepod#getOpenshiftServicepodReplicas <em>Openshift Servicepod Replicas</em>}</li>
 * </ul>
 *
 * @see org.eclipse.cmf.occi.openshift.OpenshiftPackage#getOcservicepod()
 * @model
 * @generated
 */
public interface Ocservicepod extends Component {
	/**
	 * Returns the value of the '<em><b>Openshift Servicepod Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Name of both the OpenShift Pod (its DeploymentConfig actually) and its facade service
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Openshift Servicepod Name</em>' attribute.
	 * @see #setOpenshiftServicepodName(String)
	 * @see org.eclipse.cmf.occi.openshift.OpenshiftPackage#getOcservicepod_OpenshiftServicepodName()
	 * @model dataType="org.eclipse.cmf.occi.core.String"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://occiware.org/openshift/ecore!Ocservicepod!openshiftServicepodName'"
	 * @generated
	 */
	String getOpenshiftServicepodName();

	/**
	 * Sets the value of the '{@link org.eclipse.cmf.occi.openshift.Ocservicepod#getOpenshiftServicepodName <em>Openshift Servicepod Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Openshift Servicepod Name</em>' attribute.
	 * @see #getOpenshiftServicepodName()
	 * @generated
	 */
	void setOpenshiftServicepodName(String value);

	/**
	 * Returns the value of the '<em><b>Openshift Servicepod Replicas</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Number of pod replicas that OpenShift should instantiate
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Openshift Servicepod Replicas</em>' attribute.
	 * @see #setOpenshiftServicepodReplicas(Integer)
	 * @see org.eclipse.cmf.occi.openshift.OpenshiftPackage#getOcservicepod_OpenshiftServicepodReplicas()
	 * @model dataType="org.eclipse.cmf.occi.core.Integer"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://occiware.org/openshift/ecore!Ocservicepod!openshiftServicepodReplicas'"
	 * @generated
	 */
	Integer getOpenshiftServicepodReplicas();

	/**
	 * Sets the value of the '{@link org.eclipse.cmf.occi.openshift.Ocservicepod#getOpenshiftServicepodReplicas <em>Openshift Servicepod Replicas</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Openshift Servicepod Replicas</em>' attribute.
	 * @see #getOpenshiftServicepodReplicas()
	 * @generated
	 */
	void setOpenshiftServicepodReplicas(Integer value);

} // Ocservicepod
