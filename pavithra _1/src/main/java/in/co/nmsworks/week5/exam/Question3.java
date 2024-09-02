package in.co.nmsworks.week5.exam;

import java.util.Scanner;

/**
 * 3. Write a program to multiply two arrays of same size element-by-element. Read the input from user
 * E.g : Input : arr1 = {2,4,1} arr2={3,5,7} Output : 6 20 7
 */

public class Question3 {

    int[] arr1 = {2,4,1};

    int[] arr2 = {3,5,7};

    public void multipleArray(){
        for( int i=0 ;i<arr1.length;i++)
            System.out.print(arr1[i] * arr2[i] + " ");
    }

    public static void main(String[] args) {

        Question3 q3 = new Question3();
        q3.multipleArray();
    }


}
