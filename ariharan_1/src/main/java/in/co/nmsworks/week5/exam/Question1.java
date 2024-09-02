package in.co.nmsworks.week5.exam;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class Question1 {
    public List<product> readFromDatabase(){
        List<product> productsList=new ArrayList<>();
        try (Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/training");
             PreparedStatement ps=con.prepareStatement("select * from products")){
            ResultSet rs=ps.executeQuery();
            while (rs.next()){
                product product=new product();
                product.setItemId(rs.getInt(1));
                product.setTitle(rs.getString(2));
                product.setDescription(rs.getString(6));
                product.setCategory(rs.getString(3));
                product.setItemRating(rs.getInt(4));
                product.setImage(rs.getString(5));
                product.setPrice(Float.parseFloat(rs.getString(7)));
                productsList.add(product);
            }
            rs.close();

        }catch (Exception e){
            e.printStackTrace();
        }
        return productsList;
    }

    public static void main( String[] args ){
        System.out.println(new Question1().readFromDatabase());
    }
}
//itemid      | int          | NO   |     | NULL    |       |
//        | title       | varchar(255) | YES  |     | NULL    |       |
//        | category    | varchar(40)  | NO   |     | NULL    |       |
//        | item_rating | int          | NO   |     | NULL    |       |
//        | image       | varchar(90)  | NO   |     | NULL    |       |
//        | description | varchar(800) | NO   |     | NULL    |       |
//        | price       | varchar(20)
