package in.co.nmsworks.exam;

import java.util.Scanner;

public class Question2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number :");
        int number = sc.nextInt();
        int k =1;
        for (int i =0; i< number/2;i++){
            int j =0;
          while( j < k){
              System.out.print("*");
              j++;
          }

            k++;
            System.out.println("\n");

        }

    }
}
