package in.co.nmsworks.exam;
//Get a Number as Input from the console. This number is the height of the half-diamond. Print the Half Diamond as follows.
import java.util.Scanner;

public class Question2 {
    public void printHalfDiamond(){
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter the height of the half-diamond ::");
    int height = scanner.nextInt();
        for (int i = 0; i <= height; i++) {
            System.out.println();
            for (int j = 0 ; j < i; j++) {
                System.out.print("*");
                }
        }

    }


    public static void main(String[] args) {
        Question2 halfDiamond = new Question2();
        halfDiamond.printHalfDiamond();
    }

}
