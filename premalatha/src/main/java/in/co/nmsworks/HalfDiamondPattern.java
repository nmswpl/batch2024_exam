package in.co.nmsworks;

import java.util.Scanner;

public class HalfDiamondPattern {
    public void printPattern(){
        Scanner scan = new Scanner(System.in);
        System.out.println("The height of the diamond : ");
        int height = scan.nextInt();

        for (int i = 1; i <= height/2 ; i++) {
            for (int j = 1; j <= i ; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = height/2; i >= 1 ; i--) {
            for (int j = i; j >= 1 ; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

        HalfDiamondPattern hd = new HalfDiamondPattern();
        hd.printPattern();
    }
}
