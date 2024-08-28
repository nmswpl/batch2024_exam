package in.co.nmsworks;

public class Conversion {

    private float convertCelsiusToFahrenheit(int degreeInCelcius)
    {
        float fahrenheit;
        fahrenheit = (float) ((1.8 * degreeInCelcius) + 32);
        return fahrenheit;
    }
    public void findFahrenheitAndCelsiusAreSame(){
        float fahrenheit;
        for (int i = -273; i <= 273 ; i++) {
            fahrenheit = (float) ((1.8 * i) + 32);
            if(i == fahrenheit)
                System.out.println(fahrenheit + " is same as celcius " + i);
        }
    }

    public static void main(String[] args) {

        Conversion c = new Conversion();
        System.out.println("Fahrenheit : " + c.convertCelsiusToFahrenheit(-48));
        c.findFahrenheitAndCelsiusAreSame();
    }

}
