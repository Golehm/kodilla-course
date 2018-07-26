package com.kodilla.patterns2.decorator.pizza;

import org.junit.Test;

import java.math.BigDecimal;

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
        BigDecimal price = thePizza.getCost();
        //Then
        assertEquals("Margeritha: flatbread, tomato sauce, cheese, onion, paprika," +
                " ham, extra chesse, salami, extra spices,", description);
        assertEquals(new BigDecimal(38.00),price);
    }
    @Test
    public void testVeganPizza() {
        //Given
        Pizza thePizza = new BasicPizza();
        thePizza = new OnionDecorator(thePizza);
        thePizza = new ExtraSpicesDecorator(thePizza);
        thePizza = new PaprikaDecorator(thePizza);
        thePizza = new ExtraChesseDecorator(thePizza);
        //When
        String description = thePizza.getDescription();
        BigDecimal price = thePizza.getCost();
        //Then
        assertEquals("Margeritha: flatbread, tomato sauce, cheese, onion, " +
                "extra spices, paprika, extra chesse,", description);
        assertEquals(new BigDecimal(25.00),price);
    }
    @Test
    public void testExtraPizza() {
        //Given
        Pizza thePizza = new BasicPizza();
        thePizza = new ExtraChesseDecorator(thePizza);
        thePizza = new ExtraSpicesDecorator(thePizza);
        //When
        String description = thePizza.getDescription();
        BigDecimal price = thePizza.getCost();
        //Then
        assertEquals("Margeritha: flatbread, tomato sauce, cheese, extra chesse, extra spices,", description);
        assertEquals(new BigDecimal(19.00),price);
    }
}
