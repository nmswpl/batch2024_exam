package in.co.nmsworks.week5.exam;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class Question1 {
    List<Product> products = new ArrayList<>();

    public List<Product> createObject() {
        try (Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/training", "nms", "");
             PreparedStatement ps = c.prepareStatement("select * from products")) {

            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Product product = new Product();
                product.setId(rs.getInt(1));
                product.setTitle(rs.getString(2));
                product.setCategory(rs.getString(3));
                product.setItemRating(rs.getInt(4));
                product.setImage(rs.getString(5));
                product.setDescription(rs.getString(6));
                product.setPrice(Float.parseFloat(rs.getString(7)));
                products.add(product);
            }


        } catch (Exception e) {
            e.printStackTrace();
        }

        return products;
    }
public void writeFile(List<Product> products){
    List<Product> fruitVeg = new ArrayList<>();
    List<Product> foodGrain = new ArrayList<>();
    List<Product> bakery = new ArrayList<>();
    List<Product> beverage = new ArrayList<>();
    List<Product> snack = new ArrayList<>();
    List<Product> cleaning = new ArrayList<>();
    List<Product> personal = new ArrayList<>();
    List<Product> electronics = new ArrayList<>();
    for (Product product : products) {
        if(product.getCategory().equalsIgnoreCase("fruitvegetables")) {
            fruitVeg.add(product);
        }
       else if(product.getCategory().equalsIgnoreCase("FoodgrainsoilMasala")) {
            foodGrain.add(product);
        }
        else if(product.getCategory().equalsIgnoreCase("BakerycakesDairy")) {
            bakery.add(product);
        }
        else if(product.getCategory().equalsIgnoreCase("Beverage")) {
            beverage.add(product);
        }
        else if(product.getCategory().equalsIgnoreCase("SnacksBrandedFoods")) {
            snack.add(product);
        }
        else if(product.getCategory().equalsIgnoreCase("Cleaninghousehold")) {
            cleaning.add(product);
        }
        else if(product.getCategory().equalsIgnoreCase("PersonalCare")) {
            personal.add(product);
        }
        else{
            electronics.add(product);
        }

    }

    try(FileWriter fw = new FileWriter("/home/nms/FruitVegetables.csv");
        BufferedWriter bw = new BufferedWriter(fw)){
        for (Product product : fruitVeg) {
            bw.write(product.getId()+","+product.getDescription()+","+product.getTitle()+","+product.getCategory()+","+product.getItemRating()+","+product.getImage()+","+product.getPrice());
            bw.newLine();
        }

    }
    catch (Exception e){
        e.printStackTrace();

    }
    try(FileWriter fw = new FileWriter("/home/nms/FoodgrainsoilMasala.csv");
        BufferedWriter bw = new BufferedWriter(fw)){
        for (Product product : foodGrain) {
            bw.write(product.getId()+","+product.getDescription()+","+product.getTitle()+","+product.getCategory()+","+product.getItemRating()+","+product.getImage()+","+product.getPrice());
            bw.newLine();
        }

    }
    catch (Exception e){
        e.printStackTrace();

    }
    try(FileWriter fw = new FileWriter("/home/nms/BakerycakesDairy.csv");
        BufferedWriter bw = new BufferedWriter(fw)){
        for (Product product : bakery) {
            bw.write(product.getId()+","+product.getDescription()+","+product.getTitle()+","+product.getCategory()+","+product.getItemRating()+","+product.getImage()+","+product.getPrice());
            bw.newLine();
        }

    }
    catch (Exception e){
        e.printStackTrace();

    }
    try(FileWriter fw = new FileWriter("/home/nms/Beverage.csv");
        BufferedWriter bw = new BufferedWriter(fw)){
        for (Product product : beverage) {
            bw.write(product.getId()+","+product.getDescription()+","+product.getTitle()+","+product.getCategory()+","+product.getItemRating()+","+product.getImage()+","+product.getPrice());
            bw.newLine();
        }

    }
    catch (Exception e){
        e.printStackTrace();

    }
    try(FileWriter fw = new FileWriter("/home/nms/Cleaninghousehold.csv");
        BufferedWriter bw = new BufferedWriter(fw)){
        for (Product product : cleaning) {
            bw.write(product.getId()+","+product.getDescription()+","+product.getTitle()+","+product.getCategory()+","+product.getItemRating()+","+product.getImage()+","+product.getPrice());
            bw.newLine();
        }

    }
    catch (Exception e){
        e.printStackTrace();

    }
    try(FileWriter fw = new FileWriter("/home/nms/PersonalCare.csv");
        BufferedWriter bw = new BufferedWriter(fw)){
        for (Product product : personal) {
            bw.write(product.getId()+","+product.getDescription()+","+product.getTitle()+","+product.getCategory()+","+product.getItemRating()+","+product.getImage()+","+product.getPrice());
            bw.newLine();
        }

    }
    catch (Exception e){
        e.printStackTrace();

    }
    try(FileWriter fw = new FileWriter("/home/nms/Electronics.csv");
        BufferedWriter bw = new BufferedWriter(fw)){
        for (Product product : electronics) {
            bw.write(product.getId()+","+product.getDescription()+","+product.getTitle()+","+product.getCategory()+","+product.getItemRating()+","+product.getImage()+","+product.getPrice());
            bw.newLine();
        }

    }
    catch (Exception e){
        e.printStackTrace();

    }
    try(FileWriter fw = new FileWriter("/home/nms/SnacksBrandedFoods.csv");
        BufferedWriter bw = new BufferedWriter(fw)){
        for (Product product : snack) {
            bw.write(product.getId()+","+product.getDescription()+","+product.getTitle()+","+product.getCategory()+","+product.getItemRating()+","+product.getImage()+","+product.getPrice());
            bw.newLine();
        }

    }
    catch (Exception e){
        e.printStackTrace();

    }




    }
    public static void main(String[] args) {
        Question1 q = new Question1();
  q.writeFile(q.createObject());
       //System.out.println(q.createObject().size());
    }
}

