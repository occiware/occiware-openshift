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

import org.eclipse.cmf.occi.core.OCCIPackage;

import org.eclipse.cmf.occi.platform.PlatformPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.eclipse.cmf.occi.openshift.OpenshiftFactory
 * @model kind="package"
 * @generated
 */
public interface OpenshiftPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "openshift";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://occiware.org/openshift/ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "openshift";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	OpenshiftPackage eINSTANCE = org.eclipse.cmf.occi.openshift.impl.OpenshiftPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.eclipse.cmf.occi.openshift.impl.OcnamespaceImpl <em>Ocnamespace</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.cmf.occi.openshift.impl.OcnamespaceImpl
	 * @see org.eclipse.cmf.occi.openshift.impl.OpenshiftPackageImpl#getOcnamespace()
	 * @generated
	 */
	int OCNAMESPACE = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCNAMESPACE__ID = PlatformPackage.APPLICATION__ID;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCNAMESPACE__TITLE = PlatformPackage.APPLICATION__TITLE;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCNAMESPACE__KIND = PlatformPackage.APPLICATION__KIND;

	/**
	 * The feature id for the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCNAMESPACE__LOCATION = PlatformPackage.APPLICATION__LOCATION;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCNAMESPACE__ATTRIBUTES = PlatformPackage.APPLICATION__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Mixins</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCNAMESPACE__MIXINS = PlatformPackage.APPLICATION__MIXINS;

	/**
	 * The feature id for the '<em><b>Parts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCNAMESPACE__PARTS = PlatformPackage.APPLICATION__PARTS;

	/**
	 * The feature id for the '<em><b>Summary</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCNAMESPACE__SUMMARY = PlatformPackage.APPLICATION__SUMMARY;

	/**
	 * The feature id for the '<em><b>Links</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCNAMESPACE__LINKS = PlatformPackage.APPLICATION__LINKS;

	/**
	 * The feature id for the '<em><b>Rlinks</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCNAMESPACE__RLINKS = PlatformPackage.APPLICATION__RLINKS;

	/**
	 * The feature id for the '<em><b>Occi App Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCNAMESPACE__OCCI_APP_NAME = PlatformPackage.APPLICATION__OCCI_APP_NAME;

	/**
	 * The feature id for the '<em><b>Occi App Context</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCNAMESPACE__OCCI_APP_CONTEXT = PlatformPackage.APPLICATION__OCCI_APP_CONTEXT;

	/**
	 * The feature id for the '<em><b>Occi App Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCNAMESPACE__OCCI_APP_URL = PlatformPackage.APPLICATION__OCCI_APP_URL;

	/**
	 * The feature id for the '<em><b>Occi App State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCNAMESPACE__OCCI_APP_STATE = PlatformPackage.APPLICATION__OCCI_APP_STATE;

	/**
	 * The feature id for the '<em><b>Occi App State Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCNAMESPACE__OCCI_APP_STATE_MESSAGE = PlatformPackage.APPLICATION__OCCI_APP_STATE_MESSAGE;

	/**
	 * The number of structural features of the '<em>Ocnamespace</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCNAMESPACE_FEATURE_COUNT = PlatformPackage.APPLICATION_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Occi Create</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCNAMESPACE___OCCI_CREATE = PlatformPackage.APPLICATION___OCCI_CREATE;

	/**
	 * The operation id for the '<em>Occi Retrieve</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCNAMESPACE___OCCI_RETRIEVE = PlatformPackage.APPLICATION___OCCI_RETRIEVE;

	/**
	 * The operation id for the '<em>Occi Update</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCNAMESPACE___OCCI_UPDATE = PlatformPackage.APPLICATION___OCCI_UPDATE;

	/**
	 * The operation id for the '<em>Occi Delete</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCNAMESPACE___OCCI_DELETE = PlatformPackage.APPLICATION___OCCI_DELETE;

	/**
	 * The operation id for the '<em>Start</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCNAMESPACE___START = PlatformPackage.APPLICATION___START;

	/**
	 * The operation id for the '<em>Stop</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCNAMESPACE___STOP = PlatformPackage.APPLICATION___STOP;

	/**
	 * The number of operations of the '<em>Ocnamespace</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCNAMESPACE_OPERATION_COUNT = PlatformPackage.APPLICATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.cmf.occi.openshift.impl.OcservicepodImpl <em>Ocservicepod</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.cmf.occi.openshift.impl.OcservicepodImpl
	 * @see org.eclipse.cmf.occi.openshift.impl.OpenshiftPackageImpl#getOcservicepod()
	 * @generated
	 */
	int OCSERVICEPOD = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCSERVICEPOD__ID = PlatformPackage.COMPONENT__ID;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCSERVICEPOD__TITLE = PlatformPackage.COMPONENT__TITLE;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCSERVICEPOD__KIND = PlatformPackage.COMPONENT__KIND;

	/**
	 * The feature id for the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCSERVICEPOD__LOCATION = PlatformPackage.COMPONENT__LOCATION;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCSERVICEPOD__ATTRIBUTES = PlatformPackage.COMPONENT__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Mixins</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCSERVICEPOD__MIXINS = PlatformPackage.COMPONENT__MIXINS;

	/**
	 * The feature id for the '<em><b>Parts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCSERVICEPOD__PARTS = PlatformPackage.COMPONENT__PARTS;

	/**
	 * The feature id for the '<em><b>Summary</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCSERVICEPOD__SUMMARY = PlatformPackage.COMPONENT__SUMMARY;

	/**
	 * The feature id for the '<em><b>Links</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCSERVICEPOD__LINKS = PlatformPackage.COMPONENT__LINKS;

	/**
	 * The feature id for the '<em><b>Rlinks</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCSERVICEPOD__RLINKS = PlatformPackage.COMPONENT__RLINKS;

	/**
	 * The feature id for the '<em><b>Occi Component State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCSERVICEPOD__OCCI_COMPONENT_STATE = PlatformPackage.COMPONENT__OCCI_COMPONENT_STATE;

	/**
	 * The feature id for the '<em><b>Occi Component State Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCSERVICEPOD__OCCI_COMPONENT_STATE_MESSAGE = PlatformPackage.COMPONENT__OCCI_COMPONENT_STATE_MESSAGE;

	/**
	 * The feature id for the '<em><b>Openshift Servicepod Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCSERVICEPOD__OPENSHIFT_SERVICEPOD_NAME = PlatformPackage.COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Openshift Servicepod Replicas</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCSERVICEPOD__OPENSHIFT_SERVICEPOD_REPLICAS = PlatformPackage.COMPONENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Ocservicepod</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCSERVICEPOD_FEATURE_COUNT = PlatformPackage.COMPONENT_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Occi Create</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCSERVICEPOD___OCCI_CREATE = PlatformPackage.COMPONENT___OCCI_CREATE;

	/**
	 * The operation id for the '<em>Occi Retrieve</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCSERVICEPOD___OCCI_RETRIEVE = PlatformPackage.COMPONENT___OCCI_RETRIEVE;

	/**
	 * The operation id for the '<em>Occi Update</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCSERVICEPOD___OCCI_UPDATE = PlatformPackage.COMPONENT___OCCI_UPDATE;

	/**
	 * The operation id for the '<em>Occi Delete</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCSERVICEPOD___OCCI_DELETE = PlatformPackage.COMPONENT___OCCI_DELETE;

	/**
	 * The operation id for the '<em>Start</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCSERVICEPOD___START = PlatformPackage.COMPONENT___START;

	/**
	 * The operation id for the '<em>Stop</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCSERVICEPOD___STOP = PlatformPackage.COMPONENT___STOP;

	/**
	 * The number of operations of the '<em>Ocservicepod</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCSERVICEPOD_OPERATION_COUNT = PlatformPackage.COMPONENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.cmf.occi.openshift.impl.OccontainerImpl <em>Occontainer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.cmf.occi.openshift.impl.OccontainerImpl
	 * @see org.eclipse.cmf.occi.openshift.impl.OpenshiftPackageImpl#getOccontainer()
	 * @generated
	 */
	int OCCONTAINER = 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCCONTAINER__ID = PlatformPackage.COMPONENT__ID;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCCONTAINER__TITLE = PlatformPackage.COMPONENT__TITLE;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCCONTAINER__KIND = PlatformPackage.COMPONENT__KIND;

	/**
	 * The feature id for the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCCONTAINER__LOCATION = PlatformPackage.COMPONENT__LOCATION;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCCONTAINER__ATTRIBUTES = PlatformPackage.COMPONENT__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Mixins</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCCONTAINER__MIXINS = PlatformPackage.COMPONENT__MIXINS;

	/**
	 * The feature id for the '<em><b>Parts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCCONTAINER__PARTS = PlatformPackage.COMPONENT__PARTS;

	/**
	 * The feature id for the '<em><b>Summary</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCCONTAINER__SUMMARY = PlatformPackage.COMPONENT__SUMMARY;

	/**
	 * The feature id for the '<em><b>Links</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCCONTAINER__LINKS = PlatformPackage.COMPONENT__LINKS;

	/**
	 * The feature id for the '<em><b>Rlinks</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCCONTAINER__RLINKS = PlatformPackage.COMPONENT__RLINKS;

	/**
	 * The feature id for the '<em><b>Occi Component State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCCONTAINER__OCCI_COMPONENT_STATE = PlatformPackage.COMPONENT__OCCI_COMPONENT_STATE;

	/**
	 * The feature id for the '<em><b>Occi Component State Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCCONTAINER__OCCI_COMPONENT_STATE_MESSAGE = PlatformPackage.COMPONENT__OCCI_COMPONENT_STATE_MESSAGE;

	/**
	 * The feature id for the '<em><b>Openshift Container Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCCONTAINER__OPENSHIFT_CONTAINER_NAME = PlatformPackage.COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Openshift Container Image</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCCONTAINER__OPENSHIFT_CONTAINER_IMAGE = PlatformPackage.COMPONENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Openshift Container Port Mappings</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCCONTAINER__OPENSHIFT_CONTAINER_PORT_MAPPINGS = PlatformPackage.COMPONENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Occontainer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCCONTAINER_FEATURE_COUNT = PlatformPackage.COMPONENT_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Occi Create</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCCONTAINER___OCCI_CREATE = PlatformPackage.COMPONENT___OCCI_CREATE;

	/**
	 * The operation id for the '<em>Occi Retrieve</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCCONTAINER___OCCI_RETRIEVE = PlatformPackage.COMPONENT___OCCI_RETRIEVE;

	/**
	 * The operation id for the '<em>Occi Update</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCCONTAINER___OCCI_UPDATE = PlatformPackage.COMPONENT___OCCI_UPDATE;

	/**
	 * The operation id for the '<em>Occi Delete</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCCONTAINER___OCCI_DELETE = PlatformPackage.COMPONENT___OCCI_DELETE;

	/**
	 * The operation id for the '<em>Start</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCCONTAINER___START = PlatformPackage.COMPONENT___START;

	/**
	 * The operation id for the '<em>Stop</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCCONTAINER___STOP = PlatformPackage.COMPONENT___STOP;

	/**
	 * The number of operations of the '<em>Occontainer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCCONTAINER_OPERATION_COUNT = PlatformPackage.COMPONENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.cmf.occi.openshift.impl.OcservicepodtocontainerImpl <em>Ocservicepodtocontainer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.cmf.occi.openshift.impl.OcservicepodtocontainerImpl
	 * @see org.eclipse.cmf.occi.openshift.impl.OpenshiftPackageImpl#getOcservicepodtocontainer()
	 * @generated
	 */
	int OCSERVICEPODTOCONTAINER = 3;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCSERVICEPODTOCONTAINER__ID = OCCIPackage.LINK__ID;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCSERVICEPODTOCONTAINER__TITLE = OCCIPackage.LINK__TITLE;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCSERVICEPODTOCONTAINER__KIND = OCCIPackage.LINK__KIND;

	/**
	 * The feature id for the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCSERVICEPODTOCONTAINER__LOCATION = OCCIPackage.LINK__LOCATION;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCSERVICEPODTOCONTAINER__ATTRIBUTES = OCCIPackage.LINK__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Mixins</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCSERVICEPODTOCONTAINER__MIXINS = OCCIPackage.LINK__MIXINS;

	/**
	 * The feature id for the '<em><b>Parts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCSERVICEPODTOCONTAINER__PARTS = OCCIPackage.LINK__PARTS;

	/**
	 * The feature id for the '<em><b>Source</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCSERVICEPODTOCONTAINER__SOURCE = OCCIPackage.LINK__SOURCE;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCSERVICEPODTOCONTAINER__TARGET = OCCIPackage.LINK__TARGET;

	/**
	 * The number of structural features of the '<em>Ocservicepodtocontainer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCSERVICEPODTOCONTAINER_FEATURE_COUNT = OCCIPackage.LINK_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Occi Create</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCSERVICEPODTOCONTAINER___OCCI_CREATE = OCCIPackage.LINK___OCCI_CREATE;

	/**
	 * The operation id for the '<em>Occi Retrieve</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCSERVICEPODTOCONTAINER___OCCI_RETRIEVE = OCCIPackage.LINK___OCCI_RETRIEVE;

	/**
	 * The operation id for the '<em>Occi Update</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCSERVICEPODTOCONTAINER___OCCI_UPDATE = OCCIPackage.LINK___OCCI_UPDATE;

	/**
	 * The operation id for the '<em>Occi Delete</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCSERVICEPODTOCONTAINER___OCCI_DELETE = OCCIPackage.LINK___OCCI_DELETE;

	/**
	 * The operation id for the '<em>Link Target Invariant</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCSERVICEPODTOCONTAINER___LINK_TARGET_INVARIANT__KIND_KIND = OCCIPackage.LINK___LINK_TARGET_INVARIANT__KIND_KIND;

	/**
	 * The operation id for the '<em>Link Source Invariant</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCSERVICEPODTOCONTAINER___LINK_SOURCE_INVARIANT__KIND_KIND = OCCIPackage.LINK___LINK_SOURCE_INVARIANT__KIND_KIND;

	/**
	 * The operation id for the '<em>Target Constraint</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCSERVICEPODTOCONTAINER___TARGET_CONSTRAINT__DIAGNOSTICCHAIN_MAP = OCCIPackage.LINK_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Ocservicepodtocontainer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCSERVICEPODTOCONTAINER_OPERATION_COUNT = OCCIPackage.LINK_OPERATION_COUNT + 1;


	/**
	 * Returns the meta object for class '{@link org.eclipse.cmf.occi.openshift.Ocnamespace <em>Ocnamespace</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ocnamespace</em>'.
	 * @see org.eclipse.cmf.occi.openshift.Ocnamespace
	 * @generated
	 */
	EClass getOcnamespace();

	/**
	 * Returns the meta object for class '{@link org.eclipse.cmf.occi.openshift.Ocservicepod <em>Ocservicepod</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ocservicepod</em>'.
	 * @see org.eclipse.cmf.occi.openshift.Ocservicepod
	 * @generated
	 */
	EClass getOcservicepod();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.openshift.Ocservicepod#getOpenshiftServicepodName <em>Openshift Servicepod Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Openshift Servicepod Name</em>'.
	 * @see org.eclipse.cmf.occi.openshift.Ocservicepod#getOpenshiftServicepodName()
	 * @see #getOcservicepod()
	 * @generated
	 */
	EAttribute getOcservicepod_OpenshiftServicepodName();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.openshift.Ocservicepod#getOpenshiftServicepodReplicas <em>Openshift Servicepod Replicas</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Openshift Servicepod Replicas</em>'.
	 * @see org.eclipse.cmf.occi.openshift.Ocservicepod#getOpenshiftServicepodReplicas()
	 * @see #getOcservicepod()
	 * @generated
	 */
	EAttribute getOcservicepod_OpenshiftServicepodReplicas();

	/**
	 * Returns the meta object for class '{@link org.eclipse.cmf.occi.openshift.Occontainer <em>Occontainer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Occontainer</em>'.
	 * @see org.eclipse.cmf.occi.openshift.Occontainer
	 * @generated
	 */
	EClass getOccontainer();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.openshift.Occontainer#getOpenshiftContainerName <em>Openshift Container Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Openshift Container Name</em>'.
	 * @see org.eclipse.cmf.occi.openshift.Occontainer#getOpenshiftContainerName()
	 * @see #getOccontainer()
	 * @generated
	 */
	EAttribute getOccontainer_OpenshiftContainerName();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.openshift.Occontainer#getOpenshiftContainerImage <em>Openshift Container Image</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Openshift Container Image</em>'.
	 * @see org.eclipse.cmf.occi.openshift.Occontainer#getOpenshiftContainerImage()
	 * @see #getOccontainer()
	 * @generated
	 */
	EAttribute getOccontainer_OpenshiftContainerImage();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.openshift.Occontainer#getOpenshiftContainerPortMappings <em>Openshift Container Port Mappings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Openshift Container Port Mappings</em>'.
	 * @see org.eclipse.cmf.occi.openshift.Occontainer#getOpenshiftContainerPortMappings()
	 * @see #getOccontainer()
	 * @generated
	 */
	EAttribute getOccontainer_OpenshiftContainerPortMappings();

	/**
	 * Returns the meta object for class '{@link org.eclipse.cmf.occi.openshift.Ocservicepodtocontainer <em>Ocservicepodtocontainer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ocservicepodtocontainer</em>'.
	 * @see org.eclipse.cmf.occi.openshift.Ocservicepodtocontainer
	 * @generated
	 */
	EClass getOcservicepodtocontainer();

	/**
	 * Returns the meta object for the '{@link org.eclipse.cmf.occi.openshift.Ocservicepodtocontainer#targetConstraint(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Target Constraint</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Target Constraint</em>' operation.
	 * @see org.eclipse.cmf.occi.openshift.Ocservicepodtocontainer#targetConstraint(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getOcservicepodtocontainer__TargetConstraint__DiagnosticChain_Map();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	OpenshiftFactory getOpenshiftFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.eclipse.cmf.occi.openshift.impl.OcnamespaceImpl <em>Ocnamespace</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.cmf.occi.openshift.impl.OcnamespaceImpl
		 * @see org.eclipse.cmf.occi.openshift.impl.OpenshiftPackageImpl#getOcnamespace()
		 * @generated
		 */
		EClass OCNAMESPACE = eINSTANCE.getOcnamespace();

		/**
		 * The meta object literal for the '{@link org.eclipse.cmf.occi.openshift.impl.OcservicepodImpl <em>Ocservicepod</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.cmf.occi.openshift.impl.OcservicepodImpl
		 * @see org.eclipse.cmf.occi.openshift.impl.OpenshiftPackageImpl#getOcservicepod()
		 * @generated
		 */
		EClass OCSERVICEPOD = eINSTANCE.getOcservicepod();

		/**
		 * The meta object literal for the '<em><b>Openshift Servicepod Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OCSERVICEPOD__OPENSHIFT_SERVICEPOD_NAME = eINSTANCE.getOcservicepod_OpenshiftServicepodName();

		/**
		 * The meta object literal for the '<em><b>Openshift Servicepod Replicas</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OCSERVICEPOD__OPENSHIFT_SERVICEPOD_REPLICAS = eINSTANCE.getOcservicepod_OpenshiftServicepodReplicas();

		/**
		 * The meta object literal for the '{@link org.eclipse.cmf.occi.openshift.impl.OccontainerImpl <em>Occontainer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.cmf.occi.openshift.impl.OccontainerImpl
		 * @see org.eclipse.cmf.occi.openshift.impl.OpenshiftPackageImpl#getOccontainer()
		 * @generated
		 */
		EClass OCCONTAINER = eINSTANCE.getOccontainer();

		/**
		 * The meta object literal for the '<em><b>Openshift Container Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OCCONTAINER__OPENSHIFT_CONTAINER_NAME = eINSTANCE.getOccontainer_OpenshiftContainerName();

		/**
		 * The meta object literal for the '<em><b>Openshift Container Image</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OCCONTAINER__OPENSHIFT_CONTAINER_IMAGE = eINSTANCE.getOccontainer_OpenshiftContainerImage();

		/**
		 * The meta object literal for the '<em><b>Openshift Container Port Mappings</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OCCONTAINER__OPENSHIFT_CONTAINER_PORT_MAPPINGS = eINSTANCE.getOccontainer_OpenshiftContainerPortMappings();

		/**
		 * The meta object literal for the '{@link org.eclipse.cmf.occi.openshift.impl.OcservicepodtocontainerImpl <em>Ocservicepodtocontainer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.cmf.occi.openshift.impl.OcservicepodtocontainerImpl
		 * @see org.eclipse.cmf.occi.openshift.impl.OpenshiftPackageImpl#getOcservicepodtocontainer()
		 * @generated
		 */
		EClass OCSERVICEPODTOCONTAINER = eINSTANCE.getOcservicepodtocontainer();

		/**
		 * The meta object literal for the '<em><b>Target Constraint</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation OCSERVICEPODTOCONTAINER___TARGET_CONSTRAINT__DIAGNOSTICCHAIN_MAP = eINSTANCE.getOcservicepodtocontainer__TargetConstraint__DiagnosticChain_Map();

	}

} //OpenshiftPackage
