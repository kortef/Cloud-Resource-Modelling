#/bin/bash
while(true); do
        NFSUSED=`df -h | grep pcpcgateway | awk '{print $5}'`
        NFSUSED=${NFSUSED%"%"}
        gmetric --name "Percentage used of NFS" --value $NFSUSED --type int16 --units \%
        sleep 2;
done

