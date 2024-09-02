package in.co.nmsworks.week5.exam;

import java.util.Random;
import java.util.Scanner;

public class CountForRandomNumber {
    Random rand = new Random();
    int count = 0;
    Scanner scanner = new Scanner(System.in);
    private int getRandomNumber()
    {
        return rand.nextInt(10) + 1;
    }


    public void randomGeneratorCount(){
        System.out.println("Enter a number : ");
        int number = scanner.nextInt();
        while (number != getRandomNumber()){
            count++;
        }
        System.out.println("For " + number + ", it takes " + count + " times");
    }

    public static void main(String[] args) {
        CountForRandomNumber countForRandomNumber = new CountForRandomNumber();
        countForRandomNumber.randomGeneratorCount();
    }
}
