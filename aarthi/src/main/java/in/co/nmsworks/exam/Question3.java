package in.co.nmsworks.exam;
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

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class Question3 {
    Integer userId;
    String userName;
    String firstName;
    String lastName;
    String gender;
    String password;
    Integer status;
    Scanner scanner = new Scanner(System.in);
    String name;
    String pw;
    List<UserDetails> userDetailsList =new ArrayList<>();

    public void connectToDb(){
        try {
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost: 3306/training","nms","");
            Statement stmt = connection.createStatement();
            ResultSet rs = stmt.executeQuery("select * from user_details" );
            System.out.println("Enter the Name::");
            name = scanner.nextLine();
            System.out.println("Enter the Password::");
            pw = scanner.nextLine();
            while(rs.next()){
                userId = rs.getInt(1);
                userName = rs.getString(2);
                firstName = rs.getString(3);
                lastName = rs.getString(4);
                gender = rs.getString(5);
                password = rs.getString(6);
                status = rs.getInt(7);
                userDetailsList.add(new UserDetails(userId,userName,firstName,lastName,gender,password,status));
                stmt.executeQuery("select * from user_details");
                System.out.println(userDetailsList);
                if(name.equals(userName) && (pw.equals(password))){
                    System.out.println("Password is vaild");
                }else{
                    System.out.println("Password is not vaild");
                    return;
                }
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    //private Set<String> getActiveFemaleName(List<UserDetails> userDetailsList){


   // }

    public static void main(String[] args) {
        Question3 userDetails = new Question3();
        userDetails.connectToDb();
        Question3 UserDetails =new Question3();



    }

}
