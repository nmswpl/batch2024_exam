package in.co.nmsworks.exam;

import java.util.Scanner;

//Half diamond pattern
public class HalfDiamondPattern {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the value for half pramid : ");
        int numberOfRows = scanner.nextInt();
        scanner.nextLine();
        if (numberOfRows % 2 != 0) {
            numberOfRows += 1;
        }
        System.out.println("printing the half diamond...");
        for (int i = 1; i <= numberOfRows / 2; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
        for (int i = 1; i <= numberOfRows / 2; i++) {
            if (i == numberOfRows/2  && (numberOfRows-1) % 2 != 0) {
                continue;
            }
            for (int j = i; j <= numberOfRows / 2; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
