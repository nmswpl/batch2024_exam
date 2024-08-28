package in.co.nmsworks.exam;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.*;

public class User {
    private  int userId;
    private String username;
    private  String firstName;
    private  String lastName;
    private  String gender;
    private  String password;
    private  boolean status;

    public User() {
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public void setUserDetailsList(List<User> userDetailsList) {
        this.userDetailsList = userDetailsList;
    }

    public User(int userId, String username,String firstName,String lastName,String gender,String password, boolean status ) {
        this.status = status;
        this.password = password;
        this.gender = gender;
        this.lastName = lastName;
        this.firstName = firstName;
        this.username = username;
        this.userId = userId;
    }

    @Override
    public String toString() {
        return "User{" +
                "userId=" + userId +
                ", username='" + username + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", gender='" + gender + '\'' +
                ", password='" + password + '\'' +
                ", status=" + status +
                '}';
    }

    List<User> userDetailsList= new ArrayList<>();
    public void validateUser(String username,String password  ) {
        try (Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/training", "nms", "");
             PreparedStatement ps = c.prepareStatement("select password from user_details where username = ? ")) {
            ps.setString(1,username);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                if(rs.getString(1).equalsIgnoreCase(password)){
                    System.out.println("Password valid");
                }
                else{
                    System.out.println("Password invalid");
                }
            }



        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public List<User> getUserDetailsList(){
        try (Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/training", "nms", "");
             PreparedStatement ps = c.prepareStatement("select * from user_details")) {
              ResultSet rs = ps.executeQuery();
              while(rs.next()){
                  User user = new User(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6),rs.getBoolean(7));
                  userDetailsList.add(user);
              }
        }
        catch (Exception e){
            e.printStackTrace();
        }
        System.out.println(userDetailsList);
        return userDetailsList;
    }

    private Set<String> getActiveFemaleName(List<User> userDetailsList) {
        Set<String> activeFemaleNames = new HashSet<>();
        try (Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/training", "nms", "");
             PreparedStatement ps = c.prepareStatement("select concat(first_name,' ',last_name) as name from user_details where gender ='female' and status =1")) {
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                String name = rs.getString(1);
                activeFemaleNames.add(name);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        for (String activeFemaleName : activeFemaleNames) {
            System.out.println(activeFemaleName);
        }
        return  activeFemaleNames;

    }




    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        User u = new User();
        /*u.validateUser("davidj" ,"e6a33eee180b07e563d74fee8c2c66b8");
        u.getUserDetailsList();*/
        u.getActiveFemaleName(u.getUserDetailsList());
    }
}
