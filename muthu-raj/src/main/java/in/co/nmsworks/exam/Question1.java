package in.co.nmsworks.exam;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Question1 {
    public static void main(String[] args) {

        Question1 q = new Question1();
        for (int i = -273; i <= 273; i++) {
            if (q.convertCelsiusToFahrenheit(i) == (float) i) {
                System.out.println("The Celsius and Fahrenheit will be same at " + i);
            }
        }
    }

    private float convertCelsiusToFahrenheit(int degreeInCelsius) {
        return (float) (1.8 * degreeInCelsius) + 32;
    }
}
