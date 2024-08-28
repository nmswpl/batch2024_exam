package in.co.nmsworks.exam;

/*Implement this method
private float convertCelsiusToFahrenheit(int degreeInCelcius)
The formula for converting Celsius to Fahrenheit is
F = (1.8 X C) + 32
Write a program to find the temperature at which both the Celsius and Fahrenheit scales show the same reading.
(Celsius range is -273 to 273)*/
public class CelsiusToFahrenheit {
    public static void main(String[] args) {
        CelsiusToFahrenheit celsius = new CelsiusToFahrenheit();

        for (int i = -273; i <= 273; i++) {
            float tempInF = celsius.convertCelsiusToFahrenheit(i);

            if (tempInF == i) {
                System.out.println("Temp In Celcius and Farenheit are same" + tempInF);
            }
        }
    }

    private float convertCelsiusToFahrenheit(int degreeInCelsius) {
        return (float) ((1.8 * degreeInCelsius) + 32);
    }

}