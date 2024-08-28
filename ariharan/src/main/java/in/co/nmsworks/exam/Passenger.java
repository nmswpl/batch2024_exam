package in.co.nmsworks.exam;
//Survived,Pclass,Name,Sex,Age,Siblings/Spouses Aboard,Parents/Children Aboard,Fare
//0,3,Mr. Owen Harris Braund,male,22,1,0,7.25
public class Passenger {
    private int survivedStatus;
    private int pClass;
    private String name;
    private String gender;
    private float age;
    private int siblingsAndSpouses;
    private int parentsAndChildren;
    private float fare;

    public Passenger(){
    }

    public Passenger( int survivedStatus, int pClass, String name, String gender, int age, int siblingsAndSpouses, int parentsAndChildren, float fare ){
        this.survivedStatus = survivedStatus;
        this.pClass = pClass;
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.siblingsAndSpouses = siblingsAndSpouses;
        this.parentsAndChildren = parentsAndChildren;
        this.fare = fare;
    }

    public int getSurvivedStatus(){
        return survivedStatus;
    }

    public void setSurvivedStatus( int survivedStatus ){
        this.survivedStatus = survivedStatus;
    }

    public int getpClass(){
        return pClass;
    }

    public void setpClass( int pClass ){
        this.pClass = pClass;
    }

    public String getName(){
        return name;
    }

    public void setName( String name ){
        this.name = name;
    }

    public String getGender(){
        return gender;
    }

    public void setGender( String gender ){
        this.gender = gender;
    }

    public float getAge(){
        return age;
    }

    public void setAge( float age ){
        this.age = age;
    }

    public int getSiblingsAndSpouses(){
        return siblingsAndSpouses;
    }

    public void setSiblingsAndSpouses( int siblingsAndSpouses ){
        this.siblingsAndSpouses = siblingsAndSpouses;
    }

    public int getParentsAndChildren(){
        return parentsAndChildren;
    }

    public void setParentsAndChildren( int parentsAndChildren ){
        this.parentsAndChildren = parentsAndChildren;
    }

    public float getFare(){
        return fare;
    }

    public void setFare( float fare ){
        this.fare = fare;
    }

    @Override
    public String toString(){
        return "Passenger{" +
                "survivedStatus=" + survivedStatus +
                ", pClass=" + pClass +
                ", name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", age=" + age +
                ", siblingsAndSpouses=" + siblingsAndSpouses +
                ", parentsAndChildren=" + parentsAndChildren +
                ", fare=" + fare +
                '}';
    }
}
