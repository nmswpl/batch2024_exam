package in.co.nmsworks.week5.exam;

import java.util.Random;

public class GenerateRandomNumber {
    Random rand = new Random();

    private int getRandomNumber() {
        return rand.nextInt(10) + 1;
    }

    public int countAttemptsToGenerate(int num) {
        int count = 0;
        int generateNumber = 0;

        if (generateNumber != num)
        {
            generateNumber = getRandomNumber();
            count++;
        }
        else if (num < 1 || num > 10) {
            System.out.println("Target number must be between 1 and 10.");
        }

        return count;
    }
}

public static void main(String[] args) {

    GenerateRandomNumber number = new GenerateRandomNumber();
    number.getRandomNumber();

}
