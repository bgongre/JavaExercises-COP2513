public class Student extends Person {

    //variables
    public static final String firstYear = "Freshman";
    public static final String secondYear = "Sophomore";
    public static final String thirdYear = "Junior";
    public static final String fourthYear = "Senior";

    //specific constructor
    public Student(String name){
        this.name = name;
    }

    public String toString(){
        return getClass() + ": " + name;
    }
}
