public class Employee extends Person {

    //variables
    String office;
    int salary;
    private java.util.Date dateCreated;

    //default
    public Employee(){

    }

    //specific constructor
    public Employee(String name){
        this.name = name;
    }

    public String toString(){
        return getClass() + ": " + name;
    }
}
