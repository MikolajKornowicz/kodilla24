package challenges;

import java.math.BigDecimal;
import java.util.Map;

public class OrderService {

    public BigDecimal makeOrder (Buyer buyer, Map<Product, Integer> productsToBuy) {
        BigDecimal totalPrice = productsToBuy.entrySet().stream()
                .map(productIntegerEntry -> productIntegerEntry.getKey().getPrice().multiply(BigDecimal.valueOf(productIntegerEntry.getValue())))
                .reduce(BigDecimal.ZERO,(bigDecimal, bigDecimal2) -> bigDecimal.add(bigDecimal2));
        System.out.println("Buyer: " + buyer.getUsername() + " bought: " + totalPrice);
        return totalPrice;
    }
}
