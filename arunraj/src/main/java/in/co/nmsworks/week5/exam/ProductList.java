package in.co.nmsworks.week5.exam;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ProductList {

    public static void main(String[] args) {
        ProductList pr = new ProductList();
        pr.listToCsv(pr.dbToList());
    }

    private List<Product> dbToList(){
        System.out.println("ARUN");
        List<Product> listOfProducts = new ArrayList<>();
        try {
            String sql = "SELECT * FROM products";
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Training","nms","");
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()){
                Product product = new Product(rs.getInt(1),rs.getString(2),
                        rs.getString(3),rs.getInt(4),rs.getString(5),rs.getString(6),rs.getInt(7));
                listOfProducts.add(product);
            }
            System.out.println(listOfProducts);
        return listOfProducts;

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    private void listToCsv(List<Product> productList){
        try {
            FileWriter fr = new FileWriter("/home/nms/Desktop/FruitVegetables.csv");
            BufferedWriter bw = new BufferedWriter(fr);
            for (Product product : productList){
                if(product.getCategory().equalsIgnoreCase("FruitVegetables")){
                    System.out.println(product);
                    bw.write(String.valueOf(product));
                    bw.newLine();
                }
            }
            bw.close();
            fr.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        try {
            FileWriter fr = new FileWriter("/home/nms/Desktop/FoodGrainsOilMasala.csv");
            BufferedWriter bw = new BufferedWriter(fr);
            for (Product product : productList){
                if(product.getCategory().equalsIgnoreCase("FoodGrainsOilMasala")){
                    bw.write(String.valueOf(product));
                    bw.newLine();
                }
            }
            bw.close();
            fr.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        try {
            FileWriter fr = new FileWriter("/home/nms/Desktop/BakeryCakesDiary.csv");
            BufferedWriter bw = new BufferedWriter(fr);
            for (Product product : productList){
                if(product.getCategory().equalsIgnoreCase("bakeryCakesDairy")){
                    bw.write(String.valueOf(product));
                    bw.newLine();
                }
            }
            bw.close();
            fr.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        try {
            FileWriter fr = new FileWriter("/home/nms/Desktop/Beverage.csv");
            BufferedWriter bw = new BufferedWriter(fr);
            for (Product product : productList){
                if(product.getCategory().equalsIgnoreCase("beverage")){
                    bw.write(String.valueOf(product));
                    bw.newLine();
                }
            }
            bw.close();
            fr.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        try {
            FileWriter fr = new FileWriter("/home/nms/Desktop/SnacksBrandedFoods.csv");
            BufferedWriter bw = new BufferedWriter(fr);
            for (Product product : productList){
                if(product.getCategory().equalsIgnoreCase("SnacksBrandedFoods")){
                    bw.write(String.valueOf(product));
                    bw.newLine();
                }
            }
            bw.close();
            fr.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        try {
            FileWriter fr = new FileWriter("/home/nms/Desktop/CleaningHousehold.csv");
            BufferedWriter bw = new BufferedWriter(fr);
            for (Product product : productList){
                if(product.getCategory().equalsIgnoreCase("CleaningHousehold")){
                    bw.write(String.valueOf(product));
                    bw.newLine();
                }
            }
            bw.close();
            fr.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        try {
            FileWriter fr = new FileWriter("/home/nms/Desktop/PersonalCare.csv");
            BufferedWriter bw = new BufferedWriter(fr);
            for (Product product : productList){
                if(product.getCategory().equalsIgnoreCase("PersonalCare")){
                    bw.write(String.valueOf(product));
                    bw.newLine();
                }
            }
            bw.close();
            fr.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        try {
            FileWriter fr = new FileWriter("/home/nms/Desktop/Electronics.csv");
            BufferedWriter bw = new BufferedWriter(fr);
            for (Product product : productList){
                if(product.getCategory().equalsIgnoreCase("Electronics")){
                    bw.write(String.valueOf(product));
                    bw.newLine();
                }
            }
            bw.close();
            fr.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
