package in.co.nmsworks.exam;

public class Question1 {


    private float convertCelsiusToFahrenheit(int degreeInCelsius) {
        return (float) ((1.8 * degreeInCelsius) + 32);
    }

    public static void main(String[] args) {
        Question1 convertCelsiusToFahren = new Question1();
        for (int i = -273; i <= 273; i++) {
            float degInF = convertCelsiusToFahren.convertCelsiusToFahrenheit(i);
            if (degInF == i)
            {
                System.out.println("For Celcius "+i+" temp is F is :"+ degInF);
            }
        }


    }
}
