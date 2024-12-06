package org.models;

import lombok.Getter;

@Getter
public enum EnumBasedSingleton {
    INSTANCE; // hooray

    // enum type already has a private ctor by default,
    // but if you need to initialize things...
    EnumBasedSingleton() {
        value = 42;
    }

    // enums are inherently serializable (but what good is that?)
    // reflection not a problem, guaranteed 1 instance in JVM

    // field values not serialized!
    int value;

    public void setValue(int value)
    {
        this.value = value;
    }
}
