package in.co.nmsworks.exam;

import java.sql.*;
import java.util.*;

public class DatabaseValidation {

    public void checkUserToPassword(String userName, String password) {
        String url = "jdbc:mysql://localhost:3306/training";
        String sql = "Select username,password from user_details";
        boolean isUserPasswordCheck = false;
        try {
            Connection connection = DriverManager.getConnection(url);
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                String dbUserName = resultSet.getString(1);
                String dbUserPassword = resultSet.getString(2);
                if (userName.equalsIgnoreCase(dbUserName) && password.equalsIgnoreCase(dbUserPassword)) {
                    System.out.println("Password is valid");
                    isUserPasswordCheck = true;
                }
            }
            if (!isUserPasswordCheck) {
                System.out.println("Not valid");
            }
            resultSet.close();
            preparedStatement.close();
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public List<UserDetails> userDeatilsList() {
        String url = "jdbc:mysql://localhost:3306/training";
        String sql = "Select * from user_details";
        List<UserDetails> userDetailsList1 = new ArrayList<>();
        try {
            Connection connection = DriverManager.getConnection(url);
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                int userId = resultSet.getInt(1);
                String userName = resultSet.getString(2);
                String firstname = resultSet.getString(3);
                String lastName = resultSet.getString(4);
                String gender = resultSet.getString(5);
                String password = resultSet.getString(6);
                boolean status = resultSet.getBoolean(7);
                userDetailsList1.add(new UserDetails(userId, userName, firstname, lastName, gender, password, status));
            }
            resultSet.close();
            preparedStatement.close();
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return userDetailsList1;
    }

    private Set<String> getActiveFemaleName(List<UserDetails> userDetailsList) {
        Set<String> setOfActiveFemale = new HashSet<>();
        for (UserDetails userDetail : userDetailsList) {
            String gender = userDetail.getGender();
            boolean status = userDetail.isStatus();

            if (gender.equalsIgnoreCase("Female")) {
                if (status == true) {
                    setOfActiveFemale.add(userDetail.getUsername());
                }
            }
        }
        return setOfActiveFemale;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DatabaseValidation databaseValidation = new DatabaseValidation();

        System.out.println("Enter an userName : ");
        String userName = scanner.nextLine();
        System.out.println("Enter an Password : ");
        String userPassword = scanner.nextLine();
        databaseValidation.checkUserToPassword(userName, userPassword);
        // databaseValidation.checkUserToPassword("davidj", "e6a33eee180b07e563d74fee8c2c66b8");

        List<UserDetails> userDetailsList1 = databaseValidation.userDeatilsList();

//        for (UserDetails userDetails : userDetailsList1) {
//            System.out.println(userDetails.isStatus());
//            System.out.println(userDetails.getGender());
//            System.out.println(userDetails.getUser_id());
//        }

        Set<String> listOfactiveFemale = databaseValidation.getActiveFemaleName(userDetailsList1);
        for (String name : listOfactiveFemale) {
            System.out.println(name);
        }
    }
}
