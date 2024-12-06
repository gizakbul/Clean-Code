package org.impl;

import org.interfaces.Shape;

public class Square implements Shape {
    private float side;

    public Square()
    {
    }

    public Square(float side)
    {
        this.side = side;
    }

    @Override
    public String info()
    {
        return "A square with side " + side;
    }
}
