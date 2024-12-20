package org.models;

import org.interfaces.Drivable;

public class Car implements Drivable {
    protected Driver driver;

    public Car(Driver driver)
    {
        this.driver = driver;
    }

    @Override
    public void drive()
    {
        System.out.println("Car being driven");
    }
}