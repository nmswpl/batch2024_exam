package in.co.nmsworks.exam;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TitanicReport {
    List<Passenger> listOfPassengers = new ArrayList<>();

    public List<Passenger> getDataFromFile() throws IOException {
        FileReader fr = new FileReader("/home/nms/git/batch2024_exam/suji/src/main/resources/titanic.csv");
        BufferedReader br = new BufferedReader(fr);
        String line;
        while ((line = br.readLine()) != null) {
            br.readLine();
            br.readLine();
            String details[] = line.split(",");
            boolean survived = details[0].isEmpty();
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

    public void printSurvivedReport()
    {
        Map<Integer, Float> survivedMap = new HashMap<>();
        int c1 = 0;
        int c2 = 0;
        int c3 = 0;
        int s1 = 0;
        int s2 = 0;
        int s3 = 0;

        for (Passenger listOfPassenger : listOfPassengers)
        {
            survivedMap.put(listOfPassenger.getPclass(), 0.0f);
             c1=countSurvived(1);
             c2=countSurvived(2);
             c3=countSurvived(3);
        }

        for (Map.Entry<Integer, Float> e : survivedMap.entrySet())
        {

        }

        for (Map.Entry<Integer, Float> e : survivedMap.entrySet())
        {
            //System.out.println(c1+" "+c2+" "+c3);
            System.out.println(e.getKey() + " " + e.getValue() + " ");
        }
    }

    public int countSurvived(int i)
    {
        int c=0;
        for (Passenger listOfPassenger : listOfPassengers)
        {
            if (listOfPassenger.getPclass() == 3)
            {
                c = c + 1;
            }
        }
        return c;
}


    public static void main(String[] args) throws IOException {
        TitanicReport ob=new TitanicReport();
        List<Passenger> ls=ob.getDataFromFile();
      //  ob.display(ls);
        ob.printSurvivedReport();
    }

}
