package in.co.nmsworks;

public class UserDetails {
    private int user_id;
    private String userName;
    private String first_name;
    private String last_name;
    private String password;
    private int status;
    public enum gender{
        MALE,
        FEMALE
    }

    public UserDetails(String first_name, String last_name, String password, int status, int user_id, String userName) {
        this.first_name = first_name;
        this.last_name = last_name;
        this.password = password;
        this.status = status;
        this.user_id = user_id;
        this.userName = userName;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
}
