package org.models;

import java.util.ArrayList;
import java.util.List;

public class Game {
    private List<Rat> rats = new ArrayList<>();

    public void addRat(Rat rat) {
        rats.add(rat);
        updateRatsAttackValue();
    }

    public void removeRat(Rat rat) {
        rats.remove(rat);
        updateRatsAttackValue();
    }

    private void updateRatsAttackValue() {
        int totalRats = rats.size();
        for (Rat rat : rats) {
            rat.setAttackValue(totalRats);
        }
    }
}
