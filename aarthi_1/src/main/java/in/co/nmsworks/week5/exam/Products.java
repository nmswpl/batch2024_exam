package in.co.nmsworks.week5.exam;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class Products {
    Product product = new Product();
    List<Product> products = new ArrayList<>();
    public static void main(String[] args) {
        Products products1 = new Products();
        products1.dataFromSqlToList();
        products1.writeFileAccordingToCategoryWise();
    }
    public List<Product> dataFromSqlToList() {
        try {
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/training", "nms", "");
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("select * from products");

            while (rs.next()) {
                product = new Product(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getInt(4), rs.getString(5), rs.getString(6), rs.getFloat(7));
                products.add(product);
            }
            System.out.println(products.size());
            rs.close();
            stmt.close();
            con.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return products;
    }

    public void writeFileAccordingToCategoryWise() {

        for (Product product1 : products) {
            if (product1.getCategory().equalsIgnoreCase("FruitVegetables")) {
                try {
                    FileWriter fw = new FileWriter("/home/nms/FruitVegetable.csv");
                    BufferedWriter bw = new BufferedWriter(fw);
                    bw.write(String.valueOf(product1));
                    bw.close();
                    fw.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            else if (product1.getCategory().equalsIgnoreCase("FoodgrainsoilMasala")) {
                try {
                    FileWriter fw = new FileWriter("/home/nms/FoodgrainsoilMasala.csv");
                    BufferedWriter bw = new BufferedWriter(fw);
                    bw.write(String.valueOf(product1));
                    bw.close();
                    fw.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            else if (product1.getCategory().equalsIgnoreCase("BakerycakesDairy")) {
                try {
                    FileWriter fw = new FileWriter("/home/nms/BakerycakesDairy.csv");
                    BufferedWriter bw = new BufferedWriter(fw);
                    bw.write(String.valueOf(product1));
                    bw.close();
                    fw.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            else if (product1.getCategory().equalsIgnoreCase("Beverage")) {
                try {
                    FileWriter fw = new FileWriter("/home/nms/Beverage.csv");
                    BufferedWriter bw = new BufferedWriter(fw);
                    bw.write(String.valueOf(product1));
                    bw.close();
                    fw.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            else if (product1.getCategory().equalsIgnoreCase("SnacksBrandedFoods")) {
                try {
                    FileWriter fw = new FileWriter("/home/nms/SnacksBrandedFoods.csv");
                    BufferedWriter bw = new BufferedWriter(fw);
                    bw.write(String.valueOf(product1));
                    bw.close();
                    fw.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            else if (product1.getCategory().equalsIgnoreCase("Cleaninghousehold")) {
                try {
                    FileWriter fw = new FileWriter("/home/nms/Cleaninghousehold.csv");
                    BufferedWriter bw = new BufferedWriter(fw);
                    bw.write(String.valueOf(product1));
                    bw.close();
                    fw.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            else if (product1.getCategory().equalsIgnoreCase("PersonalCare")) {
                try {
                    FileWriter fw = new FileWriter("/home/nms/PersonalCare.csv");
                    BufferedWriter bw = new BufferedWriter(fw);
                    bw.write(String.valueOf(product1));
                    bw.close();
                    fw.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            else if (product1.getCategory().equalsIgnoreCase("Electronics")) {
                try {
                    FileWriter fw = new FileWriter("/home/nms/Electronics.csv");
                    BufferedWriter bw = new BufferedWriter(fw);
                    bw.write(String.valueOf(product1));
                    bw.close();
                    fw.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
}
