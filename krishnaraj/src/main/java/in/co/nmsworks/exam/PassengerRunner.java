package in.co.nmsworks.exam;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class PassengerRunner {

    public List<Passenger> getPassengerList(){
        List<Passenger> passengerList = new ArrayList<>();

        try {
            FileReader fileReader = new FileReader("/tmp/titanic.csv");
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line = bufferedReader.readLine();
            while ((line =bufferedReader.readLine()) != null) {
                String entry[] = line.split(",");
                passengerList.add(new Passenger(Integer.parseInt(String.valueOf(entry[0])),Integer.parseInt(String.valueOf(entry[1])),entry[2],entry[3],Float.parseFloat(String.valueOf(entry[4])),Integer.parseInt(String.valueOf(entry[5])),Integer.parseInt(String.valueOf(entry[6])),Integer.parseInt(String.valueOf(entry[7]))));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return passengerList;
    }

    /***
     * Print Class wise survived people Count and Survival percentage [(No of people survived in class X /
     * Total number of people in class X) *100].
     */


    public static void main(String[] args) {
        PassengerRunner passengerRunner = new PassengerRunner();
        List<Passenger> passengerList=passengerRunner.getPassengerList();
    }
}
