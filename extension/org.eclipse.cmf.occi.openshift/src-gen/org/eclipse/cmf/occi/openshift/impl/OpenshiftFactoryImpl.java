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

import org.eclipse.cmf.occi.openshift.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class OpenshiftFactoryImpl extends EFactoryImpl implements OpenshiftFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static OpenshiftFactory init() {
		try {
			OpenshiftFactory theOpenshiftFactory = (OpenshiftFactory)EPackage.Registry.INSTANCE.getEFactory(OpenshiftPackage.eNS_URI);
			if (theOpenshiftFactory != null) {
				return theOpenshiftFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new OpenshiftFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OpenshiftFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case OpenshiftPackage.OCNAMESPACE: return createOcnamespace();
			case OpenshiftPackage.OCSERVICEPOD: return createOcservicepod();
			case OpenshiftPackage.OCCONTAINER: return createOccontainer();
			case OpenshiftPackage.OCSERVICEPODTOCONTAINER: return createOcservicepodtocontainer();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Ocnamespace createOcnamespace() {
		OcnamespaceImpl ocnamespace = new OcnamespaceImpl();
		return ocnamespace;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Ocservicepod createOcservicepod() {
		OcservicepodImpl ocservicepod = new OcservicepodImpl();
		return ocservicepod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Occontainer createOccontainer() {
		OccontainerImpl occontainer = new OccontainerImpl();
		return occontainer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Ocservicepodtocontainer createOcservicepodtocontainer() {
		OcservicepodtocontainerImpl ocservicepodtocontainer = new OcservicepodtocontainerImpl();
		return ocservicepodtocontainer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OpenshiftPackage getOpenshiftPackage() {
		return (OpenshiftPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static OpenshiftPackage getPackage() {
		return OpenshiftPackage.eINSTANCE;
	}

} //OpenshiftFactoryImpl
