package in.co.nmsworks.exam;
/*Given a CSV File titanic.csv, Create Passenger Object. [10 Marks]
a. Print Class wise survived people Count and Survival percentage [(No of people survived in class X /
Total number of people in class X) *100].
b. Get Input as Age from Console. Print the passenger ID and name where the passenger's age is less
than or equal to the given age*/
import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FileParsing {
    public static void main(String[] args) {
        FileParsing fp = new FileParsing();
        //fp.survivalPercentage(3);
        fp.age();


    }

    int count = 0;
    int survivalPercentage;


    public void survivalPercentage(int classNumber) {
        try {
            FileReader fr = new FileReader("/tmp/titanic.csv");
            BufferedReader br = new BufferedReader(fr);
            FileWriter fw = new FileWriter("/home/nms/Sample.txt");
            BufferedWriter bw = new BufferedWriter(fw);
            String line = br.readLine();
            String str[] = new String[]{""};
            br.readLine();
            while (line != null) {
                str = line.split(",");
                if (str[0].equals("1")) {
                    count++;
                }
            }//System.out.println(str.toString());
            System.out.println(count);

            br.close();
            fr.close();
            bw.close();
            fw.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void age() {
        List<String> name = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter age:");
        int age = scanner.nextInt();
        try {
            FileReader fr = new FileReader("/tmp/titanic.csv");
            BufferedReader br = new BufferedReader(fr);
            FileWriter fw = new FileWriter("/home/nms/Sample.txt");
            BufferedWriter bw = new BufferedWriter(fw);
            Scanner scanner1 = new Scanner(System.in);
            int ageOfPassenger = scanner1.nextInt();
            String line = br.readLine();
            br.readLine();
            String str1[] = new String[]{""};
            while (line != null) {
                str1 = line.split(",");
                for (int i = 0; i < str1.length; i++) {
                    if (Integer.parseInt(str1[4]) > ageOfPassenger) {
                        name.add(str1[2]);
                        System.out.println(str1[2].toString());
                    }
                    System.out.println(name);
                }

                br.close();
                fr.close();
                bw.close();
                fw.close();
            }
            } catch(IOException e){
                throw new RuntimeException(e);
            }

    }
}



