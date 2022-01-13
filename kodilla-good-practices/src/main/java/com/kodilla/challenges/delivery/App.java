package com.kodilla.challenges.delivery;


import java.math.BigDecimal;


class App {
    public static void main (String[] args){
Product product1 = new Product("Bread",new BigDecimal("5.15"));
Product product2 = new Product("Soy Milk", new BigDecimal("6.49"));
Product product3 = new Product("Soup", new BigDecimal("25.99"));
HealthyShop healthyShop = new HealthyShop();
GlutenFreeShop glutenFreeShop = new GlutenFreeShop();
ExtraFoodsShop extraFoodsShop =  new ExtraFoodsShop();

healthyShop.addHealthyShopAssortment(product1, 50);
healthyShop.process("Gdynia", product1, 1);
         System.out.println("\n");
glutenFreeShop.addGlutenFreeAssortment(product2, 10);
glutenFreeShop.process("Sopot", product2, 10);
glutenFreeShop.process("Sopot", product2, 1);
        System.out.println("\n");
extraFoodsShop.addExtraFoodAssortment(product1, 10);
extraFoodsShop.addExtraFoodAssortment(product2, 10);
extraFoodsShop.addExtraFoodAssortment(product3, 10);
extraFoodsShop.process("Poznań", product1, 1);
extraFoodsShop.process("Poznań", product2, 1);
extraFoodsShop.process("Poznań", product3, 1);
    }
}
