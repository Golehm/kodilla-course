package com.kodilla.good.patterns.challenges;

import java.util.ArrayList;
import java.util.List;

public class OrderRequestRetriever {
    public OrderRequest retrieve (){
        User user = new User("Hannibal","Lecter");
        Product product1 = new Product("games");
        Product product2 = new Product("slipers");
        Product product3 = new Product("toothbrush");
        Product product4 = new Product("Allegro");
        List<Product> listOfProducts = new ArrayList<>();
        listOfProducts.add(product1);
        listOfProducts.add(product2);
        listOfProducts.add(product3);
        listOfProducts.add(product4);
        return new OrderRequest(user, listOfProducts);
    }
}
