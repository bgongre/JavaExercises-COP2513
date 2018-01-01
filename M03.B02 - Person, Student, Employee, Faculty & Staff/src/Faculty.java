public class Faculty extends Employee {

    //variables
    private int officeHours;
    private String rank;

    //specific constructor
    public Faculty(String name, String address, String phoneNumber, String email, String office, double salary, MyDate dateCreated, String rank) {
        super(name, address, phoneNumber, email, office, salary, dateCreated);
        this.rank = rank;
    }

    public String toString(){
        return getClass() + ": " + name;
    }
}
