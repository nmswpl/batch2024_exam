package in.co.nmsworks.week5.exam;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ProductList {
    public List<Product> listOfProduct() {
        List<Product> products = new ArrayList<>();
        try {
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/training", "nms", "");
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("select * from products");
            while (resultSet.next()) {
                products.add(new Product(resultSet.getInt(1), resultSet.getString(2), resultSet.getString(3), resultSet.getInt(4), resultSet.getString(5), resultSet.getString(6), resultSet.getFloat(7)));
            }

            resultSet.close();
            statement.close();
            connection.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return products;
    }

    public void writingCategoryWise(List<Product> productsList) {
            try {
            FileWriter fileWriter = new FileWriter("/home/nms/Downloads/FruitVegetables.csv");
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.write("ItemID , Title, Category, ItemRating, Image, Description, Price");
            for (Product product : productsList) {
                if ("FruitVegetables".equals(product.getCategory())) {
                    bufferedWriter.newLine();
                    String id = String.valueOf(product.getItemId());
                    bufferedWriter.write(id);
                    bufferedWriter.write(" , ");
                    bufferedWriter.write(product.getTitle());
                    bufferedWriter.write(" , ");
                    bufferedWriter.write(product.getCategory());
                    bufferedWriter.write(" , ");
                    String rating = String.valueOf(product.getItemRating());
                    bufferedWriter.write(rating);
                    bufferedWriter.write(" , ");
                    bufferedWriter.write(product.getImage());
                    bufferedWriter.write(" , ");
                    bufferedWriter.write(product.getDescription());
                    bufferedWriter.write(" , ");
                    String price = String.valueOf(product.getPrice());
                    bufferedWriter.write(price);
                }
            }
            bufferedWriter.close();
            fileWriter.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        //FoodgrainsoilMasala.csv

        try {
            FileWriter fileWriter = new FileWriter("/home/nms/Downloads/FoodgrainsoilMasala.csv");
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.write("ItemID , Title, Category, ItemRating, Image, Description, Price");
            for (Product product : productsList) {
                if ("FoodgrainsoilMasala".equals(product.getCategory())) {
                    bufferedWriter.newLine();
                    String id = String.valueOf(product.getItemId());
                    bufferedWriter.write(id);
                    bufferedWriter.write(" , ");
                    bufferedWriter.write(product.getTitle());
                    bufferedWriter.write(" , ");
                    bufferedWriter.write(product.getCategory());
                    bufferedWriter.write(" , ");
                    String rating = String.valueOf(product.getItemRating());
                    bufferedWriter.write(rating);
                    bufferedWriter.write(" , ");
                    bufferedWriter.write(product.getImage());
                    bufferedWriter.write(" , ");
                    bufferedWriter.write(product.getDescription());
                    bufferedWriter.write(" , ");
                    String price = String.valueOf(product.getPrice());
                    bufferedWriter.write(price);
                }
            }
            bufferedWriter.close();
            fileWriter.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        //BakerycakesDairy.csv

        try {
            FileWriter fileWriter = new FileWriter("/home/nms/Downloads/BakerycakesDairy.csv");
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.write("ItemID , Title, Category, ItemRating, Image, Description, Price");
            for (Product product : productsList) {
                if ("BakerycakesDairy".equals(product.getCategory())) {
                    bufferedWriter.newLine();
                    String id = String.valueOf(product.getItemId());
                    bufferedWriter.write(id);
                    bufferedWriter.write(" , ");
                    bufferedWriter.write(product.getTitle());
                    bufferedWriter.write(" , ");
                    bufferedWriter.write(product.getCategory());
                    bufferedWriter.write(" , ");
                    String rating = String.valueOf(product.getItemRating());
                    bufferedWriter.write(rating);
                    bufferedWriter.write(" , ");
                    bufferedWriter.write(product.getImage());
                    bufferedWriter.write(" , ");
                    bufferedWriter.write(product.getDescription());
                    bufferedWriter.write(" , ");
                    String price = String.valueOf(product.getPrice());
                    bufferedWriter.write(price);
                }
            }
            bufferedWriter.close();
            fileWriter.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        //Beverage

        try {
            FileWriter fileWriter = new FileWriter("/home/nms/Downloads/Beverage.csv");
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.write("ItemID , Title, Category, ItemRating, Image, Description, Price");
            for (Product product : productsList) {
                if ("Beverage".equals(product.getCategory())) {
                    bufferedWriter.newLine();
                    String id = String.valueOf(product.getItemId());
                    bufferedWriter.write(id);
                    bufferedWriter.write(" , ");
                    bufferedWriter.write(product.getTitle());
                    bufferedWriter.write(" , ");
                    bufferedWriter.write(product.getCategory());
                    bufferedWriter.write(" , ");
                    String rating = String.valueOf(product.getItemRating());
                    bufferedWriter.write(rating);
                    bufferedWriter.write(" , ");
                    bufferedWriter.write(product.getImage());
                    bufferedWriter.write(" , ");
                    bufferedWriter.write(product.getDescription());
                    bufferedWriter.write(" , ");
                    String price = String.valueOf(product.getPrice());
                    bufferedWriter.write(price);
                }
            }
            bufferedWriter.close();
            fileWriter.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        // SnacksBrandedFoods.csv

        try {
            FileWriter fileWriter = new FileWriter("/home/nms/Downloads/SnacksBrandedFoods.csv");
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.write("ItemID , Title, Category, ItemRating, Image, Description, Price");
            for (Product product : productsList) {
                if ("SnacksBrandedFoods.csv".equals(product.getCategory())) {
                    bufferedWriter.newLine();
                    String id = String.valueOf(product.getItemId());
                    bufferedWriter.write(id);
                    bufferedWriter.write(" , ");
                    bufferedWriter.write(product.getTitle());
                    bufferedWriter.write(" , ");
                    bufferedWriter.write(product.getCategory());
                    bufferedWriter.write(" , ");
                    String rating = String.valueOf(product.getItemRating());
                    bufferedWriter.write(rating);
                    bufferedWriter.write(" , ");
                    bufferedWriter.write(product.getImage());
                    bufferedWriter.write(" , ");
                    bufferedWriter.write(product.getDescription());
                    bufferedWriter.write(" , ");
                    String price = String.valueOf(product.getPrice());
                    bufferedWriter.write(price);
                }
            }
            bufferedWriter.close();
            fileWriter.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        //PersonalCare.csv

        try {
            FileWriter fileWriter = new FileWriter("/home/nms/Downloads/PersonalCare.csv");
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.write("ItemID , Title, Category, ItemRating, Image, Description, Price");
            for (Product product : productsList) {
                if ("PersonalCare".equals(product.getCategory())) {
                    bufferedWriter.newLine();
                    String id = String.valueOf(product.getItemId());
                    bufferedWriter.write(id);
                    bufferedWriter.write(" , ");
                    bufferedWriter.write(product.getTitle());
                    bufferedWriter.write(" , ");
                    bufferedWriter.write(product.getCategory());
                    bufferedWriter.write(" , ");
                    String rating = String.valueOf(product.getItemRating());
                    bufferedWriter.write(rating);
                    bufferedWriter.write(" , ");
                    bufferedWriter.write(product.getImage());
                    bufferedWriter.write(" , ");
                    bufferedWriter.write(product.getDescription());
                    bufferedWriter.write(" , ");
                    String price = String.valueOf(product.getPrice());
                    bufferedWriter.write(price);
                }
            }
            bufferedWriter.close();
            fileWriter.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        // Electronics.csv

        try {
            FileWriter fileWriter = new FileWriter("/home/nms/Downloads/Electronics.csv");
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.write("ItemID , Title, Category, ItemRating, Image, Description, Price");
            for (Product product : productsList) {
                if ("Electronics".equals(product.getCategory())) {
                    bufferedWriter.newLine();
                    String id = String.valueOf(product.getItemId());
                    bufferedWriter.write(id);
                    bufferedWriter.write(" , ");
                    bufferedWriter.write(product.getTitle());
                    bufferedWriter.write(" , ");
                    bufferedWriter.write(product.getCategory());
                    bufferedWriter.write(" , ");
                    String rating = String.valueOf(product.getItemRating());
                    bufferedWriter.write(rating);
                    bufferedWriter.write(" , ");
                    bufferedWriter.write(product.getImage());
                    bufferedWriter.write(" , ");
                    bufferedWriter.write(product.getDescription());
                    bufferedWriter.write(" , ");
                    String price = String.valueOf(product.getPrice());
                    bufferedWriter.write(price);
                }
            }
            bufferedWriter.close();
            fileWriter.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args) {
        ProductList productList = new ProductList();
        List<Product> productsList = productList.listOfProduct();
        productList.writingCategoryWise(productsList);
    }
}
