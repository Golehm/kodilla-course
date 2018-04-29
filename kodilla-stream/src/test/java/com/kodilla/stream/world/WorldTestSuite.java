package com.kodilla.stream.world;

import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class WorldTestSuite {
    List<Country> africaCountries = new ArrayList<>();
    List<Country> americaCountries = new ArrayList<>();
    List<Country> asiaCountries = new ArrayList<>();
    List<Country> australiaCountries = new ArrayList<>();
    List<Country> europeCountries = new ArrayList<>();

    Country nigeria = new Country(new BigDecimal("180000001"));
    Country egypt = new Country(new BigDecimal("70000020"));
    Country maroco = new Country(new BigDecimal("50000300"));
    Country zimbabwe = new Country(new BigDecimal("80004000"));
    Country usa = new Country(new BigDecimal("300050000"));
    Country brazil = new Country(new BigDecimal("230600000"));
    Country china = new Country(new BigDecimal("1507000000"));
    Country india = new Country(new BigDecimal("1240000000"));
    Country pakistan = new Country(new BigDecimal("400000000"));
    Country australia = new Country(new BigDecimal("40000000"));
    Country poland = new Country(new BigDecimal("38000000"));
    Country germany = new Country(new BigDecimal("790000000"));
    Country austria = new Country(new BigDecimal("7000000"));
    Country spain = new Country(new BigDecimal("55000000"));
    Country switzerland = new Country(new BigDecimal("25000000"));
    Country france = new Country(new BigDecimal("71000000"));
    Country norway = new Country(new BigDecimal("4000000"));
    @Test
    public void testGetPeopleQuantity() {
        //Given
        africaCountries.add(nigeria);
        africaCountries.add(egypt);
        africaCountries.add(maroco);
        africaCountries.add(zimbabwe);
        Continent africa = new Continent(africaCountries);
        americaCountries.add(usa);
        americaCountries.add(brazil);
        Continent america = new Continent(americaCountries);
        asiaCountries.add(china);
        asiaCountries.add(india);
        asiaCountries.add(pakistan);
        Continent asia = new Continent(asiaCountries);
        australiaCountries.add(australia);
        Continent australia = new Continent(australiaCountries);
        europeCountries.add(poland);
        europeCountries.add(germany);
        europeCountries.add(austria);
        europeCountries.add(spain);
        europeCountries.add(switzerland);
        europeCountries.add(france);
        europeCountries.add(norway);
        Continent europe = new Continent(europeCountries);
        List<Continent> myListOfContinents = new ArrayList<>();
        myListOfContinents.add(africa);
        myListOfContinents.add(america);
        myListOfContinents.add(asia);
        myListOfContinents.add(australia);
        myListOfContinents.add(europe);
        //When
        World myWorld = new World(myListOfContinents);
        BigDecimal testedPeopleQuality = myWorld.getPeopleQuantity();
        //Then
        BigDecimal expectedPeopleQuantity = new BigDecimal("5087654321");
        Assert.assertEquals(expectedPeopleQuantity, testedPeopleQuality) ;
        System.out.println("Whole world has " + testedPeopleQuality + " peoples");
    }
}
