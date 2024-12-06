package org.main;

import org.factory.PersonFactory;
import org.model.Person;

public class Main {
    public static void main(String[] args) {
        PersonFactory factory = new PersonFactory();

        Person person1 = factory.createPerson("John");
        System.out.println("Person1 - ID: " + person1.id + ", Name: " + person1.name); // Çıktı: Person1 - ID: 0, Name: John

        Person person2 = factory.createPerson("Jane");
        System.out.println("Person2 - ID: " + person2.id + ", Name: " + person2.name); // Çıktı: Person2 - ID: 1, Name: Jane

        Person person3 = factory.createPerson("Alice");
        System.out.println("Person3 - ID: " + person3.id + ", Name: " + person3.name); // Çıktı: Person3 - ID: 2, Name: Alice
    }
}