package org.example;

import org.models.EventBroker;
import org.models.FootballCoach;
import org.models.FootballPlayer;

public class Main {
    public static void main(String[] args) {
        EventBroker broker = new EventBroker();
        FootballPlayer player = new FootballPlayer(broker, "jones");
        FootballCoach coach = new FootballCoach(broker);

        player.score();
        player.score();
        player.score();
    }
}