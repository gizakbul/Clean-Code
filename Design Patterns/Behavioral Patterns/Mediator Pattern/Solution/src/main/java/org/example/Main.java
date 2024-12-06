package org.example;

import org.models.Mediator;
import org.models.Participant;

public class Main {
    public static void main(String[] args) {
        Mediator mediator = new Mediator();

        Participant participant1 = new Participant(mediator);
        Participant participant2 = new Participant(mediator);

        System.out.println("Initial values:");
        System.out.println("Participant 1: " + participant1.value);
        System.out.println("Participant 2: " + participant2.value);

        participant1.say(3);
        System.out.println("\nAfter Participant 1 says 3:");
        System.out.println("Participant 1: " + participant1.value);
        System.out.println("Participant 2: " + participant2.value);

        participant2.say(2);
        System.out.println("\nAfter Participant 2 says 2:");
        System.out.println("Participant 1: " + participant1.value);
        System.out.println("Participant 2: " + participant2.value);
    }
}