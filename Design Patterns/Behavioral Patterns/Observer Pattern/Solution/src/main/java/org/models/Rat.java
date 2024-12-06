package org.models;

import java.io.Closeable;
import java.io.IOException;

public class Rat implements Closeable {
    private Game game;
    public int attack = 1;

    public Rat(Game game) {
        this.game = game;
        game.addRat(this);
    }

    @Override
    public void close() throws IOException {
        game.removeRat(this);
    }

    public void setAttackValue(int totalRats) {
        this.attack = totalRats;
    }
}
