package org.models;

import org.interfaces.IHotDrink;

public class Coffee implements IHotDrink {
    @Override
    public void consume()
    {
        System.out.println("This coffee is delicious");
    }
}
