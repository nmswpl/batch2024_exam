package in.co.nmsworks.week5;

import javax.swing.*;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.MalformedParameterizedTypeException;
import java.sql.*;
import java.util.*;

public class ProductDetails {
    List<Product> listOfProducts = new ArrayList<>();
    List<String> stringList = new ArrayList<>();

    public List<Product> getDataFromDb() {
        try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/training");
             Statement stmt = con.createStatement()) {
            ResultSet rs = stmt.executeQuery("SELECT * from products ");

            while (rs.next()) {
                int id = rs.getInt(1);
                String title = rs.getString(2);
                String category = rs.getString(3);
                int rating = rs.getInt(4);
                String image = rs.getString(5);
                String desc = rs.getString(6);
                float price = rs.getFloat(7);

                Product obj = new Product(id, title, category, rating, image, desc, price);
                listOfProducts.add(obj);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return listOfProducts;
    }

    public void display(List<Product> list) {
        for (Product listOfProduct : listOfProducts) {
            System.out.println(listOfProduct);
        }
    }

    Map<String, List<String>> map = new HashMap<>();

    public Map<String, List<String>> getCategoryWiseMap(List<Product> list) {


        for (Product product : list)
        {

            if (map.containsKey(product.getCategory()))
            {
                stringList.add("\n " + product.getId() + "," + product.getTitle() + "," + product.getCategory()+","+product.getItemRating() + "," + product.getImage() + "," + product.getDescription() + "," + product.getPrice());
                map.put((product.getCategory()), stringList);
            }
            else
            {
                stringList = new ArrayList<>();
                stringList.add(" " + product.getId() + "," + product.getTitle() + "," + product.getCategory()+","+ product.getItemRating() + "," + product.getImage() + "," + product.getDescription() + "," + product.getPrice());
                map.putIfAbsent(product.getCategory(), stringList);
            }
        }


        //   FileWriter fw=new FileWriter("/home/nms/Downloads/"+category);
        //     BufferedWriter bw=BufferedWriter(fw);

        for (Map.Entry<String, List<String>> e1 : map.entrySet()) {
            System.out.println(e1.getKey() + " " + e1.getValue());
        }
        return map;
    }

    public void writeInFileCategoryWise(Map<String, List<String>> map) throws IOException {
        for (Map.Entry<String, List<String>> e : map.entrySet()) {
            String path = "/home/nms/Downloads/CSV/" + e.getKey() + ".txt";

            FileWriter fw = new FileWriter(path);
            BufferedWriter bw = new BufferedWriter(fw);

            bw.write(e.getValue().toString());

            bw.flush();
            bw.close();
            fw.close();
        }

    }

    public static void main(String[] args) throws IOException {
        ProductDetails obj = new ProductDetails();
        List<Product> list = obj.getDataFromDb();
        //   obj.display(list);
        Map<String, List<String>> map = obj.getCategoryWiseMap(list);
        obj.writeInFileCategoryWise(map);
    }
}

