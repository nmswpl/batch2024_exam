package in.co.nmsworks.exam;

import java.sql.*;
import java.util.Scanner;

/**
 * 3. Source the given sql file (source /tmp/Sample-SQL-File-100-Rows.sql) (10 Marks)
 * a. Get a Username and password from the Console. Write a program to check the details against the
 * database (user_details table) and print if the username and password is valid or not.
 * Enter username: john24
 * Enter password: 93a5fe6210bfcdb573ccd348e19e6a56
 * Password is Valid
 * b. Create Object UserDetails. Add it to List. Implement the following method
 * private Set<String> getActiveFemaleName(List<UserDetails>)
 */

public class Question3 {

    String name;
    String password;

    public void checkInfo(String name , String password){
        try {
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/training");
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("select password from user_details where username = \"johnd\" ");
            while(rs.next()){
                if(name.equals(rs.getString(2))){
                    System.out.println("Password is valid");
                }
                else{
                    System.out.println("Password is not valid");
                }

            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter username : ");
        String name = scan.nextLine();
        System.out.println(" ");
        System.out.println("Enter Password : ");
        String password = scan.nextLine();

        Question3 q3 = new Question3();
        q3.checkInfo("johnd","5f4dcc3b5aa765d61d8327deb882cf9");
    }
}
