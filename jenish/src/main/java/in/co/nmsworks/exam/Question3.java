package in.co.nmsworks.exam;

import java.sql.*;
import java.util.*;

public class Question3 {
    public List<UserDetails> readFromDb(){
        List<UserDetails> userDetailsList = new ArrayList<>();
        try (Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/Training","nms","");
             Statement statement = connection.createStatement()){
             String sql = "select * from user_details";
             ResultSet rs = statement.executeQuery(sql);

            while (rs.next()){
                int userId = rs.getInt(1);
                String userName = rs.getString(2);
                String firstName = rs.getString(3);
                String lastName = rs.getString(4);
                String gender = rs.getString(5);
                String password = rs.getString(6);
                boolean status = rs.getBoolean(7);
                UserDetails userDetails = new UserDetails(userId, userName, firstName, lastName, gender, password, status);
                userDetailsList.add(userDetails);
            }
            rs.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        //System.out.println(userDetailsList);
        return userDetailsList;
    }

    public void checkDetails(String userName , String password){
        List<UserDetails> userDetailsList = readFromDb();
        boolean userFound = false;
        for (UserDetails userDetails : userDetailsList) {
            if(userDetails.getUserName().equalsIgnoreCase(userName) && userDetails.getPassword().equalsIgnoreCase(password)){
                System.out.println("The User is a valid user");
                userFound = true;
                break;
            }
        }
        if(!userFound){
            System.out.println("Invalid credentials");
        }
    }

    private Set<String> getActiveFemaleName(List<UserDetails> userDetailsList){
        Set<String> activeFemaleUserSet = new HashSet<>();
        for (UserDetails userDetails : userDetailsList) {
            if(userDetails.isStatus() && userDetails.getGender().equalsIgnoreCase("Female")){
                String name = userDetails.getFirstName()+" "+userDetails.getLastName();
                activeFemaleUserSet.add(name);
            }
        }
        return activeFemaleUserSet;
    }

    public static void main(String[] args) {
        Question3 q3 = new Question3();
        q3.readFromDb();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the userName : ");
        String userName = sc.nextLine();
        System.out.println("Enter the Password : ");
        String password = sc.nextLine();
        q3.checkDetails(userName, password);
        System.out.println("Set of active Female users name...");
        System.out.println(q3.getActiveFemaleName(q3.readFromDb()));
    }
}