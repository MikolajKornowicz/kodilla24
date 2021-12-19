package com.kodilla.challenges.delivery;


import java.math.BigDecimal;
import java.util.Map;

public class Shop {

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

    public boolean process(String deliverTo, Product product, BigDecimal amount) {
        if (getAssortment().containsKey(product.getProductName())) {
            System.out.println(getShopName () + " from: " + location + " is going to deliver: " +  product.getProductName() + " to: " + deliverTo + ". Total price: " + product.getPrice().multiply(amount) + " PLN.");
            assortment.remove(product.getProductName());
            return true;
        } else
            System.out.println(getShopName () + " is unable to deliver: " + product.getProductName() + " to: " + deliverTo + ". Reason: out of stock.");
        return false;
    }
}



