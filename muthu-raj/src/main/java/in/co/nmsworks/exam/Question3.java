package in.co.nmsworks.exam;

import java.sql.*;
import java.util.*;

public class Question3 {

    static Connection con;
    public Question3()
    {
        try{
            String sql = "jdbc:mysql://localhost:3306/training";
            con = DriverManager.getConnection(sql);
        }
        catch(Exception e)
        {
            System.out.println("DB connectivity error");
            e.printStackTrace();
        }
    }

    static void close()
    {
        try
        {
            con.close();
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
    public static void main(String[] args) {
        Question3 q =  new Question3();

        Scanner sc = new Scanner(System.in);
        int choice = 0;

        do {
            System.out.println("1. Validate User\n" +
                    "2. Get female users\n" +
                    "3. Exit");
            System.out.println("Enter your choice ::");
            choice = sc.nextInt();

            switch(choice)
            {
                case 1:
                    if(q.validateUser())
                    {
                        System.out.println("The entered username and password is correct");
                    }
                    else
                    {
                        System.out.println("The entered username or password is incorrect");
                    }
                    break;

                case 2:
                    List<UserDetails> usersList = q.fillAndReturnUserDetails();
                    int count = 1;
                    for (String s : q.getActiveFemaleName(usersList)) {
                        System.out.println(count++ + ". " +s);
                    }
                    break;

                default:
                    System.out.println("Exiting..");
                    break;
            }
        }while(choice != 3);

        close();
    }

    private List<UserDetails> fillAndReturnUserDetails()
    {
        List<UserDetails> usersList = new ArrayList<>();

        String sql = "SELECT * FROM user_details";
        try(PreparedStatement ps =  con.prepareStatement(sql))
        {
            try(ResultSet rs = ps.executeQuery())
            {
                while(rs.next())
                {
                    UserDetails u = new UserDetails(rs.getInt(1),
                            rs.getString(2),
                            rs.getString(3),
                            rs.getString(4),
                            rs.getString(5),
                            rs.getString(6),
                            rs.getInt(7)
                    );
                    usersList.add(u);
                }
            }
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        return usersList;
    }

    private Set<String> getActiveFemaleName(List<UserDetails> usersList)
    {
        Set<String> femaleNames = new HashSet<>();

        for (UserDetails userDetails : usersList) {

            if(userDetails.getGender().equalsIgnoreCase("FEMALE"))
            {
                femaleNames.add(userDetails.getFirstName() + " " +userDetails.getLastName());
            }
        }
        return femaleNames;
    }

    private boolean validateUser()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the user name :: ");
        String name = sc.nextLine();

        System.out.println("Enter the password :: ");
        String pwd = sc.nextLine();

        String sql = "SELECT * FROM user_details WHERE username = ? and password = ?";
        try(PreparedStatement ps = con.prepareStatement(sql))
        {
            ps.setString(1,name);
            ps.setString(2,pwd);

            try(ResultSet rs = ps.executeQuery())
            {
                while(rs.next())
                {
                    return true;
                }
            }
        }
        catch (SQLException s)
        {
            s.printStackTrace();
        }
        return false;
    }
}
