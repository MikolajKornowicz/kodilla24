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
        extraFoodsShop.process("Poznan", milk, new BigDecimal("2"));
        extraFoodsShop.process("Sopot", chocolate, new BigDecimal("2"));
        extraFoodsShop.process("Poznan", milk, new BigDecimal("2"));

        System.out.println("\n");

        Product bathSalts = new Product("Bath Salts", new BigDecimal("25.70"));
        Product showerGel = new Product("Shower Gel", new BigDecimal("18.28"));
        Product shampoo = new Product("Shampoo", new BigDecimal("23.05"));
        Map<String, BigDecimal> healthyShopAssortment = new HashMap<>();
        healthyShopAssortment.put(bathSalts.getProductName(), bathSalts.getPrice());
        healthyShopAssortment.put(showerGel.getProductName(), showerGel.getPrice());
        healthyShopAssortment.put(shampoo.getProductName(), shampoo.getPrice());
        HealthyShop healthyShop = new HealthyShop(healthyShopAssortment);
        healthyShop.process("Warsaw", shampoo, new BigDecimal("5"));
        healthyShop.process("Berlin", milk, new BigDecimal("1"));

        System.out.println("\n");

        Product cake = new Product("Cake", new BigDecimal("55.35"));
        Product muffin = new Product("Muffin", new BigDecimal("14.88"));
        Map<String, BigDecimal> glutenFreeShopAssortment = new HashMap<>();
        glutenFreeShopAssortment.put(cake.getProductName(), cake.getPrice());
        glutenFreeShopAssortment.put(chocolate.getProductName(), chocolate.getPrice());
        glutenFreeShopAssortment.put(muffin.getProductName(), muffin.getPrice());
        GlutenFreeShop glutenFreeShop = new GlutenFreeShop(glutenFreeShopAssortment);
        glutenFreeShop.process("Gdynia", cake, new BigDecimal("5"));
        glutenFreeShop.process("Zakopane", chocolate, new BigDecimal("7"));
        glutenFreeShop.process("Paris", muffin, new BigDecimal("10"));
        glutenFreeShop.process("Paris", muffin, new BigDecimal("1"));

    }
}
