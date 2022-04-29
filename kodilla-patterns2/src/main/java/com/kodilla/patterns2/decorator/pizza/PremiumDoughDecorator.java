package com.kodilla.patterns2.decorator.pizza;

import java.math.BigDecimal;

public class PremiumDoughDecorator extends PizzaDecorator {

    public PremiumDoughDecorator(PizzaRequest pizzaRequest) {
        super(pizzaRequest);
    }

    @Override
    public String getBottom() {
        return "Whole Grain Dough";
    }


    @Override
    public BigDecimal getPrice() {
        return super.getPrice().add(new BigDecimal(5));
    }
}
