package org.main;

import org.impl.Circle;
import org.impl.ColoredShape;
import org.impl.Square;
import org.impl.TransparentShape;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(10);
        System.out.println(circle.info());

        ColoredShape blueSquare = new ColoredShape(new Square(20), "blue");
        System.out.println(blueSquare.info());

        TransparentShape myCircle = new TransparentShape(new ColoredShape(new Circle(5), "green"), 50);
        System.out.println(myCircle.info());

        // cannot call myCircle.resize()
    }
}