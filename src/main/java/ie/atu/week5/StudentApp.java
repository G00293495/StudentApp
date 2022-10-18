package ie.atu.week5;

import java.sql.SQLOutput;
import java.util.Scanner;

public class StudentApp {

    public static void main(String[] args) {
        System.out.println("Please enter students name");
        Scanner input = new Scanner(System.in);
        String name = input.nextLine();
        Student Student1 = new Student();
        Student1.setName(name);


        System.out.println("Please enter students email");
        String email = input.nextLine();
        Student1.setEmail(email);

        System.out.println("Please enter students course");
        String course = input.nextLine();
        Student1.setCourse(course);

        System.out.println("Please enter the name of another student: ");
        String name1 = input.nextLine();
        Student student2 = new Student("" + name1);

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

        Student student3 = new Student("" + name2, ""+ email2, ""+course2);


        System.out.println("\t Student 1 Details\nStudentName: " +Student1.getName());






    }
}
