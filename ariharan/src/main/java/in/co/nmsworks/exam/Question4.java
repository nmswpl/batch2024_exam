package in.co.nmsworks.exam;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.*;

//Given a CSV File titanic.csv, Create Passenger Object. [10 Marks]
//a. Print Class wise survived people Count and Survival percentage [(No of people survived in class X /
//Total number of people in class X) *100].
//b. Get Input as Age from Console. Print the passenger ID and name where the passenger's age is less
//than or equal to the given age
public class Question4 {
    public static void main( String[] args ){
        Question4 question4=new Question4();
        question4.survivedPeopleCount();
        question4.printDetailsByAge();

    }
    private List<Passenger> retriveFromCSVFIle(){
        List<Passenger> passengersList =new ArrayList<>();
        try (FileReader fr=new FileReader("/tmp/titanic.csv");
             BufferedReader br= new BufferedReader(fr)){
            br.readLine();
            String line="";
            while ((line = br.readLine())!=null){
                String[] details=line.split(",");
                Passenger newPassenger=new Passenger();
                newPassenger.setSurvivedStatus(Integer.parseInt(details[0]));
                newPassenger.setpClass(Integer.parseInt(details[1]));
                newPassenger.setName(details[2]);
                newPassenger.setGender(details[3]);
                newPassenger.setAge(Float.parseFloat(details[4]));
                newPassenger.setSiblingsAndSpouses(Integer.parseInt(details[5]));
                newPassenger.setParentsAndChildren(Integer.parseInt(details[6]));
                newPassenger.setFare(Float.parseFloat(details[7]));
                passengersList.add(newPassenger);
            }

        }catch (Exception e){
            e.printStackTrace();
        }
        return passengersList;
    }
    public  void survivedPeopleCount(){
        List<Passenger> passengerList=retriveFromCSVFIle();
        Map<Integer,Integer> pClassAndSurvivalCount=new HashMap<>();
        Map<Integer,Integer> pClassAndCount=new HashMap<>();

        int passengerCount=0,count=0;
        for (Passenger passenger : passengerList) {
            if (passenger.getSurvivedStatus()==1) {
                if (pClassAndSurvivalCount.containsKey(passenger.getpClass())) {
                    passengerCount=pClassAndSurvivalCount.get(passenger.getpClass()) +1;
                }
                else {
                    passengerCount=1;
                }
                pClassAndSurvivalCount.put(passenger.getpClass(),passengerCount);
            }
            if (pClassAndCount.containsKey(passenger.getpClass())) {
                count=pClassAndCount.get(passenger.getpClass()) +1;
            }
            else {
                count=1;
            }
            pClassAndCount.put(passenger.getpClass(),count);

        }
        int totalcountOfclass1=pClassAndCount.get(1);
        int totalcountOfclass2=pClassAndCount.get(2);
        int totalcountOfclass3=pClassAndCount.get(3);
        for (Map.Entry<Integer, Integer> pclassAndCount : pClassAndSurvivalCount.entrySet()) {
            System.out.println("passenger class: " + pclassAndCount.getKey());
            System.out.println("survival count:  " + pclassAndCount.getValue());
        }
        System.out.println("survival percentage of pclass 1 is::"+(float)(pClassAndSurvivalCount.get(1)*100/totalcountOfclass1));
        System.out.println("survival percentage of pclass 2 is::"+(float)(pClassAndSurvivalCount.get(2)*100/totalcountOfclass2));
        System.out.println("survival percentage of pclass 3 is::"+(float)(pClassAndSurvivalCount.get(3)*100/totalcountOfclass3));

    }
   // /b. Get Input as Age from Console. Print the passenger ID and name where the passenger's age is less
    //than or equal to the given age
    public void printDetailsByAge(){
        List<Passenger> passengerList=retriveFromCSVFIle();
        Scanner sc=new Scanner(System.in);
        System.out.println(" enter the age ::");
        float age=sc.nextFloat();
        for (Passenger passenger : passengerList) {
            if(passenger.getAge()<=age){
                System.out.println("the name of the passenger is::"+passenger.getName());
                System.out.println("the age of the passenger is::"+passenger.getAge());
                System.out.println();
            }
        }

    }

}
