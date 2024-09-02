package in.co.nmsworks.week5.exam;
//3. Write a program to multiply two arrays of same size element-by-element. Read the input from user
//E.g : Input : arr1 = {2,4,1} arr2={3,5,7} Output : 6 20 7

import java.util.Arrays;
import java.util.Scanner;

public class Question3 {
    public void multiplyTwoArray(){
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter the size of the array :");
        int size=scanner.nextInt();
        int[] arr1=new int[size];
        System.out.println("enter the value of arr1:");
        for (int i = 0; i <size ; i++) {
            int val=scanner.nextInt();
            arr1[i]=val;
        }
        System.out.println(Arrays.toString(arr1));
        int[] arr2=new int[size];
        System.out.println("enter the value of arr2");
        for (int i = 0; i <size ; i++) {
            int val=scanner.nextInt();
            arr2[i]=val;
        }
        System.out.println("multiplication of array:");
        for (int j = 0; j <size ; j++) {
            System.out.println(arr1[j]*arr2[j]);
        }
    }

    public static void main( String[] args ){
        new Question3().multiplyTwoArray();
    }
}
