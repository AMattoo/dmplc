#!/bin/bash

(cd $DMPL_ROOT/docs/tutorial && dmpl-verif.sh example-01.verif)
(cd $DMPL_ROOT/docs/tutorial && dmpl-verif.sh example-01-6x6.verif)
(cd $DMPL_ROOT/docs/tutorial && dmpl-verif.sh example-01.bug1.verif)
(cd $DMPL_ROOT/docs/tutorial && dmpl-verif.sh example-01.bug2.verif)
#(cd $DMPL_ROOT/docs/tutorial && dmpl-verif.sh example-02.verif)
(cd $DMPL_ROOT/docs/tutorial && dmpl-verif.sh example-02-6x6.verif)
(cd $DMPL_ROOT/docs/tutorial && dmpl-verif.sh example-02.bug1.verif)
#(cd $DMPL_ROOT/docs/tutorial && dmpl-verif.sh example-03.verif)
#(cd $DMPL_ROOT/docs/tutorial && dmpl-verif.sh example-03-6x6.verif)
(cd $DMPL_ROOT/docs/tutorial && dmpl-verif.sh example-04.verif)
(cd $DMPL_ROOT/docs/tutorial && dmpl-verif.sh example-04-6x6.verif)
(cd $DMPL_ROOT/docs/tutorial/example-05/dmpl && dmpl-verif.sh example-05.verif)
(cd $DMPL_ROOT/docs/tutorial/example-05/dmpl && dmpl-verif.sh example-05.bug1.verif)
