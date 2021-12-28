package com.kodilla.challenges.delivery;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ExtraFoodsShop extends Shop{

    private String shopName = setShopName("ExtraFoodsShop");
    private String location = setLocation("Sunny Village");
    private final List<String> assortment = new ArrayList<>();

    public ExtraFoodsShop() {
    }

    public List<String> addExtraFoodAssortment (Product healthyProduct, int quantity) {
        for(int i= 0; i < quantity; i++){
            assortment.add(i,healthyProduct.getProductName());
        }
        return assortment;
    }

    public boolean process(String deliverTo, Product product, int amount){
        if (assortment.contains(product.getProductName())) {
            BigDecimal total = product.getPrice().multiply(BigDecimal.valueOf(amount)).setScale(2,  RoundingMode.FLOOR);
            System.out.println(getShopName () + " from: " + location + " is going to deliver: " +  product.getProductName() +  ", amount: " + amount + ", to: " + deliverTo + ". Total price: " + total + " PLN.");
            for(int i = 0; i < amount; i++) {
                assortment.remove(product.getProductName());
            }
            return true;
        } else
            System.out.println(getShopName () + " is unable to deliver: " + product.getProductName() + " to: " + deliverTo + ". Reason: out of stock.");
        return false;
    }

    @Override
    public List<String>  getAssortment() {
        return assortment;
    }
    }

