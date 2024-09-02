package in.co.nmsworks.week5.exam;

public class Product {
    private  int id;
    private String title;
    private  String description;
    private String category;
    private  int itemRating;
    private  String image;
    private  float price;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
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

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public Product(int id, String title,String category, int itemRating, String image, String description,float price) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.category = category;
        this.itemRating = itemRating;
        this.image = image;
        this.price = price;
    }

    public Product() {
    }

    @Override
    public String toString() {
        return "Products{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", category='" + category + '\'' +
                ", itemRating=" + itemRating +
                ", image='" + image + '\'' +
                ", price=" + price +
                '}';
    }
}
