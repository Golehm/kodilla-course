package com.kodilla.good.patterns.challenges;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class MadeOrdersRepository implements OrderRepository{
    List<OrderDto> repositoryList = new ArrayList<>();
    public void createOrderDto (User user, List<Product> listOfProducts, LocalDateTime time) {
        repositoryList.add(new OrderDto(user, listOfProducts , time));
    }
}
