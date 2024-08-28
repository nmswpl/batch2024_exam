package in.co.nmsworks.exam;
/*
Implement this method
private float convertCelsiusToFahrenheit(int degreeInCelsius)
The formula for converting Celsius to Fahrenheit is
F = (1.8 X C) + 32
Write a program to find the temperature at which both the Celsius and Fahrenheit scales show the same reading.
(Celsius range is -273 to 273)
 */

public class CelsiusToFahrenheit {
    private float convertCelsiusToFahrenheit(int degreeInCelsius){
        float fahrenheit = (float) ((1.8 * degreeInCelsius) + 32);
        return fahrenheit;
    }

    public void findTemperature(){
        for (int degreeInCelsius = -273; degreeInCelsius <= 273; degreeInCelsius++) {
            if (degreeInCelsius == convertCelsiusToFahrenheit(degreeInCelsius)){
                System.out.println("Temperature : " + degreeInCelsius);
            }
        }
    }

    public static void main(String[] args) {
        CelsiusToFahrenheit celsiusToFahrenheit = new CelsiusToFahrenheit();
        System.out.println("Celsius to Fahrenheit : " + celsiusToFahrenheit.convertCelsiusToFahrenheit(100));
        celsiusToFahrenheit.findTemperature();
    }

}
