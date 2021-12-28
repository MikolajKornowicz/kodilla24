package com.kodilla.challenges.delivery;

import java.math.BigDecimal;
import java.util.Locale;

public class Product {

    private String productName;
    private String productID = getProductName();
    private BigDecimal price;

    public Product(String name, BigDecimal price) {
        this.productName = name;
        this.price = price;
    }

    public String getProductName() {
        return productName;
    }

    public String getProductID() {
        return productID;
    }

    public BigDecimal getPrice() {
        return price;
    }
}
