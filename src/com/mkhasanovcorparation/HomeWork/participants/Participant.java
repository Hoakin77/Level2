package com.mkhasanovcorparation.HomeWork.participants;

import com.mkhasanovcorparation.HomeWork.obstacle.Obstacle;

public interface Participant {
    int run();

    int jump();

    default boolean doIt(Obstacle obstacle){
        return  doAction(obstacle);
    }
    default boolean doAction(Obstacle obstacle){
        return  obstacle.passObstacleBy(this);
   }
}
