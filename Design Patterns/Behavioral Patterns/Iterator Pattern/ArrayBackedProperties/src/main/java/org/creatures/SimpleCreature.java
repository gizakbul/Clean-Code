package org.creatures;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class SimpleCreature {
    private int strength, agility, intelligence;

    public int max()
    {
        return Math.max(strength,
                Math.max(agility, intelligence));
    }

    public int sum()
    {
        return strength+agility+intelligence;
    }

    public double average()
    {
        return sum() / 3.0;
    }
}
