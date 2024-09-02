package in.co.nmsworks.week5.exam;

import java.util.Random;
import java.util.Scanner;

/**
 * Random rand = new Random();
 * private int getRandomNumber()
 * {
 *         return rand.nextInt(10) + 1;
 * }
 */

public class Question2 {
    Random rand = new Random();
    private int getRandomNumber()
    {
        return rand.nextInt(10) + 1;
    }

    public static void main(String[] args) {
        Question2 question2 = new Question2();
        Scanner sc = new Scanner(System.in);
        System.out.print("Give an input number (Between 0 - 11) : ");
        int number = sc.nextInt();
        question2.countOfTimesToMatchWithRandomNumber(number);
    }

    private void countOfTimesToMatchWithRandomNumber(int i) {
        int count = 0;
        int randomNumber = Integer.MAX_VALUE;
        while (i != randomNumber){
            randomNumber = getRandomNumber();
            System.out.println("Given number : "+i+"\tRandom number generated : "+randomNumber);
            count++;
        }
        System.out.println("\nfor "+i+" no of tries :"+count);
    }

}
