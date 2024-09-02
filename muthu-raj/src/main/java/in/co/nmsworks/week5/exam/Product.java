package in.co.nmsworks.week5.exam;

public class Product {
    private int itemID;
    private String title;
    private String category;
    private int itemRating;
    private String image;
    private String description;
    private float price;

    public Product(int itemID, String title, String category, int itemRating, String image, String description, float price) {
        this.itemID = itemID;
        this.title = title;
        this.category = category;
        this.itemRating = itemRating;
        this.image = image;
        this.description = description;
        this.price = price;
    }

    public int getItemID() {
        return itemID;
    }

    public String getTitle() {
        return title;
    }

    public String getCategory() {
        return category;
    }

    public int getItemRating() {
        return itemRating;
    }

    public String getImage() {
        return image;
    }

    public String getDescription() {
        return description;
    }

    public float getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "itemID=" + itemID +
                ", title='" + title + '\'' +
                ", category='" + category + '\'' +
                ", itemRating=" + itemRating +
                ", image='" + image + '\'' +
                ", description='" + description + '\'' +
                ", price=" + price +
                '}';
    }
}
