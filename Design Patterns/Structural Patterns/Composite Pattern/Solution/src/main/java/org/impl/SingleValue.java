package org.impl;

import org.interfaces.ValueContainer;

import java.util.Collections;
import java.util.Iterator;

public class SingleValue implements ValueContainer {
    public int value;

    // constructor
    public SingleValue(int value) {
        this.value = value;
    }

    @Override
    public Iterator<Integer> iterator() {
        return Collections.singleton(value).iterator();
    }
}