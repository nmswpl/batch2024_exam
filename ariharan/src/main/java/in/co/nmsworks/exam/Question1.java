package in.co.nmsworks.exam;

//Write a program to find the temperature at which both the Celsius and Fahrenheit scales show the same reading.
public class Question1 {
    public static void main( String[] args ){
        System.out.println("the common degree for both degrees are :");
        for (int celcius = -273; celcius <274 ; celcius++) {
            float fahrenheit= new Question1().convertCelsiusToFahrenheit(celcius);
            if( celcius==fahrenheit){
                System.out.println("celcius :"+celcius+"  fahrenheit :"+fahrenheit);
            }

        }

    }
    private float convertCelsiusToFahrenheit(int degreeInCelcius){
        float degreeInFahrenheit= (float) ((1.8 * degreeInCelcius) + 32);
        return degreeInFahrenheit;
    }
}
