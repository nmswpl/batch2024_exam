package in.co.nmsworks.exam;

import java.util.Scanner;

public class Pattern {
    public static void main(String[] args) {
        /*Scanner s = new Scanner(System.in);
        System.out.println("Enter the height");
        int height = s.nextInt();*/
        for (int i = 1; i <=15 ; i++) {
            if(i<=15/2+1) {
                for (int j = 1; j <= i; j++) {
                    System.out.print("*");

                }
                System.out.println();
            }
                 else{
                    for (int j = 15/2; j>=1; j--) {
                        System.out.print("*");
                    }
                System.out.println();
                }
                }
            System.out.println();
            }


        }

