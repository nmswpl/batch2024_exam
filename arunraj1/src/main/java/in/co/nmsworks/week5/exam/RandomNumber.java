package in.co.nmsworks.week5.exam;

import java.util.Random;

public class RandomNumber {
    Random rand = new Random();

    public static void main(String[] args) {
        RandomNumber rn = new RandomNumber();
        System.out.println(rn.getRandomNumber());

    }
    private int getRandomNumber()
    {
        return rand.nextInt(10) + 1;
    }

    private void printCountOfRandomNumber(int n){
        int count = 0;
        if( n != getRandomNumber()){
          count++;
        }
    }
}
