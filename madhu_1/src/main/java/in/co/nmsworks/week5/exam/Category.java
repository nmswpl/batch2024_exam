package in.co.nmsworks.week5.exam;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.*;

public class Category {

    public static void  main(String[] args){
        try{
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/training", "nms","");
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("select * from products order by category");
            FileWriter fw = new FileWriter("/home/nms/Category.csv");
            BufferedWriter bw = new BufferedWriter(fw);
            while (rs.next()){
                int id =  rs.getInt("itemId");
                String title =  rs.getString("title");
                String category =  rs.getString("category");
                int itemRating =  rs.getInt("item_rating");
                String image = rs.getString("image");
                String desc = rs.getString("description");
                float price = rs.getFloat("price");
                bw.write(id);
                bw.write(title);
                bw.write(category);
                bw.write(itemRating);
                bw.write(image);
                bw.write(desc);

            }stmt.close();
            con.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
