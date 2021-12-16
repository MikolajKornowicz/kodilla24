package com.kodilla.challenges;

import java.math.BigDecimal;

public class Product {

    private String name;
    private String type;
    private BigDecimal price;

    public Product(String name, String type, BigDecimal price) {
        this.name = name;
        this.type = type;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public BigDecimal getPrice() {
        return price;
    }
}
