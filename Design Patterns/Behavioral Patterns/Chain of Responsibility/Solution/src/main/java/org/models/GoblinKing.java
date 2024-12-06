package org.models;

public class GoblinKing extends Goblin {
    public GoblinKing(Game game) {
        super(game);
    }

    @Override
    public int getAttack() {
        return 3;
    }

    @Override
    public int getDefense() {
        return 3;
    }
}