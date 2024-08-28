package in.co.nmsworks.exam;

import java.util.Scanner;

public class PatternPrinting {
    public static void main(String[] args) {
        PatternPrinting patprint = new PatternPrinting();
        patprint.printHalfDiamond();
    }

    private void printHalfDiamond(){
        Scanner in = new Scanner(System.in);
        int n;
        System.out.print("Enter the limit : ");
        n = in.nextInt();
        if(n%2 == 0){
        for (int i=0;i<(n/2);i++){
            for(int j=0;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int i=0;i<=n/2;i++){
            for (int j=i;j<n/2;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        }
        else {
            for (int i=0;i<(n/2)+1;i++){
                for(int j=0;j<=i;j++){
                    System.out.print("* ");
                }
                System.out.println();
            }
            for (int i=0;i<=n/2;i++){
                for (int j=i;j<n/2;j++){
                    System.out.print("* ");
                }
                System.out.println();
            }

        }
    }
}
