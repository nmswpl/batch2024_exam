package in.co.nmsworks.exam;

import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Question4 {

    private FileReader fileReader;
    private BufferedReader bufferedReader;
    Map<Integer, Integer> classToSurvivalCount = new HashMap<>();
    Map<Integer, Integer> classToNonSurvivalCount = new HashMap<>();

    public Question4(){

    }

    public static void main(String[] args) {
       Question4 question4 =new Question4();
        try {
            question4.calculateSurvivalRate();
            question4.getAgeName();
        } catch (IOException e) {
            System.out.println(e);
        }
    }

    public void calculateSurvivalRate() throws IOException {

        try {
            fileReader = new FileReader("/tmp/titanic.csv");
            bufferedReader = new BufferedReader(fileReader);
            String line;
            line =  bufferedReader.readLine(); //Skip the Header
            while ((line =bufferedReader.readLine()) != null){
                String[] servivalData  = line.split(",");
                if(Integer.valueOf(servivalData[0]) ==1){
                    if(classToSurvivalCount.containsKey(Integer.valueOf(servivalData[1])) ){
                        classToSurvivalCount.put(Integer.valueOf(servivalData[1]), classToSurvivalCount.get(Integer.valueOf(servivalData[1])) + 1);
                    }else{
                        classToSurvivalCount.put(Integer.valueOf(servivalData[1]),1);
                    }
                }else{
                    if(classToNonSurvivalCount.containsKey(Integer.valueOf(servivalData[1]))){

                        classToNonSurvivalCount.put(Integer.valueOf(servivalData[1]), classToNonSurvivalCount.get(Integer.valueOf(servivalData[1]))+1);

                    }else{
                        classToNonSurvivalCount.put(Integer.valueOf(servivalData[1]),1);
                    }

                }


            }

            System.out.println(classToSurvivalCount);
            System.out.println(classToNonSurvivalCount);


           for(int i =1; i<= classToNonSurvivalCount.size();i++){
               System.out.println("Class: " + i);
               System.out.println("Servived People: " + classToSurvivalCount.get(i));
               System.out.println("Servived Percentage: " + (float)(classToSurvivalCount.get(i) * 100)/(classToNonSurvivalCount.get(i)+ classToSurvivalCount.get(i)));
               System.out.println("/n");
           }
        } catch (IOException e) {
            System.out.println(e);
        }finally {
            fileReader.close();
            bufferedReader.close();
        }

    }

    public void getAgeName() throws IOException {
        Scanner sc= new Scanner(System.in);
        int age;
        do{
            System.out.println("Enter -1 to exit");
            System.out.println("Enter the Age: ");
          age = sc.nextInt();

            try {
                fileReader = new FileReader("/tmp/titanic.csv");
                bufferedReader = new BufferedReader(fileReader);
                String line;

                line = bufferedReader.readLine();// skip the header
                while ((line = bufferedReader.readLine()) != null){
                    String[] details = line.split(",");
                    if(Integer.valueOf((int) Math.abs(Double.valueOf(details[4]))) <= age){
                        System.out.println("****************************************");
                        System.out.println("Name: " + details[2]);
                        System.out.println("Age: " + details[4]);
                        System.out.println("****************************************");
                    }
                }
            } catch (IOException e) {
                System.out.println(e);
            }finally {
                fileReader.close();
                bufferedReader.close();
            }
        }while (age != -1);





    }
}
