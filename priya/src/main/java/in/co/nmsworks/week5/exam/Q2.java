package in.co.nmsworks.week5.exam;

import java.util.Random;
import java.util.Scanner;

public class Q2 {
    Random rand = new Random();

    private int getRandomNumber() {
        return rand.nextInt(10) + 1;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a number");
        Q2 q2 = new Q2();
        int x = s.nextInt();

        int count = 0;
        while (true) {
            int rand = q2.getRandomNumber();
            if (rand == x) {
                break;
            }
            else {
                System.out.println(rand);
                count++;
            }

        }
        System.out.println(x+" is generated at "+(count+1)+" th call");

    }
}
