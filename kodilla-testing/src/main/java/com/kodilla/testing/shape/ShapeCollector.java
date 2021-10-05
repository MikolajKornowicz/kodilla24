package com.kodilla.testing.shape;

import java.util.ArrayList;
import java.util.List;

public class ShapeCollector {

    private List<Shape> collection = new ArrayList<>();

    public void addFigure(Shape shape) {
        collection.add(shape);
    }
    public void removeFigure(Shape shape) {
        collection.remove(shape);
    }
    public  Shape getFigure(int n) {

        return collection.get(n);
    }
    public void showFigures() {
        System.out.println(collection);
    }
    public int getCollectionSize(){
        return collection.size();
    }
}
