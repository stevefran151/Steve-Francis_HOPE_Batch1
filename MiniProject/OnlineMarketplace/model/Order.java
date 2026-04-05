package OnlineMarketplace.model;
import OnlineMarketplace.payment.*;
// no imports needed

public class Order {
    private Item item;
    private int qty;
    private double total;

    public Order(Item item, int qty) throws Exception {
        if (qty <= 0)
            throw new IllegalArgumentException("wrong qty");

        item.updateStock(qty);
        this.item = item;
        this.qty = qty;

        double price = item.getPrice();

        if (qty >= 2) {
            price = price * 0.9;
        }

        total = price * qty;
    }

    public void checkout(PaymentMethod p) {
        p.pay(total);
    }

    public void printOrder() {
        System.out.println(item.getTitle() + " x" + qty + " = " + total);
    }
}