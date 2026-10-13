package courseregistrationsystemwithclassrooms;
import java.util.Scanner;
import java.util.Arrays;

public class CourseRegistrationSystemWithClassrooms {

    public static void main(String[] args) {
        
        int courseNumber=0;
        while (courseNumber < 3){
            System.out.println("How many courses to create: ");
            Scanner a = new Scanner(System.in);
            courseNumber = a.nextInt();
            if (courseNumber < 3){
                System.out.println("You have to create at least 3 courses!!");
            }
        }

        Course[] courses = new Course[courseNumber];

        for (int n = 0; n < courseNumber; n++) {
            System.out.println("Enter course name: ");
            Scanner b = new Scanner(System.in);
            String courseName = b.nextLine();

            System.out.println("Enter course capacity: ");
            Scanner c = new Scanner(System.in);
            int capacity = c.nextInt();

            Course c1 = new Course(courseName, capacity);

            courses[n] = c1;
        }

        for (int n = 0; n < courseNumber; n++) {
            courses[n].printCInfo();
        }

        boolean exit = false;
        while (!exit) {
            System.out.println("Student Name: ");
            Scanner d = new Scanner(System.in);
            String studentName = d.nextLine();

            System.out.println("Student Id: ");
            Scanner e = new Scanner(System.in);
            int studentId = e.nextInt();

            Student s1 = new Student(studentName, studentId);

            System.out.println("Course name for the student: ");
            Scanner f = new Scanner(System.in);
            String scn = f.nextLine();

            boolean exists = false;
            boolean registered=false;
            for (int n = 0; n < courseNumber; n++) {
                if ((courses[n].courseName).equals(scn)) {
                    exists=true;
                    for (int m = 0; m < courses[n].enrolledStudents.size(); m++) {
                        if(courses[n].enrolledStudents.get(m).studentId==s1.studentId&&!(courses[n].enrolledStudents.isEmpty())){
                            System.out.println("This student is already registered for this course!");
                            registered=true;
                        }
                    }
                    if (!registered){
                        if (courses[n].remCap > 0) {
                            courses[n].enrolledStudents.add(s1);
                            courses[n].remCap--;
                            System.out.println("Registration successfull");
                        }
                        else {
                            System.out.println("Course is full!");
                        }
                    }
                }
            }
            if (!exists) {
                System.out.println("No course found with that name!");
            }

            System.out.println("If you want to exit type 'true' otherwise 'false': ");
            Scanner g = new Scanner(System.in);
            exit = g.nextBoolean();
        }
        for (int n = 0; n < courseNumber; n++) {
            courses[n].printCInfo();
        }
        
    }
}