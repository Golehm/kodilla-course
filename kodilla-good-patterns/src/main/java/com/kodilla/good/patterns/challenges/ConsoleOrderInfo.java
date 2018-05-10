package com.kodilla.good.patterns.challenges;

import java.util.stream.Collectors;

public class ConsoleOrderInfo implements OrderService{
    @Override
    public void order(OrderRequest orderRequest) {
        System.out.println("Ordered are ");
        orderRequest.getListOfProducts().stream().map(product -> product.getProductsName()).forEach(System.out::println);
    }
}
