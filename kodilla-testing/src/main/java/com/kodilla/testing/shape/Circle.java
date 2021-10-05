package com.kodilla.testing.shape;

public class Circle implements Shape {

    private String shapeName = "Circle";
    private int a;
    private int r;
    private double field;

    @Override
    public String getShapeName() {
        return this.shapeName = shapeName;
    }

    @Override
    public double getField() {
        return field = 2*Math.PI*r;
    }

    public String toString () {
        return "Circle r= " + r + "field = " + field;
    }
}
