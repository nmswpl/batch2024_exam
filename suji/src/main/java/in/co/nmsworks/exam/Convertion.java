package in.co.nmsworks.exam;
 public class Convertion
 {
     private float convertCelsiusToFahrenheit(int degreeInCelcius)
     {

        return  (float) ((1.8 * degreeInCelcius) + 32);
     }

     public void check(float fahrenheit,float celsius)
     {
         if (fahrenheit==celsius)
         {
             System.out.println(" The temperature at which both the Celsius and Fahrenheit scales show the same reading is  :: ");
         }
     }
     public void getTemperature(float fahrenheit)
     {
         System.out.println(" The temperature at which both the Celsius and Fahrenheit scales show the same reading is  :: "+fahrenheit);
     }

     public static void main(String[] args) {
         Convertion ob = new Convertion();
        float temperature = 0;
         for (int i = -273; i < 273; i++)
         {
             temperature = ob.convertCelsiusToFahrenheit(i);
             if (i==temperature)
             {
                 ob.getTemperature(i);
             }
         }
     }
 }



