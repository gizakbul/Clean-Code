package org.example;

import org.models.Game;
import org.models.Rat;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        Game game = new Game();

        Rat rat1 = new Rat(game); // Rat 1 enters the game
        System.out.println("Rat 1 attack value: " + rat1.attack);

        Rat rat2 = new Rat(game); // Rat 2 enters the game
        System.out.println("Rat 1 attack value: " + rat1.attack);
        System.out.println("Rat 2 attack value: " + rat2.attack);

        rat1.close(); // Rat 1 dies
        System.out.println("Rat 2 attack value: " + rat2.attack);
    }
}