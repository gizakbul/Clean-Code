package org.main;

import org.models.Dragon;

public class Main {
    public static void main(String[] args) {
        Dragon dragon = new Dragon();
        dragon.setAge(5);
        System.out.println(dragon.fly());   // flying
        System.out.println(dragon.crawl()); // crawling

        dragon.setAge(11);
        System.out.println(dragon.fly());   // too old
        System.out.println(dragon.crawl()); // crawling
    }
}