package in.co.nmsworks.exam;

import java.util.ArrayList;
import java.util.List;

 public class User
 {

    private int userid;
    private   String name;
    private String password;
    private String firstName;
    private   String lastName;
    private   String gender;
    private int status;
    List<User> listOfUsers;


    public int getUserid() {
        return userid;
    }

    public void setUserid(int userid) {
        this.userid = userid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
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

     public User() {
     }

     public User(int userid, String name, String firstName, String lastName, String gender,String password, int status) {
        setUserid(userid);
        setName(name);
        setFirstName(firstName);
        setLastName(lastName);
        setGender(gender);
         setPassword(password);
        setStatus(status);
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }


    @Override
    public String toString() {
        return "User{" +
                "userid=" + userid +
                ", name='" + name + '\'' +
                ", password='" + password + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", gender='" + gender + '\'' +
                ", status=" + status +
                '}';
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }
}