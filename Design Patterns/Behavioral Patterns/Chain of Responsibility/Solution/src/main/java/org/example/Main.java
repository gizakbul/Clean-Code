package org.example;

import org.models.Game;
import org.models.Goblin;
import org.models.GoblinKing;

public class Main {
    public static void main(String[] args) {
        Game game = new Game();

        Goblin goblin1 = new Goblin(game);
        Goblin goblin2 = new Goblin(game);
        Goblin goblin3 = new Goblin(game);
        GoblinKing goblinKing = new GoblinKing(game);

        game.creatures.add(goblin1);
        game.creatures.add(goblin2);
        game.creatures.add(goblin3);

        System.out.println("Goblin 1 Attack: " + goblin1.getAttack()); // Expected: 1
        System.out.println("Goblin 1 Defense: " + goblin1.getDefense()); // Expected: 3

        game.creatures.add(goblinKing);

        System.out.println("Goblin 1 Attack after King: " + goblin1.getAttack()); // Expected: 2
        System.out.println("Goblin 1 Defense after King: " + goblin1.getDefense()); // Expected: 3

        System.out.println("Goblin King Attack: " + goblinKing.getAttack()); // Expected: 3
        System.out.println("Goblin King Defense: " + goblinKing.getDefense()); // Expected: 3
    }
}