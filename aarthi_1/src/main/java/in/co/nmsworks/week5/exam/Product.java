package in.co.nmsworks.week5.exam;
/*
Read the table products
return a list of Objects.
write category wise product in seperate file(in CSV format). Category name should be the file name
 */

public class Product {
    private Integer itemId;
    private String title;
    private String category;
    private Integer itemRating;
    private String image;
    private String description;
    private Float price;

    public Integer getItemId() {
        return itemId;
    }

    public void setItemId(Integer itemId) {
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

    public Integer getItemRating() {
        return itemRating;
    }

    public void setItemRating(Integer itemRating) {
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

    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }

    public Product() {
    }

    public Product(Integer itemId, String title, String category, Integer itemRating, String image, String description, Float price) {
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
                 itemId +
                "," + title  +
                "," + category  +
                "," + itemRating +
                "," + image  +
                "," + description  +
                "," + price;
    }
}
