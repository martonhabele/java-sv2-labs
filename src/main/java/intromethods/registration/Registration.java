package intromethods.registration;

import java.time.LocalDate;
import java.util.Scanner;

public class Registration {
    public static void main(String[] args) {
        Registration registration = new Registration();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Last name: ");
        String lastName = scanner.nextLine();
        System.out.print("First name: ");
        String firstName = scanner.nextLine();
        System.out.print("DoB year: ");
        int year = scanner.nextInt();
        System.out.print("DoB month: ");
        int month = scanner.nextInt();
        System.out.print("DoB day: ");
        int day = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Email: ");
        String email = scanner.nextLine();
        scanner.close();

        Person person = new Person(registration.fullName(lastName, firstName), registration.dateCreator(year, month, day), email);

        System.out.println(person.toString());
    }

    public String fullName(String lastName, String firstName) {
        return lastName + " " + firstName;
    }

    public LocalDate dateCreator(int year, int month, int day) {
        return LocalDate.of(year, month, day);
    }
}