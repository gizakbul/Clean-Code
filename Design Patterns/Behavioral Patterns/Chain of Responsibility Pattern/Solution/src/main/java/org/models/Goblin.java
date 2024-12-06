package org.models;

public class Goblin extends Creature {
    public Goblin(Game game) {
        super(game);
    }

    @Override
    public int getAttack() {
        int baseAttack = 1;
        for (Creature creature : game.creatures) {
            if (creature instanceof GoblinKing && creature != this) {
                baseAttack += 1;
            }
        }
        return baseAttack;
    }

    @Override
    public int getDefense() {
        int baseDefense = 1;
        for (Creature creature : game.creatures) {
            if (creature instanceof Goblin && creature != this) {
                baseDefense += 1;
            }
        }
        return baseDefense;
    }
}