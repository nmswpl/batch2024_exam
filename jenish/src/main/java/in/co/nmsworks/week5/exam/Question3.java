package in.co.nmsworks.week5.exam;

import java.util.Scanner;

public class Question3 {
    public void multiplyElements(int[] arr1, int[] arr2){
        int length = arr1.length;
        for (int i = 0; i < length; i++) {
            System.out.print(arr1[i] * arr2[i]+" ");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array : ");
        int size = sc.nextInt();
        int[] arr1 = new int[size];
        int[] arr2 = new int[size];

        System.out.println("Enter a number for first array(Size 4) : ");
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = sc.nextInt();
        }
        System.out.println("Enter a number for second array(Size 4) : ");
        for (int i = 0; i < arr1.length; i++) {
            arr2[i] = sc.nextInt();
        }
        Question3 q3 = new Question3();
        q3.multiplyElements(arr1, arr2);
    }
}