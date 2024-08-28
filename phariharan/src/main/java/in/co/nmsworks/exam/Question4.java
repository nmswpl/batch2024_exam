package in.co.nmsworks.exam;

import java.io.*;
import java.util.*;

public class Question4 {
    static FileReader fileReader;
    static BufferedReader bufferedReader;

    Question4() {
        try {
            fileReader = new FileReader("/tmp/titanic.csv");
            bufferedReader = new BufferedReader(fileReader);

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args) {
        Question4 question4 = new Question4();
        List<Passenger> passengerList = question4.generatePassengerList();
        question4.printCountOfClassWise(passengerList);
        System.out.print("\n\n\nEnter the age to get names of passenger less than or equal : ");
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        question4.getPassengerNameByAgeLimit(passengerList,age);
        question4.close();

    }

    private void getPassengerNameByAgeLimit(List<Passenger> passengerList, int i) {
        System.out.println("Name of the Passengers less than the given age "+i+" are given below :");
        for (Passenger passenger : passengerList) {
            if(passenger.getAge() <= (float) i){
                System.out.println("Name :"+passenger.getName()+"\t\t|||\tAge :"+(int)passenger.getAge());
            }
        }
    }


    private void printCountOfClassWise(List<Passenger> list) {
        int countSurvivoursClass1 = 0;
        int countSurvivoursClass2 = 0;
        int countSurvivoursClass3 = 0;
        int totalCount = 0;
        for (Passenger passenger : list) {
            totalCount++;
            if(passenger.getpClass() == 1 & passenger.isSurvived()){
                countSurvivoursClass1++;
            } else if (passenger.getpClass() == 2 & passenger.isSurvived()) {
                countSurvivoursClass2++;
            }else {
                countSurvivoursClass3++;
            }
        }
        int class1Percentage = (countSurvivoursClass1*100)/totalCount;
        int class2Percentage = (countSurvivoursClass2*100)/totalCount;
        int class3Percentage = (countSurvivoursClass3*100)/totalCount;

        System.out.println("Total number of survived peoples");
        System.out.println("Class 1 |\tcount "+countSurvivoursClass1+"\tPercentage : "+class1Percentage);
        System.out.println("Class 2 |\tcount "+countSurvivoursClass2+"\tPercentage : "+class2Percentage);
        System.out.println("Class 3 |\tcount "+countSurvivoursClass3+"\tPercentage : "+class3Percentage);

    }

    private List<Passenger> generatePassengerList() {
        try {
            List<Passenger> passengerList = new ArrayList<>();
            String line = bufferedReader.readLine();
            while ((line = bufferedReader.readLine()) != null) {
                String[] lineArray = line.split(",");
//                System.out.println(Arrays.toString(lineArray));
                passengerList.add(new Passenger(Integer.parseInt(lineArray[0]), Integer.parseInt(lineArray[1]), lineArray[2], lineArray[3], Float.valueOf(lineArray[4]), Integer.parseInt(lineArray[5]), Integer.parseInt(lineArray[6]),Double.parseDouble(lineArray[7])));
            }
            return passengerList;
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    void close() {
        try {
            if (bufferedReader != null) {
                bufferedReader.close();
                System.out.println("Buffered Reader Closed");
            }
            if (fileReader != null) {
                fileReader.close();
                System.out.println("FileReader Closed");
            }
        } catch (Exception e) {
            System.out.println("Cannot close the filereader");
            e.printStackTrace();
        }
    }
}
