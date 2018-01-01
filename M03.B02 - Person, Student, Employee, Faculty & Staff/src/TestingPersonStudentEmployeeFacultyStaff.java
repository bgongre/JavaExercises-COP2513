import java.time.Year;
import java.util.Calendar;

public class TestingPersonStudentEmployeeFacultyStaff {

    public static void main(String[] args){

        //new Person
        Person p1 = new Person("Lynne");
        System.out.println(p1.toString());

        //new Student
        Person s1 = new Student("Ann");
        System.out.println(s1.toString());

        //new Employee
        Person e1 = new Employee("Keisha");
        System.out.println(e1.toString());

        //new Staff
        Person staff1 = new Staff("Louis");
        System.out.println(staff1.toString());

        //new Faculty
        Person f1 = new Faculty("Tommy");
        System.out.println(f1.toString());

    }
}
