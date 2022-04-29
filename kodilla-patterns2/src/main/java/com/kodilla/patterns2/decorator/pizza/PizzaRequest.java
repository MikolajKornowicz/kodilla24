package com.kodilla.patterns2.decorator.pizza;

import java.math.BigDecimal;
import java.util.List;

public interface PizzaRequest {

    String getBottom();
    List<String> getToppings();

    BigDecimal getPrice();
}
