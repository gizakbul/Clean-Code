package org.models;

public class Lizard {
    public int age;

    public String crawl()
    {
        return (age > 1) ? "crawling" : "too young";
    }
}
