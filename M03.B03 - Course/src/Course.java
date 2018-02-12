import java.util.ArrayList;
import java.util.Arrays;

public class Course {

    //variables
    private String courseName;
    private String[] students = new String[5];
    private ArrayList<String> newStudents = new ArrayList<>(Arrays.asList(students));
    private int numberOfStudents;

    public Course(String courseName) {
        this.courseName = courseName;
    }

    public void addStudent(String student) {
        if (numberOfStudents <= 5) {
            students[numberOfStudents] = student;
        }else {
            newStudents.add(student);
        }
        numberOfStudents++;
    }

    public String[] getStudents() {
        return students;
    }

    public int getNumberOfStudents() {
        return numberOfStudents;
    }

    public String getCourseName() {
        return courseName;
    }

}
