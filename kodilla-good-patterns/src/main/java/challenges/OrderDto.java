package challenges;

import java.math.BigDecimal;
import java.util.Map;

public class OrderDto {

    private Buyer buyer;
    private Map<Product, Integer> products;
    private boolean isOrdered;
    private BigDecimal totalPrice;

    public OrderDto(Buyer buyer, Map<Product, Integer> products, boolean isOrdered, BigDecimal totalPrice) {
        this.buyer = buyer;
        this.products = products;
        this.isOrdered = isOrdered;
        this.totalPrice = totalPrice;
    }

    public Buyer getBuyer() {
        return buyer;
    }

    public Map<Product, Integer> getProducts() {
        return products;
    }

    public boolean isOrdered() {
        return isOrdered;
    }

    public BigDecimal getTotalPrice() {
        return totalPrice;
    }
}
