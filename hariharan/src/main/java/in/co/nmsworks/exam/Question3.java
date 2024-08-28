package in.co.nmsworks.exam;

import javax.jws.soap.SOAPBinding;
import java.sql.*;
import java.util.*;

public class Question3 {
    static private Connection connection;
    static private PreparedStatement preparedStatement;
    static private ResultSet resultSet;
    static List<UserDetails> userDetailsList = new ArrayList<>();

    public Question3(){

        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/training","nms","");
        } catch (SQLException e) {
            System.out.println(e);
        }
    }
    public static void main(String[] args) throws SQLException {

        Question3 question3 = new Question3();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the user name:");
        String userName = sc.nextLine();

        System.out.println("Enter the password");
        String password = sc.nextLine();



        try {
            question3.connectToDB(userName,password);
            question3.addToList();
            Set<String> activeFemaleEmployeeName = question3.getActiveFemaleName(userDetailsList);
            for (String employeeName : activeFemaleEmployeeName) {
                System.out.println("Name: "+employeeName);
            }


        } catch (SQLException e) {
            System.out.println(e);
        }finally {
            connection.close();
            preparedStatement.close();
            resultSet.close();
        }

    }

    public void connectToDB(String userName, String password) throws SQLException {
        try {
            preparedStatement = connection.prepareStatement("select username, password from user_details where username = ?");
            preparedStatement.setString(1,userName);
            resultSet = preparedStatement.executeQuery();
            while (resultSet.next()){
                if(resultSet.getString(1).equals(userName) && resultSet.getString(2).equals(password)){
                    System.out.println("\nPassword is valid");
                }else{
                    System.out.println("Invalid password");
                }
            }

        } catch (SQLException e) {
            System.out.println(e);
        }

    }

    public void addToList(){
       try {
           preparedStatement = connection.prepareStatement("select * from user_details");
           resultSet = preparedStatement.executeQuery();
           while (resultSet.next()){
               UserDetails userData = new UserDetails(resultSet.getInt(1),resultSet.getString(2),resultSet.getString(3),resultSet.getString(4),resultSet.getString(5),resultSet.getInt(7));
               userDetailsList.add(userData);
           }
       }catch (Exception e){
           System.out.println(e);
       }
    }

    private Set<String> getActiveFemaleName(List<UserDetails> userDetailsList){
        Set<String> nameSet = new HashSet<>();
        for (UserDetails userDetails : userDetailsList) {
       if(userDetails.getGender().equals("Female") && userDetails.getStatus() ==1)
           nameSet.add(userDetails.getFirstName() +" " + userDetails.getLastName());
        }
        return  nameSet;
    }
}
