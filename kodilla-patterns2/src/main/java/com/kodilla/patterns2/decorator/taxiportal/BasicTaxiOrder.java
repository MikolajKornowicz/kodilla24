package com.kodilla.patterns2.decorator.taxiportal;

import java.math.BigDecimal;

public class BasicTaxiOrder implements TaxiOrder {

    @Override
    public String getDescription(){
        return "Drive a course";
    }

    @Override
    public BigDecimal getCost() {
        return new BigDecimal("5.00");

    }

}
