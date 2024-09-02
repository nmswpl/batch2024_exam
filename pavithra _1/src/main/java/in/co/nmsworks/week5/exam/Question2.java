package in.co.nmsworks.week5.exam;

import java.util.Random;
import java.util.Scanner;

/**
 * 2. Write a program to find the number of times it takes to generate a given number for a randomNumberGenerator. Method for Random Number generator is
 * Random rand = new Random();
 * private int getRandomNumber()
 * {
 *         return rand.nextInt(10) + 1;
 * }
 */

public class Question2 {
    Random rand = new Random();
    private static int getRandomNumber()
    {
        Random rand = new Random();
        return rand.nextInt(10) + 1;
    }

    public static void main(String[] args) {

        Question2 q2 = new Question2();
         int random = q2.getRandomNumber();
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int num = scan.nextInt();

        int count = 0;
        if(num == random){
            System.out.println(num);
            count++;
        }
        System.out.println(count);



    }

}
