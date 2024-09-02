package in.co.nmsworks.week5.exam;

public class Products {
    private Integer itemId;
    private String title;
    private String category;
    private Integer itemRating;
    private String image;
    private String description;
    private Float price;


    public Products() {
    }

    public Products(Integer itemId,String title, String category, Integer itemRating, String image, String description, Float price) {
        this.category = category;
        this.description = description;
        this.image = image;
        this.itemId = itemId;
        this.itemRating = itemRating;
        this.price = price;
        this.title = title;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public Integer getItemId() {
        return itemId;
    }

    public void setItemId(Integer itemId) {
        this.itemId = itemId;
    }

    public Integer getItemRating() {
        return itemRating;
    }

    public void setItemRating(Integer itemRating) {
        this.itemRating = itemRating;
    }

    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }


    @Override
    public String toString() {
        return "Products{" +
                "category='" + category + '\'' +
                ", itemId=" + itemId +
                ", title='" + title + '\'' +
                ", itemRating=" + itemRating +
                ", image='" + image + '\'' +
                ", description='" + description + '\'' +
                ", price=" + price +
                '}';
    }
}
