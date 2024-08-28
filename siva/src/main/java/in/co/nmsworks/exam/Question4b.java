package in.co.nmsworks.exam;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Question4b {
    public void fileReading(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Age :: ");
        int age = scanner.nextInt();
        try {
            FileReader fr = new FileReader("/tmp/titanic.csv");
            BufferedReader br = new BufferedReader(fr);
            String line = br.readLine();
            line = br.readLine();
            List<>
            while(line != null){
               String [] lines = line.split(",");
               if(Integer.parseInt(lines[4])<=age){

               }
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
