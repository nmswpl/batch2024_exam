package in.co.nmsworks.week5.exam;

import java.util.Scanner;

public class MultiplyTwoArray {
    public void multiplyTwoArray(int[] arr1, int[] arr2){
        int[] resultArray = new int[arr1.length];
        for (int i = 0; i < arr1.length; i++) {
            resultArray[i] = arr1[i] * arr2[i];
        }
        System.out.println("the result array :");
        for (int i : resultArray) {
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        MultiplyTwoArray multiplyTwoArray = new MultiplyTwoArray();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Number elemnts in an array : ");
        int size = scanner.nextInt();
        scanner.nextLine();
        int[] arr1 = new int[size];
        System.out.println("Enter value for first array : ");
        for (int i = 0; i < arr1.length; i++) {
            System.out.println("Enter the element" + i + "postition : ");
            arr1[i] = scanner.nextInt();
            scanner.nextLine();
        }
        int[] arr2 = new int[size];
        System.out.println("Enter value for second array : ");
        for (int i = 0; i < arr2.length; i++) {
            System.out.println("Enter the element " + i + " postition : ");
            arr2[i] = scanner.nextInt();
            scanner.nextLine();
        }
        System.out.println("the multiplication of two array : ");
        multiplyTwoArray.multiplyTwoArray(arr1, arr2);

    }
}
