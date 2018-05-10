package com.kodilla.good.patterns.challenges;

import java.time.LocalDateTime;

public class ProductOrderService {

    private InformationService informationService;
    private OrderService orderService;
    private OrderRepository orderRepository;

    public ProductOrderService(final InformationService informationService,
                               final OrderService orderService,
                               final OrderRepository orderRepository) {
        this.informationService = informationService;
        this.orderService = orderService;
        this.orderRepository = orderRepository;
    }

    public void process(OrderRequest orderRequest){
        informationService.inform(orderRequest.getUser());
        orderService.order(orderRequest);
        orderRepository.createOrderDto(orderRequest.getUser(), orderRequest.getListOfProducts(), LocalDateTime.now());
    }
}

