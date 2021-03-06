package com.kodilla.patterns2.decorator.pizza;

import java.math.BigDecimal;

public class ExtraSpicesDecorator extends AbstractPizzaDecorator {
    public ExtraSpicesDecorator(Pizza pizza) {
        super(pizza);
    }

    @Override
    public BigDecimal getCost() {
        return super.getCost().add(new BigDecimal(1));
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " extra spices,";
    }
}
