package in.co.nmsworks.exam;
//user_id | username   | first_name | last_name | gender | password   | status |


public class UserDetails {
    private int userId;
    private String userName;
    private String firstName;
    private String lastName;
    private String gender;
    private String password;
    private int status;

    public int getUserId(){
        return userId;
    }

    public void setUserId( int userId ){
        this.userId = userId;
    }

    public String getUserName(){
        return userName;
    }

    public void setUserName( String userName ){
        this.userName = userName;
    }

    public String getFirstName(){
        return firstName;
    }

    public void setFirstName( String firstName ){
        this.firstName = firstName;
    }

    public String getLastName(){
        return lastName;
    }

    public void setLastName( String lastName ){
        this.lastName = lastName;
    }

    public String getGender(){
        return gender;
    }

    public void setGender( String gender ){
        this.gender = gender;
    }

    public String getPassword(){
        return password;
    }

    public void setPassword( String password ){
        this.password = password;
    }

    public int getStatus(){
        return status;
    }

    public void setStatus( int status ){
        this.status = status;
    }

    @Override
    public String toString(){
        return "UserDetails{" +
                "userId=" + userId +
                ", userName='" + userName + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", gender='" + gender + '\'' +
                ", password='" + password + '\'' +
                ", status=" + status +
                '}';
    }
}
