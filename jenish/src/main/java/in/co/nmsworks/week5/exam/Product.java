package in.co.nmsworks.week5.exam;

public class Product {
   private int itemId;
   private String title;
   private String category;
   private int itemRating;
   private String imageUrl;
   private String description;
   private float price;

   public Product() {
   }

   public Product(int itemId, String title, String category, int itemRating, String imageUrl, String description, float price) {
      this.itemId = itemId;
      this.title = title;
      this.category = category;
      this.itemRating = itemRating;
      this.imageUrl = imageUrl;
      this.description = description;
      this.price = price;
   }

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

   public String getImageUrl() {
      return imageUrl;
   }

   public void setImageUrl(String imageUrl) {
      this.imageUrl = imageUrl;
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

   public String toCsv() {
      return  itemId+", "+
              '"' +title+ '"' +", "+
              '"'+category+'"' +", "+
              '"'+itemRating+'"' +", "+
              '"'+imageUrl+'"' +", "+
              '"'+description+'"' +", "+
              price;
   }
}