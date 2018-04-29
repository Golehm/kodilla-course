package com.kodilla.stream.world;

import java.math.BigDecimal;

public class Country {

   private BigDecimal PeopleQuantity;

    public BigDecimal getPeopleQuantity() {
        return PeopleQuantity;
    }

    public Country(BigDecimal peopleQuantity) {
        PeopleQuantity = peopleQuantity;
    }
}
