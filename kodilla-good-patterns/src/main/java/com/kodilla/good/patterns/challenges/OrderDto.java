package com.kodilla.good.patterns.challenges;

import java.time.LocalDateTime;
import java.util.List;

public class OrderDto {
    private User user;
    private  List<Product> listOfProducts;//list interfejsem
    private LocalDateTime dateOfOrder;

    public OrderDto(User user, List<Product> listOfProducts, LocalDateTime dateOfOrder) {
        this.user = user;
        this.listOfProducts = listOfProducts;
        this.dateOfOrder = dateOfOrder;
    }

    public User getUser() {
        return user;
    }

    public List<Product> getListOfProducts() {
        return listOfProducts;
    }
    public LocalDateTime getDateOfOrder() {
        return dateOfOrder;
    }
}
