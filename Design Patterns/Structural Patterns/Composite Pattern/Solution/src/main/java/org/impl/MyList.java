package org.impl;

import org.interfaces.ValueContainer;

import java.util.ArrayList;
import java.util.Collection;

public class MyList extends ArrayList<ValueContainer> {
    // constructor
    public MyList(Collection<? extends ValueContainer> c) {
        super(c);
    }

    public int sum() {
        int total = 0;
        for (ValueContainer container : this) {
            for (int value : container) {
                total += value;
            }
        }
        return total;
    }
}