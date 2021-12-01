package challenges;

import org.springframework.core.annotation.Order;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

public class ShopApp {
    public static void main(String[] args) {
        BigDecimal bigDecimal;
  Buyer buyer = new Buyer("JKowalski", "John", "Kowalski", "jkowal@gmail.com");
  Seller seller = new Seller("Tshirts.com", "Jane", "Doe");
  Product product = new Product("T-shirt", "Clothes", new BigDecimal("24.44"));

  InformationService informationService = new InformationService();
  OrderService orderService = new OrderService();
  OrderRepository orderRepository = new OrderRepository();
  OrderRequest orderRequest = new OrderRequest(buyer);

  Map<Product, Integer> ordered = new HashMap<>();
  ordered.put(product, 4);

  orderRequest.setProducts(ordered);


  OrderProcessor orderProcessor = new OrderProcessor(informationService, orderService, orderRepository);

  orderProcessor.process(orderRequest);
        }
    }

