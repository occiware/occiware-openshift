/*******************************************************************************
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
 *************************************************************************
 * This code is 100% auto-generated
 * from:
 *   /org.eclipse.cmf.occi.openshift/model/openshift.ecore
 * using:
 *   /org.eclipse.cmf.occi.openshift/model/openshift.genmodel
 *   org.eclipse.ocl.examples.codegen.oclinecore.OCLinEcoreTables
 *
 * Do not edit it.
 *******************************************************************************/
package org.eclipse.cmf.occi.openshift;

import org.eclipse.cmf.occi.core.OCCITables;
import org.eclipse.cmf.occi.openshift.OpenshiftTables;
import org.eclipse.cmf.occi.platform.PlatformTables;
import org.eclipse.ocl.pivot.internal.library.ecore.EcoreExecutorPackage;
import org.eclipse.ocl.pivot.internal.library.ecore.EcoreExecutorProperty;
import org.eclipse.ocl.pivot.internal.library.ecore.EcoreExecutorType;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorFragment;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorOperation;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorProperty;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorStandardLibrary;
import org.eclipse.ocl.pivot.oclstdlib.OCLstdlibTables;

/**
 * OpenshiftTables provides the dispatch tables for the openshift for use by the OCL dispatcher.
 *
 * In order to ensure correct static initialization, a top level class element must be accessed
 * before any nested class element. Therefore an access to PACKAGE.getClass() is recommended.
 */
@SuppressWarnings("nls")
public class OpenshiftTables
{
	static {
		Init.initStart();
	}

	/**
	 *	The package descriptor for the package.
	 */
	public static final /*@NonNull*/ EcoreExecutorPackage PACKAGE = new EcoreExecutorPackage(OpenshiftPackage.eINSTANCE);

	/**
	 *	The library of all packages and types.
	 */
	public static final /*@NonNull*/ ExecutorStandardLibrary LIBRARY = OCLstdlibTables.LIBRARY;

