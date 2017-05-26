#/bin/bash

DIRS=`ls`

for DIR in $DIRS; do
	rm -rf $DIR/bin/*
done
