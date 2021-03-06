A brief description of examples:
-------------------------------

example-01: A simple example demonstrating the synchronous collision
avoidance algorithm. Three nodes, each starting from some specified
initial location and moving to a specified final location. They use
the collision avoidance protocol.

example-01.bug1 and example-02.bug2: Same as example-01 but with bugs
introduced in the collision avoidance protocol.

example-01-ag: The scenario is the same as example-01 but the nodes
use a version of synchronous collision avoidance (proposed by Arie)
where they share only the locations that are being locked or requested
instead of a 2D "lock" array of all possible cells.

example-01-ag-await: Similar to example-01-ag but uses AWAIT
statements instead of EXISTS_HIGHER and EXISTS_LOWER to enable
parameterized verification.

example-01-pipelined: The scenario is the same as example-01 but we
are developing this to motivate and demonstrate applicability of
pipelined ZSRM scheduling.

example-01-ranger: The scenario is the same as example-01 but we are
developing this to explore simultaneous localization and mapping
(SLAM).

example-01-ag: The scenario is the same as example-01 but is used to
demonstrate SMC+Hybrid verification. As such it interacts with the
platform by first calling UPDATE_SETPOINT() and then repeatedly
calling GRID_MOVE().

example-02: An example demonstrating synchronous collision with
formation. It has five nodes in tight formation -- one (leader) in the
center of a square and the remaining four (followers) at the four
corners. All nodes execute a collision avoidance thread. They also
execute a waypoint thread. The leader's waypoint thread computes the
next waypoint using the same path planning algorithm as in
example-01. The leader also broadcasts its next waypoint to the
followers via shared variables, which is used by each follower to
determine its own next waypoint relative to that of the leader.

example-02.bug1: Same as example-02 but with a bug introduced in the
collision avoidance protocol.

example-02-expect: Same as example-02 but used to test expect
specifications, log generation, and log analysis.

example-03: This is similar to example-02 but has 9 nodes moving in a
loose 3x3 grid formation -- one (leader) in the center of the grid and
the remaining eight (followers) surrounding it on all sides. All nodes
execute a collision avoidance thread. They also execute a waypoint
thread. The leader's waypoint thread computes the next waypoint using
the same path planning algorithm as in example-01. The leader also
broadcasts its next waypoint to the followers via shared variables,
which is used by each follower to determine its own next waypoint
relative to that of the leader.

example-04: This is similar to example-03 but the nodes move in a
tight formation instead. They also use a more aggressive collision
avoidance protocol that relies on relative speeds of the nodes in
addition to locking. Each cell now has four locks (one for each
direction of inward movement) instead of one. When a node starts to
leave a cell, it unlocks (opens the door if you will) in the direction
behind it, allowing other nodes to move in. Note that if the other
node moves in too quickly, a collision could still happen (hence the
assumption about relative speed). Unlike all the previous versions of
collision avoidance, we are unable to verify this protocol correct
using software model checking only.

example-09: This is like example-02 but we have two groups of nodes,
each with one leader and four protectors. The leaders also act as
coordinators. The idea is that each group performs collision avoidance
within itself, while the coordinators ensures that the groups do not
encroach on each other's spaces. This is achieved as follows: the
leader with the lower id stops as soon as its finds itself within a
certain distance of the other leader. This means that no group knows
the exact location of the members of the other group, only the general
area they are in. One group moves left to right. The other moves top
to bottom. Through this example, we are trying to explore "group-based
access control (GBAC) of shared variables".

example-09a: Like example-09 but group 1 starts from the bottom left
and move in a zig-zag manner to the middle right. Group 2 starts from
the bottom right and move in a zig-zag manner to the middle left. They
cross each other along the way. The leader with the lower id stops as
soon as it is close to the other leader, as in example-09. In
addition, the leader with higher id moves away from the other leader,
and toward the target, suspending its zig-zag motion temporarily as
long as it is within a certain distance of the other leader. This is
needed because in this scenarion, we would get a collision between the
groups if the leader with the higher id just kept going.

example-09b: Like example-09a but after reaching the midpoint, the
groups continue on to their final destinations which are on the same
side (left/right) of the map as their starting point, but on the top
edge of the map. Thus, the path of the two groups intersect in two
places, once before the midpoint, and once after.

example-09c: Like example-09b but after reaching the midpoint, the
groups first synchronize before continuing on to their final
destinations. Thus, the group reaching the midpoint first (usually the
one whose coordinator has the higher id) waits for the other to reach
its midpoint, before continuing on to its final destination.

