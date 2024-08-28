package in.co.nmsworks.exam;

public class Passenger {
    int survived;
    int pClass;
    String name;
    String sex;
    int Age;
    int siblingsOrSpouseAboard;
    int parentsOrChildrenAboard;
    float fare;

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
        return Age;
    }

    public void setAge(int age) {
        Age = age;
    }

    public int getSiblingsOrSpouseAboard() {
        return siblingsOrSpouseAboard;
    }

    public void setSiblingsOrSpouseAboard(int siblingsOrSpouseAboard) {
        this.siblingsOrSpouseAboard = siblingsOrSpouseAboard;
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

    public Passenger(int survived, int pClass, String name, String sex, int age, int siblingsOrSpouseAboard, int parentsOrChildrenAboard, float fare) {
        this.survived = survived;
        this.pClass = pClass;
        this.name = name;
        this.sex = sex;
        Age = age;
        this.siblingsOrSpouseAboard = siblingsOrSpouseAboard;
        this.parentsOrChildrenAboard = parentsOrChildrenAboard;
        this.fare = fare;
    }

    @Override
    public String toString() {
        return "Passenger{" +
                "survived=" + survived +
                ", pClass=" + pClass +
                ", name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", Age=" + Age +
                ", siblingsOrSpouseAboard=" + siblingsOrSpouseAboard +
                ", parentsOrChildrenAboard=" + parentsOrChildrenAboard +
                ", fare=" + fare +
                '}';
    }
}
