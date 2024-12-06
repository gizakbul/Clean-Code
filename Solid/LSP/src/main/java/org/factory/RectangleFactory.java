package org.factory;

import org.model.Rectangle;
import org.model.Square;

public class RectangleFactory {

    public static Rectangle newSquare(int side) {
        return new Square(side);
    }

    public static Rectangle newRectangle(int width, int height) {
        return new Rectangle(width, height);
    }
}
