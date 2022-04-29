package com.kodilla.patterns2.decorator.pizza;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class BasicPizza implements PizzaRequest{

    @Override
    public String getBottom() {
        return "basic dough";
    }

    @Override
    public List<String> getToppings() {
        List<String>toppings = new ArrayList<>();
        toppings.add("sauce");
        return toppings;
    }

    @Override
    public BigDecimal getPrice() {
        return new BigDecimal(15);
    }
}
