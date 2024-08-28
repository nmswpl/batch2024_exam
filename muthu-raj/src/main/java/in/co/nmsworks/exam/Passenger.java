package in.co.nmsworks.exam;

public class Passenger {
    private int survived;
    private int pClass;
    private String name;
    private String sex;
    private float age;
    private int siblingsSpouseCount;
    private int parentChildrenCount;
    private float fare;

    public Passenger(int survived, int pClass, String name, String sex, float age, int siblingsSpouseCount, int parentChildrenCount, float fare) {
        this.survived = survived;
        this.pClass = pClass;
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.siblingsSpouseCount = siblingsSpouseCount;
        this.parentChildrenCount = parentChildrenCount;
        this.fare = fare;
    }

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

    public float getAge() {
        return age;
    }

    public void setAge(float age) {
        this.age = age;
    }

    public int getSiblingsSpouseCount() {
        return siblingsSpouseCount;
    }

    public void setSiblingsSpouseCount(int siblingsSpouseCount) {
        this.siblingsSpouseCount = siblingsSpouseCount;
    }

    public int getParentChildrenCount() {
        return parentChildrenCount;
    }

    public void setParentChildrenCount(int parentChildrenCount) {
        this.parentChildrenCount = parentChildrenCount;
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
                ", pClass=" + pClass +
                ", name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", age=" + age +
                ", siblingsSpouseCount=" + siblingsSpouseCount +
                ", parentChildrenCount=" + parentChildrenCount +
                ", fare=" + fare +
                '}';
    }
}
