package in.co.nmsworks.exam;

public class Question1 {
    public static void main(String[] args) {
        Question1 question1 = new Question1();
        for (int i = -273; i <=273 ; i++) {
            if(i == question1.convertCelsiusToFahrenheit(i)){
                System.out.println("degree:"+i);
                System.out.println("celcius:"+question1.convertCelsiusToFahrenheit(i));
            }
        }
    }
   private float convertCelsiusToFahrenheit(int degreeInCelcius){
        float fahreheit;

       fahreheit = (float)((1.8 * degreeInCelcius)+32);
       return fahreheit;
    }
}
