package in.co.nmsworks.exam;

/**
 * Java Training Exam 2024
 * 1. Implement this method
 * private float convertCelsiusToFahrenheit(int degreeInCelcius)
 * The formula for converting Celsius to Fahrenheit is
 * F = (1.8 X C) + 32
 * Write a program to find the temperature at which both the Celsius and Fahrenheit scales show the same reading
 */

public class Question1 {
    public static void main(String[] args) {
        Question1 question1 = new Question1();
        //System.out.println(question1.convertCelsiusToFahrenheit(1)+" Fahrenheit");
        for (int i =-273;i<=273;i++){
            if(i == question1.convertCelsiusToFahrenheit(i)){
                System.out.println("Same Value of Celsius and Fahrenheit :: "+i);
            }
        }
    }
    private float convertCelsiusToFahrenheit(int degreeInCelcius){
        float fahrenheit = 0.0f;
        fahrenheit = (float)(1.8 * degreeInCelcius)+32;
        return fahrenheit;
    }

}
