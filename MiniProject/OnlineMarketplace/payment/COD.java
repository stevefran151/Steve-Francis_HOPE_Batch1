package OnlineMarketplace.payment;

class COD implements PaymentMethod {
    public void pay(double amt) {
        System.out.println("cash on delivery: " + amt);
    }
}