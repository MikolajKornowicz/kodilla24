package com.kodilla.patterns2.decorator.pizza;

import java.math.BigDecimal;
import java.util.List;

public class PizzaDecoratorProteinDecorator extends PizzaDecorator {

    public PizzaDecoratorProteinDecorator(PizzaRequest pizzaRequest) {
        super(pizzaRequest);
    }


    @Override
    public List<String> getToppings() {

        List<String> toppings = super.getToppings();
        toppings.add("Protein");
        return toppings;
    }

    @Override
    public BigDecimal getPrice() {
        return super.getPrice().add(new BigDecimal(5));
    }
}
