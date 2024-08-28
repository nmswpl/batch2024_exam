package in.co.nmsworks.exam;

import java.util.Scanner;

/**
 *Get a Number as Input from the console. This number is the height of the half-diamond. Print the Half Diamond as
 * follows. (5 Mark)
 */

public class Question2 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int num = scan.nextInt();

        for(int i = 1; i<=num ; i++)
        {
            for(int j =1 ; j<=i ; j++)
            {
                System.out.print("*");
            }
            System.out.println("");
        }


         for(int i = num-1 ; i>=1 ; i--)
        {
          for(int j = i ; j>=1 ; j--){
              System.out.print("*");
          }
            System.out.println("");
        }
    }
}
