package ie.atu.week5;

import java.sql.SQLOutput;
import java.util.Scanner;

public class StudentApp {

    public static void main(String[] args) {
        System.out.println("Please enter students name"); //THIS IS TO GET THE STUDENTS FIRST NAME AND OTHER DETAILS (getter and setter)
        Scanner input = new Scanner(System.in); //SCANNER
        String name = input.nextLine();
        Student Student1 = new Student();
        Student1.setName(name);


        System.out.println("Please enter students email");
        String email = input.nextLine();
        Student1.setEmail(email);

        System.out.println("Please enter students course");
        String course = input.nextLine();
        Student1.setCourse(course);

        System.out.println("Please enter the name of another student: ");  //USING CONSTRUCTUR GETTERS AND SETTERS TO GET OTHER STUDENTS INFO AND STORE IT
        String name1 = input.nextLine();
        Student student2 = new Student("" + name1); //first overload construcot

        System.out.println("Please enter the email of another student: ");
        String email1 = input.nextLine();
        student2.setEmail(email1);

        System.out.println("Please enter students course");
        String course1 = input.nextLine();
        student2.setCourse(course1);

        System.out.println("Please enter the name of another student: ");
        String name2= input.nextLine();

        System.out.println("Please enter the email of another student: ");
        String email2 = input.nextLine();

        System.out.println("Please enter the course of another student: ");
        String course2= input.nextLine();

        Student student3 = new Student("" + name2, ""+ email2, ""+course2); //using constructor for student 3 info

//LAST LONG PRINT FOR  ALL STUDENTS INFO ALL TOGETHER
        System.out.println("\t Student 1 Details\nStudentName: " +Student1.getName());
        System.out.println("\t                  \nStudentEmail: "+Student1.getEmail());
        System.out.println("\t                  \nStudentCourse: "+Student1.getCourse());
        System.out.println("\t Student 2 Details\nStudentName: " +student2.getName());
        System.out.println("\t                  \nStudentEmail: "+student2.getEmail());
        System.out.println("\t                  \nStudentCourse: "+student2.getCourse());
        System.out.println("\t Student 3 Details\nStudentName: " +student3.getName());
        System.out.println("\t                  \nStudentEmail: "+student3.getEmail());
        System.out.println("\t                  \nStudentCourse: "+student3.getCourse());


    }
}
