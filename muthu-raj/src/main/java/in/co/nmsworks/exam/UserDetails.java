package in.co.nmsworks.exam;

public class UserDetails {

    private enum Gender{
        MALE,
        FEMALE
    }

    private int userID;
    private String userName;
    private String firstName;
    private String lastName;
    private String gender;
    private String password;
    private int status;

    public UserDetails(int userID, String userName, String firstName, String lastName, String gender, String password, int status) {
        this.userID = userID;
        this.userName = userName;
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = String.valueOf(Gender.valueOf(gender.toUpperCase()));
        this.password = password;
        this.status = status;
    }

    public int getUserID() {
        return userID;
    }

    public String getUserName() {
        return userName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getGender() {
        return gender;
    }

    public String getPassword() {
        return password;
    }

    public int getStatus() {
        return status;
    }

    @Override
    public String toString() {
        return "UserDetails{" +
                "userID=" + userID +
                ", userName='" + userName + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", gender='" + gender + '\'' +
                ", password='" + password + '\'' +
                ", status=" + status +
                '}';
    }
}
