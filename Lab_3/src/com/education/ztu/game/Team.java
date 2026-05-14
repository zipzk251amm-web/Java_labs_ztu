package com.education.ztu.game;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Team<T extends Participant> {
    private String name;
    private List<T> participants = new ArrayList<>();

    public Team(String name) {
        this.name = name;
    }

    public void addNewParticipant(T participant) {
        participants.add(participant);
        System.out.println("To the team " + name + " was added participant " + participant.getName());
    }

    public void playWith(Team<T> team) {
        Random random = new Random();
        int i = random.nextInt(2);
        String winnerName = (i == 0) ? this.name : team.name;
        System.out.println("The team " + winnerName + " is winner!");
    }

    public Team<T> deepClone() {
        Team<T> clonedTeam = new Team<>(this.name + "_copy");
        for (T p : this.participants) {
            clonedTeam.addNewParticipant(p);
        }
        return clonedTeam;
    }

    public String getName() { return name; }
    public List<T> getParticipants() { return participants; }
    public void setName(String name) { this.name = name; }
    public void setParticipants(List<T> participants) { this.participants = participants; }
}