package in.co.nmsworks.exam;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

/**
 *4. Given a CSV File titanic.csv, Create Passenger Object. [10 Marks]
 * a. Print Class wise survived people Count and Survival percentage [(No of people survived in class X /
 * Total number of people in class X) *100].
 * b. Get Input as Age from Console. Print the passenger ID and name where the passenger's age is less
 * than or equal to the given age
 */

public class Question4 {

    public void readFromFile(){

        try {
            FileReader fr = new FileReader("/tmp/titanic.csv");
            BufferedReader br = new BufferedReader(fr);
            String line = br.readLine();
            int count = 0;

            while(line!=null){
                String[] word = line.split(",");
                for (String survive : word) {


                }
            }
            br.close();
            fr.close();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void getPassengerName(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the age : ");
        int age = scan.nextInt();
        try {
            FileReader fr = new FileReader("/tmp/titanic.csv");
            BufferedReader br = new BufferedReader(fr);
            String line = br.readLine();
            while(line!=null){
                String[] word = line.split(",");

            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args) {
        Question4 q4 = new Question4();
        q4.readFromFile();


    }

}
