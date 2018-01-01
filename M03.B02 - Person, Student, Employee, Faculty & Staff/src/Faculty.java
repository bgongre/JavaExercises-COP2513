public class Faculty extends Employee {

    //variables
    int officeHours;
    String rank;

    //specific constructor
    public Faculty(String name){
        this.name = name;
    }

    public String toString(){
        return getClass() + ": " + name;
    }
}
