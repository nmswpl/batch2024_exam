package in.co.nmsworks.week5.exam;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class Question1 {

    public List<Product> createObject(){
        List<Product> products = new ArrayList<>();
        try {
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/training");
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("select*from products");

            while(rs.next()){
                int id = rs.getInt(1);
                String title = rs.getString(2);
                String category = rs.getString(3);
                int itemRating = rs.getInt(4);
                String image = rs.getString(5);
                String description = rs.getString(6);
                float price = rs.getFloat(7);

                Product product = new Product(id,title,category,itemRating,image,description,price);
                products.add(product);

            }
            System.out.println(products);
            rs.close();
            stmt.close();
            con.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return products;
    }

    public void writeToFile(List<Product> products) {

        try {
            FileWriter fw = new FileWriter("/home/nms/fruitvegetables.csv");
            BufferedWriter bw = new BufferedWriter(fw);
            for (Product product : products) {
                if (product.getCategory().equalsIgnoreCase("fruitvegetables")) {
                    bw.write(product.getCategory());
                    bw.newLine();
                }
            }
            bw.close();
            fw.close();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    public static void main(String[] args) {
        Question1 q1 = new Question1();
        List<Product> products = q1.createObject();
        q1.writeToFile(products);
    }
}
