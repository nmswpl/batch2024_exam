package in.co.nmsworks.week5.exam;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Write a program to multiply two arrays of same size element-by-element. Read the input from user
 * E.g : Input : arr1 = {2,4,1} arr2={3,5,7} Output : 6 20 7
 */

public class Question3 {
    public static void main(String[] args) {
        Question3 question3 = new Question3();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array ");
        int size = sc.nextInt();
        int[] array1 = new int[size];

        for (int i = 0; i < size; i++) {
            System.out.print("Enter the element of array 1 :");
            array1[i] = sc.nextInt();
        }
        System.out.println("\nNext Array Element\n");
        int[] array2 = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.print("Enter the element of array 2 :");
            array2[i] = sc.nextInt();
        }
        int[] answer = question3.matricMultiplication(array1,array2);
        System.out.println(Arrays.toString(answer));

    }

    private int[] matricMultiplication(int[] intArray1, int[] intArray2) {
        if (intArray1.length == intArray2.length){
            int[] answer = new int[intArray1.length];
            for (int i = 0; i < intArray1.length; i++) {
                answer[i] = intArray1[i]*intArray2[i];
            }
            return answer;
        }
     return null;
    }
}
