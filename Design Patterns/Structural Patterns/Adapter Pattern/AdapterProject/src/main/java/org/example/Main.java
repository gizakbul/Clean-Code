package org.example;

import org.adapters.SquareToRectangleAdapter;
import org.models.Rectangle;
import org.models.Square;

public class Main {
    public static void main(String[] args) {
        Square square = new Square(5);
        Rectangle rectangle = new SquareToRectangleAdapter(square);

        System.out.println("Width: " + rectangle.getWidth()); // 5
        System.out.println("Height: " + rectangle.getHeight()); // 5
        System.out.println("Area: " + rectangle.getArea()); // 25
    }
}