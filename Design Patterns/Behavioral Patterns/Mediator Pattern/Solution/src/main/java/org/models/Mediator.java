package org.models;

import java.util.ArrayList;
import java.util.List;

public class Mediator {
    private List<Participant> participants = new ArrayList<>();

    public void addParticipant(Participant participant) {
        participants.add(participant);
    }

    public void broadcast(Participant sender, int value) {
        for (Participant participant : participants) {
            if (participant != sender) {
                participant.increaseValue(value);
            }
        }
    }
}
