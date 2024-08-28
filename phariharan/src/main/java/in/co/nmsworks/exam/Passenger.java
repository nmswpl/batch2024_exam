package in.co.nmsworks.exam;

public class Passenger {
    private boolean isSurvived;
    private int pClass;
    private String name;
    private String gender;
    private float age;
    private int siblingOrSpouseCount;
    private int parentOrChildrenCount;

    public float getAge() {
        return age;
    }

    public void setAge(float age) {
        this.age = age;
    }

    public double getFare() {
        return fare;
    }

    public void setFare(double fare) {
        this.fare = fare;
    }

    private double fare;

    public Passenger(int survived, int pClass, String name, String gender, float age, int siblingOrSpouseCount, int parentOrChildrenCount, double fare) {
        this.isSurvived = survived == 1;
        this.pClass = pClass;
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.siblingOrSpouseCount = siblingOrSpouseCount;
        this.parentOrChildrenCount = parentOrChildrenCount;
        this.fare = fare;
    }

    public boolean isSurvived() {
        return isSurvived;
    }

    public void setSurvived(boolean survived) {
        isSurvived = survived;
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

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }


    public void setAge(int age) {
        this.age = age;
    }

    public int getSiblingOrSpouseCount() {
        return siblingOrSpouseCount;
    }

    public void setSiblingOrSpouseCount(int siblingOrSpouseCount) {
        this.siblingOrSpouseCount = siblingOrSpouseCount;
    }

    public int getParentOrChildrenCount() {
        return parentOrChildrenCount;
    }

    public void setParentOrChildrenCount(int parentOrChildrenCount) {
        this.parentOrChildrenCount = parentOrChildrenCount;
    }


    public void setFare(Float fare) {
        this.fare = fare;
    }
}
