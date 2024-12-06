package org.example;

import org.models.Line;
import org.models.Point;

public class Main {
    public static void main(String[] args) {
        Point start = new Point(0, 0);
        Point end = new Point(5, 5);
        Line line1 = new Line(start, end);

        Line line2 = line1.deepCopy();

        System.out.println(line1.start == line2.start); // false (different objects)
        System.out.println(line1.end == line2.end); // false (different objects)

        System.out.println(line1.start.x == line2.start.x); // true
        System.out.println(line1.start.y == line2.start.y); // true
        System.out.println(line1.end.x == line2.end.x); // true
        System.out.println(line1.end.y == line2.end.y); // true
    }
}