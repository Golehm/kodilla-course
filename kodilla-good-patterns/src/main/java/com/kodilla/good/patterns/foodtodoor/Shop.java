package com.kodilla.good.patterns.foodtodoor;

import java.util.List;

public abstract class Shop {
    protected Shop(){}
    List<Product> assortmentList;

    public boolean processOrder(Product order) {
        boolean result = true;
        for (Product product: assortmentList) {
            if(product.getName().equals( order.getName()))
            {
                if(product.getQuantity() >= order.getQuantity()){
                    System.out.println("Order of "+ order.getQuantity()+" "+ order.getName()+ " is completed");
                    product.setQuantity(product.getQuantity() - order.getQuantity());
                        return result;
                }
                else{
                    System.out.println("Only " + product.getQuantity()+ "of" +product.getName() + " available");
                    return result;
                }
            }
            else result = false;
        }
        return result;
    }
}
