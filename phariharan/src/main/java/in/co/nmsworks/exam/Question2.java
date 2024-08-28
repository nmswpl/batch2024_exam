package in.co.nmsworks.exam;

/*
 * Print the Half Diamond as follows
 */

import java.util.Scanner;

public class Question2 {
    public static void main(String[] args) {
        Question2 patternPrinting = new Question2();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the height of the half Diamond : ");
        int size = sc.nextInt();
        patternPrinting.printHalfDiamond(size);
    }

    private void printHalfDiamond(int size) {
        if (size % 2 == 0) {
            for (int i = 1; i <= size; i++) {
                System.out.println();
                if (i < (size / 2)) {
                    for (int k = 1; k <= i; k++) {
                        System.out.print("* ");
                    }
                } else {
                    for (int j = (size - i); j > 0; j--) {
                        System.out.print("* ");
                    }
                }
            }
        } else {
            for (int i = 1; i <= size; i++) {
                System.out.println();
                if (i < (size / 2)) {
                    for (int k = 1; k <= i; k++) {
                        System.out.print("* ");
                    }
                } else {
                    for (int j = (size - i - 1); j > 0; j--) {
                        System.out.print("* ");
                    }
                }
            }
        }
    }
}