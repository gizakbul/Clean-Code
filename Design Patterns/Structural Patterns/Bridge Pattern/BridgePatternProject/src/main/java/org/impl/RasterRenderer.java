package org.impl;

import org.interfaces.Renderer;

public class RasterRenderer implements Renderer {
    @Override
    public void renderCircle(float radius)
    {
        System.out.println("Drawing pixels for a circle of radius " + radius);
    }
}
