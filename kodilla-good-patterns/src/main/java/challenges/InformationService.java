package challenges;

import java.math.BigDecimal;
import java.util.Map;

public class InformationService {
    private Buyer buyer;
    private OrderRequest orderRequest;
    private OrderService service;

    public void sendEmail (String mail, Map<Product, Integer> product, BigDecimal totalPrice){
        String name = buyer.getName();
        String email = buyer.geteMail();
        BigDecimal total  = service.makeOrder(buyer, orderRequest.getProducts());

        System.out.println("Send to: " + email + "\n" + "Hello, " + name +".\n"+
        "Thank You for using our shop. \n" +
                "Your oder of: " + orderRequest.getProducts() + " total price: " + total +  "PLN. has been completed");
    }
}
