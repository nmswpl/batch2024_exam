package in.co.nmsworks.exam;

import java.util.Scanner;

public class Question2 {
    public static void main(String[] args) {
        int i, j;

     Scanner sc= new Scanner(System.in);
        System.out.println("Enter the height: ");
     int height = sc.nextInt();
        for (i = 0; i < height; i++)
        {
            for (j = 0; j < i + 1; j++)
                System.out.print("*");
            System.out.print("\n");
        }

        for (i = 1; i < height; i++)
        {
            for (j = i; j < height; j++)
                System.out.print("*");
            System.out.print("\n");
        }

    }
}
