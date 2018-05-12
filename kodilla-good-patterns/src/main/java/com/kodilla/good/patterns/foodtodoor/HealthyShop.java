package com.kodilla.good.patterns.foodtodoor;

import java.util.List;

public class HealthyShop extends Shop implements Process {

    private String shopName = "Healthy";

    public HealthyShop(List<Product> assortmentList) {
        this.assortmentList = assortmentList;
    }
    public boolean process(Product order) {
        System.out.println("Request delivery from " + shopName);
        if(processOrder(order)){
            return true;
        }
        System.out.println("Order of "+ order.getQuantity()+" "+ order.getName()+ " can't be completed");
        return false;
    }
}
