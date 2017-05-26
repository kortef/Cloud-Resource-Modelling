### amroc_testrun.qsub ###

#!/bin/bash

#BSUB -q mpi
#BSUB -n 4
#BSUB -R span[hosts=1]

module load intel-mpi

cd $HOME/amroc/vtf
source ac/paths.sh gnu-opt-mpi
hostname
echo $LD_LIBRARY_PATH
cd gnu-opt-mpi
../amroc/testrun_lbm.sh -r 4
