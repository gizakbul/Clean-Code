package org.factory;

import org.model.Person;

public class PersonFactory {
    private int counter = 0;

    public Person createPerson(String name) {
        return new Person(counter++, name);
    }
}
