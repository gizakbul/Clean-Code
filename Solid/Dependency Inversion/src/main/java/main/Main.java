package main;

import interfaces.RelationshipBrowser;
import models.Person;
import services.Relationships;

public class Main {

    public static void main(String[] args) {
        Person john = new Person("John");
        Person mary = new Person("Mary");
        Person alex = new Person("Alex");

        Relationships relationships = new Relationships();
        relationships.addParentAndChild(john, mary);
        relationships.addParentAndChild(john, alex);

        System.out.println("Research with direct relationships:");
        new Research(relationships);

        System.out.println("\nResearch with interface abstraction:");
        new Research((RelationshipBrowser) relationships);
    }
}