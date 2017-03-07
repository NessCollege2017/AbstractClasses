package edu.tomer.java.shapes;

/**
 * Created by Tomer on 07/03/2017.
 */
public abstract class Shape {
    private String color;

    protected Shape(String color) {
        this.color = color;
    }

    public abstract double getArea();
    public abstract double getPerimeter();

    @Override
    public String toString() {
        return getClass().getSimpleName() +"{" +
                "Color='" + color + '\'' +
                "Area='" + getArea() + '\'' +
                "Perimeter='" + getPerimeter() + '\'' +
                '}';
    }
}
