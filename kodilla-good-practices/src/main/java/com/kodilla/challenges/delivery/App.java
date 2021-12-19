package com.kodilla.challenges.delivery;


import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

public class App {
    public static void main (String[] args){

        Product bread = new Product("Bread", new BigDecimal("5.50"));
        Product milk = new Product("Milk", new BigDecimal("5.50"));
        Product tea = new Product("Tea", new BigDecimal("5.50"));
        Product chocolate = new Product("Chocolate", new BigDecimal("5.50"));
        Map<String, BigDecimal> extraFoodsAssortment = new HashMap<>();
        extraFoodsAssortment.put(bread.getProductName(), bread.getPrice());
        extraFoodsAssortment.put(milk.getProductName(), milk.getPrice());
        extraFoodsAssortment.put(tea.getProductName(), tea.getPrice());
        ExtraFoodsShop extraFoodsShop = new ExtraFoodsShop(extraFoodsAssortment);

        extraFoodsShop.process("Poznan", milk);
        extraFoodsShop.process("Sopot", chocolate);

    }
}
