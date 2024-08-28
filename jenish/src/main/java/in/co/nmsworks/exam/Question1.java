package in.co.nmsworks.exam;

public class Question1 {
    private float convertCelsiusToFahrenheit(int degreeInCelsius) {
        float fahrenheit = (float) (1.8 * degreeInCelsius) + 32;
        return fahrenheit;
    }

    public void findTemperature() {
        for (int celsius = -273; celsius <= 273; celsius++) {
            float fahrenheit = convertCelsiusToFahrenheit(celsius);
            if ((float) celsius == fahrenheit) {
                System.out.println("The Temperature that shows same reading in Celsius and Fahrenheit is " + celsius);
                break;
            }
        }
    }
}