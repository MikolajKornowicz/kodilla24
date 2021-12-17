package com.kodilla.challenges;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;


public class ShopApp {
    public static void main(String[] args) {

        Buyer buyer = new Buyer("JKowalski", "John", "Kowalski", "jkowal@gmail.com");
        Seller seller = new Seller("Tshirts.com", "Jane", "Doe");
        Product product = new Product("T-shirt", "Clothes", new BigDecimal("24.44"));

        InformationService informationService = new InformationService();
        OrderService orderService = new OrderService();
        OrderRepository orderRepository = new OrderRepository();
        OrderRequest orderRequest = new OrderRequest(buyer, seller);

        Map<Product, Integer> ordered = new HashMap<>();
        ordered.put(product, 4);

        orderRequest.setProducts(ordered);

        OrderProcessor orderProcessor = new OrderProcessor(informationService, orderService, orderRepository);
        orderProcessor.process(orderRequest);

        System.out.println("\n");System.out.println("\n");

        Buyer buyer2 = new Buyer("Andrzej", "Andrzej", "Polak", "Polak@gmail.com");
        Seller seller2 = new Seller("sklepnarciarza.com", "Kolega", "Dody");
        Product product2 = new Product("Narty", "Sport i Akcesoria", new BigDecimal("9999.99"));

        InformationService informationService2 = new InformationService();
        OrderService orderService2 = new OrderService();
        OrderRequest orderRequest2 = new OrderRequest(buyer2, seller2);

        Map<Product, Integer> ordered2 = new HashMap<>();
        ordered2.put(product2, 2);
        orderRequest2.setProducts(ordered2);

        OrderProcessor orderProcessor2 = new OrderProcessor(informationService2, orderService2, orderRepository);
        orderProcessor2.process(orderRequest2);



    }

}
