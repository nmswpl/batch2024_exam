package in.co.nmsworks.exam;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TitanicReport {
    List<Passenger> listOfPassengers = new ArrayList<>();
    List<String> ageBelowAgeList=new ArrayList<>();

    public List<Passenger> getDataFromFile() throws IOException {
        FileReader fr = new FileReader("/home/nms/git/batch2024_exam/suji/src/main/resources/titanic.csv");
        BufferedReader br = new BufferedReader(fr);
        String line;
        while ((line = br.readLine()) != null) {
            br.readLine();
            br.readLine();
            String details[] = line.split(",");
            int survived = Integer.parseInt(details[0]);
            int pclass = Integer.parseInt(details[1]);
            String name = details[2];
            String gender = details[3];
            float age = Float.parseFloat(details[4].trim());
            String siblingSpouse = details[5];
            String parentChildren = details[6];
            float fare = Float.parseFloat(details[7]);
            Passenger ob = new Passenger(survived, pclass, name, gender, age, siblingSpouse, parentChildren, fare);
            listOfPassengers.add(ob);
        }
        return listOfPassengers;
    }

    public void display(List<Passenger> ls) {
        for (Passenger listOfPassenger : listOfPassengers) {
            System.out.println(listOfPassenger);
        }
    }

    public void getSurvivedReport()
    {
        Map<Integer, Float> survivedMap = new HashMap<>();

        for (Passenger listOfPassenger : listOfPassengers)
        {
            survivedMap.put(listOfPassenger.getPclass(), 0.0f);
        }

        for (int i = 1; i <=3 ; i++)
        {
            survivedMap.put(i,calcSurvivedPercentage(countSurvived(i),classTotal(i)));
        }

        for (Map.Entry<Integer, Float> e : survivedMap.entrySet())
        {
          //  System.out.println(c1+" "+c2+" "+c3);
          //  System.out.println(s1+" "+s2+" "+s3);
            System.out.println("Class "+e.getKey() + " survived percentage is " + e.getValue() + " & the count of people survived is "+countSurvived(e.getKey()));
            System.out.println(" ********************************************************************");
        }
    }

    public void generateIdNameBelowThisAge(int age)
    {
        for (Passenger listOfPassenger : listOfPassengers)
        {
            if(listOfPassenger.getAge()<=age)
            {
                  ageBelowAgeList.add(listOfPassenger.getName());
            }
        }
        System.out.println(" The passenger's names whose ages are below the given age are as follows ::");
        for (String s : ageBelowAgeList)
        {
            System.out.println(s);
        }
    }

    private float calcSurvivedPercentage(int classTotal,int survTotalPerCLass)
    {
        return ((float) survTotalPerCLass /classTotal)*100 ;
    }

    private int classTotal(int n)
    {
        int s=0;
        for (Passenger listOfPassenger : listOfPassengers)
        {
            if ((listOfPassenger.getPclass()==n)&&(listOfPassenger.isSurvived())==1)
            {
               s=s+1;
            }
        }
        return s;
    }

    public int countSurvived(int i)
    {
        int c=0;
        for (Passenger listOfPassenger : listOfPassengers)
        {
            if (listOfPassenger.getPclass() == i)
            {
                c = c + 1;
            }
        }
        return c;
}


    public static void main(String[] args) throws IOException {
        TitanicReport ob=new TitanicReport();
        List<Passenger> ls=ob.getDataFromFile();
        //ob.display(ls);
        ob.getSurvivedReport();
        ob.generateIdNameBelowThisAge(50);
    }

}
