package OnlineMarketplace.model;

import java.util.List;
import java.util.ArrayList;

public class Customer extends User {
    private List<Order> myOrders = new ArrayList<>();

    public Customer(int id, String name) {
        super(id, name);
    }

    public void addOrder(Order o) {
        myOrders.add(o);
    }

    public void showOrders() {
        if (myOrders.isEmpty()) {
            System.out.println("no orders yet");
            return;
        }

        for (Order o : myOrders) {
            o.printOrder();
        }
    }

    void role() {
        System.out.println("Customer: " + getName());
    }
}
