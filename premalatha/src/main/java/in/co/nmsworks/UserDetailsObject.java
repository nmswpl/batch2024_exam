package in.co.nmsworks;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class UserDetailsObject {
    List<UserDetails> userDetailsList = new ArrayList<>();
    Set<String> femaleNameList = new HashSet<>();

    public void createObject() {

        userDetailsList.add(new UserDetails(""));

    }

    private Set<String> getActiveFemaleName(List<UserDetails>)
    {
        if(userDetailsList.get(3) == 1)
            femaleNameList.add("");
        return femaleNameList;
    }
}
