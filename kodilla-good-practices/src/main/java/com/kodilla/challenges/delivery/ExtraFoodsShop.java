package com.kodilla.challenges.delivery;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

public class ExtraFoodsShop extends Shop{

    private String shopName = setShopName("ExtraFoodsShop");
    private String location = setLocation("Sunny Village");
    private Map<String, BigDecimal> assortment = new HashMap<>();

    public ExtraFoodsShop(Map assortment) {
        super(assortment);
    }
    }

