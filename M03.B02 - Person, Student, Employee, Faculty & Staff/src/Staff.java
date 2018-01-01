public class Staff extends Employee {

    //variables
    private String title;

    //specific constructor
    public Staff(String name, String address, String phoneNumber, String email, String office, double salary, MyDate datecreated, String title) {
        super(name, address, phoneNumber, email, office, salary, datecreated);
        this.title = title;
    }

    public String toString(){
        return getClass() + ": " + name;
    }
}
