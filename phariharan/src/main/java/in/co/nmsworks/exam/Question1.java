package in.co.nmsworks.exam;

public class Question1 {
    public static void main(String[] args) {
        Question1 temperatureConverter = new Question1();
        for (int i = -273; i < 274; i++) {
            float fahrenheit = temperatureConverter.convertCelsiusToFahrenheit(i);
            if ((float) i == fahrenheit) {
                System.out.println("Celsius :" + (float) i + "\t| Fahrenheit :" + fahrenheit);
            }
        }
    }

    private float convertCelsiusToFahrenheit(int tempInCelsius) {
        float temperatureInFahrenheit = (float) ((1.8 * (float) tempInCelsius) + 32);
        return temperatureInFahrenheit;
    }
}
