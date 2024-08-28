package in.co.nmsworks.exam;

import java.sql.*;
import java.util.*;

/*
Source the given sql file (source /tmp/Sample-SQL-File-100-Rows.sql) (10 Marks)
a. Get a Username and password from the Console. Write a program to check the details against the
database (user_details table) and print if the username and password is valid or not.
Enter username: john24
Enter password: 93a5fe6210bfcdb573ccd348e19e6a56
Password is Valid
b. Create Object UserDetails. Add it to List. Implement the following method
private Set<String> getActiveFemaleName(List<UserDetails>)
 */

public class CheckDetailsFromDatabase {
    Connection connection;

    public void checkUserDetails() {
        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/training", "nms", "");
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("select *from user_details");
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter Username : ");
            String username = scanner.nextLine();
            System.out.println("Enter password : ");
            String password = scanner.nextLine();
            while (resultSet.next()) {
                //System.out.println("User id : " +resultSet.getInt(1) + " User Name : " + resultSet.getString(2) + " First Name : " + resultSet.getString(3) + " Last Name : " + resultSet.getString(4) + " Gender : " + resultSet.getString(5) + " Password : " + resultSet.getString(6));
                if (username.equals(resultSet.getString(2)) && password.equals(resultSet.getString(6))) {
                    System.out.println("Password is valid");
                }
            }
            resultSet.close();
            statement.close();
            connection.close();
        } catch (SQLException ex) {
            throw new RuntimeException(ex);
        }
    }


    public List<UserDetails> getUserDetails() {

        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/training", "nms", "");
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("select *from user_details");
            List<UserDetails> userDetailsList = new ArrayList<>();
            while (resultSet.next()) {
                UserDetails userDetails = new UserDetails(resultSet.getString(3), resultSet.getString(4), resultSet.getString(5), resultSet.getInt(7));
                userDetailsList.add(userDetails);
            }

            return userDetailsList;

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    private Set<String> getActiveFemaleList() {
        Set<String> activeFemaleList = new HashSet<>();
        for (UserDetails userDetails : getUserDetails()) {
            if ("female".equals(userDetails.getGender()) && 1 == userDetails.getStatus()){
                activeFemaleList.add(userDetails.getFirstName().concat(userDetails.getLastName()));
            }
        }
        return activeFemaleList;
    }


public static void main(String[] args) {
    CheckDetailsFromDatabase checkDetailsFromDatabase = new CheckDetailsFromDatabase();
    checkDetailsFromDatabase.checkUserDetails();
    checkDetailsFromDatabase.getUserDetails();
    System.out.println(checkDetailsFromDatabase.getActiveFemaleList());
}
}
