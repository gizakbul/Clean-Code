package org.models;

public class Participant {
    private Mediator mediator;
    public int value = 0;

    public Participant(Mediator mediator) {
        this.mediator = mediator;
        mediator.addParticipant(this);
    }

    public void say(int n) {
        mediator.broadcast(this, n);
    }

    public void increaseValue(int n) {
        value += n;
    }
}
