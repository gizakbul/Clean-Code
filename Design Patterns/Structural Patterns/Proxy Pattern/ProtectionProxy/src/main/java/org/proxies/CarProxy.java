package org.proxies;

import org.models.Car;
import org.models.Driver;

public class CarProxy extends Car {
    private Driver driver;

    public CarProxy(Driver driver)
    {
        super(driver);
    }

    @Override
    public void drive()
    {
        if (driver.age >= 17)
            super.drive();
        else
            System.out.println("Driver too young");
    }
}