package edu.tomer.java.shapes;

/**
 * Created by Tomer on 07/03/2017.
 */
public class Circle extends Shape{
    //properties:
    private double radius;

    //constructor:
    public Circle( double radius, String color) {
        super(color);
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    @Override
    public double getPerimeter() {
        return 2*(Math.PI) * radius;
    }

    @Override
    public String toString() {
        return "{" +
                "radius=" + radius +
                "} " + super.toString();
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
}
