package in.co.nmsworks;
/*
Get a Username and password from the Console. Write a program to check the details against the
database (user_details table) and print if the username and password is valid or not.
Enter username: john24
Enter password: 93a5fe6210bfcdb573ccd348e19e6a56
Password is Valid
b. Create Object UserDetails. Add it to List. Implement the following method
private Set<String> getActiveFemaleName(List<UserDetails>)
 */

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class GetDataFromDB {
    public void connectToDb()
    {
        try(Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/training","nms","");
            PreparedStatement preparedStatement = connection.prepareStatement("select username,password from user_details where username like ? and password like ?")) {

            Scanner scan = new Scanner(System.in);
            System.out.println("Enter the username : ");
            String username = scan.nextLine();

            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter the password : ");
            String password = scanner.nextLine();

            preparedStatement.executeQuery();



        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args) {

        GetDataFromDB data = new GetDataFromDB();
        data.connectToDb();
    }
}
