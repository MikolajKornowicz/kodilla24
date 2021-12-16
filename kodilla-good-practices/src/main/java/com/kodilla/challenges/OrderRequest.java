package com.kodilla.challenges;

import java.util.Map;

public class OrderRequest {
    private Buyer buyer;
    private Seller seller;
    private Map<Product, Integer> products;

    public OrderRequest(Buyer buyer, Seller seller) {
        this.buyer = buyer;
        this.seller = seller;
    }

    public Buyer getBuyer() {
        return buyer;
    }

    public void setBuyer(Buyer buyer) {
        this.buyer = buyer;
    }

    public Seller getSeller () {return seller;}

    public Map<Product, Integer> getProducts() {
        return products;
    }

    public void setProducts(Map<Product, Integer> products) {
        this.products = products;
    }
}
