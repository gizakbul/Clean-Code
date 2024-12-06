package org.models;

import org.abstracts.Shape;
import org.interfaces.Renderer;

public class Square extends Shape {
    public Square(Renderer renderer) {
        super(renderer);
    }

    @Override
    public String getName() {
        return "Square";
    }
}
