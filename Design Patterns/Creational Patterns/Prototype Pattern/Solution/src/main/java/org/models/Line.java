package org.models;

public class Line {
    public Point start, end;

    public Line(Point start, Point end) {
        this.start = start;
        this.end = end;
    }

    // copy constructor
    public Line(Line other) {
        this(new Point(other.start), new Point(other.end));
    }

    public Line deepCopy() {
        return new Line(this);
    }
}
