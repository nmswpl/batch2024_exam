package in.co.nmsworks.week5.exam;

import java.util.Random;
import java.util.Scanner;

public class RandomNumbergenerator {
    Random rand = new Random();
    private int getRandomNumber()
    {
        return rand.nextInt(10) + 1;
    }

    public static void main(String[] args) {
        RandomNumbergenerator randomNumbergenerator = new RandomNumbergenerator();

        Scanner scanner = new Scanner(System.in);
        System.out.print("enter a number : ");

        int number = scanner.nextInt();

        int count = 1;
        while (randomNumbergenerator.getRandomNumber() != number){
            count ++;
        }
        System.out.println("The number times take to find the random number "+number+"is"+ count);
    }
}
