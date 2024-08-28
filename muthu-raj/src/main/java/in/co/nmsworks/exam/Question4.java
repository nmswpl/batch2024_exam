package in.co.nmsworks.exam;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.*;

public class Question4 {


    public static void main(String[] args) {

        List<Passenger> passengerList = fillAndReturnPassengerList();
        Map<Integer, Integer> survivedCount = getSurvivedCount(passengerList);

        Scanner sc = new Scanner(System.in);
        int choice = 0;

        do{
            System.out.println("-----------------------------------------");
            System.out.println("1. Get classwise Survivor count\n" +
                    "2. Get survival percentage of each class\n" +
                    "3. Get passengers Less than a specified age\n" +
                    "4. Exit");
            System.out.println("Enter your choice ::");
            choice = sc.nextInt();

            switch (choice)
            {
                case 1:
                    for (Integer pClass : survivedCount.keySet()) {

                        System.out.println("Survived people count of class " + pClass + " is " + survivedCount.get(pClass));
                    }
                    break;

                case 2:
                    Map<Integer, Integer> classWiseTotalCount = getClassWiseCount(passengerList);

                    for (Integer pClass : classWiseTotalCount.keySet()) {

                        System.out.println("Survival Percentage of class " + pClass + " is " +  ((float)survivedCount.get(pClass) / (float)classWiseTotalCount.get(pClass)) * 100);
                    }
                    break;

                case 3:
                    getPassengersYoungerThan(passengerList);
                    break;

                default:
                    System.out.println("Exiting..");
                    return;
            }

        }while(choice != 4);

    }

    private static void getPassengersYoungerThan(List<Passenger> passengerList)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the age ::");
        int age =  sc.nextInt();
        System.out.println("Passengers younger than " + age);
        int row = 1;
        for (Passenger passenger : passengerList) {

            if(passenger.getAge() <= age)
            {
                System.out.println("--------------------"+ row++ +"------------------");
                System.out.println("Passenger name :: " + passenger.getName());
                System.out.println("Passengers Age :: " + passenger.getAge());
            }
        }
    }

    private static Map<Integer, Integer> getClassWiseCount(List<Passenger> passengerList)
    {
        Map<Integer, Integer> classWiseCount = new HashMap<>();
        for (Passenger passenger : passengerList) {
            int pClass = passenger.getpClass();
            if(classWiseCount.containsKey(pClass))
            {
                int count = classWiseCount.get(pClass);
                classWiseCount.put(pClass, count + passenger.getpClass());
            }
            else {
                classWiseCount.put(pClass, passenger.getpClass());
            }
        }
        return classWiseCount;
    }

    private static Map<Integer, Integer> getSurvivedCount(List<Passenger> passengerList)
    {
        Map<Integer, Integer> classWiseCount = new HashMap<>();
        for (Passenger passenger : passengerList) {
            int pClass = passenger.getpClass();
            if(classWiseCount.containsKey(pClass))
            {
                int count = classWiseCount.get(pClass);
                if(passenger.getSurvived() == 1)
                    classWiseCount.put(pClass, count + 1);
            }
            else {
                if(passenger.getSurvived() == 1)
                    classWiseCount.put(pClass, 1);
            }
        }
        return classWiseCount;
    }

    private static List<Passenger> fillAndReturnPassengerList()
    {
        List<Passenger> passengerList = new ArrayList<>();

        try(FileReader fr = new FileReader("/tmp/titanic.csv");
            BufferedReader br =  new BufferedReader(fr))
        {
            String headers = br.readLine();
            String line = br.readLine();
            Passenger p;
            while(line != null)
            {
                String[] details = line.split(",");
                p = new Passenger(Integer.parseInt(details[0]),
                        Integer.parseInt(details[1]),
                        details[2],
                        details[3],
                        Float.parseFloat(details[4]),
                        Integer.parseInt(details[5]),
                        Integer.parseInt(details[6]),
                        Float.parseFloat(details[7])
                );
                passengerList.add(p);

                line = br.readLine();
            }
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        return passengerList;
    }
}
