package org.main;

import org.model.CoordinateSystem;
import org.model.Point;

public class Main {
    public static void main(String[] args) {
        Point point = new Point(2, 3, CoordinateSystem.CARTESIAN);
        Point origin = Point.ORIGIN;

        Point point1 = Point.Factory.newCartesianPoint(1, 2);
    }
}