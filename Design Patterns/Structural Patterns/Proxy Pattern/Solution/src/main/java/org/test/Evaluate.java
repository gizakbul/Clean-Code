package org.test;

import org.junit.Test;
import org.models.Person;
import org.models.ResponsiblePerson;

import static org.junit.Assert.assertEquals;
public class Evaluate {
    @Test
    public void test()
    {
        Person p = new Person(10);
        ResponsiblePerson rp = new ResponsiblePerson(p);

        assertEquals("too young", rp.drive());
        assertEquals("too young", rp.drink());
        assertEquals("dead", rp.drinkAndDrive());

        rp.setAge(20);

        assertEquals("driving", rp.drive());
        assertEquals("drinking", rp.drink());
        assertEquals("dead", rp.drinkAndDrive());
    }
}
