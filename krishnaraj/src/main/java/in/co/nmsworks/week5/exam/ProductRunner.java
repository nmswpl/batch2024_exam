package in.co.nmsworks.week5.exam;

import java.io.*;
import java.sql.*;
import java.util.*;

public class ProductRunner {
    public List<Product> getProductList() {
        List<Product> productList = new ArrayList<>();
        try {
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/training");
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("select * from products");
            while (resultSet.next()) {
                int itemId = resultSet.getInt(1);
                String title = resultSet.getString(2);
                String category = resultSet.getString(3);
                int item_rating = resultSet.getInt(4);
                String image = resultSet.getString(5);
                String description = resultSet.getString(6);
                float price = resultSet.getFloat(7);
                productList.add(new Product(itemId, title, category, item_rating, image, description, price));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return productList;
    }

    public void writeProductCategory(List<Product> productList) {
        Map<String, List<Product>> categoryWiseProducts = getCategoryWiseProducts(productList);
        writeToCSVFile(categoryWiseProducts);
    }

    private static Map<String, List<Product>> getCategoryWiseProducts(List<Product> productList) {
        Map<String, List<Product>> categoryToMap = new HashMap<>();
        List<Product> listofProduct ;

        for (Product product : productList) {
            if (categoryToMap.containsKey(product.getCategory())) {
                listofProduct = categoryToMap.get(product.getCategory());
            } else {
                listofProduct = new ArrayList<>();
                categoryToMap.put(product.getCategory(), listofProduct);
            }
            listofProduct.add(product);
        }
        return categoryToMap;
    }

    private static void writeToCSVFile(Map<String, List<Product>> categoryToMap) {
        int count = 1;

        for (String categoryKey : categoryToMap.keySet()) {
            try {
                String url = "/home/nms/Downloads/csv/" + categoryKey+".txt";
                FileWriter fileWriter1 = new FileWriter(url, true);
                BufferedWriter bufferedWriter1 = new BufferedWriter(fileWriter1);
                for (Product product : categoryToMap.get(categoryKey)) {
                    String productString = product.getItemid() + "," + product.getTitle() + "," + product.getCategory() + "," + product.getItem_rating() + "," + product.getImage() + "," + product.getPrice();
                    bufferedWriter1.write(productString);
                    bufferedWriter1.newLine();
                    bufferedWriter1.flush();
                }
                bufferedWriter1.close();
                fileWriter1.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        ProductRunner productRunner = new ProductRunner();
        List<Product> productList = productRunner.getProductList();
        productRunner.writeProductCategory(productList);
    }
}
