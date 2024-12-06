package org.models;

public class ResponsiblePerson {
    private Person person;

    public ResponsiblePerson(Person person) {
        this.person = person;
    }

    public void setAge(int age) {
        person.setAge(age);
    }

    public String drink() {
        return person.getAge() < 18 ? "too young" : person.drink();
    }

    public String drive() {
        return person.getAge() < 16 ? "too young" : person.drive();
    }

    public String drinkAndDrive() {
        return "dead";
    }
}
