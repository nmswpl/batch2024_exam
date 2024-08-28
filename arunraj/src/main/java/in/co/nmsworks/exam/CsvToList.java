package in.co.nmsworks.exam;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CsvToList {
    public static void main(String[] args) {
        CsvToList csvt = new CsvToList();
        csvt.checkAge(csvt.convertCsvToList(),23);
    }

    public List<Passenger> convertCsvToList(){
        try {
            FileReader fr = new FileReader("/tmp/titanic.csv");
            BufferedReader br = new BufferedReader(fr);
            List<Passenger> listOfPassengers = new ArrayList<>();
            String line = br.readLine();

            while (( line = br.readLine()) != null){
                String[] words = line.split(",");
                Passenger passenger = new Passenger(Integer.parseInt(words[0]),Integer.parseInt(words[1]),words[2],words[3],Float.parseFloat(words[4]),Integer.parseInt(words[5]),Integer.parseInt(words[6]),Float.parseFloat(words[7]));
                listOfPassengers.add(passenger);
                br.readLine();
            }

            br.close();
            fr.close();
            return listOfPassengers;

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void checkAge(List<Passenger> passengerList,float age){
        for (Passenger passenger : passengerList){
            if(passenger.getAge() <= age){
                System.out.println("Name : "+passenger.getName());
                System.out.println("Age  : "+passenger.getAge());
            }
            else {
                continue;
            }
        }
    }
    /*[(No of people survived in class X /
Total number of people in class X) *100].

     */

    private void classWiseSurvivedCount(int pClass){
        for (Passenger passenger : convertCsvToList()){
            if(passenger.getPcClass() == pClass ){

            }
        }
    }
}
