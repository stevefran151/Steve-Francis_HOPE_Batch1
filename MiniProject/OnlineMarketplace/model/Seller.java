package OnlineMarketplace.model;

import java.util.*;


public class Seller extends User {
    private List<Item> items = new ArrayList<>();

    public Seller(int id, String name) {
        super(id, name);
    }

    public void addItem(Item i) {
        items.add(i);
    }

    public List<Item> getItems() {
        return items;
    }

    void role() {
        System.out.println("Seller: " + getName());
    }

    public void addItem(Item i1) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'addItem'");
    }
}