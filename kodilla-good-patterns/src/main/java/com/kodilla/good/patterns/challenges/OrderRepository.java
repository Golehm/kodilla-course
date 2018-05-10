package com.kodilla.good.patterns.challenges;

import java.time.LocalDateTime;
import java.util.List;

public interface OrderRepository {
   void createOrderDto(User user, List<Product> listOfProducts, LocalDateTime time); //lista produktow i user
}
