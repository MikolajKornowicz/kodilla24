package com.kodilla.stream.world;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class WorldTestSuite {
    @Test
    void testGetPopulation () {
        //given
        Country albania = new Country(new BigDecimal("10000000000"));
        Country cuba = new Country(new BigDecimal("20000000000"));
        Country china = new Country(new BigDecimal("30000000000"));
        Country usa = new Country(new BigDecimal("40000000000"));
        Country germany = new Country(new BigDecimal("50000000"));
        Country india = new Country(new BigDecimal("700000000"));

        Continent america = new Continent ();
        america.addCountry(usa);
        america.addCountry(cuba);
        Continent asian = new Continent ();
        asian.addCountry(china);
        asian.addCountry(india);
        Continent european = new Continent();
        european.addCountry(germany);
        european.addCountry(albania);

        World world = new World ();
        world.addContinent(america);
        world.addContinent(european);
        world.addContinent(asian);
        //when
        BigDecimal worldPop = world.getPeopleQuantity();
        //then
        BigDecimal totalPopulation = new BigDecimal("100750000000");
        Assertions.assertEquals(totalPopulation, worldPop);
    }
}
