package in.co.nmsworks.exam;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;

public class Question4b {
    public static void main(String[] args) {
        Question4b question4b = new Question4b();
        question4b.fileReading();

    }
    public void fileReading(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Age :: ");
        int age = scanner.nextInt();
        try {
            FileReader fr = new FileReader("/tmp/titanic.csv");
            BufferedReader br = new BufferedReader(fr);
            String line = br.readLine();
            line = br.readLine();
            List<Passenger> nameAndAge = new ArrayList<>();
            while(line != null){
               String [] lines = line.split(",");
               if(Integer.parseInt(lines[4])<=age){
                   nameAndAge.add(new Passenger((Float.parseFloat(lines[4])),lines[2]));

               }
            }
            System.out.println(nameAndAge);
            br.close();
            fr.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
