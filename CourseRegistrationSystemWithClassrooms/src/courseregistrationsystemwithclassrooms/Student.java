package courseregistrationsystemwithclassrooms;

public class Student {
    int studentId;
    String name;

    Student(String name, int studentId) {
        this.studentId = studentId;
        this.name = name;
    }

    public void printSInfo() {
        System.out.println("Name: " + name + " Id: " + studentId);
    }
}