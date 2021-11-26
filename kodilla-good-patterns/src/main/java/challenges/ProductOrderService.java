package challenges;

public class ProductOrderService {

    private static Product product;
    private static Buyer buyer;
    private static Seller seller;
    private int quantity;


    public ProductOrderService(Product product, Buyer buyer, Seller seller, int quantity) {
        this.product = product;
        this.buyer = buyer;
        this.seller = seller;
        this.quantity = quantity;

    }


    public  void totalPricecalculator(double price, int quantity) {
        this.quantity = quantity;
        double total = price * quantity;
        System.out.println("Total price: " + total + " PLN");

    }
    public void order () {
        System.out.println("Buyer: " + buyer.getUsername() + " bought: " + product.getName() + " amount: " + quantity  + " from: " + "Seller: " + seller.getUsername());
    }

    public int getQuantity() {
        return quantity;
    }
}
