package in.co.nmsworks.exam;

import java.sql.*;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class UserDetails
{
    List<User> listOfUser=new ArrayList<>();
    Set<String> activeFemaleSet =new HashSet<>();

    public void checkValidity(String username,String password) throws SQLException {
        try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/training");
             Statement stmt = con.createStatement()) {
            String sql = "select * from user_details where username =\"" + username + "\" and password=\"" + password + "\"";
            //  System.out.println(sql);
            ResultSet rs = stmt.executeQuery(sql);
            while (rs.next())
            {
                String name = rs.getString(2);
                if ((rs.getString(2)).isEmpty())
                {
                    System.out.println(" INVALID USER DETAILS !!");
                }
                else
                {
                    System.out.println("  VALID USER ");
                }
            }

        }
    }

    public List<User> getDataFromDb() throws SQLException
    {
       // List<User> listOfUser=new ArrayList<>();
        try(Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/training");
        Statement stmt= con.createStatement())
        {
            String sql = "select * from user_details";
            ResultSet rs = stmt.executeQuery(sql);
            while (rs.next())
            {
                int userid=rs.getInt(1);
                String name=rs.getString(2);
                String firstName= rs.getString(3);
                String lastName=rs.getString(4);
                String gender=rs.getString(5);
                String password=rs.getString(6);
                int status=rs.getInt(7);

                User ob=new User(userid,name,firstName,lastName,gender,password,status);
                listOfUser.add(ob);
            }
        }
        return listOfUser;
    }

    private Set<String> getActiveFemaleName(List<User> listOfUser)
    {
        for (User user : listOfUser)
        {
            if(user.getGender().equalsIgnoreCase("Female"))
            {
                 activeFemaleSet.add(user.getName());
            }
        }
        return activeFemaleSet;
    }

    public void displayFemaleList(Set<String> s)
    {
        for (String string : activeFemaleSet)
        {
            System.out.println(string);
        }
    }

public static void main(String[] args) throws SQLException {
    UserDetails ob=new UserDetails();
    ob.checkValidity("sarahs","8f14e45fceea167a5a36dedd4bea2543");
  //  ob.checkValidity("saras","8f14e45fceea167a5a36dedd4bea2543");
    List<User> list= ob.getDataFromDb();
    Set<String> s=ob.getActiveFemaleName(list);
    ob.displayFemaleList(s);

}
}
