package in.co.nmsworks.exam;
/*
Given a CSV File titanic.csv, Create Passenger Object.
a. Print Class wise survived people Count and Survival percentage [(No of people survived in class X /
Total number of people in class X) *100].
b. Get Input as Age from Console. Print the passenger ID and name where the passenger's age is less
than or equal to the given age
 */

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Question4 {
    Integer survived;
    Integer pClass;
    String name;
    String sex;
    Integer age;
    Integer siblingsOrSpouseAbroad;
    Integer parentsOrChildrenAborad;
    Float fare;

    Scanner scanner = new Scanner(System.in);
    int ageOfAPassenger;
    public void passengerAgeAboveThreshold(){
        try {
            FileReader fr = new FileReader("/tmp/titanic.csv");
            BufferedReader br = new BufferedReader(fr);
            String line = br.readLine();
            String[] arr = line.split(",");
            System.out.println("Enter the Age::");
            ageOfAPassenger = scanner.nextInt();
            if(line != null){
                 survived = Integer.valueOf(arr[0]);
                 pClass = Integer.parseInt(arr[1]);
                 name = arr[2];
                 sex = arr[3];
                 age = Integer.parseInt(arr[4]);
                 siblingsOrSpouseAbroad = Integer.parseInt(arr[5]);
                 parentsOrChildrenAborad = Integer.parseInt(arr[6]);
                 fare = Float.parseFloat(arr[7]);
            }
            if(age <= ageOfAPassenger){
                System.out.println("The Passenger Name::"+name+age);
            }

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args) {
        Question4 passengerDetail = new Question4();
        passengerDetail.passengerAgeAboveThreshold();
    }
}
