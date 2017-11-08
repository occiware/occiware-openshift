# OpenShift extension and connector

## Goal

This OCCI extension allows to configure OpenShift deployment of simple scalable applications (Pods of Containers) in OCCI.


## Requirements

Java 8, OCCIware-Studio ([release continuuous build](https://github.com/occiware/OCCI-Studio/releases/tag/current) of 2017/11/08 or later, or from corresponding source code), an OpenShift server (tested with v3.6.1), the corresponding OpenShift "oc" client tool.

Install java and maven :

``` bash
sudo apt-get install default-jre default-jdk maven
```

Install the OpenShift "oc" client tool : copy ex. in your $HOME/bin the "oc" binary taken from the release archive, downloadable ex. at https://github.com/openshift/origin/releases/tag/v3.6.1

Install an OpenShift server : see https://install.openshift.com/


## Using the OpenShift extension in the OCCI Studio

Having installed and started the OCCI-Studio, and cloned (or downloaded) this repository :
- import all of this repository's [extension/* projects](extension) in the Studio : File > Import > General > Existing projects into workspace
- start the OpenShift Studio : find the openshift.occie extension file, right-click on it > Run as > configurations... > Eclipse Application
- use an existing example .openshift configuration (see below), or create your own : File > New > OCCI Studio > new OpenShift configuration file


## Using the first example
Having started the OpenShift Studio as above :
- import this repository's [openshift-occi-configurations](openshift-occi-configurations) project : File > Import > General > Existing projects into workspace
- open its smile-apps.openshift file.

The first example allows to configure deployment in OpenShift of a simple website application, consisting in a single "web" service whose pod contains a single "nginx" nginx container. To make it scale up, the pod's openshift.servicepod.replicas attribute needs to be set beyond 1 as needed.

See [screenshots](screenshots).

This first example corresponds to the following OpenShift configuration :

````yaml
apiVersion: v1
kind: DeploymentConfig
metadata:
  creationTimestamp: null
  labels:
    app: web
  name: web
spec:
  replicas: 1
  selector:
    run: web
  strategy:
    resources: {}
  template:
    metadata:
      creationTimestamp: null
      labels:
        app: web
    spec:
      containers:
      - image: nginx
        name: web
        ports:
          - containerPort: 80
            name: web
        #env:
        #- name:MONGO_HOST
        #  value: mongo (name of the service, but very hard to scale on openshift) 
        #- name:MONGO_PORT
        #  value: 27017
        resources: {}
  test: false
  triggers: null
---
kind: Service
metadata:
  creationTimestamp: null
  labels:
    # on what it applies :
    app: web
  name: web
spec:
  ports:
  - name: 8000-80
    port: 8000
    protocol: TCP
    # to connect with the above pod's container :
    targetPort: 80
  selector:
    app: web
  type: NodePort
status:
  loadBalancer: {}
````


## roadmap :

- implement OcservicepodConnector.occiCreate() using an OpenShift command line called in a mere Runtime.exec(), see 

& later :
- OR develop YAML conf generator using .mtl template
- OR use this to do that
- improve designer : remove unused attributes
- start() : could change replicas from 0 to 1, or upload conf ?
- OCContainer => Docker-Studio's Container (?)
- openshift.container.portMappings => Array[Record{record fields}]


## Development notes

### Backlog of OCCI extension design using OCCI-Studio :
````
File > New > Others... > OCCI Studio > OCCI Extension Project
org.eclipse.cmf.openshift
openshift
http://occiware.org/openshift#

model kinds and attributes
examples & best practices : look for .occie in
https://github.com/occiware/OCCI-Studio
https://github.com/occiware/Docker-Studio
doc :

for OCCIware Studio v1 but still mostly valid https://fr.slideshare.net/mdutoo/eclipsecon-2016-occiware-a-cloud-api-to-rule-them-all

generate : right-click on .occie > ...
for doc, fill attributes descriptions

example :
openshift-occi-configurations
File > New > OCCI Studio > new OpenShift configuration file
smile-apps.openshift

File > New > Others... > OCCI Studio > OCCI Connector Project
````

### Doing the first example directly in OpenShift :

````
# setup :
install oc tool (OpenShift client) : copy ex. in your $HOME/bin the "oc" binary taken from the release archive, downloadable ex. at https://github.com/openshift/origin/releases/tag/v3.6.1
https://master.paas.smile.fr:8443
there copy the login command line, execute it :
oc login https://master.paas.smile.fr:8443 --token=k1JSZwtFdaqXxqM0GN-nEHS2YckvPzsSfDu3QqhtDd0
oc new-project occi-openshift
https://hawkular-metrics.paas.smile.fr/hawkular/metrics

# create a pod's deployment config : (NB. service = facade, pod = its hidden, **clonable** impl which encapsulates / bridges containerS)
oc run web --image=nginx --dry-run -o yaml
apiVersion: v1
kind: DeploymentConfig
metadata:
  creationTimestamp: null
  labels:
    run: web
  name: web
spec:
  replicas: 1
  selector:
    run: web
  strategy:
    resources: {}
  template:
    metadata:
      creationTimestamp: null
      labels:
        run: web
    spec:
      containers:
      - image: nginx
        name: web
        ports:
          - containerPort: 80
            name: web
        resources: {}
  test: false
  triggers: null
status:
  availableReplicas: 0
  latestVersion: 0
  observedGeneration: 0
  replicas: 0
  unavailableReplicas: 0
  updatedReplicas: 0

# create its service :
oc create service nodeport web --tcp=80:8000 --dry-run -o yaml
apiVersion: v1
kind: Service
metadata:
  creationTimestamp: null
  labels:
    app: web
  name: web
spec:
  ports:
  - name: 8000-80
    port: 8000
    protocol: TCP
    targetPort: 80
  selector:
    run: web
  type: NodePort
status:
  loadBalancer: {}

# check it's there :
oc get service web

or in a single conf file : (separated using ---, also supports list)
````
