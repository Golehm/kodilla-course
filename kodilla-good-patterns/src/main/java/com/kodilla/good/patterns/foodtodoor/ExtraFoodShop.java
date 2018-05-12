package com.kodilla.good.patterns.foodtodoor;

import java.util.List;

public class ExtraFoodShop extends Shop implements Process {

    private String shopName = "Extra Food";

    public ExtraFoodShop(List<Product> assortmentList) {
        this.assortmentList = assortmentList;
    }

    public boolean process(Product order) {
        System.out.println("Request delivery from " + shopName);
            return processOrder(order);
    }
}
