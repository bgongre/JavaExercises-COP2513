public class Person {

    //variables
    String name;
    String address;
    int phoneNumber;
    String email;

    //default
    public Person(){

    }

    //specific constructor
    public Person(String name){
        this.name = name;
    }


    public String toString(){
        return getClass() + ": " + name;
    }

}
