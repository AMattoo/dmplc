#!/bin/bash

# Copyright (c) 2015 Carnegie Mellon University. All Rights Reserved.
#
# Redistribution and use in source and binary forms, with or without
# modification, are permitted provided that the following conditions
# are met:
#
# 1. Redistributions of source code must retain the above copyright
# notice, this list of conditions and the following acknowledgments
# and disclaimers.
#
# 2. Redistributions in binary form must reproduce the above
# copyright notice, this list of conditions and the following
# disclaimer in the documentation and/or other materials provided
# with the distribution.
#
# 3. The names "Carnegie Mellon University," "SEI" and/or "Software
# Engineering Institute" shall not be used to endorse or promote
# products derived from this software without prior written
# permission. For written permission, please contact
# permission@sei.cmu.edu.
#
# 4. Products derived from this software may not be called "SEI" nor
# may "SEI" appear in their names without prior written permission of
# permission@sei.cmu.edu.
#
# 5. Redistributions of any form whatsoever must retain the following
# acknowledgment:
#
# This material is based upon work funded and supported by the
# Department of Defense under Contract No. FA8721-05-C-0003 with
# Carnegie Mellon University for the operation of the Software
# Engineering Institute, a federally funded research and development
# center.
#
# Any opinions, findings and conclusions or recommendations expressed
# in this material are those of the author(s) and do not necessarily
# reflect the views of the United States Department of Defense.
#
# NO WARRANTY. THIS CARNEGIE MELLON UNIVERSITY AND SOFTWARE
# ENGINEERING INSTITUTE MATERIAL IS FURNISHED ON AN "AS-IS"
# BASIS. CARNEGIE MELLON UNIVERSITY MAKES NO WARRANTIES OF ANY KIND,
# EITHER EXPRESSED OR IMPLIED, AS TO ANY MATTER INCLUDING, BUT NOT
# LIMITED TO, WARRANTY OF FITNESS FOR PURPOSE OR MERCHANTABILITY,
# EXCLUSIVITY, OR RESULTS OBTAINED FROM USE OF THE MATERIAL. CARNEGIE
# MELLON UNIVERSITY DOES NOT MAKE ANY WARRANTY OF ANY KIND WITH
# RESPECT TO FREEDOM FROM PATENT, TRADEMARK, OR COPYRIGHT
# INFRINGEMENT.
#
# This material has been approved for public release and unlimited
# distribution.
#
# DM-0002494

DEBUG=0

function usage {
    echo "Usage : dmpl-sim.sh [-args] file.mission [output.log]"
    echo "  Optional Arguments:"
    echo "    -b | --force-build  Fully rebuild the cpp file, and recompile it"
    echo "    -B | --build-only   Only build the software, don't run the simulation"
    echo "    -d | --debug        Run with debug options (uses and dmplc --debug, and gdb)"
    echo "    -h | --headless     Run V-REP in headless mode"
    echo '    -p | --platform $P  Pass $P as the --platform option to the executable'
    echo "    -r | --realtime     Run V-REP in realtime mode"
}

#flags
HEADLESS=0
REALTIME=0
FORCEBUILD=0
BUILDONLY=0

PLATFORM=vrep::::0.1

argc=0

#get flags
while true; do
  case "$1" in
  -d|--debug)
    DEBUG=1
    ;;
  -b|--force-build)
    FORCEBUILD=1
    ;;
  -B|--build-only)
    BUILDONLY=1
    ;;
  -h|--headless)
    HEADLESS=1
    ;;
  -r|--realtime)
    REALTIME=1
    ;;
  -p|--platform)
    shift
    PLATFORM="$1"
    ;;
  "")
    break
    ;;
  *)
    case "$argc" in
    0)
      MISSION="$1"
      ;;
    1)
      OUTLOG="$1"
      ;;
    *)
      echo Unexpected argument: $1
      usage
      exit 1
    esac
    argc=$((argc+1))
    ;;
  esac
  shift
done

GDB=""
[ "$DEBUG" -eq 1 ] && GDB="gdb -ex=r --args"

#get the directory where this script is located
SCDIR=$(dirname $(realpath $0))

if [ -z "$MISSION" ]; then
    echo No .mission file specified
    usage
    exit 1
