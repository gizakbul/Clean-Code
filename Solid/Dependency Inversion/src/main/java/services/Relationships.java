package services;

import interfaces.RelationshipBrowser;
import lombok.Getter;
import lombok.Setter;
import models.Person;
import models.Relationship;
import models.Relation;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

@Getter
@Setter
public class Relationships implements RelationshipBrowser {
    private List<Relation> relations = new ArrayList<>();

    public List<Relation> getRelations() {
        return relations;
    }

    public void addParentAndChild(Person parent, Person child) {
        relations.add(new Relation(parent, Relationship.PARENT, child));
        relations.add(new Relation(child, Relationship.CHILD, parent));
    }

    @Override
    public List<Person> findAllChildrenOf(String name) {
        return relations.stream()
                .filter(x -> Objects.equals(x.getPerson1().name, name)
                        && x.getRelationship() == Relationship.PARENT)
                .map(Relation::getPerson2)
                .collect(Collectors.toList());
    }
}
