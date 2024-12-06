package org.example;

import org.models.Creature;
import org.models.Game;
import org.modifiers.DoubleAttackModifier;
import org.modifiers.IncreasedDefenseModifier;

public class Main {
    public static void main(String[] args) {
        Game game = new Game();
        Creature goblin = new Creature(game,
                "Strong Goblin", 2, 2);

        System.out.println(goblin);

        // modifiers can be piled up
        IncreasedDefenseModifier icm = new IncreasedDefenseModifier(game, goblin);

        try (DoubleAttackModifier dam
                     = new DoubleAttackModifier(game, goblin))
        {
            System.out.println(goblin);
        }

        System.out.println(goblin);
    }
}