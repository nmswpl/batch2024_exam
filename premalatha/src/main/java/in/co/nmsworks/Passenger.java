package in.co.nmsworks;
/*
Given a CSV File titanic.csv, Create Passenger Object. [10 Marks]
a. Print Class wise survived people Count and Survival percentage [(No of people survived in class X /
Total number of people in class X) *100].
b. Get Input as Age from Console. Print the passenger ID and name where the passenger's age is less
than or equal to the given age
 */

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Passenger {
    String[] passengerDetails;
    public void countSurvivedPeople(){
        try(FileReader fr = new FileReader("/tmp/titanic.csv");
            BufferedReader br = new BufferedReader(fr)) {
            String line;
            int countOfSurvived = 0;
            int countOfSurvivedPeopleInClass1 = 0;
            int countOfTotalPeopleInClass1 = 0;
            int countOfSurvivedPeopleInClass2 = 0;
            int countOfTotalPeopleInClass2 = 0;
            int countOfSurvivedPeopleInClass3 = 0;
            int countOfTotalPeopleInClass3 = 0;
            int SurvivalPercentageOfClass1 = 0;
            int SurvivalPercentageOfClass2 = 0;
            int SurvivalPercentageOfClass3 = 0;


            line = br.readLine();
            while ((line = br.readLine()) != null) {
                passengerDetails = line.split(",");
                if(Integer.parseInt(passengerDetails[0]) == 1)
                    countOfSurvived++;
                if(Integer.parseInt(passengerDetails[1]) == 1) {
                    if (Integer.parseInt(passengerDetails[0]) == 1)
                        countOfSurvivedPeopleInClass1++;
                    else
                        countOfTotalPeopleInClass1++;

                }

                if(Integer.parseInt(passengerDetails[1]) == 2) {
                    if (Integer.parseInt(passengerDetails[0]) == 1)
                        countOfSurvivedPeopleInClass2++;
                    else
                        countOfTotalPeopleInClass2++;
                }

                if(Integer.parseInt(passengerDetails[1]) == 3) {
                    if (Integer.parseInt(passengerDetails[0]) == 1)
                        countOfSurvivedPeopleInClass3++;
                    else
                        countOfTotalPeopleInClass3++;
                }



            }
            SurvivalPercentageOfClass1 = ( countOfSurvivedPeopleInClass1 / countOfTotalPeopleInClass1) * 100;

            SurvivalPercentageOfClass2 = ( countOfSurvivedPeopleInClass2 / countOfTotalPeopleInClass2) * 100;

            SurvivalPercentageOfClass3 = ( countOfSurvivedPeopleInClass3 / countOfTotalPeopleInClass3) * 100;

            System.out.println(countOfSurvived);
            System.out.println("Survived people in class 1 :" + countOfSurvivedPeopleInClass1);
            System.out.println("Total people in class 1 :" + (countOfTotalPeopleInClass1+countOfSurvivedPeopleInClass1));
            System.out.println("Survived people in class 2 :" + countOfSurvivedPeopleInClass2);
            System.out.println("Total people in class 2 :" + (countOfTotalPeopleInClass2+countOfSurvivedPeopleInClass2));
            System.out.println("Survived people in class 3 :" + countOfSurvivedPeopleInClass3);
            System.out.println("Total people in class 3 :" + (countOfTotalPeopleInClass3+countOfSurvivedPeopleInClass3));
            System.out.println("Survived Percentage Of Class 1 : " + SurvivalPercentageOfClass1);
            System.out.println("Survived Percentage Of Class 2 : " + SurvivalPercentageOfClass2);
            System.out.println("Survived Percentage Of Class 3 : " + SurvivalPercentageOfClass3);
            
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void passengerAge()
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the age");
        int age = scan.nextInt();

        if (Integer.parseInt(passengerDetails[5]) <= age)
        {
            System.out.println(passengerDetails[2]);
        }
    }

    public static void main(String[] args) {

        Passenger passenger = new Passenger();
        passenger.countSurvivedPeople();
        passenger.passengerAge();

    }
}
