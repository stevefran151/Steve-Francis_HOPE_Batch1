package OnlineMarketplace.payment;


public class UPI implements PaymentMethod {
    public void pay(double amt) {
        System.out.println("paid " + amt + " using upi");
    }
}