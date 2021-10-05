package com.kodilla.testing.shape;

import java.util.Objects;

public class Square implements Shape{

    private String shapeName = "Square";
    private int a;
    private double field;

    @Override
    public String getShapeName() {
        return this.shapeName = shapeName;
    }

    @Override
    public double getField() {
        return field = a*a;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Square square = (Square) o;
        return a == square.a && Double.compare(square.field, field) == 0 && Objects.equals(shapeName, square.shapeName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(shapeName, a, field);
    }

    public String toString () {
        return shapeName + " with a = " + a + "field = " + field;
    }
}