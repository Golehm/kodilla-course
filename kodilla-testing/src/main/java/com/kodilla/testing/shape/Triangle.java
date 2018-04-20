package com.kodilla.testing.shape;

public class Triangle implements Shape{
    String shapeName = "Triangle";
    double shapeField;

    public Triangle(double shapeField) {
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