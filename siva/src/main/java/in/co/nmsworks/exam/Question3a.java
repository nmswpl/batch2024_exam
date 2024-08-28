package in.co.nmsworks.exam;

import java.sql.*;
import java.util.Scanner;

/**
 * a. Get a Username and password from the Console. Write a program to check the details against the
 * database (user_details table) and print if the username and password is valid or not.
 * Enter username: john24
 * Enter password: 93a5fe6210bfcdb573ccd348e19e6a56
 */

public class Question3a {
    public static void main(String[] args) {
        Question3a question3a = new Question3a();
        question3a.checkTheDetails();

    }
public void checkTheDetails(){
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter the User Name :: ");
    String username = scanner.nextLine();
    System.out.println("Enter the password ::");
    String password = scanner.nextLine();
     try {
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/training");
         PreparedStatement ps = con.prepareStatement("select  username,password from user_details where username = ? and password = ?");
         ps.setString(1,username);
         ps.setString(2,password);
         ResultSet rs = ps.executeQuery();
         while(rs.next()){
             if(rs.getString(1).equals(username) && rs.getString(2).equals(password)){
                 System.out.println("user name and password Valid");
             }
             else {
                 System.out.println("User name and Password Invalid");
             }
         }
         rs.close();
         ps.close();
         con.close();

    } catch (SQLException e) {
        throw new RuntimeException(e);
    }
}
}
