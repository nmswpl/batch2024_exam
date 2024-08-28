package in.co.nmsworks.exam;

import java.util.Scanner;

//Get a Number as Input from the console. This number is the height of the half-diamond. Print the Half Diamond as
public class Question2 {
    public static void main( String[] args ){
        new Question2().printHalfDiamond();

    }
    private void printHalfDiamond(){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the height of the half diamond::");
        int height=sc.nextInt();
        for (int i = 1; i <=height/2; i++) {
            for (int j = 1; j <=i ; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        if (height%2==0)
            height=height-1;

        for (int i = (height/2); i >=0; i--) {
            for (int j = 0; j <=i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
