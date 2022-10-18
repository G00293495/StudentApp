package ie.atu.week5;

import java.util.Scanner;

public class StudentApp {

    public static void main(String[] args) {
        System.out.println("Please enter students name");
        Scanner input = new Scanner(System.in);
        String name = input.nextLine();
        System.out.println("You entered " + name);

        System.out.println("Please enter students email");
        String email = input.nextLine();
        System.out.println("You entered " + email);

    }
}
