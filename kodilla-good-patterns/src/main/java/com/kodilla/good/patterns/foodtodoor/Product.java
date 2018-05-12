package com.kodilla.good.patterns.foodtodoor;

public class Product {
    private int quantity;
    private String name;

    public Product(int quantity, String name) {
        this.quantity = quantity;
        this.name = name;
    }

    public int getQuantity() {
        return quantity;
    }

    public String getName() {
        return name;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
