package in.co.nmsworks.exam;

import java.sql.*;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * b. Create Object UserDetails. Add it to List. Implement the following method
 *  * private Set<String> getActiveFemaleName(List<UserDetails>)
 */

public class UserDetails {

    int user_id;
    String username;
    String first_name;
    String last_name;
    String gender;
    String password;
    int status;

    List<UserDetails> userDetails = new ArrayList<>();
    Set<String> femaleNames = new HashSet<>();

    private Set<String> getActiveFemaleName(List<UserDetails> userDetails){


        try {
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/training");
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("select username from user_details where gender = \"Female\"");

            while(rs.next()){

                if(rs.getInt(7)==1){
                    femaleNames.add(rs.getString(2));

                }

            }


        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        return femaleNames;
    }

    public static void main(String[] args) {
        UserDetails usd = new UserDetails();
        //usd.getActiveFemaleName();

    }

}
