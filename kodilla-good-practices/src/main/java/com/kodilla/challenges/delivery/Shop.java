package com.kodilla.challenges.delivery;


import java.math.BigDecimal;
import java.util.List;
import java.util.Map;

public class Shop {

    private String shopName;
    private String location;
    private List<String> assortment;

    public Shop() {
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

    public List<String>  getAssortment() {
        return assortment;
    }

    public void setAssortment(List<String> assortment) {
        this.assortment = assortment;
    }

    public boolean process (String deliverTo, Product product, int amount) {
        return true;
    }
}



