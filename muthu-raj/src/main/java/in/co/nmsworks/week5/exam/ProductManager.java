package in.co.nmsworks.week5.exam;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ProductManager {

    static Connection con;
    ProductManager()
    {
        String sql = "jdbc:mysql://localhost:3306/training";
        try
        {
            con = DriverManager.getConnection(sql);
        }
        catch (Exception e)
        {
            System.out.println("DB Error");
            e.printStackTrace();
        }
    }
    static void close()
    {
        try
        {
            con.close();
        }
        catch (Exception e)
        {
            System.out.println("Error in closing");
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {

        ProductManager pm = new ProductManager();
        List<Product> productList = getProductList();
//        writeIntoFile(productList);
        writeIntoFile2(productList);
        close();
    }

    private static void writeIntoFile2(List<Product> productList) {
        Map<String, List<Product>> categoryToProductList = new HashMap<>();

        for (Product product : productList) {
            String category = product.getCategory();
            List<Product> temp;
            if(categoryToProductList.containsKey(category))
            {
                temp = categoryToProductList.get(category);
            }
            else
            {
                temp = new ArrayList<>();
            }
            temp.add(product);
            categoryToProductList.put(category,temp);
        }
        System.out.println(categoryToProductList);
    }


    private static void writeIntoFile(List<Product> productList) {
        for (Product product : productList) {
            String category = product.getCategory();
            try (FileWriter fw = new FileWriter("/home/nms/Downloads/productCategories/" + category + ".txt", true);
            BufferedWriter br = new BufferedWriter(fw))
            {

                String row = product.getItemID() + ","
                        + "\"" + product.getTitle() + "\""+ ","
                        + "\""  + product.getCategory() + "\"" + ", "
                        + product.getItemRating() + ", "
                        + "\"" +product.getImage() +"\"" + ", "
                        + "\"" +product.getDescription()+"\""  + ", "
                        + product.getPrice() + "\n";
                br.append(row);
            }
            catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    private static List<Product> getProductList() {

        List<Product> productList = new ArrayList<>();

        String sql = "SELECT * FROM products";

        try(PreparedStatement ps = con.prepareStatement(sql))
        {
            try(ResultSet rs = ps.executeQuery())
            {
                Product p;
                while(rs.next())
                {
                    p = new Product(rs.getInt(1),
                            rs.getString(2),
                            rs.getString(3),
                            rs.getInt(4),
                            rs.getString(5),
                            rs.getString(6),
                            rs.getFloat(7));
                    productList.add(p);
                }
            }
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        for (Product product : productList) {
            System.out.println(product);
        }

        return productList;
    }

}
