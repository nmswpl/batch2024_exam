package in.co.nmsworks.exam;

public class Passenger {
    private int survived;
    private int pcClass;
    private String name;
    private String gender;
    private float age;
    private int siblingOrSpouseAboard;
    private int parentOrChildrenAboard;
    private float fare;

    public Passenger(int survived,  int pcClass,String name, String gender, float age, int siblingOrSpouseAboard, int parentOrChildrenAboard, float fare) {
        this.survived = survived;
        this.name = name;
        this.pcClass = pcClass;
        this.gender = gender;
        this.age = age;
        this.siblingOrSpouseAboard = siblingOrSpouseAboard;
        this.parentOrChildrenAboard = parentOrChildrenAboard;
        this.fare = fare;
    }

    public int getSurvived() {
        return survived;
    }

    public void setSurvived(int survived) {
        this.survived = survived;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPcClass() {
        return pcClass;
    }

    public void setPcClass(int pcClass) {
        this.pcClass = pcClass;
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

    public int getSiblingOrSpouseAboard() {
        return siblingOrSpouseAboard;
    }

    public void setSiblingOrSpouseAboard(int siblingOrSpouseAboard) {
        this.siblingOrSpouseAboard = siblingOrSpouseAboard;
    }

    public int getParentOrChildrenAboard() {
        return parentOrChildrenAboard;
    }

    public void setParentOrChildrenAboard(int parentOrChildrenAboard) {
        this.parentOrChildrenAboard = parentOrChildrenAboard;
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
                ", siblingOrSpouseAboard=" + siblingOrSpouseAboard +
                ", parentOrChildrenAboard=" + parentOrChildrenAboard +
                ", fare=" + fare +
                '}';
    }
}
