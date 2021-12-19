package com.kodilla.challenges.delivery;

import java.math.BigDecimal;

public class Product {

    private String productName;
    private BigDecimal price;

    public Product(String name, BigDecimal quantity) {
        this.productName = name;
        this.price = quantity;
    }

    public String getProductName() {
        return productName;
    }

    public BigDecimal getPrice() {
        return price;
    }
}