fi

. $MISSION

VREP_GRACEFUL_EXIT=0

status_file=""

function cleanup {
    echo "Cleaning up ..."
    [ -n "$status_file" ] && rm $status_file

    bin_count=`ps --no-headers -C "$BIN" | wc -l`

    #kill nodes and VREP
    killall $BIN vrep vrep.sh

    sleep 2

    killall gdb

    sleep 2

    killall -9 gdb $BIN vrep vrep.sh
    
    #restore the VREP system/settings.dat
    cp $SDF.saved.mcda-vrep $SDF

    echo $bin_count  $NODENUM $VREP_GRACEFUL_EXIT
    if [ "$bin_count" -eq $NODENUM ] && [ "$VREP_GRACEFUL_EXIT" -ge 1 ]; then
      #collate output log
      if [ -n "$OUTLOG" ]; then
        $SCDIR/expect_merge.py $EXPECT_LOG_PERIOD $OUTDIR/expect*.log > $OUTLOG
      fi
    else
      echo "Something crashed; aborting logging"
      if [ -n "$OUTLOG" ]; then
        rm $OUTLOG
      fi
      exit 1
    fi
    
    #all done
    exit 0
}

trap "cleanup" SIGINT SIGTERM SIGHUP

INIT_PORT="19905"

if [ "$REALTIME" -eq 1 ]; then
  MAPFILE=$SCDIR/../../docs/tutorial/dart-${MAPNAME}-rt.ttt
else
  MAPFILE=$SCDIR/../../docs/tutorial/dart-${MAPNAME}.ttt
fi

if [ ! -e "$MAPFILE" ]; then
    echo "Map file $MAPFILE does not exist!!"
    exit 1
fi

#compile tutorial 2

MAPSIZE=`echo $MAPNAME | cut -f1 -d'-'`

if [ "$MAPSIZE" == "small" ]; then
    TopY=2.25
    LeftX=-2.25
    BottomY=-2.25
    RightX=2.25
elif [ "$MAPSIZE" == "large" ]; then
    TopY=13
    LeftX=-12.5
    BottomY=-6
    RightX=6.5
fi

CPP_FILE=${MISSION}_${BIN}.cpp
DMPLC_FLAGS="-g -n $NODENUM --DX $GRIDSIZE --DY $GRIDSIZE --DTopY $TopY --DBottomY $BottomY --DLeftX $LeftX --DRightX $RightX"
[ "$DEBUG" -eq 1 ] && DMPLC_FLAGS="$DMPLC_FLAGS --debug"
[ -n "$OUTLOG" ] && DMPLC_FLAGS="$DMPLC_FLAGS -e"

for file in `which dmplc` $DMPL $MISSION; do
if [ $FORCEBUILD -eq 1 ] || [ $file -nt $CPP_FILE ]; then
$GDB dmplc $DMPLC_FLAGS -o $CPP_FILE $DMPL
break
fi
done
if [ $CPP_FILE -nt ${BIN} ]; then
CFLAGS="-g -Og -std=c++11 -I$DMPL_ROOT/src -I$VREP_ROOT/programming/remoteApi -I$ACE_ROOT -I$MADARA_ROOT/include -I$GAMS_ROOT/src -I$DMPL_ROOT/include"
LIBS="$LIBS $MADARA_ROOT/libMADARA.so $ACE_ROOT/lib/libACE.so $GAMS_ROOT/lib/libGAMS.so -lpthread"
g++ $CFLAGS -o $BIN $CPP_FILE $LIBS
fi

[ "$BUILDONLY" -eq 1 ] && exit 0

#create the output directory and get its realpath
rm -fr $OUTDIR; mkdir $OUTDIR
OUTDIR=$(realpath $OUTDIR)

#save old and create new VREP remoteApiConnections.txt file
RAC=$VREP_ROOT/remoteApiConnections.txt
if [ -e $RAC ]; then
    rm -f $RAC.saved.mcda-vrep
    mv $RAC $RAC.saved.mcda-vrep
