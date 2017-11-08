// Generated at Wed Nov 08 18:55:39 CET 2017 from  by org.eclipse.cmf.occi.core.gen.alloy

// ======================================================================
//
// Dynamic Semantics for OCCI Extensions 'openshift'
//
// ======================================================================

module openshift_behaviour

open util/boolean
open OCCI
open openshift

//
// Imported extensions
//
open core
open platform

// ======================================================================
//
// OCCI kind 'http://occiware.org/openshift#ocnamespace'
//
// ======================================================================

//
// Equivalence predicate between two Ocnamespace atoms.
//
pred isoOcnamespace[o1, o2: Ocnamespace]
{
    // Comment following lines when this is not the expected behaviour.
    isoOcnamespace[o1, o2] // same application
}



// ======================================================================
//
// OCCI kind 'http://occiware.org/openshift#ocservicepod'
//
// ======================================================================

//
// Equivalence predicate between two Ocservicepod atoms.
//
pred isoOcservicepod[o1, o2: Ocservicepod]
{
    // Comment following lines when this is not the expected behaviour.
    isoOcservicepod[o1, o2] // same component
}



// ======================================================================
//
// OCCI kind 'http://occiware.org/openshift#occontainer'
//
// ======================================================================

//
// Equivalence predicate between two Occontainer atoms.
//
pred isoOccontainer[o1, o2: Occontainer]
{
    // Comment following lines when this is not the expected behaviour.
    isoOccontainer[o1, o2] // same component
}



// ======================================================================
//
// OCCI kind 'http://occiware.org/openshift#ocservicepodtocontainer'
//
// ======================================================================

//
// Equivalence predicate between two Ocservicepodtocontainer atoms.
//
pred isoOcservicepodtocontainer[o1, o2: Ocservicepodtocontainer]
{
    // Comment following lines when this is not the expected behaviour.
    isoOcservicepodtocontainer[o1, o2] // same link
}



// ======================================================================
// Check consistency, i.e., there is at least one instance of this model.
// ======================================================================

run Consistency {} for 10

