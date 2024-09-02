package in.co.nmsworks.exam;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Question4 {
    public List<Passenger> readFromFile(){
        List<Passenger> passengerList = new ArrayList<>();
        try (FileReader fileReader = new FileReader("/tmp/titanic.csv");
             BufferedReader bufferedReader = new BufferedReader(fileReader)){
            String header = bufferedReader.readLine();
            String line = bufferedReader.readLine();
            while (line != null){
                String[] passengerDetails = line.split(",");
                //System.out.println(Arrays.toString(passengerDetails));
                int survived = Integer.parseInt(passengerDetails[0]);
                int pcClass = Integer.parseInt(passengerDetails[1]);
                String name = passengerDetails[2];
                String gender = passengerDetails[3];
                float age = Float.parseFloat(passengerDetails[4]);
                int siblingOrSpousesAboard = Integer.parseInt(passengerDetails[5]);
                int parentsOrChildrenAboard = Integer.parseInt(passengerDetails[6]);
                float fare = Float.parseFloat(passengerDetails[7]);
                Passenger passenger = new Passenger(survived, pcClass, name, gender, age, siblingOrSpousesAboard, parentsOrChildrenAboard, fare);
                passengerList.add(passenger);
                line = bufferedReader.readLine();
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return passengerList;
    }

    public void printClassWiseSurvivedList(){
        List<Passenger> passengerList = readFromFile();
        int noOfPassengerSurvivedInClass1 = 0;
        int noOfPassengerSurvivedInClass2 = 0;
        int noOfPassengerSurvivedInClass3 = 0;
        int totalNumberOfPassengerInClass1 = 0;
        int totalNumberOfPassengerInClass2 = 0;
        int totalNumberOfPassengerInClass3 = 0;

        for (Passenger passenger : passengerList) {
            if(passenger.getPcClass() == 1){
                totalNumberOfPassengerInClass1++;
                if(passenger.getSurvived() == 1){
                    noOfPassengerSurvivedInClass1++;
                }
            }
            else if(passenger.getPcClass() == 2){
                totalNumberOfPassengerInClass2++;
                if(passenger.getSurvived() == 1){
                    noOfPassengerSurvivedInClass2++;
                }
            }
            else if(passenger.getPcClass() == 3){
                totalNumberOfPassengerInClass3++;
                if(passenger.getSurvived() == 1){
                    noOfPassengerSurvivedInClass3++;
                }
            }
        }
        //System.out.println("1"+noOfPassengerSurvivedInClass1);
        //System.out.println("2"+noOfPassengerSurvivedInClass2);
        //System.out.println("3"+noOfPassengerSurvivedInClass3);
        //System.out.println("1"+totalNumberOfPassengerInClass1);
        //System.out.println("2"+totalNumberOfPassengerInClass2);
        //System.out.println("3"+totalNumberOfPassengerInClass3);
        float averageOfClass1 = (float) noOfPassengerSurvivedInClass1 / totalNumberOfPassengerInClass1;
        float averageOfClass2 = (float) noOfPassengerSurvivedInClass2 / totalNumberOfPassengerInClass2;
        float averageOfClass3 = (float) noOfPassengerSurvivedInClass3 / totalNumberOfPassengerInClass3;

        System.out.println("Total Number of Passenger Survived in Class 1 : "+noOfPassengerSurvivedInClass1);
        System.out.println("Average of Passenger Survived in Class 1 : "+averageOfClass1 * 100);
        System.out.println("Total Number of Passenger Survived in Class 2 : "+noOfPassengerSurvivedInClass2);
        System.out.println("Average of Passenger Survived in Class 2 : "+averageOfClass2 * 100);
        System.out.println("Total Number of Passenger Survived in Class 3 : "+noOfPassengerSurvivedInClass3);
        System.out.println("Average of Passenger Survived in Class 3 : "+averageOfClass3 * 100);
    }

    public void printNameAndAge(float age){
        List<Passenger> passengerList = readFromFile();

        for (Passenger passenger : passengerList) {
            if(passenger.getAge() <= age){
                System.out.println("Name :: "+passenger.getName()+"\n"+"Age :: "+passenger.getAge());
            }
        }
    }

    public static void main(String[] args) {
        Question4 q4 = new Question4();
        q4.readFromFile();
        q4.printClassWiseSurvivedList();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the age : ");
        float age = sc.nextFloat();
        q4.printNameAndAge(age);
    }
}