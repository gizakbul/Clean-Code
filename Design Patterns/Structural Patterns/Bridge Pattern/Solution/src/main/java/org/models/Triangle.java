package org.models;

import org.abstracts.Shape;
import org.interfaces.Renderer;

public class Triangle extends Shape {
    public Triangle(Renderer renderer) {
        super(renderer);
    }

    @Override
    public String getName() {
        return "Triangle";
    }
}

