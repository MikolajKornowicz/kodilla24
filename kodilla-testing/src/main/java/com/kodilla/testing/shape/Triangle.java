package com.kodilla.testing.shape;

public class Triangle implements Shape {

    private String shapeName = "Triangle";
    private int a;
    private int h;
    private double field;

    @Override
    public String getShapeName() {
        return this.shapeName = shapeName;
    }

    @Override
    public double getField() {
        return field = (a*h/2);
    }

    public String toString () {
        return shapeName + " with a = " + a +  " and h = " + h + "field = " + field;
    }
}
