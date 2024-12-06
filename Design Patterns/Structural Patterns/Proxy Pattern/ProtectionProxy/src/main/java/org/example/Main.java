package org.example;

import org.interfaces.Drivable;
import org.models.Driver;
import org.proxies.CarProxy;

public class Main {
    public static void main(String[] args) {
        Driver driver = new Driver(12); // 12 yaşındaki sürücü
        Drivable car = new CarProxy(driver);
        car.drive(); // Sürücü çok genç olduğu için arabayı sürmeyecek
    }
}