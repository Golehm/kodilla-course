package com.kodilla.good.patterns.challenges;

import java.util.List;

public class OrderRequest {
    private User user;
    private List<Product> listOfProducts;

    public OrderRequest(User user, List<Product> listOfProducts) {
        this.user = user;
        this.listOfProducts = listOfProducts;
    }

    public User getUser() {
        return user;
    }

    public List<Product> getListOfProducts() {
        return listOfProducts;
    }
}
