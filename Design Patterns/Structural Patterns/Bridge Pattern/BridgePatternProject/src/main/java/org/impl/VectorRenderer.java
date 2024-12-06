package org.impl;

import org.interfaces.Renderer;

public class VectorRenderer implements Renderer {
    @Override
    public void renderCircle(float radius)
    {
        System.out.println("Drawing a circle of radius " + radius);
    }
}
