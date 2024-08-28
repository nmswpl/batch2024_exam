package in.co.nmsworks.exam;

import com.sun.javafx.UnmodifiableArrayList;
import com.sun.javafx.binding.StringFormatter;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class UserDetails {
   private Integer userid;
   private String userName;
   private String firstName;
   private String lastName;
   private String gender;
   private String password;
   private Integer status;
   public UserDetails(){

   }
    public UserDetails(Integer userid, String userName, String firstName,String lastName,String gender,String password,Integer status){
       this.userid = userid;
       this.userName = userName;
       this.firstName = firstName;
       this.lastName = lastName;
       this.gender = gender;
       this.password = password;
       this.status = status;
    }

    public static void main(String[] args) {
        UserDetails userDetails = new UserDetails(25,"Madhu","Madhumitha","G","Female","1vfjkrgdi9bh",1);
        List<UserDetails> details = new ArrayList<>();
        details.add(userDetails);
        Set<String> getActiveFemaleNames = new HashSet<>(userDetails);

    }


}

