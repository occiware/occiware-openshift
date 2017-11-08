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

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.eclipse.cmf.occi.openshift.OpenshiftPackage
 * @generated
 */
public interface OpenshiftFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	OpenshiftFactory eINSTANCE = org.eclipse.cmf.occi.openshift.impl.OpenshiftFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Ocnamespace</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ocnamespace</em>'.
	 * @generated
	 */
	Ocnamespace createOcnamespace();

	/**
	 * Returns a new object of class '<em>Ocservicepod</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ocservicepod</em>'.
	 * @generated
	 */
	Ocservicepod createOcservicepod();

	/**
	 * Returns a new object of class '<em>Occontainer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Occontainer</em>'.
	 * @generated
	 */
	Occontainer createOccontainer();

	/**
	 * Returns a new object of class '<em>Ocservicepodtocontainer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ocservicepodtocontainer</em>'.
	 * @generated
	 */
	Ocservicepodtocontainer createOcservicepodtocontainer();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	OpenshiftPackage getOpenshiftPackage();

} //OpenshiftFactory
