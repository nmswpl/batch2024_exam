package in.co.nmsworks.exam;

public class Passenger {

    private int survived;
    private int pcClass;
    private String name;
    private String gender;
    private float age;
    private int siblingOrSpousesAboard;
    private int parentsOrChildrenAboard;
    private float fare;

    public Passenger() {
    }

    public Passenger(int survived, int pcClass, String name, String gender, float age, int siblingOrSpousesAboard, int parentsOrChildrenAboard, float fare) {
        this.survived = survived;
        this.pcClass = pcClass;
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.siblingOrSpousesAboard = siblingOrSpousesAboard;
        this.parentsOrChildrenAboard = parentsOrChildrenAboard;
        this.fare = fare;
    }

    public int getSurvived() {
        return survived;
    }

    public void setSurvived(int survived) {
        this.survived = survived;
    }

    public int getPcClass() {
        return pcClass;
    }

    public void setPcClass(int pcClass) {
        this.pcClass = pcClass;
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

    public float getAge() {
        return age;
    }

    public void setAge(float age) {
        this.age = age;
    }

    public int getSiblingOrSpousesAboard() {
        return siblingOrSpousesAboard;
    }

    public void setSiblingOrSpousesAboard(int siblingOrSpousesAboard) {
        this.siblingOrSpousesAboard = siblingOrSpousesAboard;
    }

    public int getParentsOrChildrenAboard() {
        return parentsOrChildrenAboard;
    }

    public void setParentsOrChildrenAboard(int parentsOrChildrenAboard) {
        this.parentsOrChildrenAboard = parentsOrChildrenAboard;
    }

    public float getFare() {
        return fare;
    }

    public void setFare(float fare) {
        this.fare = fare;
    }

    @Override
    public String toString() {
        return "Passenger{" +
                "survived=" + survived +
                ", pcClass=" + pcClass +
                ", name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", age=" + age +
                ", siblingOrSpousesAboard=" + siblingOrSpousesAboard +
                ", parentsOrChildrenAboard=" + parentsOrChildrenAboard +
                ", fare=" + fare +
                '}';
    }
}