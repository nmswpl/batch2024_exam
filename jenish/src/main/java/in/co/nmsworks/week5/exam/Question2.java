package in.co.nmsworks.week5.exam;

import java.util.Random;
import java.util.Scanner;

public class Question2 {
    Random rand = new Random();
    private int getRandomNumber()
    {
        return rand.nextInt(10) + 1;
    }

    public void checkRandom(int num){
        int noOfTimes = 0;
        int randomNumber = 0;
        while(num != (randomNumber = getRandomNumber())){
            System.out.println(randomNumber);
            noOfTimes++;
        }
        System.out.println("Number of times to get the number " +num+" is "+noOfTimes);
    }
    public static void main(String[] args) {
        Question2 q2 = new Question2();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number from (1 to 11 ) : ");
        int num = sc.nextInt();
        q2.checkRandom(num);
    }
}