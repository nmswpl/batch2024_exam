package in.co.nmsworks.exam;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Question4a {
    public static void main(String[] args) {
        Question4a question4a = new Question4a();
        question4a.fileReading();
    }
    public void fileReading(){
        try {
            FileReader fr = new FileReader("/tmp/titanic.csv");
            BufferedReader br = new BufferedReader(fr);
            String line = br.readLine();
            line = br.readLine();
            int count = 0;
            int count1 = 0;
            int count2 = 0;
            int totalCount = 0;
            int totalCount1 = 0;
            int totalCount2 = 0;
            double percentage = 0.0;
            double percentage1 = 0.0;
            double percentage2 = 0.0;
            while(line != null){
                String[] lines = line.split(",");
                if(Integer.parseInt(lines[1]) == 1){
                    totalCount++;

                }
                if(Integer.parseInt(lines[1]) == 2){
                    totalCount1++;

                }
                if(Integer.parseInt(lines[1]) == 3){
                    totalCount2++;

                }
                if(Integer.parseInt(lines[1]) == 1 && Integer.parseInt(lines[0]) == 1 ){
                    count++;

                }
                if(Integer.parseInt(lines[1]) == 2 && Integer.parseInt(lines[0]) == 1 ){
                    count1++;

                }
                if(Integer.parseInt(lines[1]) == 3 && Integer.parseInt(lines[0]) == 1 ){
                    count2++;

                }
                percentage = ((double) count /totalCount)*100;
                percentage1 = ((double) count1 /totalCount1)*100;
                percentage2 = ((double) count2 /totalCount2)*100;
                line = br.readLine();

            }
            System.out.println("People Survied in Class 1 :: "+count);
            System.out.println("People Survied in Class 2 :: "+count1);
            System.out.println("People Survied in Class 3 :: "+count2);
            System.out.println("Survival Percentage Class 1 ::"+percentage);
            System.out.println("Survival Percentage Class 2 ::"+percentage1);
            System.out.println("Survival Percentage Class 3 ::"+percentage2);
            br.close();
            fr.close();



        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
