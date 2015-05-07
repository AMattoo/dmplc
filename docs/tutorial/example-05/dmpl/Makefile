CFLAGS=-g -O3 -I$(DMPL_ROOT)/src -I$(VREP_ROOT)/programming/remoteApi \
	-I$(ACE_ROOT) -I$(MADARA_ROOT)/include -I$(GAMS_ROOT)/src -I$(DMPL_ROOT)/include
LIBS=$(MADARA_ROOT)/libMADARA.so $(ACE_ROOT)/lib/libACE.so \
	$(GAMS_ROOT)/lib/libGAMS.so -lpthread
DMPL=example-05.dmpl
SRC=$(patsubst %.dmpl,%.cpp,$(DMPL))
EXE=$(patsubst %.dmpl,%,$(DMPL)) example-05-analyzer

ifdef MZSRM_ROOT
CFLAGS += -I$(MZSRM_ROOT)/zsrmm
LIBS += $(MZSRM_ROOT)/zsrmm/lib/libzs.a
endif

#default grid size and map coordinates 
GRIDSIZE=10
TopY=2.25
LeftX=-2.25
BottomY=-2.25
RightX=2.25

#adaptation manager object files
AM_OBJS=dartam/Debug/adaptation_manager.o dartam/Debug/AdaptationPlanner.o

all: $(EXE) Makefile

example-05: example-05.cpp adaptation_manager.h $(AM_OBJS)
	g++ $(CFLAGS) -o $@ $^ $(LIBS)

%: %.cpp
	g++ $(CFLAGS) -o $@ $< $(LIBS)

$(AM_OBJS) :
	make -C dartam/Debug

example-05.cpp: example-05.dmpl example-05-AADL.dmpl $(DMPL_ROOT)/src/dmplc/dmplc
	dmplc -e -n 5 --DX $(GRIDSIZE) --DY $(GRIDSIZE) --DTopY $(TopY) --DBottomY $(BottomY) --DLeftX $(LeftX) --DRightX $(RightX) -g -o $@ $< example-05-AADL.dmpl

example-05-analyzer.cpp: example-05.dmpl $(DMPL_ROOT)/src/dmplc/dmplc $(DMPL_ROOT)/include/dmpl/LogAnalyzer.hpp
	dmplc -a -n 5 --DX $(GRIDSIZE) --DY $(GRIDSIZE) -o $@ $<

clean:
	make -C dartam/Debug clean
	rm -f $(EXE) $(SRC)