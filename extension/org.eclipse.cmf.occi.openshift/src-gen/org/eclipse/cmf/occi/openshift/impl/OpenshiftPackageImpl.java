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

import org.eclipse.cmf.occi.core.OCCIPackage;

import org.eclipse.cmf.occi.openshift.Occontainer;
import org.eclipse.cmf.occi.openshift.Ocnamespace;
import org.eclipse.cmf.occi.openshift.Ocservicepod;
import org.eclipse.cmf.occi.openshift.Ocservicepodtocontainer;
import org.eclipse.cmf.occi.openshift.OpenshiftFactory;
import org.eclipse.cmf.occi.openshift.OpenshiftPackage;

import org.eclipse.cmf.occi.openshift.util.OpenshiftValidator;

import org.eclipse.cmf.occi.platform.PlatformPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EValidator;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class OpenshiftPackageImpl extends EPackageImpl implements OpenshiftPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ocnamespaceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ocservicepodEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass occontainerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ocservicepodtocontainerEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see org.eclipse.cmf.occi.openshift.OpenshiftPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private OpenshiftPackageImpl() {
		super(eNS_URI, OpenshiftFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link OpenshiftPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static OpenshiftPackage init() {
		if (isInited) return (OpenshiftPackage)EPackage.Registry.INSTANCE.getEPackage(OpenshiftPackage.eNS_URI);

		// Obtain or create and register package
		OpenshiftPackageImpl theOpenshiftPackage = (OpenshiftPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof OpenshiftPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new OpenshiftPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		PlatformPackage.eINSTANCE.eClass();
		OCCIPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theOpenshiftPackage.createPackageContents();

		// Initialize created meta-data
		theOpenshiftPackage.initializePackageContents();

		// Register package validator
		EValidator.Registry.INSTANCE.put
			(theOpenshiftPackage, 
			 new EValidator.Descriptor() {
				 public EValidator getEValidator() {
					 return OpenshiftValidator.INSTANCE;
				 }
			 });

		// Mark meta-data to indicate it can't be changed
		theOpenshiftPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(OpenshiftPackage.eNS_URI, theOpenshiftPackage);
		return theOpenshiftPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOcnamespace() {
		return ocnamespaceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOcservicepod() {
		return ocservicepodEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOcservicepod_OpenshiftServicepodName() {
		return (EAttribute)ocservicepodEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOcservicepod_OpenshiftServicepodReplicas() {
		return (EAttribute)ocservicepodEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOccontainer() {
		return occontainerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOccontainer_OpenshiftContainerName() {
		return (EAttribute)occontainerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOccontainer_OpenshiftContainerImage() {
		return (EAttribute)occontainerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOccontainer_OpenshiftContainerPortMappings() {
		return (EAttribute)occontainerEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOcservicepodtocontainer() {
		return ocservicepodtocontainerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getOcservicepodtocontainer__TargetConstraint__DiagnosticChain_Map() {
		return ocservicepodtocontainerEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OpenshiftFactory getOpenshiftFactory() {
		return (OpenshiftFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		ocnamespaceEClass = createEClass(OCNAMESPACE);

		ocservicepodEClass = createEClass(OCSERVICEPOD);
		createEAttribute(ocservicepodEClass, OCSERVICEPOD__OPENSHIFT_SERVICEPOD_NAME);
		createEAttribute(ocservicepodEClass, OCSERVICEPOD__OPENSHIFT_SERVICEPOD_REPLICAS);

		occontainerEClass = createEClass(OCCONTAINER);
		createEAttribute(occontainerEClass, OCCONTAINER__OPENSHIFT_CONTAINER_NAME);
		createEAttribute(occontainerEClass, OCCONTAINER__OPENSHIFT_CONTAINER_IMAGE);
		createEAttribute(occontainerEClass, OCCONTAINER__OPENSHIFT_CONTAINER_PORT_MAPPINGS);

		ocservicepodtocontainerEClass = createEClass(OCSERVICEPODTOCONTAINER);
		createEOperation(ocservicepodtocontainerEClass, OCSERVICEPODTOCONTAINER___TARGET_CONSTRAINT__DIAGNOSTICCHAIN_MAP);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		PlatformPackage thePlatformPackage = (PlatformPackage)EPackage.Registry.INSTANCE.getEPackage(PlatformPackage.eNS_URI);
		OCCIPackage theOCCIPackage = (OCCIPackage)EPackage.Registry.INSTANCE.getEPackage(OCCIPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		ocnamespaceEClass.getESuperTypes().add(thePlatformPackage.getApplication());
		ocservicepodEClass.getESuperTypes().add(thePlatformPackage.getComponent());
		occontainerEClass.getESuperTypes().add(thePlatformPackage.getComponent());
		ocservicepodtocontainerEClass.getESuperTypes().add(theOCCIPackage.getLink());

		// Initialize classes, features, and operations; add parameters
		initEClass(ocnamespaceEClass, Ocnamespace.class, "Ocnamespace", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(ocservicepodEClass, Ocservicepod.class, "Ocservicepod", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOcservicepod_OpenshiftServicepodName(), theOCCIPackage.getString(), "openshiftServicepodName", null, 0, 1, Ocservicepod.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOcservicepod_OpenshiftServicepodReplicas(), theOCCIPackage.getInteger(), "openshiftServicepodReplicas", null, 0, 1, Ocservicepod.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(occontainerEClass, Occontainer.class, "Occontainer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOccontainer_OpenshiftContainerName(), theOCCIPackage.getString(), "openshiftContainerName", null, 0, 1, Occontainer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOccontainer_OpenshiftContainerImage(), theOCCIPackage.getString(), "openshiftContainerImage", null, 0, 1, Occontainer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOccontainer_OpenshiftContainerPortMappings(), theOCCIPackage.getString(), "openshiftContainerPortMappings", null, 0, 1, Occontainer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ocservicepodtocontainerEClass, Ocservicepodtocontainer.class, "Ocservicepodtocontainer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		EOperation op = initEOperation(getOcservicepodtocontainer__TargetConstraint__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "targetConstraint", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		EGenericType g1 = createEGenericType(ecorePackage.getEMap());
		EGenericType g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://www.eclipse.org/emf/2002/Ecore
		createEcoreAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/Ecore</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createEcoreAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/Ecore";	
		addAnnotation
		  (this, 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (ocservicepodtocontainerEClass, 
		   source, 
		   new String[] {
			 "constraints", "targetConstraint"
		   });
	}

} //OpenshiftPackageImpl
