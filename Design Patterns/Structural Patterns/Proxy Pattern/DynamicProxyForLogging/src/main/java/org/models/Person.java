package org.models;

import org.interfaces.Human;

public class Person implements Human {
    @Override
    public void walk()
    {
        System.out.println("I am walking");
    }

    @Override
    public void talk()
    {
        System.out.println("I am talking");
    }
}
