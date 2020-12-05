package com.mkhasanovcorparation;

import com.mkhasanovcorparation.HomeWork.obstacle.Obstacle;
import com.mkhasanovcorparation.HomeWork.participants.Participant;

import java.util.LinkedList;
import java.util.List;

public class Competition {
    private Obstacle[] obstacles;
    private Participant[] participants;
    private final String competitionTitle;

    private final List<Participant> LastWinners = new LinkedList<>();

    public Competition(String competitionTitle) {
        this.competitionTitle = competitionTitle;
    }

    public void setObstacles(Obstacle... obstacles) {
        this.obstacles = obstacles;
    }

    public void setParticipants(Participant... participants) {
        this.participants = participants;
    }
    public void startCompetition(){
        System.out.println("Начало соревнования " + competitionTitle);
        LastWinners.clear();

        for (Participant participant : participants){
            boolean success = passAllObstacles(participant);
            if (!success) {
                System.out.println("Участник " + participant + " покинул испытание");
            } else {
                    LastWinners.add(participant);
                }
            }
        }

    public List<Participant>getLastWinners(){
        return LastWinners;
    }
    private boolean passAllObstacles(Participant participant){
        for(Obstacle obstacle : obstacles) {
       //     if (!participant.doIt(obstacle)) {
      //            return false;
            if ( !participant.doIt(obstacle) ) {
                return false;
            }
            System.out.println();
        }
        return true;
    }
}

