package org.example;

import org.abstracts.Shape;
import org.impl.RasterRenderer;
import org.impl.VectorRenderer;
import org.models.Square;
import org.models.Triangle;

public class Main {
    public static void main(String[] args) {
        Shape triangle = new Triangle(new RasterRenderer());
        System.out.println(triangle); // Drawing Triangle as pixels

        Shape square = new Square(new VectorRenderer());
        System.out.println(square); // Drawing Square as lines
    }
}