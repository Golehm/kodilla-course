package com.kodilla.patterns2.decorator.pizza;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PizzaTestSuite {
    @Test
    public void testAllIngriedentsPizza() {
        //Given
        Pizza thePizza = new BasicPizza();
        thePizza = new OnionDecorator(thePizza);
        thePizza = new PaprikaDecorator(thePizza);
        thePizza = new HamDecorator(thePizza);
        thePizza = new ExtraChesseDecorator(thePizza);
        thePizza = new SalamiDecorator(thePizza);
        thePizza = new ExtraSpicesDecorator(thePizza);
        //When
        String description = thePizza.getDescription();
        //Then
        assertEquals("Margeritha: flatbread, tomato sauce, cheese, onion, paprika," +
                " ham, extra chesse, salami, extra spices,", description);
    }
}
