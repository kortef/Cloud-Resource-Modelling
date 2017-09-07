#!/bin/bash

curl -v -X POST -d '{ "action": "http://oco.cs.ugoe.de/occi/configmanagement/ansiblerole/action#detachrole", "attributes": {} }' -H 'Content-Type: application/json' -H 'accept: application/json' http://localhost:8080/ansiblerole/urn:uuid:68a5140f-c825-4149-beab-fad4bc87e3d1?action=detachrole

