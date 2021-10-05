package com.kodilla.testing.shape;

import java.util.ArrayList;
import java.util.List;

public class ShapeCollector {

    List<Shape> collection = new ArrayList<>();

    public void addFigure(Shape shape) {
        collection.add(shape);
    }
    public void removeFigure(Shape shape) {
        collection.remove(collection.get(-1));
    }
    public int getFigure(int n) {
        return 100;
    }
    public void showFigures() {

    }
}
