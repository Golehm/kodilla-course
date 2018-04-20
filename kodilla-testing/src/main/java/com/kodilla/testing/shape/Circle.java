package com.kodilla.testing.shape;

public class Circle implements Shape{
    String shapeName = "Circle";
    double shapeField;

    public Circle(double shapeField) {
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
