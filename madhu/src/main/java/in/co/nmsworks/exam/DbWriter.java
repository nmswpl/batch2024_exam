package in.co.nmsworks.exam;

import java.sql.*;
import java.util.List;
import java.util.Scanner;

public class DbWriter {
    public static void main(String[] args) throws SQLException {
        DbWriter db = new DbWriter();
        db.checkUserDetails();
        DbWriter userDetails = new DbWriter();
    }
    public void checkUserDetails() throws SQLException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter user name :");
        String userName = sc.nextLine();
        System.out.println("Enter password :");
        String password = sc.nextLine();
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/training" "");
        PreparedStatement ps = connection.prepareStatement("select * from user_details");
        ResultSet rs = ps.getResultSet();
        while(rs.next()){
            ps

        }
    }

    public void addDetails(){

    }
}


