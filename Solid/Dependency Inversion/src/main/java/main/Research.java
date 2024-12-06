package main;

import interfaces.RelationshipBrowser;
import models.Person;
import models.Relation;
import models.Relationship;
import services.Relationships;

import java.util.List;

public class Research {
    public Research(Relationships relationships) {
        List<Relation> relations = relationships.getRelations();
        relations.stream()
                .filter(x -> x.getPerson1().name.equals("John")
                        && x.getRelationship() == Relationship.PARENT)
                .forEach(ch -> System.out.println("John has a child called " + ch.getPerson2().name));
    }

    // Dependency inversion kullanılarak RelationshipBrowser üzerinden araştırma
    public Research(RelationshipBrowser browser) {
        List<Person> children = browser.findAllChildrenOf("John");
        for (Person child : children)
            System.out.println("John has a child called " + child.name);
    }
}
