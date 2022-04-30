package com.kodilla.patterns2.decorator.pizza;

import java.math.BigDecimal;

public class PizzaDiscountDecorator extends PizzaDecorator{

    public PizzaDiscountDecorator(PizzaRequest pizzaRequest) {
        super(pizzaRequest);
    }

    @Override
    public BigDecimal getPrice() {
        return super.getPrice().subtract(super.getPrice().multiply(new BigDecimal("0.2")));
    }

}
