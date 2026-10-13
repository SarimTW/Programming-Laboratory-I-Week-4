package courseregistrationsystemwithclassrooms;
import java.util.ArrayList;

public class Course {
    String courseName;
    int capacity;
    int remCap;
    public ArrayList<Student> enrolledStudents = new ArrayList<Student>();

    public Course(String courseName, int capacity) {
        this.courseName = courseName;
        this.capacity = capacity;
        remCap = capacity;
    }

    public void printCInfo() {
        System.out.println("Course: " + courseName + " Capacity: " + capacity + " Number of enrolled students: " + (capacity-remCap));
        System.out.println("Enrolled Students for "+courseName+": ");
        for (int n = 0; n < enrolledStudents.size(); n++) {
            enrolledStudents.get(n).printSInfo();
        }
        System.out.println("");
    }
}