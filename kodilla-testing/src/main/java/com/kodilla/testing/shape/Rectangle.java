package com.kodilla.testing.shape;

public class Rectangle implements Shape{
    String shapeName = "Rectangle";
    double shapeField;

    public Rectangle(double shapeField) {
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
