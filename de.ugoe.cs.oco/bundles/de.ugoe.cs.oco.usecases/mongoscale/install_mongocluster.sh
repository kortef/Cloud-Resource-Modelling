#!/bin/bash

rm roles.zip
zip -r roles.zip roles/
cfy blueprints upload mongodbcluster_instantiated_exploded.yaml -b mongodbcluster
cfy deployments create mongodbcluster -b mongodbcluster
cfy executions start -d mongodbcluster install
