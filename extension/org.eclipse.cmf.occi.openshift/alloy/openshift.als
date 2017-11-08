// Generated at Wed Nov 08 18:55:39 CET 2017 from  by org.eclipse.cmf.occi.core.gen.alloy

// ======================================================================
//
// Static Semantics for OCCI Extension 'openshift'
//
// ======================================================================

module openshift

open util/boolean
open OCCI

// ======================================================================
//
// Imported extensions
//
// ======================================================================

open core
open platform

// ======================================================================
//
// OCCI extension 'openshift'
//
// ======================================================================

one sig extension extends Extension {} {
    name = "openshift"
    scheme = "http://occiware.org/openshift#"
    import = core/extension + platform/extension
    kinds = ocnamespace + ocservicepod + occontainer + ocservicepodtocontainer
    no mixins
    no types
}

// ======================================================================
//
// OCCI kind 'http://occiware.org/openshift#ocnamespace'
//
// ======================================================================

one sig ocnamespace extends Kind {} {
    term = "ocnamespace"
    scheme = "http://occiware.org/openshift#"
    no title
    parent = platform/application
    no attributes
    no actions
    entities in Ocnamespace
}

// ======================================================================
// Signature for Ocnamespace
// ======================================================================

sig Ocnamespace extends platform/Application {
} {
    hasKind[ocnamespace]
}

// ======================================================================
//
// OCCI kind 'http://occiware.org/openshift#ocservicepod'
//
// ======================================================================

one sig ocservicepod extends Kind {} {
    term = "ocservicepod"
    scheme = "http://occiware.org/openshift#"
    no title
    parent = platform/component
    attributes = ocservicepod_openshift_servicepod_name + ocservicepod_openshift_servicepod_replicas
    no actions
    entities in Ocservicepod
}

//
// OCCI attribute 'openshift.servicepod.name'
//
one sig ocservicepod_openshift_servicepod_name extends Attribute {} {
    name = "openshift.servicepod.name"
    type = core/String_DataType
    mutable = True
    required = False
    no default
    description = "Name of both the OpenShift Pod (its DeploymentConfig actually) and its facade service"
    multiple_values = 
}

//
// OCCI attribute 'openshift.servicepod.replicas'
//
one sig ocservicepod_openshift_servicepod_replicas extends Attribute {} {
    name = "openshift.servicepod.replicas"
    type = core/Integer_DataType
    mutable = True
    required = False
    no default
    description = "Number of pod replicas that OpenShift should instantiate"
    multiple_values = 
}

// ======================================================================
// Signature for Ocservicepod
// ======================================================================

sig Ocservicepod extends platform/Component {
    openshift_servicepod_name : lone String,
    openshift_servicepod_replicas : lone core/Integer,
} {
    hasKind[ocservicepod]
}

// ======================================================================
//
// OCCI kind 'http://occiware.org/openshift#occontainer'
//
// ======================================================================

one sig occontainer extends Kind {} {
    term = "occontainer"
    scheme = "http://occiware.org/openshift#"
    no title
    parent = platform/component
    attributes = occontainer_openshift_container_name + occontainer_openshift_container_image + occontainer_openshift_container_portMappings
    no actions
    entities in Occontainer
}

//
// OCCI attribute 'openshift.container.name'
//
one sig occontainer_openshift_container_name extends Attribute {} {
    name = "openshift.container.name"
    type = core/String_DataType
    mutable = True
    required = False
    no default
    description = "name of the OpenShift container"
    multiple_values = 
}

//
// OCCI attribute 'openshift.container.image'
//
one sig occontainer_openshift_container_image extends Attribute {} {
    name = "openshift.container.image"
    type = core/String_DataType
    mutable = True
    required = False
    no default
    description = "Docker image of the OpenShift container"
    multiple_values = 
}

//
// OCCI attribute 'openshift.container.portMappings'
//
one sig occontainer_openshift_container_portMappings extends Attribute {} {
    name = "openshift.container.portMappings"
    type = core/String_DataType
    mutable = True
    required = False
    no default
    description = "mappings (targetPort) of service ports (ports.port) to its pod's containers' ports (ports.containerPort), in the format :
    servicePort1-containerPort1,servicePort2-containerPort2
    Example : 8000-80,8443-443"
    multiple_values = 
}

// ======================================================================
// Signature for Occontainer
// ======================================================================

sig Occontainer extends platform/Component {
    openshift_container_name : lone String,
    openshift_container_image : lone String,
    openshift_container_portMappings : lone String,
} {
    hasKind[occontainer]
}

// ======================================================================
//
// OCCI kind 'http://occiware.org/openshift#ocservicepodtocontainer'
//
// ======================================================================

one sig ocservicepodtocontainer extends Kind {} {
    term = "ocservicepodtocontainer"
    scheme = "http://occiware.org/openshift#"
    no title
    parent = core/link
    no attributes
    no actions
    entities in Ocservicepodtocontainer
}

// ======================================================================
// Signature for Ocservicepodtocontainer
// ======================================================================

sig Ocservicepodtocontainer extends core/Link {
} {
    hasKind[ocservicepodtocontainer]
}

// ======================================================================
// Check consistency, i.e., there is at least one instance of this model.
// ======================================================================

run Consistency {} for 10

// ======================================================================
// Instance containing the OCCI Type System only.
// ======================================================================

run The_OCCI_Type_System {} for 0

