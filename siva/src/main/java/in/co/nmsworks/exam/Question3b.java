package in.co.nmsworks.exam;

import java.sql.*;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Question3b {
    public static void main(String[] args) {
        Question3b question3b = new Question3b();
        //System.out.println(question3b.getDetailsFromDb());
        System.out.println("Active Female Name Set Size :: "+question3b.getActiveFemaleName(question3b.getDetailsFromDb()).size());
    }

    public List<UserDetails> getDetailsFromDb() {
        List<UserDetails> userDetailsList = new ArrayList<>();
        Connection con = null;
        try {
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/training");
            PreparedStatement ps = con.prepareStatement("select  * from user_details");
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                userDetailsList.add(new UserDetails(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6), rs.getInt(7)));
            }
            rs.close();
            ps.close();
            con.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        return userDetailsList;


    }

    private Set<String> getActiveFemaleName(List<UserDetails> userDetailsList) {

        Set<String> activeFemaleSet = new HashSet<>();
        for (UserDetails userDetails : userDetailsList) {

            if (userDetails.getStatus() == 1 && userDetails.getGender().equals("Female")) {
                activeFemaleSet.add(userDetails.getFirst_name() + " " + userDetails.getLast_name());

            }

        }
        return activeFemaleSet;

    }
}
