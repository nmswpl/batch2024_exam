package in.co.nmsworks.week5.exam;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ProductJDBC {
    public static void  main(String[] args){
        List<Products> product = new ArrayList<>();
        try{
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/training", "nms","");
        Statement stmt = con.createStatement();
        ResultSet rs = stmt.executeQuery("select * from products");
        while (rs.next()){
           int id =  rs.getInt("itemId");
           String title =  rs.getString("title");
           String category =  rs.getString("category");
           int itemRating =  rs.getInt("item_rating");
           String image = rs.getString("image");
           String desc = rs.getString("description");
           float price = rs.getFloat("price");
            //Products  p = new Products(200,"Mango","Fruits",5,"Mango.jpg","yellow",150);
            Products p = new Products(id,title,category,itemRating,image,desc,price);
            product.add(p);
            System.out.println(product);

        }stmt.close();
            con.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }
}
