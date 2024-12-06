package models;

import lombok.Getter;

@Getter
public class Relation {
    Person person1;
    Relationship relationship;
    Person person2;

    public Relation(Person person1, Relationship relationship, Person person2) {
        this.person1 = person1;
        this.relationship = relationship;
        this.person2 = person2;
    }
}
