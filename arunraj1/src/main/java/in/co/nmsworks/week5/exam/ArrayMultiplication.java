package in.co.nmsworks.week5.exam;

import java.util.Scanner;

public class ArrayMultiplication {
    public static void main(String[] args) {
        ArrayMultiplication ar = new ArrayMultiplication();
        ar.multiplicationOfTwoArray();
    }

    private void multiplicationOfTwoArray(){
        Scanner in = new Scanner(System.in);
        int n;
        System.out.print("Enter the Limit : ");
        n = in.nextInt();
        int[] array1 = new int[n];
        int[] array2 = new int[n];

        for (int i=0;i<n;i++){
            System.out.println("Enter array1 element : ");
            array1[i] = in.nextInt();
        }

        for (int i=0;i<n;i++){
            System.out.println("Enter array2 element : ");
            array2[i] = in.nextInt();
        }
        int mul = 0;
        for (int i=0;i<array1.length;i++){
            mul = array1[i] * array2[i];
            System.out.println(mul);
        }
    }
}
