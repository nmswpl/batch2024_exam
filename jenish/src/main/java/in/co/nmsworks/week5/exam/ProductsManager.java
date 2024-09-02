package in.co.nmsworks.week5.exam;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ProductsManager {

    public List<Product> getListOfProducts() {
        String sql = "select * from products";
        List<Product> productList = new ArrayList<>();
        try (Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/Training", "nms", "");
             Statement statement = connection.createStatement()) {

            ResultSet rs = statement.executeQuery(sql);
            while (rs.next()) {
                int itemId = rs.getInt(1);
                String title = rs.getString(2).trim();
                String category = rs.getString(3).trim();
                int itemRating = rs.getInt(4);
                String imageUrl = rs.getString(5).trim();
                String description = rs.getString(6).trim();
                float price = rs.getFloat(7);
                Product product = new Product(itemId, title, category, itemRating, imageUrl, description, price);
                productList.add(product);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return productList;
    }

    public void writeCategoryWiseProducts(List<Product> productList) {
        Map<String, List<Product>> categoryWiseProducts = new HashMap<>();

        for (Product product : productList) {
            categoryWiseProducts
                    .computeIfAbsent(product.getCategory(), k -> new ArrayList<>())
                    .add(product);
        }

        for (Map.Entry<String, List<Product>> entry : categoryWiseProducts.entrySet()) {
            String category = entry.getKey();
            List<Product> products = entry.getValue();
            try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("/home/nms/Csv/" + category + ".csv"))) {
                for (Product product : products) {
                    bufferedWriter.write(product.toCsv());
                    bufferedWriter.newLine();
                }

            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public static void main(String[] args) {
        ProductsManager productsManager = new ProductsManager();
        List<Product> productList = productsManager.getListOfProducts();
        productsManager.writeCategoryWiseProducts(productList);
    }
}