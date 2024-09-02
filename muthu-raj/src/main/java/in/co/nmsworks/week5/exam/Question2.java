package in.co.nmsworks.week5.exam;


import java.util.Random;
import java.util.Scanner;

public class Question2 {

    public static void main(String[] args) {

        Question2 q2 = new Question2();
        Scanner sc =  new Scanner(System.in);
        System.out.println("Enter a number");
        int num = sc.nextInt();
        int count = 0;

        while(q2.getRandomNumber() != num)
        {
            count++;
        }

        System.out.println("It Takes " + count + " times for random generator to get " + num);
    }

    Random rand = new Random();
    private int getRandomNumber() {
        return rand.nextInt(10) + 1;
    }
}
