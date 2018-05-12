package com.kodilla.good.patterns.foodtodoor;

import java.util.List;

public class GlutenFreeShop extends Shop implements Process {

    private String shopName = "Gluten Free";

    public GlutenFreeShop(List<Product> assortmentList) {
        this.assortmentList = assortmentList;
    }
    public boolean process(Product order) {
        System.out.println("Request delivery from " + shopName);
        if(processOrder(order)){
            return true;
        }
        else
        System.out.println( order.getName()+ " is out of stock");
        return false;
    }
}
