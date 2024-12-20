package org.test;

import org.junit.Test;
import org.models.Dragon;

import static org.junit.Assert.assertEquals;

public class Evaluate
{
    @Test
    public void test()
    {
        Dragon dragon = new Dragon();

        assertEquals("flying", dragon.fly());
        assertEquals("too young", dragon.crawl());

        dragon.setAge(20);

        assertEquals("too old", dragon.fly());
        assertEquals("crawling", dragon.crawl());
    }
}
