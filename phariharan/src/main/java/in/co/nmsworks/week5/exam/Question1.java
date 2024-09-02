package in.co.nmsworks.week5.exam;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.*;
import java.util.*;

public class Question1 {


    public static void main(String[] args) {
        Question1 question1 = new Question1();
        List<Product> productList = question1.getProductList();

//        System.out.println("idem_id");
        question1.csvWriter(question1.mapGenerator(productList));

    }

    private List<Product> getProductList() {
        try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/training");
             Statement statement = conn.createStatement();) {
            List<Product> productList = new ArrayList<>();
            ResultSet rs = statement.executeQuery("SELECT * FROM products");
            while (rs.next()) {
                int i = 0;
                productList.add(new Product(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getInt(4), rs.getString(5), rs.getString(6), Float.parseFloat(rs.getString(7))));
            }
            return productList;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }

    private void csvWriter(List<Product> productList) {
        String filepath = "/home/nms/Desktop/Products/";

        for (Product product : productList) {
            String filepath1 = filepath + product.getCategory() + ".csv";
            try (FileWriter fw = new FileWriter(filepath1, true);
                 BufferedWriter bw = new BufferedWriter(fw)) {
                String input = "\"" + product.getItemId() + "\",\"" + product.getTitle() + "\",\"" + product.getCategory() + "\",\"" + product.getItemRating() + "\",\"" + product.getImage() + "\",\"" + product.getDescription() + "\",\"" + product.getPrice() + "\"";
                bw.append(input);
                bw.newLine();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }

    private Map<String, List<Product>> mapGenerator(List<Product> productList) {
        Map<String, List<Product>> productToCategoryMap = new HashMap<>();

        for (Product product : productList) {
            if (productToCategoryMap.containsKey(product.getCategory())) {
                productToCategoryMap.get(product.getCategory()).add(product);
            } else {
                List<Product> list = new ArrayList<>();
                list.add(product);
                productToCategoryMap.put(product.getCategory(), list);
            }
        }
        return productToCategoryMap;
    }

    private void csvWriter(Map<String, List<Product>> productToCategoryMap) {
        String filePath = "/home/nms/Desktop/Products/";

        for (String category : productToCategoryMap.keySet()) {
            String filePath1 = filePath + productToCategoryMap.get(category).get(1).getCategory() + ".csv";
            try (FileWriter fw = new FileWriter(filePath1, true);
                 BufferedWriter bw = new BufferedWriter(fw)) {
                bw.newLine();
                for (Product product : productToCategoryMap.get(category)) {
                    String input = "\"" + product.getItemId() + "\",\"" + product.getTitle() + "\",\"" + product.getCategory() + "\",\"" + product.getItemRating() + "\",\"" + product.getImage() + "\",\"" + product.getDescription() + "\",\"" + product.getPrice() + "\"";
                    bw.write(input);
                    bw.newLine();
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
