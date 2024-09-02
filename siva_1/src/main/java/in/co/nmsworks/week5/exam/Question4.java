package in.co.nmsworks.week5.exam;
/**
 *   3. Write a program to multiply two arrays of same size element-by-element. Read the input from user
 * E.g : Input : arr1 = {2,4,1} arr2={3,5,7} Output : 6 20 7
 */

import java.util.Scanner;

public class Question4 {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter the size of the arrays: ");
            int size = scanner.nextInt();

            int[] arr1 = new int[size];
            int[] arr2 = new int[size];

            System.out.println("Enter the elements of the first array:");
            for (int i = 0; i < size; i++) {
                arr1[i] = scanner.nextInt();
            }

            System.out.println("Enter the elements of the second array:");
            for (int i = 0; i < size; i++) {
                arr2[i] = scanner.nextInt();
            }

            System.out.print("Products :: ");
            for (int i = 0; i < size; i++) {
                int product = arr1[i] * arr2[i];
                System.out.print(product + " ");
            }


        }
    }


