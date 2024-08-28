package in.co.nmsworks.exam;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class PassengerDetails {
    public void classWiseSurvivedCount(){
        try {
            FileReader fileReader = new FileReader("/tmp/titanic.csv");
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line = "";
            line = bufferedReader.readLine();
            int firstClassCount = 0;
            int secondClassCount = 0;
            int thirdClassCount = 0;
            int totalNumberOfPassengerInClass1 = 0;
            int totalNumberOfPassengerInClass2 = 0;
            int totalNumberOfPassengerInClass3 = 0;
            while ((line = bufferedReader.readLine()) != null){
                String[] data = line.split(",");
                if (Integer.parseInt(data[1]) == 1){
                    totalNumberOfPassengerInClass1++;
                } else if (Integer.parseInt(data[1]) == 2){
                    totalNumberOfPassengerInClass2++;
                } else if (Integer.parseInt(data[1]) == 3) {
                    totalNumberOfPassengerInClass3++;
                }
                if (Integer.parseInt(data[0]) == 0 && Integer.parseInt(data[1]) == 1){
                    firstClassCount++;
                } else if(Integer.parseInt(data[0]) == 0 && Integer.parseInt(data[1]) == 2){
                    secondClassCount++;
                }else if (Integer.parseInt(data[0]) == 0 && Integer.parseInt(data[1]) == 3){
                    thirdClassCount++;
                }
            }
            System.out.println("First class count : " + firstClassCount + " Survival Percentage : " + (double)((firstClassCount/totalNumberOfPassengerInClass1)*100));
            System.out.println("Second class count : " + secondClassCount + " Survival Percentage : " + (double)((secondClassCount/totalNumberOfPassengerInClass2)*100));
            System.out.println("Third class count : " +thirdClassCount + " Survival Percentage : " + (double)((thirdClassCount/totalNumberOfPassengerInClass3)*100));

            bufferedReader.close();
            fileReader.close();

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    public void printPassenger(){
        try {
            FileReader fileReader = new FileReader("/tmp/titanic.csv");
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter age : ");
            float age = scanner.nextInt();
            String line = "";
            line = bufferedReader.readLine();
            while ((line = bufferedReader.readLine()) != null){
                String[] data = line.split(",");
                if (Float.parseFloat(data[4]) <= age){
                    System.out.println("Name : " + data[2] + " Age : " + Float.parseFloat(data[4]));
                }
            }

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args) {
        PassengerDetails passengerDetails = new PassengerDetails();
        //passengerDetails.printPassenger();
        passengerDetails.classWiseSurvivedCount();
    }
}
