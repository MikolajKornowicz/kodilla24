package com.kodilla.testing.shape;

public class Circle implements Shape {

    private String shapeName = "Circle";
    private int a;
    private int h;
    private double field;

    @Override
    public String getShapeName() {
        return this.shapeName = shapeName;
    }

    @Override
    public double getField() {
        return this.field = field;
    }
    public double fieldCalculator (int a, int b) {
        return field = (a*h)/2;
    }
}
