package in.co.nmsworks.exam;

public class Passenger
{
   int survived;
   int pclass;
   String Name;
   String gender;
   float age;
   String siblingOrSpouse;
   String parentOrChildren;
   float fare;

    public int isSurvived()
    {
        return survived;
    }

    public void setSurvived(int survived) {
        this.survived = survived;
    }

    public int getPclass() {
        return pclass;
    }

    public void setPclass(int pclass) {
        this.pclass = pclass;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
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

    public String getSiblingOrSpouse() {
        return siblingOrSpouse;
    }

    public void setSiblingOrSpouse(String siblingOrSpouse) {
        this.siblingOrSpouse = siblingOrSpouse;
    }

    public String getParentOrChildren() {
        return parentOrChildren;
    }

    public Passenger(int survived, int pclass, String name, String gender, float age, String siblingOrSpouse, String parentOrChildren, float fare) {
        this.survived = survived;
        this.pclass = pclass;
        this.Name = name;
        this.gender = gender;
        this.age = age;
        this.siblingOrSpouse = siblingOrSpouse;
        this.parentOrChildren = parentOrChildren;
        this.fare = fare;
    }

    public void setParentOrChildren(String parentOrChildren) {
        this.parentOrChildren = parentOrChildren;
    }

    public float getFare() {
        return fare;
    }

    @Override
    public String toString() {
        return "Passenger{" +
                "survived=" + survived +
                ", pclass=" + pclass +
                ", Name='" + Name + '\'' +
                ", gender='" + gender + '\'' +
                ", age=" + age +
                ", siblingOrSpouse='" + siblingOrSpouse + '\'' +
                ", parentOrChildren='" + parentOrChildren + '\'' +
                ", fare=" + fare +
                '}';
    }

    public void setFare(float fare) {
        this.fare = fare;
    }
}
