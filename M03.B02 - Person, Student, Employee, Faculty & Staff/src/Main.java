public class Main {

    public static void main(String[] args){

        //create Date for new employee constructor field
        MyDate accCreatedDate = new MyDate();

        //new Person
        Person p1 = new Person("Lynne", "1800 Milky Way", "8123615623", "L.Barnes@gmail.com");
        System.out.println(p1.toString());

        //new Student
        Person s1 = new Student("Ann");
        System.out.println(s1.toString());

        //new Employee
        Person e1 = new Employee("Keisha", "1200 Space Dr.", "6185204599", "Keisha.Thomas1@school.edu", "Veteran's Hospital", 30.000, accCreatedDate);
        System.out.println(e1.toString());

        //new Staff
        Person staff1 = new Staff("Louis", "2522 Country Loop", "6558401247", "Louis.McBride@school.edu", "King High School - Biology", 35.000,  accCreatedDate, "Biology Teacher");
        System.out.println(staff1.toString());

        //new Faculty
        Person f1 = new Faculty("Thomas", "9854 Gravel Rd.", "6568421530", "Thomas.Jakoby@school.edu", "King High School Administration", 55.000, accCreatedDate, "Management");
        System.out.println(f1.toString());

    }
}
