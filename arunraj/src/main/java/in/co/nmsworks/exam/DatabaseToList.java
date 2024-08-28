package in.co.nmsworks.exam;

import java.sql.*;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class DatabaseToList {
    public static void main(String[] args) {
        DatabaseToList db = new DatabaseToList();
        System.out.println(db.getActiveFemaleName(db.dbToUserDetailList()));
        String validName = db.userValidOrNot("david","e6a33eee180b07e563d74fee8c2c66b8");
        System.out.println("Username : "+validName+" is valid");

    }

    public List<UserDetail> dbToUserDetailList(){
        try {
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Training","nms","");
            String sql = "SELECT * FROM user_details";
            PreparedStatement stmt = con.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();
            List<UserDetail> listOfUserDetails = new ArrayList<>();

            while (rs.next()){
                UserDetail userDetail = new UserDetail(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6),rs.getInt(7));
                listOfUserDetails.add(userDetail);
            }

            rs.close();
            stmt.close();
            con.close();
            return listOfUserDetails;

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public String userValidOrNot(String name , String pwd){
        String userName = "";
        for (UserDetail userDetail : dbToUserDetailList()){
            if(userDetail.getUserName().equals(name) && userDetail.getPassword().equals(pwd)){
                 userName = userDetail.getUserName();
            }
        }
        return userName;
    }

    private Set<String> getActiveFemaleName(List<UserDetail> listOfUsers){
        Set<String> activeFemales = new HashSet<>();
        for(UserDetail userDetail : listOfUsers){
            if(userDetail.getGender().equals("Female") && userDetail.getStatus() == 1){
                activeFemales.add(userDetail.getFirstName()+" "+userDetail.getLastName());
            }
        }
        return activeFemales;
    }
}

/*for (UserDetail userDetail : listOfUserDetails){
                System.out.println(userDetail);
            }

 */
