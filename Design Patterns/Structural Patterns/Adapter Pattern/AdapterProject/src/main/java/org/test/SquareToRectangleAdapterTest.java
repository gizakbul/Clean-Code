package org.test;

import org.adapters.SquareToRectangleAdapter;
import org.junit.Test;
import org.models.Square;

import static org.junit.Assert.assertEquals;

public class SquareToRectangleAdapterTest {
    @Test
    public void test()
    {
        Square sq = new Square(11);
        SquareToRectangleAdapter adapter = new SquareToRectangleAdapter(sq);
        assertEquals(121, adapter.getArea());
    }
}
