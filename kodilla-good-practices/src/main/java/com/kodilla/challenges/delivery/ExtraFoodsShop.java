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

    public boolean process (String deliverTo, Product product) {
        if (getAssortment().containsKey(product.getProductName())){
            System.out.println(shopName + "is going to deliver: " + product.getProductName() + " to: " + deliverTo);
            return true;
        } else
            System.out.println( shopName + " is unable to deliver: " + product.getProductName() + " to: " + deliverTo );
            return false;
    }
}
