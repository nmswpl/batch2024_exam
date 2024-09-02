package in.co.nmsworks.week5.exam;

/**/
public class Products {
    private int itemId;
    private String title;
    private String category;
    private int item_rating;
    private String image;
    private String description;
    private float price;

    //Getter Setter
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
        return item_rating;
    }

    public void setItemRating(int item_rating) {
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

    //toString
    @Override
    public String toString() {
        return "Products{" +
                "itemId=" + itemId +
                ", title='" + title + '\'' +
                ", category='" + category + '\'' +
                ", item_rating=" + item_rating +
                ", image='" + image + '\'' +
                ", description='" + description + '\'' +
                ", price=" + price +
                '}';
    }

    //constructor
    public Products() {
    }

    public Products(int itemId, String title, String category, int item_rating, String image, String description, float price) {
        this.itemId = itemId;
        this.title = title;
        this.category = category;
        this.item_rating = item_rating;
        this.image = image;
        this.description = description;
        this.price = price;
    }

}

