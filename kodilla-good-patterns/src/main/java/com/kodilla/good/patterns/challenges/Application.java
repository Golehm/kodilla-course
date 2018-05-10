package com.kodilla.good.patterns.challenges;

public class Application {
    public static void main(String[] argv){
       OrderRequestRetriever orderRequestRetriever = new OrderRequestRetriever();
       OrderRequest orderRequest = orderRequestRetriever.retrieve();
       ProductOrderService productOrderService = new ProductOrderService
               ( new ConsoleInfo (), new ConsoleOrderInfo(), new MadeOrdersRepository());
        productOrderService.process(orderRequest);
    }
}
