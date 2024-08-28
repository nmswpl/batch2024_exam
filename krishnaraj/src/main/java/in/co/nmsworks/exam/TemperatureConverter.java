package in.co.nmsworks.exam;

/*****
 * Implement this method
 * private float convertCelsiusToFahrenheit(int degreeInCelcius)
 * The formula for converting Celsius to Fahrenheit is
 * F = (1.8 X C) + 32
 * Write a program to find the temperature at which both the Celsius and Fahrenheit scales show the same reading.
 * (Celsius range is -273 to 273)
 */
public class TemperatureConverter {
    float degreeInCelcius;
    float degreeInFahrenheit;

    private float convertCelsiusToFahrenheit(float degreeInCelcius) {
        degreeInFahrenheit = (float) (1.8 * degreeInCelcius) + 32;
        return degreeInFahrenheit;
    }

    public void compareCelciusAndFarenheit() {
        for (int i = -273; i <= 273; i++) {
            degreeInCelcius = i;
            degreeInFahrenheit = convertCelsiusToFahrenheit(degreeInCelcius);
            if (degreeInCelcius == degreeInFahrenheit) {
                System.out.println("Same value in both celcius and fahrenheit is : " + degreeInCelcius);
            }
        }
    }

    public static void main(String[] args) {
        TemperatureConverter temperatureConverter = new TemperatureConverter();
        temperatureConverter.compareCelciusAndFarenheit();
    }
}
