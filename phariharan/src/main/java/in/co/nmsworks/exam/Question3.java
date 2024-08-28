package in.co.nmsworks.exam;

import java.sql.*;
import java.util.*;

/**
 * Get a Username and password from the Console. Write a program to check the details against the
 * database (user_details table) and print if the username and password is valid or not.
 * Enter username: john24
 * Enter password: 93a5fe6210bfcdb573ccd348e19e6a56
 * Password is Valid
 * b. Create Object UserDetails. Add it to List. Implement the following method
 * private Set<String> getActiveFemaleName(List<UserDetails>)
 */

public class Question3 {
    static Connection conn;
    static Scanner sc = new Scanner(System.in);

    public Question3() {
        try {
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/training");
        } catch (Exception e) {
            System.out.println("Sql not connected !");
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        Question3 question3 = new Question3();
        question3.userNameIsValid("nancyc", "43d8cdd758d8fae5b1b33d9f8eb807c3");
        List<UserDetail> userDetailsList = Question3.getUserDetailsList();
        Set<String> activeFemaleNameSet = question3.getActiveFemaleName(userDetailsList);
        System.out.println(activeFemaleNameSet);
        question3.close();
    }


    private Set<String> getActiveFemaleName(List<UserDetail> userDetailsList) {
        Set<String> activeFemaleNameSet = new HashSet<>();
        for (UserDetail userDetails : userDetailsList) {
            if ("female".equalsIgnoreCase(userDetails.getGender()) & userDetails.getActive()) {
                activeFemaleNameSet.add(userDetails.getName());
            }
        }
        return activeFemaleNameSet;
    }

    private static List<UserDetail> getUserDetailsList() {
        try (Statement statement = conn.createStatement()) {
            List<UserDetail> userDetailList = new ArrayList<>();

            ResultSet rs = statement.executeQuery("select * from user_details");
            while (rs.next()) {
                int i = 1;
                userDetailList.add(new UserDetail(rs.getInt(i), rs.getString(++i), rs.getString(++i), rs.getString(++i), rs.getString(++i), rs.getString(++i), rs.getInt(++i)));
            }

            assert rs != null;
            rs.close();
            return userDetailList;

        } catch (SQLException e) {
            System.out.println("LIST not created !!");
            e.printStackTrace();
        }
        return null;
    }

    private void userNameIsValid(String username, String password) {
        try (PreparedStatement preparedStatement = conn.prepareStatement("Select * from user_details where username = ? and password = ?")) {
            preparedStatement.setString(1, username.trim());
            preparedStatement.setString(2, password.trim());

            ResultSet rs = preparedStatement.executeQuery();
            if (!rs.next()) {
                System.out.println("Password is not valid");
            } else {
                System.out.println("password is valid");
            }
            assert rs != null;
            rs.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    private void close() {//To close the opened connections
        if (conn != null) {
            try {
                if (conn != null) {
                    conn.close();
                    System.out.println("Connection Closed");
                }
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
