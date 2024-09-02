package in.co.nmsworks.week5.exam;
/*
2. Write a program to find the number of times it takes to generate a given number for a randomNumberGenerator.
Method for Random Number generator is
 */

import java.util.Random;
import java.util.Scanner;

public class Question2 {
    Random rand = new Random();


    private int getRandomNumber(int num)
    {
        System.out.println(rand.nextInt(10) + 1);
        return rand.nextInt(10) + 1;
    }

    public static void main(String[] args) {
        Question2 question2 = new Question2();
        question2.getRandomNumber();
    }
}
