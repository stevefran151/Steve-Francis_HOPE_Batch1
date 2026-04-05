package OnlineMarketplace.app;

import OnlineMarketplace.model.*;
import OnlineMarketplace.payment.*;
import OnlineMarketplace.service.*;

public class MainApp {
    public static void main(String[] args) {

        try {
            Service m = new Service();

            Seller s = new Seller(1, "Amazon Seller");
            Customer c = new Customer(2, "Steve");

            Item i1 = new Item(101, "iPhone 15", 80000, 5);
            Item i2 = new Item(102, "Samsung S24", 70000, 3);
            Item i3 = new Item(103, "Sony Headphones", 15000, 10);

            s.addItem(i1);
            s.addItem(i2);
            s.addItem(i3);

            m.add(i1);
            m.add(i2);
            m.add(i3);

            System.out.println("Products:");
            m.display();

            Order o1 = new Order(i1, 2);

            PaymentMethod p = new UPI(); 
            o1.checkout(p);

            c.addOrder(o1);

            // rating feature
            i1.addRating(5);
            i1.addRating(4);

            System.out.println("\nOrders:");
            c.showOrders();

        } catch (Exception e) {
            System.out.println("err: " + e.getMessage());
        }
    }
}
