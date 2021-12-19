package com.kodilla.challenges.delivery;

import java.math.BigDecimal;
import java.util.List;
import java.util.Map;

public class Shop{

    private String shopName;
    private String location;
    private Map<String, BigDecimal> assortment;

    public Shop(Map assortment) {
        this.shopName = shopName;
        this.location = location;
        this.assortment = assortment;
    }

    public String getShopName() {
        return shopName;
    }

    public String setShopName(String shopName) {
        this.shopName = shopName;
        return shopName;
    }

    public String getLocation() {
        return location;
    }

    public String setLocation(String location) {
        this.location = location;
        return location;
    }

    public Map<String, BigDecimal> getAssortment() {
        return assortment;
    }

    public void setAssortment(Map<String, BigDecimal> assortment) {
        this.assortment = assortment;
    }
}



