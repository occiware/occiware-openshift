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
package org.eclipse.cmf.occi.openshift.impl;

import org.eclipse.cmf.occi.openshift.Ocservicepod;
import org.eclipse.cmf.occi.openshift.OpenshiftPackage;

import org.eclipse.cmf.occi.platform.impl.ComponentImpl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ocservicepod</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.cmf.occi.openshift.impl.OcservicepodImpl#getOpenshiftServicepodName <em>Openshift Servicepod Name</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.openshift.impl.OcservicepodImpl#getOpenshiftServicepodReplicas <em>Openshift Servicepod Replicas</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OcservicepodImpl extends ComponentImpl implements Ocservicepod {
	/**
	 * The default value of the '{@link #getOpenshiftServicepodName() <em>Openshift Servicepod Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOpenshiftServicepodName()
	 * @generated
	 * @ordered
	 */
	protected static final String OPENSHIFT_SERVICEPOD_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOpenshiftServicepodName() <em>Openshift Servicepod Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOpenshiftServicepodName()
	 * @generated
	 * @ordered
	 */
	protected String openshiftServicepodName = OPENSHIFT_SERVICEPOD_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getOpenshiftServicepodReplicas() <em>Openshift Servicepod Replicas</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOpenshiftServicepodReplicas()
	 * @generated
	 * @ordered
	 */
	protected static final Integer OPENSHIFT_SERVICEPOD_REPLICAS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOpenshiftServicepodReplicas() <em>Openshift Servicepod Replicas</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOpenshiftServicepodReplicas()
	 * @generated
	 * @ordered
	 */
	protected Integer openshiftServicepodReplicas = OPENSHIFT_SERVICEPOD_REPLICAS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OcservicepodImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OpenshiftPackage.Literals.OCSERVICEPOD;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getOpenshiftServicepodName() {
		return openshiftServicepodName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOpenshiftServicepodName(String newOpenshiftServicepodName) {
		String oldOpenshiftServicepodName = openshiftServicepodName;
		openshiftServicepodName = newOpenshiftServicepodName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OpenshiftPackage.OCSERVICEPOD__OPENSHIFT_SERVICEPOD_NAME, oldOpenshiftServicepodName, openshiftServicepodName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getOpenshiftServicepodReplicas() {
		return openshiftServicepodReplicas;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOpenshiftServicepodReplicas(Integer newOpenshiftServicepodReplicas) {
		Integer oldOpenshiftServicepodReplicas = openshiftServicepodReplicas;
		openshiftServicepodReplicas = newOpenshiftServicepodReplicas;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OpenshiftPackage.OCSERVICEPOD__OPENSHIFT_SERVICEPOD_REPLICAS, oldOpenshiftServicepodReplicas, openshiftServicepodReplicas));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case OpenshiftPackage.OCSERVICEPOD__OPENSHIFT_SERVICEPOD_NAME:
				return getOpenshiftServicepodName();
			case OpenshiftPackage.OCSERVICEPOD__OPENSHIFT_SERVICEPOD_REPLICAS:
				return getOpenshiftServicepodReplicas();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case OpenshiftPackage.OCSERVICEPOD__OPENSHIFT_SERVICEPOD_NAME:
				setOpenshiftServicepodName((String)newValue);
				return;
			case OpenshiftPackage.OCSERVICEPOD__OPENSHIFT_SERVICEPOD_REPLICAS:
				setOpenshiftServicepodReplicas((Integer)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case OpenshiftPackage.OCSERVICEPOD__OPENSHIFT_SERVICEPOD_NAME:
				setOpenshiftServicepodName(OPENSHIFT_SERVICEPOD_NAME_EDEFAULT);
				return;
			case OpenshiftPackage.OCSERVICEPOD__OPENSHIFT_SERVICEPOD_REPLICAS:
				setOpenshiftServicepodReplicas(OPENSHIFT_SERVICEPOD_REPLICAS_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case OpenshiftPackage.OCSERVICEPOD__OPENSHIFT_SERVICEPOD_NAME:
				return OPENSHIFT_SERVICEPOD_NAME_EDEFAULT == null ? openshiftServicepodName != null : !OPENSHIFT_SERVICEPOD_NAME_EDEFAULT.equals(openshiftServicepodName);
			case OpenshiftPackage.OCSERVICEPOD__OPENSHIFT_SERVICEPOD_REPLICAS:
				return OPENSHIFT_SERVICEPOD_REPLICAS_EDEFAULT == null ? openshiftServicepodReplicas != null : !OPENSHIFT_SERVICEPOD_REPLICAS_EDEFAULT.equals(openshiftServicepodReplicas);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (openshiftServicepodName: ");
		result.append(openshiftServicepodName);
		result.append(", openshiftServicepodReplicas: ");
		result.append(openshiftServicepodReplicas);
		result.append(')');
		return result.toString();
	}

} //OcservicepodImpl