	/**
	 *	Constants used by auto-generated code.
	 */
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.RootPackageId PACKid_$metamodel$ = org.eclipse.ocl.pivot.ids.IdManager.getRootPackageId("$metamodel$");
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.NsURIPackageId PACKid_http_c_s_s_occiware_org_s_openshift_s_ecore = org.eclipse.ocl.pivot.ids.IdManager.getNsURIPackageId("http://occiware.org/openshift/ecore", null, org.eclipse.cmf.occi.openshift.OpenshiftPackage.eINSTANCE);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.NsURIPackageId PACKid_http_c_s_s_schemas_ogf_org_s_occi_s_core_s_ecore = org.eclipse.ocl.pivot.ids.IdManager.getNsURIPackageId("http://schemas.ogf.org/occi/core/ecore", "occi", org.eclipse.cmf.occi.core.OCCIPackage.eINSTANCE);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_Class = org.eclipse.cmf.occi.openshift.OpenshiftTables.PACKid_$metamodel$.getClassId("Class", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_Occontainer = org.eclipse.cmf.occi.openshift.OpenshiftTables.PACKid_http_c_s_s_occiware_org_s_openshift_s_ecore.getClassId("Occontainer", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_Ocservicepodtocontainer = org.eclipse.cmf.occi.openshift.OpenshiftTables.PACKid_http_c_s_s_occiware_org_s_openshift_s_ecore.getClassId("Ocservicepodtocontainer", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_Resource = org.eclipse.cmf.occi.openshift.OpenshiftTables.PACKid_http_c_s_s_schemas_ogf_org_s_occi_s_core_s_ecore.getClassId("Resource", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.values.IntegerValue INT_0 = org.eclipse.ocl.pivot.utilities.ValueUtil.integerValueOf("0");
	public static final /*@NonInvalid*/ java.lang.String STR_Ocservicepodtocontainer_c_c_targetConstraint = "Ocservicepodtocontainer::targetConstraint";

	/**
	 *	The type parameters for templated types and operations.
	 */
	public static class TypeParameters {
		static {
			Init.initStart();
			OpenshiftTables.init();
		}

		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of OpenshiftTables::TypeParameters and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The type descriptors for each type.
	 */
	public static class Types {
		static {
			Init.initStart();
			TypeParameters.init();
		}

		public static final /*@NonNull*/ EcoreExecutorType _Occontainer = new EcoreExecutorType(OpenshiftPackage.Literals.OCCONTAINER, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _Ocnamespace = new EcoreExecutorType(OpenshiftPackage.Literals.OCNAMESPACE, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _Ocservicepod = new EcoreExecutorType(OpenshiftPackage.Literals.OCSERVICEPOD, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _Ocservicepodtocontainer = new EcoreExecutorType(OpenshiftPackage.Literals.OCSERVICEPODTOCONTAINER, PACKAGE, 0);

		private static final /*@NonNull*/ EcoreExecutorType /*@NonNull*/ [] types = {
			_Occontainer,
			_Ocnamespace,
			_Ocservicepod,
			_Ocservicepodtocontainer
		};

		/*
		 *	Install the type descriptors in the package descriptor.
		 */
		static {
			PACKAGE.init(LIBRARY, types);
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of OpenshiftTables::Types and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The fragment descriptors for the local elements of each type and its supertypes.
	 */
	public static class Fragments {
		static {
			Init.initStart();
			Types.init();
		}

		private static final /*@NonNull*/ ExecutorFragment _Occontainer__Component = new ExecutorFragment(Types._Occontainer, PlatformTables.Types._Component);
		private static final /*@NonNull*/ ExecutorFragment _Occontainer__Entity = new ExecutorFragment(Types._Occontainer, OCCITables.Types._Entity);
		private static final /*@NonNull*/ ExecutorFragment _Occontainer__Occontainer = new ExecutorFragment(Types._Occontainer, OpenshiftTables.Types._Occontainer);
		private static final /*@NonNull*/ ExecutorFragment _Occontainer__OclAny = new ExecutorFragment(Types._Occontainer, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _Occontainer__OclElement = new ExecutorFragment(Types._Occontainer, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _Occontainer__Resource = new ExecutorFragment(Types._Occontainer, OCCITables.Types._Resource);

		private static final /*@NonNull*/ ExecutorFragment _Ocnamespace__Application = new ExecutorFragment(Types._Ocnamespace, PlatformTables.Types._Application);
		private static final /*@NonNull*/ ExecutorFragment _Ocnamespace__Entity = new ExecutorFragment(Types._Ocnamespace, OCCITables.Types._Entity);
		private static final /*@NonNull*/ ExecutorFragment _Ocnamespace__OclAny = new ExecutorFragment(Types._Ocnamespace, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _Ocnamespace__OclElement = new ExecutorFragment(Types._Ocnamespace, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _Ocnamespace__Ocnamespace = new ExecutorFragment(Types._Ocnamespace, OpenshiftTables.Types._Ocnamespace);
		private static final /*@NonNull*/ ExecutorFragment _Ocnamespace__Resource = new ExecutorFragment(Types._Ocnamespace, OCCITables.Types._Resource);

		private static final /*@NonNull*/ ExecutorFragment _Ocservicepod__Component = new ExecutorFragment(Types._Ocservicepod, PlatformTables.Types._Component);
		private static final /*@NonNull*/ ExecutorFragment _Ocservicepod__Entity = new ExecutorFragment(Types._Ocservicepod, OCCITables.Types._Entity);
		private static final /*@NonNull*/ ExecutorFragment _Ocservicepod__OclAny = new ExecutorFragment(Types._Ocservicepod, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _Ocservicepod__OclElement = new ExecutorFragment(Types._Ocservicepod, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _Ocservicepod__Ocservicepod = new ExecutorFragment(Types._Ocservicepod, OpenshiftTables.Types._Ocservicepod);
		private static final /*@NonNull*/ ExecutorFragment _Ocservicepod__Resource = new ExecutorFragment(Types._Ocservicepod, OCCITables.Types._Resource);

		private static final /*@NonNull*/ ExecutorFragment _Ocservicepodtocontainer__Entity = new ExecutorFragment(Types._Ocservicepodtocontainer, OCCITables.Types._Entity);
		private static final /*@NonNull*/ ExecutorFragment _Ocservicepodtocontainer__Link = new ExecutorFragment(Types._Ocservicepodtocontainer, OCCITables.Types._Link);
		private static final /*@NonNull*/ ExecutorFragment _Ocservicepodtocontainer__OclAny = new ExecutorFragment(Types._Ocservicepodtocontainer, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _Ocservicepodtocontainer__OclElement = new ExecutorFragment(Types._Ocservicepodtocontainer, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _Ocservicepodtocontainer__Ocservicepodtocontainer = new ExecutorFragment(Types._Ocservicepodtocontainer, OpenshiftTables.Types._Ocservicepodtocontainer);

		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of OpenshiftTables::Fragments and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The parameter lists shared by operations.
	 *
	 * @noextend This class is not intended to be subclassed by clients.
	 * @noinstantiate This class is not intended to be instantiated by clients.
	 * @noreference This class is not intended to be referenced by clients.
	 */
	public static class Parameters {
		static {
			Init.initStart();
			Fragments.init();
		}


		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of OpenshiftTables::Parameters and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The operation descriptors for each operation of each type.
	 *
	 * @noextend This class is not intended to be subclassed by clients.
	 * @noinstantiate This class is not intended to be instantiated by clients.
	 * @noreference This class is not intended to be referenced by clients.
	 */
	public static class Operations {
		static {
			Init.initStart();
			Parameters.init();
		}

		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of OpenshiftTables::Operations and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The property descriptors for each property of each type.
	 *
	 * @noextend This class is not intended to be subclassed by clients.
	 * @noinstantiate This class is not intended to be instantiated by clients.
	 * @noreference This class is not intended to be referenced by clients.
	 */
	public static class Properties {
		static {
			Init.initStart();
			Operations.init();
		}

		public static final /*@NonNull*/ ExecutorProperty _Occontainer__openshiftContainerImage = new EcoreExecutorProperty(OpenshiftPackage.Literals.OCCONTAINER__OPENSHIFT_CONTAINER_IMAGE, Types._Occontainer, 0);
		public static final /*@NonNull*/ ExecutorProperty _Occontainer__openshiftContainerName = new EcoreExecutorProperty(OpenshiftPackage.Literals.OCCONTAINER__OPENSHIFT_CONTAINER_NAME, Types._Occontainer, 1);
		public static final /*@NonNull*/ ExecutorProperty _Occontainer__openshiftContainerPortMappings = new EcoreExecutorProperty(OpenshiftPackage.Literals.OCCONTAINER__OPENSHIFT_CONTAINER_PORT_MAPPINGS, Types._Occontainer, 2);

		public static final /*@NonNull*/ ExecutorProperty _Ocservicepod__openshiftServicepodName = new EcoreExecutorProperty(OpenshiftPackage.Literals.OCSERVICEPOD__OPENSHIFT_SERVICEPOD_NAME, Types._Ocservicepod, 0);
		public static final /*@NonNull*/ ExecutorProperty _Ocservicepod__openshiftServicepodReplicas = new EcoreExecutorProperty(OpenshiftPackage.Literals.OCSERVICEPOD__OPENSHIFT_SERVICEPOD_REPLICAS, Types._Ocservicepod, 1);
		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of OpenshiftTables::Properties and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The fragments for all base types in depth order: OclAny first, OclSelf last.
	 */
	public static class TypeFragments {
		static {
			Init.initStart();
			Properties.init();
		}

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _Occontainer =
		{
			Fragments._Occontainer__OclAny /* 0 */,
			Fragments._Occontainer__OclElement /* 1 */,
			Fragments._Occontainer__Entity /* 2 */,
			Fragments._Occontainer__Resource /* 3 */,
			Fragments._Occontainer__Component /* 4 */,
			Fragments._Occontainer__Occontainer /* 5 */
		};
		private static final int /*@NonNull*/ [] __Occontainer = { 1,1,1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _Ocnamespace =
		{
			Fragments._Ocnamespace__OclAny /* 0 */,
			Fragments._Ocnamespace__OclElement /* 1 */,
			Fragments._Ocnamespace__Entity /* 2 */,
			Fragments._Ocnamespace__Resource /* 3 */,
			Fragments._Ocnamespace__Application /* 4 */,
			Fragments._Ocnamespace__Ocnamespace /* 5 */
		};
		private static final int /*@NonNull*/ [] __Ocnamespace = { 1,1,1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _Ocservicepod =
		{
			Fragments._Ocservicepod__OclAny /* 0 */,
			Fragments._Ocservicepod__OclElement /* 1 */,
			Fragments._Ocservicepod__Entity /* 2 */,
			Fragments._Ocservicepod__Resource /* 3 */,
			Fragments._Ocservicepod__Component /* 4 */,
			Fragments._Ocservicepod__Ocservicepod /* 5 */
		};
		private static final int /*@NonNull*/ [] __Ocservicepod = { 1,1,1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _Ocservicepodtocontainer =
		{
			Fragments._Ocservicepodtocontainer__OclAny /* 0 */,
			Fragments._Ocservicepodtocontainer__OclElement /* 1 */,
			Fragments._Ocservicepodtocontainer__Entity /* 2 */,
			Fragments._Ocservicepodtocontainer__Link /* 3 */,
			Fragments._Ocservicepodtocontainer__Ocservicepodtocontainer /* 4 */
		};
		private static final int /*@NonNull*/ [] __Ocservicepodtocontainer = { 1,1,1,1,1 };

		/**
		 *	Install the fragment descriptors in the class descriptors.
		 */
		static {
			Types._Occontainer.initFragments(_Occontainer, __Occontainer);
			Types._Ocnamespace.initFragments(_Ocnamespace, __Ocnamespace);
			Types._Ocservicepod.initFragments(_Ocservicepod, __Ocservicepod);
			Types._Ocservicepodtocontainer.initFragments(_Ocservicepodtocontainer, __Ocservicepodtocontainer);

			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of OpenshiftTables::TypeFragments and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The lists of local operations or local operation overrides for each fragment of each type.
	 */
	public static class FragmentOperations {
		static {
			Init.initStart();
			TypeFragments.init();
		}

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Occontainer__Occontainer = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Occontainer__Component = {
			PlatformTables.Operations._Component__start /* start() */,
			PlatformTables.Operations._Component__start /* start() */,
			PlatformTables.Operations._Component__stop /* stop() */,
			PlatformTables.Operations._Component__stop /* stop() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Occontainer__Entity = {
			OCCITables.Operations._Entity__occiCreate /* occiCreate() */,
			OCCITables.Operations._Entity__occiCreate /* occiCreate() */,
			OCCITables.Operations._Entity__occiDelete /* occiDelete() */,
			OCCITables.Operations._Entity__occiDelete /* occiDelete() */,
			OCCITables.Operations._Entity__occiRetrieve /* occiRetrieve() */,
			OCCITables.Operations._Entity__occiRetrieve /* occiRetrieve() */,
			OCCITables.Operations._Entity__occiUpdate /* occiUpdate() */,
			OCCITables.Operations._Entity__occiUpdate /* occiUpdate() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Occontainer__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[?]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Occontainer__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Occontainer__Resource = {};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Ocnamespace__Ocnamespace = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Ocnamespace__Application = {
			PlatformTables.Operations._Application__start /* start() */,
			PlatformTables.Operations._Application__start /* start() */,
			PlatformTables.Operations._Application__stop /* stop() */,
			PlatformTables.Operations._Application__stop /* stop() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Ocnamespace__Entity = {
			OCCITables.Operations._Entity__occiCreate /* occiCreate() */,
			OCCITables.Operations._Entity__occiCreate /* occiCreate() */,
			OCCITables.Operations._Entity__occiDelete /* occiDelete() */,
			OCCITables.Operations._Entity__occiDelete /* occiDelete() */,
			OCCITables.Operations._Entity__occiRetrieve /* occiRetrieve() */,
			OCCITables.Operations._Entity__occiRetrieve /* occiRetrieve() */,
			OCCITables.Operations._Entity__occiUpdate /* occiUpdate() */,
			OCCITables.Operations._Entity__occiUpdate /* occiUpdate() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Ocnamespace__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[?]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Ocnamespace__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Ocnamespace__Resource = {};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Ocservicepod__Ocservicepod = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Ocservicepod__Component = {
			PlatformTables.Operations._Component__start /* start() */,
			PlatformTables.Operations._Component__start /* start() */,
			PlatformTables.Operations._Component__stop /* stop() */,
			PlatformTables.Operations._Component__stop /* stop() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Ocservicepod__Entity = {
			OCCITables.Operations._Entity__occiCreate /* occiCreate() */,
			OCCITables.Operations._Entity__occiCreate /* occiCreate() */,
			OCCITables.Operations._Entity__occiDelete /* occiDelete() */,
			OCCITables.Operations._Entity__occiDelete /* occiDelete() */,
			OCCITables.Operations._Entity__occiRetrieve /* occiRetrieve() */,
			OCCITables.Operations._Entity__occiRetrieve /* occiRetrieve() */,
			OCCITables.Operations._Entity__occiUpdate /* occiUpdate() */,
			OCCITables.Operations._Entity__occiUpdate /* occiUpdate() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Ocservicepod__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[?]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Ocservicepod__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Ocservicepod__Resource = {};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Ocservicepodtocontainer__Ocservicepodtocontainer = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Ocservicepodtocontainer__Entity = {
			OCCITables.Operations._Entity__occiCreate /* occiCreate() */,
			OCCITables.Operations._Entity__occiCreate /* occiCreate() */,
			OCCITables.Operations._Entity__occiDelete /* occiDelete() */,
			OCCITables.Operations._Entity__occiDelete /* occiDelete() */,
			OCCITables.Operations._Entity__occiRetrieve /* occiRetrieve() */,
			OCCITables.Operations._Entity__occiRetrieve /* occiRetrieve() */,
			OCCITables.Operations._Entity__occiUpdate /* occiUpdate() */,
			OCCITables.Operations._Entity__occiUpdate /* occiUpdate() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Ocservicepodtocontainer__Link = {
			OCCITables.Operations._Link__LinkSourceInvariant /* LinkSourceInvariant(Kind[?],Kind[?]) */,
			OCCITables.Operations._Link__LinkSourceInvariant /* LinkSourceInvariant(Kind[?],Kind[?]) */,
			OCCITables.Operations._Link__LinkTargetInvariant /* LinkTargetInvariant(Kind[?],Kind[?]) */,
			OCCITables.Operations._Link__LinkTargetInvariant /* LinkTargetInvariant(Kind[?],Kind[?]) */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Ocservicepodtocontainer__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[?]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Ocservicepodtocontainer__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		/*
		 *	Install the operation descriptors in the fragment descriptors.
		 */
		static {
			Fragments._Occontainer__Component.initOperations(_Occontainer__Component);
			Fragments._Occontainer__Entity.initOperations(_Occontainer__Entity);
			Fragments._Occontainer__Occontainer.initOperations(_Occontainer__Occontainer);
			Fragments._Occontainer__OclAny.initOperations(_Occontainer__OclAny);
			Fragments._Occontainer__OclElement.initOperations(_Occontainer__OclElement);
			Fragments._Occontainer__Resource.initOperations(_Occontainer__Resource);

			Fragments._Ocnamespace__Application.initOperations(_Ocnamespace__Application);
			Fragments._Ocnamespace__Entity.initOperations(_Ocnamespace__Entity);
			Fragments._Ocnamespace__OclAny.initOperations(_Ocnamespace__OclAny);
			Fragments._Ocnamespace__OclElement.initOperations(_Ocnamespace__OclElement);
			Fragments._Ocnamespace__Ocnamespace.initOperations(_Ocnamespace__Ocnamespace);
			Fragments._Ocnamespace__Resource.initOperations(_Ocnamespace__Resource);

			Fragments._Ocservicepod__Component.initOperations(_Ocservicepod__Component);
			Fragments._Ocservicepod__Entity.initOperations(_Ocservicepod__Entity);
			Fragments._Ocservicepod__OclAny.initOperations(_Ocservicepod__OclAny);
			Fragments._Ocservicepod__OclElement.initOperations(_Ocservicepod__OclElement);
			Fragments._Ocservicepod__Ocservicepod.initOperations(_Ocservicepod__Ocservicepod);
			Fragments._Ocservicepod__Resource.initOperations(_Ocservicepod__Resource);

			Fragments._Ocservicepodtocontainer__Entity.initOperations(_Ocservicepodtocontainer__Entity);
			Fragments._Ocservicepodtocontainer__Link.initOperations(_Ocservicepodtocontainer__Link);
			Fragments._Ocservicepodtocontainer__OclAny.initOperations(_Ocservicepodtocontainer__OclAny);
			Fragments._Ocservicepodtocontainer__OclElement.initOperations(_Ocservicepodtocontainer__OclElement);
			Fragments._Ocservicepodtocontainer__Ocservicepodtocontainer.initOperations(_Ocservicepodtocontainer__Ocservicepodtocontainer);

			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of OpenshiftTables::FragmentOperations and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The lists of local properties for the local fragment of each type.
	 */
	public static class FragmentProperties {
		static {
			Init.initStart();
			FragmentOperations.init();
		}

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _Occontainer = {
			OpenshiftTables.Properties._Occontainer__openshiftContainerImage,
			OpenshiftTables.Properties._Occontainer__openshiftContainerName,
			OpenshiftTables.Properties._Occontainer__openshiftContainerPortMappings
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _Ocnamespace = {};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _Ocservicepod = {
			OpenshiftTables.Properties._Ocservicepod__openshiftServicepodName,
			OpenshiftTables.Properties._Ocservicepod__openshiftServicepodReplicas
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _Ocservicepodtocontainer = {};

		/**
		 *	Install the property descriptors in the fragment descriptors.
		 */
		static {
			Fragments._Occontainer__Occontainer.initProperties(_Occontainer);
			Fragments._Ocnamespace__Ocnamespace.initProperties(_Ocnamespace);
			Fragments._Ocservicepod__Ocservicepod.initProperties(_Ocservicepod);
			Fragments._Ocservicepodtocontainer__Ocservicepodtocontainer.initProperties(_Ocservicepodtocontainer);

			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of OpenshiftTables::FragmentProperties and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The lists of enumeration literals for each enumeration.
	 */
	public static class EnumerationLiterals {
		static {
			Init.initStart();
			FragmentProperties.init();
		}

		/**
		 *	Install the enumeration literals in the enumerations.
		 */
		static {

			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of OpenshiftTables::EnumerationLiterals and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 * The multiple packages above avoid problems with the Java 65536 byte limit but introduce a difficulty in ensuring that
	 * static construction occurs in the disciplined order of the packages when construction may start in any of the packages.
	 * The problem is resolved by ensuring that the static construction of each package first initializes its immediate predecessor.
	 * On completion of predecessor initialization, the residual packages are initialized by starting an initialization in the last package.
	 * This class maintains a count so that the various predecessors can distinguish whether they are the starting point and so
	 * ensure that residual construction occurs just once after all predecessors.
	 */
	private static class Init {
		/**
		 * Counter of nested static constructions. On return to zero residual construction starts. -ve once residual construction started.
		 */
		private static int initCount = 0;

		/**
		 * Invoked at the start of a static construction to defer residual cobstruction until primary constructions complete.
		 */
		private static void initStart() {
			if (initCount >= 0) {
				initCount++;
			}
		}

		/**
		 * Invoked at the end of a static construction to activate residual cobstruction once primary constructions complete.
		 */
		private static void initEnd() {
			if (initCount > 0) {
				if (--initCount == 0) {
					initCount = -1;
					EnumerationLiterals.init();
				}
			}
		}
	}

	static {
		Init.initEnd();
	}

	/*
	 * Force initialization of outer fields. Inner fields are lazily initialized.
	 */
	public static void init() {}
}
