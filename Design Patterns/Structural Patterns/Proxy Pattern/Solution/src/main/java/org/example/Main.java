package org.example;

import org.models.Person;
import org.models.ResponsiblePerson;

public class Main {
    public static void main(String[] args) {
        Person person = new Person(20);
        ResponsiblePerson responsiblePerson = new ResponsiblePerson(person);

        System.out.println(responsiblePerson.drink()); // drinking
        System.out.println(responsiblePerson.drive()); // driving
        System.out.println(responsiblePerson.drinkAndDrive()); // dead

        responsiblePerson.setAge(15);

        System.out.println(responsiblePerson.drink()); // too young
        System.out.println(responsiblePerson.drive()); // too young
        System.out.println(responsiblePerson.drinkAndDrive()); // dead
    }
}