fi
touch $RAC
echo "portIndex1_port                 = 19001" >> $RAC
echo "portIndex1_debug                = false" >> $RAC
echo "portIndex1_syncSimTrigger       = true" >> $RAC
echo "" >> $RAC
PORT=$INIT_PORT
for i in `seq 2 $((NODENUM + 1))`; do 
    echo "portIndex${i}_port                 = $PORT" >> $RAC
    echo "portIndex${i}_debug                = false" >> $RAC
    echo "portIndex${i}_syncSimTrigger       = true" >> $RAC
    echo "" >> $RAC
    PORT=$(expr $PORT + 1)
done

#cat $RAC

#save the VREP system/settings.dat
SDF=$VREP_ROOT/system/settings.dat
cp $SDF $SDF.saved.mcda-vrep
#start vrep
echo "starting VREP .. output is in $OUTDIR/vrep.out ..."

status_file=`tempfile`

function run_vrep()
{
  cd $VREP_ROOT
  if [ "$HEADLESS" -eq 1 ]; then
    xvfb-run --auto-servernum --server-num=1 -s "-screen 0 640x480x24" ./vrep.sh "-g$MISSION_TIME" "-g$1" -h -q "-b$DMPL_ROOT/src/vrep/timer.lua" $MAPFILE &> $OUTDIR/vrep.out
  else
    ./vrep.sh "-g$MISSION_TIME" "-g$1" -q "-b$DMPL_ROOT/src/vrep/timer.lua" $MAPFILE &> $OUTDIR/vrep.out
  fi
}

(run_vrep "$status_file" &)

sleep 1

SAFETY_TIME=30
START_TIME=`date +%s`
while [ "`grep STARTED $status_file | wc -l`" -lt 1 ]; do
  vrep_count=`ps --no-headers -C "vrep" | wc -l`
  cur_time=`date +%s`
  if [ $((START_TIME + SAFETY_TIME)) -lt "$cur_time" ]; then
    echo Time limit exceeded\; crash assumed
    cleanup
    exit 1
  fi
  if [ "$vrep_count" -lt 1 ]; then
    echo VREP crashed!
    cleanup
    exit 1
  fi
  sleep 0.2
done

cat $status_file

#restore old VREP remoteApiConnections.txt file
mv $RAC.saved.mcda-vrep $RAC

#start the nodes
NUMCPU=$(grep -c ^processor /proc/cpuinfo)
for x in `seq 1 $((NODENUM - 1))`; do
  echo $x
  args_var=ARGS_$x
  cpu_id=$(expr $x % $NUMCPU)
  args="$(eval echo \$$args_var)"
  ELOG=""
  [ -n "$OUTLOG" ] && ELOG="-e $OUTDIR/expect${0}.log"
  taskset -c ${cpu_id} $GDB ./$BIN $ELOG --platform $PLATFORM --id $x $args &> $OUTDIR/node${x}.out &
done
ELOG=""
[ -n "$OUTLOG" ] && ELOG="-e $OUTDIR/expect0.log"
#gdb --args $GDB ./$BIN $ELOG --platform $PLATFORM --id 0 $ARGS_0 # &> $OUTDIR/node0.out &
taskset -c 0 $GDB ./$BIN $ELOG --platform $PLATFORM --id 0 $ARGS_0 &> $OUTDIR/node0.out &

printf "press Ctrl-C to terminate the simulation ..."

if [ "$DEBUG" -eq 1 ]; then
  sleep 5
else
  sleep 2
fi

( cd $SCDIR; ./startSim.py )

SAFETY_TIME=240
START_TIME=`date +%s`
while [ "`grep COMPLETE $status_file | wc -l`" -lt 1 ]; do
  bin_count=`ps --no-headers -C "$BIN" | wc -l`
  vrep_count=`ps --no-headers -C "vrep" | wc -l`
  cur_time=`date +%s`
  if [ $((START_TIME + SAFETY_TIME)) -lt "$cur_time" ]; then
    echo Time limit exceeded\; crash assumed
    cleanup
    exit 1
  fi
  if [ "$bin_count" -ne $NODENUM ]; then
    echo A controller crashed!
    cleanup
    exit 1
  fi
  if [ "$vrep_count" -lt 1 ]; then
    echo VREP crashed!
    cleanup
    exit 1
  fi
  sleep 0.2
done

VREP_GRACEFUL_EXIT=1
cleanup
