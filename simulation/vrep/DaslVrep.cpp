#include <iostream>
#include "DaslVrep.hpp"

#define MODEL "/home/chaki/stuff/vrep/V-REP_PRO_EDU_V3_1_0_64_Linux/models/robots/mobile/Quadricopter.ttm"
#define FLOOR "20mX20m_floor#"

/*********************************************************************/
//constructor
/*********************************************************************/
DaslVrep::DaslVrep(simxInt _xdim,simxInt _ydim) 
  : clientId(-1),xdim(_xdim),ydim(_ydim) {}

/*********************************************************************/
//connect to the simulator
/*********************************************************************/
simxInt DaslVrep::connect(simxChar *ipAddr,simxInt port)
{
  clientId = simxStart(ipAddr,port,true,true,2000,5);

  //compute floor dimensions and coordinates

  //get the floor object
  simxInt floor;
  simxGetObjectHandle(clientId,FLOOR,&floor,simx_opmode_oneshot_wait);
  //std::cout << "floor handle = " << floor << '\n';

  //get the floor center coordinate
  simxGetObjectPosition(clientId,floor,sim_handle_parent,floorCenter,simx_opmode_oneshot_wait);

  //std::cout << "floor coordinates are : (" << floorCenter[0] << "," 
  //<< floorCenter[1] << "," << floorCenter[2] << ")\n";

  simxGetObjectFloatParameter(clientId,floor,15,&minx,simx_opmode_oneshot_wait);
  //std::cout << "floor min x = " << minx << '\n';
  simxGetObjectFloatParameter(clientId,floor,18,&maxx,simx_opmode_oneshot_wait);
  //std::cout << "floor max x = " << maxx << '\n';

  simxGetObjectFloatParameter(clientId,floor,16,&miny,simx_opmode_oneshot_wait);
  //std::cout << "floor min y = " << miny << '\n';
  simxGetObjectFloatParameter(clientId,floor,19,&maxy,simx_opmode_oneshot_wait);
  //std::cout << "floor max y = " << maxy << '\n';

  return clientId;
}

/*********************************************************************/
//disconnect from the simulator
/*********************************************************************/
void DaslVrep::disconnect()
{
  simxFinish(clientId);
}

/*********************************************************************/
//create a node and return its handle. return -1 on failure.
/*********************************************************************/
simxInt DaslVrep::createNode()
{
  simxInt result;
  return (simxLoadModel(clientId,MODEL,0,&result,
                        simx_opmode_oneshot_wait) == simx_error_noerror) ? result : -1;
}

/*********************************************************************/
//destroy node with handle passed as argument. return 0 on success and
//1 on failure.
/*********************************************************************/
simxInt DaslVrep::destroyNode(const simxInt nodeId)
{
  //delete all children
  for(;;) {
    simxInt retVal = 0,childId = 0;
    retVal = simxGetObjectChild(clientId,nodeId,0,&childId,simx_opmode_oneshot_wait);
    if(retVal != simx_error_noerror) return 1;

    if(childId == -1) break;

    retVal = simxRemoveObject(clientId,childId,simx_opmode_oneshot_wait);
    if(retVal != simx_error_noerror) return 1;
  }

  return (simxRemoveObject(clientId,nodeId,simx_opmode_oneshot_wait) != simx_error_noerror);
}

/*********************************************************************/
//return the number of objects in the scene, -1 on failure
/*********************************************************************/
simxInt DaslVrep::getNumObjects()
{
  simxInt objCount = 0,*objHandles=0;
  return (simxGetObjects(clientId,sim_object_shape_type,&objCount,&objHandles,
                         simx_opmode_oneshot_wait) != simx_error_noerror) ? -1 : objCount;
}

/*********************************************************************/
//return ping time to server
/*********************************************************************/
simxInt DaslVrep::getPingTime()
{  
  simxInt pingTime = -1;
  simxGetPingTime(clientId,&pingTime);
  return pingTime;
}

/*********************************************************************/
//move node specified by nodeId instantaneoulsy to coordinates
//(x,y,z). return 0 on success and 1 on failure. this function should
//not be called while the simulation is running.
/*********************************************************************/
simxInt DaslVrep::placeNodeAt(simxInt nodeId,simxFloat x,simxFloat y,simxFloat z)
{
  //compute object coordinates
  simxFloat objCoord[3];

  objCoord[0] = floorCenter[0] + minx + x * (maxx - minx); 
  objCoord[1] = floorCenter[1] + miny + y * (maxy - miny); 
  objCoord[2] = floorCenter[2] + z;

  return simxSetObjectPosition(clientId,nodeId,sim_handle_parent,objCoord,
                               simx_opmode_oneshot_wait) != simx_error_noerror;
}

/*********************************************************************/
//end of file
/*********************************************************************/
