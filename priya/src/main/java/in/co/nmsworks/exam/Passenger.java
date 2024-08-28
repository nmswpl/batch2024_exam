package in.co.nmsworks.exam;

import java.io.BufferedReader;
import java.io.FileReader;
import java.sql.SQLOutput;
import java.util.*;

public class Passenger {
    private boolean survived;
   private int pClass;
   private String name;
   private String sex;
   private float age;
   private int siblingsOrSpouse;
    private int parentOrChildren;
    private float fare;
    List<Passenger> passengers = new ArrayList<>();

    public boolean getSurvived() {
        return survived;
    }

    public void setSurvived(boolean survived) {
        this.survived = survived;
    }

    public int getpClass() {
        return pClass;
    }

    public void setpClass(int pClass) {
        this.pClass = pClass;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public float getAge() {
        return age;
    }

    public void setAge(float age) {
        this.age = age;
    }

    public int getSiblingsOrSpouse() {
        return siblingsOrSpouse;
    }

    public void setSiblingsOrSpouse(int siblingsOrSpouse) {
        this.siblingsOrSpouse = siblingsOrSpouse;
    }

    public int getParentOrChildren() {
        return parentOrChildren;
    }

    public void setParentOrChildren(int parentOrChildren) {
        this.parentOrChildren = parentOrChildren;
    }

    public float getFare() {
        return fare;
    }

    public void setFare(float fare) {
        this.fare = fare;
    }

    public Passenger(boolean survived, int pClass, String name, String sex, float age, int siblingsOrSpouse, int parentOrChildren, float fare) {
        this.survived = survived;
        this.pClass = pClass;
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.siblingsOrSpouse = siblingsOrSpouse;
        this.parentOrChildren = parentOrChildren;
        this.fare = fare;
    }

    public Passenger() {
    }

    @Override
    public String toString() {
        return "Passenger{" +
                "survived=" + survived +
                ", pClass=" + pClass +
                ", name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", age=" + age +
                ", siblingsOrSpouse=" + siblingsOrSpouse +
                ", parentOrChildren=" + parentOrChildren +
                ", fare=" + fare +
                '}';
    }

    public void parseFile(){
        try(FileReader fr = new FileReader("/tmp/titanic.csv");
        BufferedReader br = new BufferedReader(fr)){
            String line;
            br.readLine();
            String[] arr={};
            while((line=br.readLine())!=null) {
                arr = line.split(",");
                 boolean survived =Boolean.parseBoolean(arr[0]);
                 int pClass = Integer.parseInt(arr[1]);
                String name= arr[2];
                String sex = arr[3];
                float age = Float.parseFloat(arr[4]);
                int sib = Integer.parseInt(arr[5]);
                int par = Integer.parseInt(arr[6]);
                float fare = Float.parseFloat(arr[7]);

                
              Passenger passenger = new Passenger(survived,pClass,name,sex,age,sib,par,fare);
                passengers.add(passenger);
            }
            System.out.println(passengers);

        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
    public void getNameToAge(float age){
        parseFile();

        for (Passenger passenger : passengers) {
              if(passenger.getAge()>=age){
                  System.out.println(passenger.getAge()+ " "+passenger.getName());
              }
        }

    }
    public void getClassWiseSurvivalRate(){
        parseFile();
        Map<Integer,Integer> classToPassenger = new HashMap<>(Collections.emptyMap());
        for (Passenger passenger : passengers) {
              if(classToPassenger.containsKey(passenger.getpClass())) {
                  classToPassenger.put(passenger.getpClass(),classToPassenger.get(passenger.getpClass())+1);
              }
              else{
                  classToPassenger.put(passenger.getpClass(),1);
              }
        }


        for (Integer i : classToPassenger.keySet()) {
            System.out.println(i+" "+(classToPassenger.get(i)/10));
        }

    }

    public static void main(String[] args) {
        Passenger p = new Passenger();
        p.getNameToAge(27.0f);
        p.getClassWiseSurvivalRate();
    }
}
