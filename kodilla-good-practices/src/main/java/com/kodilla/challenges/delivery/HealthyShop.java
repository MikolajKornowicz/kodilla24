package com.kodilla.challenges.delivery;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

public class HealthyShop extends Shop {

    private String shopName = setShopName("HealthyShop");
    private String location = setLocation("Nice Village");
    private Map<String, BigDecimal> assortment = new HashMap<>();

    public HealthyShop(Map assortment) {
        super(assortment);
    }
}

