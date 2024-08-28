package in.co.nmsworks.exam;

public class UserDetail {
    private String name;
    private int userId;
    private String userName;
    private String gender;
    private String password;
    private Boolean isActive;

    public UserDetail(int userId, String userName,String firstName,String last_name, String gender, String password, int status) {
        this.name = firstName+" "+last_name;
        this.userId = userId;
        this.userName = userName;
        this.gender = gender;
        this.password = password;
        this.isActive = (status == 0)?false:true;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
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

    public Boolean getActive() {
        return isActive;
    }

    public void setActive(Boolean active) {
        isActive = active;
    }

    @Override
    public String toString() {
        return "UserDetail{" +
                "name='" + name + '\'' +
                ", userId=" + userId +
                ", userName='" + userName + '\'' +
                ", gender='" + gender + '\'' +
                ", password='" + password + '\'' +
                ", isActive=" + isActive +
                '}';
    }
}
