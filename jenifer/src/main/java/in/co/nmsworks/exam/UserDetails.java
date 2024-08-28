package in.co.nmsworks.exam;

public class UserDetails {
    private int userID;
    private String userName;
    private String firstName;
    private String lastName;
    private String password;
    private String gender;
    private int status;

    public int getUserID() {
        return userID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
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

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getGender() {
        return gender;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public UserDetails() {
    }

    public UserDetails(String firstName, String lastName, String gender, int status) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.status = status;


    }

}
