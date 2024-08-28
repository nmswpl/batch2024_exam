package in.co.nmsworks.exam;

public class CelciusToFarenheit {
    public static void main(String[] args) {
        CelciusToFarenheit cf = new CelciusToFarenheit();
        for (int i=-273 ; i<=273; i++) {
        float farenheit = cf.convertCelsiusToFahrenheit(i);
            if (i == farenheit){
                System.out.println("Celsius :"+i+" Farenheit : "+farenheit);
            }
        }
    }

    private float convertCelsiusToFahrenheit(int degreeInCelcius){
        float fahrenheit = 0;
        fahrenheit = (float) ((1.8 * degreeInCelcius) + 32);
        return fahrenheit;
    }

}


