package org.models;

public abstract class Creature {
    protected Game game;

    public Creature(Game game) {
        this.game = game;
    }

    public abstract int getAttack();
    public abstract int getDefense();
}