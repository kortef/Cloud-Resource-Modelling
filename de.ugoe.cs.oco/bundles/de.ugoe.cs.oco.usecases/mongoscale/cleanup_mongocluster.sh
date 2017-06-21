#!/bin/bash

cfy executions start -d mongodbcluster uninstall
DONE=false;
while (! $DONE); do
	DONE=true;
	STATI=`cfy executions list | grep mongodbcluster | grep uninstall | awk '{print $8}'`
	for STATUS in $STATI; do
		echo $STATUS
		if [ ! "$STATUS"="terminated" ]; then
			DONE=false;
		fi
	done
done
cfy deployments delete mongodbcluster
cfy blueprints delete mongodbcluster
