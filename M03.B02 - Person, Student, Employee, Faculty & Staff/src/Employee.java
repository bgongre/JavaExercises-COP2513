public class Employee extends Person {

    //variables
    private String office;
    private double salary;
    private MyDate dateCreated;

    //specific constructor
    public Employee(String name, String address, String phoneNumber, String email, String office, double salary, MyDate dateCreated) {
        super(name, address, phoneNumber, email);
        this.office = office;
        this.salary = salary;
        this.dateCreated = dateCreated;
    }

    public String toString(){
        return getClass() + ": " + name;
    }
}
