package OnlineMarketplace.model;

class Item {
    private int id;
    private String title;
    private double price;
    private int stock;

    private double rating = 0;
    private int ratingCount = 0;

    public Item(int id, String title, double price, int stock) {
        if (price < 0 || stock < 0)
            throw new IllegalArgumentException("invalid input");

        this.id = id;
        this.title = title;
        this.price = price;
        this.stock = stock;
    }

    public int getId() { return id; }
    public String getTitle() { return title; }
    public double getPrice() { return price; }
    public int getStock() { return stock; }
    public double getRating() { return rating; }

    public void updateStock(int qty) throws Exception {
        if (qty > stock)
            throw new Exception("out of stock");
        stock -= qty;
    }

    public void addRating(int r) {
        if (r < 1 || r > 5) return;
        rating = ((rating * ratingCount) + r) / (++ratingCount);
    }
}