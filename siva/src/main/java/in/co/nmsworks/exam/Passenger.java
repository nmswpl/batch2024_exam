package in.co.nmsworks.exam;

public class Passenger {
    private float age;
    private String name;

    public Passenger(float age, String name) {
        this.age = age;
        this.name = name;
    }

    public float getAge() {
        return age;
    }

    public void setAge(float age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Passenger{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}
