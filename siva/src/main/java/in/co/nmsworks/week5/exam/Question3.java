package in.co.nmsworks.week5.exam;
import java.util.Random;
import java.util.Scanner;

public class Question3 {

        public static void main(String[] args) {
            Question3 rng = new Question3();
            rng.getRandomNumber();
            int count = 0;
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter a Number :: ");
            int num = scanner.nextInt();
            while (rng.getRandomNumber() == num ){
                count++;
                break;

            }
            System.out.println(count);


        }

        private int getRandomNumber() {


            Random rand = new Random();




            return  rand.nextInt(10) + 1;
        }
    }


