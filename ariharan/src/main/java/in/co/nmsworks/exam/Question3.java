package in.co.nmsworks.exam;
//3. Source the given sql file (source /tmp/Sample-SQL-File-100-Rows.sql) (10 Marks)
//a. Get a Username and password from the Console. Write a program to check the details against the
//database (user_details table) and print if the username and password is valid or not.
//Enter username: john24
//Enter password: 93a5fe6210bfcdb573ccd348e19e6a56
//Password is Valid
//b. Create Object UserDetails. Add it to List. Implement the following method
//private Set<String> getActiveFemaleName(List<UserDetails>)

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.*;

public class Question3 {
    public static void main( String[] args ){
       Question3 q3=new Question3();
        q3.checkUserAndPass();
        System.out.println("\n\nthe active female are ::");
        Set<String> activeFemaleList=q3.getActiveFemaleName(q3.retriveDetailsFromDatabase());
        for (String name : activeFemaleList) {
            System.out.println(name);
        }
    }


    private Map<String,String> retriveUserAndPass(){
        Map<String,String> userAndPassword=new HashMap<>();
        try(Connection connection= DriverManager.getConnection("jdbc:mysql://localhost:3306/training");
            PreparedStatement preparedStatement =connection.prepareStatement("select* from  user_details")){
            ResultSet rs=preparedStatement.executeQuery();
            while (rs.next()){
            userAndPassword.put(rs.getString(2),rs.getString(6));
            }
            rs.close();

        }catch (Exception e){
            e.printStackTrace();
        }
        return userAndPassword;
    }

    public void checkUserAndPass(){
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter the user name::");
        String user=scanner.nextLine();
        System.out.println("enter the password ::");
        String password=scanner.nextLine();
        Map<String,String> userAndPass=retriveUserAndPass();
        if(userAndPass.get(user)!=null){
            if(userAndPass.get(user).equals(password))
                System.out.println("password is valid");
            else
                System.out.println("password is invalid");
        }else {
            System.out.println("user and password is not valid");
        }

    }

    public List<UserDetails> retriveDetailsFromDatabase(){
        List<UserDetails> userDetailsList=new ArrayList<>();
        try(Connection connection= DriverManager.getConnection("jdbc:mysql://localhost:3306/training");
            PreparedStatement preparedStatement =connection.prepareStatement("select* from  user_details")) {
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()){
                UserDetails newUser=new UserDetails();
                newUser.setUserId(rs.getInt(1));
                newUser.setUserName(rs.getString(2));
                newUser.setFirstName(rs.getString(3));
                newUser.setLastName(rs.getString(4));
                newUser.setGender(rs.getString(5));
                newUser.setPassword(rs.getString(6));
                newUser.setStatus(rs.getInt(7));
                userDetailsList.add(newUser);
            }
            rs.close();
        }catch (Exception e){
            e.printStackTrace();
        }
        return userDetailsList;
    }
    private Set<String> getActiveFemaleName(List<UserDetails> userDetailsList){
        Set<String> activeFemaleNames=new HashSet<>();
        for (UserDetails userDetail : userDetailsList) {
            if (userDetail.getGender().equalsIgnoreCase("female")&&userDetail.getStatus()==1){
                String name= userDetail.getFirstName() .concat(" ").concat(userDetail.getLastName());
                activeFemaleNames.add(name);
            }
        }
        return activeFemaleNames;
    }

}
