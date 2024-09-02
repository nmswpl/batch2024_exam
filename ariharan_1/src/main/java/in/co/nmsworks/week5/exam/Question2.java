package in.co.nmsworks.week5.exam;

//Write a program to find the number of times it takes to generate a given number for a randomNumberGenerator.
//Method for Random Number generator is

import java.util.Random;
import java.util.Scanner;

public class Question2 {
    static int count;
    Random rand = new Random();
    private int getRandomNumber()
    {
        return rand.nextInt(10) + 1;
    }
    public int countTimeToGenerateNUmber(int val){
        while (true){
            int value=getRandomNumber();
            count++;
            if (val==value)
                return count;
        }

    }

    public static void main( String[] args ){
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter the number:");
        int val=scanner.nextInt();
        System.out.println("number of times executed ::");
        System.out.println(new Question2().countTimeToGenerateNUmber(val));
    }

}
