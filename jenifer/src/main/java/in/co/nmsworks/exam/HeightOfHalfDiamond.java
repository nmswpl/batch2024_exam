package in.co.nmsworks.exam;
/*
Get a Number as Input from the console. This number is the height of the half-diamond.
Print the Half Diamond as follows.
 */

import java.util.Scanner;

public class HeightOfHalfDiamond {
    public void printHalfDiamond(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int number = scanner.nextInt();
        for (int i = 1; i <= number/2 + 1 ; i++) {
            for (int j = 1; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = number/2 + 1; i >= 1; i--) {
            for (int j = i; j >= 1; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        HeightOfHalfDiamond heightOfHalfDiamond = new HeightOfHalfDiamond();
        heightOfHalfDiamond.printHalfDiamond();
    }
}
