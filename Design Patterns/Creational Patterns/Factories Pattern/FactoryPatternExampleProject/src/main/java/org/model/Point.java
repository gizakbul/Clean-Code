package org.model;

public class Point {
    private double x, y;

    public Point(double x, double y)
    {
        this.x = x;
        this.y = y;
    }

    public Point(double a,
                 double b, // names do not communicate intent
                 CoordinateSystem cs)
    {
        switch (cs)
        {
            case CARTESIAN:
                this.x = a;
                this.y = b;
                break;
            case POLAR:
                this.x = a * Math.cos(b);
                this.y = a * Math.sin(b);
                break;
        }
    }

    // steps to add a new system
    // 1. augment CoordinateSystem
    // 2. change ctor

    // singleton field
    public static final Point ORIGIN = new Point(0,0);

    // factory method
    public static Point newCartesianPoint(double x, double y)
    {
        return new Point(x,y);
    }

    public static Point newPolarPoint(double rho, double theta)
    {
        return new Point(rho*Math.cos(theta), rho*Math.sin(theta));
    }

    public static class Factory
    {
        public static Point newCartesianPoint(double x, double y)
        {
            return new Point(x,y);
        }
    }
}
