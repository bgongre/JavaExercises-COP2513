public class Person {

    //variables
    public String name;
    private String address;
    private String phoneNumber;
    private String email;

    //default
    public Person(){

    }

    //specific constructor
    public Person(String name, String address, String phoneNumber, String email) {
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    public String toString(){
        return getClass() + ": " + name;
    }

}
