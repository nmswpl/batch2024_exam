package in.co.nmsworks.exam;

public class Passenger {
    private int survied;
    private int pclass;
    private String name;
    private String sex;

    private float age;
    private int siblings;
    private int parentsChild;
    private float fare;

    public Passenger(int i, String string) {
    }

    public Passenger(int survied, int pclass, String name, String sex, float age, int siblings, int parentsChild, float fare) {
        this.survied = survied;
        this.pclass = pclass;
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.siblings = siblings;
        this.parentsChild = parentsChild;
        this.fare = fare;
    }

    public int getSurvied() {
        return survied;
    }

    public void setSurvied(int survied) {
        this.survied = survied;
    }

    public int getPclass() {
        return pclass;
    }

    public void setPclass(int pclass) {
        this.pclass = pclass;
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

    public void setAge(int age) {
        this.age = age;
    }

    public int getSiblings() {
        return siblings;
    }

    public void setSiblings(int siblings) {
        this.siblings = siblings;
    }

    public int getParentsChild() {
        return parentsChild;
    }

    public void setParentsChild(int parentsChild) {
        this.parentsChild = parentsChild;
    }

    public float getFare() {
        return fare;
    }

    public void setFare(float fare) {
        this.fare = fare;
    }
}
