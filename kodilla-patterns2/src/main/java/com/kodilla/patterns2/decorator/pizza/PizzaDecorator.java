package com.kodilla.patterns2.decorator.pizza;

import java.math.BigDecimal;
import java.util.List;

public abstract class PizzaDecorator implements PizzaRequest {

    private final PizzaRequest pizzaRequest;

    public PizzaDecorator(PizzaRequest pizzaRequest) {
        this.pizzaRequest = pizzaRequest;
    }

    @Override
    public String getBottom() {
        return pizzaRequest.getBottom();
    }

    @Override
    public List<String> getToppings() {
        return pizzaRequest.getToppings();
    }

    @Override
    public BigDecimal getPrice() {
        return pizzaRequest.getPrice();
    }
}
