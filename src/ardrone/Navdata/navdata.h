#ifndef _NAVDATA_H_
#define _NAVDATA_H_

#include <ardrone_tool/Navdata/ardrone_navdata_client.h>

//-- variables used to interface with DMPL
typedef struct
{
  FLYING_STATE flying_state;  //-- the flying state
  int battery_level;
  int altitude;
  int nb_detected;            //-- number of tags detected
  double odo_x;               //-- distance traveled along X
  double odo_y;               //-- distance traveled along Y
  navdata_time_t ndtime;      //-- raw navdata time
  double recv_time;           //-- time last navdata received
  double psi;                 //-- latest psi (aka yaw) value (in milli-degrees)
  double init_psi;            //-- initial psi (aka yaw) value (in milli-degrees)
} DmplArdrone;

//-- declare interface variables
extern DmplArdrone dmplArdrone;

#endif // _NAVDATA_H_
