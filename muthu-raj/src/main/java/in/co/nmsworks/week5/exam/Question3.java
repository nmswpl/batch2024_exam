package in.co.nmsworks.week5.exam;

import java.util.Scanner;

public class Question3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of the array :: ");
        int size = sc.nextInt();


        int[] arr1 = new int[size];
        int[] arr2 = new int[size];
        int[] res = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.println("Enter the arr1(" + i + ") :: ");
            arr1[i] = sc.nextInt();
        }

        for (int i = 0; i < size; i++) {
            System.out.println("Enter the arr2(" + i + ") :: ");
            arr2[i] = sc.nextInt();
        }

//        multiplying the arr1 & arr2
        for (int i = 0; i < size; i++) {
            res[i] = arr1[i] * arr2[i];
        }

//        printing result
        System.out.println("After multiplying arr1 & arr2 ::");
        for (int re : res) {
            System.out.println(re);
        }

    }
}
