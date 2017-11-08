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

import org.eclipse.cmf.occi.openshift.Occontainer;
import org.eclipse.cmf.occi.openshift.OpenshiftPackage;

import org.eclipse.cmf.occi.platform.impl.ComponentImpl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Occontainer</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.cmf.occi.openshift.impl.OccontainerImpl#getOpenshiftContainerName <em>Openshift Container Name</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.openshift.impl.OccontainerImpl#getOpenshiftContainerImage <em>Openshift Container Image</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.openshift.impl.OccontainerImpl#getOpenshiftContainerPortMappings <em>Openshift Container Port Mappings</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OccontainerImpl extends ComponentImpl implements Occontainer {
	/**
	 * The default value of the '{@link #getOpenshiftContainerName() <em>Openshift Container Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOpenshiftContainerName()
	 * @generated
	 * @ordered
	 */
	protected static final String OPENSHIFT_CONTAINER_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOpenshiftContainerName() <em>Openshift Container Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOpenshiftContainerName()
	 * @generated
	 * @ordered
	 */
	protected String openshiftContainerName = OPENSHIFT_CONTAINER_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getOpenshiftContainerImage() <em>Openshift Container Image</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOpenshiftContainerImage()
	 * @generated
	 * @ordered
	 */
	protected static final String OPENSHIFT_CONTAINER_IMAGE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOpenshiftContainerImage() <em>Openshift Container Image</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOpenshiftContainerImage()
	 * @generated
	 * @ordered
	 */
	protected String openshiftContainerImage = OPENSHIFT_CONTAINER_IMAGE_EDEFAULT;

	/**
	 * The default value of the '{@link #getOpenshiftContainerPortMappings() <em>Openshift Container Port Mappings</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOpenshiftContainerPortMappings()
	 * @generated
	 * @ordered
	 */
	protected static final String OPENSHIFT_CONTAINER_PORT_MAPPINGS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOpenshiftContainerPortMappings() <em>Openshift Container Port Mappings</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOpenshiftContainerPortMappings()
	 * @generated
	 * @ordered
	 */
	protected String openshiftContainerPortMappings = OPENSHIFT_CONTAINER_PORT_MAPPINGS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OccontainerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OpenshiftPackage.Literals.OCCONTAINER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getOpenshiftContainerName() {
		return openshiftContainerName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOpenshiftContainerName(String newOpenshiftContainerName) {
		String oldOpenshiftContainerName = openshiftContainerName;
		openshiftContainerName = newOpenshiftContainerName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OpenshiftPackage.OCCONTAINER__OPENSHIFT_CONTAINER_NAME, oldOpenshiftContainerName, openshiftContainerName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getOpenshiftContainerImage() {
		return openshiftContainerImage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOpenshiftContainerImage(String newOpenshiftContainerImage) {
		String oldOpenshiftContainerImage = openshiftContainerImage;
		openshiftContainerImage = newOpenshiftContainerImage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OpenshiftPackage.OCCONTAINER__OPENSHIFT_CONTAINER_IMAGE, oldOpenshiftContainerImage, openshiftContainerImage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getOpenshiftContainerPortMappings() {
		return openshiftContainerPortMappings;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOpenshiftContainerPortMappings(String newOpenshiftContainerPortMappings) {
		String oldOpenshiftContainerPortMappings = openshiftContainerPortMappings;
		openshiftContainerPortMappings = newOpenshiftContainerPortMappings;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OpenshiftPackage.OCCONTAINER__OPENSHIFT_CONTAINER_PORT_MAPPINGS, oldOpenshiftContainerPortMappings, openshiftContainerPortMappings));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case OpenshiftPackage.OCCONTAINER__OPENSHIFT_CONTAINER_NAME:
				return getOpenshiftContainerName();
			case OpenshiftPackage.OCCONTAINER__OPENSHIFT_CONTAINER_IMAGE:
				return getOpenshiftContainerImage();
			case OpenshiftPackage.OCCONTAINER__OPENSHIFT_CONTAINER_PORT_MAPPINGS:
				return getOpenshiftContainerPortMappings();
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
			case OpenshiftPackage.OCCONTAINER__OPENSHIFT_CONTAINER_NAME:
				setOpenshiftContainerName((String)newValue);
				return;
			case OpenshiftPackage.OCCONTAINER__OPENSHIFT_CONTAINER_IMAGE:
				setOpenshiftContainerImage((String)newValue);
				return;
			case OpenshiftPackage.OCCONTAINER__OPENSHIFT_CONTAINER_PORT_MAPPINGS:
				setOpenshiftContainerPortMappings((String)newValue);
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
			case OpenshiftPackage.OCCONTAINER__OPENSHIFT_CONTAINER_NAME:
				setOpenshiftContainerName(OPENSHIFT_CONTAINER_NAME_EDEFAULT);
				return;
			case OpenshiftPackage.OCCONTAINER__OPENSHIFT_CONTAINER_IMAGE:
				setOpenshiftContainerImage(OPENSHIFT_CONTAINER_IMAGE_EDEFAULT);
				return;
			case OpenshiftPackage.OCCONTAINER__OPENSHIFT_CONTAINER_PORT_MAPPINGS:
				setOpenshiftContainerPortMappings(OPENSHIFT_CONTAINER_PORT_MAPPINGS_EDEFAULT);
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
			case OpenshiftPackage.OCCONTAINER__OPENSHIFT_CONTAINER_NAME:
				return OPENSHIFT_CONTAINER_NAME_EDEFAULT == null ? openshiftContainerName != null : !OPENSHIFT_CONTAINER_NAME_EDEFAULT.equals(openshiftContainerName);
			case OpenshiftPackage.OCCONTAINER__OPENSHIFT_CONTAINER_IMAGE:
				return OPENSHIFT_CONTAINER_IMAGE_EDEFAULT == null ? openshiftContainerImage != null : !OPENSHIFT_CONTAINER_IMAGE_EDEFAULT.equals(openshiftContainerImage);
			case OpenshiftPackage.OCCONTAINER__OPENSHIFT_CONTAINER_PORT_MAPPINGS:
				return OPENSHIFT_CONTAINER_PORT_MAPPINGS_EDEFAULT == null ? openshiftContainerPortMappings != null : !OPENSHIFT_CONTAINER_PORT_MAPPINGS_EDEFAULT.equals(openshiftContainerPortMappings);
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
		result.append(" (openshiftContainerName: ");
		result.append(openshiftContainerName);
		result.append(", openshiftContainerImage: ");
		result.append(openshiftContainerImage);
		result.append(", openshiftContainerPortMappings: ");
		result.append(openshiftContainerPortMappings);
		result.append(')');
		return result.toString();
	}

} //OccontainerImpl
