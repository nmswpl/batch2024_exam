package in.co.nmsworks.week5.exam;

public class Product {
    private int itemId;
    private String title;
    private String category;
    private int itemRating;
    private String image;
    private String description;
    private float price;

    public int getItemId() {
        return itemId;
    }

    public void setItemId(int itemId) {
        this.itemId = itemId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public int getItemRating() {
        return itemRating;
    }

    public void setItemRating(int itemRating) {
        this.itemRating = itemRating;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public Product() {
    }

    public Product(int itemId, String title, String category, int itemRating, String image, String description, float price) {
        this.itemId = itemId;
        this.title = title;
        this.category = category;
        this.itemRating = itemRating;
        this.image = image;
        this.description = description;
        this.price = price;
    }

    @Override
    public String toString() {
        return
                "itemId=" + itemId +
                ", title='" + title + '\'' +
                ", category='" + category + '\'' +
                ", itemRating=" + itemRating +
                ", image='" + image + '\'' +
                ", description='" + description + '\'' +
                ", price=" + price +
                '}';
    }
}
