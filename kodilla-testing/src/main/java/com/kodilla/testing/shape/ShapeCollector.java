package com.kodilla.testing.shape;

import java.util.ArrayList;

public class ShapeCollector {
    private ArrayList<Shape> collection = new ArrayList<Shape>();
    public int size(){
        return collection.size();
    }
    public void addFigure(Shape shape){
        collection.add(shape);
    }
    public boolean removeFigure(Shape shape){
        boolean result = false;
        if (collection.contains(shape)){
            collection.remove(shape);
            result = true;
        }
        return result;
    }
    Shape getFigure(int n){
        Shape shape = null;
        if (n >= 0 && n < collection.size()) {
            shape = collection.get(n);
        }
        return shape;
    }
    void showFigures(){
        for(Shape shape: collection){
            System.out.println(shape.getShapeName());
        }

    }
}
