public class Staff extends Employee {

    //variables
    String title;

    //specific constructor
    public Staff(String name){
        this.name = name;
    }

    public String toString(){
        return getClass() + ": " + name;
    }
}
