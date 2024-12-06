package org.builder;

import org.model.Person;

public class PersonBuilder {
    protected Person person = new Person(); // reference!

    public PersonJobBuilder works()
    {
        return new PersonJobBuilder(person);
    }

    public PersonAddressBuilder lives()
    {
        return new PersonAddressBuilder(person);
    }

    public Person build()
    {
        return person;
    }
}
