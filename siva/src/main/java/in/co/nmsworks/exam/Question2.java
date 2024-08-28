package in.co.nmsworks.exam;

import java.util.Scanner;

/**
 * 2. Get a Number as Input from the console. This number is the height of the half-diamond. Print the Half Diamond as
 */

public class Question2 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter the height of the half-diamond: ");
            int height = scanner.nextInt();

            for (int i = 1; i <= height/2; i++) {

                for (int j = 1; j <= i; j++) {
                    System.out.print("*");
                }
                System.out.println();
            }


                for (int i = (height / 2) + 1; i >= 1; i--) {

                    for (int j = 1; j <= i; j++) {
                        System.out.print("*");
                    }
                    System.out.println();
                }
            }

            }







