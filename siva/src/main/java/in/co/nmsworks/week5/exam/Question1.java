package in.co.nmsworks.week5.exam;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class Question1 {
    public static void main(String[] args) {
        Question1 question1 = new Question1();
        System.out.println(question1.getDetailsFromDb());
    }
    public List<ProductsDetail> getDetailsFromDb(){
        List<ProductsDetail> productsDetails = new ArrayList<>();
        try {
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/training");
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("select * from products");
            while(rs.next()){
                productsDetails.add(new ProductsDetail(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getInt(4),rs.getString(5),rs.getString(6),Float.parseFloat(rs.getString(7))));

            }
            rs.close();
            stmt.close();
            con.close();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return productsDetails;

    }
}
