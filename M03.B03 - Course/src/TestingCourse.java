public class TestingCourse {

    public static void main(String[] args){

    //adding new course
    Course n1 = new Course("COP");

    //adding students to array
    n1.addStudent("Airwrecks");
    n1.addStudent("Jarrod");
    n1.addStudent("Lynne");
    n1.addStudent("June");
    n1.addStudent("Daquan");
    n1.addStudent("Kimberly");

//    //get course name
//    System.out.println(n1.getCourseName());

    //display number of students in the class
    System.out.println(n1.getNumberOfStudents());

   }
}
