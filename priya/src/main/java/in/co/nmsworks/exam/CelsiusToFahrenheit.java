package in.co.nmsworks.exam;

/*Implement this method
private float convertCelsiusToFahrenheit(int degreeInCelcius)
The formula for converting Celsius to Fahrenheit is
        F = (1.8 X C) + 32*/
public class CelsiusToFahrenheit {
    float fahrenheit;
    private float convertCelsiusToFahrenheit(int degreeInCelcius) {
       fahrenheit  = (1.8f * degreeInCelcius )+ 32;
        return fahrenheit;
    }

    public static void main(String[] args) {
        CelsiusToFahrenheit c = new CelsiusToFahrenheit();
       for (int i = -273; i <= 273; i++) {
            if(i==c.convertCelsiusToFahrenheit(i)){
                System.out.println(i);
            }
        }
    }
}
