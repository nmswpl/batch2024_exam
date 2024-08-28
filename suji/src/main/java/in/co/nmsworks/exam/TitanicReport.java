package in.co.nmsworks.exam;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class TitanicReport
{
    List<Passenger> listOfPassengers=new ArrayList<>();
    public void getDataFromFile() throws IOException {
        FileReader fr=new FileReader("/tmp/titanic.csv");
        BufferedReader br=new BufferedReader(fr);
        String line;
        while((line=br.readLine())!=null)
        {
            br.readLine();
           String details[]=line.split(",");
           boolean survived= details[0].isEmpty();
           int pclass = Integer.parseInt(details[1]);
           String name=details[2];
           String gender=details[3];
           int age= Integer.parseInt(details[4]);
           String siblingSpouse=details[5];
           String parentChildren=details[6];
           float fare= Float.parseFloat(details[7]);
           Passenger ob=new Passenger(survived,pclass,name,gender,age,siblingSpouse,parentChildren,fare);
           listOfPassengers.add(ob);
        }
    }

    public void displayClassWiseReport()
    {
    }
}