example-09c-nolock: Like example-09c but uses two variables instead of
the "lock" array for collision avoidance. Should lead to faster
movement.

examples-09d: Like example-09 but region variables are accessed by the
asynchronous WAYPOINT thread and a (local) proximity detector flag is
computed. Only this flag is read by the synchronous
COLLISION_AVOIDANCE thread. This means that the only group variable
accessed by the synchronous thread is "lock" which means that each
team only synchronizes within itself, not with nodes from another
team.

examples-09e: Like example-09c but region variables are accessed by
the asynchronous WAYPOINT thread and a (local) proximity detector flag
is computed. Only this flag is read by the synchronous
COLLISION_AVOIDANCE thread. This means that the only group variable
accessed by the synchronous thread is "lock" which means that each
team only synchronizes within itself, not with nodes from another
team.

example-10: This is like example-09 but we have three groups instead
of 2, to further demonstrate concepts in GBAC, e.g., how groups can
overlap.

example-11: An example with one leader followed by a sequence of
followers in platoon formation. Used to demonstrate advantages of
pipelined ZSRM.

example-12: An example with one pursuer and one evader. We are
developing this for the SMC LENS.

example-12a: Like example-12 but instead of a safety zone we have a
chase timeout. The evader wins if the timeout expires without the
pursuer getting within range.

example-12b: Like example-12a but both nodes start in the middle of
the grid with random initial locations and the evader always moves
away from the pursuer.

example-12c: Like example-12b but the slowdown is applied uniformly to
both evader and pursuer.

example-12d: Like example-12c but the nodes move diagonally.

example-12d-3D: Like example-12d but the nodes move in 3D.

example-13: A very simple example with one node moving diagonally from
(0,0) to (9,9). Used for the tutorial.

example-13b: Like example-13 but demonstrates the use of constants,
PRINT(), external functions and internal functions.

example-13c: Like example-13b but the initial and final positions of
the node are now inputs so they can be controlled more easily via the
mission file.

example-13d: Like example-13c but we added some heavy computation to
the MOVER thread to show the bad effect of deadline misses.

example-13e: This example has four nodes moving from one side of the
grid to another. They take turns to move, thus avoiding
collision, using a global variable to coordinate this movement.

example-13f: Like example-13e but uses a collision avoidance protocol
to allow simultaneous movement while avoiding collisions.

example-13g: Used to demonstrate functional verification. Adapted from
example-01-ag.dmpl.

example-14: Based on example-01 to demonstrate platooning.

example-14-dag: Based on example-14 but used to demonstrate
DAG-scheduling. Two key differences with example-14 are: (i) each node
moves immediately to the boundary between current and next cells; (ii)
once it reaches the boundary it releases the lock to the current cell;
(iii) it then waits for the lock on the next cell before moving into
it.

example-15: Based on example-02 to demonstrate DMPL/AADL integration
at HILT'16.

Subdirectories:
--------------

example-05: The self-adaptation example with 5 nodes (node 0 is
leader, others are protectors) moving in formation from an initial
safe region through a hazardous region and into a safe end region. The
mission succeeds if the leader reaches the end point within a
specified mission time, and without getting exposed to some specified
hazard level. The nodes can switch formation (loose <--> tight) to
achieve different tradeoff points between speed and protection:

loose -> fast but low protection
tight -> slow but high protection

The leader executes an adaptation algorithm (implemented by creating
MDPs and solving them using PRISM to compute optimal strategies). All
nodes execute the synchronous collision avoidance algorithm.

example-05b: Same as example-05 but uses an adaptation manager based
on dynamic stochastic programming. This is newer work being done on
proactive self-adaptation.

example-05c: This is the new proactive self-adaptation scenario that
has two tactics (change formation and change heights) and that provide
different utilities in terms of detecting objects vs. protecting the
leader.

example-06: TBD

example-07: Scenarios inspired by movable tiles that can attach to
each other via magnets and create structures. See
example-07/dmpl/README.txt for more details.

example-08: Exploring versions of the collision avoidance protocol
where nodes exchange and use timestamps to avoid collisions. This is
more aggressive than the conservative protocol (e.g., in example-01)
but makes assumptions about the maximum and minimum times needed by a
node to enter or leave a cell. These assumptions must be discharged
separately. Also, this protocol cannot be verified by software model
checking alone. The situation is similar to example-04, except that in
the case of example-4, the assumption was about "relative speeds" of
nodes. See example-08/dmpl/README.txt for more details.

bud: Scenarios being developed by Bud. See bud/README.txt for more
details.

safe-tugs: Scenarios based on safe tugs. See safe-tugs/README.txt for
more details.

