package com.kodilla.challenges.delivery;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

public class GlutenFreeShop extends Shop{

    private String shopName = setShopName("GlutenFreeShop");
    private String location = setLocation("Far Away Village");
    private Map<String, BigDecimal> assortment = new HashMap<>();

    public GlutenFreeShop(Map assortment) {
        super(assortment);
    }
}

