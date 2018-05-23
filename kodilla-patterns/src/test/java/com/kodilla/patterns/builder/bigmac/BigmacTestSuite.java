package com.kodilla.patterns.builder.bigmac;

import org.junit.Assert;
import org.junit.Test;
import static com.kodilla.patterns.builder.bigmac.Sauce.*;
import static com.kodilla.patterns.builder.bigmac.Ingredients.*;

public class BigmacTestSuite {
    @Test
    public void testBigmacNew(){
        //Given
        Bigmac bigmac = new Bigmac.BigmacBuilder()
                .bun(true)
                .ingredient(ONION)
                .sauce(BARBECUE)
                .ingredient(CHESSE)
                .ingredient(BACON)
                .burgers(2)
                .build();
        System.out.println(bigmac);
        //When
        int howManyIngredients = bigmac.getIngredients().size();
        //Then
        Assert.assertEquals(3, howManyIngredients);
    }
}
