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
package org.eclipse.cmf.occi.openshift.util;

import java.util.Map;

import org.eclipse.cmf.occi.core.util.OCCIValidator;

import org.eclipse.cmf.occi.openshift.*;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see org.eclipse.cmf.occi.openshift.OpenshiftPackage
 * @generated
 */
public class OpenshiftValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final OpenshiftValidator INSTANCE = new OpenshiftValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "org.eclipse.cmf.occi.openshift";

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Target Constraint' of 'Ocservicepodtocontainer'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int OCSERVICEPODTOCONTAINER__TARGET_CONSTRAINT = 1;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 1;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants in a derived class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final int DIAGNOSTIC_CODE_COUNT = GENERATED_DIAGNOSTIC_CODE_COUNT;

	/**
	 * The cached base package validator.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OCCIValidator occiValidator;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OpenshiftValidator() {
		super();
		occiValidator = OCCIValidator.INSTANCE;
	}

	/**
	 * Returns the package of this validator switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EPackage getEPackage() {
	  return OpenshiftPackage.eINSTANCE;
	}

	/**
	 * Calls <code>validateXXX</code> for the corresponding classifier of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean validate(int classifierID, Object value, DiagnosticChain diagnostics, Map<Object, Object> context) {
		switch (classifierID) {
			case OpenshiftPackage.OCNAMESPACE:
				return validateOcnamespace((Ocnamespace)value, diagnostics, context);
			case OpenshiftPackage.OCSERVICEPOD:
				return validateOcservicepod((Ocservicepod)value, diagnostics, context);
			case OpenshiftPackage.OCCONTAINER:
				return validateOccontainer((Occontainer)value, diagnostics, context);
			case OpenshiftPackage.OCSERVICEPODTOCONTAINER:
				return validateOcservicepodtocontainer((Ocservicepodtocontainer)value, diagnostics, context);
			default:
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOcnamespace(Ocnamespace ocnamespace, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(ocnamespace, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(ocnamespace, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(ocnamespace, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(ocnamespace, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(ocnamespace, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(ocnamespace, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(ocnamespace, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(ocnamespace, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(ocnamespace, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateEntity_IdUnique(ocnamespace, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateEntity_AttributesNameUnique(ocnamespace, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateEntity_KindCompatibleWithOneAppliesOfEachMixin(ocnamespace, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateResource_ResourceKindIsInParent(ocnamespace, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOcservicepod(Ocservicepod ocservicepod, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(ocservicepod, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(ocservicepod, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(ocservicepod, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(ocservicepod, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(ocservicepod, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(ocservicepod, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(ocservicepod, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(ocservicepod, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(ocservicepod, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateEntity_IdUnique(ocservicepod, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateEntity_AttributesNameUnique(ocservicepod, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateEntity_KindCompatibleWithOneAppliesOfEachMixin(ocservicepod, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateResource_ResourceKindIsInParent(ocservicepod, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOccontainer(Occontainer occontainer, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(occontainer, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(occontainer, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(occontainer, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(occontainer, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(occontainer, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(occontainer, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(occontainer, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(occontainer, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(occontainer, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateEntity_IdUnique(occontainer, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateEntity_AttributesNameUnique(occontainer, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateEntity_KindCompatibleWithOneAppliesOfEachMixin(occontainer, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateResource_ResourceKindIsInParent(occontainer, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOcservicepodtocontainer(Ocservicepodtocontainer ocservicepodtocontainer, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(ocservicepodtocontainer, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(ocservicepodtocontainer, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(ocservicepodtocontainer, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(ocservicepodtocontainer, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(ocservicepodtocontainer, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(ocservicepodtocontainer, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(ocservicepodtocontainer, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(ocservicepodtocontainer, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(ocservicepodtocontainer, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateEntity_IdUnique(ocservicepodtocontainer, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateEntity_AttributesNameUnique(ocservicepodtocontainer, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateEntity_KindCompatibleWithOneAppliesOfEachMixin(ocservicepodtocontainer, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateLink_LinkKindIsInParent(ocservicepodtocontainer, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateLink_sourceReferenceInvariant(ocservicepodtocontainer, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateLink_targetReferenceInvariant(ocservicepodtocontainer, diagnostics, context);
		if (result || diagnostics != null) result &= validateOcservicepodtocontainer_targetConstraint(ocservicepodtocontainer, diagnostics, context);
		return result;
	}

	/**
	 * Validates the targetConstraint constraint of '<em>Ocservicepodtocontainer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOcservicepodtocontainer_targetConstraint(Ocservicepodtocontainer ocservicepodtocontainer, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ocservicepodtocontainer.targetConstraint(diagnostics, context);
	}

	/**
	 * Returns the resource locator that will be used to fetch messages for this validator's diagnostics.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		// TODO
		// Specialize this to return a resource locator for messages specific to this validator.
		// Ensure that you remove @generated or mark it @generated NOT
		return super.getResourceLocator();
	}

} //OpenshiftValidator
