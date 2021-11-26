package challenges;

public class ShopApp {
    public static void main(String[] args) {
        Buyer buyer1 = new Buyer("Buyer123", "Antony", "Smith");
        Seller seller1 = new Seller("Shop1", "Jack", "Nowak");
        Product product1 = new Product("T-shirt", "Clothes", 29.87);
        ProductOrderService orderService = new ProductOrderService(product1, buyer1, seller1, 2);

       orderService.totalPricecalculator(product1.getPrice(), orderService.getQuantity());
       orderService.order();
        }
    }

