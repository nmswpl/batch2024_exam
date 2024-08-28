package in.co.nmsworks.exam;

public class Question2 {
    public void printHalfDiamondPattern(int num){
        for (int i = 1; i <= num/2 ; i++) {
            for (int j = 1; j <= i ; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = num/2; i > 0 ; i--) {
            for(int j = i; j > 0; j--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}