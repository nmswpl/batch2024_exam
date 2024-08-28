package in.co.nmsworks.exam;
/*
Given a CSV File titanic.csv, Create Passenger Object. [10 Marks]
a. Print Class wise survived people Count and Survival percentage [(No of people survived in class X /
Total number of people in class X) *100].
b. Get Input as Age from Console. Print the passenger ID and name where the passenger's age is less
than or equal to the given age
 */

public class Passenger {
    private int survived;
    private int pClass;
    private String name;
    private String sex;
    private int age;
    private int siblingsSpouseAboard;
    private int parentsChildrenAboard;
    private float fare;

    public int getSurvived() {
        return survived;
    }

    public void setSurvived(int survived) {
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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getSiblingsSpouseAboard() {
        return siblingsSpouseAboard;
    }

    public void setSiblingsSpouseAboard(int siblingsSpouseAboard) {
        this.siblingsSpouseAboard = siblingsSpouseAboard;
    }

    public int getParentsChildrenAboard() {
        return parentsChildrenAboard;
    }

    public void setParentsChildrenAboard(int parentsChildrenAboard) {
        this.parentsChildrenAboard = parentsChildrenAboard;
    }

    public float getFare() {
        return fare;
    }

    public void setFare(float fare) {
        this.fare = fare;
    }
}
