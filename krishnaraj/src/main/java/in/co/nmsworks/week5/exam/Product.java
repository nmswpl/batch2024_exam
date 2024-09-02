package in.co.nmsworks.week5.exam;

public class Product {
    private int itemid;
    private String title;
    private String category;
    private int item_rating;
    private String image;
    private String description;
    private float price;

    public Product() {
    }

    public Product(int itemid, String title, String category, int item_rating, String image, String description, float price) {
        this.itemid = itemid;
        this.title = title;
        this.category = category;
        this.item_rating = item_rating;
        this.image = image;
        this.description = description;
        this.price = price;
    }

    public int getItemid() {
        return itemid;
    }

    public void setItemid(int itemid) {
        this.itemid = itemid;
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

    public int getItem_rating() {
        return item_rating;
    }

    public void setItem_rating(int item_rating) {
        this.item_rating = item_rating;
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

    @Override
    public String toString() {
        return "Product{" +
                "itemid=" + itemid +
                ", title='" + title + '\'' +
                ", category='" + category + '\'' +
                ", item_rating=" + item_rating +
                ", image='" + image + '\'' +
                ", description='" + description + '\'' +
                ", price=" + price +
                '}';
    }
}
