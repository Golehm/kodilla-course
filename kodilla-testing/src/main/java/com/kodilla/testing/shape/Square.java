package com.kodilla.testing.shape;

public class Square implements Shape{
    String shapeName = "Square";
    double shapeField;

    public Square(double shapeField) {
        this.shapeField = shapeField;
    }

    @Override
    public String getShapeName() {
        return shapeName;
    }
    @Override
    public double getField() {
        return shapeField;
    }
}
