package org.example;

import org.args.PropertyChangedEventArgs;
import org.interfaces.Observer;
import org.models.Person;

class ObserverInfrastructureDemo implements Observer<Person>
        // Observer<Foo>
{
    public ObserverInfrastructureDemo()
    {
        Person person = new Person();
        person.subscribe(this);
        for (int i = 20; i < 24; ++i)
            person.setAge(i);
    }

    public static void main(String [] args)
    {
        new ObserverInfrastructureDemo();
    }

    @Override
    public void handle(PropertyChangedEventArgs<Person> args)
    {
        System.out.println("Person's " + args.propertyName
                + " has been changed to " + args.newValue);
    }
}