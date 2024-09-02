package in.co.nmsworks.week5.exam;

import java.util.Scanner;

public class ArrayMultiplication {
    public void arrMul(){
        int size = 3;
        int[] array1 = {1, 2, 3};
        int[] array2 = {4, 5, 6};
        int product = 0;
        for (int i = 0; i < size; i++) {
            product = array1[i] * array2[i];
            System.out.print(product + " ");
        }
    }

    public static void main(String[] args) {
        ArrayMultiplication arrayMultiplication = new ArrayMultiplication();
        arrayMultiplication.arrMul();
    }
}
