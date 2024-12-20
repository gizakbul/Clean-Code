package org.abstracts;

import org.interfaces.Renderer;

public abstract class Shape {
    protected Renderer renderer;

    public Shape(Renderer renderer)
    {
        this.renderer = renderer;
    }

    public abstract void draw();
    public abstract void resize(float factor);
}
