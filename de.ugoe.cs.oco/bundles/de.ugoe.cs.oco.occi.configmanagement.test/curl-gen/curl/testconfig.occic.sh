#! /bin/bash
#
# Generated at Fri Sep 08 16:23:06 CEST 2017 from platform:/resource/de.ugoe.cs.oco.occi.configmanagement.test/testconfig.occic by org.eclipse.cmf.occi.core.gen.curl
#

OCCI_SERVER_URL=$1
CURL_OPTS="-s -v -i"

#curl $CURL_OPTS -X PUT $OCCI_SERVER_URL/ansiblerole/urn:uuid:68a5140f-c825-4149-beab-fad4bc87e3d1 -H 'Content-Type: text/occi' -H 'Category: ansiblerole; scheme="http://oco.cs.ugoe.de/occi/configmanagement#"; class="kind";' -H 'X-OCCI-Attribute: occi.core.id="urn:uuid:68a5140f-c825-4149-beab-fad4bc87e3d1"' -H 'X-OCCI-Attribute: occi.core.title="testrole"' -H 'X-OCCI-Attribute: occi.ansible.rolename="test"' -H 'X-OCCI-Attribute: occi.core.summary=""'

#read -p "Press enter..."
#curl $CURL_OPTS -X PUT $OCCI_SERVER_URL/compute/urn:uuid:c4b09d4f-9f60-4804-a2f3-335230a752f0 -H 'Content-Type: text/occi' -H 'Category: compute; scheme="http://schemas.ogf.org/occi/infrastructure#"; class="kind";' -H 'X-OCCI-Attribute: occi.core.id="urn:uuid:c4b09d4f-9f60-4804-a2f3-335230a752f0"' -H 'X-OCCI-Attribute: occi.core.title="vm1"'

#read -p "Press enter..."
#curl $CURL_OPTS -X PUT $OCCI_SERVER_URL/network/urn:uuid:47bdab51-6851-43c3-8b5f-986ae64b5ba7 -H 'Content-Type: text/occi' -H 'Category: network; scheme="http://schemas.ogf.org/occi/infrastructure#"; class="kind";' -H 'X-OCCI-Attribute: occi.core.id="urn:uuid:47bdab51-6851-43c3-8b5f-986ae64b5ba7"' -H 'X-OCCI-Attribute: occi.core.title="network"'

#read -p "Press enter..."
#curl $CURL_OPTS -X PUT $OCCI_SERVER_URL/managedcomponent/urn:uuid:33f24000-10a0-409c-8a22-0b58c70b3f3b -H 'Content-Type: text/occi' -H 'Category: managedcomponent; scheme="http://oco.cs.ugoe.de/occi/configmanagement#"; class="kind";' -H 'X-OCCI-Attribute: occi.core.id="urn:uuid:33f24000-10a0-409c-8a22-0b58c70b3f3b"' -H 'X-OCCI-Attribute: occi.core.title="testcomponent"'

#read -p "Press enter..."
#curl $CURL_OPTS -X PUT $OCCI_SERVER_URL/componenthosting/urn:uuid:1bdaf8af-5d3e-4f4f-a889-0200c0f52207 -H 'Content-Type: text/occi' -H 'Category: componenthosting; scheme="http://oco.cs.ugoe.de/occi/configmanagement#"; class="kind";' -H 'X-OCCI-Attribute: occi.core.id="urn:uuid:1bdaf8af-5d3e-4f4f-a889-0200c0f52207"' -H 'X-OCCI-Attribute: occi.core.title="link1"' -H 'X-OCCI-Attribute: occi.core.source="/managedcomponent/urn:uuid:33f24000-10a0-409c-8a22-0b58c70b3f3b", occi.core.target="/compute/urn:uuid:c4b09d4f-9f60-4804-a2f3-335230a752f0"'

#read -p "Press enter..."
#curl $CURL_OPTS -X PUT $OCCI_SERVER_URL/networkinterface/urn:uuid:cc3942c6-be31-47cc-bb1c-5ac2efa94109 -H 'Content-Type: text/occi' -H 'Category: networkinterface; scheme="http://schemas.ogf.org/occi/infrastructure#"; class="kind";' -H 'X-OCCI-Attribute: occi.core.id="urn:uuid:cc3942c6-be31-47cc-bb1c-5ac2efa94109"' -H 'X-OCCI-Attribute: occi.core.title="networklink"' -H 'X-OCCI-Attribute: occi.core.source="/compute/urn:uuid:c4b09d4f-9f60-4804-a2f3-335230a752f0", occi.core.target="/network/urn:uuid:47bdab51-6851-43c3-8b5f-986ae64b5ba7"' #-H 'X-OCCI-Attribute: occi.networkinterface.address="192.168.35.23"'

#read -p "Press enter..."
#curl $CURL_OPTS -X POST $OCCI_SERVER_URL/networkinterface/urn:uuid:cc3942c6-be31-47cc-bb1c-5ac2efa94109 -H 'Content-Type: text/occi' -H 'Category: networkinterface; scheme="http://schemas.ogf.org/occi/infrastructure#"; class="kind", ipnetworkinterface; scheme="http://schemas.ogf.org/occi/infrastructure#"; class="mixin";'

read -p "Press enter..."
curl $CURL_OPTS -X PUT $OCCI_SERVER_URL/roleattachment/urn:uuid:c0992092-8da2-4b46-9478-ad6391d56652 -H 'Content-Type: text/occi' -H 'Category: roleattachment; scheme="http://oco.cs.ugoe.de/occi/configmanagement#"; class="kind";' -H 'X-OCCI-Attribute: occi.core.id="urn:uuid:c0992092-8da2-4b46-9478-ad6391d56652"' -H 'X-OCCI-Attribute: occi.core.title="attachment"' -H 'X-OCCI-Attribute: occi.ansible.user="ubuntu"' -H 'X-OCCI-Attribute: occi.core.source="/ansiblerole/urn:uuid:68a5140f-c825-4149-beab-fad4bc87e3d1", occi.core.target="/managedcomponent/urn:uuid:33f24000-10a0-409c-8a22-0b58c70b3f3b"'





