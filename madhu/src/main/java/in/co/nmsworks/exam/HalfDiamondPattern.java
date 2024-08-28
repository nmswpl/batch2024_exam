package in.co.nmsworks.exam;

import java.util.Scanner;

public class HalfDiamondPattern {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter height number :");
        int height = scanner.nextInt();
        for (int i = 0; i < height; i++) {
            System.out.println("*");
            for (int j = i; j < height; j++) {
                System.out.print("*");
            }
        }
    }
}



