package in.co.nmsworks.week5.exam;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ProductList {
    Products products = new Products();
    List<Products> productList = new ArrayList<>();
    public void getDataFromDB(){
        try(Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/training","nms","");
            PreparedStatement preparedStatement = connection.prepareStatement("select * from products")){
            ResultSet rs = preparedStatement.executeQuery();

            while (rs.next()) {
                Integer itemId = rs.getInt(1);
                String title = rs.getString(2);
                String category = rs.getString(3);
                Integer itemRating = rs.getInt(4);
                String image = rs.getString(5);
                String description = rs.getString(6);
                Float price = rs.getFloat(7);
                productList.add(new Products(itemId, title, category, itemRating, image, description, price));
            }

            System.out.println(productList);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args) {
        ProductList product = new ProductList();
        product.getDataFromDB();
    }
}
