package in.co.nmsworks.exam;

/**
 * 1. Implement this method
 * private float convertCelsiusToFahrenheit(int degreeInCelcius)
 * The formula for converting Celsius to Fahrenheit is
 * F = (1.8 X C) + 32
 * Write a program to find the temperature at which both the Celsius and Fahrenheit scales show the same reading.
 * (Celsius range is -273 to 273) (5 marks)
 */

public class Question1 {
    int fahrenheit;
    int celcius;

    private float convertCelsiusToFahrenheit(int degreeInCelcius){


        fahrenheit = (int) ((1.8 * degreeInCelcius) + 32);

                return fahrenheit;
            }

    public void findTemperature(){

        for(celcius = -273;celcius<=273;celcius++){
            if(celcius==fahrenheit){
                System.out.println("The temperatute is same celcius : " + celcius + " fahrenheit : " + fahrenheit);
            }
        }

    }


    public static void main(String[] args) {
        Question1 celciusToFahrenheit = new Question1();
        System.out.println(celciusToFahrenheit.convertCelsiusToFahrenheit(33));
        celciusToFahrenheit.findTemperature();
    }

}
