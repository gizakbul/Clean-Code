package org.example;

import org.handlers.LoggingHandler;
import org.interfaces.Human;
import org.models.Person;

import java.lang.reflect.Proxy;

public class Main {
    @SuppressWarnings("unchecked")
    public static <T> T withLogging(T target, Class<T> itf)
    {
        return (T) Proxy.newProxyInstance(
                itf.getClassLoader(),
                new Class<?>[] { itf },
                new LoggingHandler(target));
    }

    public static void main(String[] args)
    {
        Person person = new Person();
        Human logged = withLogging(person, Human.class);
        logged.walk();
        logged.talk();
        logged.talk();

        System.out.println(logged);
    }
}