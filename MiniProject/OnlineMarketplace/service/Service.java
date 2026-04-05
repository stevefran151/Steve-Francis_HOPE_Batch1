package OnlineMarketplace.service;
   
import java.util.List;
import java.util.ArrayList;

public class Service {
    private List<Item> items = new ArrayList<>();

    public void add(Item i) {
        items.add(i);
    }

    public void display() {
        for (Item i : items) {
            System.out.println(
                i.getId() + " " +
                i.getTitle() + " Rs." +
                i.getPrice() +
                " rating:" + i.getRating()
            );
        }
    }

    public Item getItem(int id) {
        for (Item i : items) {
            if (i.getId().equals(String.valueOf(id)))
                return i;
        }
        return null;
    }
}
