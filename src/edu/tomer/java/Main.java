package edu.tomer.java;

import edu.tomer.java.shapes.Circle;
import edu.tomer.java.shapes.Rectangle;
import edu.tomer.java.shapes.Shape;
import edu.tomer.java.zoo.DayOfWeek;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        DayOfWeek d = DayOfWeek.SUNDAY;
        switch (d){
            case SUNDAY:
                break;
            case MONDAY:
                break;
            case TUESDAY:
                break;
            case WEDNESDAY:
                break;
            case THURSDAY:
                break;
            case FRIDAY:
                break;
            case SATURDAY:
                break;
        }


        ArrayList<Shape> shapes = new ArrayList<>();
        shapes.add(new Circle(10, "Black"));
        shapes.add(new Circle(25, "Red"));
        shapes.add(new Rectangle(10, 20, "Orange"));
        shapes.add(new Rectangle(4, 10, "Blue"));

        for (Shape s : shapes) {
            if (s instanceof Rectangle){
                Rectangle r = (Rectangle) s;
                int b = r.getB();
            }
        }
    }
}
